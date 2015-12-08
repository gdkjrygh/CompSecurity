// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.DNSIncoming;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSQuestion;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.constants.DNSConstants;

// Referenced classes of package javax.jmdns.impl.tasks:
//            DNSTask

public class Responder extends DNSTask
{

    static Logger logger = Logger.getLogger(javax/jmdns/impl/tasks/Responder.getName());
    private final DNSIncoming _in;
    private final boolean _unicast;

    public Responder(JmDNSImpl jmdnsimpl, DNSIncoming dnsincoming, int i)
    {
        super(jmdnsimpl);
        _in = dnsincoming;
        boolean flag;
        if (i != DNSConstants.MDNS_PORT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _unicast = flag;
    }

    public String getName()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Responder(");
        String s;
        if (getDns() != null)
        {
            s = getDns().getName();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(")").toString();
    }

    public void run()
    {
        Object obj;
        Object obj1;
        getDns().respondToQuery(_in);
        obj1 = new HashSet();
        obj = new HashSet();
        if (!getDns().isAnnounced()) goto _L2; else goto _L1
_L1:
        DNSQuestion dnsquestion;
        for (Iterator iterator = _in.getQuestions().iterator(); iterator.hasNext(); dnsquestion.addAnswers(getDns(), ((Set) (obj))))
        {
            dnsquestion = (DNSQuestion)iterator.next();
            if (logger.isLoggable(Level.FINER))
            {
                logger.finer((new StringBuilder()).append(getName()).append("run() JmDNS responding to: ").append(dnsquestion).toString());
            }
            if (_unicast)
            {
                ((Set) (obj1)).add(dnsquestion);
            }
        }

          goto _L3
        Throwable throwable;
        throwable;
        logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append("run() exception ").toString(), throwable);
        getDns().close();
_L2:
        return;
_L3:
        long l = System.currentTimeMillis();
        Iterator iterator1 = _in.getAnswers().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            DNSRecord dnsrecord = (DNSRecord)iterator1.next();
            if (dnsrecord.isStale(l))
            {
                ((Set) (obj)).remove(dnsrecord);
                if (logger.isLoggable(Level.FINER))
                {
                    logger.finer((new StringBuilder()).append(getName()).append("JmDNS Responder Known Answer Removed").toString());
                }
            }
        } while (true);
        if (((Set) (obj)).isEmpty()) goto _L2; else goto _L4
_L4:
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append(getName()).append("run() JmDNS responding").toString());
        }
        DNSOutgoing dnsoutgoing;
        DNSQuestion dnsquestion1;
        boolean flag;
        if (!_unicast)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dnsoutgoing = new DNSOutgoing(33792, flag, _in.getSenderUDPPayload());
        dnsoutgoing.setId(_in.getId());
        obj1 = ((Set) (obj1)).iterator();
_L5:
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_417;
            }
            dnsquestion1 = (DNSQuestion)((Iterator) (obj1)).next();
        } while (dnsquestion1 == null);
        dnsoutgoing = addQuestion(dnsoutgoing, dnsquestion1);
          goto _L5
        obj = ((Set) (obj)).iterator();
_L6:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (DNSRecord)((Iterator) (obj)).next();
        } while (obj1 == null);
        dnsoutgoing = addAnswer(dnsoutgoing, _in, ((DNSRecord) (obj1)));
          goto _L6
        if (dnsoutgoing.isEmpty()) goto _L2; else goto _L7
_L7:
        getDns().send(dnsoutgoing);
        return;
    }

    public void start(Timer timer)
    {
        boolean flag = true;
        Iterator iterator = _in.getQuestions().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DNSQuestion dnsquestion = (DNSQuestion)iterator.next();
            if (logger.isLoggable(Level.FINEST))
            {
                logger.finest((new StringBuilder()).append(getName()).append("start() question=").append(dnsquestion).toString());
            }
            boolean flag1 = dnsquestion.iAmTheOnlyOne(getDns());
            flag = flag1;
            if (flag1)
            {
                continue;
            }
            flag = flag1;
            break;
        } while (true);
        int i;
        int j;
        if (flag && !_in.isTruncated())
        {
            i = 0;
        } else
        {
            i = (JmDNSImpl.getRandom().nextInt(96) + 20) - _in.elapseSinceArrival();
        }
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (logger.isLoggable(Level.FINEST))
        {
            logger.finest((new StringBuilder()).append(getName()).append("start() Responder chosen delay=").append(j).toString());
        }
        if (!getDns().isCanceling() && !getDns().isCanceled())
        {
            timer.schedule(this, j);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" incomming: ").append(_in).toString();
    }

}

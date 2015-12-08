// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public final class asr
{

    PriorityBlockingQueue a;
    asn b;
    Boolean c;
    private Thread d;

    public asr(String s, Comparator comparator, asn asn1)
    {
        a = null;
        d = null;
        b = null;
        c = Boolean.valueOf(false);
        a = new PriorityBlockingQueue(10, comparator);
        b = asn1;
        d = new Thread(new Runnable() {

            private asr a;

            public final void run()
            {
                Object obj = a;
                try
                {
                    while (!((asr) (obj)).c.booleanValue()) 
                    {
                        Object obj1 = ((asr) (obj)).a.take();
                        ((asr) (obj)).b.a(obj1);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
                catch (Exception exception)
                {
                    axt.a("Error occurred dispating message.", exception);
                    ((asr) (obj)).b.a("Error occurred dispating message.", exception);
                    return;
                }
            }

            
            {
                a = asr.this;
                super();
            }
        });
        d.setName(s);
        d.setDaemon(true);
        d.start();
    }

    public final void a()
    {
        c = Boolean.valueOf(true);
        if (d != null)
        {
            d.interrupt();
            d = null;
        }
    }

    public final void a(Object obj)
    {
        try
        {
            a.put(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("ClassCastException encountered when queueing message.", ((Exception) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("Exception encountered when queueing message.", ((Exception) (obj)));
        }
    }
}

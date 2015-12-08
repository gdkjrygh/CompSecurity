// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.CoreConstants;
import fs.ch.qos.logback.core.boolex.EvaluationException;
import fs.ch.qos.logback.core.boolex.EventEvaluator;
import fs.ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ThrowableHandlingConverter

public class ThrowableProxyConverter extends ThrowableHandlingConverter
{

    int errorCount;
    List evaluatorList;
    int lengthOption;

    public ThrowableProxyConverter()
    {
        evaluatorList = null;
        errorCount = 0;
    }

    private void addEvaluator(EventEvaluator eventevaluator)
    {
        if (evaluatorList == null)
        {
            evaluatorList = new ArrayList();
        }
        evaluatorList.add(eventevaluator);
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        IThrowableProxy ithrowableproxy;
        boolean flag;
        flag = false;
        ithrowableproxy = iloggingevent.getThrowableProxy();
        if (ithrowableproxy == null)
        {
            return "";
        }
        if (evaluatorList == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        Object obj;
        if (i >= evaluatorList.size())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        obj = (EventEvaluator)evaluatorList.get(i);
        boolean flag1 = ((EventEvaluator) (obj)).evaluate(iloggingevent);
        if (!flag1) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L6:
        if (i == 0)
        {
            return "";
        }
          goto _L2
        EvaluationException evaluationexception;
        evaluationexception;
        errorCount = errorCount + 1;
        if (errorCount < 4)
        {
            addError((new StringBuilder()).append("Exception thrown for evaluator named [").append(((EventEvaluator) (obj)).getName()).append("]").toString(), evaluationexception);
        } else
        if (errorCount == 4)
        {
            obj = new ErrorStatus((new StringBuilder()).append("Exception thrown for evaluator named [").append(((EventEvaluator) (obj)).getName()).append("].").toString(), this, evaluationexception);
            ((ErrorStatus) (obj)).add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
            addStatus(((fs.ch.qos.logback.core.status.Status) (obj)));
        }
_L4:
        i++;
          goto _L5
_L2:
        return throwableProxyToString(ithrowableproxy);
        i = 1;
          goto _L6
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }

    protected void extraData(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
    {
    }

    public void start()
    {
        Object obj = getFirstOption();
        if (obj == null)
        {
            lengthOption = 0x7fffffff;
        } else
        {
            obj = ((String) (obj)).toLowerCase();
            if ("full".equals(obj))
            {
                lengthOption = 0x7fffffff;
            } else
            if ("short".equals(obj))
            {
                lengthOption = 2;
            } else
            {
                try
                {
                    lengthOption = Integer.parseInt(((String) (obj))) + 1;
                }
                catch (NumberFormatException numberformatexception)
                {
                    addError((new StringBuilder()).append("Could not parse [").append(((String) (obj))).append("] as an integer").toString());
                    lengthOption = 0x7fffffff;
                }
            }
        }
        obj = getOptionList();
        if (obj != null && ((List) (obj)).size() > 1)
        {
            int j = ((List) (obj)).size();
            for (int i = 1; i < j; i++)
            {
                String s = (String)((List) (obj)).get(i);
                addEvaluator((EventEvaluator)((Map)getContext().getObject("EVALUATOR_MAP")).get(s));
            }

        }
        super.start();
    }

    public void stop()
    {
        evaluatorList = null;
        super.stop();
    }

    void subjoinThrowableProxy(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
    {
        boolean flag1 = false;
        ThrowableProxyUtil.subjoinFirstLine(stringbuilder, ithrowableproxy);
        stringbuilder.append(CoreConstants.LINE_SEPARATOR);
        StackTraceElementProxy astacktraceelementproxy[] = ithrowableproxy.getStackTraceElementProxyArray();
        int l = ithrowableproxy.getCommonFrames();
        int i;
        boolean flag;
        int j;
        int k;
        if (lengthOption > astacktraceelementproxy.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = astacktraceelementproxy.length;
        } else
        {
            i = lengthOption;
        }
        j = i;
        k = ((flag1) ? 1 : 0);
        if (l > 0)
        {
            j = i;
            k = ((flag1) ? 1 : 0);
            if (flag)
            {
                j = i - l;
                k = ((flag1) ? 1 : 0);
            }
        }
        for (; k < j; k++)
        {
            String s = astacktraceelementproxy[k].toString();
            stringbuilder.append('\t');
            stringbuilder.append(s);
            extraData(stringbuilder, astacktraceelementproxy[k]);
            stringbuilder.append(CoreConstants.LINE_SEPARATOR);
        }

        if (l > 0 && flag)
        {
            stringbuilder.append("\t... ").append(ithrowableproxy.getCommonFrames()).append(" common frames omitted").append(CoreConstants.LINE_SEPARATOR);
        }
    }

    protected String throwableProxyToString(IThrowableProxy ithrowableproxy)
    {
        StringBuilder stringbuilder = new StringBuilder(32);
        for (; ithrowableproxy != null; ithrowableproxy = ithrowableproxy.getCause())
        {
            subjoinThrowableProxy(stringbuilder, ithrowableproxy);
        }

        return stringbuilder.toString();
    }
}

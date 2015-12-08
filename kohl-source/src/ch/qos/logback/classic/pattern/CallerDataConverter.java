// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.CoreConstants;
import fs.ch.qos.logback.core.boolex.EvaluationException;
import fs.ch.qos.logback.core.boolex.EventEvaluator;
import fs.ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter

public class CallerDataConverter extends ClassicConverter
{

    final int MAX_ERROR_COUNT = 4;
    int depth;
    int errorCount;
    List evaluatorList;

    public CallerDataConverter()
    {
        depth = 5;
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
        StringBuilder stringbuilder;
        int j;
        j = 0;
        stringbuilder = new StringBuilder();
        if (evaluatorList == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        Object obj;
        if (i >= evaluatorList.size())
        {
            break MISSING_BLOCK_LABEL_312;
        }
        obj = (EventEvaluator)evaluatorList.get(i);
        boolean flag = ((EventEvaluator) (obj)).evaluate(iloggingevent);
        if (!flag) goto _L4; else goto _L3
_L3:
        i = 1;
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
        iloggingevent = iloggingevent.getCallerData();
        if (iloggingevent != null && iloggingevent.length > 0)
        {
            if (depth < iloggingevent.length)
            {
                i = depth;
            } else
            {
                i = iloggingevent.length;
            }
            for (; j < i; j++)
            {
                stringbuilder.append(getCallerLinePrefix());
                stringbuilder.append(j);
                stringbuilder.append("\t at ");
                stringbuilder.append(iloggingevent[j]);
                stringbuilder.append(CoreConstants.LINE_SEPARATOR);
            }

            return stringbuilder.toString();
        } else
        {
            return CallerData.CALLER_DATA_NA;
        }
        i = 0;
          goto _L6
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }

    protected String getCallerLinePrefix()
    {
        return "Caller+";
    }

    public void start()
    {
        Object obj = getFirstOption();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            depth = Integer.parseInt(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            addError((new StringBuilder()).append("Failed to parse depth option [").append(((String) (obj))).append("]").toString(), numberformatexception);
        }
        obj = getOptionList();
        if (obj != null && ((List) (obj)).size() > 1)
        {
            int j = ((List) (obj)).size();
            int i = 1;
            while (i < j) 
            {
                Object obj1 = (String)((List) (obj)).get(i);
                Context context = getContext();
                if (context != null)
                {
                    obj1 = (EventEvaluator)((Map)context.getObject("EVALUATOR_MAP")).get(obj1);
                    if (obj1 != null)
                    {
                        addEvaluator(((EventEvaluator) (obj1)));
                    }
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}

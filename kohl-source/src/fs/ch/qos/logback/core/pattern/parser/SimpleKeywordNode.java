// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;

import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            FormattingNode

public class SimpleKeywordNode extends FormattingNode
{

    List optionList;

    protected SimpleKeywordNode(int i, Object obj)
    {
        super(i, obj);
    }

    SimpleKeywordNode(Object obj)
    {
        super(1, obj);
    }

    public boolean equals(Object obj)
    {
        if (super.equals(obj) && (obj instanceof SimpleKeywordNode))
        {
            obj = (SimpleKeywordNode)obj;
            if (optionList != null)
            {
                return optionList.equals(((SimpleKeywordNode) (obj)).optionList);
            }
            if (((SimpleKeywordNode) (obj)).optionList == null)
            {
                return true;
            }
        }
        return false;
    }

    public List getOptions()
    {
        return optionList;
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public void setOptions(List list)
    {
        optionList = list;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (optionList == null)
        {
            stringbuffer.append((new StringBuilder()).append("KeyWord(").append(value).append(",").append(formatInfo).append(")").toString());
        } else
        {
            stringbuffer.append((new StringBuilder()).append("KeyWord(").append(value).append(", ").append(formatInfo).append(",").append(optionList).append(")").toString());
        }
        stringbuffer.append(printNext());
        return stringbuffer.toString();
    }
}

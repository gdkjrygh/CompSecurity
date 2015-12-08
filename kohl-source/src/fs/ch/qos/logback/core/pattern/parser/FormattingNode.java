// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;

import fs.ch.qos.logback.core.pattern.FormatInfo;

// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            Node

public class FormattingNode extends Node
{

    FormatInfo formatInfo;

    FormattingNode(int i, Object obj)
    {
        super(i, obj);
    }

    public boolean equals(Object obj)
    {
        if (super.equals(obj) && (obj instanceof FormattingNode))
        {
            obj = (FormattingNode)obj;
            if (formatInfo != null)
            {
                return formatInfo.equals(((FormattingNode) (obj)).formatInfo);
            }
            if (((FormattingNode) (obj)).formatInfo == null)
            {
                return true;
            }
        }
        return false;
    }

    public FormatInfo getFormatInfo()
    {
        return formatInfo;
    }

    public int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (formatInfo != null)
        {
            i = formatInfo.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }

    public void setFormatInfo(FormatInfo formatinfo)
    {
        formatInfo = formatinfo;
    }
}

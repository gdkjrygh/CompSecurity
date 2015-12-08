// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;


// Referenced classes of package fs.ch.qos.logback.core.pattern:
//            Converter, FormatInfo, SpacePadder

public abstract class FormattingConverter extends Converter
{

    FormatInfo formattingInfo;

    public FormattingConverter()
    {
    }

    public final void setFormattingInfo(FormatInfo formatinfo)
    {
        if (formattingInfo != null)
        {
            throw new IllegalStateException("FormattingInfo has been already set");
        } else
        {
            formattingInfo = formatinfo;
            return;
        }
    }

    public final void write(StringBuilder stringbuilder, Object obj)
    {
        obj = convert(obj);
        if (formattingInfo == null)
        {
            stringbuilder.append(((String) (obj)));
        } else
        {
            int i = formattingInfo.getMin();
            int j = formattingInfo.getMax();
            if (obj == null)
            {
                if (i > 0)
                {
                    SpacePadder.spacePad(stringbuilder, i);
                    return;
                }
            } else
            {
                int k = ((String) (obj)).length();
                if (k > j)
                {
                    if (formattingInfo.isLeftTruncate())
                    {
                        stringbuilder.append(((String) (obj)).substring(k - j));
                        return;
                    } else
                    {
                        stringbuilder.append(((String) (obj)).substring(0, j));
                        return;
                    }
                }
                if (k < i)
                {
                    if (formattingInfo.isLeftPad())
                    {
                        SpacePadder.leftPad(stringbuilder, ((String) (obj)), i);
                        return;
                    } else
                    {
                        SpacePadder.rightPad(stringbuilder, ((String) (obj)), i);
                        return;
                    }
                } else
                {
                    stringbuilder.append(((String) (obj)));
                    return;
                }
            }
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;


public class FormatInfo
{

    private boolean leftPad;
    private boolean leftTruncate;
    private int max;
    private int min;

    public FormatInfo()
    {
        min = 0x80000000;
        max = 0x7fffffff;
        leftPad = true;
        leftTruncate = true;
    }

    public static FormatInfo valueOf(String s)
        throws IllegalArgumentException
    {
        FormatInfo formatinfo;
        int i;
label0:
        {
            if (s == null)
            {
                throw new NullPointerException("Argument cannot be null");
            }
            formatinfo = new FormatInfo();
            i = s.indexOf('.');
            String s2 = null;
            String s1 = s;
            if (i != -1)
            {
                s1 = s.substring(0, i);
                if (i + 1 == s.length())
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Formatting string [").append(s).append("] should not end with '.'").toString());
                }
                s2 = s.substring(i + 1);
            }
            if (s1 != null && s1.length() > 0)
            {
                i = Integer.parseInt(s1);
                if (i >= 0)
                {
                    formatinfo.min = i;
                } else
                {
                    formatinfo.min = -i;
                    formatinfo.leftPad = false;
                }
            }
            if (s2 != null && s2.length() > 0)
            {
                i = Integer.parseInt(s2);
                if (i < 0)
                {
                    break label0;
                }
                formatinfo.max = i;
            }
            return formatinfo;
        }
        formatinfo.max = -i;
        formatinfo.leftTruncate = false;
        return formatinfo;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof FormatInfo))
            {
                return false;
            }
            obj = (FormatInfo)obj;
            if (min != ((FormatInfo) (obj)).min || max != ((FormatInfo) (obj)).max || leftPad != ((FormatInfo) (obj)).leftPad || leftTruncate != ((FormatInfo) (obj)).leftTruncate)
            {
                return false;
            }
        }
        return true;
    }

    public int getMax()
    {
        return max;
    }

    public int getMin()
    {
        return min;
    }

    public int hashCode()
    {
        int j = 1;
        int k = min;
        int l = max;
        int i;
        if (leftPad)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!leftTruncate)
        {
            j = 0;
        }
        return (i + (k * 31 + l) * 31) * 31 + j;
    }

    public boolean isLeftPad()
    {
        return leftPad;
    }

    public boolean isLeftTruncate()
    {
        return leftTruncate;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FormatInfo(").append(min).append(", ").append(max).append(", ").append(leftPad).append(", ").append(leftTruncate).append(")").toString();
    }
}

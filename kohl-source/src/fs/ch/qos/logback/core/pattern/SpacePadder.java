// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;


public class SpacePadder
{

    static final String SPACES[] = {
        " ", "  ", "    ", "        ", "                ", "                                "
    };

    public static final void leftPad(StringBuilder stringbuilder, String s, int i)
    {
        int j = 0;
        if (s != null)
        {
            j = s.length();
        }
        if (j < i)
        {
            spacePad(stringbuilder, i - j);
        }
        if (s != null)
        {
            stringbuilder.append(s);
        }
    }

    public static final void rightPad(StringBuilder stringbuilder, String s, int i)
    {
        int j = 0;
        if (s != null)
        {
            j = s.length();
        }
        if (s != null)
        {
            stringbuilder.append(s);
        }
        if (j < i)
        {
            spacePad(stringbuilder, i - j);
        }
    }

    public static final void spacePad(StringBuilder stringbuilder, int i)
    {
        for (; i >= 32; i -= 32)
        {
            stringbuilder.append(SPACES[5]);
        }

        for (int j = 4; j >= 0; j--)
        {
            if ((1 << j & i) != 0)
            {
                stringbuilder.append(SPACES[j]);
            }
        }

    }

}

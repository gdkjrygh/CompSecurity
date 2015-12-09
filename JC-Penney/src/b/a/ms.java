// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pf

public final class ms
{

    public static String a(int i, int j, int k)
    {
        StringBuffer stringbuffer = new StringBuffer(80);
        int l = ~j & i;
        i &= j;
        if ((i & 1) != 0)
        {
            stringbuffer.append("|public");
        }
        if ((i & 2) != 0)
        {
            stringbuffer.append("|private");
        }
        if ((i & 4) != 0)
        {
            stringbuffer.append("|protected");
        }
        if ((i & 8) != 0)
        {
            stringbuffer.append("|static");
        }
        if ((i & 0x10) != 0)
        {
            stringbuffer.append("|final");
        }
        if ((i & 0x20) != 0)
        {
            if (k == 1)
            {
                stringbuffer.append("|super");
            } else
            {
                stringbuffer.append("|synchronized");
            }
        }
        if ((i & 0x40) != 0)
        {
            if (k == 3)
            {
                stringbuffer.append("|bridge");
            } else
            {
                stringbuffer.append("|volatile");
            }
        }
        if ((i & 0x80) != 0)
        {
            if (k == 3)
            {
                stringbuffer.append("|varargs");
            } else
            {
                stringbuffer.append("|transient");
            }
        }
        if ((i & 0x100) != 0)
        {
            stringbuffer.append("|native");
        }
        if ((i & 0x200) != 0)
        {
            stringbuffer.append("|interface");
        }
        if ((i & 0x400) != 0)
        {
            stringbuffer.append("|abstract");
        }
        if ((i & 0x800) != 0)
        {
            stringbuffer.append("|strictfp");
        }
        if ((i & 0x1000) != 0)
        {
            stringbuffer.append("|synthetic");
        }
        if ((i & 0x2000) != 0)
        {
            stringbuffer.append("|annotation");
        }
        if ((i & 0x4000) != 0)
        {
            stringbuffer.append("|enum");
        }
        if ((0x10000 & i) != 0)
        {
            stringbuffer.append("|constructor");
        }
        if ((i & 0x20000) != 0)
        {
            stringbuffer.append("|declared_synchronized");
        }
        if (l != 0 || stringbuffer.length() == 0)
        {
            stringbuffer.append('|');
            stringbuffer.append(pf.b(l));
        }
        return stringbuffer.substring(1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.List;

public final class n
{

    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final byte e[];
    public final String f;
    public final e g;
    public final e h;
    public final List i;

    public n(String s, String s1, int j, List list, String s2, byte abyte0[], String s3, 
            e e1, e e2)
    {
        com.nuance.dragon.toolkit.d.b.c.a("appId", s2);
        com.nuance.dragon.toolkit.d.b.c.a("host", s1);
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("port", "greater than 0", flag);
        com.nuance.dragon.toolkit.d.b.c.a("appKey", abyte0);
        com.nuance.dragon.toolkit.d.b.c.a("recorderCodec", e1);
        com.nuance.dragon.toolkit.d.b.c.a("playerCodec", e2);
        a = s;
        b = s1;
        c = j;
        i = list;
        d = s2;
        f = s3;
        g = e1;
        h = e2;
        e = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, e, 0, abyte0.length);
    }
}

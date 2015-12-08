// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            e

public abstract class al
{

    final String b;
    final int c;
    boolean d;

    al(int i, String s)
    {
        boolean flag;
        if (i > 0 && i <= 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("type", "should be one of Param.TYPE_AUDIO, Param.TYPE_TTS, Param.TYPE_STRING, Param.TYPE_INTEGER, Param.TYPE_BYTES, Param.TYPE_DICTIONARY, Param.TYPE_SEQUENCE, Param.TYPE_SEQUENCE_START, Param.TYPE_SEQUENCE_CHUNK, Param.TYPE_SEQUENCE_END", flag);
        com.nuance.dragon.toolkit.d.b.c.a("key", s);
        c = i;
        b = s;
        d = false;
    }

    abstract void a(e e);
}

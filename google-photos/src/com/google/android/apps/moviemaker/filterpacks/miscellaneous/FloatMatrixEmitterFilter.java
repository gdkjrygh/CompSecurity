// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahs;
import ahu;
import aif;
import ajo;
import ajr;
import ajw;
import cob;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.miscellaneous:
//            BaseEmitterFilter

public class FloatMatrixEmitterFilter extends BaseEmitterFilter
{

    public FloatMatrixEmitterFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.b(200);
        return (new ajw()).a("input", 2, aif1).a();
    }

    protected final void e()
    {
        ahu ahu1 = a("input").a().g();
        if (a())
        {
            int i = ahu1.m();
            cob cob1 = new cob(ahu1.n(), i);
            Object obj = ahu1.a(1);
            ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
            obj = ((ByteBuffer) (obj)).asFloatBuffer();
            ((FloatBuffer) (obj)).rewind();
            ((FloatBuffer) (obj)).get(cob1.c);
            ahu1.k();
            a(ahu1.c() / 1000L, cob1);
        }
    }
}

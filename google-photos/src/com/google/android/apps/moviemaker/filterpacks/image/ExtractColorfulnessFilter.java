// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class ExtractColorfulnessFilter extends ahn
{

    public ExtractColorfulnessFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private native float extractColorfulness(ByteBuffer bytebuffer);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        return (new ajw()).a("image", 2, aif1).b("score", 2, aif.a(Float.TYPE)).a();
    }

    protected final void e()
    {
        ahv ahv1 = a("image").a().h();
        aju aju1 = b("score");
        aig aig1 = aju1.a(null).d();
        aig1.a(Float.valueOf(extractColorfulness(ahv1.a(1))));
        ahv1.k();
        aju1.a(aig1);
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}

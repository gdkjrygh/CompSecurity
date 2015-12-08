// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.image;

import ahn;
import ahs;
import ahu;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class ExtractHueFilter extends ahn
{

    public ExtractHueFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private native float extractHue(ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        aif aif2 = aif.b(100);
        return (new ajw()).a("image", 2, aif1).b("hues", 2, aif2).a();
    }

    protected final void e()
    {
        ahv ahv1 = a("image").a().h();
        ahu ahu1 = b("hues").a(new int[] {
            ahv1.m(), ahv1.n()
        }).g();
        extractHue(ahv1.a(1), ahu1.a(2));
        ahv1.k();
        ahu1.k();
        b("hues").a(ahu1);
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}

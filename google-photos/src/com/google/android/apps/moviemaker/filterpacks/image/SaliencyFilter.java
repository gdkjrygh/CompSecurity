// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.image;

import ahn;
import ahs;
import ahu;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class SaliencyFilter extends ahn
{

    private static final String INPUT_PORT = "input";
    private static final String MAP_OUTPUT_PORT = "saliencyMap";
    private static final String OUTPUT_PORT = "saliency";

    public SaliencyFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native float getSaliencyScore(ByteBuffer bytebuffer, int i, int j, ByteBuffer bytebuffer1);

    public final ajw b()
    {
        aif aif1 = aif.a(100, 1);
        aif aif2 = aif.b(100);
        return (new ajw()).a("input", 2, aif1).b("saliency", 2, aif.a(Float.TYPE)).b("saliencyMap", 1, aif2).a();
    }

    protected final void e()
    {
        Object obj1 = a("input").a();
        ByteBuffer bytebuffer = ((ahs) (obj1)).g().a(1);
        int ai[] = ((ahs) (obj1)).l();
        aju aju1 = b("saliencyMap");
        float f;
        ahu ahu1;
        Object obj;
        if (aju1 != null)
        {
            ahu1 = aju1.a(new int[] {
                64, 64
            }).g();
            obj = ahu1.a(2);
        } else
        {
            ahu1 = null;
            obj = null;
        }
        f = getSaliencyScore(bytebuffer, ai[0], ai[1], ((ByteBuffer) (obj)));
        ((ahs) (obj1)).k();
        if (ahu1 != null)
        {
            ahu1.k();
        }
        obj = b("saliency");
        obj1 = ((aju) (obj)).a(null).d();
        ((aig) (obj1)).a(Float.valueOf(f));
        ((aju) (obj)).a(((ahs) (obj1)));
        if (aju1 != null)
        {
            aju1.a(ahu1);
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}

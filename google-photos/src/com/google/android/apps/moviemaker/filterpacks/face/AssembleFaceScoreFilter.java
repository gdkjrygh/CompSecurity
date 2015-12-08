// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.face;

import ahn;
import ahs;
import aif;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import android.graphics.Rect;
import cdx;

public class AssembleFaceScoreFilter extends ahn
{

    public AssembleFaceScoreFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.b(Float.TYPE);
        return (new ajw()).a("faces", 2, aif.b(android/hardware/Camera$Face)).a("histogramDistances", 1, aif1).a("smileScores", 1, aif1).a("eyesOpenScores", 1, aif1).a("sharpnessScores", 1, aif1).b("faceScores", 2, aif.b(cdx)).a();
    }

    protected final void e()
    {
        android.hardware.Camera.Face aface[] = (android.hardware.Camera.Face[])a("faces").a().e().n();
        Object obj = a("histogramDistances");
        Object obj1;
        ajo ajo1;
        float af[];
        ajo ajo2;
        float af1[];
        cdx acdx[];
        if (obj != null)
        {
            obj = (float[])((ajo) (obj)).a().e().n();
        } else
        {
            obj = null;
        }
        obj1 = a("smileScores");
        if (obj1 != null)
        {
            obj1 = (float[])((ajo) (obj1)).a().e().n();
        } else
        {
            obj1 = null;
        }
        ajo1 = a("eyesOpenScores");
        if (ajo1 != null)
        {
            af = (float[])ajo1.a().e().n();
        } else
        {
            af = null;
        }
        ajo2 = a("sharpnessScores");
        if (ajo2 != null)
        {
            af1 = (float[])ajo2.a().e().n();
        } else
        {
            af1 = null;
        }
        acdx = new cdx[aface.length];
        for (int i = 0; i < aface.length; i++)
        {
            acdx[i] = new cdx();
            cdx cdx1 = acdx[i];
            cdx1.b = aface[i];
            if (cdx1.b != null)
            {
                cdx1.h = -(cdx.a(((-(1000F - (float)(cdx1.b.rect.bottom - cdx1.b.rect.top) * 0.4F) - (float)cdx1.b.rect.top) / (float)cdx1.b.rect.height()) * 100F) + cdx.a(((float)(cdx1.b.rect.bottom - 900) / (float)cdx1.b.rect.height()) * 100F) + cdx.a(((float)(-1000 - cdx1.b.rect.left) / (float)cdx1.b.rect.width()) * 100F) + cdx.a(((float)(cdx1.b.rect.right - 1000) / (float)cdx1.b.rect.width()) * 100F));
            }
            acdx[i].g = aface[i].score;
            if (obj != null)
            {
                float f = obj[i];
                acdx[i].e = 1.0F - f;
            }
            if (obj1 != null)
            {
                acdx[i].c = obj1[i];
            }
            if (af != null)
            {
                acdx[i].d = af[i];
            }
            if (af1 != null)
            {
                acdx[i].f = af1[i];
            }
        }

        obj = b("faceScores");
        obj1 = ((aju) (obj)).a(null).e();
        ((aih) (obj1)).b(acdx);
        ((aju) (obj)).a(((ahs) (obj1)));
    }
}

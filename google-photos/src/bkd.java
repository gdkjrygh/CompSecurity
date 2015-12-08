// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import androidx.media.filterpacks.base.GraphOutputTarget;
import androidx.media.filterpacks.base.MetaFilter;
import androidx.media.filterpacks.base.VariableSource;

public class bkd
{

    private static final String a = bkd.getSimpleName();
    private final ajr b;

    public bkd(ajr ajr1, cko cko)
    {
        b = (ajr)b.a(ajr1, "mffContext", null);
        b.a(cko, "bitmapFactory", null);
    }

    private com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module a()
    {
        com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module module;
        try
        {
            module = com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module.a();
        }
        catch (Exception exception)
        {
            return com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module.a(b.a, "frsdk_modules/PFFprec_600.emd");
        }
        return module;
    }

    private void a(ahq ahq1, String s, int i, String s1, aif aif1)
    {
        ahq ahq2 = b.a(b, i, ahq1);
        ahq2.c(s1).mType = aif1;
        ((MetaFilter)ahq1.a(s)).a(ahq2);
    }

    public final ahq a(Uri uri)
    {
        Object obj;
        ahq ahq1;
        ahq1 = b.a(b, b.hK, null);
        obj = ahq1.a("faceTracker");
        if (!(obj instanceof cdw)) goto _L2; else goto _L1
_L1:
        cdw cdw1;
        cdw1 = (cdw)obj;
        obj = a();
        cdw1.a(((com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module) (obj)));
        ((com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module) (obj)).c();
_L4:
        a(ahq1, "sharpnessScorer", b.hY, "score", aif.a(Float.TYPE));
        a(ahq1, "faceIlluminationScorer", b.hV, "score", aif.a(Float.TYPE));
        a(ahq1, "newChromaHistogram", b.hW, "newChromaHistogramOut", aif.b(200));
        a(ahq1, "newChromaHistogram", b.hW, "newColorfulnessOut", aif.a(Float.TYPE));
        ahq1.b("defaultImageQuad").a(ako.a(0.0F, 0.0F, 1.0F, 1.0F));
        ahq1.b("path").a(uri);
        ahq1.b("decoderStartTime").a(Long.valueOf(0L));
        return ahq1;
        uri;
        ((com.google.android.apps.moviemaker.filterpacks.face.FaceDetector.Module) (obj)).c();
        throw uri;
_L2:
        String s = a;
        obj = String.valueOf(obj.getClass().getName());
        if (((String) (obj)).length() != 0)
        {
            obj = "unknown class for faceTracker: ".concat(((String) (obj)));
        } else
        {
            obj = new String("unknown class for faceTracker: ");
        }
        Log.w(s, ((String) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
    }

}

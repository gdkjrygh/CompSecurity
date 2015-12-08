// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import androidx.media.filterpacks.base.VariableSource;
import com.google.android.apps.moviemaker.filterpacks.miscellaneous.BaseEmitterFilter;
import com.google.android.apps.moviemaker.filterpacks.miscellaneous.BitmapEmitterFilter;
import com.google.android.apps.moviemaker.filterpacks.miscellaneous.FrameCountFilter;
import com.google.android.apps.moviemaker.filterpacks.miscellaneous.StatisticEmitterFilter;
import com.google.android.apps.moviemaker.filterpacks.miscellaneous.TimestampEmitterFilter;
import com.google.android.apps.moviemaker.filterpacks.numeric.AutoColorCorrectAnalysisFilter;
import com.google.android.apps.moviemaker.filterpacks.numeric.VectorAccumulationFilter;
import com.google.android.apps.moviemaker.stabilizer.StabilizationAnalysisFilter;
import java.io.IOException;
import java.util.Map;

public class bke
{

    private static final String e = bke.getSimpleName();
    final Object a = new Object();
    final aiw b;
    volatile boolean c;
    long d;
    private final bkd f;
    private long g;

    public bke(ajr ajr, cko cko)
    {
        d = -1L;
        b.a(ajr, "mffContext", null);
        b.a(cko, "bitmapFactory", null);
        f = new bkd(ajr, cko);
        b = new aiw(ajr);
    }

    static long a(bke bke1)
    {
        return bke1.d;
    }

    static long a(bke bke1, long l)
    {
        bke1.g = l;
        return l;
    }

    static String a()
    {
        return e;
    }

    private static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        s = s.toCharArray();
        int j = s.length;
        int i = 0;
        boolean flag = true;
        while (i < j) 
        {
            char c1 = s[i];
            if (c1 == '_')
            {
                flag = false;
            } else
            if (flag)
            {
                stringbuilder.append(Character.toLowerCase(c1));
            } else
            {
                stringbuilder.append(c1);
                flag = true;
            }
            i++;
        }
        return stringbuilder.append("Emitter").toString();
    }

    private static void a(ahq ahq1, bim bim1)
    {
        boolean flag = false;
        if (bim1.c.length != 0)
        {
            ahq1 = new bka(ahq1);
            ahq1.a(((bka) (ahq1)).a.a("decoder"));
            String as[] = new String[bim1.c.length];
            for (int i = 0; i < bim1.c.length; i++)
            {
                as[i] = a(bim1.c[i].name());
            }

            bim1 = ((bka) (ahq1)).b;
            b.a(bim1, "mInputMapping", null);
            if (bim1.isEmpty())
            {
                b.a((new StringBuilder()).append("mInputMapping").append(" must not be empty"), "cannot deactivate filters before analyzeConnections is called.");
            }
            int k = as.length;
            for (int j = ((flag) ? 1 : 0); j < k; j++)
            {
                bim1 = as[j];
                ahq1.b(((bka) (ahq1)).a.a(bim1));
            }

            ahq1.a();
        }
    }

    private static void a(VectorAccumulationFilter vectoraccumulationfilter, cmi cmi1, long l, boolean flag)
    {
        cos cos1;
        int i;
        if (flag)
        {
            cos1 = cos.v;
        } else
        {
            cos1 = cos.w;
        }
        cmi1 = cmi1.b(cos1);
        i = b.b(cmi1, l);
        if (i != -1)
        {
            vectoraccumulationfilter.mCumulativeVector = (long[])cmi1.valueAt(i);
        }
    }

    static long b(bke bke1)
    {
        return bke1.g;
    }

    static Object c(bke bke1)
    {
        return bke1.a;
    }

    static boolean d(bke bke1)
    {
        return bke1.c;
    }

    static aiw e(bke bke1)
    {
        return bke1.b;
    }

    public final void a(Uri uri, bim bim1, cmf cmf1, bki bki1)
    {
        Object obj;
        bkb bkb1;
        ahq ahq1;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        bkb1 = new bkb();
        bij abij[];
        int i;
        int j;
        if (cmf1 == null)
        {
            obj = clz.f();
        } else
        {
            obj = clz.a(cmf1);
        }
        obj1 = new bkn(new bkf(this, bki1, uri, bkb1, ((cma) (obj))));
        obj2 = new bkg(this, bki1);
        g = -1L;
        c = false;
        ahq1 = f.a(uri);
        abij = bih.a;
        j = abij.length;
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj3 = abij[i];
        obj4 = ((bij) (obj3)).a.f;
        obj4 = ahq1.a(a(((bij) (obj3)).name()));
        if (obj4 != null) goto _L4; else goto _L3
_L3:
        obj4 = String.valueOf(((bij) (obj3)).name());
        obj3 = String.valueOf(a(((bij) (obj3)).name()));
        (new StringBuilder(String.valueOf(obj4).length() + 28 + String.valueOf(obj3).length())).append("Unknown filter for output ").append(((String) (obj4))).append(": ").append(((String) (obj3)));
_L11:
        i++;
          goto _L5
_L4:
        bkh.a[((bij) (obj3)).a.ordinal()];
        JVM INSTR tableswitch 1 5: default 860
    //                   1 382
    //                   2 382
    //                   3 382
    //                   4 466
    //                   5 487;
           goto _L6 _L7 _L7 _L7 _L8 _L9
_L13:
        if (true) goto _L11; else goto _L10
_L10:
_L15:
        if (true) goto _L13; else goto _L12
_L12:
_L17:
        if (true) goto _L15; else goto _L14
_L14:
_L19:
        if (true) goto _L17; else goto _L16
_L16:
_L21:
        if (true) goto _L19; else goto _L18
_L18:
_L23:
        if (true) goto _L21; else goto _L20
_L20:
_L25:
        if (true) goto _L23; else goto _L22
_L22:
_L27:
        if (true) goto _L25; else goto _L24
_L24:
_L29:
        if (true) goto _L27; else goto _L26
_L26:
_L31:
        if (true) goto _L29; else goto _L28
_L28:
_L33:
        if (true) goto _L31; else goto _L30
_L30:
_L35:
        if (true) goto _L33; else goto _L32
_L32:
_L37:
        if (true) goto _L35; else goto _L34
_L34:
_L39:
        if (true) goto _L37; else goto _L36
_L36:
_L41:
        if (true) goto _L39; else goto _L38
_L38:
_L43:
        if (true) goto _L41; else goto _L40
_L40:
_L45:
        if (true) goto _L43; else goto _L42
_L42:
_L44:
_L6:
        obj4 = e;
        obj3 = String.valueOf(((bij) (obj3)).a);
        Log.w(((String) (obj4)), (new StringBuilder(String.valueOf(obj3).length() + 21)).append("Unknown output type: ").append(((String) (obj3))).toString());
          goto _L11
        bim1;
        cmf1 = e;
        obj = String.valueOf(uri);
        Log.e(cmf1, (new StringBuilder(String.valueOf(obj).length() + 24)).append("Unable to analyze video ").append(((String) (obj))).toString(), bim1);
        bki1.a(uri, bim1);
_L55:
        return;
_L7:
        ((BaseEmitterFilter)obj4).mListener = new bkc(((cma) (obj)), ((bij) (obj3)).b);
          goto _L11
        bim1;
        cmf1 = e;
        obj = String.valueOf(uri);
        Log.e(cmf1, (new StringBuilder(String.valueOf(obj).length() + 24)).append("Unable to analyze video ").append(((String) (obj))).toString(), bim1);
        bki1.a(uri, bim1);
        return;
_L8:
        ((StabilizationAnalysisFilter)obj4).mListener = new bkk(this, ((cma) (obj)));
          goto _L11
_L9:
        ((AutoColorCorrectAnalysisFilter)obj4).mListener = new cdz(((cma) (obj)));
          goto _L11
_L2:
        ((StatisticEmitterFilter)ahq1.a("frameNumberEmitter")).mListener = bkb1;
        ((TimestampEmitterFilter)ahq1.a("frameTimestampEmitter")).mListener = ((cdy) (obj1));
        ((BitmapEmitterFilter)ahq1.a("frameBitmapEmitter")).mListener = ((cdy) (obj2));
        if (cmf1 == null) goto _L47; else goto _L46
_L46:
        obj2 = cmf1.c();
        obj1 = cmf1.d();
        if (obj2 == null || obj1 == null) goto _L47; else goto _L48
_L48:
        if (((cmb) (obj2)).c <= 0L) goto _L47; else goto _L49
_L49:
        cmf1 = ((cmi) (obj1)).b(cos.o);
        if (cmf1.size() != 0) goto _L51; else goto _L50
_L50:
        cmf1 = Pair.create(Long.valueOf(0L), Integer.valueOf(0));
_L56:
        ((FrameCountFilter)ahq1.a("frameCounter")).mFrameNumberOffset = ((Integer)((Pair) (cmf1)).second).intValue();
        VectorAccumulationFilter vectoraccumulationfilter = (VectorAccumulationFilter)ahq1.a("saliencyMapVerticalProjectionsAccumulationFilter");
        VectorAccumulationFilter vectoraccumulationfilter1 = (VectorAccumulationFilter)ahq1.a("saliencyMapHorizontalProjectionsAccumulationFilter");
        a(vectoraccumulationfilter, ((cmi) (obj1)), ((Long)((Pair) (cmf1)).first).longValue(), true);
        a(vectoraccumulationfilter1, ((cmi) (obj1)), ((Long)((Pair) (cmf1)).first).longValue(), false);
        ahq1.b("decoderStartTime").a(((Pair) (cmf1)).first);
_L47:
        a(ahq1, bim1);
        bim1 = ((bim) (a));
        bim1;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (flag) goto _L53; else goto _L52
_L52:
        ahq1.a(b);
        b.a(new bkj(this, ahq1, uri, ((cma) (obj)), bkb1, bki1));
        b.a(false);
        b.a(ahq1);
_L53:
        bim1;
        JVM INSTR monitorexit ;
        if (!flag) goto _L55; else goto _L54
_L54:
        bki1.b(uri, ((cma) (obj)));
        return;
_L51:
        long l = cmf1.keyAt(cmf1.size() - 1);
        cmf1 = Pair.create(Long.valueOf(l), Integer.valueOf(((Integer)cmf1.get(l)).intValue()));
          goto _L56
        uri;
        bim1;
        JVM INSTR monitorexit ;
        throw uri;
          goto _L11
    }

}

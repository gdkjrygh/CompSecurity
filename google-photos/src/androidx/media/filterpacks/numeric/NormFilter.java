// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.numeric;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import android.util.Log;

public final class NormFilter extends ahn
{

    private static final String TAG = "NormFilter";
    private static boolean mLogVerbose = Log.isLoggable("NormFilter", 2);

    public NormFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(Float.TYPE);
        return (new ajw()).a("x", 2, aif1).a("y", 2, aif1).b("norm", 2, aif1).a();
    }

    protected final void e()
    {
        float f = ((Float)a("x").a().d().m()).floatValue();
        float f1 = ((Float)a("y").a().d().m()).floatValue();
        f = (float)Math.hypot(f, f1);
        if (mLogVerbose)
        {
            (new StringBuilder(22)).append("Norm = ").append(f);
        }
        aju aju1 = b("norm");
        aig aig1 = aju1.a(null).d();
        aig1.a(Float.valueOf(f));
        aju1.a(aig1);
    }

}

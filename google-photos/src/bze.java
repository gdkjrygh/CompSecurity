// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class bze extends bmb
{

    public static final String a = bze.getSimpleName();
    public final bsm b;
    private final bsr e = new bzf(this, "LoadSingleCloudMedia");
    private final Context f;
    private final blw g;
    private final noj h;
    private final bqa i;
    private final blj j;
    private final int k;

    public bze(bmb bmb1, Bundle bundle, Context context, blw blw1, noj noj1, cag cag, bqa bqa1, 
            blj blj1)
    {
        super(bmb1);
        f = (Context)b.a(context, "context", null);
        g = (blw)b.a(blw1, "display", null);
        h = (noj)b.a(noj1, "provider", null);
        b.a(cag, "backgroundTaskManager", null);
        i = (bqa)b.a(bqa1, "playerController", null);
        j = (blj)b.a(blj1, "clipEditorController", null);
        k = ((mmr)olm.a(context, mmr)).d();
        b = (new bsp()).a(e).a(this, a, bundle, cag);
    }

    static blj a(bze bze1)
    {
        return bze1.j;
    }

    static String b()
    {
        return a;
    }

    static noj b(bze bze1)
    {
        return bze1.h;
    }

    static int c(bze bze1)
    {
        return bze1.k;
    }

    static blw d(bze bze1)
    {
        return bze1.g;
    }

    static bqa e(bze bze1)
    {
        return bze1.i;
    }

    static Context f(bze bze1)
    {
        return bze1.f;
    }

}

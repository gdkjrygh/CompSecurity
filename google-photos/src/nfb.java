// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.libraries.social.location.GcmLocationService;

final class nfb
    implements lzy
{

    private nfa a;

    nfb(nfa nfa1)
    {
        a = nfa1;
        super();
    }

    public final void a(lzx lzx)
    {
        lzx = (meb)lzx;
        if (Log.isLoggable("GcmLocationService", 4))
        {
            int i = lzx.r().b();
            (new StringBuilder(39)).append("one-shot upload: ResultCode ").append(i);
        }
        olm.a(a.b, mst);
        new mss(a.b, a.a);
        lzx = msv.a;
        lzx = msw.a;
        GcmLocationService.a(a.b);
    }
}

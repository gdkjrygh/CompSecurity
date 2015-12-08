// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dm, gs, gr, de, 
//            gk, ct, gl, gq, 
//            ea

public class gj
{
    public static interface a
    {

        public abstract void a(int i, String s);
    }


    public static void a(Activity activity, ea ea, a a1)
    {
        dm dm1 = dm.a(activity);
        dm1.setMessage("Loading...");
        dm1.setCancelable(false);
        dm1.show();
        (new gs(activity, ea, dm1, a1)).execute(new Void[0]);
    }

    static void a(Activity activity, ea ea, String s, dm dm1, String s1, a a1)
    {
        b(activity, ea, s, dm1, s1, a1);
    }

    private static void b(Activity activity, ea ea, String s, dm dm1, String s1, a a1)
    {
        gr gr1 = new gr(activity);
        de de1 = de.a(activity);
        de1.requestWindowFeature(1);
        de1.getWindow().setFlags(1024, 1024);
        de1.setOnCancelListener(new gk(gr1, a1));
        if (ct.p() < 7)
        {
            gr1.setWebViewClient(new gl(gr1, de1, dm1, activity, a1, s1, ea));
        } else
        {
            gr1.setWebViewClient(new gq(ea, s1, a1, activity, dm1, de1, gr1));
        }
        gr1.loadUrl(s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public class fsd
    implements dmx
{

    public fsd()
    {
    }

    public static fsc a(Context context, String s, boolean flag, fsv fsv, Flags flags, Reason reason, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, 
            String s1)
    {
        new frk();
        return new fsc(reason, s, flag, fsv, frk.a(context, flags, reason), new fry(context), verified, subview, s1);
    }
}

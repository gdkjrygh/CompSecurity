// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.framework.flag.NoFlags;

public final class fqz
{

    public Flags a;
    public boolean b;
    public Uri c;
    public String d;
    public boolean e;
    public com.spotify.mobile.android.util.viewuri.ViewUri.SubView f;
    private final Context g;

    private fqz(Context context)
    {
        f = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
        g = context;
    }

    public fqz(Context context, byte byte0)
    {
        this(context);
    }

    public final Intent a()
    {
        Intent intent = new Intent(g, com/spotify/mobile/android/ui/activity/upsell/PremiumSignupActivity);
        intent.setData(c);
        intent.putExtra("extra_can_observe_flags", b);
        Object obj;
        if (e)
        {
            obj = "";
        } else
        {
            obj = d;
        }
        intent.putExtra("extra_title", ((String) (obj)));
        intent.putExtra("sub_view", f);
        if (a != null)
        {
            obj = a;
        } else
        {
            obj = new NoFlags("Not logged in");
        }
        fyw.a(intent, ((Flags) (obj)));
        return intent;
    }
}

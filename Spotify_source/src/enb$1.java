// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.view.nClickListener
{

    private enb a;

    public final void onClick(View view)
    {
        view = gms.a(a.k(), ViewUri.T.toString()).a;
        view.putExtra("start_radio", true);
        view.putExtra("close_search_on_click", true);
        a.k().startActivity(view);
    }

    (enb enb1)
    {
        a = enb1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            DeleteCacheAndSettingsConfirmationActivity

final class a
    implements android.view.ngsConfirmationActivity._cls2
{

    private DeleteCacheAndSettingsConfirmationActivity a;

    public final void onClick(View view)
    {
        fop.a(a, ViewUri.bh, new ClientEvent(com.spotify.mobile.android.util.vity._cls2.a));
        a.finish();
    }

    Y(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity)
    {
        a = deletecacheandsettingsconfirmationactivity;
        super();
    }
}

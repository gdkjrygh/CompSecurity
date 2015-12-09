// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;
import p.df.a;

public class l
    implements k.c
{

    public l()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        p.df.a.c("PrivacySettingsHandler", "handleShowPrivacySettings");
        return new p.cp.b.c((new PandoraIntent("show_page")).putExtra("intent_page_name", p.t).putExtra("intent_show_force_screen", true));
    }
}

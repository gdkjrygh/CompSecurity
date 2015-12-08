// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;

public class d
    implements k.c
{

    public d()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        uri = uri.getQueryParameter("modal-display");
        if (uri == null || uri.equals("/") || uri.toLowerCase().startsWith("http://"))
        {
            return null;
        } else
        {
            uri = Uri.parse(com.pandora.android.data.d.g).buildUpon().path(uri);
            return new p.cp.b.c((new PandoraIntent("show_web_dialog")).putExtra("intent_uri", uri.build().toString()).putExtra("intent_start_next_activity", true));
        }
    }
}

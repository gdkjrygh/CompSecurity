// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.data.d;
import java.util.Iterator;
import java.util.List;
import p.df.a;

public class h
    implements k.c
{

    public h()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        p.df.a.c("LandingPageHandler", (new StringBuilder()).append("pandorascheme.LandingPageHandler uriString:").append(uri).toString());
        android.net.Uri.Builder builder = Uri.parse(d.g).buildUpon().query(uri.getQuery());
        for (uri = uri.getPathSegments().listIterator(1); uri.hasNext(); builder.appendPath((String)uri.next())) { }
        uri = new PandoraIntent("launch_pandora_browser");
        uri.putExtra("intent_uri", builder.build().toString());
        return new p.cp.b.c(uri);
    }
}

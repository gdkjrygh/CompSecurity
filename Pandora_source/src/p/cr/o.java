// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;
import java.util.List;

public class o
    implements k.c
{

    public o()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        if (uri.getPathSegments().size() < 2)
        {
            uri = (new PandoraIntent("show_page")).putExtra("intent_page_name", p.a);
        } else
        if (uri.getPathSegments().size() == 2 && "new".equals(uri.getPathSegments().get(1)))
        {
            uri = (new PandoraIntent("show_page")).putExtra("intent_page_name", p.c);
        } else
        {
            return null;
        }
        uri.putExtra("intent_show_force_screen", true);
        return new p.cp.b.c(uri);
    }
}

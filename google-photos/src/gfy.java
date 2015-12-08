// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;

public class gfy
    implements mpj, omb, opv
{

    private gfz a;
    private mmr b;
    private mpk c;
    private gfw d;
    private nog e;
    private gfq f;
    private String g;

    public gfy(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(int i, Intent intent)
    {
        while (intent == null || !intent.hasExtra("extra_result_generate_bytes_uri")) 
        {
            return;
        }
        intent = Uri.fromFile(new File(((Uri)intent.getParcelableExtra("extra_result_generate_bytes_uri")).toString()));
        f.a(g, intent);
        a.a();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (mmr)olm1.a(mmr);
        c = (mpk)olm1.a(mpk);
        c.a(b.rt, this);
        d = (gfw)olm1.a(gfw);
        e = (nog)olm1.a(nog);
        f = (gfq)olm1.a(gfq);
    }

    public final void a(Uri uri, int i)
    {
        Object obj;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "a listener must be set before calling start()");
        p.a(gfw.a(uri), "aamUri must be a preshare Uri");
        obj = d;
        if (!gfw.a(uri))
        {
            uri = null;
        } else
        {
            uri = gfw.a(uri, 0);
        }
        g = uri;
        uri = e.a(g).b(b.d());
        if (gga.a != i) goto _L2; else goto _L1
_L1:
        ((nog) (uri)).a.setComponent(new ComponentName(((nog) (uri)).b, "com.google.android.apps.moviemaker.GenerateBytesActivity"));
        obj = uri.a();
        ((nog) (obj)).a.putExtra("extra_generate_bytes", true);
        ((nog) (obj)).a.putExtra("extra_bytes_quality_full", true);
_L4:
        uri = uri.b();
        c.a(b.rt, uri);
        return;
_L2:
        if (gga.b == i)
        {
            ((nog) (uri)).a.setComponent(new ComponentName(((nog) (uri)).b, "com.google.android.apps.moviemaker.GenerateBytesActivity"));
            nog nog1 = uri.a();
            nog1.a.putExtra("extra_generate_bytes", true);
            nog1.a.putExtra("extra_bytes_quality_preview", true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(gfz gfz1)
    {
        a = (gfz)p.b(gfz1, "listener must not be null");
    }

    static 
    {
        gfy.getSimpleName();
    }
}

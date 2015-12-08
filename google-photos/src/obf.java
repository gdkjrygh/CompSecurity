// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class obf extends nzf
    implements oar
{

    private oaq h;

    public obf()
    {
        h = new oaq(this, c);
    }

    public static Bundle b(Intent intent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("terms_uri", intent.getStringExtra("terms_uri"));
        bundle.putString("privacy_uri", intent.getStringExtra("privacy_uri"));
        return bundle;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b.a(oau, h);
    }

    public final void r()
    {
        Uri uri = null;
        obg obg1 = new obg();
        Object obj = super.q;
        if (obj != null)
        {
            obj = ((Bundle) (obj)).getString("terms_uri");
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = Uri.parse(((String) (obj)));
        } else
        {
            obj = null;
        }
        obg1.a = ((Uri) (obj));
        obj = super.q;
        if (obj != null)
        {
            obj = ((Bundle) (obj)).getString("privacy_uri");
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            uri = Uri.parse(((String) (obj)));
        }
        obg1.b = uri;
        h.a(obg1);
    }
}

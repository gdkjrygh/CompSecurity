// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class fhm
{

    public int a;
    public String b;
    public String c;
    public Uri d;
    public boolean e;
    public ekp f;
    private final Context g;

    public fhm(Context context)
    {
        a = -1;
        g = (Context)p.b(context, "must provide non-empty context");
    }

    public final Intent a()
    {
        if (b.c(d) && (TextUtils.isEmpty(b) || TextUtils.isEmpty(c)))
        {
            throw new IllegalStateException("Must specify a Uri or (a mediaKey and authKey)");
        }
        Object obj = (fhn)olm.a(g, fhn);
        obj = new Intent(g, ((fhn) (obj)).a());
        if (a != -1)
        {
            ((Intent) (obj)).putExtra("account_id", a);
        }
        if (!b.c(d))
        {
            ((Intent) (obj)).setData(d);
        } else
        {
            ((Intent) (obj)).putExtra("envelope_media_key", b);
            ((Intent) (obj)).putExtra("envelope_auth_key", c);
        }
        if (f != null && e)
        {
            throw new IllegalStateException("Cannot open both pager and settings");
        }
        if (e)
        {
            ((Intent) (obj)).putExtra("open_sharing_options", true);
        }
        if (f != null)
        {
            ((Intent) (obj)).putExtra("open_pager_to_media", f);
        }
        return ((Intent) (obj));
    }
}

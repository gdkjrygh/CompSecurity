// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.List;

public final class ifx
{

    public List a;
    public ekq b;
    public dhx c;
    public boolean d;
    private final Context e;
    private final int f;
    private final hyv g;
    private final ify h;

    public ifx(Context context, int i)
    {
        e = context;
        f = i;
        g = (hyv)olm.a(context, hyv);
        h = (ify)olm.a(context, ify);
    }

    public final Intent a()
    {
        Intent intent = new Intent(e, h.a());
        intent.putExtra("account_id", f);
        if (a != null)
        {
            g.a(b.zf, a);
        }
        if (b != null)
        {
            intent.putExtra("com.google.android.apps.photos.core.media_collection", b);
        }
        intent.putExtra("share_method_constraints", c);
        intent.putExtra("is_time_machine_share", d);
        return intent;
    }
}

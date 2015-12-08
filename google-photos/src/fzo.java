// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

final class fzo
    implements fzj
{

    private final fzs a;

    public fzo(Context context)
    {
        a = new fzs(context);
    }

    public final fzw a(fzi fzi1, int i)
    {
        Uri uri = Uri.parse(fzi1.b);
        if (!b.c(uri))
        {
            fzi1 = new fzy(a.a(new fzi(null, uri.toString()), i));
        } else
        {
            fzi1 = new fzy();
        }
        fzi1.r = uri.toString();
        fzi1.g = uri.getLastPathSegment();
        return fzi1.a();
    }

    public final boolean a(fzi fzi1)
    {
        if (!TextUtils.isEmpty(fzi1.b))
        {
            Uri uri = Uri.parse(fzi1.b);
            boolean flag;
            if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !nkj.a(fzi1.b))
            {
                return true;
            }
        }
        return false;
    }
}

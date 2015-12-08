// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

final class fzm
    implements fzj
{

    private final fzs a;
    private final ContentResolver b;

    public fzm(Context context)
    {
        a = new fzs(context);
        b = context.getContentResolver();
    }

    public final fzw a(fzi fzi1, int i)
    {
        fzy fzy1 = new fzy(a.a(fzi1, i));
        Uri uri = Uri.parse(fzi1.b);
        fzi1 = uri;
        if (oql.b(uri))
        {
            String s = oql.a(b, uri);
            fzi1 = uri;
            if (s != null)
            {
                fzi1 = Uri.parse(s);
            }
        }
        if (fzi1 != null)
        {
            fzy1.g = fzi1.getLastPathSegment();
            fzy1.h = fzi1.getPath();
        }
        return fzy1.a();
    }

    public final boolean a(fzi fzi1)
    {
        if (!TextUtils.isEmpty(fzi1.b))
        {
            if ("content".equals((fzi1 = Uri.parse(fzi1.b)).getScheme()) || "file".equals(fzi1.getScheme()))
            {
                return true;
            }
        }
        return false;
    }
}

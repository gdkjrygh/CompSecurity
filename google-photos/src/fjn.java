// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

final class fjn
    implements fjw
{

    private static final fjo a = new fjo();
    private final Context b;
    private final fjo c;
    private final noz d;

    fjn(Context context)
    {
        this(context, a);
    }

    private fjn(Context context, fjo fjo1)
    {
        b = context;
        c = fjo1;
        d = noz.a(context, "ExifFactory", new String[0]);
    }

    private fzw a(Uri uri, int i)
    {
        Object obj;
        fzi fzi1;
        String s;
        boolean flag;
        try
        {
            flag = "content".equals(uri.getScheme());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (d.a())
            {
                noy.a("uri", uri);
            }
            fzy fzy1 = new fzy();
            fzy1.r = uri.toString();
            return fzy1.a();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        b.getContentResolver().openAssetFileDescriptor(uri, "r").close();
        fzi1 = new fzi(null, uri.toString());
        return (new fzk(b, i)).a(fzi1).a;
_L2:
        s = String.valueOf(uri);
        throw new eke((new StringBuilder(String.valueOf(s).length() + 15)).append("Failed to open ").append(s).toString(), ((Exception) (obj)));
        fzy1;
        continue; /* Loop/switch isn't completed */
        fzy1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final ekf a(int i, Object obj)
    {
        return new fzu(a(((fjz)obj).a, i));
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return fzu;
    }

}

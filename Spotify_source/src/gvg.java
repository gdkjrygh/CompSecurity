// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public class gvg extends gwc
{

    public final Context a;

    public gvg(Context context)
    {
        a = context;
    }

    public boolean a(gvz gvz1)
    {
        return "content".equals(gvz1.d.getScheme());
    }

    public gwd b(gvz gvz1)
    {
        return new gwd(c(gvz1), com.squareup.picasso.Picasso.LoadedFrom.b);
    }

    public final InputStream c(gvz gvz1)
    {
        return a.getContentResolver().openInputStream(gvz1.d);
    }
}

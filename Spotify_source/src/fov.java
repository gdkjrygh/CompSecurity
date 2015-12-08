// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.music.framework.flag.NoFlags;

public final class fov extends fyl
{

    private boolean Y;
    public foy a;
    private String b;

    public fov()
    {
    }

    public static fov F()
    {
        fov fov1 = new fov();
        fyw.a(fov1, new NoFlags("NoFlags, external web view"));
        return fov1;
    }

    protected final void a()
    {
        Y = true;
        if (!TextUtils.isEmpty(b))
        {
            c(b);
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        s();
    }

    protected final void a(String s)
    {
        if (a != null)
        {
            a.b(Uri.parse(s));
        }
    }

    protected final boolean a(Uri uri)
    {
        return a != null && a.a(uri);
    }

    public final void b(String s)
    {
        b = s;
        if (Y)
        {
            c(b);
        }
    }
}

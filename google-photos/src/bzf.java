// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

final class bzf extends bsr
{

    private bze a;

    bzf(bze bze1, String s)
    {
        a = bze1;
        super(s);
    }

    private void a()
    {
        Toast.makeText(bze.f(a), c.bR, 0).show();
    }

    public final mtf a(String s)
    {
        String s1 = bze.a(a).b();
        if (s1 == null)
        {
            Log.w(bze.b(), "Failed to find media key.");
            a();
            return null;
        } else
        {
            return new boe(s, bze.b(a), bze.c(a), s1);
        }
    }

    public final boolean a(String s, mue mue1)
    {
        bze.d(a).a(false);
        if (mue1.c())
        {
            Log.w(bze.b(), "Failed to load remote video.", mue1.c);
            a();
            return false;
        } else
        {
            bze.e(a).l();
            bze.a(a).b = (Uri)mue1.a().getParcelable("local_file_uri");
            bze.d(a).i();
            return true;
        }
    }
}

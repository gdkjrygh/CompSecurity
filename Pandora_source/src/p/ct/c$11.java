// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.pandora.android.provider.b;
import p.al.f;
import p.an.k;

// Referenced classes of package p.ct:
//            c

class Object
    implements f
{

    final c a;

    public boolean a(Bitmap bitmap, String s, k k, boolean flag, boolean flag1)
    {
        if (bitmap != null && a.ah() != null)
        {
            a.a(a.ah().(), bitmap);
        }
        return true;
    }

    public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
    {
        return a(exception, (String)obj, k, flag);
    }

    public boolean a(Exception exception, String s, k k, boolean flag)
    {
        exception = BitmapFactory.decodeResource(b.a.h().getResources(), 0x7f0200e9);
        if (exception != null)
        {
            a.a(a.ah().(), exception);
        }
        return true;
    }

    public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
    {
        return a((Bitmap)obj, (String)obj1, k, flag, flag1);
    }

    Object(c c1)
    {
        a = c1;
        super();
    }
}

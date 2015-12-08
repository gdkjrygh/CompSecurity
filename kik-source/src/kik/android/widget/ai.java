// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Bundle;
import com.kik.android.a;
import com.kik.g.r;

// Referenced classes of package kik.android.widget:
//            af, GalleryWidget, aa, aj

final class ai extends r
{

    final int a;
    final af b;

    ai(af af1, int i)
    {
        b = af1;
        a = i;
        super();
    }

    public final void a(Object obj)
    {
        obj = ((Bundle)obj).getString("photoUrl");
        if (obj == null)
        {
            b.a.c.b("Photo Preview Closed").a("Selected", false).b();
            return;
        } else
        {
            b.a.c.b("Photo Preview Closed").a("Selected", true).b();
            kik.android.widget.GalleryWidget.a(b.a);
            String s = aa.b();
            kik.android.widget.GalleryWidget.a(b.a, new aj(this, s));
            GalleryWidget.b(b.a, ((String) (obj)));
            return;
        }
    }
}

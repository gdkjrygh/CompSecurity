// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Bundle;
import com.kik.g.r;
import kik.android.util.ct;

// Referenced classes of package kik.android.widget:
//            ak, am, GalleryWidget

final class al extends r
{

    final long a;
    final int b;
    final ak c;

    al(ak ak1, long l, int i)
    {
        c = ak1;
        a = l;
        b = i;
        super();
    }

    public final void a(Object obj)
    {
        obj = ((Bundle)obj).getString("photoUrl");
        GalleryWidget.a(c.a, new am(this, ((String) (obj))));
        GalleryWidget.a(c.a, ((String) (obj)), ct.c(((String) (obj))));
    }
}

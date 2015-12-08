// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.kik.g.p;
import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import kik.android.gifs.b.a;

// Referenced classes of package kik.android.gifs.view:
//            a

final class b extends r
{

    final String a;
    final Resources b;
    final p c;

    b(String s, Resources resources, p p1)
    {
        a = s;
        b = resources;
        c = p1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (kik.android.gifs.b.b)obj;
        obj = new kik.android.gifs.view.a(a, (byte)0);
        a a1;
        for (obj1 = ((kik.android.gifs.b.b) (obj1)).a.iterator(); ((Iterator) (obj1)).hasNext(); ((kik.android.gifs.view.a) (obj)).addFrame(new BitmapDrawable(b, a1.a), a1.b))
        {
            a1 = (a)((Iterator) (obj1)).next();
        }

        c.a(obj);
    }

    public final void a(Throwable throwable)
    {
        c.a(throwable);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import com.kik.g.p;
import java.io.File;
import kik.android.gifs.b.e;

// Referenced classes of package kik.android.gifs.view:
//            b

public final class a extends AnimationDrawable
{

    private String a;

    private a(String s)
    {
        a = s;
        setOneShot(false);
    }

    a(String s, byte byte0)
    {
        this(s);
    }

    public static p a(String s, File file, int i, kik.android.gifs.a.f.a a1, Resources resources)
    {
        p p1 = new p();
        e.a().a(file.getPath(), a1, i).a(new b(s, resources, p1));
        return p1;
    }

    public final String a()
    {
        return a;
    }
}

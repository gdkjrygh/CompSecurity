// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.kik.g.p;
import java.util.UUID;
import kik.android.gifs.b;
import kik.android.widget.ClampedContentPreviewView;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package kik.android.gifs.view:
//            d, c, a

public class GifView extends ClampedContentPreviewView
{

    private String h;
    private String i;

    public GifView(Context context)
    {
        this(context, null);
    }

    public GifView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = UUID.randomUUID().toString();
        context = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.RGB_565);
        context.eraseColor(0xffcccccc);
        a(context);
    }

    static String a(GifView gifview)
    {
        return gifview.h;
    }

    static void a(GifView gifview, a a1)
    {
        kik.android.gifs.b.a().a(new d(gifview, a1));
    }

    public final p a(String s, kik.android.gifs.a.f.a a1)
    {
        p p1 = new p();
        h = s;
        kik.android.gifs.b.a().a(s, a1, this).a(new c(this, p1));
        return p1;
    }

    public final String a()
    {
        return i;
    }

    protected final w a(Bitmap bitmap, String s)
    {
        return new cs(bitmap, s);
    }

    public final void b()
    {
        h = null;
        b(null);
        f();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.widget.ImageView;
import com.appboy.Appboy;

// Referenced classes of package bo.app:
//            e, d

final class f
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final float a;
    final e b;

    f(e e1, float f1)
    {
        b = e1;
        a = f1;
        super();
    }

    public final void onGlobalLayout()
    {
        int i = b.a.b.getWidth();
        b.a.b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i, (int)((float)i / a)));
        Appboy.a(b.a.b.getViewTreeObserver(), this);
    }
}

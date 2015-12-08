// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.widget.ImageView;
import com.appboy.a;

// Referenced classes of package a.a:
//            da, bz

final class dz
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final float a;
    final da b;

    dz(da da1, float f)
    {
        b = da1;
        a = f;
        super();
    }

    public final void onGlobalLayout()
    {
        int i = b.a.b.getWidth();
        b.a.b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i, (int)((float)i / a)));
        com.appboy.a.a(b.a.b.getViewTreeObserver(), this);
    }
}

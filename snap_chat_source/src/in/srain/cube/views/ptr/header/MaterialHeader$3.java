// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr.header;

import afC;
import android.view.animation.Animation;

// Referenced classes of package in.srain.cube.views.ptr.header:
//            MaterialHeader

final class a
    implements android.view.animation.onListener
{

    private afC a;

    public final void onAnimationEnd(Animation animation)
    {
        a.a();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    er(afC afc)
    {
        a = afc;
        super();
    }
}

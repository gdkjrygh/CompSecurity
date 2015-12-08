// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr.header;

import afE;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package in.srain.cube.views.ptr.header:
//            MaterialHeader

final class a extends Animation
{

    private MaterialHeader a;

    public final void applyTransformation(float f, Transformation transformation)
    {
        MaterialHeader.a(a, 1.0F - f);
        MaterialHeader.b(a).setAlpha((int)(255F * MaterialHeader.a(a)));
        a.invalidate();
    }

    (MaterialHeader materialheader)
    {
        a = materialheader;
        super();
    }
}

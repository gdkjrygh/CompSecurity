// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            Scale

private final class nit> extends nit>
{

    final Scale this$0;

    public final volatile Object get(Object obj)
    {
        return null;
    }

    public final volatile void setValue(Object obj, float f)
    {
        ((View)obj).setX(f - ((float)Scale.access$200(Scale.this).width() * Scale.access$000(Scale.this)) / 2.0F);
    }

    public ()
    {
        this$0 = Scale.this;
        super("centerX");
    }
}

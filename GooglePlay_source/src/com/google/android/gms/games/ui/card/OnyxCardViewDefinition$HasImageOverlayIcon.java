// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxCardViewDefinition

public static interface kListener
{

    public abstract void setImageOverlayIconBackground(Drawable drawable);

    public abstract void setImageOverlayIconClickListener(kListener klistener);

    public abstract void setImageOverlayIconClickable(boolean flag);

    public abstract void setImageOverlayIconContentDescription(int i);
}

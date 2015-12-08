// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.snapchat.android.ui.emojipicker:
//            EmojiDeletionHandler, EmojiMovableImageView

final class a
    implements android.view.animation.ener
{

    private EmojiMovableImageView a;

    public final void onAnimationEnd(Animation animation)
    {
        ((ViewGroup)a.getParent()).removeView(a);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    (EmojiMovableImageView emojimovableimageview)
    {
        a = emojimovableimageview;
        super();
    }
}

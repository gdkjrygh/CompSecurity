// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.skype.android.app.signin:
//            SignOutActivity

final class val.drawable
    implements Runnable
{

    final SignOutActivity this$0;
    final Drawable val$drawable;

    public final void run()
    {
        signOutImage.setImageDrawable(val$drawable);
        if (val$drawable instanceof Animatable)
        {
            Animatable animatable = (Animatable)val$drawable;
            animatable.stop();
            animatable.start();
        }
    }

    ()
    {
        this$0 = final_signoutactivity;
        val$drawable = Drawable.this;
        super();
    }
}

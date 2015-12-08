// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.graphics.Rect;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.google.android.apps.photos.stories.StoryEditText;

final class itj
    implements Runnable
{

    final Intent a;
    final itf b;

    itj(itf itf1, Intent intent)
    {
        b = itf1;
        a = intent;
        super();
    }

    public final void run()
    {
        if (b.O_() == null)
        {
            return;
        }
        ((InputMethodManager)b.O_().getSystemService("input_method")).hideSoftInputFromWindow(itf.s(b).getWindowToken(), 0);
        if (itf.s(b).getVisibility() == 0)
        {
            Animation animation = AnimationUtils.loadAnimation(b.O_(), s.aJ);
            animation.setInterpolator(b.O_(), s.aE);
            animation.setDuration(250L);
            itf.s(b).startAnimation(animation);
        }
        if (itf.v(b))
        {
            itf.z(b);
        }
        ViewPropertyAnimator viewpropertyanimator = itf.a(b).animate().x(itf.h(b).left).y(itf.h(b).top).scaleX(1.0F).scaleY(1.0F).setDuration(250L);
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj = AnimationUtils.loadInterpolator(b.O_(), 0x10c000d);
        } else
        {
            obj = new AccelerateDecelerateInterpolator();
        }
        obj = viewpropertyanimator.setInterpolator(((android.animation.TimeInterpolator) (obj))).setListener(new itk(this));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ((ViewPropertyAnimator) (obj)).z(0.0F);
        }
        ((ViewPropertyAnimator) (obj)).start();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;
import android.view.animation.Animation;
import com.kik.m.p;

// Referenced classes of package kik.android.widget.preferences:
//            KikEditTextPreference, KikCheckBoxPreference, KikListPreference

final class ab
    implements android.view.animation.Animation.AnimationListener
{

    final Preference a;

    ab(Preference preference)
    {
        a = preference;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a instanceof p)
        {
            ((p)a).a(false);
        }
        if (a instanceof KikEditTextPreference)
        {
            ((KikEditTextPreference)a).d();
            ((KikEditTextPreference)a).e();
        } else
        {
            if (a instanceof KikCheckBoxPreference)
            {
                ((KikCheckBoxPreference)a).e();
                ((KikCheckBoxPreference)a).f();
                return;
            }
            if (a instanceof KikListPreference)
            {
                ((KikListPreference)a).b();
                return;
            }
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}

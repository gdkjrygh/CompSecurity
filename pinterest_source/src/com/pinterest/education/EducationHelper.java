// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.education;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.ExperienceType;
import com.pinterest.schemas.experiences.Placement;
import java.util.HashMap;

public class EducationHelper
{

    public static final HashMap a = new _cls1();
    private static int b;

    public static View a(Context context, AndroidEducationAnchor androideducationanchor)
    {
        context = ((MainActivity)context).getActiveFragment().getView();
        if (context != null && a.containsKey(androideducationanchor))
        {
            return context.findViewById(((Integer)a.get(androideducationanchor)).intValue());
        } else
        {
            return null;
        }
    }

    public static Runnable a(Placement placement, BaseFragment basefragment)
    {
        placement = Experiences.b(String.valueOf(placement.getValue()));
        if (placement == null || ((ExperienceValue) (placement)).c != ExperienceType.GUIDE.getValue() && ((ExperienceValue) (placement)).c != ExperienceType.TOOLTIP.getValue())
        {
            placement = null;
        } else
        {
            placement = new Education(((ExperienceValue) (placement)).g);
            basefragment = new _cls2(basefragment, placement);
            int i1 = placement.getExperienceValue().b;
            if (placement.isFlyout() || i1 == Experience.ANDROID_NUX_FIRST_PIN.getValue() || i1 == Experience.ANDROID_FIRST_FLASHLIGHT_ED.getValue() || i1 == Experience.ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO.getValue())
            {
                i1 = 0;
            } else
            if (i1 == Experience.ANDROID_PINIT_BTN_TOOLTIP.getValue() || i1 == Experience.ANDROID_CLICKTHROUGH_BTN_TOOLTIP.getValue() || i1 == Experience.ANDROID_FIRST_PIN_SCROLL_PROMPT.getValue() || i1 == Experience.ANDROID_FIRST_PIN_TAP_PROMPT.getValue())
            {
                i1 = 1000;
            } else
            if (i1 == Experience.ANDROID_FLASHLIGHT_BUTTON_TOOLTIP.getValue())
            {
                i1 = -1;
            } else
            {
                i1 = 2000;
            }
            placement = basefragment;
            if (i1 != -1)
            {
                Education.showDelayed(basefragment, i1);
                return basefragment;
            }
        }
        return placement;
    }

    public static void a()
    {
        AnalyticsApi.b(String.format("AndroidEducationFlyout_%s", new Object[] {
            Integer.valueOf(b)
        }));
    }

    public static void a(int i1)
    {
        AnalyticsApi.b(String.format("AndroidEducationStep_%d", new Object[] {
            Integer.valueOf(i1)
        }));
    }

    public static void a(Runnable runnable)
    {
        if (runnable != null)
        {
            Education.removeCallbacks(runnable);
        }
        Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS_UI));
    }

    public static void a(String s)
    {
        if (s != null)
        {
            b = Integer.parseInt(s);
            return;
        } else
        {
            b = -1;
            return;
        }
    }

    private static boolean a(Placement placement, Experience experience)
    {
        placement = Experiences.a(String.valueOf(placement.getValue()));
        return placement != null && ((ExperienceValue) (placement)).b == experience.getValue();
    }

    public static boolean a(String s, Experience experience)
    {
        return TextUtils.equals(s, String.valueOf(experience.getValue()));
    }

    public static int[] a(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        ai[1] = ai[1] - Device.getStatusBarHeight();
        return ai;
    }

    public static int b()
    {
        return b;
    }

    public static void b(int i1)
    {
        AnalyticsApi.b(String.format("AndroidEducationAnchor_%d", new Object[] {
            Integer.valueOf(i1)
        }));
    }

    public static boolean c()
    {
        return a(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER, Experience.ANDROID_NUX_FIRST_PIN);
    }

    public static boolean d()
    {
        ExperienceValue experiencevalue = Experiences.a(String.valueOf(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER.getValue()));
        return experiencevalue != null && (experiencevalue.b == Experience.ANDROID_PINIT_BTN_TOOLTIP.getValue() || experiencevalue.b == Experience.ANDROID_CLICKTHROUGH_BTN_TOOLTIP.getValue());
    }

    public static boolean e()
    {
        return a(Placement.ANDROID_ALL_PINS_VIEW_TAKEOVER, Experience.ANDROID_OWN_LIBRARY_ALL_PINS_ED);
    }

    public static boolean f()
    {
        return a(Placement.ANDROID_USER_PROFILE_TAKEOVER, Experience.ANDROID_OWN_LIBRARY_PROFILE_ED);
    }

    public static boolean g()
    {
        return a(Placement.ANDROID_HOME_FEED_TAKEOVER, Experience.ANDROID_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER);
    }

    public static boolean h()
    {
        ExperienceValue experiencevalue = Experiences.a(String.valueOf(Placement.ANDROID_HOME_FEED_TAKEOVER.getValue()));
        return experiencevalue != null && (experiencevalue.b == Experience.ANDROID_FIRST_PIN_SCROLL_PROMPT.getValue() || experiencevalue.b == Experience.ANDROID_FIRST_PIN_TAP_PROMPT.getValue());
    }

    public static boolean i()
    {
        return a(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER, Experience.ANDROID_FLASHLIGHT_BUTTON_TOOLTIP);
    }

    public static boolean j()
    {
        return a(Placement.ANDROID_FLASHLIGHT_TAKEOVER, Experience.ANDROID_FIRST_FLASHLIGHT_ED);
    }

    public static boolean k()
    {
        ExperienceValue experiencevalue = Experiences.a(String.valueOf(Placement.ANDROID_PIN_CLOSEUP_COMMERCE_TAKEOVER.getValue()));
        return experiencevalue != null && (experiencevalue.b == Experience.ANDROID_COMMERCE_CLOSEUP_BUY_ED.getValue() || experiencevalue.b == Experience.ANDROID_COMMERCE_CLOSEUP_MERCHANT_ED.getValue());
    }

    public static boolean l()
    {
        return a(Placement.ANDROID_HOME_FEED_TAKEOVER, Experience.ANDROID_COMMERCE_HOME_FEED_ED);
    }

    public static boolean m()
    {
        return a(Placement.ANDROID_COMMERCE_CHECKOUT_TAKEOVER, Experience.ANDROID_COMMERCE_CHECKOUT_ED);
    }

    public static boolean n()
    {
        ExperienceValue experiencevalue = Experiences.a(String.valueOf(Placement.ANDROID_MAIN_USER_ED.getValue()));
        return experiencevalue != null && experiencevalue.b == Experience.ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER.getValue();
    }


    private class _cls2
        implements Runnable
    {

        final BaseFragment a;
        final Education b;

        public final void run()
        {
            while (a != null && !a.isActive() || b.getEid().equals(String.valueOf(Experience.NOOP.getValue()))) 
            {
                return;
            }
            Events.post(new EducationEvent(b));
        }

        _cls2(BaseFragment basefragment, Education education)
        {
            a = basefragment;
            b = education;
            super();
        }
    }


    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put(AndroidEducationAnchor.HOMEFEED_BUILDER_BUTTON, Integer.valueOf(0x7f0f004b));
            put(AndroidEducationAnchor.PIN_IT_BUTTON, Integer.valueOf(0x7f0f0305));
            put(AndroidEducationAnchor.CLICKTHROUGH_BUTTON, Integer.valueOf(0x7f0f0005));
            put(AndroidEducationAnchor.PROFILE_TAB, Integer.valueOf(0x7f0f0507));
            put(AndroidEducationAnchor.LIBRARY_ALL_PINS, Integer.valueOf(0x7f0f00a9));
            put(AndroidEducationAnchor.LIBRARY_TOPIC, Integer.valueOf(1));
            put(AndroidEducationAnchor.FLASHLIGHT_BUTTON, Integer.valueOf(0x7f0f0006));
            put(AndroidEducationAnchor.FLASHIGHT_CROPPER, Integer.valueOf(0x7f0f01d8));
            put(AndroidEducationAnchor.HOMEFEED_FIRST_PIN, Integer.valueOf(0x7f0f0004));
            put(AndroidEducationAnchor.CLOSEUP_ATTRIBUTION_NAME, Integer.valueOf(0x7f0f0018));
            put(AndroidEducationAnchor.RICH_ACTION_BUTTON, Integer.valueOf(0x7f0f04b8));
            put(AndroidEducationAnchor.CHECKOUT_ADD_CREDIT_CARD_BUTTON, Integer.valueOf(0x7f0f00e1));
        }
    }

}

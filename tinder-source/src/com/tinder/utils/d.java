// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.net.Uri;
import com.appboy.Appboy;
import com.appboy.AppboyUser;
import com.appboy.IAppboyEndpointProvider;
import com.appboy.enums.Gender;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.models.outgoing.FacebookUser;
import com.tinder.d.a;
import com.tinder.managers.ae;
import java.math.BigDecimal;

public final class d
    implements com.tinder.d.a
{
    public static interface a
    {

        public abstract void a(FacebookUser facebookuser);
    }


    private boolean a;
    private Context b;

    public d(Context context)
    {
        b = context;
        a = ae.r();
        if (a)
        {
            Appboy.setAppboyEndpointProvider(new IAppboyEndpointProvider() {

                final d a;

                public final Uri getApiEndpoint(Uri uri)
                {
                    return uri.buildUpon().authority("taurus.iad.appboy.com").build();
                }

                public final Uri getResourceEndpoint(Uri uri)
                {
                    return uri;
                }

            
            {
                a = d.this;
                super();
            }
            });
        }
    }

    public final void a()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Number of Matches Changed");
        }
    }

    public final void a(float f1)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Seeking Distance", f1);
        }
    }

    public final void a(int i1)
    {
        if (!a) goto _L2; else goto _L1
_L1:
        AppboyUser appboyuser = Appboy.getInstance(b).getCurrentUser();
        i1;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 51
    //                   1 58;
           goto _L3 _L4 _L5
_L3:
        Gender gender = Gender.MALE;
_L7:
        appboyuser.setGender(gender);
_L2:
        return;
_L4:
        gender = Gender.MALE;
        continue; /* Loop/switch isn't completed */
_L5:
        gender = Gender.FEMALE;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(FacebookUser facebookuser)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setFacebookData(facebookuser);
        }
    }

    public final void a(String s)
    {
        if (a)
        {
            Appboy.getInstance(b).changeUser(s);
        }
    }

    public final void a(String s, String s1, BigDecimal bigdecimal)
    {
        if (a)
        {
            Appboy.getInstance(b).logPurchase(s, s1, bigdecimal);
        }
    }

    public final void a(boolean flag)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Has Bio", flag);
        }
    }

    public final void a(boolean flag, String s)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("super_like", flag);
            appboyproperties.addProperty("otherId", s);
            Appboy.getInstance(b).logCustomEvent("New Match", appboyproperties);
        }
    }

    public final void b()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Added Profile Photo");
        }
    }

    public final void b(int i1)
    {
        if (!a) goto _L2; else goto _L1
_L1:
        AppboyUser appboyuser = Appboy.getInstance(b).getCurrentUser();
        i1;
        JVM INSTR tableswitch -1 1: default 44
    //                   -1 56
    //                   0 62
    //                   1 68;
           goto _L3 _L4 _L5 _L6
_L3:
        String s = "female";
_L8:
        appboyuser.setCustomUserAttribute("Seeking Gender", s);
_L2:
        return;
_L4:
        s = "both";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "male";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "female";
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b(String s)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Account Creation Date", s);
        }
    }

    public final void b(boolean flag)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Is Tinder Plus Subscriber", flag);
        }
    }

    public final void c()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Remove Profile Photo");
        }
    }

    public final void c(int i1)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Seeking Min Age", i1);
        }
    }

    public final void c(String s)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Account Deletion Date", s);
        }
    }

    public final void c(boolean flag)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Has Education", flag);
        }
    }

    public final void d()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Unread Messages Changed");
        }
    }

    public final void d(int i1)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Seeking Max Age", i1);
        }
    }

    public final void d(String s)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Instagram", s);
        }
    }

    public final void d(boolean flag)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Has Work", flag);
        }
    }

    public final void e()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Changed Bio");
        }
    }

    public final void e(int i1)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Number of Matches", i1);
        }
    }

    public final void e(String s)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("otherId", s);
            Appboy.getInstance(b).logCustomEvent("Swiped Right On Branded Card", appboyproperties);
        }
    }

    public final void f()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Added Instagram");
        }
    }

    public final void f(int i1)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Number of Profile Photos", i1);
        }
    }

    public final void f(String s)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("creative_id", s);
            Appboy.getInstance(b).logCustomEvent("User Clicked Video Ad", appboyproperties);
        }
    }

    public final void g()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Removed Instagram");
        }
    }

    public final void g(int i1)
    {
        if (a)
        {
            Appboy.getInstance(b).getCurrentUser().setCustomUserAttribute("Unread Messages", i1);
        }
    }

    public final void g(String s)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("otherId", s);
            Appboy.getInstance(b).logCustomEvent("Super Like Attempt", appboyproperties);
        }
    }

    public final void h()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Rate Limited Bouncer");
        }
    }

    public final void h(int i1)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("allotment", i1);
            Appboy.getInstance(b).logCustomEvent("Super Like Exceeded", appboyproperties);
        }
    }

    public final void h(String s)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("otherId", s);
            Appboy.getInstance(b).logCustomEvent("Super Like Used On Rec", appboyproperties);
        }
    }

    public final void i()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Viewed Match List");
        }
    }

    public final void i(String s)
    {
        if (a)
        {
            AppboyProperties appboyproperties = new AppboyProperties();
            appboyproperties.addProperty("otherId", s);
            Appboy.getInstance(b).logCustomEvent("Swiped Right On Super Like Rec", appboyproperties);
        }
    }

    public final void j()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Opened Chat");
        }
    }

    public final void k()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Sent Chat Message");
        }
    }

    public final void l()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Added Education");
        }
    }

    public final void m()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Removed Education");
        }
    }

    public final void n()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Added Work");
        }
    }

    public final void o()
    {
        if (a)
        {
            Appboy.getInstance(b).logCustomEvent("Removed Work");
        }
    }
}

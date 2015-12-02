// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.e.a;
import com.facebook.base.broadcast.q;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.ab;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.phonenumber.identification.VerifyPhoneNumberParams;
import com.facebook.orca.server.aq;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.login:
//            b, am, al, aj, 
//            ak

public class ai
{

    private static final Class a = com/facebook/orca/login/ai;
    private am b;
    private av c;
    private d d;
    private PhoneNumberUtil e;
    private com.facebook.orca.login.b f;
    private q g;
    private String h;
    private BlueServiceFragment i;
    private String j;
    private String k;

    public ai(av av1, d d1, PhoneNumberUtil phonenumberutil, com.facebook.orca.login.b b1)
    {
        c = av1;
        d = d1;
        e = phonenumberutil;
        f = b1;
    }

    private void a(Intent intent)
    {
        intent = intent.getStringExtra("confirmation_code");
        c.a(f.a("confirmation_sms_received").b("code", intent));
        a(((String) (intent)), j, k);
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("SMS request failed with error ").append(serviceexception.getMessage()).toString());
        b.a(serviceexception);
    }

    static void a(ai ai1)
    {
        ai1.c();
    }

    static void a(ai ai1, Intent intent)
    {
        ai1.a(intent);
    }

    static void a(ai ai1, ServiceException serviceexception)
    {
        ai1.a(serviceexception);
    }

    private void c()
    {
        com.facebook.debug.log.b.e(a, "SMS request succeeded");
        b.Q();
    }

    public al a(String s, String s1)
    {
label0:
        {
label1:
            {
                Object obj1 = null;
                Object obj = obj1;
                if (d.a(a.q))
                {
                    obj = obj1;
                    if (d.a(a.r))
                    {
                        obj = obj1;
                        if (d.a(a.s))
                        {
                            obj = obj1;
                            if (d.a(a.t))
                            {
                                if (System.nanoTime() - d.a(a.t, 0L) >= 0x34630b8a000L)
                                {
                                    break label0;
                                }
                                Object obj3 = d.a(a.r, null);
                                String s2 = d.a(a.s, null);
                                obj = d.a(a.q, null);
                                Object obj2;
                                try
                                {
                                    obj2 = e.parse(s, s1);
                                    obj2 = e.format(((com.facebook.phonenumbers.Phonenumber.PhoneNumber) (obj2)), com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
                                    obj3 = e.parse(((String) (obj3)), s2);
                                    obj3 = e.format(((com.facebook.phonenumbers.Phonenumber.PhoneNumber) (obj3)), com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
                                }
                                // Misplaced declaration of an exception variable
                                catch (String s)
                                {
                                    com.facebook.debug.log.b.e(a, "Error parsing phone number for comparison.");
                                    return null;
                                }
                                if (!((String) (obj2)).equals(obj3))
                                {
                                    break label1;
                                }
                                com.facebook.debug.log.b.c(a, "Using cached confirmation code.");
                                c.a(f.a("sms_cache_used"));
                                obj = new al(this, s, s1, ((String) (obj)));
                            }
                        }
                    }
                }
                return ((al) (obj));
            }
            com.facebook.debug.log.b.c(a, "Cached confirmation code exists, but not for the specified phone number");
            return null;
        }
        com.facebook.debug.log.b.d(a, "Cached confirmation code expired.");
        a();
        return null;
    }

    public void a()
    {
        com.facebook.debug.log.b.c(a, "Clearing cached confirmation code.");
        d.b().a(a.q).a(a.r).a(a.s).a(a.t).a();
        c.a(f.a("sms_cache_cleared"));
    }

    public void a(Fragment fragment)
    {
        i = BlueServiceFragment.a(fragment, "requestSmsOperation");
        i.a(new aj(this));
        fragment = fragment.n();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED");
        g = new ak(this, fragment, intentfilter);
        g.a();
    }

    public void a(ab ab)
    {
        i.a(ab);
    }

    public void a(am am1)
    {
        b = am1;
    }

    public void a(String s)
    {
        h = s;
    }

    public void a(String s, String s1, String s2)
    {
        com.facebook.debug.log.b.c(a, "Caching confirmation code.");
        if (s != null && s1 != null && s2 != null)
        {
            d.b().a(a.q, s).a(a.r, s1).a(a.s, s2).a(a.t, System.nanoTime()).a();
            c.a(f.a(h, "sms_cache_set"));
            return;
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Error caching confirmation code. One or more values were null. Confirmation code: ").append(s).append("; ").append("Phone number: ").append(s1).append("; ").append("Country code: ").append(s2).toString());
            return;
        }
    }

    public void b(String s, String s1)
    {
        if (i.b() != j.INIT)
        {
            return;
        } else
        {
            j = s;
            k = s1;
            s = new VerifyPhoneNumberParams(s, s1);
            s1 = new Bundle();
            s1.putParcelable("verifyPhoneNumberParams", s);
            s1.putString("flow", "PARTIAL_REGISTRATION");
            s1.putString("reg_instance", d.a(a.p, null));
            i.a(aq.H, s1);
            return;
        }
    }

    public boolean b()
    {
        return i.b() != j.INIT;
    }

}

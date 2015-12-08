// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ac, w, AppMetadata, ab, 
//            UserAttributeParcel, EventParcel, k, EventParams

public final class ad extends t.a
{

    private final ac a;
    private final boolean b;

    public ad(ac ac1)
    {
        u.a(ac1);
        a = ac1;
        b = false;
    }

    public ad(ac ac1, byte byte0)
    {
        u.a(ac1);
        a = ac1;
        b = true;
    }

    static ac a(ad ad1)
    {
        return ad1.a;
    }

    private void a(String s)
        throws SecurityException
    {
        if (TextUtils.isEmpty(s))
        {
            a.e().a.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        int i;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        i = Process.myUid();
_L1:
        SecurityException securityexception;
        if (!GooglePlayServicesUtil.zzb(a.a, i, s) && !GooglePlayServicesUtil.zze(a.a, i))
        {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[] {
                s
            }));
        }
        break MISSING_BLOCK_LABEL_119;
        try
        {
            i = Binder.getCallingUid();
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception)
        {
            a.e().a.a("Measurement Service called with invalid calling package", s);
            throw securityexception;
        }
          goto _L1
    }

    public final void a(AppMetadata appmetadata)
    {
        u.a(appmetadata);
        a(appmetadata.b);
        a.f().a(new Runnable(appmetadata) {

            final AppMetadata a;
            final ad b;

            public final void run()
            {
                ac ac1 = ad.a(b);
                AppMetadata appmetadata1 = a;
                ac1.f().e();
                ac1.a();
                u.a(appmetadata1);
                u.a(appmetadata1.b);
                if (!TextUtils.isEmpty(appmetadata1.c))
                {
                    ac1.a(appmetadata1);
                    if (ac1.h().a(appmetadata1.b, "_f") == null)
                    {
                        long l = ac1.d.a();
                        ac1.a(new UserAttributeParcel("_fot", l, Long.valueOf(0x36ee80L * (l / 0x36ee80L + 1L)), "auto"), appmetadata1);
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        ac1.a(new EventParcel("_f", new EventParams(bundle), "auto", l), appmetadata1);
                        ac1.l();
                    }
                }
            }

            
            {
                b = ad.this;
                a = appmetadata;
                super();
            }
        });
    }

    public final void a(EventParcel eventparcel, AppMetadata appmetadata)
    {
        u.a(eventparcel);
        u.a(appmetadata);
        a(appmetadata.b);
        a.f().a(new Runnable(eventparcel, appmetadata) {

            final EventParcel a;
            final AppMetadata b;
            final ad c;

            public final void run()
            {
                ad.a(c).a(a, b);
            }

            
            {
                c = ad.this;
                a = eventparcel;
                b = appmetadata;
                super();
            }
        });
    }

    public final void a(UserAttributeParcel userattributeparcel, AppMetadata appmetadata)
    {
        u.a(userattributeparcel);
        u.a(appmetadata);
        a(appmetadata.b);
        if (userattributeparcel.a() == null)
        {
            a.f().a(new Runnable(userattributeparcel, appmetadata) {

                final UserAttributeParcel a;
                final AppMetadata b;
                final ad c;

                public final void run()
                {
                    ac ac1;
                    UserAttributeParcel userattributeparcel1;
                    AppMetadata appmetadata1;
                    ac1 = ad.a(c);
                    userattributeparcel1 = a;
                    appmetadata1 = b;
                    ac1.f().e();
                    ac1.a();
                    if (TextUtils.isEmpty(appmetadata1.c))
                    {
                        break MISSING_BLOCK_LABEL_112;
                    }
                    ac1.e().f.a("Removing user attribute", userattributeparcel1.b);
                    ac1.h().b();
                    ac1.a(appmetadata1);
                    ac1.h().b(appmetadata1.b, userattributeparcel1.b);
                    ac1.h().o();
                    ac1.e().f.a("User attribute removed", userattributeparcel1.b);
                    ac1.h().p();
                    return;
                    Exception exception;
                    exception;
                    ac1.h().p();
                    throw exception;
                }

            
            {
                c = ad.this;
                a = userattributeparcel;
                b = appmetadata;
                super();
            }
            });
            return;
        } else
        {
            a.f().a(new Runnable(userattributeparcel, appmetadata) {

                final UserAttributeParcel a;
                final AppMetadata b;
                final ad c;

                public final void run()
                {
                    ad.a(c).a(a, b);
                }

            
            {
                c = ad.this;
                a = userattributeparcel;
                b = appmetadata;
                super();
            }
            });
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.g;

import android.text.TextUtils;
import com.tinder.d.b;
import com.tinder.d.c;
import com.tinder.d.d;
import com.tinder.e.i;
import com.tinder.e.k;
import com.tinder.model.InstagramAuthError;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.SparksEvent;
import com.tinder.utils.v;

public final class a
    implements c
{

    d a;
    private b b;

    public a(d d1, b b1)
    {
        a = d1;
        b = b1;
    }

    public final void a(int i)
    {
        SparksEvent sparksevent = new SparksEvent("Account.InstagramConnect");
        sparksevent.put("from", Integer.valueOf(i));
        com.tinder.managers.a.a(sparksevent);
        a.c();
    }

    public final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            b.a(s, new i() {

                final a a;

                public final void a(InstagramAuthError instagramautherror)
                {
                    v.b("authenticateWithAccessCode onInstagramAuthFailure");
                    if (TextUtils.equals("Instagram Account already in use.", instagramautherror.errorMessage))
                    {
                        a.a.g();
                        return;
                    } else
                    {
                        a.a.e();
                        return;
                    }
                }

                public final void a(InstagramDataSet instagramdataset)
                {
                    String s1 = instagramdataset.username;
                    a.a.a(s1);
                    if (TextUtils.equals("null", instagramdataset.lastFetchTime))
                    {
                        instagramdataset = "";
                    } else
                    {
                        instagramdataset = instagramdataset.lastFetchTime;
                    }
                    TextUtils.isEmpty(instagramdataset);
                }

            
            {
                a = a.this;
                super();
            }
            });
            return;
        } else
        {
            v.b("authenticateWithAccessCode empty access code.");
            a.e();
            return;
        }
    }

    public final void b(int i)
    {
        a.h();
        b.a(i, new k() {

            final a a;

            public final void a()
            {
                a.a.i();
                a.a.d();
            }

            public final void b()
            {
                v.b("onInstagramLogoutFailure");
                a.a.i();
                a.a.f();
            }

            
            {
                a = a.this;
                super();
            }
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.os.AsyncTask;
import com.facebook.AccessToken;
import com.facebook.s;
import com.tinder.e.m;
import com.tinder.managers.d;

// Referenced classes of package com.tinder.activities:
//            ActivityLogin

final class a
    implements m
{

    final a a;

    public final void onTinderLoginFailure()
    {
        a.a.onTinderLoginFailure();
        a.a.a(false);
    }

    public final void onTinderLoginFailureAccessDenied()
    {
        a.a.onTinderLoginFailureAccessDenied();
        a.a.a(false);
    }

    public final void onTinderLoginSuccess()
    {
        a.a.onTinderLoginSuccess();
        a.a.a(false);
    }

    public final void onVerificationNeeded(boolean flag, boolean flag1, boolean flag2)
    {
        a.a.onVerificationNeeded(flag, flag1, flag2);
        a.a.a(false);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/activities/ActivityLogin$2

/* anonymous class */
    final class ActivityLogin._cls2 extends AsyncTask
    {

        final ActivityLogin a;

        protected final Object doInBackground(Object aobj[])
        {
            aobj = ((AccessToken[])aobj)[0];
            (new StringBuilder("Currently the access token is: ")).append(((Object) (aobj)));
            if (aobj != null)
            {
                return ((Object) (aobj));
            }
            new s();
            if (s.a())
            {
                aobj = AccessToken.a();
            }
            (new StringBuilder("Token loaded is: ")).append(((Object) (aobj)));
            return ((Object) (aobj));
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (AccessToken)obj;
            if (obj != null && !a.b.f())
            {
                a.b.a(new ActivityLogin._cls2._cls1(this), ((AccessToken) (obj)).d, false);
                return;
            } else
            {
                a.a(true);
                return;
            }
        }

            
            {
                a = activitylogin;
                super();
            }
    }

}

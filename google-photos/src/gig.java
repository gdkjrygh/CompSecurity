// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.photos.onboarding.AccountPickerActivity;

final class gig
    implements mpj
{

    private gie a;

    gig(gie gie1)
    {
        a = gie1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == 0)
        {
            gie.a(a).finish();
            return;
        }
        if (intent != null && intent.getBooleanExtra("sign_in", false))
        {
            gie.d(a).a(s.I, new Intent(gie.a(a), com/google/android/apps/photos/onboarding/AccountPickerActivity));
            return;
        } else
        {
            gie.b(a);
            a.e();
            return;
        }
    }
}

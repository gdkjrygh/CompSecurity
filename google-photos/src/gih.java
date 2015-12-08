// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.photos.onboarding.AccountPickerActivity;
import com.google.android.apps.photos.onboarding.SignInActivity;
import java.util.List;

final class gih
    implements mpj
{

    private gie a;

    gih(gie gie1)
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
        if (b.a(gie.e(a), null).isEmpty())
        {
            Intent intent1 = new Intent(gie.a(a), com/google/android/apps/photos/onboarding/SignInActivity);
            if (intent != null && intent.getExtras() != null)
            {
                intent1.putExtra("timed_out", intent.getExtras().getBoolean("timed_out", false));
            }
            gie.f(a).a();
            gie.d(a).a(s.av, intent1);
            return;
        } else
        {
            gie.d(a).a(s.I, new Intent(gie.a(a), com/google/android/apps/photos/onboarding/AccountPickerActivity));
            return;
        }
    }
}

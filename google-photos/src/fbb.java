// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.home.HomeActivity;

final class fbb
    implements fay
{

    private final Context a;

    fbb(Context context)
    {
        a = context;
    }

    public final Intent a(int i, faz faz1)
    {
        Intent intent = new Intent(a, com/google/android/apps/photos/home/HomeActivity);
        intent.putExtra("account_id", i);
        intent.putExtra("com.google.android.apps.photos.destination.Destination", faz1.name());
        return intent;
    }
}

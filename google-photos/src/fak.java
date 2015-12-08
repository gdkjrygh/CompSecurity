// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.dbprocessor.impl.DatabaseProcessorService;

final class fak
    implements fae
{

    private final Context a;

    fak(Context context)
    {
        a = context;
    }

    public final void a()
    {
        a.startService(new Intent(a, com/google/android/apps/photos/dbprocessor/impl/DatabaseProcessorService));
    }
}

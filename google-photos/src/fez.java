// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import com.google.android.apps.photos.downsync.GooglePhotoDownsyncProvider;

final class fez
    implements gcb
{

    private final Context a;

    public fez(Context context)
    {
        a = context;
    }

    public final void a(Account account)
    {
        ContentResolver.cancelSync(account, GooglePhotoDownsyncProvider.a(a));
    }
}

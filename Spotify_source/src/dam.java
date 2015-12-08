// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.os.Handler;

public interface dam
{

    public abstract AccountManagerFuture a(Activity activity, String s, String s1, String s2, String s3, String s4, AccountManagerCallback accountmanagercallback, 
            Handler handler);

    public abstract void a();

    public abstract boolean a(String s);
}

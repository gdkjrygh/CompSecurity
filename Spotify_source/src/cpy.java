// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;

public interface cpy
    extends IInterface
{

    public abstract void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult);

    public abstract void a(Status status);

    public abstract void a(Status status, GoogleSignInAccount googlesigninaccount);

    public abstract void b(Status status);
}

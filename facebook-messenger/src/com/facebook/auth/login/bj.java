// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Intent;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.fbservice.ops.ab;

// Referenced classes of package com.facebook.auth.login:
//            c

public interface bj
    extends c
{

    public abstract void Q();

    public abstract void a(PasswordCredentials passwordcredentials, ab ab);

    public abstract void c(Intent intent);
}

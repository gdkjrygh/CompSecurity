// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;


// Referenced classes of package com.hmobile.twitter:
//            BaseProvider

public static interface 
{

    public abstract void TwitterLogedIn();

    public abstract void TwitterLoggedInFailed(String s);

    public abstract void TwitterLoggedOut();

    public abstract void TwitterLoggedOutFailed(String s);

    public abstract void TwitterPostFailed(String s);

    public abstract void TwitterPostedSuccessfully();
}

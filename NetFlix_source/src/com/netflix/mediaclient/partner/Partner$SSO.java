// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;


// Referenced classes of package com.netflix.mediaclient.partner:
//            Partner, ResponseListener

public static interface ener
{

    public abstract void getExternalUserToken(String s, int i, ResponseListener responselistener);

    public abstract String getService();

    public abstract void requestExternalUserAuth(String s, int i, ResponseListener responselistener);
}

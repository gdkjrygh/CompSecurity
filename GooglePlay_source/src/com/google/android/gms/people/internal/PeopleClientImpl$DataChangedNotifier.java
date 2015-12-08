// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;


// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientImpl

private static final class mScopes
    implements com.google.android.gms.common.api.internal.pes
{

    private final String mAccount;
    private final String mPageId;
    private final int mScopes;

    public final volatile void notifyListener(Object obj)
    {
    }

    public final void onNotifyListenerFailed()
    {
    }

    public Q(String s, String s1, int i)
    {
        mAccount = s;
        mPageId = s1;
        mScopes = i;
    }
}

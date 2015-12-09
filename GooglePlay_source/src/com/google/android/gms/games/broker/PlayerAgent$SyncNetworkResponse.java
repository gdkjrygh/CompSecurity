// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.broker:
//            PlayerAgent

private static final class mStatusCode
{

    public final ArrayList mExperiences;
    public final String mNewSyncToken;
    public final int mStatusCode;

    public I()
    {
        mExperiences = new ArrayList();
        mNewSyncToken = null;
        mStatusCode = 500;
    }

    public mStatusCode(ArrayList arraylist, String s, int i)
    {
        mExperiences = arraylist;
        mNewSyncToken = s;
        mStatusCode = i;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSessionRecorder

public static interface Q
{

    public abstract com.google.android.gms.ads.identifier. getAdInfo(Context context);

    public abstract void recordSession(Context context, ClientContext clientcontext, String s, String s1, long l, long l1, com.google.android.gms.ads.identifier. );
}

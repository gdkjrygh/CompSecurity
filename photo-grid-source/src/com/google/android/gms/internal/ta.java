// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.appdatasearch.UsageInfo;

// Referenced classes of package com.google.android.gms.internal:
//            td

public interface ta
    extends IInterface
{

    public abstract void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, td td);

    public abstract void a(td td);

    public abstract void a(td td, String s, String s1);

    public abstract void a(td td, String s, UsageInfo ausageinfo[]);

    public abstract void a(td td, boolean flag);

    public abstract void b(td td);
}

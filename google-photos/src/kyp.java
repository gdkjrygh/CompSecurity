// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.appdatasearch.UsageInfo;

public interface kyp
    extends IInterface
{

    public abstract void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, kys kys);

    public abstract void a(kys kys);

    public abstract void a(kys kys, String s, String s1);

    public abstract void a(kys kys, String s, UsageInfo ausageinfo[]);

    public abstract void a(kys kys, boolean flag);

    public abstract void b(kys kys);
}

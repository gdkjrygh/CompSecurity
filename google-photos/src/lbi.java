// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class lbi
    implements ds
{

    private final Status a;
    private final long b;

    public lbi(Status status, long l)
    {
        a = status;
        b = l;
    }

    public final Status a_()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder("ReportingUploadResultImpl{mStatus=")).append(a).append(", mRequestId=").append(b).append('}').toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

public interface laz
    extends IInterface
{

    public abstract int a(long l);

    public abstract int a(Account account, PlaceReport placereport);

    public abstract ReportingState a(Account account);

    public abstract UploadRequestResult a(UploadRequest uploadrequest);

    public abstract int b(Account account);
}

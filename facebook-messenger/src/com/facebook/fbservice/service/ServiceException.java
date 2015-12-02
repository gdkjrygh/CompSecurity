// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.fbservice.service:
//            ah, t, OperationResult, u

public class ServiceException extends Exception
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ah();
    private final t a;
    private final OperationResult b;

    private ServiceException(Parcel parcel)
    {
        a = (t)parcel.readSerializable();
        b = (OperationResult)parcel.readParcelable(com/facebook/fbservice/service/OperationResult.getClassLoader());
    }

    ServiceException(Parcel parcel, ah ah1)
    {
        this(parcel);
    }

    public ServiceException(OperationResult operationresult)
    {
        super((new StringBuilder()).append(operationresult.d()).append(": ").append(operationresult.e()).toString());
        a = operationresult.d();
        b = operationresult;
    }

    public static ServiceException a(Throwable throwable)
    {
        return new ServiceException(OperationResult.a(u.a(throwable), u.b(throwable)));
    }

    public t a()
    {
        return a;
    }

    public OperationResult b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        parcel.writeParcelable(b, i);
    }

}

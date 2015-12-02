// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.upload:
//            j, k

public final class ContactsUploadState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final k a;
    private final int b;
    private final int c;
    private final int d;
    private final OperationResult e;
    private final ServiceException f;

    private ContactsUploadState(Parcel parcel)
    {
        a = (k)Enum.valueOf(com/facebook/contacts/upload/k, parcel.readString());
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        e = (OperationResult)parcel.readParcelable(com/facebook/fbservice/service/OperationResult.getClassLoader());
        f = (ServiceException)parcel.readParcelable(com/facebook/fbservice/service/ServiceException.getClassLoader());
    }

    ContactsUploadState(Parcel parcel, j j1)
    {
        this(parcel);
    }

    private ContactsUploadState(k k1, int i, int l, int i1, OperationResult operationresult, ServiceException serviceexception)
    {
        boolean flag;
        if (k1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = k1;
        b = i;
        c = l;
        d = i1;
        e = operationresult;
        f = serviceexception;
    }

    public static ContactsUploadState a(int i, int l, int i1)
    {
        return new ContactsUploadState(k.RUNNING, i, l, i1, null, null);
    }

    public static ContactsUploadState a(ContactsUploadState contactsuploadstate, OperationResult operationresult)
    {
        return new ContactsUploadState(k.SUCCEEDED, contactsuploadstate.b(), contactsuploadstate.c(), contactsuploadstate.d(), operationresult, null);
    }

    public static ContactsUploadState a(ContactsUploadState contactsuploadstate, ServiceException serviceexception)
    {
        return new ContactsUploadState(k.FAILED, contactsuploadstate.b(), contactsuploadstate.c(), contactsuploadstate.d(), null, serviceexception);
    }

    public static ContactsUploadState e()
    {
        return new ContactsUploadState(k.NOT_STARTED, 0, 0, 0, null, null);
    }

    public static ContactsUploadState f()
    {
        return new ContactsUploadState(k.STARTED, 0, 0, 0, null, null);
    }

    public static ContactsUploadState g()
    {
        return new ContactsUploadState(k.FAILED, 0, 0, 0, null, null);
    }

    public k a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ContactsUploadState (").append(a).append(") (processed/matched/total): ").append(b).append("/").append(c).append("/").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeParcelable(e, 0);
        parcel.writeParcelable(f, 0);
    }

}

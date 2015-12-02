// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.server:
//            z, aa

public class FetchThreadListResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    private final FolderName a;
    private final ThreadsCollection b;
    private final es c;
    private final es d;
    private final es e;
    private final FolderCounts f;
    private final NotificationSetting g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private final ev k;
    private final ServiceException l;

    private FetchThreadListResult(Parcel parcel)
    {
        boolean flag1 = true;
        super(parcel);
        a = (FolderName)parcel.readParcelable(com/facebook/orca/threads/FolderName.getClassLoader());
        b = (ThreadsCollection)parcel.readParcelable(com/facebook/orca/threads/ThreadsCollection.getClassLoader());
        c = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        f = (FolderCounts)parcel.readParcelable(com/facebook/orca/threads/FolderCounts.getClassLoader());
        g = (NotificationSetting)parcel.readParcelable(com/facebook/orca/notify/NotificationSetting.getClassLoader());
        d = es.a(parcel.createStringArrayList());
        e = es.a(parcel.createStringArrayList());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        i = parcel.readLong();
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j = flag;
        k = (ev)parcel.readSerializable();
        l = (ServiceException)parcel.readParcelable(com/facebook/fbservice/service/ServiceException.getClassLoader());
    }

    FetchThreadListResult(Parcel parcel, z z1)
    {
        this(parcel);
    }

    FetchThreadListResult(aa aa1)
    {
        super(aa1.a(), aa1.j());
        Preconditions.checkNotNull(aa1.a());
        a = aa1.b();
        b = aa1.c();
        c = es.a(aa1.d());
        d = es.a(aa1.e());
        e = es.a(aa1.f());
        f = aa1.g();
        g = aa1.h();
        h = aa1.i();
        i = aa1.k();
        j = aa1.l();
        ev ev1;
        if (aa1.m() != null)
        {
            ev1 = ev.a(aa1.m());
        } else
        {
            ev1 = null;
        }
        k = ev1;
        l = aa1.n();
    }

    public static FetchThreadListResult a(FolderName foldername)
    {
        return newBuilder().a(b.NO_DATA).a(foldername).o();
    }

    public static aa newBuilder()
    {
        return new aa();
    }

    public FolderName a()
    {
        return a;
    }

    public ThreadsCollection b()
    {
        return b;
    }

    public es c()
    {
        return c;
    }

    public es d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public es g()
    {
        return e;
    }

    public FolderCounts h()
    {
        return f;
    }

    public NotificationSetting i()
    {
        return g;
    }

    public boolean j()
    {
        return h;
    }

    public long k()
    {
        return i;
    }

    public boolean l()
    {
        return j;
    }

    public ev m()
    {
        return k;
    }

    public ServiceException n()
    {
        return l;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        super.writeToParcel(parcel, i1);
        parcel.writeParcelable(a, i1);
        parcel.writeParcelable(b, i1);
        parcel.writeList(c);
        parcel.writeParcelable(f, i1);
        parcel.writeParcelable(g, i1);
        parcel.writeStringList(d);
        parcel.writeStringList(e);
        int j1;
        if (h)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeLong(i);
        if (j)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeSerializable(k);
        parcel.writeParcelable(l, i1);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.m;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.server:
//            s, FetchThreadParams, ThreadCriteria

public class FetchMultipleThreadsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    private final FolderName a;
    private final es b;

    private FetchMultipleThreadsParams(Parcel parcel)
    {
        a = (FolderName)parcel.readParcelable(com/facebook/orca/threads/FolderName.getClassLoader());
        b = es.a(parcel.readArrayList(com/facebook/orca/server/FetchThreadParams.getClassLoader()));
    }

    FetchMultipleThreadsParams(Parcel parcel, s s1)
    {
        this(parcel);
    }

    public FetchMultipleThreadsParams(FolderName foldername, es es1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (foldername == FolderName.b || foldername == FolderName.d || foldername == FolderName.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (es1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (foldername == FolderName.b)
        {
            a(es1);
        } else
        if (foldername == FolderName.d)
        {
            b(es1);
        } else
        {
            c(es1);
        }
        a = foldername;
        b = es1;
    }

    private void a(es es1)
    {
        for (es1 = es1.iterator(); es1.hasNext();)
        {
            ThreadCriteria threadcriteria = ((FetchThreadParams)es1.next()).a();
            if (threadcriteria.b() != null)
            {
                boolean flag;
                if (threadcriteria.b().a() == n.FACEBOOK)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
            } else
            {
                boolean flag1;
                if (!m.g(threadcriteria.a()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkArgument(flag1);
            }
        }

    }

    private void b(es es1)
    {
        for (es1 = es1.iterator(); es1.hasNext();)
        {
            ThreadCriteria threadcriteria = ((FetchThreadParams)es1.next()).a();
            if (threadcriteria.b() != null)
            {
                boolean flag;
                if (threadcriteria.b().a() == n.PHONE_NUMBER)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
            } else
            {
                Preconditions.checkArgument(m.g(threadcriteria.a()));
            }
        }

    }

    private void c(es es1)
    {
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            Object obj = ((FetchThreadParams)es1.next()).a();
            if (((ThreadCriteria) (obj)).b() != null)
            {
                obj = ((ThreadCriteria) (obj)).b().a();
                boolean flag;
                if (obj == n.PHONE_NUMBER || obj == n.FACEBOOK)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
            }
        } while (true);
    }

    public FolderName a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeList(b);
    }

}

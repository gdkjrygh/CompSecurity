// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.server:
//            az

public class ThreadCriteria
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new az();
    private final String a;
    private final UserKey b;
    private final es c;

    private ThreadCriteria(Parcel parcel)
    {
        a = parcel.readString();
        b = UserKey.a(parcel.readString());
        parcel = parcel.readArrayList(java/lang/String.getClassLoader());
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            parcel = es.a(parcel);
        }
        c = parcel;
    }

    ThreadCriteria(Parcel parcel, az az1)
    {
        this(parcel);
    }

    private ThreadCriteria(String s, UserKey userkey, es es1)
    {
        boolean flag = true;
        super();
        int i;
        int j;
        if (s != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (userkey != null)
        {
            i = j + 1;
        }
        j = i;
        if (es1 != null)
        {
            j = i + 1;
        }
        if (j != 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = s;
        b = userkey;
        c = es1;
    }

    public static ThreadCriteria a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            return a(threadviewspec.d());
        }
        if (threadviewspec.b())
        {
            threadviewspec = UserKey.a(threadviewspec.f());
            if (threadviewspec == null)
            {
                throw new IllegalArgumentException("Unknown type of identifier");
            } else
            {
                return a(((UserKey) (threadviewspec)));
            }
        } else
        {
            throw new IllegalArgumentException("Empty thread view spec");
        }
    }

    public static ThreadCriteria a(UserKey userkey)
    {
        return new ThreadCriteria(null, userkey, null);
    }

    public static ThreadCriteria a(es es1)
    {
        return new ThreadCriteria(null, null, es1);
    }

    public static ThreadCriteria a(String s)
    {
        return new ThreadCriteria(s, null, null);
    }

    public String a()
    {
        return a;
    }

    public UserKey b()
    {
        return b;
    }

    public es c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ThreadCriteria)obj;
            if (a == null ? ((ThreadCriteria) (obj)).a != null : !a.equals(((ThreadCriteria) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((ThreadCriteria) (obj)).b != null : !b.equals(((ThreadCriteria) (obj)).b))
            {
                return false;
            }
            if (c == null ? ((ThreadCriteria) (obj)).c != null : !c.equals(((ThreadCriteria) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        String s;
        if (b != null)
        {
            s = b.c();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeList(c);
    }

}

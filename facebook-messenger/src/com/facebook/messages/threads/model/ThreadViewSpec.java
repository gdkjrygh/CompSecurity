// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.analytics.cb;
import com.facebook.common.w.n;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserIdentifierKey;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.messages.threads.model:
//            a, b

public class ThreadViewSpec
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final ThreadViewSpec a = new ThreadViewSpec();
    private final String b;
    private final RecipientInfo c;
    private volatile b d;

    private ThreadViewSpec()
    {
        b = null;
        c = null;
    }

    private ThreadViewSpec(Parcel parcel)
    {
        b = parcel.readString();
        c = (RecipientInfo)parcel.readParcelable(com/facebook/user/RecipientInfo.getClassLoader());
    }

    ThreadViewSpec(Parcel parcel, a a1)
    {
        this(parcel);
    }

    private ThreadViewSpec(RecipientInfo recipientinfo)
    {
        b = null;
        c = recipientinfo;
    }

    private ThreadViewSpec(String s)
    {
        b = s;
        c = null;
    }

    public static ThreadViewSpec a(RecipientInfo recipientinfo)
    {
        Preconditions.checkNotNull(recipientinfo);
        return new ThreadViewSpec(recipientinfo);
    }

    public static ThreadViewSpec a(String s)
    {
        Preconditions.checkNotNull(s);
        boolean flag;
        if (!n.a(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new ThreadViewSpec(s);
    }

    public static boolean a(ThreadViewSpec threadviewspec, ThreadViewSpec threadviewspec1)
    {
        b b1 = null;
        if (threadviewspec != null)
        {
            threadviewspec = threadviewspec.h();
        } else
        {
            threadviewspec = null;
        }
        if (threadviewspec1 != null)
        {
            b1 = threadviewspec1.h();
        }
        return Objects.equal(threadviewspec, b1);
    }

    public static ThreadViewSpec b(String s)
    {
        if (s == null)
        {
            return a;
        } else
        {
            return a(s);
        }
    }

    public void a(cb cb1)
    {
        if (a())
        {
            cb1.b("thread_id", d());
        } else
        if (b())
        {
            cb1.b("user_key", f().c().b);
            return;
        }
    }

    public boolean a()
    {
        return b != null;
    }

    public boolean b()
    {
        return c != null;
    }

    public boolean c()
    {
        return this == a;
    }

    public String d()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public RecipientInfo e()
    {
        return c;
    }

    public UserIdentifier f()
    {
        if (c != null)
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    public UserIdentifierKey g()
    {
        UserIdentifier useridentifier = f();
        if (useridentifier != null)
        {
            return useridentifier.c();
        } else
        {
            return null;
        }
    }

    public b h()
    {
        if (d == null)
        {
            d = new b(b, g());
        }
        return d;
    }

    public String toString()
    {
        if (b != null)
        {
            return b;
        }
        if (c != null)
        {
            return c.a().toString();
        } else
        {
            return "<null>";
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeParcelable(c, i);
    }

}

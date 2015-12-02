// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.q;
import com.facebook.contacts.models.a.a;
import com.facebook.user.Name;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.models:
//            b, a, ContactPhone

public class Contact
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.facebook.contacts.models.a();
    public static final Contact a;
    private final String b;
    private final String c;
    private final String d;
    private final Name e;
    private final Name f;
    private final String g;
    private final String h;
    private final String i;
    private final float j;
    private final String k;
    private final es l;
    private final es m;
    private final boolean n;
    private final q o;
    private final boolean p;
    private final a q;
    private final String r;

    private Contact(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = (Name)parcel.readParcelable(com/facebook/user/Name.getClassLoader());
        f = (Name)parcel.readParcelable(com/facebook/user/Name.getClassLoader());
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readFloat();
        k = parcel.readString();
        l = es.a(parcel.readArrayList(com/facebook/contacts/models/ContactPhone.getClassLoader()));
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        o = (q)Enum.valueOf(com/facebook/common/w/q, parcel.readString());
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p = flag;
        q = (a)Enum.valueOf(com/facebook/contacts/models/a/a, parcel.readString());
        r = parcel.readString();
        m = es.a(parcel.readArrayList(java/lang/String.getClassLoader()));
    }

    Contact(Parcel parcel, com.facebook.contacts.models.a a1)
    {
        this(parcel);
    }

    Contact(b b1)
    {
        this(b1.a(), b1.b(), b1.c(), a(b1), b1.e(), b1.i(), b1.j(), b1.k(), b1.l(), b1.m(), b1.n(), b1.o(), b1.p(), b1.q(), b1.r(), b1.s(), b1.t());
    }

    public Contact(String s, String s1, String s2, Name name, Name name1, String s3, String s4, 
            String s5, float f1, String s6, es es1, boolean flag, q q1, boolean flag1, 
            a a1, String s7, es es2)
    {
        b = s;
        c = s1;
        d = s2;
        e = name;
        f = name1;
        g = s3;
        h = s4;
        i = s5;
        j = f1;
        k = s6;
        l = es1;
        n = flag;
        o = q1;
        p = flag1;
        if (a1 == null)
        {
            a1 = a.UNMATCHED;
        }
        q = a1;
        r = s7;
        m = es2;
    }

    private static Name a(b b1)
    {
        if (b1.d() != null)
        {
            return b1.d();
        } else
        {
            return new Name(b1.g(), b1.h(), b1.f());
        }
    }

    public static b newBuilder()
    {
        return new b();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getBigPictureUrl()
    {
        return h;
    }

    public boolean getCanMessage()
    {
        return n;
    }

    public float getCommunicationRank()
    {
        return j;
    }

    public String getContactId()
    {
        return b;
    }

    public a getContactProfileType()
    {
        return q;
    }

    public String getGraphApiWriteId()
    {
        return d;
    }

    public String getHugePictureUrl()
    {
        return i;
    }

    public boolean getIsMemorialized()
    {
        return p;
    }

    public q getIsMobilePushable()
    {
        return o;
    }

    public String getLookupKey()
    {
        return k;
    }

    public Name getName()
    {
        return e;
    }

    public es getNameSearchTokens()
    {
        return m;
    }

    public es getPhones()
    {
        return l;
    }

    public Name getPhoneticName()
    {
        return f;
    }

    public String getProfileFbid()
    {
        return c;
    }

    public String getSmallPictureUrl()
    {
        return g;
    }

    public String getTimelineCoverPhoto()
    {
        return r;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getName()).append(" (phonetic name: ").append(getPhoneticName()).append(") <contactId:").append(getContactId()).append("> <profileFbid:").append(getProfileFbid()).append("> <commRank:").append(getCommunicationRank()).append("> <canMessage:").append(getCanMessage()).append("> ").append("<isMemorialized:").append(p).append(">").append("<contactType:").append(q).append(">").toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeParcelable(e, i1);
        parcel.writeParcelable(f, i1);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeFloat(j);
        parcel.writeString(k);
        parcel.writeList(l);
        if (n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeString(o.toString());
        if (p)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeString(q.toString());
        parcel.writeString(r);
        parcel.writeList(m);
    }

    static 
    {
        a = newBuilder().a(a.UNMATCHED).u();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.logging;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.text.TextUtils;
import fgc;
import fgd;
import fgo;
import fhb;
import java.util.Locale;
import java.util.UUID;

public class SearchIntentSessionTracker
    implements Parcelable, fgc
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            ParcelUuid parceluuid = (ParcelUuid)parcel.readParcelable(java/util/UUID.getClassLoader());
            int i = parcel.readInt();
            String s = parcel.readString();
            if (parceluuid != null)
            {
                parcel = parceluuid.getUuid();
            } else
            {
                parcel = null;
            }
            return new SearchIntentSessionTracker(parcel, i, s, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SearchIntentSessionTracker[i];
        }

    };
    public final fhb a;
    final fgo b;
    public final fgd c;
    public UUID d;
    int e;
    private String f;

    public SearchIntentSessionTracker()
    {
        a = new fhb() {

            private SearchIntentSessionTracker a;

            public final void a(String s)
            {
                SearchIntentSessionTracker searchintentsessiontracker;
                String s1;
                boolean flag1;
                flag1 = true;
                searchintentsessiontracker = a;
                s1 = SearchIntentSessionTracker.a(a);
                if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
                if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
                if (flag1)
                {
                    a.a();
                }
                SearchIntentSessionTracker.a(a, s);
                s = a;
                int i;
                boolean flag;
                int j;
                if (((SearchIntentSessionTracker) (s)).d == null)
                {
                    throw new IllegalStateException("Session is not started yet!");
                } else
                {
                    s.e = ((SearchIntentSessionTracker) (s)).e + 1;
                    return;
                }
_L4:
                i = s1.codePointAt(0);
                j = s.codePointAt(0);
                if (i != j && searchintentsessiontracker.b.a(i) != searchintentsessiontracker.b.a(j) || s1.trim().length() != 2 && s.trim().length() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag) goto _L3; else goto _L2
_L2:
                flag1 = false;
                  goto _L3
            }

            public final void a(boolean flag)
            {
            }

            public final void b(String s)
            {
            }

            
            {
                a = SearchIntentSessionTracker.this;
                super();
            }
        };
        b = new fgo(Locale.getDefault());
        c = new fgd((byte)0);
        e = -1;
    }

    private SearchIntentSessionTracker(UUID uuid, int i, String s)
    {
        a = new _cls1();
        b = new fgo(Locale.getDefault());
        c = new fgd((byte)0);
        e = -1;
        d = uuid;
        e = i;
        f = s;
    }

    SearchIntentSessionTracker(UUID uuid, int i, String s, byte byte0)
    {
        this(uuid, i, s);
    }

    static String a(SearchIntentSessionTracker searchintentsessiontracker)
    {
        return searchintentsessiontracker.f;
    }

    static String a(SearchIntentSessionTracker searchintentsessiontracker, String s)
    {
        searchintentsessiontracker.f = s;
        return s;
    }

    public final void a()
    {
        String s;
        String s1;
        if (d != null)
        {
            s = d.toString();
        } else
        {
            s = null;
        }
        d = UUID.randomUUID();
        e = -1;
        s1 = d.toString();
        c.a(s, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getCurrentSequenceNumber()
    {
        if (d == null)
        {
            throw new IllegalStateException("Session is not started yet!");
        } else
        {
            return e;
        }
    }

    public String getCurrentSessionId()
    {
        if (d == null)
        {
            throw new IllegalStateException("Session is not started yet!");
        } else
        {
            return d.toString();
        }
    }

    public boolean isSessionAvailable()
    {
        return d != null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelUuid parceluuid;
        if (d != null)
        {
            parceluuid = new ParcelUuid(d);
        } else
        {
            parceluuid = null;
        }
        parcel.writeParcelable(parceluuid, i);
        parcel.writeInt(e);
        parcel.writeString(f);
    }

}

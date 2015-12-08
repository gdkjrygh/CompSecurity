// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ngg
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ngh();
    public String a;
    public String b;
    public int c;
    public boolean d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public nfr r;
    public Class s;
    public Bundle t;
    public List u;

    public ngg()
    {
        b = "com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST";
        c = -1;
        d = true;
        k = -1;
        u = new ArrayList();
    }

    public ngg(Parcel parcel)
    {
        boolean flag1 = true;
        int i1 = 0;
        super();
        b = "com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST";
        c = -1;
        d = true;
        k = -1;
        u = new ArrayList();
        a = parcel.readString();
        b = parcel.readString();
        e = parcel.readString();
        String s1;
        boolean flag;
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (parcel.readInt() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j = flag;
        k = parcel.readInt();
        l = parcel.readString();
        m = parcel.readString();
        n = parcel.readString();
        c = parcel.readInt();
        o = parcel.readString();
        p = parcel.readString();
        q = parcel.readString();
        r = (nfr)parcel.readParcelable(getClass().getClassLoader());
        s1 = parcel.readString();
        t = parcel.readBundle();
        parcel = parcel.createStringArray();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        s = Class.forName(s1);
        if (parcel.length <= 0)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        u = new ArrayList(parcel.length);
_L1:
        if (i1 >= parcel.length)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        u.add(Class.forName(parcel[i1]));
        i1++;
          goto _L1
        parcel;
        if (Log.isLoggable("LoginRequest", 6))
        {
            Log.e("LoginRequest", "Could not deserialize class", parcel);
        }
    }

    public final ngg a(Context context, Intent intent)
    {
        String s1;
        Object obj;
        k = intent.getIntExtra("account_id", -1);
        context = ((lvm)olm.a(context, lvm)).a(context, intent);
        if (context != null)
        {
            l = ((lvn) (context)).a;
            m = ((lvn) (context)).b;
        }
        s1 = intent.getStringExtra("viewerid");
        obj = null;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("effectiveid");
        intent = s1;
_L4:
        if (intent != null)
        {
            n = intent;
            m = context;
        }
        return this;
_L2:
        Uri uri;
        uri = intent.getData();
        context = obj;
        intent = s1;
        if (uri == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = s1;
        s1 = uri.getQueryParameter("viewerid");
        context = obj;
        intent = s1;
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = s1;
        context = uri.getQueryParameter("effectiveid");
        intent = s1;
        continue; /* Loop/switch isn't completed */
        context;
        context = obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ngg a(Class class1, Bundle bundle)
    {
        s = class1;
        t = bundle;
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag1 = true;
        boolean flag = false;
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(e);
        String as[];
        Iterator iterator;
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (g)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (h)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (i)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (j)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeInt(k);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeInt(c);
        parcel.writeString(o);
        parcel.writeString(p);
        parcel.writeString(q);
        parcel.writeParcelable(r, 0);
        if (s != null)
        {
            as = s.getName();
        } else
        {
            as = null;
        }
        parcel.writeString(as);
        parcel.writeBundle(t);
        as = new String[u.size()];
        iterator = u.iterator();
        for (i1 = ((flag) ? 1 : 0); iterator.hasNext(); i1++)
        {
            as[i1] = ((Class)iterator.next()).getName();
        }

        parcel.writeStringArray(as);
    }

}

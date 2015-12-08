// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jg, jh

public final class jf
    implements SafeParcelable, ji.b
{
    public static final class a
        implements SafeParcelable
    {

        public static final jh CREATOR = new jh();
        final String Mw;
        final int Mx;
        final int versionCode;

        public int describeContents()
        {
            jh jh1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            jh jh1 = CREATOR;
            jh.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            Mw = s;
            Mx = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            Mw = s;
            Mx = i;
        }
    }


    public static final jg CREATOR = new jg();
    private final int BR;
    private final HashMap Mt;
    private final HashMap Mu;
    private final ArrayList Mv;

    public jf()
    {
        BR = 1;
        Mt = new HashMap();
        Mu = new HashMap();
        Mv = null;
    }

    jf(int i, ArrayList arraylist)
    {
        BR = i;
        Mt = new HashMap();
        Mu = new HashMap();
        Mv = null;
        b(arraylist);
    }

    private void b(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); h(a1.Mw, a1.Mx))
        {
            a1 = (a)arraylist.next();
        }

    }

    public String a(Integer integer)
    {
        String s = (String)Mu.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (Mt.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public Object convertBack(Object obj)
    {
        return a((Integer)obj);
    }

    public int describeContents()
    {
        jg jg1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return BR;
    }

    public jf h(String s, int i)
    {
        Mt.put(s, Integer.valueOf(i));
        Mu.put(Integer.valueOf(i), s);
        return this;
    }

    ArrayList hc()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = Mt.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)Mt.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int hd()
    {
        return 7;
    }

    public int he()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jg jg1 = CREATOR;
        jg.a(this, parcel, i);
    }

}

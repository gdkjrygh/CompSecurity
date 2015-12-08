// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            km

public final class jw
{
    public static final class a
        implements SafeParcelable
    {

        public static final km CREATOR = new km();
        private final String Fl;
        private final List ST;
        private final int Su;
        private final String Sw;
        private final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final String getAccountName()
        {
            return Fl;
        }

        public final int getVersionCode()
        {
            return mVersionCode;
        }

        public final int iG()
        {
            return Su;
        }

        public final List iH()
        {
            return new ArrayList(ST);
        }

        public final String iJ()
        {
            return Sw;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            km.a(this, parcel, i);
        }


        a(int i, String s, List list, int j, String s1)
        {
            ST = new ArrayList();
            mVersionCode = i;
            Fl = s;
            ST.addAll(list);
            Su = j;
            Sw = s1;
        }

        public a(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }


    private final View Sv;
    private final a VA;

    public jw(String s, Collection collection, int i, View view, String s1)
    {
        VA = new a(s, collection, i, s1);
        Sv = view;
    }

    public final String getAccountName()
    {
        return VA.getAccountName();
    }

    public final List iH()
    {
        return VA.iH();
    }

    public final String iJ()
    {
        return VA.iJ();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            ParcelableClientSettingsCreator

public final class ClientSettings
{
    public static final class ParcelableClientSettings
        implements SafeParcelable
    {

        public static final ParcelableClientSettingsCreator CREATOR = new ParcelableClientSettingsCreator();
        private final int BR;
        private final String Dd;
        private final int IK;
        private final String IM;
        private final List Jk;

        public int describeContents()
        {
            return 0;
        }

        public String getAccountName()
        {
            return Dd;
        }

        public String getAccountNameOrDefault()
        {
            if (Dd != null)
            {
                return Dd;
            } else
            {
                return "<<default account>>";
            }
        }

        public int getGravityForPopups()
        {
            return IK;
        }

        public String getRealClientPackageName()
        {
            return IM;
        }

        public List getScopes()
        {
            return new ArrayList(Jk);
        }

        public int getVersionCode()
        {
            return BR;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ParcelableClientSettingsCreator.a(this, parcel, i);
        }


        ParcelableClientSettings(int i, String s, List list, int j, String s1)
        {
            Jk = new ArrayList();
            BR = i;
            Dd = s;
            Jk.addAll(list);
            IK = j;
            IM = s1;
        }

        public ParcelableClientSettings(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }


    private final View IL;
    private final ParcelableClientSettings Ls;

    public ClientSettings(String s, Collection collection, int i, View view, String s1)
    {
        Ls = new ParcelableClientSettings(s, collection, i, s1);
        IL = view;
    }

    public String getAccountName()
    {
        return Ls.getAccountName();
    }

    public String getAccountNameOrDefault()
    {
        return Ls.getAccountNameOrDefault();
    }

    public int getGravityForPopups()
    {
        return Ls.getGravityForPopups();
    }

    public ParcelableClientSettings getParcelableClientSettings()
    {
        return Ls;
    }

    public String getRealClientPackageName()
    {
        return Ls.getRealClientPackageName();
    }

    public List getScopes()
    {
        return Ls.getScopes();
    }

    public String[] getScopesArray()
    {
        return (String[])Ls.getScopes().toArray(new String[0]);
    }

    public View getViewForPopups()
    {
        return IL;
    }
}

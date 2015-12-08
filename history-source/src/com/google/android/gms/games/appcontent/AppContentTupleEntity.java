// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTuple, AppContentTupleEntityCreator

public final class AppContentTupleEntity
    implements SafeParcelable, AppContentTuple
{

    public static final AppContentTupleEntityCreator CREATOR = new AppContentTupleEntityCreator();
    private final int CK;
    private final String mName;
    private final String mValue;

    AppContentTupleEntity(int i, String s, String s1)
    {
        CK = i;
        mName = s;
        mValue = s1;
    }

    public AppContentTupleEntity(AppContentTuple appcontenttuple)
    {
        CK = 1;
        mName = appcontenttuple.getName();
        mValue = appcontenttuple.getValue();
    }

    static int a(AppContentTuple appcontenttuple)
    {
        return jv.hashCode(new Object[] {
            appcontenttuple.getName(), appcontenttuple.getValue()
        });
    }

    static boolean a(AppContentTuple appcontenttuple, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentTuple) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontenttuple == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentTuple)obj;
        if (!jv.equal(((AppContentTuple) (obj)).getName(), appcontenttuple.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppContentTuple) (obj)).getValue(), appcontenttuple.getValue())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppContentTuple appcontenttuple)
    {
        return jv.h(appcontenttuple).a("Name", appcontenttuple.getName()).a("Value", appcontenttuple.getValue()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return ld();
    }

    public String getName()
    {
        return mName;
    }

    public String getValue()
    {
        return mValue;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public AppContentTuple ld()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentTupleEntityCreator.a(this, parcel, i);
    }

}

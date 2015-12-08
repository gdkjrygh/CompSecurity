// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.os.Parcelable;

// Referenced classes of package com.accuweather.android.views:
//            SimpleSearchView

public static interface 
    extends Parcelable
{

    public abstract void onQueryChanged(String s);

    public abstract void onSearch(String s);

    public abstract void onSearchItemSelected(int i, Object obj);
}

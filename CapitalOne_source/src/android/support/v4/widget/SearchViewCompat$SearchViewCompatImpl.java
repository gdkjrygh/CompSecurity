// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompat

static interface mpat
{

    public abstract Object newOnQueryTextListener(mpat mpat);

    public abstract View newSearchView(Context context);

    public abstract void setOnQueryTextListener(Object obj, Object obj1);
}

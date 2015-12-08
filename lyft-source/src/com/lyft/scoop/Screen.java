// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package com.lyft.scoop:
//            Utils

public class Screen
{

    private transient SparseArray viewState;

    public Screen()
    {
        viewState = new SparseArray();
    }

    public boolean equals(Object obj)
    {
        return obj != null && (obj instanceof Screen) && getName().equals(((Screen)obj).getName());
    }

    public String getName()
    {
        return Utils.a(this).getName();
    }

    public SparseArray getViewState()
    {
        return viewState;
    }

    public int hashCode()
    {
        return getName().hashCode();
    }

    public void restoreViewState(View view)
    {
        view.restoreHierarchyState(viewState);
    }

    public void saveViewState(View view)
    {
        SparseArray sparsearray = new SparseArray();
        view.saveHierarchyState(sparsearray);
        viewState = sparsearray;
    }

    public void setViewState(SparseArray sparsearray)
    {
        viewState = sparsearray;
    }
}

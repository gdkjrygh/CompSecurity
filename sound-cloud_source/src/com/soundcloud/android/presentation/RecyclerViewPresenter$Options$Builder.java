// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;


// Referenced classes of package com.soundcloud.android.presentation:
//            RecyclerViewPresenter

public static class 
{

    private Class layoutManagerClass;
    private int numColumns;
    private boolean useDividers;
    private boolean useItemClickListener;

    private  withLayoutManager(Class class1)
    {
        layoutManagerClass = class1;
        return this;
    }

    public layoutManagerClass build()
    {
        return new layoutManagerClass(useDividers, useItemClickListener, layoutManagerClass, numColumns, null);
    }

    public numColumns columns(int i)
    {
        numColumns = i;
        return this;
    }

    public numColumns useDividers()
    {
        useDividers = true;
        return this;
    }

    public useDividers useItemClickListener()
    {
        useItemClickListener = true;
        return this;
    }


    public ()
    {
    }
}

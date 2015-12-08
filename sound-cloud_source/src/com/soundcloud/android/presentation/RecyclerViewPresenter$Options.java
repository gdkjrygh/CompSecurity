// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

// Referenced classes of package com.soundcloud.android.presentation:
//            RecyclerViewPresenter

public static class <init>
{
    public static class Builder
    {

        private Class layoutManagerClass;
        private int numColumns;
        private boolean useDividers;
        private boolean useItemClickListener;

        private Builder withLayoutManager(Class class1)
        {
            layoutManagerClass = class1;
            return this;
        }

        public RecyclerViewPresenter.Options build()
        {
            return new RecyclerViewPresenter.Options(useDividers, useItemClickListener, layoutManagerClass, numColumns, null);
        }

        public Builder columns(int i)
        {
            numColumns = i;
            return this;
        }

        public Builder useDividers()
        {
            useDividers = true;
            return this;
        }

        public Builder useItemClickListener()
        {
            useItemClickListener = true;
            return this;
        }


        public Builder()
        {
        }
    }


    private final Class layoutManagerClass;
    private final int numColumns;
    private final boolean useDividers;
    private final boolean useItemClickListener;

    public static Builder custom()
    {
        return new Builder();
    }

    public static Builder defaults()
    {
        return (new Builder()).build();
    }

    public static Builder grid(int i)
    {
        return (new Builder()).withLayoutManager(android/support/v7/widget/GridLayoutManager).columns(i).useDividers().useItemClickListener();
    }

    public static Builder list()
    {
        return (new Builder()).withLayoutManager(android/support/v7/widget/LinearLayoutManager).useDividers().useItemClickListener();
    }





    private Builder(boolean flag, boolean flag1, Class class1, int i)
    {
        useDividers = flag;
        useItemClickListener = flag1;
        layoutManagerClass = class1;
        numColumns = i;
    }

    numColumns(boolean flag, boolean flag1, Class class1, int i, numColumns numcolumns)
    {
        this(flag, flag1, class1, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.util.List;

public interface ObservableList
    extends List
{
    public static abstract class OnListChangedCallback
    {

        public abstract void onChanged(ObservableList observablelist);

        public abstract void onItemRangeChanged(ObservableList observablelist, int i, int j);

        public abstract void onItemRangeInserted(ObservableList observablelist, int i, int j);

        public abstract void onItemRangeMoved(ObservableList observablelist, int i, int j, int k);

        public abstract void onItemRangeRemoved(ObservableList observablelist, int i, int j);

        public OnListChangedCallback()
        {
        }
    }


    public abstract void addOnListChangedCallback(OnListChangedCallback onlistchangedcallback);

    public abstract void removeOnListChangedCallback(OnListChangedCallback onlistchangedcallback);
}

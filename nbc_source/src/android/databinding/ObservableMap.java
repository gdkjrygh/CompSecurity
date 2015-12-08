// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.util.Map;

public interface ObservableMap
    extends Map
{
    public static abstract class OnMapChangedCallback
    {

        public abstract void onMapChanged(ObservableMap observablemap, Object obj);

        public OnMapChangedCallback()
        {
        }
    }


    public abstract void addOnMapChangedCallback(OnMapChangedCallback onmapchangedcallback);

    public abstract void removeOnMapChangedCallback(OnMapChangedCallback onmapchangedcallback);
}

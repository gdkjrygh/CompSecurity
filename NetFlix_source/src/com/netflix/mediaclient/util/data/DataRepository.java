// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.data;


public interface DataRepository
{
    public static interface DataLoadedCallback
    {

        public abstract void onDataLoaded(String s, byte abyte0[], long l);
    }

    public static interface Entry
    {

        public abstract String getKey();

        public abstract long getSizeInBytes();

        public abstract long getTs();
    }

    public static interface LoadedCallback
    {

        public abstract void onLoaded(Entry aentry[]);
    }


    public abstract void clear();

    public abstract Entry[] getEntries();

    public abstract void load(String s, DataLoadedCallback dataloadedcallback);

    public abstract void loadAll(LoadedCallback loadedcallback);

    public abstract void remove(String s);

    public abstract String save(String s, byte abyte0[]);
}

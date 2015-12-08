// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;


public interface PlaySearchListener
{

    public abstract void onModeChanged(int i);

    public abstract void onQueryChanged$505cbf4b(String s);

    public abstract void onSearch$552c4e01();

    public abstract void onSuggestionClicked$299d808f();
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.support.v4.app.l;
import android.support.v4.app.r;
import android.view.LayoutInflater;
import android.view.MenuInflater;

public interface ActivityComponent
{

    public abstract Activity activity();

    public abstract FragmentManager fragmentManager();

    public abstract LayoutInflater layoutInflater();

    public abstract LoaderManager loaderManager();

    public abstract MenuInflater menuInflater();

    public abstract l supportFragmentManager();

    public abstract r supportLoaderManager();
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.view.View;

// Referenced classes of package com.android.ex.photo:
//            PhotoViewController, ActionBarInterface

public static interface 
{

    public abstract View findViewById(int i);

    public abstract void finish();

    public abstract ActionBarInterface getActionBarInterface();

    public abstract Context getApplicationContext();

    public abstract Context getContext();

    public abstract PhotoViewController getController();

    public abstract Intent getIntent();

    public abstract Resources getResources();

    public abstract FragmentManager getSupportFragmentManager();

    public abstract LoaderManager getSupportLoaderManager();

    public abstract void overridePendingTransition(int i, int j);

    public abstract void setContentView(int i);
}

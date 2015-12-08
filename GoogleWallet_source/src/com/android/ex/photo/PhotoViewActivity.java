// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package com.android.ex.photo:
//            PhotoViewController, ActionBarInterface

public class PhotoViewActivity extends ActionBarActivity
    implements PhotoViewController.ActivityInterface
{

    private ActionBarInterface mActionBar$2a949eba;
    private PhotoViewController mController;

    public PhotoViewActivity()
    {
    }

    protected PhotoViewController createController()
    {
        return new PhotoViewController(this);
    }

    public final ActionBarInterface getActionBarInterface()
    {
        if (mActionBar$2a949eba == null)
        {
            mActionBar$2a949eba = new ActionBarInterface(getSupportActionBar());
        }
        return mActionBar$2a949eba;
    }

    public final Context getContext()
    {
        return this;
    }

    public final PhotoViewController getController()
    {
        return mController;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        intent = mController;
    }

    public void onBackPressed()
    {
        if (!mController.onBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mController = createController();
        mController.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        PhotoViewController photoviewcontroller = mController;
        return PhotoViewController.onCreateOptionsMenu(menu) || super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        mController.onDestroy();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return mController.onOptionsItemSelected(menuitem) || super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        mController.onPause();
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        PhotoViewController photoviewcontroller = mController;
        return PhotoViewController.onPrepareOptionsMenu(menu) || super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        mController.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mController.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        PhotoViewController photoviewcontroller = mController;
    }

    protected void onStop()
    {
        PhotoViewController photoviewcontroller = mController;
        super.onStop();
    }
}

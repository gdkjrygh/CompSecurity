// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

public class BaseListActivity extends ActionBarActivity
{

    public BaseListActivity()
    {
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        if (AbsDrawerActivity.b())
        {
            AbsDrawerActivity.a(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AbsDrawerActivity.b(true);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        f.c(this);
    }

    protected void onStart()
    {
        super.onStart();
        f.a(this, k.a(this));
        f.a(getIntent());
        f.b(getIntent());
    }

    protected void onStop()
    {
        super.onStop();
        f.b(this, k.a(this));
    }

    public void startManagingCursor(Cursor cursor)
    {
        if (cursor == null)
        {
            try
            {
                throw new NullPointerException("Managing null cursor");
            }
            catch (NullPointerException nullpointerexception)
            {
                f.a(nullpointerexception);
            }
        }
        super.startManagingCursor(cursor);
    }
}

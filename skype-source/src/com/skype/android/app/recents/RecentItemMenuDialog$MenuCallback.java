// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.view.Menu;
import android.view.MenuItem;
import com.skype.ObjectInterface;

// Referenced classes of package com.skype.android.app.recents:
//            RecentItemMenuDialog

public static interface 
{

    public abstract boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface);

    public abstract void onCreateContextMenu(Menu menu, ObjectInterface objectinterface);
}

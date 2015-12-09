// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.quests;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination.quests:
//            CompletedQuestFragment

public final class CompletedQuestListActivity extends DestinationFragmentActivity
{

    public CompletedQuestListActivity()
    {
        super(0x7f040056, 0x7f120013, true);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(0x7f1000c2);
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0d0050)
        {
            ((CompletedQuestFragment)super.mFragments.findFragmentById(0x7f0d0148)).refresh(true);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}

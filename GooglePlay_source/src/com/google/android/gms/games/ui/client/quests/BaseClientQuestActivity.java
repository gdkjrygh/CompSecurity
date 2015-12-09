// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.quests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.quests.BaseQuestFragment;
import com.google.android.gms.games.ui.common.quests.QuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestUiConfiguration;

// Referenced classes of package com.google.android.gms.games.ui.client.quests:
//            ClientQuestInboxHelper

public abstract class BaseClientQuestActivity extends ClientFragmentActivity
    implements com.google.android.gms.games.ui.common.quests.QuestInboxHelper.QuestInboxHelperProvider, QuestUiConfiguration
{

    private int mFragmentResId;
    private BaseQuestFragment mQuestFragment;
    private ClientQuestInboxHelper mQuestInboxHelper;
    private int mTitleResId;

    public BaseClientQuestActivity(int i, int j, int k)
    {
        super(i, 0x7f120004, true, true);
        mFragmentResId = j;
        mTitleResId = k;
        mQuestInboxHelper = new ClientQuestInboxHelper(this);
    }

    public final QuestInboxHelper getQuestInboxHelper()
    {
        return mQuestInboxHelper;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(mTitleResId);
        mShowGameNameAsTitle = false;
        mQuestFragment = (BaseQuestFragment)super.mFragments.findFragmentById(mFragmentResId);
        mQuestFragment.enableSwipeToRefresh();
        parseIntent(getIntent());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0d0050)
        {
            mQuestFragment.refresh(true);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void parseIntent(Intent intent)
    {
    }

    public final boolean useActionBarProgressBar()
    {
        return true;
    }

    public final boolean useFixedHeightQuestTiles()
    {
        return false;
    }
}

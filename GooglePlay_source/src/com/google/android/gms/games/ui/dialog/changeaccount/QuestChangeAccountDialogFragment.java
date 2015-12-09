// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog.changeaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.quest.Quest;

// Referenced classes of package com.google.android.gms.games.ui.dialog.changeaccount:
//            ChangeAccountDialogFragment

public final class QuestChangeAccountDialogFragment extends ChangeAccountDialogFragment
{
    public static interface QuestAccountSwitcher
    {

        public abstract void switchAccountForQuest(Quest quest);
    }

    public static interface QuestAccountSwitcherProvider
    {

        public abstract QuestAccountSwitcher getQuestAccountSwitcher();
    }


    public QuestChangeAccountDialogFragment()
    {
    }

    public static Bundle createArgs(String s, String s1, Quest quest)
    {
        quest = (Quest)quest.freeze();
        Bundle bundle = new Bundle();
        bundle.putParcelable("quest", quest);
        bundle.putAll(ChangeAccountDialogFragment.createArgs(quest.getGame().getDisplayName(), s, s1));
        return bundle;
    }

    protected final void switchAccount()
    {
        Object obj = super.mActivity;
        Quest quest = (Quest)super.mArguments.getParcelable("quest");
        if (obj instanceof QuestAccountSwitcher)
        {
            obj = (QuestAccountSwitcher)obj;
        } else
        if (obj instanceof QuestAccountSwitcherProvider)
        {
            obj = (QuestAccountSwitcher)Preconditions.checkNotNull(((QuestAccountSwitcherProvider)obj).getQuestAccountSwitcher());
        } else
        {
            throw new IllegalStateException("QuestChangeAccountDialogFragment must be used with a parent Activity which implements QuestAccountSwitcher or QuestAccountSwitcherProvider.");
        }
        ((QuestAccountSwitcher) (obj)).switchAccountForQuest(quest);
    }
}

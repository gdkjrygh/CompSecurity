// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class this._cls0
    implements Action1
{

    final InviteScreenView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (!contactsAdapter.isEmpty()) goto _L2; else goto _L1
_L1:
        int i = 0;
_L3:
        int j;
        try
        {
            unit = (android.widget.arams)headerView.getLayoutParams();
            unit.height = i;
            headerView.setLayoutParams(unit);
            heroContainer.setVisibility(0);
            unit = (android.widget.arams)contactsListEmptyView.getLayoutParams();
            unit.topMargin = heroContainer.getHeight();
            contactsListEmptyView.setLayoutParams(unit);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Unit unit)
        {
            L.e(unit, "initHeroViewPaddingRunnable", new Object[0]);
        }
        break MISSING_BLOCK_LABEL_136;
_L2:
        i = heroContainer.getHeight();
        j = headerView.getHeight();
        i += j;
          goto _L3
    }

    ()
    {
        this$0 = InviteScreenView.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.view.Menu;
import android.view.MenuItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.likes:
//            LikesMenuPresenter

private final class menu extends DefaultSubscriber
{

    private final Menu menu;
    final LikesMenuPresenter this$0;

    private void showOfflineDownloadOption(Menu menu1)
    {
        menu1.findItem(0x7f0f02b7).setVisible(true);
        menu1.findItem(0x7f0f02b8).setVisible(false);
    }

    private void showOfflineRemovalOption(Menu menu1)
    {
        menu1.findItem(0x7f0f02b7).setVisible(false);
        menu1.findItem(0x7f0f02b8).setVisible(true);
    }

    public final void onNext(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            showOfflineRemovalOption(menu);
            return;
        } else
        {
            showOfflineDownloadOption(menu);
            return;
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Boolean)obj);
    }

    (Menu menu1)
    {
        this$0 = LikesMenuPresenter.this;
        super();
        menu = menu1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ScrollView;
import java.util.TimerTask;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment

final class direction extends TimerTask
{

    int direction;
    final AboutCreditsFragment this$0;

    public final void run()
    {
        getActivity().runOnUiThread(new Runnable() {

            final AboutCreditsFragment._cls1 this$1;

            public final void run()
            {
                AboutCreditsFragment.access$000(this$0).scrollTo(0, AboutCreditsFragment.access$000(this$0).getScrollY() + direction);
                if (AboutCreditsFragment.access$000(this$0).getChildAt(AboutCreditsFragment.access$000(this$0).getChildCount() - 1).getBottom() - AboutCreditsFragment.access$000(this$0).getHeight() <= AboutCreditsFragment.access$000(this$0).getScrollY())
                {
                    direction = -1;
                } else
                if (AboutCreditsFragment.access$000(this$0).getScrollY() == 0)
                {
                    direction = 1;
                    return;
                }
            }

            
            {
                this$1 = AboutCreditsFragment._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = AboutCreditsFragment.this;
        super();
        direction = 1;
    }
}

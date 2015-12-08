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

final class this._cls1
    implements Runnable
{

    final rection this$1;

    public final void run()
    {
        AboutCreditsFragment.access$000(_fld0).scrollTo(0, AboutCreditsFragment.access$000(_fld0).getScrollY() + rection);
        if (AboutCreditsFragment.access$000(_fld0).getChildAt(AboutCreditsFragment.access$000(_fld0).getChildCount() - 1).getBottom() - AboutCreditsFragment.access$000(_fld0).getHeight() <= AboutCreditsFragment.access$000(_fld0).getScrollY())
        {
            rection = -1;
        } else
        if (AboutCreditsFragment.access$000(_fld0).getScrollY() == 0)
        {
            rection = 1;
            return;
        }
    }

    rection()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/settings/AboutCreditsFragment$1

/* anonymous class */
    final class AboutCreditsFragment._cls1 extends TimerTask
    {

        int direction;
        final AboutCreditsFragment this$0;

        public final void run()
        {
            getActivity().runOnUiThread(new AboutCreditsFragment._cls1._cls1());
        }

            
            {
                this$0 = AboutCreditsFragment.this;
                super();
                direction = 1;
            }
    }

}

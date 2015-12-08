// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.widget.Button;
import java.util.ArrayList;
import me.lyft.android.IUserSession;
import me.lyft.android.controls.AdvancedTextView;
import me.lyft.android.infrastructure.ats.DriverApplicationDataDTO;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeLyftDriverView

class this._cls0
    implements Action1
{

    final BecomeLyftDriverView this$0;

    public volatile void call(Object obj)
    {
        call((DialogResult)obj);
    }

    public void call(DialogResult dialogresult)
    {
        if (dialogresult.getSelectedIndex() >= 0)
        {
            DriverApplicationDataDTO driverapplicationdatadto = userSession.getDriverApplicationData();
            ArrayList arraylist = driverapplicationdatadto.getRegionCodes();
            BecomeLyftDriverView.access$502(BecomeLyftDriverView.this, (String)arraylist.get(dialogresult.getSelectedIndex()));
            regionTxt.setText(driverapplicationdatadto.findRegionLabelByCode(BecomeLyftDriverView.access$500(BecomeLyftDriverView.this)));
            goToApplicationButton.setEnabled(true);
            BecomeLyftDriverView.access$202(BecomeLyftDriverView.this, true);
        }
    }

    ataDTO()
    {
        this$0 = BecomeLyftDriverView.this;
        super();
    }
}

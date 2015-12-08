// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.support.design.widget.FloatingActionButton;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.skype.android.widget.ParticipantsDisplayText;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

final class this._cls0
    implements android.view.OnGlobalLayoutListener
{

    final PickerFragment this$0;

    public final void onGlobalLayout()
    {
        participantsScrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (!TextUtils.isEmpty(participantsDisplayText.getText()))
        {
            if (participantsScrollView.getHeight() > PickerFragment.access$100(PickerFragment.this))
            {
                android.view.arams arams = participantsScrollView.getLayoutParams();
                arams.height = PickerFragment.access$100(PickerFragment.this);
                PickerFragment.access$202(PickerFragment.this, PickerFragment.access$100(PickerFragment.this));
                participantsScrollView.setLayoutParams(arams);
            }
            if (floatingActionButton != null)
            {
                floatingActionButton.setScaleX(1.0F);
                floatingActionButton.setScaleY(1.0F);
            }
        }
    }

    on()
    {
        this$0 = PickerFragment.this;
        super();
    }
}

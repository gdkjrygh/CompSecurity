// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import group.pals.android.lib.ui.lockpattern.widget.LockPatternView;
import java.util.List;

// Referenced classes of package group.pals.android.lib.ui.lockpattern:
//            BaseLockPatternActivity

class this._cls0
    implements group.pals.android.lib.ui.lockpattern.widget.istener
{

    final BaseLockPatternActivity this$0;

    public void onPatternCellAdded(List list)
    {
        if (!getString(tString).equals(mBtnConfirm.getText()) || list == null) goto _L2; else goto _L1
_L1:
        .SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[BaseLockPatternActivity.access$400(BaseLockPatternActivity.this).ordinal()];
        JVM INSTR tableswitch 1 1: default 64
    //                   1 65;
           goto _L2 _L3
_L2:
        return;
_L3:
        if (list.size() >= 4)
        {
            BaseLockPatternActivity.access$300(BaseLockPatternActivity.this, mBtnConfirm);
            BaseLockPatternActivity.access$300(BaseLockPatternActivity.this, BaseLockPatternActivity.access$200(BaseLockPatternActivity.this));
        }
        switch (list.size())
        {
        default:
            return;

        case 4: // '\004'
            mDynamicTxtInfo.setText(ngth_msg_4_dots);
            return;

        case 5: // '\005'
            mDynamicTxtInfo.setText(ngth_msg_5_dots);
            return;

        case 6: // '\006'
            mDynamicTxtInfo.setText(ngth_msg_6_dots);
            return;

        case 7: // '\007'
            mDynamicTxtInfo.setText(ngth_msg_7_dots);
            return;

        case 8: // '\b'
            mDynamicTxtInfo.setText(ngth_msg_8_dots);
            return;

        case 9: // '\t'
            mDynamicTxtInfo.setText(ngth_msg_9_dots);
            break;
        }
        return;
    }

    public void onPatternCleared()
    {
        mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.e.Correct);
        switch (.SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[BaseLockPatternActivity.access$400(BaseLockPatternActivity.this).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            BaseLockPatternActivity.access$500(BaseLockPatternActivity.this, mBtnConfirm);
            BaseLockPatternActivity.access$500(BaseLockPatternActivity.this, BaseLockPatternActivity.access$200(BaseLockPatternActivity.this));
            if (getString(tString).equals(mBtnConfirm.getText()))
            {
                mLastPattern = null;
                mDynamicTxtInfo.setText(nlock_pattern_inital_text);
                return;
            } else
            {
                mDynamicTxtInfo.setText(ttern_to_confirm);
                return;
            }

        case 2: // '\002'
            mTxtInfo.setText(itle);
            headerContainer.setBackgroundColor(Color.parseColor("#000000"));
            mDynamicTxtInfo.setBackgroundColor(Color.parseColor("#000000"));
            mTxtInfo.setPadding(0, 0, 0, 0);
            ELI_LockImage.setVisibility(0);
            mDynamicTxtInfo.setText((new StringBuilder()).append(getString(ern_to_unlock)).append(' ').append(userName).toString());
            return;
        }
    }

    public void onPatternDetected(List list)
    {
        switch (.SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[BaseLockPatternActivity.access$400(BaseLockPatternActivity.this).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            BaseLockPatternActivity.access$600(BaseLockPatternActivity.this, list);
            return;

        case 2: // '\002'
            BaseLockPatternActivity.access$700(BaseLockPatternActivity.this, list);
            break;
        }
    }

    public void onPatternStart()
    {
        mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.e.Correct);
        if (BaseLockPatternActivity.access$400(BaseLockPatternActivity.this) == Mode.CreatePattern)
        {
            BaseLockPatternActivity.access$500(BaseLockPatternActivity.this, mBtnConfirm);
            BaseLockPatternActivity.access$500(BaseLockPatternActivity.this, BaseLockPatternActivity.access$200(BaseLockPatternActivity.this));
            if (getString(tString).equals(mBtnConfirm.getText()))
            {
                mLastPattern = null;
            }
        }
    }

    playMode()
    {
        this$0 = BaseLockPatternActivity.this;
        super();
    }
}

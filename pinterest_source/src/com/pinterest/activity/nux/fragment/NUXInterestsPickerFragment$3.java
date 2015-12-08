// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.nux.adapter.NUXInterestGridAdapter;
import com.pinterest.activity.nux.view.NUXContinueBar;
import com.pinterest.activity.nux.view.NUXInterestGridCell;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.ui.spring.SpringInterpolator;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXInterestsPickerFragment

class this._cls0
    implements android.widget.er
{

    final NUXInterestsPickerFragment this$0;

    private void chooseMoreInterestsTextUpdate()
    {
        int i = ((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$1100(NUXInterestsPickerFragment.this)).getCheckedSize();
        if (i < NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this))
        {
            _chooseMoreTopicsText.setText(NUXInterestsPickerFragment.access$1200(NUXInterestsPickerFragment.this).a(i));
            if (_continueBtn.getAlpha() == 1.0F)
            {
                _continueBtn.setEnabled(false);
                continueBtnAnimation(_chooseMoreTopicsText, _continueBtn, 0.0F, 1.0F, 1.0F, NUXInterestsPickerFragment.access$1300(NUXInterestsPickerFragment.this), NUXInterestsPickerFragment.access$1400(NUXInterestsPickerFragment.this), 0.0F);
            }
        } else
        if (_continueBtn.getAlpha() == NUXInterestsPickerFragment.access$1300(NUXInterestsPickerFragment.this))
        {
            continueBtnAnimation(_chooseMoreTopicsText, _continueBtn, 1.0F, 0.0F, NUXInterestsPickerFragment.access$1300(NUXInterestsPickerFragment.this), 1.0F, 0.0F, NUXInterestsPickerFragment.access$1400(NUXInterestsPickerFragment.this));
            _continueBtn.setEnabled(true);
            return;
        }
    }

    private void continueBarUpdate()
    {
        _continueBar.popInAnimate();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof NUXActivity)
        {
            ((NUXActivity)fragmentactivity).setProgressVisibility(0);
        }
        ((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$2200(NUXInterestsPickerFragment.this)).getCheckedSize();
        JVM INSTR tableswitch 1 5: default 80
    //                   1 115
    //                   2 130
    //                   3 145
    //                   4 160
    //                   5 175;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$2300(NUXInterestsPickerFragment.this)).getCheckedSize() != NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this)) goto _L8; else goto _L7
_L7:
        _continueBar.enableButton(true);
_L10:
        return;
_L2:
        _continueBar.updateText(0x7f0703cb);
        continue; /* Loop/switch isn't completed */
_L3:
        _continueBar.updateText(0x7f0703cc);
        continue; /* Loop/switch isn't completed */
_L4:
        _continueBar.updateText(0x7f0703cd);
        continue; /* Loop/switch isn't completed */
_L5:
        _continueBar.updateText(0x7f0703ce);
        continue; /* Loop/switch isn't completed */
_L6:
        _continueBar.updateText(0x7f0703cf);
        continue; /* Loop/switch isn't completed */
_L8:
        if (((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$2400(NUXInterestsPickerFragment.this)).getCheckedSize() >= NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this)) goto _L10; else goto _L9
_L9:
        _continueBar.enableButton(false);
        return;
        if (true) goto _L1; else goto _L11
_L11:
    }

    private void continueBtnAnimation(PTextView ptextview, PButton pbutton, float f, float f1, float f2, float f3, float f4, 
            float f5)
    {
        ptextview = ObjectAnimator.ofFloat(ptextview, "alpha", new float[] {
            f, f1
        });
        ptextview.setDuration(NUXInterestsPickerFragment.access$1500(NUXInterestsPickerFragment.this));
        Object obj = ObjectAnimator.ofFloat(pbutton, "alpha", new float[] {
            f2, f3
        });
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(pbutton, "translationY", new float[] {
            f4, f5
        });
        pbutton = new AnimatorSet();
        pbutton.playTogether(new Animator[] {
            obj, objectanimator
        });
        pbutton.setDuration(NUXInterestsPickerFragment.access$1600(NUXInterestsPickerFragment.this));
        pbutton.setInterpolator(new SpringInterpolator(NUXInterestsPickerFragment.access$1700(NUXInterestsPickerFragment.this), NUXInterestsPickerFragment.access$1800(NUXInterestsPickerFragment.this)));
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            ptextview, pbutton
        });
        ((AnimatorSet) (obj)).start();
    }

    private void pickMoreInterestsPromptUpdate()
    {
        int i = ((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$1900(NUXInterestsPickerFragment.this)).getCheckedSize();
        if (i < NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this))
        {
            _giftwrapContinueBtn.setEnabled(false);
            _giftwrapContinueBtn.setText(String.format(NUXInterestsPickerFragment.access$2000(NUXInterestsPickerFragment.this), new Object[] {
                Integer.valueOf(NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this) - i)
            }));
            _giftwrapContinueBtn.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        } else
        {
            _giftwrapContinueBtn.setEnabled(true);
            _giftwrapContinueBtn.setText(NUXInterestsPickerFragment.access$2100(NUXInterestsPickerFragment.this));
            _giftwrapContinueBtn.setIconTint(Colors.WHITE);
            _giftwrapContinueBtn.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020037, 0);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (NUXInterestsPickerFragment.access$100(NUXInterestsPickerFragment.this) == null)
        {
            return;
        }
        adapterview = (NUXInterestGridCell)view;
        view = adapterview.getInterest();
        if (((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$200(NUXInterestsPickerFragment.this)).containsInterest(view))
        {
            ((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$300(NUXInterestsPickerFragment.this)).toggleCheckInterest(view);
            if (((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$400(NUXInterestsPickerFragment.this)).getCheckedSize() < NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this))
            {
                Events.post(new com.pinterest.activity.nux.Event(-1, com.pinterest.activity.nux.Event.EventType.INTEREST));
            }
        } else
        {
            if (((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$600(NUXInterestsPickerFragment.this)).getCheckedSize() < NUXInterestsPickerFragment.access$500(NUXInterestsPickerFragment.this))
            {
                Events.post(new com.pinterest.activity.nux.Event(1, com.pinterest.activity.nux.Event.EventType.INTEREST));
            }
            ((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$700(NUXInterestsPickerFragment.this)).toggleCheckInterest(view);
        }
        if (NUXInterestsPickerFragment.access$800(NUXInterestsPickerFragment.this))
        {
            chooseMoreInterestsTextUpdate();
        } else
        if (NUXInterestsPickerFragment.access$900(NUXInterestsPickerFragment.this))
        {
            pickMoreInterestsPromptUpdate();
        } else
        {
            continueBarUpdate();
        }
        adapterview.setChecked(((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$1000(NUXInterestsPickerFragment.this)).isInterestChecked(view));
    }

    ntType()
    {
        this$0 = NUXInterestsPickerFragment.this;
        super();
    }
}

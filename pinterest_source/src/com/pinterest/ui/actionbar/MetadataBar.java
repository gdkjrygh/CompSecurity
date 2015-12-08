// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.actionbar:
//            MetadataBarAddons

public class MetadataBar extends LinearLayout
{

    LinearLayout _addonsLl;
    PTextView _headerTv;
    ImageView _iconIv;
    private int _iconResId;
    View _shadowDown;
    View _shadowUp;
    private String _titleText;
    PTextView _titleTv;

    public MetadataBar(Context context)
    {
        this(context, null);
    }

    public MetadataBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void extractBoardDetails(Board board, Mode mode)
    {
        _iconResId = 0x7f0201d3;
        if (board.getPinCount().intValue() > 0)
        {
            _titleText = Resources.stringPlural(0x7f090016, board.getPinCount());
        }
    }

    private void extractInterestDetails(Interest interest, Mode mode)
    {
        _iconResId = 0x7f0201a6;
        if (interest.getPinnerCount().intValue() > 0)
        {
            _titleText = Resources.stringPluralShort(0x7f090007, interest.getPinnerCount());
        }
    }

    private void extractPinDetails(Pin pin, Mode mode)
    {
        _cls1..SwitchMap.com.pinterest.ui.actionbar.MetadataBar.Mode[mode.ordinal()];
        JVM INSTR lookupswitch 2: default 36
    //                   2: 74
    //                   6: 92;
           goto _L1 _L2 _L3
_L1:
        int i;
        int j;
        j = 0x7f0201d3;
        i = 0x7f090023;
        pin = Integer.valueOf(pin.getRepinCountDisplay());
_L5:
        _iconResId = j;
        if (pin.intValue() > 0)
        {
            _titleText = Resources.stringPlural(i, pin);
        }
        return;
_L2:
        j = 0x7f0201c1;
        i = 0x7f09000d;
        pin = Integer.valueOf(pin.getLikeCountDisplay());
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0x7f0201a6;
        i = 0x7f090003;
        pin = Integer.valueOf(pin.getCommentCountDisplay());
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void extractUserDetails(User user, Mode mode)
    {
        int k = 0x7f0201a6;
        _cls1..SwitchMap.com.pinterest.ui.actionbar.MetadataBar.Mode[mode.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 78
    //                   2 94
    //                   3 110
    //                   4 126;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int i;
        int j;
        i = 0x7f090006;
        j = user.getFollowersCountDisplay();
_L7:
        _iconResId = k;
        if (j >= 0)
        {
            _titleText = Resources.stringPlural(i, Integer.valueOf(j));
        }
        return;
_L2:
        k = 0x7f0201d3;
        i = 0x7f090016;
        j = user.getPinCountDisplay();
        continue; /* Loop/switch isn't completed */
_L3:
        k = 0x7f0201c1;
        i = 0x7f09000d;
        j = user.getLikeCountDisplay();
        continue; /* Loop/switch isn't completed */
_L4:
        k = 0x7f02015e;
        i = 0x7f090002;
        j = user.getBoardCountDisplay();
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f090008;
        j = user.getFollowingCountDisplay();
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void init()
    {
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(0x7f03001b, this, true);
        ButterKnife.a(this);
    }

    private void updateDisplayData(Model model, Mode mode)
    {
        if (model == null)
        {
            _iconResId = -1;
            _titleText = null;
            _addonsLl.removeAllViews();
        } else
        {
            if (model instanceof User)
            {
                extractUserDetails((User)model, mode);
                return;
            }
            if (model instanceof Interest)
            {
                extractInterestDetails((Interest)model, mode);
                return;
            }
            if (model instanceof Board)
            {
                extractBoardDetails((Board)model, mode);
                return;
            }
            if (model instanceof Pin)
            {
                extractPinDetails((Pin)model, mode);
                return;
            }
        }
    }

    private void updateView(Model model, Mode mode)
    {
        _iconIv.setImageDrawable(DrawableUtils.tintIcon(_iconResId));
        _titleTv.setText(_titleText);
        MetadataBarAddons.insertAddons(_addonsLl, model, mode);
    }

    public void setHeaderTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            ViewHelper.setVisibility(_headerTv, 0);
            _headerTv.setText(s);
        }
    }

    public void setModel(Model model)
    {
        setModel(model, Mode.DEFAULT);
    }

    public void setModel(Model model, Mode mode)
    {
        updateDisplayData(model, mode);
        updateView(model, mode);
    }

    public void setShadowDownVisibility(int i)
    {
        _shadowDown.setVisibility(i);
    }

    public void setShadowUpVisibility(int i)
    {
        _shadowUp.setVisibility(i);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[];

        static 
        {
            $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode = new int[Mode.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.PINS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.LIKES.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.BOARDS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.FOLLOWING.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.FOLLOWERS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.COMMENTS.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$actionbar$MetadataBar$Mode[Mode.REPINS.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode BOARDS;
        public static final Mode COMMENTS;
        public static final Mode DEFAULT;
        public static final Mode FOLLOWERS;
        public static final Mode FOLLOWING;
        public static final Mode LIKES;
        public static final Mode PINS;
        public static final Mode REPINS;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/pinterest/ui/actionbar/MetadataBar$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new Mode("DEFAULT", 0);
            PINS = new Mode("PINS", 1);
            REPINS = new Mode("REPINS", 2);
            COMMENTS = new Mode("COMMENTS", 3);
            LIKES = new Mode("LIKES", 4);
            FOLLOWERS = new Mode("FOLLOWERS", 5);
            FOLLOWING = new Mode("FOLLOWING", 6);
            BOARDS = new Mode("BOARDS", 7);
            $VALUES = (new Mode[] {
                DEFAULT, PINS, REPINS, COMMENTS, LIKES, FOLLOWERS, FOLLOWING, BOARDS
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.kit.application.Resources;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pinterest.ui.text:
//            PButton

public abstract class FollowButton extends PButton
    implements android.view.View.OnClickListener
{

    private String _followLbl;
    private String _followingLbl;
    protected MODE _mode;
    protected WeakReference _progressView;
    protected DynamicStory _story;
    protected PButton.ButtonStyle _styleFollowing;
    protected PButton.ButtonStyle _styleNotFollowing;

    public FollowButton(Context context)
    {
        super(context);
        _mode = MODE.NORMAL;
        _followingLbl = Resources.string(0x7f0705b2);
        _followLbl = Resources.string(0x7f0702ab);
        init();
    }

    public FollowButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _mode = MODE.NORMAL;
        _followingLbl = Resources.string(0x7f0705b2);
        _followLbl = Resources.string(0x7f0702ab);
        init();
    }

    public FollowButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _mode = MODE.NORMAL;
        _followingLbl = Resources.string(0x7f0705b2);
        _followLbl = Resources.string(0x7f0702ab);
        init();
    }

    protected void init()
    {
        _styleFollowing = PButton.ButtonStyle.PLAIN;
        _styleNotFollowing = PButton.ButtonStyle.RED;
        setOnClickListener(this);
        setMinimumHeight((int)Resources.dimension(0x7f0a000a));
        updateDisplay();
    }

    protected abstract boolean isFollowing();

    public abstract void onClick(View view);

    public void setLoading(boolean flag)
    {
        View view;
        if (_progressView != null)
        {
            if ((view = (View)_progressView.get()) != null)
            {
                if (flag)
                {
                    view.setVisibility(0);
                    setVisibility(8);
                    return;
                } else
                {
                    view.setVisibility(8);
                    setVisibility(0);
                    return;
                }
            }
        }
    }

    public void setMode(MODE mode)
    {
        _mode = mode;
    }

    public void setProgressView(View view)
    {
        if (view == null)
        {
            view = null;
        } else
        {
            view = new WeakReference(view);
        }
        _progressView = view;
    }

    public void setStory(DynamicStory dynamicstory)
    {
        _story = dynamicstory;
    }

    public void setStyleFollowing(PButton.ButtonStyle buttonstyle)
    {
        _styleFollowing = buttonstyle;
        updateDisplay();
    }

    public void setStyleNotFollowing(PButton.ButtonStyle buttonstyle)
    {
        _styleNotFollowing = buttonstyle;
        updateDisplay();
    }

    protected void updateDisplay()
    {
        if (isFollowing())
        {
            setStyle(_styleFollowing);
            setText(_followingLbl);
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        } else
        {
            setStyle(_styleNotFollowing);
            setText(_followLbl);
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        }
    }

    private class MODE extends Enum
    {

        private static final MODE $VALUES[];
        public static final MODE DYNAMIC_GRID;
        public static final MODE NORMAL;

        public static MODE valueOf(String s)
        {
            return (MODE)Enum.valueOf(com/pinterest/ui/text/FollowButton$MODE, s);
        }

        public static MODE[] values()
        {
            return (MODE[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new MODE("NORMAL", 0);
            DYNAMIC_GRID = new MODE("DYNAMIC_GRID", 1);
            $VALUES = (new MODE[] {
                NORMAL, DYNAMIC_GRID
            });
        }

        private MODE(String s, int i)
        {
            super(s, i);
        }
    }

}

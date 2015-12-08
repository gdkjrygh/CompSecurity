// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.task.toast.view.BaseToastView;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public abstract class BaseToast
{

    public static final int LONG = 7000;
    public static final int MEDIUM = 3000;
    public static final int SHORT = 1500;
    private int _arrowRes;
    private boolean _arrowVis;
    private int _buttonBackgroundResource;
    private int _buttonDrawable;
    private String _buttonText;
    private boolean _buttonVis;
    protected boolean _clickable;
    private List _customButtons;
    private int _duration;
    private int _gravity;
    private boolean _imageOval;
    private int _imageResId;
    private Uri _imageUri;
    private String _imageUrl;
    private boolean _isDismissed;
    private String _message;
    private android.view.View.OnClickListener _onButtonClickListener;
    private String _secondaryMessage;
    private String _topTitle;

    public BaseToast()
    {
        _duration = 3000;
        _gravity = 0;
        _buttonDrawable = 0;
        _buttonBackgroundResource = 0;
        _arrowRes = 0;
        _imageOval = true;
        _imageResId = -1;
        _clickable = true;
    }

    protected BaseToast(String s)
    {
        _duration = 3000;
        _gravity = 0;
        _buttonDrawable = 0;
        _buttonBackgroundResource = 0;
        _arrowRes = 0;
        _imageOval = true;
        _imageResId = -1;
        _clickable = true;
        _message = s;
    }

    public void addCustomButton(Button button)
    {
        if (_customButtons == null)
        {
            _customButtons = new ArrayList();
        }
        _customButtons.add(button);
    }

    public int getDuration()
    {
        return _duration;
    }

    public int getGravity()
    {
        return _gravity;
    }

    public View getView(final ToastContainer container)
    {
        final BaseToastView toastVw;
        toastVw = new BaseToastView(container.getContext());
        toastVw.setId((new Random()).nextInt());
        toastVw.setOnClickListener(new _cls1());
        toastVw.messageIc.setOval(_imageOval);
        Button button;
        if (StringUtils.isNotEmpty(_imageUrl))
        {
            toastVw.messageIc.loadUrl(_imageUrl);
        } else
        if (_imageUri != null)
        {
            toastVw.messageIc.loadUri(_imageUri);
        } else
        if (_imageResId != -1)
        {
            toastVw.messageIc.setImageResource(_imageResId);
        } else
        {
            toastVw.messageIc.setVisibility(8);
        }
        if (!StringUtils.isEmpty(_topTitle))
        {
            toastVw.topTv.setText(_topTitle);
            ViewHelper.setVisibility(toastVw.topTv, 0);
            ViewHelper.setVisibility(toastVw.divider, 0);
        }
        toastVw.titleTv.setText(_message);
        if (StringUtils.isEmpty(_secondaryMessage))
        {
            toastVw.subtitleTv.setVisibility(8);
        } else
        {
            toastVw.subtitleTv.setText(_secondaryMessage);
        }
        if (_buttonVis) goto _L2; else goto _L1
_L1:
        toastVw.actionBt.setVisibility(8);
        if (_arrowRes != 0)
        {
            toastVw.arrow.setImageResource(_arrowRes);
        }
_L4:
        if (_customButtons != null)
        {
            for (container = _customButtons.iterator(); container.hasNext(); toastVw.lowerView.addView(button))
            {
                button = (Button)container.next();
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        toastVw.actionBt.setText(_buttonText);
        toastVw.actionBt.setOnClickListener(new _cls2());
        if (_buttonDrawable != 0)
        {
            ViewHelper.setLeftDrawable(toastVw.actionBt, _buttonDrawable);
            if (TextUtils.isEmpty(_buttonText))
            {
                toastVw.actionBt.setCompoundDrawablePadding(0);
            }
        }
        if (_buttonBackgroundResource != 0)
        {
            toastVw.actionBt.setBackgroundResource(_buttonBackgroundResource);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (_arrowRes != 0)
        {
            toastVw.arrow.setImageResource(_arrowRes);
        }
        container = toastVw.arrow;
        int i;
        if (_arrowVis)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        container.setVisibility(i);
        return toastVw;
    }

    public boolean isDismissed()
    {
        return _isDismissed;
    }

    public void onToastCancelled(Context context)
    {
    }

    public void onToastClicked(Context context)
    {
        if (_clickable)
        {
            onToastCompleted(context);
        }
    }

    public void onToastCompleted(Context context)
    {
    }

    public void setArrowDrawable(int i)
    {
        _arrowRes = i;
        setArrowVis(true);
    }

    public void setArrowVis(boolean flag)
    {
        _arrowVis = flag;
    }

    public void setButtonBackgroundResource(int i)
    {
        _buttonBackgroundResource = i;
    }

    public void setButtonDrawable(int i)
    {
        _buttonDrawable = i;
        setButtonVis(true);
    }

    public void setButtonText(String s)
    {
        _buttonText = s;
        setButtonVis(true);
    }

    public void setButtonVis(boolean flag)
    {
        _buttonVis = flag;
    }

    public void setClickable(boolean flag)
    {
        _clickable = flag;
    }

    public void setDismissed(boolean flag)
    {
        _isDismissed = flag;
    }

    public void setDuration(int i)
    {
        _duration = i;
    }

    public void setGravity(int i)
    {
        _gravity = i;
    }

    public void setImageOval(boolean flag)
    {
        _imageOval = flag;
    }

    public void setImageResource(int i)
    {
        _imageResId = i;
    }

    public void setImageUri(Uri uri)
    {
        _imageUri = uri;
    }

    public void setImageUrl(String s)
    {
        _imageUrl = s;
    }

    public void setLayoutGravity(int i)
    {
        _gravity = i;
    }

    public void setMessage(int i)
    {
        _message = Resources.string(i);
    }

    public void setMessage(String s)
    {
        _message = s;
    }

    public void setOnButtonClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _onButtonClickListener = onclicklistener;
    }

    public void setSecondaryMessage(int i)
    {
        _secondaryMessage = Resources.string(i);
    }

    public void setSecondaryMessage(String s)
    {
        _secondaryMessage = s;
    }

    public void setTopTitle(int i)
    {
        _topTitle = Resources.string(i);
    }

    public void setTopTitle(String s)
    {
        _topTitle = s;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BaseToast this$0;

        public void onClick(View view)
        {
        }

        _cls1()
        {
            this$0 = BaseToast.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BaseToast this$0;
        final ToastContainer val$container;
        final BaseToastView val$toastVw;

        public void onClick(View view)
        {
            container.dismiss(toastVw);
            if (_onButtonClickListener != null)
            {
                _onButtonClickListener.onClick(toastVw);
                return;
            } else
            {
                onToastCancelled(container.getContext());
                return;
            }
        }

        _cls2()
        {
            this$0 = BaseToast.this;
            container = toastcontainer;
            toastVw = basetoastview;
            super();
        }
    }

}

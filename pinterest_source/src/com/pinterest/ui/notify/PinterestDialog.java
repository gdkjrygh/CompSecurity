// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Device;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.List;

// Referenced classes of package com.pinterest.ui.notify:
//            DialogTitleView, DialogCheckedTextViewAdapter, DialogAdapter

public class PinterestDialog extends Dialog
{

    private boolean _dismissKb;
    private View barDivider;
    private View buttonDivider;
    private FrameLayout container;
    private View content;
    private final int contentPadding;
    private android.content.DialogInterface.OnClickListener dismissClick;
    private DialogTitleView headerVw;
    private Button negativeBt;
    private Button positiveBt;

    public PinterestDialog(Context context)
    {
        super(context);
        dismissClick = new _cls1();
        contentPadding = (int)getContext().getResources().getDimension(0x7f0a015f);
        init(context);
    }

    public PinterestDialog(Context context, int i)
    {
        super(context, i);
        dismissClick = new _cls1();
        contentPadding = (int)getContext().getResources().getDimension(0x7f0a015f);
        init(context);
    }

    public PinterestDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        super(context, flag, oncancellistener);
        dismissClick = new _cls1();
        contentPadding = (int)getContext().getResources().getDimension(0x7f0a015f);
        init(context);
    }

    private ListView getListView()
    {
        ListView listview = new ListView(content.getContext());
        listview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        return listview;
    }

    private void hideKeyboard()
    {
        Device.hideSoftKeyboard(content);
    }

    private void init(Context context)
    {
        setCancelable(false);
        requestWindowFeature(1);
        content = LayoutInflater.from(context).inflate(0x7f03007f, null);
        headerVw = (DialogTitleView)content.findViewById(0x7f0f0133);
        container = (FrameLayout)content.findViewById(0x7f0f0134);
        barDivider = content.findViewById(0x7f0f0139);
        buttonDivider = content.findViewById(0x7f0f017f);
        positiveBt = (Button)content.findViewById(0x7f0f00a2);
        negativeBt = (Button)content.findViewById(0x7f0f0136);
        super.setContentView(content);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (_dismissKb)
        {
            Rect rect = new Rect();
            getWindow().getDecorView().getHitRect(rect);
            if (!rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                hideKeyboard();
            }
        }
        return super.dispatchTouchEvent(motionevent);
    }

    public TextView getTitleTextView()
    {
        return headerVw.titleTv;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (Device.isTablet())
        {
            int i = (int)Device.dpToPixel(360F);
            if ((float)i < Device.getScreenWidth())
            {
                bundle = getWindow().getAttributes();
                bundle.width = i;
                getWindow().setAttributes(bundle);
            }
        }
    }

    public void setBarDividerVis(int i)
    {
        barDivider.setVisibility(i);
    }

    public void setCheckedItems(List list, PinterestJsonArray pinterestjsonarray, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        ListView listview = getListView();
        listview.setAdapter(new DialogCheckedTextViewAdapter(list, pinterestjsonarray));
        listview.setOnItemClickListener(onitemclicklistener);
        setContent(listview, 0);
    }

    public void setContent(View view)
    {
        setContent(view, contentPadding);
    }

    public void setContent(View view, int i)
    {
        container.removeAllViews();
        container.setPadding(i, i, i, i);
        container.addView(view);
    }

    public void setContentView(int i)
    {
        setContent(null);
    }

    public void setContentView(View view)
    {
        setContentView(null, null);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new Error("PinterestDialog: User setContent (View view) instead!");
    }

    public void setDismissKbWhenTouchOutside(boolean flag)
    {
        _dismissKb = flag;
    }

    public void setItems(CharSequence acharsequence[], android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        setItems(acharsequence, new Drawable[0], onitemclicklistener);
    }

    public void setItems(CharSequence acharsequence[], Drawable adrawable[], android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        ListView listview = getListView();
        listview.setAdapter(new DialogAdapter(acharsequence, adrawable));
        listview.setOnItemClickListener(onitemclicklistener);
        setContent(listview, 0);
    }

    public void setMessage(int i)
    {
        setMessage(getContext().getResources().getString(i));
    }

    public void setMessage(Spanned spanned)
    {
        ScrollView scrollview = new ScrollView(getContext());
        scrollview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        TextView textview = new TextView(getContext(), null, 0x7f0b0186);
        textview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        textview.setPadding(contentPadding, contentPadding, contentPadding, contentPadding);
        textview.setLineSpacing(0.0F, 1.3F);
        textview.setText(spanned);
        scrollview.addView(textview);
        setContent(scrollview, 0);
    }

    public void setMessage(String s)
    {
        setMessage(Html.fromHtml(s));
    }

    public void setNegativeButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        setNegativeButton(getContext().getString(i), onclicklistener);
    }

    public void setNegativeButton(String s, final android.content.DialogInterface.OnClickListener listener)
    {
        if (ModelHelper.isValid(s))
        {
            negativeBt.setText(s);
            negativeBt.setOnClickListener(new _cls3());
            negativeBt.setVisibility(0);
            if (positiveBt.getVisibility() == 0)
            {
                buttonDivider.setVisibility(0);
            }
        } else
        {
            negativeBt.setVisibility(8);
            buttonDivider.setVisibility(8);
        }
        if (positiveBt.getVisibility() == 0 || negativeBt.getVisibility() == 0)
        {
            barDivider.setVisibility(0);
            return;
        } else
        {
            barDivider.setVisibility(8);
            return;
        }
    }

    public void setPositiveButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        setPositiveButton(getContext().getString(i), onclicklistener);
    }

    public void setPositiveButton(String s, final android.content.DialogInterface.OnClickListener listener)
    {
        if (ModelHelper.isValid(s))
        {
            positiveBt.setText(s);
            positiveBt.setOnClickListener(new _cls2());
            positiveBt.setVisibility(0);
            if (negativeBt.getVisibility() == 0)
            {
                buttonDivider.setVisibility(0);
            }
        } else
        {
            positiveBt.setVisibility(8);
            buttonDivider.setVisibility(8);
        }
        if (positiveBt.getVisibility() == 0 || negativeBt.getVisibility() == 0)
        {
            barDivider.setVisibility(0);
            return;
        } else
        {
            barDivider.setVisibility(8);
            return;
        }
    }

    public void setSubTitle(int i)
    {
        setSubTitle(((CharSequence) (com.pinterest.kit.application.Resources.string(i))));
    }

    public void setSubTitle(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            headerVw.subTitleTv.setText(charsequence.toString());
            headerVw.subTitleTv.setVisibility(0);
            return;
        } else
        {
            headerVw.subTitleTv.setVisibility(8);
            return;
        }
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (getContext().getResources().getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            headerVw.titleTv.setText(charsequence.toString());
            headerVw.setVisibility(0);
            return;
        } else
        {
            headerVw.setVisibility(8);
            return;
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final PinterestDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
        }

        _cls1()
        {
            this$0 = PinterestDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinterestDialog this$0;
        final android.content.DialogInterface.OnClickListener val$listener;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onClick(PinterestDialog.this, 0);
                return;
            } else
            {
                dismissClick.onClick(PinterestDialog.this, 0);
                return;
            }
        }

        _cls3()
        {
            this$0 = PinterestDialog.this;
            listener = onclicklistener;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinterestDialog this$0;
        final android.content.DialogInterface.OnClickListener val$listener;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onClick(PinterestDialog.this, 0);
                return;
            } else
            {
                dismissClick.onClick(PinterestDialog.this, 0);
                return;
            }
        }

        _cls2()
        {
            this$0 = PinterestDialog.this;
            listener = onclicklistener;
            super();
        }
    }

}

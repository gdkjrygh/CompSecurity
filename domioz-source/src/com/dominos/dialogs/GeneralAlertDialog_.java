// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.dialogs:
//            GeneralAlertDialog

public final class GeneralAlertDialog_ extends GeneralAlertDialog
    implements a, b
{

    public static final String M_MESSAGE_ARG = "mMessage";
    public static final String M_POSITIVE_BUTTON_TEXT_ARG = "mPositiveButtonText";
    public static final String M_TITLE_ARG = "mTitle";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public GeneralAlertDialog_()
    {
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        injectFragmentArguments_();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("mPositiveButtonText"))
            {
                mPositiveButtonText = bundle.getString("mPositiveButtonText");
            }
            if (bundle.containsKey("mTitle"))
            {
                mTitle = bundle.getString("mTitle");
            }
            if (bundle.containsKey("mMessage"))
            {
                mMessage = bundle.getString("mMessage");
            }
        }
    }

    public final View findViewById(int i)
    {
        if (contentView_ == null)
        {
            return null;
        } else
        {
            return contentView_.findViewById(i);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        contentView_ = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (contentView_ == null)
        {
            contentView_ = layoutinflater.inflate(0x7f030063, viewgroup, false);
        }
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewChanged(a a1)
    {
        mSummaryTextView = (TextView)a1.findViewById(0x7f0f0299);
        mNeutralButton = (Button)a1.findViewById(0x7f0f029a);
        mRootLayout = (LinearLayout)a1.findViewById(0x7f0f0296);
        mScrollView = (ScrollView)a1.findViewById(0x7f0f0298);
        mTitleTextView = (TextView)a1.findViewById(0x7f0f0297);
        if (mNeutralButton != null)
        {
            mNeutralButton.setOnClickListener(new _cls1());
        }
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public GeneralAlertDialog build()
        {
            GeneralAlertDialog_ generalalertdialog_ = new GeneralAlertDialog_();
            generalalertdialog_.setArguments(args);
            return generalalertdialog_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mMessage(String s)
        {
            args.putString("mMessage", s);
            return this;
        }

        public FragmentBuilder_ mPositiveButtonText(String s)
        {
            args.putString("mPositiveButtonText", s);
            return this;
        }

        public FragmentBuilder_ mTitle(String s)
        {
            args.putString("mTitle", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final GeneralAlertDialog_ this$0;

        public void onClick(View view)
        {
            alertDialogGotItButtonClicked();
        }

        _cls1()
        {
            this$0 = GeneralAlertDialog_.this;
            super();
        }
    }

}

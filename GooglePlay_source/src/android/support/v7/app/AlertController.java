// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//            AppCompatDialog

public final class AlertController
{
    public static final class AlertParams
    {

        public ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public final Context mContext;
        public View mCustomTitleView;
        public Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final LayoutInflater mInflater;
        public CharSequence mMessage;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public boolean mViewSpacingSpecified;

        public AlertParams(Context context)
        {
            mIconId = 0;
            mIconAttrId = 0;
            mViewSpacingSpecified = false;
            mCheckedItem = -1;
            mRecycleOnMeasure = true;
            mContext = context;
            mCancelable = true;
            mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        }
    }

    private static final class ButtonHandler extends Handler
    {

        private WeakReference mDialog;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            case 0: // '\0'
            default:
                return;

            case -3: 
            case -2: 
            case -1: 
                ((android.content.DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)mDialog.get(), message.what);
                return;

            case 1: // '\001'
                ((DialogInterface)message.obj).dismiss();
                break;
            }
        }

        public ButtonHandler(DialogInterface dialoginterface)
        {
            mDialog = new WeakReference(dialoginterface);
        }
    }

    private static final class CheckedItemAdapter extends ArrayAdapter
    {

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final boolean hasStableIds()
        {
            return true;
        }

        public CheckedItemAdapter(Context context, int i, CharSequence acharsequence[])
        {
            super(context, i, 0x1020014, null);
        }
    }


    ListAdapter mAdapter;
    int mAlertDialogLayout;
    final android.view.View.OnClickListener mButtonHandler = new android.view.View.OnClickListener() {

        final AlertController this$0;

        public final void onClick(View view)
        {
            if (view == mButtonPositive && mButtonPositiveMessage != null)
            {
                view = Message.obtain(mButtonPositiveMessage);
            } else
            if (view == mButtonNegative && mButtonNegativeMessage != null)
            {
                view = Message.obtain(mButtonNegativeMessage);
            } else
            if (view == mButtonNeutral && mButtonNeutralMessage != null)
            {
                view = Message.obtain(mButtonNeutralMessage);
            } else
            {
                view = null;
            }
            if (view != null)
            {
                view.sendToTarget();
            }
            mHandler.obtainMessage(1, mDialog).sendToTarget();
        }

            
            {
                this$0 = AlertController.this;
                super();
            }
    };
    public Button mButtonNegative;
    Message mButtonNegativeMessage;
    CharSequence mButtonNegativeText;
    public Button mButtonNeutral;
    Message mButtonNeutralMessage;
    CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    int mButtonPanelSideLayout;
    public Button mButtonPositive;
    Message mButtonPositiveMessage;
    CharSequence mButtonPositiveText;
    int mCheckedItem;
    final Context mContext;
    View mCustomTitleView;
    final AppCompatDialog mDialog;
    Handler mHandler;
    Drawable mIcon;
    int mIconId;
    ImageView mIconView;
    int mListItemLayout;
    int mListLayout;
    public ListView mListView;
    CharSequence mMessage;
    TextView mMessageView;
    int mMultiChoiceItemLayout;
    ScrollView mScrollView;
    private int mSingleChoiceItemLayout;
    CharSequence mTitle;
    TextView mTitleView;
    View mView;
    int mViewLayoutResId;
    boolean mViewSpacingSpecified;
    final Window mWindow;

    public AlertController(Context context, AppCompatDialog appcompatdialog, Window window)
    {
        mViewSpacingSpecified = false;
        mIconId = 0;
        mCheckedItem = -1;
        mButtonPanelLayoutHint = 0;
        mContext = context;
        mDialog = appcompatdialog;
        mWindow = window;
        mHandler = new ButtonHandler(appcompatdialog);
        context = context.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.AlertDialog, 0x7f010144, 0);
        mAlertDialogLayout = context.getResourceId(0, 0);
        mButtonPanelSideLayout = context.getResourceId(1, 0);
        mListLayout = context.getResourceId(2, 0);
        mMultiChoiceItemLayout = context.getResourceId(3, 0);
        mSingleChoiceItemLayout = context.getResourceId(4, 0);
        mListItemLayout = context.getResourceId(5, 0);
        context.recycle();
    }

    static boolean canTextInput(View view)
    {
        if (view.onCheckIsTextEditor())
        {
            return true;
        }
        if (!(view instanceof ViewGroup))
        {
            return false;
        }
        view = (ViewGroup)view;
        for (int i = view.getChildCount(); i > 0;)
        {
            int j = i - 1;
            i = j;
            if (canTextInput(view.getChildAt(j)))
            {
                return true;
            }
        }

        return false;
    }

    static void centerButton(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
    }

    public final void setButton(int i, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
    {
        if (onclicklistener != null)
        {
            message = mHandler.obtainMessage(i, onclicklistener);
        }
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Button does not exist");

        case -1: 
            mButtonPositiveText = charsequence;
            mButtonPositiveMessage = message;
            return;

        case -2: 
            mButtonNegativeText = charsequence;
            mButtonNegativeMessage = message;
            return;

        case -3: 
            mButtonNeutralText = charsequence;
            mButtonNeutralMessage = message;
            return;
        }
    }

    public final void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        if (mTitleView != null)
        {
            mTitleView.setText(charsequence);
        }
    }

    // Unreferenced inner class android/support/v7/app/AlertController$AlertParams$3

/* anonymous class */
    final class AlertParams._cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final AlertParams this$0;
        final AlertController val$dialog;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            mOnClickListener.onClick(dialog.mDialog, i);
            dialog.mDialog.dismiss();
        }

            
            {
                this$0 = final_alertparams;
                dialog = AlertController.this;
                super();
            }
    }

}

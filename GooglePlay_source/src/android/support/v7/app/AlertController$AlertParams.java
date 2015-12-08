// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//            AlertController, AppCompatDialog

public static final class mInflater
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
    public android.content.ner mNegativeButtonListener;
    public CharSequence mNegativeButtonText;
    public android.content.ner mNeutralButtonListener;
    public CharSequence mNeutralButtonText;
    public android.content.ener mOnCancelListener;
    public android.content.ner mOnClickListener;
    public android.content.r mOnKeyListener;
    public android.content.ner mPositiveButtonListener;
    public CharSequence mPositiveButtonText;
    public boolean mRecycleOnMeasure;
    public CharSequence mTitle;
    public View mView;
    public int mViewLayoutResId;
    public boolean mViewSpacingSpecified;

    public _cls3.val.dialog(Context context)
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

    // Unreferenced inner class android/support/v7/app/AlertController$AlertParams$3

/* anonymous class */
    final class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final AlertController.AlertParams this$0;
        final AlertController val$dialog;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            mOnClickListener.onClick(dialog.mDialog, i);
            dialog.mDialog.dismiss();
        }

            
            {
                this$0 = AlertController.AlertParams.this;
                dialog = alertcontroller;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            LayoutSpec, AutoLayoutSlot, LayoutSlot

public final class AutoLayoutSlotBuilder
{
    private final class AutoLayoutSlotComponents
    {

        public int mAnimationType;
        public ImageView mImage;
        public ViewGroup mImageContainer;
        public int mImageResizeMode;
        public String mLayoutSlotType;
        public ImageView mOverflowImage;
        public View mOverlay;
        public ProgressBar mProgressBar;
        public View mRoot;
        public ArrayList mSharedViews;
        public ArrayList mSlotArray;
        public TextView mSubtitle;
        public TextView mTitle;
        final AutoLayoutSlotBuilder this$0;

        private AutoLayoutSlotComponents()
        {
            this$0 = AutoLayoutSlotBuilder.this;
            super();
            mSlotArray = new ArrayList();
        }

        AutoLayoutSlotComponents(byte byte0)
        {
            this();
        }
    }


    final HashMap mBuildMap = new HashMap();
    final Context mContext;
    private int mLastLayoutSlotIndex;

    public AutoLayoutSlotBuilder(Context context)
    {
        mContext = context;
    }

    public final AutoLayoutSlotBuilder addView(ViewGroup viewgroup, View view, LayoutSpec layoutspec, String s)
    {
        if (layoutspec != null) goto _L2; else goto _L1
_L1:
        return this;
_L2:
        String s1;
        Object obj = layoutspec.mLayoutSlot;
        s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (s != null)
            {
                s1 = s.toUpperCase();
            } else
            {
                s1 = "";
            }
        }
        if (TextUtils.isEmpty(s1)) goto _L1; else goto _L3
_L3:
        String s2;
        Object obj1;
        obj = (AutoLayoutSlotComponents)mBuildMap.get(s1);
        s = ((String) (obj));
        if (obj == null)
        {
            s = new AutoLayoutSlotComponents((byte)0);
        }
        if (layoutspec.mLayoutSlotIndex >= 0)
        {
            for (; ((AutoLayoutSlotComponents) (s)).mSlotArray.size() <= layoutspec.mLayoutSlotIndex; ((AutoLayoutSlotComponents) (s)).mSlotArray.add(null)) { }
            ((AutoLayoutSlotComponents) (s)).mSlotArray.set(layoutspec.mLayoutSlotIndex, new AutoLayoutSlotComponents((byte)0));
            mLastLayoutSlotIndex = layoutspec.mLayoutSlotIndex;
        }
        s2 = null;
        obj1 = s;
        if (!((AutoLayoutSlotComponents) (s)).mSlotArray.isEmpty())
        {
            s2 = s;
            obj1 = (AutoLayoutSlotComponents)((AutoLayoutSlotComponents) (s)).mSlotArray.get(mLastLayoutSlotIndex);
        }
        if (layoutspec.mRootId > 0 && viewgroup != null)
        {
            obj1.mRoot = viewgroup.findViewById(layoutspec.mRootId);
        }
        if (layoutspec.mAnimationType != 0)
        {
            obj1.mAnimationType = layoutspec.mAnimationType;
        }
        if (layoutspec.mLayoutSlotType != null)
        {
            obj1.mLayoutSlotType = layoutspec.mLayoutSlotType;
            obj1.mRoot = view;
        }
        if (!TextUtils.isEmpty(layoutspec.mSharedViewName))
        {
            if (((AutoLayoutSlotComponents) (obj1)).mSharedViews == null)
            {
                obj1.mSharedViews = new ArrayList();
            }
            ((AutoLayoutSlotComponents) (obj1)).mSharedViews.add(new Pair(view, layoutspec.mSharedViewName));
        }
        obj1.mImageResizeMode = layoutspec.mImageResizeMode;
        layoutspec.mLayoutSubSlot;
        JVM INSTR tableswitch 0 6: default 356
    //                   0 375
    //                   1 404
    //                   2 433
    //                   3 462
    //                   4 491
    //                   5 520
    //                   6 529;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_529;
_L12:
        if (s2 != null)
        {
            mBuildMap.put(s1, s2);
            return this;
        } else
        {
            mBuildMap.put(s1, obj1);
            return this;
        }
_L5:
        if (view instanceof ViewGroup)
        {
            obj1.mImageContainer = (ViewGroup)view;
        } else
        {
            GamesLog.e("AutoSlotBuilder", "Image container layout slot does not extend ViewGroup");
        }
          goto _L12
_L6:
        if (view instanceof ImageView)
        {
            obj1.mImage = (ImageView)view;
        } else
        {
            GamesLog.e("AutoSlotBuilder", "Image layout slot does not extend ImageView");
        }
          goto _L12
_L7:
        if (view instanceof TextView)
        {
            obj1.mTitle = (TextView)view;
        } else
        {
            GamesLog.e("AutoSlotBuilder", "Title layout slot does not extend TextView");
        }
          goto _L12
_L8:
        if (view instanceof TextView)
        {
            obj1.mSubtitle = (TextView)view;
        } else
        {
            GamesLog.e("AutoSlotBuilder", "Subtitle layout slot does not extend TextView");
        }
          goto _L12
_L9:
        if (view instanceof ProgressBar)
        {
            obj1.mProgressBar = (ProgressBar)view;
        } else
        {
            GamesLog.e("AutoSlotBuilder", "Progress layout slot does not extend ProgressBar");
        }
          goto _L12
_L10:
        obj1.mOverlay = view;
          goto _L12
        if (view instanceof ImageView)
        {
            obj1.mOverflowImage = (ImageView)view;
        } else
        {
            GamesLog.e("AutoSlotBuilder", "Image layout slot does not extend ImageView");
        }
          goto _L12
    }

    public final LayoutSlot createLayoutSlot(AutoLayoutSlotComponents autolayoutslotcomponents, String s)
    {
        if (autolayoutslotcomponents.mLayoutSlotType != null)
        {
            return AppContentUtils.createLayoutSlot(autolayoutslotcomponents.mLayoutSlotType, autolayoutslotcomponents.mRoot);
        } else
        {
            return new AutoLayoutSlot(mContext, s, autolayoutslotcomponents.mRoot, autolayoutslotcomponents.mImageContainer, autolayoutslotcomponents.mImage, autolayoutslotcomponents.mTitle, autolayoutslotcomponents.mSubtitle, autolayoutslotcomponents.mProgressBar, autolayoutslotcomponents.mOverlay, autolayoutslotcomponents.mAnimationType, autolayoutslotcomponents.mSharedViews, autolayoutslotcomponents.mImageResizeMode);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.widget:
//            HexagonShape

public abstract class MetagameAvatarViewBase extends ViewGroup
{

    private static final float HEXAGON_ASPECT_RATIO;
    private static float HEXAGON_TEXT_HEIGHT_FRACTION = 0.5F;
    private static final float ROOT_FIVE;
    protected Rect mCircleBounds;
    private Drawable mFocusedDrawable;
    protected Uri mImageUri;
    protected LoadingImageView mImageView;
    private String mLastPlayerId;
    protected int mLevel;
    protected ShapeDrawable mLevelBackground;
    protected TextView mLevelView;
    protected int mLevelXOffset;
    protected int mLevelYOffset;
    private Drawable mPressedDrawable;
    protected View mShadowView;
    protected boolean mUseLoadingPlaceholder;

    public MetagameAvatarViewBase(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MetagameAvatarViewBase(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mUseLoadingPlaceholder = true;
        mLevelXOffset = 0;
        mLevelYOffset = 0;
        mCircleBounds = new Rect();
        setWillNotDraw(false);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (isPressed() && isClickable())
        {
            if (mPressedDrawable == null)
            {
                mPressedDrawable = getResources().getDrawable(0x7f020144);
            }
            mPressedDrawable.setBounds(mCircleBounds.left, mCircleBounds.top, mCircleBounds.right, mCircleBounds.bottom);
            mPressedDrawable.draw(canvas);
        }
        if (isFocused())
        {
            if (mFocusedDrawable == null)
            {
                mFocusedDrawable = getResources().getDrawable(0x7f020142);
            }
            mFocusedDrawable.setBounds(mCircleBounds.left, mCircleBounds.top, mCircleBounds.right, mCircleBounds.bottom);
            mFocusedDrawable.draw(canvas);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public LoadingImageView getImageView()
    {
        return mImageView;
    }

    public TextView getLevelView()
    {
        return mLevelView;
    }

    protected void onContentsInflated()
    {
        mShadowView = findViewById(0x7f0d01bf);
        mImageView = (LoadingImageView)findViewById(0x7f0d01c0);
        mLevelView = (TextView)findViewById(0x7f0d01c3);
    }

    public final void setData(Bitmap bitmap, Drawable drawable)
    {
        setData(bitmap, drawable, -1);
    }

    public final void setData(Bitmap bitmap, Drawable drawable, int i)
    {
        mLastPlayerId = null;
        if (bitmap != null)
        {
            mImageView.setImageBitmap(bitmap);
        } else
        {
            mImageView.setImageDrawable(drawable);
        }
        mImageUri = null;
        setLevelData(i);
    }

    public final void setData(Uri uri, int i, int j)
    {
        mLastPlayerId = null;
        mImageView.loadUri$3329f911(uri, i, true);
        mImageUri = uri;
        setLevelData(j);
    }

    public final void setData(Uri uri, int i, String s)
    {
        setData(uri, i, 1);
        mLevelView.setText(s);
    }

    public final void setData(Player player)
    {
        setData(player, true);
    }

    public final void setData(Player player, boolean flag)
    {
        String s;
        int i;
        byte byte0;
        s = player.getPlayerId();
        Object obj = player.getHiResImageUri();
        if (mLastPlayerId == null || !mLastPlayerId.equals(s))
        {
            mImageView.loadUri$3329f911(((Uri) (obj)), 0x7f0200db, mUseLoadingPlaceholder);
            mImageUri = ((Uri) (obj));
        }
        if (obj != null)
        {
            mLastPlayerId = s;
        } else
        {
            mLastPlayerId = null;
        }
        byte0 = -1;
        i = byte0;
        if (!flag) goto _L2; else goto _L1
_L1:
        obj = player.getLevelInfo();
        if (obj == null) goto _L4; else goto _L3
_L3:
        i = ((PlayerLevelInfo) (obj)).mCurrentLevel.mLevelNumber;
_L2:
        setLevelData(i);
        if (s == null)
        {
            mLevelView.setText(getContext().getString(0x7f1001ee));
        }
        setContentDescription(getContext().getString(0x7f1000a1, new Object[] {
            player.getDisplayName(), Integer.valueOf(i)
        }));
        return;
_L4:
        i = byte0;
        if (s == null)
        {
            i = 1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void setLevelBackgroundColor(int i)
    {
        if (mLevelBackground != null)
        {
            mLevelBackground.getPaint().setColor(i);
        }
    }

    protected void setLevelData(int i)
    {
        mLevel = i;
        if (mLevel > 0)
        {
            mLevelView.setVisibility(0);
            mLevelView.setText(String.valueOf(mLevel));
            mLevelBackground = new ShapeDrawable(new HexagonShape());
            mLevelBackground.getPaint().setColor(UiUtils.getLevelColor(getResources(), mLevel));
            if (PlatformVersion.checkVersion(16))
            {
                mLevelView.setBackground(mLevelBackground);
                return;
            } else
            {
                mLevelView.setBackgroundDrawable(mLevelBackground);
                return;
            }
        } else
        {
            mLevelView.setVisibility(8);
            return;
        }
    }

    protected final void setLevelOffsets(int i, float f)
    {
        float f1 = 1.0F + -0.25F * Math.max(0.0F, Math.min(((float)i / getResources().getDisplayMetrics().density - 60F) / 90F, 1.0F));
        float f2 = ((float)i / 9F) * ((2.0F + ROOT_FIVE) - (float)Math.sqrt(4F * ROOT_FIVE + 9F * (f * f - 1.0F)));
        f = f2 * HEXAGON_ASPECT_RATIO;
        int j = Math.round(f2 * f1);
        i = Math.round(f * f1);
        mLevelXOffset = Math.round((1.0F - f1) * 0.5F * f2);
        mLevelYOffset = Math.round((1.0F - f1) * 0.5F * f);
        f2 = HEXAGON_TEXT_HEIGHT_FRACTION;
        mLevelView.setTextSize(0, f * f1 * f2);
        j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        mLevelView.measure(j, i);
    }

    public final void setUseLoadingPlaceholder$1385ff()
    {
        mUseLoadingPlaceholder = false;
    }

    static 
    {
        float f = (float)Math.sqrt(5D);
        ROOT_FIVE = f;
        HEXAGON_ASPECT_RATIO = f / 2.0F;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package android.support.v7.app:
//            MediaRouterThemeHelper, MediaRouteDialogFactory, MediaRouteChooserDialogFragment, MediaRouteControllerDialogFragment

public class MediaRouteButton extends View
{
    private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
    {

        final MediaRouteButton this$0;

        public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
        {
            refreshRoute();
        }

        public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
        {
            refreshRoute();
        }

        public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
        {
            refreshRoute();
        }

        public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoute();
        }

        public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoute();
        }

        public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoute();
        }

        public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoute();
        }

        public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoute();
        }

        private MediaRouterCallback()
        {
            this$0 = MediaRouteButton.this;
            super();
        }

    }


    private static final int CHECKABLE_STATE_SET[] = {
        0x101009f
    };
    private static final int CHECKED_STATE_SET[] = {
        0x10100a0
    };
    private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
    private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
    private static final String TAG = "MediaRouteButton";
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private boolean mCheatSheetEnabled;
    private MediaRouteDialogFactory mDialogFactory;
    private boolean mIsConnecting;
    private int mMinHeight;
    private int mMinWidth;
    private boolean mRemoteActive;
    private Drawable mRemoteIndicator;
    private final MediaRouter mRouter;
    private MediaRouteSelector mSelector;

    public MediaRouteButton(Context context)
    {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.mediarouter.R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset, int i)
    {
        super(MediaRouterThemeHelper.createThemedContext(context, false), attributeset, i);
        mSelector = MediaRouteSelector.EMPTY;
        mDialogFactory = MediaRouteDialogFactory.getDefault();
        context = getContext();
        mRouter = MediaRouter.getInstance(context);
        mCallback = new MediaRouterCallback();
        context = context.obtainStyledAttributes(attributeset, android.support.v7.mediarouter.R.styleable.MediaRouteButton, i, 0);
        setRemoteIndicatorDrawable(context.getDrawable(2));
        mMinWidth = context.getDimensionPixelSize(0, 0);
        mMinHeight = context.getDimensionPixelSize(1, 0);
        context.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    private Activity getActivity()
    {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext())
        {
            if (context instanceof Activity)
            {
                return (Activity)context;
            }
        }

        return null;
    }

    private FragmentManager getFragmentManager()
    {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity)
        {
            return ((FragmentActivity)activity).getSupportFragmentManager();
        } else
        {
            return null;
        }
    }

    private void refreshRoute()
    {
        boolean flag3 = false;
        if (mAttachedToWindow)
        {
            android.support.v7.media.MediaRouter.RouteInfo routeinfo = mRouter.getSelectedRoute();
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (!routeinfo.isDefault() && routeinfo.matchesSelector(mSelector))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag3;
            if (flag1)
            {
                flag2 = flag3;
                if (routeinfo.isConnecting())
                {
                    flag2 = true;
                }
            }
            flag = false;
            if (mRemoteActive != flag1)
            {
                mRemoteActive = flag1;
                flag = true;
            }
            if (mIsConnecting != flag2)
            {
                mIsConnecting = flag2;
                flag = true;
            }
            if (flag)
            {
                refreshDrawableState();
            }
            setEnabled(mRouter.isRouteAvailable(mSelector, 1));
        }
    }

    private void setRemoteIndicatorDrawable(Drawable drawable)
    {
        if (mRemoteIndicator != null)
        {
            mRemoteIndicator.setCallback(null);
            unscheduleDrawable(mRemoteIndicator);
        }
        mRemoteIndicator = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
        refreshDrawableState();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mRemoteIndicator != null)
        {
            int ai[] = getDrawableState();
            mRemoteIndicator.setState(ai);
            invalidate();
        }
    }

    public MediaRouteDialogFactory getDialogFactory()
    {
        return mDialogFactory;
    }

    public MediaRouteSelector getRouteSelector()
    {
        return mSelector;
    }

    public void jumpDrawablesToCurrentState()
    {
        if (getBackground() != null)
        {
            DrawableCompat.jumpToCurrentState(getBackground());
        }
        if (mRemoteIndicator != null)
        {
            DrawableCompat.jumpToCurrentState(mRemoteIndicator);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mAttachedToWindow = true;
        if (!mSelector.isEmpty())
        {
            mRouter.addCallback(mSelector, mCallback);
        }
        refreshRoute();
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (mIsConnecting)
        {
            mergeDrawableStates(ai, CHECKABLE_STATE_SET);
        } else
        if (mRemoteActive)
        {
            mergeDrawableStates(ai, CHECKED_STATE_SET);
            return ai;
        }
        return ai;
    }

    public void onDetachedFromWindow()
    {
        mAttachedToWindow = false;
        if (!mSelector.isEmpty())
        {
            mRouter.removeCallback(mCallback);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mRemoteIndicator != null)
        {
            int j1 = getPaddingLeft();
            int k1 = getWidth();
            int l1 = getPaddingRight();
            int k = getPaddingTop();
            int l = getHeight();
            int i1 = getPaddingBottom();
            int i = mRemoteIndicator.getIntrinsicWidth();
            int j = mRemoteIndicator.getIntrinsicHeight();
            j1 += (k1 - l1 - j1 - i) / 2;
            k += (l - i1 - k - j) / 2;
            mRemoteIndicator.setBounds(j1, k, j1 + i, k + j);
            mRemoteIndicator.draw(canvas);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int k1;
        i1 = 0;
        l = android.view.View.MeasureSpec.getSize(i);
        k = android.view.View.MeasureSpec.getSize(j);
        int j1 = android.view.View.MeasureSpec.getMode(i);
        j = android.view.View.MeasureSpec.getMode(j);
        k1 = mMinWidth;
        int l1;
        if (mRemoteIndicator != null)
        {
            i = mRemoteIndicator.getIntrinsicWidth();
        } else
        {
            i = 0;
        }
        k1 = Math.max(k1, i);
        l1 = mMinHeight;
        i = i1;
        if (mRemoteIndicator != null)
        {
            i = mRemoteIndicator.getIntrinsicHeight();
        }
        i1 = Math.max(l1, i);
        j1;
        JVM INSTR lookupswitch 2: default 116
    //                   -2147483648: 187
    //                   1073741824: 181;
           goto _L1 _L2 _L3
_L1:
        i = getPaddingLeft() + k1 + getPaddingRight();
_L7:
        j;
        JVM INSTR lookupswitch 2: default 156
    //                   -2147483648: 213
    //                   1073741824: 208;
           goto _L4 _L5 _L6
_L4:
        j = getPaddingTop() + i1 + getPaddingBottom();
_L8:
        setMeasuredDimension(i, j);
        return;
_L3:
        i = l;
          goto _L7
_L2:
        i = Math.min(l, getPaddingLeft() + k1 + getPaddingRight());
          goto _L7
_L6:
        j = k;
          goto _L8
_L5:
        j = Math.min(k, getPaddingTop() + i1 + getPaddingBottom());
          goto _L8
    }

    public boolean performClick()
    {
        boolean flag = false;
        boolean flag1 = super.performClick();
        if (!flag1)
        {
            playSoundEffect(0);
        }
        if (showDialog() || flag1)
        {
            flag = true;
        }
        return flag;
    }

    public boolean performLongClick()
    {
        if (super.performLongClick())
        {
            return true;
        }
        if (!mCheatSheetEnabled)
        {
            return false;
        }
        Object obj = getContentDescription();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = ai[1];
        int l = j / 2;
        int i1 = context.getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(context, ((CharSequence) (obj)), 0);
        if (k + l < rect.height())
        {
            ((Toast) (obj)).setGravity(0x800035, i1 - ai[0] - i / 2, j);
        } else
        {
            ((Toast) (obj)).setGravity(81, 0, j);
        }
        ((Toast) (obj)).show();
        performHapticFeedback(0);
        return true;
    }

    void setCheatSheetEnabled(boolean flag)
    {
        mCheatSheetEnabled = flag;
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaroutedialogfactory)
    {
        if (mediaroutedialogfactory == null)
        {
            throw new IllegalArgumentException("factory must not be null");
        } else
        {
            mDialogFactory = mediaroutedialogfactory;
            return;
        }
    }

    public void setRouteSelector(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!mSelector.equals(mediarouteselector))
        {
            if (mAttachedToWindow)
            {
                if (!mSelector.isEmpty())
                {
                    mRouter.removeCallback(mCallback);
                }
                if (!mediarouteselector.isEmpty())
                {
                    mRouter.addCallback(mediarouteselector, mCallback);
                }
            }
            mSelector = mediarouteselector;
            refreshRoute();
        }
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (mRemoteIndicator != null)
        {
            Drawable drawable = mRemoteIndicator;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    public boolean showDialog()
    {
        if (!mAttachedToWindow)
        {
            return false;
        }
        FragmentManager fragmentmanager = getFragmentManager();
        if (fragmentmanager == null)
        {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        android.support.v7.media.MediaRouter.RouteInfo routeinfo = mRouter.getSelectedRoute();
        if (routeinfo.isDefault() || !routeinfo.matchesSelector(mSelector))
        {
            if (fragmentmanager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null)
            {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            MediaRouteChooserDialogFragment mediaroutechooserdialogfragment = mDialogFactory.onCreateChooserDialogFragment();
            mediaroutechooserdialogfragment.setRouteSelector(mSelector);
            mediaroutechooserdialogfragment.show(fragmentmanager, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
        } else
        {
            if (fragmentmanager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
            {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            mDialogFactory.onCreateControllerDialogFragment().show(fragmentmanager, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
        }
        return true;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mRemoteIndicator;
    }


}

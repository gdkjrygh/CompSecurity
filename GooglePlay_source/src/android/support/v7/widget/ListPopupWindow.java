// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.support.v7.internal.widget.ListViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ListPopupWindow
{
    private static final class DropDownListView extends ListViewCompat
    {

        private boolean mDrawsInPressedState;
        private boolean mHijackFocus;
        private boolean mListSelectionHidden;
        private ListViewAutoScrollHelper mScrollHelper;

        public final boolean hasFocus()
        {
            return mHijackFocus || super.hasFocus();
        }

        public final boolean hasWindowFocus()
        {
            return mHijackFocus || super.hasWindowFocus();
        }

        public final boolean isFocused()
        {
            return mHijackFocus || super.isFocused();
        }

        public final boolean isInTouchMode()
        {
            return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
        }

        public final boolean onForwardedEvent(MotionEvent motionevent, int i)
        {
            boolean flag;
            int j;
            boolean flag1;
            boolean flag2;
            flag1 = true;
            flag2 = true;
            flag = false;
            j = MotionEventCompat.getActionMasked(motionevent);
            j;
            JVM INSTR tableswitch 1 3: default 44
        //                       1 129
        //                       2 132
        //                       3 120;
               goto _L1 _L2 _L3 _L4
_L1:
            flag1 = flag2;
            i = ((flag) ? 1 : 0);
_L10:
            if (!flag1 || i != 0)
            {
                mDrawsInPressedState = false;
                setPressed(false);
                drawableStateChanged();
            }
            if (!flag1) goto _L6; else goto _L5
_L5:
            if (mScrollHelper == null)
            {
                mScrollHelper = new ListViewAutoScrollHelper(this);
            }
            mScrollHelper.setEnabled(true);
            mScrollHelper.onTouch(this, motionevent);
_L8:
            return flag1;
_L4:
            flag1 = false;
            i = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
_L2:
            flag1 = false;
_L3:
            int k = motionevent.findPointerIndex(i);
            if (k < 0)
            {
                flag1 = false;
                i = ((flag) ? 1 : 0);
                continue; /* Loop/switch isn't completed */
            }
            i = (int)motionevent.getX(k);
            int l = (int)motionevent.getY(k);
            k = pointToPosition(i, l);
            if (k == -1)
            {
                i = 1;
                continue; /* Loop/switch isn't completed */
            }
            View view = getChildAt(k - getFirstVisiblePosition());
            float f = i;
            float f1 = l;
            mDrawsInPressedState = true;
            setPressed(true);
            layoutChildren();
            setSelection(k);
            Drawable drawable = getSelector();
            float f2;
            float f3;
            Object obj;
            boolean flag3;
            if (drawable != null && k != -1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                drawable.setVisible(false, false);
            }
            obj = super.mSelectorRect;
            ((Rect) (obj)).set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            obj.left = ((Rect) (obj)).left - super.mSelectionLeftPadding;
            obj.top = ((Rect) (obj)).top - super.mSelectionTopPadding;
            obj.right = ((Rect) (obj)).right + super.mSelectionRightPadding;
            obj.bottom = ((Rect) (obj)).bottom + super.mSelectionBottomPadding;
            flag1 = super.mIsChildViewEnabled.getBoolean(this);
            if (view.isEnabled() == flag1)
            {
                break MISSING_BLOCK_LABEL_408;
            }
            obj = super.mIsChildViewEnabled;
            if (!flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((Field) (obj)).set(this, Boolean.valueOf(flag1));
            if (k != -1)
            {
                try
                {
                    refreshDrawableState();
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    illegalaccessexception.printStackTrace();
                }
            }
            if (i != 0)
            {
                obj = super.mSelectorRect;
                f2 = ((Rect) (obj)).exactCenterX();
                f3 = ((Rect) (obj)).exactCenterY();
                if (getVisibility() == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                drawable.setVisible(flag1, false);
                DrawableCompat.setHotspot(drawable, f2, f3);
            }
            drawable = getSelector();
            if (drawable != null && k != -1)
            {
                DrawableCompat.setHotspot(drawable, f, f1);
            }
            setSelectorEnabled(false);
            refreshDrawableState();
            flag3 = true;
            i = ((flag) ? 1 : 0);
            flag1 = flag3;
            if (j == 1)
            {
                performItemClick(view, k, getItemIdAtPosition(k));
                i = ((flag) ? 1 : 0);
                flag1 = flag3;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (mScrollHelper == null) goto _L8; else goto _L7
_L7:
            mScrollHelper.setEnabled(false);
            return flag1;
            if (true) goto _L10; else goto _L9
_L9:
        }

        protected final boolean touchModeDrawsInPressedStateCompat()
        {
            return mDrawsInPressedState || super.touchModeDrawsInPressedStateCompat();
        }


/*
        static boolean access$502(DropDownListView dropdownlistview, boolean flag)
        {
            dropdownlistview.mListSelectionHidden = flag;
            return flag;
        }

*/

        public DropDownListView(Context context, boolean flag)
        {
            super(context, 0x7f010134);
            mHijackFocus = flag;
            setCacheColorHint(0);
        }
    }

    public static abstract class ForwardingListener
        implements android.view.View.OnTouchListener
    {

        private int mActivePointerId;
        private Runnable mDisallowIntercept;
        private boolean mForwarding;
        private final int mLongPressTimeout;
        private final float mScaledTouchSlop;
        private final View mSrc;
        private final int mTapTimeout = ViewConfiguration.getTapTimeout();
        private final int mTmpLocation[] = new int[2];
        private Runnable mTriggerLongPress;
        private boolean mWasLongPress;

        private void clearCallbacks()
        {
            if (mTriggerLongPress != null)
            {
                mSrc.removeCallbacks(mTriggerLongPress);
            }
            if (mDisallowIntercept != null)
            {
                mSrc.removeCallbacks(mDisallowIntercept);
            }
        }

        private boolean onTouchForwarded(MotionEvent motionevent)
        {
            boolean flag1 = true;
            View view = mSrc;
            Object obj = getPopup();
            if (obj == null || !((ListPopupWindow) (obj)).mPopup.isShowing())
            {
                flag1 = false;
            } else
            {
                obj = ((ListPopupWindow) (obj)).mDropDownList;
                if (obj == null || !((DropDownListView) (obj)).isShown())
                {
                    return false;
                }
                MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
                int ai1[] = mTmpLocation;
                view.getLocationOnScreen(ai1);
                motionevent1.offsetLocation(ai1[0], ai1[1]);
                int ai[] = mTmpLocation;
                ((View) (obj)).getLocationOnScreen(ai);
                motionevent1.offsetLocation(-ai[0], -ai[1]);
                boolean flag2 = ((DropDownListView) (obj)).onForwardedEvent(motionevent1, mActivePointerId);
                motionevent1.recycle();
                int i = MotionEventCompat.getActionMasked(motionevent);
                boolean flag;
                if (i != 1 && i != 3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag2 || !flag)
                {
                    return false;
                }
            }
            return flag1;
        }

        public abstract ListPopupWindow getPopup();

        public boolean onForwardingStarted()
        {
            ListPopupWindow listpopupwindow = getPopup();
            if (listpopupwindow != null && !listpopupwindow.mPopup.isShowing())
            {
                listpopupwindow.show();
            }
            return true;
        }

        public boolean onForwardingStopped()
        {
            ListPopupWindow listpopupwindow = getPopup();
            if (listpopupwindow != null && listpopupwindow.mPopup.isShowing())
            {
                listpopupwindow.dismiss();
            }
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag2 = mForwarding;
            if (!flag2) goto _L2; else goto _L1
_L1:
            boolean flag;
            if (mWasLongPress)
            {
                flag = onTouchForwarded(motionevent);
            } else
            if (onTouchForwarded(motionevent) || !onForwardingStopped())
            {
                flag = true;
            } else
            {
                flag = false;
            }
_L9:
            mForwarding = flag;
            float f;
            float f1;
            float f2;
            int i;
            long l;
            boolean flag1;
            return flag || flag2;
_L2:
            view = mSrc;
            if (!view.isEnabled()) goto _L4; else goto _L3
_L3:
            MotionEventCompat.getActionMasked(motionevent);
            JVM INSTR tableswitch 0 3: default 116
        //                       0 180
        //                       1 389
        //                       2 265
        //                       3 389;
               goto _L5 _L6 _L7 _L8 _L7
_L5:
            break; /* Loop/switch isn't completed */
_L7:
            break MISSING_BLOCK_LABEL_389;
_L4:
            i = 0;
_L12:
            if (i != 0 && onForwardingStarted())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1;
            if (flag1)
            {
                l = SystemClock.uptimeMillis();
                view = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
                mSrc.onTouchEvent(view);
                view.recycle();
                flag = flag1;
            }
              goto _L9
_L6:
            mActivePointerId = motionevent.getPointerId(0);
            mWasLongPress = false;
            if (mDisallowIntercept == null)
            {
                mDisallowIntercept = new DisallowIntercept((byte)0);
            }
            view.postDelayed(mDisallowIntercept, mTapTimeout);
            if (mTriggerLongPress == null)
            {
                mTriggerLongPress = new TriggerLongPress((byte)0);
            }
            view.postDelayed(mTriggerLongPress, mLongPressTimeout);
              goto _L4
_L8:
            i = motionevent.findPointerIndex(mActivePointerId);
            if (i < 0) goto _L4; else goto _L10
_L10:
            f = motionevent.getX(i);
            f1 = motionevent.getY(i);
            f2 = mScaledTouchSlop;
            if (f >= -f2 && f1 >= -f2 && f < (float)(view.getRight() - view.getLeft()) + f2 && f1 < (float)(view.getBottom() - view.getTop()) + f2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0) goto _L4; else goto _L11
_L11:
            clearCallbacks();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            i = 1;
              goto _L12
            clearCallbacks();
              goto _L4
        }


/*
        static void access$1000(ForwardingListener forwardinglistener)
        {
            forwardinglistener.clearCallbacks();
            View view;
            for (view = forwardinglistener.mSrc; !view.isEnabled() || view.isLongClickable() || !forwardinglistener.onForwardingStarted();)
            {
                return;
            }

            view.getParent().requestDisallowInterceptTouchEvent(true);
            long l = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            view.onTouchEvent(motionevent);
            motionevent.recycle();
            forwardinglistener.mForwarding = true;
            forwardinglistener.mWasLongPress = true;
            return;
        }

*/


        public ForwardingListener(View view)
        {
            mSrc = view;
            mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mLongPressTimeout = (mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
        }
    }

    private final class ForwardingListener.DisallowIntercept
        implements Runnable
    {

        final ForwardingListener this$0;

        public final void run()
        {
            mSrc.getParent().requestDisallowInterceptTouchEvent(true);
        }

        private ForwardingListener.DisallowIntercept()
        {
            this$0 = ForwardingListener.this;
            super();
        }

        ForwardingListener.DisallowIntercept(byte byte0)
        {
            this();
        }
    }

    private final class ForwardingListener.TriggerLongPress
        implements Runnable
    {

        final ForwardingListener this$0;

        public final void run()
        {
            clearCallbacks();
        }

        private ForwardingListener.TriggerLongPress()
        {
            this$0 = ForwardingListener.this;
            super();
        }

        ForwardingListener.TriggerLongPress(byte byte0)
        {
            this();
        }
    }

    private final class ListSelectorHider
        implements Runnable
    {

        final ListPopupWindow this$0;

        public final void run()
        {
            clearListSelection();
        }

        private ListSelectorHider()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

        ListSelectorHider(byte byte0)
        {
            this();
        }
    }

    private final class PopupDataSetObserver extends DataSetObserver
    {

        final ListPopupWindow this$0;

        public final void onChanged()
        {
            if (mPopup.isShowing())
            {
                show();
            }
        }

        public final void onInvalidated()
        {
            dismiss();
        }

        private PopupDataSetObserver()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

        PopupDataSetObserver(byte byte0)
        {
            this();
        }
    }

    private final class PopupScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        final ListPopupWindow this$0;

        public final void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public final void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1 && !isInputMethodNotNeeded() && mPopup.getContentView() != null)
            {
                mHandler.removeCallbacks(mResizePopupRunnable);
                mResizePopupRunnable.run();
            }
        }

        private PopupScrollListener()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

        PopupScrollListener(byte byte0)
        {
            this();
        }
    }

    private final class PopupTouchInterceptor
        implements android.view.View.OnTouchListener
    {

        final ListPopupWindow this$0;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            int i;
            int j;
            int k;
            i = motionevent.getAction();
            j = (int)motionevent.getX();
            k = (int)motionevent.getY();
            if (i != 0 || mPopup == null || !mPopup.isShowing() || j < 0 || j >= mPopup.getWidth() || k < 0 || k >= mPopup.getHeight()) goto _L2; else goto _L1
_L1:
            mHandler.postDelayed(mResizePopupRunnable, 250L);
_L4:
            return false;
_L2:
            if (i == 1)
            {
                mHandler.removeCallbacks(mResizePopupRunnable);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private PopupTouchInterceptor()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

        PopupTouchInterceptor(byte byte0)
        {
            this();
        }
    }

    private final class ResizePopupRunnable
        implements Runnable
    {

        final ListPopupWindow this$0;

        public final void run()
        {
            if (mDropDownList != null && mDropDownList.getCount() > mDropDownList.getChildCount() && mDropDownList.getChildCount() <= mListItemExpandMaximum)
            {
                mPopup.setInputMethodMode(2);
                show();
            }
        }

        private ResizePopupRunnable()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

        ResizePopupRunnable(byte byte0)
        {
            this();
        }
    }


    private static Method sClipToWindowEnabledMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    public View mDropDownAnchorView;
    public int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    public DropDownListView mDropDownList;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    public int mDropDownWidth;
    private boolean mForceIgnoreOutsideTouch;
    private Handler mHandler;
    private final ListSelectorHider mHideSelector;
    public android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private int mLayoutDirection;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    public PopupWindow mPopup;
    public int mPromptPosition;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    public Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    public ListPopupWindow(Context context)
    {
        this(context, null, 0x7f010135);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i, int j)
    {
        mDropDownHeight = -2;
        mDropDownWidth = -2;
        mDropDownGravity = 0;
        mDropDownAlwaysVisible = false;
        mForceIgnoreOutsideTouch = false;
        mListItemExpandMaximum = 0x7fffffff;
        mPromptPosition = 0;
        mResizePopupRunnable = new ResizePopupRunnable((byte)0);
        mTouchInterceptor = new PopupTouchInterceptor((byte)0);
        mScrollListener = new PopupScrollListener((byte)0);
        mHideSelector = new ListSelectorHider((byte)0);
        mHandler = new Handler();
        mTempRect = new Rect();
        mContext = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ListPopupWindow, i, j);
        mDropDownHorizontalOffset = typedarray.getDimensionPixelOffset(0, 0);
        mDropDownVerticalOffset = typedarray.getDimensionPixelOffset(1, 0);
        if (mDropDownVerticalOffset != 0)
        {
            mDropDownVerticalOffsetSet = true;
        }
        typedarray.recycle();
        mPopup = new AppCompatPopupWindow(context, attributeset, i);
        mPopup.setInputMethodMode(1);
        mLayoutDirection = TextUtilsCompat.getLayoutDirectionFromLocale(mContext.getResources().getConfiguration().locale);
    }

    public final void clearListSelection()
    {
        DropDownListView dropdownlistview = mDropDownList;
        if (dropdownlistview != null)
        {
            dropdownlistview.mListSelectionHidden = true;
            dropdownlistview.requestLayout();
        }
    }

    public final void dismiss()
    {
        mPopup.dismiss();
        mPopup.setContentView(null);
        mDropDownList = null;
        mHandler.removeCallbacks(mResizePopupRunnable);
    }

    public final boolean isInputMethodNotNeeded()
    {
        return mPopup.getInputMethodMode() == 2;
    }

    public final boolean isShowing()
    {
        return mPopup.isShowing();
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (mObserver != null) goto _L2; else goto _L1
_L1:
        mObserver = new PopupDataSetObserver((byte)0);
_L4:
        mAdapter = listadapter;
        if (mAdapter != null)
        {
            listadapter.registerDataSetObserver(mObserver);
        }
        if (mDropDownList != null)
        {
            mDropDownList.setAdapter(mAdapter);
        }
        return;
_L2:
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mObserver);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void setModal$1385ff()
    {
        mModal = true;
        mPopup.setFocusable(true);
    }

    public final void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mPopup.setOnDismissListener(ondismisslistener);
    }

    public final void show()
    {
        int i;
        int j;
        int k;
        int l;
        if (mDropDownList == null)
        {
            Object obj = mContext;
            mShowDropDownRunnable = new Runnable() {

                final ListPopupWindow this$0;

                public final void run()
                {
                    View view = mDropDownAnchorView;
                    if (view != null && view.getWindowToken() != null)
                    {
                        show();
                    }
                }

            
            {
                this$0 = ListPopupWindow.this;
                super();
            }
            };
            boolean flag;
            if (!mModal)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mDropDownList = new DropDownListView(((Context) (obj)), flag);
            mDropDownList.setAdapter(mAdapter);
            mDropDownList.setOnItemClickListener(mItemClickListener);
            mDropDownList.setFocusable(true);
            mDropDownList.setFocusableInTouchMode(true);
            mDropDownList.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final ListPopupWindow this$0;

                public final void onItemSelected(AdapterView adapterview, View view, int j2, long l2)
                {
                    if (j2 != -1)
                    {
                        adapterview = mDropDownList;
                        if (adapterview != null)
                        {
                            adapterview.mListSelectionHidden = false;
                        }
                    }
                }

                public final void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = ListPopupWindow.this;
                super();
            }
            });
            mDropDownList.setOnScrollListener(mScrollListener);
            obj = mDropDownList;
            mPopup.setContentView(((View) (obj)));
        } else
        {
            mPopup.getContentView();
        }
        l = 0;
        obj = mPopup.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(mTempRect);
            i = mTempRect.top + mTempRect.bottom;
            l = i;
            if (!mDropDownVerticalOffsetSet)
            {
                mDropDownVerticalOffset = -mTempRect.top;
                l = i;
            }
        } else
        {
            mTempRect.setEmpty();
        }
        mPopup.getInputMethodMode();
        i = mPopup.getMaxAvailableHeight(mDropDownAnchorView, mDropDownVerticalOffset);
        if (mDropDownHeight != -1) goto _L2; else goto _L1
_L1:
        i += l;
_L16:
        j = 0;
        k = 0;
        flag = isInputMethodNotNeeded();
        if (!mPopup.isShowing()) goto _L4; else goto _L3
_L3:
        int k1;
        if (mDropDownWidth == -1)
        {
            j = -1;
        } else
        if (mDropDownWidth == -2)
        {
            j = mDropDownAnchorView.getWidth();
        } else
        {
            j = mDropDownWidth;
        }
        if (mDropDownHeight == -1)
        {
            if (!flag)
            {
                i = -1;
            }
            if (flag)
            {
                obj = mPopup;
                Object obj1;
                DropDownListView dropdownlistview;
                ListAdapter listadapter;
                android.view.ViewGroup.LayoutParams layoutparams;
                int i1;
                int j1;
                int l1;
                int i2;
                if (mDropDownWidth == -1)
                {
                    k = -1;
                } else
                {
                    k = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(k, 0);
            } else
            {
                PopupWindow popupwindow = mPopup;
                if (mDropDownWidth == -1)
                {
                    k = -1;
                } else
                {
                    k = 0;
                }
                popupwindow.setWindowLayoutMode(k, -1);
            }
        } else
        if (mDropDownHeight != -2)
        {
            i = mDropDownHeight;
        }
        mPopup.setOutsideTouchable(true);
        mPopup.update(mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset, j, i);
_L14:
        return;
_L2:
        mDropDownWidth;
        JVM INSTR tableswitch -2 -1: default 392
    //                   -2 485
    //                   -1 525;
           goto _L5 _L6 _L7
_L5:
        j = android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x40000000);
_L10:
        dropdownlistview = mDropDownList;
        l1 = i + 0;
        i = dropdownlistview.getListPaddingTop();
        k = dropdownlistview.getListPaddingBottom();
        dropdownlistview.getListPaddingLeft();
        dropdownlistview.getListPaddingRight();
        i1 = dropdownlistview.getDividerHeight();
        obj1 = dropdownlistview.getDivider();
        listadapter = dropdownlistview.getAdapter();
        if (listadapter != null) goto _L9; else goto _L8
_L8:
        k += i;
_L11:
        Exception exception;
        if (k > 0)
        {
            i = l + 0;
        } else
        {
            i = 0;
        }
        i = k + i;
        continue; /* Loop/switch isn't completed */
_L6:
        j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x80000000);
          goto _L10
_L7:
        j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x40000000);
          goto _L10
_L9:
        i = k + i;
        if (i1 <= 0 || obj1 == null)
        {
            i1 = 0;
        }
        obj1 = null;
        k1 = 0;
        i2 = listadapter.getCount();
        j1 = 0;
_L12:
        k = i;
        if (j1 < i2)
        {
label0:
            {
                k = listadapter.getItemViewType(j1);
                if (k != k1)
                {
                    obj1 = null;
                } else
                {
                    k = k1;
                }
                obj1 = listadapter.getView(j1, ((View) (obj1)), dropdownlistview);
                layoutparams = ((View) (obj1)).getLayoutParams();
                if (layoutparams != null && layoutparams.height > 0)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                } else
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                ((View) (obj1)).measure(j, k1);
                if (j1 > 0)
                {
                    i += i1;
                }
                i = ((View) (obj1)).getMeasuredHeight() + i;
                if (i < l1)
                {
                    break label0;
                }
                k = l1;
            }
        }
          goto _L11
        j1++;
        k1 = k;
          goto _L12
_L4:
        if (mDropDownWidth == -1)
        {
            j = -1;
        } else
        if (mDropDownWidth == -2)
        {
            mPopup.setWidth(mDropDownAnchorView.getWidth());
        } else
        {
            mPopup.setWidth(mDropDownWidth);
        }
        if (mDropDownHeight == -1)
        {
            i = -1;
        } else
        if (mDropDownHeight == -2)
        {
            mPopup.setHeight(i);
            i = k;
        } else
        {
            mPopup.setHeight(mDropDownHeight);
            i = k;
        }
        mPopup.setWindowLayoutMode(j, i);
        if (sClipToWindowEnabledMethod != null)
        {
            try
            {
                sClipToWindowEnabledMethod.invoke(mPopup, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        mPopup.setOutsideTouchable(true);
        mPopup.setTouchInterceptor(mTouchInterceptor);
        PopupWindowCompat.showAsDropDown(mPopup, mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
        mDropDownList.setSelection(-1);
        if (!mModal || mDropDownList.isInTouchMode())
        {
            clearListSelection();
        }
        if (mModal) goto _L14; else goto _L13
_L13:
        mHandler.post(mHideSelector);
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static 
    {
        try
        {
            sClipToWindowEnabledMethod = android/widget/PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {
                Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }




}

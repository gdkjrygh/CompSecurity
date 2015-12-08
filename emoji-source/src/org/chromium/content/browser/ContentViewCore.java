// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.CommandLine;
import org.chromium.base.ObserverList;
import org.chromium.base.TraceEvent;
import org.chromium.content.browser.accessibility.AccessibilityInjector;
import org.chromium.content.browser.accessibility.BrowserAccessibilityManager;
import org.chromium.content.browser.input.AdapterInputConnection;
import org.chromium.content.browser.input.GamepadList;
import org.chromium.content.browser.input.ImeAdapter;
import org.chromium.content.browser.input.InputMethodManagerWrapper;
import org.chromium.content.browser.input.PastePopupMenu;
import org.chromium.content.browser.input.PopupTouchHandleDrawable;
import org.chromium.content.browser.input.SelectPopup;
import org.chromium.content.browser.input.SelectPopupDialog;
import org.chromium.content.browser.input.SelectPopupDropdown;
import org.chromium.content.browser.input.SelectPopupItem;
import org.chromium.content_public.browser.GestureStateListener;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.ViewAndroid;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.gfx.DeviceDisplayInfo;

// Referenced classes of package org.chromium.content.browser:
//            RenderCoordinates, TouchEventSynthesizer, ContentViewClient, PopupZoomer, 
//            SPenSupport, JavascriptInterface, WebContentsObserverAndroid, ScreenOrientationListener, 
//            PositionObserver, ContentSettings, ViewPositionObserver, InterstitialPageDelegateAndroid, 
//            ContentViewDownloadDelegate, ContentVideoViewClient

public class ContentViewCore
    implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, ScreenOrientationListener.ScreenOrientationObserver
{
    public static interface InternalAccessDelegate
    {

        public abstract boolean awakenScrollBars();

        public abstract boolean drawChild(Canvas canvas, View view, long l);

        public abstract void onScrollChanged(int i, int j, int k, int l);

        public abstract boolean super_awakenScrollBars(int i, boolean flag);

        public abstract boolean super_dispatchKeyEvent(KeyEvent keyevent);

        public abstract boolean super_dispatchKeyEventPreIme(KeyEvent keyevent);

        public abstract void super_onConfigurationChanged(Configuration configuration);

        public abstract boolean super_onGenericMotionEvent(MotionEvent motionevent);

        public abstract boolean super_onKeyUp(int i, KeyEvent keyevent);
    }

    public static interface SmartClipDataListener
    {

        public abstract void onSmartClipDataExtracted(String s, String s1, Rect rect);
    }

    public static interface ZoomControlsDelegate
    {

        public abstract void dismissZoomPicker();

        public abstract void invokeZoomPicker();

        public abstract void updateZoomControls();
    }


    static final boolean $assertionsDisabled;
    public static final int INVALID_RENDER_PROCESS_PID = 0;
    private static final int IS_LONG_PRESS = 1;
    private static final int IS_LONG_TAP = 2;
    private static final ZoomControlsDelegate NO_OP_ZOOM_CONTROLS_DELEGATE = new ZoomControlsDelegate() {

        public void dismissZoomPicker()
        {
        }

        public void invokeZoomPicker()
        {
        }

        public void updateZoomControls()
        {
        }

    };
    private static final String TAG = "ContentViewCore";
    private static final float ZOOM_CONTROLS_EPSILON = 0.007F;
    private AccessibilityInjector mAccessibilityInjector;
    private final AccessibilityManager mAccessibilityManager = (AccessibilityManager)getContext().getSystemService("accessibility");
    private ContentObserver mAccessibilityScriptInjectionObserver;
    private ActionMode mActionMode;
    private org.chromium.content.browser.input.ImeAdapter.AdapterInputConnectionFactory mAdapterInputConnectionFactory;
    private BrowserAccessibilityManager mBrowserAccessibilityManager;
    private ViewGroup mContainerView;
    private InternalAccessDelegate mContainerViewInternals;
    private ContentSettings mContentSettings;
    private ContentViewClient mContentViewClient;
    private final Context mContext;
    private float mCurrentTouchOffsetX;
    private float mCurrentTouchOffsetY;
    private ContentViewDownloadDelegate mDownloadDelegate;
    private final Editable mEditable = android.text.Editable.Factory.getInstance().newEditable("");
    private Runnable mFakeMouseMoveRunnable;
    private final Rect mFocusPreOSKViewportRect = new Rect();
    private boolean mFocusedNodeEditable;
    private boolean mFullscreenRequiredForOrientationLock;
    private final ObserverList mGestureStateListeners = new ObserverList();
    private final org.chromium.base.ObserverList.RewindableIterator mGestureStateListenersIterator;
    private boolean mHasInsertion;
    private boolean mHasSelection;
    private ImeAdapter mImeAdapter;
    private AdapterInputConnection mInputConnection;
    private InputMethodManagerWrapper mInputMethodManagerWrapper;
    private final Map mJavaScriptInterfaces = new HashMap();
    private String mLastSelectedText;
    private int mLastTapX;
    private int mLastTapY;
    private boolean mNativeAccessibilityAllowed;
    private boolean mNativeAccessibilityEnabled;
    private long mNativeContentViewCore;
    private long mNativeSelectPopupSourceFrame;
    private PastePopupMenu mPastePopupMenu;
    private int mPhysicalBackingHeightPix;
    private int mPhysicalBackingWidthPix;
    private PopupZoomer mPopupZoomer;
    private PositionObserver mPositionObserver;
    private int mPotentiallyActiveFlingCount;
    private boolean mPreserveSelectionOnNextLossOfFocus;
    private final RenderCoordinates mRenderCoordinates = new RenderCoordinates();
    private final HashSet mRetainedJavaScriptObjects = new HashSet();
    private SelectPopup mSelectPopup;
    private boolean mShouldSetAccessibilityFocusOnPageLoad;
    private SmartClipDataListener mSmartClipDataListener;
    private int mSmartClipOffsetX;
    private int mSmartClipOffsetY;
    private int mTopControlsLayoutHeightPix;
    private boolean mTouchExplorationEnabled;
    private org.chromium.content.browser.input.PopupTouchHandleDrawable.PopupTouchHandleDrawableDelegate mTouchHandleDelegate;
    private boolean mTouchScrollInProgress;
    private boolean mUnselectAllOnActionModeDismiss;
    private ViewAndroid mViewAndroid;
    private int mViewportHeightPix;
    private int mViewportWidthPix;
    private boolean mWasPastePopupShowingOnInsertionDragStart;
    private WebContents mWebContents;
    private WebContentsObserverAndroid mWebContentsObserver;
    private ZoomControlsDelegate mZoomControlsDelegate;

    public ContentViewCore(Context context)
    {
        mNativeContentViewCore = 0L;
        mNativeSelectPopupSourceFrame = 0L;
        mFakeMouseMoveRunnable = null;
        mSmartClipDataListener = null;
        mFullscreenRequiredForOrientationLock = true;
        mContext = context;
        mAdapterInputConnectionFactory = new org.chromium.content.browser.input.ImeAdapter.AdapterInputConnectionFactory();
        mInputMethodManagerWrapper = new InputMethodManagerWrapper(mContext);
        float f = getContext().getResources().getDisplayMetrics().density;
        context = CommandLine.getInstance().getSwitchValue("force-device-scale-factor");
        if (context != null)
        {
            f = Float.valueOf(context).floatValue();
        }
        mRenderCoordinates.setDeviceScaleFactor(f);
        mGestureStateListenersIterator = mGestureStateListeners.rewindableIterator();
        Selection.setSelection(mEditable, 0);
    }

    private boolean canPaste()
    {
        if (!mFocusedNodeEditable)
        {
            return false;
        } else
        {
            return ((ClipboardManager)mContext.getSystemService("clipboard")).hasPrimaryClip();
        }
    }

    private void cancelRequestToScrollFocusedEditableNodeIntoView()
    {
        mFocusPreOSKViewportRect.setEmpty();
    }

    private ImeAdapter createImeAdapter(Context context)
    {
        return new ImeAdapter(mInputMethodManagerWrapper, new org.chromium.content.browser.input.ImeAdapter.ImeAdapterDelegate() {

            final ContentViewCore this$0;

            public View getAttachedView()
            {
                return mContainerView;
            }

            public ResultReceiver getNewShowKeyboardReceiver()
            {
                return new ResultReceiver(new Handler()) {

                    final _cls3 this$1;

                    public void onReceiveResult(int i, Bundle bundle)
                    {
                        bundle = getContentViewClient();
                        boolean flag;
                        if (i == 2 || i == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        bundle.onImeStateChangeRequested(flag);
                        if (i == 2)
                        {
                            getContainerView().getWindowVisibleDisplayFrame(mFocusPreOSKViewportRect);
                        } else
                        if (hasFocus() && i == 0)
                        {
                            scrollFocusedEditableNodeIntoView();
                            return;
                        }
                    }

            
            {
                this$1 = _cls3.this;
                super(handler);
            }
                };
            }

            public void onDismissInput()
            {
                getContentViewClient().onImeStateChangeRequested(false);
            }

            public void onImeEvent()
            {
                mPopupZoomer.hide(true);
                getContentViewClient().onImeEvent();
                if (mFocusedNodeEditable)
                {
                    hideTextHandles();
                }
            }

            
            {
                this$0 = ContentViewCore.this;
                super();
            }
        });
    }

    private MotionEvent createOffsetMotionEvent(MotionEvent motionevent)
    {
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.offsetLocation(mCurrentTouchOffsetX, mCurrentTouchOffsetY);
        return motionevent;
    }

    private PopupTouchHandleDrawable createPopupTouchHandleDrawable()
    {
        if (mTouchHandleDelegate == null)
        {
            mTouchHandleDelegate = new org.chromium.content.browser.input.PopupTouchHandleDrawable.PopupTouchHandleDrawableDelegate() {

                final ContentViewCore this$0;

                public View getParent()
                {
                    return getContainerView();
                }

                public PositionObserver getParentPositionObserver()
                {
                    return mPositionObserver;
                }

                public boolean isScrollInProgress()
                {
                    return ContentViewCore.this.isScrollInProgress();
                }

                public boolean onTouchHandleEvent(MotionEvent motionevent)
                {
                    return onTouchEventImpl(motionevent, true);
                }

            
            {
                this$0 = ContentViewCore.this;
                super();
            }
            };
        }
        return new PopupTouchHandleDrawable(mTouchHandleDelegate);
    }

    private static Rect createRect(int i, int j, int k, int l)
    {
        return new Rect(i, j, k, l);
    }

    private TouchEventSynthesizer createTouchEventSynthesizer()
    {
        return new TouchEventSynthesizer(this);
    }

    private boolean filterTapOrPressEvent(int i, int j, int k)
    {
        if (i == 5 && offerLongPressToEmbedder())
        {
            return true;
        } else
        {
            updateForTapOrPress(i, j, k);
            return false;
        }
    }

    private ContentVideoViewClient getContentVideoViewClient()
    {
        return getContentViewClient().getContentVideoViewClient();
    }

    private PastePopupMenu getPastePopup()
    {
        if (mPastePopupMenu == null)
        {
            mPastePopupMenu = new PastePopupMenu(getContainerView(), new org.chromium.content.browser.input.PastePopupMenu.PastePopupMenuDelegate() {

                final ContentViewCore this$0;

                public void paste()
                {
                    mImeAdapter.paste();
                    hideTextHandles();
                }

            
            {
                this$0 = ContentViewCore.this;
                super();
            }
            });
        }
        return mPastePopupMenu;
    }

    private void hidePastePopup()
    {
        if (mPastePopupMenu == null)
        {
            return;
        } else
        {
            mPastePopupMenu.hide();
            return;
        }
    }

    private void hidePopups()
    {
        hideSelectActionBar();
        hidePastePopup();
        hideSelectPopup();
        mPopupZoomer.hide(false);
        if (mUnselectAllOnActionModeDismiss)
        {
            hideTextHandles();
        }
    }

    private void hidePopupsAndClearSelection()
    {
        mUnselectAllOnActionModeDismiss = true;
        hidePopups();
    }

    private void hidePopupsAndPreserveSelection()
    {
        mUnselectAllOnActionModeDismiss = false;
        hidePopups();
    }

    private void hideSelectPopup()
    {
        if (mSelectPopup != null)
        {
            mSelectPopup.hide();
        }
    }

    private void hideTextHandles()
    {
        mHasSelection = false;
        mHasInsertion = false;
        if (mNativeContentViewCore != 0L)
        {
            nativeHideTextHandles(mNativeContentViewCore);
        }
    }

    private void initPopupZoomer(Context context)
    {
        mPopupZoomer = new PopupZoomer(context);
        mPopupZoomer.setOnVisibilityChangedListener(new PopupZoomer.OnVisibilityChangedListener() {

            private final ViewGroup mContainerViewAtCreation;
            final ContentViewCore this$0;

            public void onPopupZoomerHidden(PopupZoomer popupzoomer)
            {
                mContainerViewAtCreation.post(popupzoomer. new Runnable() {

                    static final boolean $assertionsDisabled;
                    final _cls5 this$1;
                    final PopupZoomer val$zoomer;

                    public void run()
                    {
                        if (mContainerViewAtCreation.indexOfChild(zoomer) != -1)
                        {
                            mContainerViewAtCreation.removeView(zoomer);
                            mContainerViewAtCreation.invalidate();
                        } else
                        if (!$assertionsDisabled)
                        {
                            throw new AssertionError("PopupZoomer should never be hidden without being shown");
                        }
                    }

                    static 
                    {
                        boolean flag;
                        if (!org/chromium/content/browser/ContentViewCore.desiredAssertionStatus())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        $assertionsDisabled = flag;
                    }

            
            {
                this$1 = final__pcls5;
                zoomer = PopupZoomer.this;
                super();
            }
                });
            }

            public void onPopupZoomerShown(PopupZoomer popupzoomer)
            {
                mContainerViewAtCreation.post(popupzoomer. new Runnable() {

                    static final boolean $assertionsDisabled;
                    final _cls5 this$1;
                    final PopupZoomer val$zoomer;

                    public void run()
                    {
                        if (mContainerViewAtCreation.indexOfChild(zoomer) == -1)
                        {
                            mContainerViewAtCreation.addView(zoomer);
                        } else
                        if (!$assertionsDisabled)
                        {
                            throw new AssertionError("PopupZoomer should never be shown without being hidden");
                        }
                    }

                    static 
                    {
                        boolean flag;
                        if (!org/chromium/content/browser/ContentViewCore.desiredAssertionStatus())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        $assertionsDisabled = flag;
                    }

            
            {
                this$1 = final__pcls5;
                zoomer = PopupZoomer.this;
                super();
            }
                });
            }


            
            {
                this$0 = ContentViewCore.this;
                super();
                mContainerViewAtCreation = mContainerView;
            }
        });
        context = new PopupZoomer.OnTapListener() {

            private final ViewGroup mContainerViewAtCreation;
            final ContentViewCore this$0;

            public boolean onLongPress(View view, MotionEvent motionevent)
            {
                if (mNativeContentViewCore != 0L)
                {
                    nativeLongPress(mNativeContentViewCore, motionevent.getEventTime(), motionevent.getX(), motionevent.getY());
                }
                return true;
            }

            public boolean onSingleTap(View view, MotionEvent motionevent)
            {
                mContainerViewAtCreation.requestFocus();
                if (mNativeContentViewCore != 0L)
                {
                    nativeSingleTap(mNativeContentViewCore, motionevent.getEventTime(), motionevent.getX(), motionevent.getY());
                }
                return true;
            }

            
            {
                this$0 = ContentViewCore.this;
                super();
                mContainerViewAtCreation = mContainerView;
            }
        };
        mPopupZoomer.setOnTapListener(context);
    }

    private boolean isFullscreenRequiredForOrientationLock()
    {
        return mFullscreenRequiredForOrientationLock;
    }

    private static boolean isValidTouchEventActionForNative(int i)
    {
        return i == 0 || i == 1 || i == 3 || i == 2 || i == 5 || i == 6;
    }

    private native void nativeAddJavascriptInterface(long l, Object obj, String s, Class class1);

    private native void nativeDoubleTap(long l, long l1, float f, float f1);

    private native void nativeExtractSmartClipData(long l, int i, int j, int k, int i1);

    private native void nativeFlingCancel(long l, long l1);

    private native void nativeFlingStart(long l, long l1, float f, float f1, float f2, 
            float f3);

    private native int nativeGetCurrentRenderProcessId(long l);

    private native long nativeGetNativeImeAdapter(long l);

    private native WebContents nativeGetWebContentsAndroid(long l);

    private native void nativeHideTextHandles(long l);

    private native long nativeInit(long l, long l1, long l2, HashSet hashset);

    private native void nativeLongPress(long l, long l1, float f, float f1);

    private native void nativeMoveCaret(long l, float f, float f1);

    private native void nativeOnJavaContentViewCoreDestroyed(long l);

    private native boolean nativeOnTouchEvent(long l, MotionEvent motionevent, long l1, int i, int j, 
            int k, int i1, float f, float f1, float f2, float f3, int j1, 
            int k1, float f4, float f5, float f6, float f7, float f8, float f9, 
            float f10, float f11, int i2, int j2, int k2, int l2, boolean flag);

    private native void nativePinchBegin(long l, long l1, float f, float f1);

    private native void nativePinchBy(long l, long l1, float f, float f1, float f2);

    private native void nativePinchEnd(long l, long l1);

    private native void nativePostMessageToFrame(long l, String s, String s1, String s2, String s3);

    private native void nativeRemoveJavascriptInterface(long l, String s);

    private native void nativeResetGestureDetection(long l);

    private native void nativeScrollBegin(long l, long l1, float f, float f1, float f2, 
            float f3);

    private native void nativeScrollBy(long l, long l1, float f, float f1, float f2, 
            float f3);

    private native void nativeScrollEnd(long l, long l1);

    private native void nativeSelectBetweenCoordinates(long l, float f, float f1, float f2, float f3);

    private native void nativeSelectPopupMenuItems(long l, long l1, int ai[]);

    private native int nativeSendMouseMoveEvent(long l, long l1, float f, float f1);

    private native int nativeSendMouseWheelEvent(long l, long l1, float f, float f1, float f2);

    private native void nativeSendOrientationChangeEvent(long l, int i);

    private native void nativeSetAccessibilityEnabled(long l, boolean flag);

    private native void nativeSetAllowJavascriptInterfacesInspection(long l, boolean flag);

    private native void nativeSetBackgroundOpaque(long l, boolean flag);

    private native void nativeSetDoubleTapSupportEnabled(long l, boolean flag);

    private native void nativeSetFocus(long l, boolean flag);

    private native void nativeSetMultiTouchZoomSupportEnabled(long l, boolean flag);

    private native void nativeSingleTap(long l, long l1, float f, float f1);

    private native void nativeWasResized(long l);

    private boolean offerLongPressToEmbedder()
    {
        return mContainerView.performLongClick();
    }

    private void onBackgroundColorChanged(int i)
    {
        getContentViewClient().onBackgroundColorChanged(i);
    }

    private void onFlingCancelEventAck()
    {
        updateGestureStateListener(10);
    }

    private void onFlingStartEventConsumed(int i, int j)
    {
        mTouchScrollInProgress = false;
        mPotentiallyActiveFlingCount = mPotentiallyActiveFlingCount + 1;
        mGestureStateListenersIterator.rewind();
        for (; mGestureStateListenersIterator.hasNext(); ((GestureStateListener)mGestureStateListenersIterator.next()).onFlingStartGesture(i, j, computeVerticalScrollOffset(), computeVerticalScrollExtent())) { }
    }

    private void onFlingStartEventHadNoConsumer(int i, int j)
    {
        mTouchScrollInProgress = false;
        mGestureStateListenersIterator.rewind();
        for (; mGestureStateListenersIterator.hasNext(); ((GestureStateListener)mGestureStateListenersIterator.next()).onUnhandledFlingStartEvent(i, j)) { }
    }

    private void onNativeFlingStopped()
    {
        mTouchScrollInProgress = false;
        if (mPotentiallyActiveFlingCount <= 0)
        {
            return;
        } else
        {
            mPotentiallyActiveFlingCount = mPotentiallyActiveFlingCount - 1;
            updateGestureStateListener(11);
            return;
        }
    }

    private void onPinchBeginEventAck()
    {
        updateGestureStateListener(12);
    }

    private void onPinchEndEventAck()
    {
        updateGestureStateListener(14);
    }

    private void onRenderProcessChange()
    {
        attachImeAdapter();
    }

    private void onScrollBeginEventAck()
    {
        mTouchScrollInProgress = true;
        hidePastePopup();
        mZoomControlsDelegate.invokeZoomPicker();
        updateGestureStateListener(6);
    }

    private void onScrollEndEventAck()
    {
        if (!mTouchScrollInProgress)
        {
            return;
        } else
        {
            mTouchScrollInProgress = false;
            updateGestureStateListener(8);
            return;
        }
    }

    private void onScrollUpdateGestureConsumed()
    {
        mZoomControlsDelegate.invokeZoomPicker();
        mGestureStateListenersIterator.rewind();
        for (; mGestureStateListenersIterator.hasNext(); ((GestureStateListener)mGestureStateListenersIterator.next()).onScrollUpdateGestureConsumed()) { }
    }

    private void onSelectionChanged(String s)
    {
        mLastSelectedText = s;
        getContentViewClient().onSelectionChanged(s);
    }

    private void onSelectionEvent(int i, float f, float f1)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 0 8: default 56
    //                   0 73
    //                   1 122
    //                   2 96
    //                   3 96
    //                   4 139
    //                   5 147
    //                   6 190
    //                   7 216
    //                   8 228;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        if (!$assertionsDisabled)
        {
            throw new AssertionError("Invalid selection event type.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        mHasSelection = true;
        mUnselectAllOnActionModeDismiss = true;
        mContainerView.performHapticFeedback(0);
        showSelectActionBar();
_L11:
        float f2 = mRenderCoordinates.getDeviceScaleFactor();
        getContentViewClient().onSelectionEvent(i, f * f2, f1 * f2);
        return;
_L3:
        mHasSelection = false;
        mUnselectAllOnActionModeDismiss = false;
        hideSelectActionBar();
        continue; /* Loop/switch isn't completed */
_L5:
        mHasInsertion = true;
        continue; /* Loop/switch isn't completed */
_L6:
        if (mPastePopupMenu != null)
        {
            if (!isScrollInProgress() && mPastePopupMenu.isShowing())
            {
                showPastePopup((int)f, (int)f1);
            } else
            {
                hidePastePopup();
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (mWasPastePopupShowingOnInsertionDragStart)
        {
            hidePastePopup();
        } else
        {
            showPastePopup((int)f, (int)f1);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        mHasInsertion = false;
        hidePastePopup();
        continue; /* Loop/switch isn't completed */
_L9:
        if (mPastePopupMenu == null || !mPastePopupMenu.isShowing())
        {
            flag = false;
        }
        mWasPastePopupShowingOnInsertionDragStart = flag;
        hidePastePopup();
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void onSingleTapEventAck(boolean flag, int i, int j)
    {
        mGestureStateListenersIterator.rewind();
        for (; mGestureStateListenersIterator.hasNext(); ((GestureStateListener)mGestureStateListenersIterator.next()).onSingleTap(flag, i, j)) { }
    }

    private void onSmartClipDataExtracted(String s, String s1, Rect rect)
    {
        float f = mRenderCoordinates.getDeviceScaleFactor();
        int i = (int)((float)mSmartClipOffsetX / f);
        int j = (int)((float)mSmartClipOffsetY / f);
        rect.offset(-i, -j);
        if (mSmartClipDataListener != null)
        {
            mSmartClipDataListener.onSmartClipDataExtracted(s, s1, rect);
        }
    }

    private boolean onTouchEventImpl(MotionEvent motionevent, boolean flag)
    {
        TraceEvent.begin("onTouchEvent");
        int j = motionevent.getActionMasked();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        cancelRequestToScrollFocusedEditableNodeIntoView();
        int i = j;
        boolean flag1;
        if (SPenSupport.isSPenSupported(mContext))
        {
            i = SPenSupport.convertSPenEventAction(j);
        }
        flag1 = isValidTouchEventActionForNative(i);
        if (!flag1)
        {
            TraceEvent.end("onTouchEvent");
            return false;
        }
        long l2 = mNativeContentViewCore;
        MotionEvent motionevent2;
        if (l2 == 0L)
        {
            TraceEvent.end("onTouchEvent");
            return false;
        }
        motionevent2 = null;
        if (mCurrentTouchOffsetX != 0.0F)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        MotionEvent motionevent1 = motionevent;
        if (mCurrentTouchOffsetY == 0.0F)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        motionevent = createOffsetMotionEvent(motionevent);
        motionevent1 = motionevent;
        motionevent2 = motionevent;
        float f5;
        float f6;
        int l;
        int i1;
        int j1;
        long l3;
        l = motionevent1.getPointerCount();
        l2 = mNativeContentViewCore;
        l3 = motionevent1.getEventTime();
        i1 = motionevent1.getHistorySize();
        j1 = motionevent1.getActionIndex();
        f5 = motionevent1.getX();
        f6 = motionevent1.getY();
        if (l <= 1) goto _L2; else goto _L1
_L1:
        float f = motionevent1.getX(1);
_L22:
        if (l <= 1) goto _L4; else goto _L3
_L3:
        float f1 = motionevent1.getY(1);
_L15:
        int k1 = motionevent1.getPointerId(0);
        if (l <= 1) goto _L6; else goto _L5
_L5:
        j = motionevent1.getPointerId(1);
_L16:
        float f7 = motionevent1.getTouchMajor();
        if (l <= 1) goto _L8; else goto _L7
_L7:
        float f2 = motionevent1.getTouchMajor(1);
_L17:
        float f8 = motionevent1.getTouchMinor();
        if (l <= 1) goto _L10; else goto _L9
_L9:
        float f3 = motionevent1.getTouchMinor(1);
_L18:
        float f9 = motionevent1.getOrientation();
        if (l <= 1) goto _L12; else goto _L11
_L11:
        float f4 = motionevent1.getOrientation(1);
_L19:
        float f10;
        float f11;
        int l1;
        f10 = motionevent1.getRawX();
        f11 = motionevent1.getRawY();
        l1 = motionevent1.getToolType(0);
        if (l <= 1) goto _L14; else goto _L13
_L13:
        int k = motionevent1.getToolType(1);
_L20:
        flag = nativeOnTouchEvent(l2, motionevent1, l3, i, l, i1, j1, f5, f6, f, f1, k1, j, f7, f2, f8, f3, f9, f4, f10, f11, l1, k, motionevent1.getButtonState(), motionevent1.getMetaState(), flag);
        if (motionevent2 == null)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        motionevent2.recycle();
        TraceEvent.end("onTouchEvent");
        return flag;
_L2:
        f = 0.0F;
        continue; /* Loop/switch isn't completed */
_L4:
        f1 = 0.0F;
          goto _L15
_L6:
        j = -1;
          goto _L16
_L8:
        f2 = 0.0F;
          goto _L17
_L10:
        f3 = 0.0F;
          goto _L18
_L12:
        f4 = 0.0F;
          goto _L19
_L14:
        k = 0;
          goto _L20
        motionevent;
        TraceEvent.end("onTouchEvent");
        throw motionevent;
        if (true) goto _L22; else goto _L21
_L21:
    }

    private void resetGestureDetection()
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeResetGestureDetection(mNativeContentViewCore);
            return;
        }
    }

    private void resetScrollInProgress()
    {
        if (isScrollInProgress())
        {
            boolean flag = mTouchScrollInProgress;
            int i = mPotentiallyActiveFlingCount;
            mTouchScrollInProgress = false;
            mPotentiallyActiveFlingCount = 0;
            if (flag)
            {
                updateGestureStateListener(8);
            }
            if (i > 0)
            {
                updateGestureStateListener(11);
                return;
            }
        }
    }

    private void restoreSelectionPopupsIfNecessary()
    {
        if (mHasSelection && mActionMode == null)
        {
            showSelectActionBar();
        }
    }

    private void scrollFocusedEditableNodeIntoView()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.scrollFocusedEditableNodeIntoView();
            return;
        }
    }

    private void setTitle(String s)
    {
        getContentViewClient().onUpdateTitle(s);
    }

    private boolean shouldBlockMediaRequest(String s)
    {
        return getContentViewClient().shouldBlockMediaRequest(s);
    }

    private void showDisambiguationPopup(Rect rect, Bitmap bitmap)
    {
        mPopupZoomer.setBitmap(bitmap);
        mPopupZoomer.show(rect);
    }

    private boolean showPastePopup(int i, int j)
    {
        if (!mHasInsertion || !canPaste())
        {
            return false;
        } else
        {
            float f = mRenderCoordinates.getContentOffsetYPix();
            getPastePopup().showAt((int)mRenderCoordinates.fromDipToPix(i), (int)(mRenderCoordinates.fromDipToPix(j) + f));
            return true;
        }
    }

    private void showPastePopupWithFeedback(int i, int j)
    {
        if (showPastePopup(i, j))
        {
            mContainerView.performHapticFeedback(0);
        }
    }

    private void showSelectActionBar()
    {
        if (mActionMode != null)
        {
            mActionMode.invalidate();
            return;
        }
        SelectActionModeCallback.ActionHandler actionhandler = new SelectActionModeCallback.ActionHandler() {

            final ContentViewCore this$0;

            public void copy()
            {
                mImeAdapter.copy();
            }

            public void cut()
            {
                mImeAdapter.cut();
            }

            public boolean isSelectionEditable()
            {
                return mFocusedNodeEditable;
            }

            public boolean isSelectionPassword()
            {
                return mImeAdapter.isSelectionPassword();
            }

            public boolean isShareAvailable()
            {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                return getContext().getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0;
            }

            public boolean isWebSearchAvailable()
            {
                if (!getContentViewClient().doesPerformWebSearch())
                {
                    Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                    intent.putExtra("new_search", true);
                    if (getContext().getPackageManager().queryIntentActivities(intent, 0x10000).size() <= 0)
                    {
                        return false;
                    }
                }
                return true;
            }

            public void onDestroyActionMode()
            {
                mActionMode = null;
                if (mUnselectAllOnActionModeDismiss)
                {
                    hideTextHandles();
                    if (isSelectionEditable())
                    {
                        int i = Selection.getSelectionEnd(mEditable);
                        mInputConnection.setSelection(i, i);
                    } else
                    {
                        mImeAdapter.unselect();
                    }
                }
                getContentViewClient().onContextualActionBarHidden();
            }

            public void paste()
            {
                mImeAdapter.paste();
            }

            public void search()
            {
                String s = getSelectedText();
                if (TextUtils.isEmpty(s))
                {
                    return;
                }
                if (getContentViewClient().doesPerformWebSearch())
                {
                    getContentViewClient().performWebSearch(s);
                    return;
                }
                Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                intent.putExtra("new_search", true);
                intent.putExtra("query", s);
                intent.putExtra("com.android.browser.application_id", getContext().getPackageName());
                if (!(getContext() instanceof Activity))
                {
                    intent.addFlags(0x10000000);
                }
                try
                {
                    getContext().startActivity(intent);
                    return;
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    return;
                }
            }

            public void selectAll()
            {
                mImeAdapter.selectAll();
            }

            public void share()
            {
                String s = getSelectedText();
                if (TextUtils.isEmpty(s))
                {
                    return;
                }
                Intent intent1 = new Intent("android.intent.action.SEND");
                intent1.setType("text/plain");
                intent1.putExtra("android.intent.extra.TEXT", s);
                try
                {
                    Intent intent = Intent.createChooser(intent1, getContext().getString(org.chromium.content.R.string.actionbar_share));
                    intent.setFlags(0x10000000);
                    getContext().startActivity(intent);
                    return;
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    return;
                }
            }

            
            {
                this$0 = ContentViewCore.this;
                super();
            }
        };
        mActionMode = null;
        if (mContainerView.getParent() != null)
        {
            if (!$assertionsDisabled && mWebContents == null)
            {
                throw new AssertionError();
            }
            mActionMode = mContainerView.startActionMode(getContentViewClient().getSelectActionModeCallback(getContext(), actionhandler, mWebContents.isIncognito()));
        }
        mUnselectAllOnActionModeDismiss = true;
        if (mActionMode == null)
        {
            mImeAdapter.unselect();
            return;
        } else
        {
            getContentViewClient().onContextualActionBarShown();
            return;
        }
    }

    private void showSelectPopup(long l, Rect rect, String as[], int ai[], boolean flag, int ai1[])
    {
        if (mContainerView.getParent() == null || mContainerView.getVisibility() != 0)
        {
            mNativeSelectPopupSourceFrame = l;
            selectPopupMenuItems(null);
            return;
        }
        hidePopupsAndClearSelection();
        if (!$assertionsDisabled && mNativeSelectPopupSourceFrame != 0L)
        {
            throw new AssertionError("Zombie popup did not clear the frame source");
        }
        if (!$assertionsDisabled && as.length != ai.length)
        {
            throw new AssertionError();
        }
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < as.length; i++)
        {
            arraylist.add(new SelectPopupItem(as[i], ai[i]));
        }

        if (DeviceFormFactor.isTablet(mContext) && !flag)
        {
            mSelectPopup = new SelectPopupDropdown(this, arraylist, rect, ai1);
        } else
        {
            mSelectPopup = new SelectPopupDialog(this, arraylist, flag, ai1);
        }
        mNativeSelectPopupSourceFrame = l;
        mSelectPopup.show();
    }

    private void startContentIntent(String s)
    {
        getContentViewClient().onStartContentIntent(getContext(), s);
    }

    private void unregisterAccessibilityContentObserver()
    {
        if (mAccessibilityScriptInjectionObserver == null)
        {
            return;
        } else
        {
            getContext().getContentResolver().unregisterContentObserver(mAccessibilityScriptInjectionObserver);
            mAccessibilityScriptInjectionObserver = null;
            return;
        }
    }

    private void updateAfterSizeChanged()
    {
        mPopupZoomer.hide(false);
        if (!mFocusPreOSKViewportRect.isEmpty())
        {
            Rect rect = new Rect();
            getContainerView().getWindowVisibleDisplayFrame(rect);
            if (!rect.equals(mFocusPreOSKViewportRect))
            {
                if (rect.width() == mFocusPreOSKViewportRect.width())
                {
                    scrollFocusedEditableNodeIntoView();
                }
                cancelRequestToScrollFocusedEditableNodeIntoView();
            }
        }
    }

    private void updateForTapOrPress(int i, float f, float f1)
    {
        if (i != 3 && i != 2 && i != 5 && i != 16)
        {
            return;
        }
        if (mContainerView.isFocusable() && mContainerView.isFocusableInTouchMode() && !mContainerView.isFocused())
        {
            mContainerView.requestFocus();
        }
        if (!mPopupZoomer.isShowing())
        {
            mPopupZoomer.setLastTouch(f, f1);
        }
        mLastTapX = (int)f;
        mLastTapY = (int)f1;
    }

    private void updateFrameInfo(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7, float f8, float f9, float f10)
    {
        TraceEvent.begin("ContentViewCore:updateFrameInfo");
        float f11 = mRenderCoordinates.getDeviceScaleFactor();
        f5 = Math.max(f5, (float)mViewportWidthPix / (f11 * f2));
        f6 = Math.max(f6, (float)mViewportHeightPix / (f11 * f2));
        f10 = mRenderCoordinates.fromDipToPix(f10);
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (f5 != mRenderCoordinates.getContentWidthCss() || f6 != mRenderCoordinates.getContentHeightCss())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f3 != mRenderCoordinates.getMinPageScaleFactor() || f4 != mRenderCoordinates.getMaxPageScaleFactor())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f2 != mRenderCoordinates.getPageScaleFactor())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 || f != mRenderCoordinates.getScrollX() || f1 != mRenderCoordinates.getScrollY())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (f10 != mRenderCoordinates.getContentOffsetYPix())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag1 || flag2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            mPopupZoomer.hide(true);
        }
        if (flag2)
        {
            mContainerViewInternals.onScrollChanged((int)mRenderCoordinates.fromLocalCssToPix(f), (int)mRenderCoordinates.fromLocalCssToPix(f1), (int)mRenderCoordinates.getScrollXPix(), (int)mRenderCoordinates.getScrollYPix());
        }
        mRenderCoordinates.updateFrameInfo(f, f1, f5, f6, f7, f8, f2, f3, f4, f10);
        if (flag2 || flag3)
        {
            mGestureStateListenersIterator.rewind();
            for (; mGestureStateListenersIterator.hasNext(); ((GestureStateListener)mGestureStateListenersIterator.next()).onScrollOffsetOrExtentChanged(computeVerticalScrollOffset(), computeVerticalScrollExtent())) { }
        }
        if (flag)
        {
            mZoomControlsDelegate.updateZoomControls();
        }
        getContentViewClient().onOffsetsForFullscreenChanged(f9 * f11, f10, 0.0F);
        if (mBrowserAccessibilityManager != null)
        {
            mBrowserAccessibilityManager.notifyFrameInfoInitialized();
        }
        TraceEvent.end("ContentViewCore:updateFrameInfo");
    }

    private void updateImeAdapter(long l, int i, int j, String s, int k, int i1, 
            int j1, int k1, boolean flag, boolean flag1)
    {
        TraceEvent.begin();
        boolean flag2;
        if (i != ImeAdapter.getTextInputTypeNone())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        mFocusedNodeEditable = flag2;
        if (!mFocusedNodeEditable)
        {
            hidePastePopup();
        }
        mImeAdapter.updateKeyboardVisibility(l, i, j, flag);
        if (mInputConnection != null)
        {
            mInputConnection.updateState(s, k, i1, j1, k1, flag1);
        }
        if (mActionMode != null)
        {
            mActionMode.invalidate();
        }
        TraceEvent.end();
    }

    public void addGestureStateListener(GestureStateListener gesturestatelistener)
    {
        mGestureStateListeners.addObserver(gesturestatelistener);
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        addPossiblyUnsafeJavascriptInterface(obj, s, org/chromium/content/browser/JavascriptInterface);
    }

    public void addPossiblyUnsafeJavascriptInterface(Object obj, String s, Class class1)
    {
        if (mNativeContentViewCore != 0L && obj != null)
        {
            mJavaScriptInterfaces.put(s, new Pair(obj, class1));
            nativeAddJavascriptInterface(mNativeContentViewCore, obj, s, class1);
        }
    }

    public void addStyleSheetByURL(String s)
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.addStyleSheetByURL(s);
            return;
        }
    }

    public void attachImeAdapter()
    {
        if (mImeAdapter != null && mNativeContentViewCore != 0L)
        {
            mImeAdapter.attach(nativeGetNativeImeAdapter(mNativeContentViewCore));
        }
    }

    public boolean awakenScrollBars(int i, boolean flag)
    {
        if (mContainerView.getScrollBarStyle() == 0)
        {
            return false;
        } else
        {
            return mContainerViewInternals.super_awakenScrollBars(i, flag);
        }
    }

    public void beginExitTransition(String s)
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.beginExitTransition(s);
            return;
        }
    }

    public boolean canZoomIn()
    {
        return mRenderCoordinates.getMaxPageScaleFactor() - mRenderCoordinates.getPageScaleFactor() > 0.007F;
    }

    public boolean canZoomOut()
    {
        return mRenderCoordinates.getPageScaleFactor() - mRenderCoordinates.getMinPageScaleFactor() > 0.007F;
    }

    public void cancelFling(long l)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeFlingCancel(mNativeContentViewCore, l);
            return;
        }
    }

    public void clearSelection()
    {
        mImeAdapter.unselect();
    }

    public int computeHorizontalScrollExtent()
    {
        return mRenderCoordinates.getLastFrameViewportWidthPixInt();
    }

    public int computeHorizontalScrollOffset()
    {
        return mRenderCoordinates.getScrollXPixInt();
    }

    public int computeHorizontalScrollRange()
    {
        return mRenderCoordinates.getContentWidthPixInt();
    }

    public int computeVerticalScrollExtent()
    {
        return mRenderCoordinates.getLastFrameViewportHeightPixInt();
    }

    public int computeVerticalScrollOffset()
    {
        return mRenderCoordinates.getScrollYPixInt();
    }

    public int computeVerticalScrollRange()
    {
        return mRenderCoordinates.getContentHeightPixInt();
    }

    public void destroy()
    {
        if (mNativeContentViewCore != 0L)
        {
            nativeOnJavaContentViewCoreDestroyed(mNativeContentViewCore);
        }
        mWebContentsObserver.detachFromWebContents();
        mWebContentsObserver = null;
        setSmartClipDataListener(null);
        setZoomControlsDelegate(null);
        mContentViewClient = new ContentViewClient();
        mWebContents = null;
        if (mViewAndroid != null)
        {
            mViewAndroid.destroy();
        }
        mNativeContentViewCore = 0L;
        mContentSettings = null;
        mJavaScriptInterfaces.clear();
        mRetainedJavaScriptObjects.clear();
        unregisterAccessibilityContentObserver();
        mGestureStateListeners.clear();
        ScreenOrientationListener.getInstance().removeObserver(this);
        mPositionObserver.clearListener();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (!GamepadList.dispatchKeyEvent(keyevent))
        {
            if (getContentViewClient().shouldOverrideKeyEvent(keyevent))
            {
                return mContainerViewInternals.super_dispatchKeyEvent(keyevent);
            }
            if (!mImeAdapter.dispatchKeyEvent(keyevent))
            {
                return mContainerViewInternals.super_dispatchKeyEvent(keyevent);
            }
        }
        return true;
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        boolean flag;
        TraceEvent.begin();
        flag = mContainerViewInternals.super_dispatchKeyEventPreIme(keyevent);
        TraceEvent.end();
        return flag;
        keyevent;
        TraceEvent.end();
        throw keyevent;
    }

    public void evaluateJavaScript(String s, JavaScriptCallback javascriptcallback)
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.evaluateJavaScript(s, javascriptcallback);
            return;
        }
    }

    public void exitFullscreen()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.exitFullscreen();
            return;
        }
    }

    public void extractSmartClipData(int i, int j, int k, int l)
    {
        if (mNativeContentViewCore != 0L)
        {
            int i1 = mSmartClipOffsetX;
            int j1 = mSmartClipOffsetY;
            nativeExtractSmartClipData(mNativeContentViewCore, i + i1, j + j1, k, l);
        }
    }

    public void flingForTest(long l, int i, int j, int k, int i1)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeFlingCancel(mNativeContentViewCore, l);
            nativeScrollBegin(mNativeContentViewCore, l, i, j, k, i1);
            nativeFlingStart(mNativeContentViewCore, l, i, j, k, i1);
            return;
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        if (mBrowserAccessibilityManager != null)
        {
            return mBrowserAccessibilityManager.getAccessibilityNodeProvider();
        }
        if (mNativeAccessibilityAllowed && !mNativeAccessibilityEnabled && mNativeContentViewCore != 0L && android.os.Build.VERSION.SDK_INT >= 16)
        {
            mNativeAccessibilityEnabled = true;
            nativeSetAccessibilityEnabled(mNativeContentViewCore, true);
        }
        return null;
    }

    public AdapterInputConnection getAdapterInputConnectionForTest()
    {
        return mInputConnection;
    }

    public BrowserAccessibilityManager getBrowserAccessibilityManager()
    {
        return mBrowserAccessibilityManager;
    }

    public ViewGroup getContainerView()
    {
        return mContainerView;
    }

    public float getContentHeightCss()
    {
        return mRenderCoordinates.getContentHeightCss();
    }

    public ContentSettings getContentSettings()
    {
        return mContentSettings;
    }

    public ContentViewClient getContentViewClient()
    {
        if (mContentViewClient == null)
        {
            mContentViewClient = new ContentViewClient();
        }
        return mContentViewClient;
    }

    public float getContentWidthCss()
    {
        return mRenderCoordinates.getContentWidthCss();
    }

    public Context getContext()
    {
        return mContext;
    }

    public int getCurrentRenderProcessId()
    {
        return nativeGetCurrentRenderProcessId(mNativeContentViewCore);
    }

    ContentViewDownloadDelegate getDownloadDelegate()
    {
        return mDownloadDelegate;
    }

    public Editable getEditableForTest()
    {
        return mEditable;
    }

    public ImeAdapter getImeAdapterForTest()
    {
        return mImeAdapter;
    }

    public AdapterInputConnection getInputConnectionForTest()
    {
        return mInputConnection;
    }

    public Map getJavascriptInterfaces()
    {
        return mJavaScriptInterfaces;
    }

    public int getLastTapX()
    {
        return mLastTapX;
    }

    public int getLastTapY()
    {
        return mLastTapY;
    }

    public long getNativeContentViewCore()
    {
        return mNativeContentViewCore;
    }

    public int getNativeScrollXForTest()
    {
        return mRenderCoordinates.getScrollXPixInt();
    }

    public int getNativeScrollYForTest()
    {
        return mRenderCoordinates.getScrollYPixInt();
    }

    public PastePopupMenu getPastePopupForTest()
    {
        return getPastePopup();
    }

    public int getPhysicalBackingHeightPix()
    {
        return mPhysicalBackingHeightPix;
    }

    public int getPhysicalBackingWidthPix()
    {
        return mPhysicalBackingWidthPix;
    }

    public RenderCoordinates getRenderCoordinates()
    {
        return mRenderCoordinates;
    }

    public float getScale()
    {
        return mRenderCoordinates.getPageScaleFactor();
    }

    public SelectPopup getSelectPopupForTest()
    {
        return mSelectPopup;
    }

    public String getSelectedText()
    {
        if (mHasSelection)
        {
            return mLastSelectedText;
        } else
        {
            return "";
        }
    }

    public int getTopControlsLayoutHeightPix()
    {
        return mTopControlsLayoutHeightPix;
    }

    public ViewAndroidDelegate getViewAndroidDelegate()
    {
        return new ViewAndroidDelegate() {

            static final boolean $assertionsDisabled;
            private final ViewGroup mContainerViewAtCreation;
            final ContentViewCore this$0;

            public View acquireAnchorView()
            {
                View view = new View(mContext);
                mContainerViewAtCreation.addView(view);
                return view;
            }

            public void releaseAnchorView(View view)
            {
                mContainerViewAtCreation.removeView(view);
            }

            public void setAnchorViewPosition(View view, float f, float f1, float f2, float f3)
            {
                if (view.getParent() == null)
                {
                    return;
                }
                if (!$assertionsDisabled && view.getParent() != mContainerViewAtCreation)
                {
                    throw new AssertionError();
                }
                float f4 = (float)DeviceDisplayInfo.create(mContext).getDIPScale();
                int i = Math.round(f * f4);
                int i1 = Math.round(mRenderCoordinates.getContentOffsetYPix() + f1 * f4);
                int l = Math.round(f2 * f4);
                if (mContainerViewAtCreation instanceof FrameLayout)
                {
                    if (ApiCompatibilityUtils.isLayoutRtl(mContainerViewAtCreation))
                    {
                        i = mContainerViewAtCreation.getMeasuredWidth() - Math.round((f2 + f) * f4);
                    }
                    int j = l;
                    if (l + i > mContainerViewAtCreation.getWidth())
                    {
                        j = mContainerViewAtCreation.getWidth() - i;
                    }
                    android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(j, Math.round(f3 * f4));
                    ApiCompatibilityUtils.setMarginStart(layoutparams, i);
                    layoutparams.topMargin = i1;
                    view.setLayoutParams(layoutparams);
                    return;
                }
                if (mContainerViewAtCreation instanceof AbsoluteLayout)
                {
                    int k = mRenderCoordinates.getScrollXPixInt();
                    int j1 = mRenderCoordinates.getScrollYPixInt();
                    view.setLayoutParams(new android.widget.AbsoluteLayout.LayoutParams(l, (int)(f3 * f4), i + k, i1 + j1));
                    return;
                } else
                {
                    Log.e("ContentViewCore", (new StringBuilder()).append("Unknown layout ").append(mContainerViewAtCreation.getClass().getName()).toString());
                    return;
                }
            }

            static 
            {
                boolean flag;
                if (!org/chromium/content/browser/ContentViewCore.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                this$0 = ContentViewCore.this;
                super();
                mContainerViewAtCreation = mContainerView;
            }
        };
    }

    public int getViewportHeightPix()
    {
        return mViewportHeightPix;
    }

    public int getViewportSizeOffsetHeightPix()
    {
        return getTopControlsLayoutHeightPix();
    }

    public int getViewportSizeOffsetWidthPix()
    {
        return 0;
    }

    public int getViewportWidthPix()
    {
        return mViewportWidthPix;
    }

    public WebContents getWebContents()
    {
        return mWebContents;
    }

    public boolean hasFocus()
    {
        return mContainerView.hasFocus();
    }

    public boolean hasSelection()
    {
        return mHasSelection;
    }

    public void hideImeIfNeeded()
    {
        if (mInputMethodManagerWrapper.isActive(mContainerView))
        {
            mInputMethodManagerWrapper.hideSoftInputFromWindow(mContainerView.getWindowToken(), 0, null);
        }
        getContentViewClient().onImeStateChangeRequested(false);
    }

    public void hideSelectActionBar()
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
            mActionMode = null;
        }
    }

    public void initialize(ViewGroup viewgroup, InternalAccessDelegate internalaccessdelegate, long l, WindowAndroid windowandroid)
    {
        setContainerView(viewgroup);
        long l1 = windowandroid.getNativePointer();
        if (!$assertionsDisabled && l1 == 0L)
        {
            throw new AssertionError();
        }
        mViewAndroid = new ViewAndroid(windowandroid, getViewAndroidDelegate());
        long l2 = mViewAndroid.getNativePointer();
        if (!$assertionsDisabled && l2 == 0L)
        {
            throw new AssertionError();
        } else
        {
            mZoomControlsDelegate = NO_OP_ZOOM_CONTROLS_DELEGATE;
            mNativeContentViewCore = nativeInit(l, l2, l1, mRetainedJavaScriptObjects);
            mWebContents = nativeGetWebContentsAndroid(mNativeContentViewCore);
            mContentSettings = new ContentSettings(this, mNativeContentViewCore);
            setContainerViewInternals(internalaccessdelegate);
            mRenderCoordinates.reset();
            initPopupZoomer(mContext);
            mImeAdapter = createImeAdapter(mContext);
            mAccessibilityInjector = AccessibilityInjector.newInstance(this);
            mWebContentsObserver = new WebContentsObserverAndroid(mWebContents) {

                final ContentViewCore this$0;

                public void didNavigateMainFrame(String s, String s1, boolean flag, boolean flag1)
                {
                    if (!flag)
                    {
                        return;
                    } else
                    {
                        hidePopupsAndClearSelection();
                        resetScrollInProgress();
                        resetGestureDetection();
                        return;
                    }
                }

                public void renderProcessGone(boolean flag)
                {
                    hidePopupsAndClearSelection();
                    resetScrollInProgress();
                }

            
            {
                this$0 = ContentViewCore.this;
                super(webcontents);
            }
            };
            return;
        }
    }

    public void invokeZoomPicker()
    {
        mZoomControlsDelegate.invokeZoomPicker();
    }

    public boolean isAlive()
    {
        return mNativeContentViewCore != 0L;
    }

    public boolean isDeviceAccessibilityScriptInjectionEnabled()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 16 && !CommandLine.getInstance().hasSwitch("enable-accessibility-script-injection"))
        {
            return false;
        }
        int i;
        if (!mContentSettings.getJavaScriptEnabled() || getContext().checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        Object obj = android/provider/Settings$Secure.getField("ACCESSIBILITY_SCRIPT_INJECTION");
        ((Field) (obj)).setAccessible(true);
        obj = (String)((Field) (obj)).get(null);
        ContentResolver contentresolver = getContext().getContentResolver();
        if (mAccessibilityScriptInjectionObserver == null)
        {
            ContentObserver contentobserver = new ContentObserver(new Handler()) {

                final ContentViewCore this$0;

                public void onChange(boolean flag1, Uri uri)
                {
                    setAccessibilityState(mAccessibilityManager.isEnabled());
                }

            
            {
                this$0 = ContentViewCore.this;
                super(handler);
            }
            };
            contentresolver.registerContentObserver(android.provider.Settings.Secure.getUriFor(((String) (obj))), false, contentobserver);
            mAccessibilityScriptInjectionObserver = contentobserver;
        }
        i = android.provider.Settings.Secure.getInt(contentresolver, ((String) (obj)), 0);
        if (i != 1)
        {
            flag = false;
        }
        return flag;
        Object obj1;
        obj1;
        return false;
        obj1;
        return false;
    }

    public boolean isFocusedNodeEditable()
    {
        return mFocusedNodeEditable;
    }

    public boolean isInjectingAccessibilityScript()
    {
        return mAccessibilityInjector.accessibilityIsAvailable();
    }

    public boolean isReady()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            return mWebContents.isReady();
        }
    }

    public boolean isScrollInProgress()
    {
        return mTouchScrollInProgress || mPotentiallyActiveFlingCount > 0;
    }

    public boolean isSelectActionBarShowing()
    {
        return mActionMode != null;
    }

    public boolean isSelectionEditable()
    {
        if (mHasSelection)
        {
            return mFocusedNodeEditable;
        } else
        {
            return false;
        }
    }

    public boolean isShowingInterstitialPage()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            return mWebContents.isShowingInterstitialPage();
        }
    }

    public boolean isTouchExplorationEnabled()
    {
        return mTouchExplorationEnabled;
    }

    public void onAccessibilityStateChanged(boolean flag)
    {
        setAccessibilityState(flag);
    }

    public void onAttachedToWindow()
    {
        setAccessibilityState(mAccessibilityManager.isEnabled());
        restoreSelectionPopupsIfNecessary();
        ScreenOrientationListener.getInstance().addObserver(this, mContext);
        GamepadList.onAttachedToWindow(mContext);
    }

    public boolean onCheckIsTextEditor()
    {
        return mImeAdapter.hasTextInputType();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        TraceEvent.begin();
        if (configuration.keyboard != 1)
        {
            if (mNativeContentViewCore != 0L)
            {
                mImeAdapter.attach(nativeGetNativeImeAdapter(mNativeContentViewCore), ImeAdapter.getTextInputTypeNone(), 0);
            }
            mInputMethodManagerWrapper.restartInput(mContainerView);
        }
        mContainerViewInternals.super_onConfigurationChanged(configuration);
        mContainerView.requestLayout();
        TraceEvent.end();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        if (!mImeAdapter.hasTextInputType())
        {
            editorinfo.imeOptions = 0x2000000;
        }
        mInputConnection = mAdapterInputConnectionFactory.get(mContainerView, mImeAdapter, mEditable, editorinfo);
        return mInputConnection;
    }

    public void onDetachedFromWindow()
    {
        setInjectedAccessibility(false);
        hidePopupsAndPreserveSelection();
        mZoomControlsDelegate.dismissZoomPicker();
        unregisterAccessibilityContentObserver();
        ScreenOrientationListener.getInstance().removeObserver(this);
        GamepadList.onDetachedFromWindow();
    }

    public void onFocusChanged(boolean flag)
    {
        if (flag)
        {
            restoreSelectionPopupsIfNecessary();
        } else
        {
            hideImeIfNeeded();
            cancelRequestToScrollFocusedEditableNodeIntoView();
            if (mPreserveSelectionOnNextLossOfFocus)
            {
                mPreserveSelectionOnNextLossOfFocus = false;
                hidePopupsAndPreserveSelection();
            } else
            {
                hidePopupsAndClearSelection();
            }
        }
        if (mNativeContentViewCore != 0L)
        {
            nativeSetFocus(mNativeContentViewCore, flag);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if (GamepadList.onGenericMotionEvent(motionevent))
        {
            return true;
        }
        if ((motionevent.getSource() & 2) == 0) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 8 8: default 40
    //                   8 51;
           goto _L2 _L3
_L2:
        return mContainerViewInternals.super_onGenericMotionEvent(motionevent);
_L3:
        if (mNativeContentViewCore == 0L)
        {
            return false;
        } else
        {
            nativeSendMouseWheelEvent(mNativeContentViewCore, motionevent.getEventTime(), motionevent.getX(), motionevent.getY(), motionevent.getAxisValue(9));
            mContainerView.removeCallbacks(mFakeMouseMoveRunnable);
            mFakeMouseMoveRunnable = new Runnable() {

                final ContentViewCore this$0;
                final MotionEvent val$eventFakeMouseMove;

                public void run()
                {
                    onHoverEvent(eventFakeMouseMove);
                    eventFakeMouseMove.recycle();
                }

            
            {
                this$0 = ContentViewCore.this;
                eventFakeMouseMove = motionevent;
                super();
            }
            };
            mContainerView.postDelayed(mFakeMouseMoveRunnable, 250L);
            return true;
        }
    }

    public void onHide()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            hidePopupsAndPreserveSelection();
            setInjectedAccessibility(false);
            mWebContents.onHide();
            return;
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        TraceEvent.begin("onHoverEvent");
        motionevent = createOffsetMotionEvent(motionevent);
        boolean flag;
        if (mBrowserAccessibilityManager == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        flag = mBrowserAccessibilityManager.onHoverEvent(motionevent);
        motionevent.recycle();
        TraceEvent.end("onHoverEvent");
        return flag;
        int i;
        if (!mTouchExplorationEnabled)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        i = motionevent.getAction();
        if (i == 10)
        {
            motionevent.recycle();
            TraceEvent.end("onHoverEvent");
            return true;
        }
        mContainerView.removeCallbacks(mFakeMouseMoveRunnable);
        if (mNativeContentViewCore != 0L)
        {
            nativeSendMouseMoveEvent(mNativeContentViewCore, motionevent.getEventTime(), motionevent.getX(), motionevent.getY());
        }
        motionevent.recycle();
        TraceEvent.end("onHoverEvent");
        return true;
        Exception exception;
        exception;
        motionevent.recycle();
        TraceEvent.end("onHoverEvent");
        throw exception;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag = false;
        accessibilityevent.setClassName(getClass().getName());
        accessibilityevent.setScrollX(mRenderCoordinates.getScrollXPixInt());
        accessibilityevent.setScrollY(mRenderCoordinates.getScrollYPixInt());
        int i = Math.max(0, mRenderCoordinates.getMaxHorizontalScrollPixInt());
        int j = Math.max(0, mRenderCoordinates.getMaxVerticalScrollPixInt());
        if (i > 0 || j > 0)
        {
            flag = true;
        }
        accessibilityevent.setScrollable(flag);
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            accessibilityevent.setMaxScrollX(i);
            accessibilityevent.setMaxScrollY(j);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        mAccessibilityInjector.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (mPopupZoomer.isShowing() && i == 4)
        {
            mPopupZoomer.hide(true);
            return true;
        } else
        {
            return mContainerViewInternals.super_onKeyUp(i, keyevent);
        }
    }

    void onNativeContentViewCoreDestroyed(long l)
    {
        if (!$assertionsDisabled && l != mNativeContentViewCore)
        {
            throw new AssertionError();
        } else
        {
            mNativeContentViewCore = 0L;
            return;
        }
    }

    public void onOverdrawBottomHeightChanged(int i)
    {
    }

    public void onPhysicalBackingSizeChanged(int i, int j)
    {
        if (mPhysicalBackingWidthPix != i || mPhysicalBackingHeightPix != j)
        {
            mPhysicalBackingWidthPix = i;
            mPhysicalBackingHeightPix = j;
            if (mNativeContentViewCore != 0L)
            {
                nativeWasResized(mNativeContentViewCore);
                return;
            }
        }
    }

    public void onScreenOrientationChanged(int i)
    {
        sendOrientationChangeEvent(i);
    }

    public void onShow()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.onShow();
            setAccessibilityState(mAccessibilityManager.isEnabled());
            restoreSelectionPopupsIfNecessary();
            return;
        }
    }

    public void onSizeChanged(int i, int j, int k, int l)
    {
        if (getViewportWidthPix() == i && getViewportHeightPix() == j)
        {
            return;
        }
        mViewportWidthPix = i;
        mViewportHeightPix = j;
        if (mNativeContentViewCore != 0L)
        {
            nativeWasResized(mNativeContentViewCore);
        }
        updateAfterSizeChanged();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return onTouchEventImpl(motionevent, false);
    }

    public void onVisibilityChanged(View view, int i)
    {
        if (i != 0)
        {
            mZoomControlsDelegate.dismissZoomPicker();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (!flag)
        {
            resetGestureDetection();
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        if (mAccessibilityInjector.supportsAccessibilityAction(i))
        {
            return mAccessibilityInjector.performAccessibilityAction(i, bundle);
        } else
        {
            return false;
        }
    }

    public boolean pinchByDelta(float f)
    {
        if (mNativeContentViewCore == 0L)
        {
            return false;
        } else
        {
            long l = SystemClock.uptimeMillis();
            int i = getViewportWidthPix() / 2;
            int j = getViewportHeightPix() / 2;
            nativePinchBegin(mNativeContentViewCore, l, i, j);
            nativePinchBy(mNativeContentViewCore, l, i, j, f);
            nativePinchEnd(mNativeContentViewCore, l);
            return true;
        }
    }

    public void postMessageToFrame(String s, String s1, String s2, String s3)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativePostMessageToFrame(mNativeContentViewCore, s, s1, s2, s3);
            return;
        }
    }

    public void preserveSelectionOnNextLossOfFocus()
    {
        mPreserveSelectionOnNextLossOfFocus = true;
    }

    public void removeGestureStateListener(GestureStateListener gesturestatelistener)
    {
        mGestureStateListeners.removeObserver(gesturestatelistener);
    }

    public void removeJavascriptInterface(String s)
    {
        mJavaScriptInterfaces.remove(s);
        if (mNativeContentViewCore != 0L)
        {
            nativeRemoveJavascriptInterface(mNativeContentViewCore, s);
        }
    }

    public void resumeResponseDeferredAtStart()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.resumeResponseDeferredAtStart();
            return;
        }
    }

    public void scrollBy(int i, int j)
    {
        if (mNativeContentViewCore != 0L)
        {
            nativeScrollBy(mNativeContentViewCore, SystemClock.uptimeMillis(), 0.0F, 0.0F, i, j);
        }
    }

    public void scrollTo(int i, int j)
    {
        if (mNativeContentViewCore != 0L)
        {
            float f = mRenderCoordinates.getScrollXPix();
            float f1 = mRenderCoordinates.getScrollYPix();
            float f2 = (float)i - f;
            float f3 = (float)j - f1;
            if (f2 != 0.0F || f3 != 0.0F)
            {
                long l = SystemClock.uptimeMillis();
                nativeScrollBegin(mNativeContentViewCore, l, f, f1, -f2, -f3);
                nativeScrollBy(mNativeContentViewCore, l, f, f1, f2, f3);
                nativeScrollEnd(mNativeContentViewCore, l);
                return;
            }
        }
    }

    public void selectPopupMenuItems(int ai[])
    {
        if (mNativeContentViewCore != 0L)
        {
            nativeSelectPopupMenuItems(mNativeContentViewCore, mNativeSelectPopupSourceFrame, ai);
        }
        mNativeSelectPopupSourceFrame = 0L;
        mSelectPopup = null;
    }

    public void selectWordAroundCaret()
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.selectWordAroundCaret();
            return;
        }
    }

    public void sendDoubleTapForTest(long l, int i, int j)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeDoubleTap(mNativeContentViewCore, l, i, j);
            return;
        }
    }

    void sendOrientationChangeEvent(int i)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeSendOrientationChangeEvent(mNativeContentViewCore, i);
            return;
        }
    }

    public void setAccessibilityState(boolean flag)
    {
        boolean flag1 = false;
        if (!flag)
        {
            setInjectedAccessibility(false);
            mNativeAccessibilityAllowed = false;
            mTouchExplorationEnabled = false;
            return;
        }
        boolean flag2 = isDeviceAccessibilityScriptInjectionEnabled();
        setInjectedAccessibility(flag2);
        flag = flag1;
        if (!flag2)
        {
            flag = true;
        }
        mNativeAccessibilityAllowed = flag;
        mTouchExplorationEnabled = mAccessibilityManager.isTouchExplorationEnabled();
    }

    public void setAdapterInputConnectionFactory(org.chromium.content.browser.input.ImeAdapter.AdapterInputConnectionFactory adapterinputconnectionfactory)
    {
        mAdapterInputConnectionFactory = adapterinputconnectionfactory;
    }

    public void setAllowJavascriptInterfacesInspection(boolean flag)
    {
        nativeSetAllowJavascriptInterfacesInspection(mNativeContentViewCore, flag);
    }

    public void setBackgroundOpaque(boolean flag)
    {
        if (mNativeContentViewCore != 0L)
        {
            nativeSetBackgroundOpaque(mNativeContentViewCore, flag);
        }
    }

    public void setBrowserAccessibilityManager(BrowserAccessibilityManager browseraccessibilitymanager)
    {
        mBrowserAccessibilityManager = browseraccessibilitymanager;
    }

    public void setContainerView(ViewGroup viewgroup)
    {
        TraceEvent.begin();
        if (mContainerView != null)
        {
            mPastePopupMenu = null;
            mInputConnection = null;
            hidePopupsAndClearSelection();
        }
        mContainerView = viewgroup;
        mPositionObserver = new ViewPositionObserver(mContainerView);
        viewgroup = "Web View";
        if (org.chromium.content.R.string.accessibility_content_view == 0)
        {
            Log.w("ContentViewCore", "Setting contentDescription to 'Web View' as no value was specified.");
        } else
        {
            viewgroup = mContext.getResources().getString(org.chromium.content.R.string.accessibility_content_view);
        }
        mContainerView.setContentDescription(viewgroup);
        mContainerView.setWillNotDraw(false);
        mContainerView.setClickable(true);
        TraceEvent.end();
    }

    public void setContainerViewInternals(InternalAccessDelegate internalaccessdelegate)
    {
        mContainerViewInternals = internalaccessdelegate;
    }

    public void setContentViewClient(ContentViewClient contentviewclient)
    {
        if (contentviewclient == null)
        {
            throw new IllegalArgumentException("The client can't be null.");
        } else
        {
            mContentViewClient = contentviewclient;
            return;
        }
    }

    public void setCurrentMotionEventOffsets(float f, float f1)
    {
        mCurrentTouchOffsetX = f;
        mCurrentTouchOffsetY = f1;
    }

    public void setDownloadDelegate(ContentViewDownloadDelegate contentviewdownloaddelegate)
    {
        mDownloadDelegate = contentviewdownloaddelegate;
    }

    public void setFullscreenRequiredForOrientationLock(boolean flag)
    {
        mFullscreenRequiredForOrientationLock = flag;
    }

    public void setIgnoreRemainingTouchEvents()
    {
        resetGestureDetection();
    }

    public void setImeAdapterForTest(ImeAdapter imeadapter)
    {
        mImeAdapter = imeadapter;
    }

    public void setInjectedAccessibility(boolean flag)
    {
        mAccessibilityInjector.addOrRemoveAccessibilityApisIfNecessary();
        mAccessibilityInjector.setScriptEnabled(flag);
    }

    public void setInputMethodManagerWrapperForTest(InputMethodManagerWrapper inputmethodmanagerwrapper)
    {
        mInputMethodManagerWrapper = inputmethodmanagerwrapper;
    }

    public void setPopupZoomerForTest(PopupZoomer popupzoomer)
    {
        mPopupZoomer = popupzoomer;
    }

    public void setShouldSetAccessibilityFocusOnPageLoad(boolean flag)
    {
        mShouldSetAccessibilityFocusOnPageLoad = flag;
    }

    public void setSmartClipDataListener(SmartClipDataListener smartclipdatalistener)
    {
        mSmartClipDataListener = smartclipdatalistener;
    }

    public void setSmartClipOffsets(int i, int j)
    {
        mSmartClipOffsetX = i;
        mSmartClipOffsetY = j;
    }

    public void setTopControlsLayoutHeight(int i)
    {
        if (i != mTopControlsLayoutHeightPix)
        {
            mTopControlsLayoutHeightPix = i;
            if (mNativeContentViewCore != 0L)
            {
                nativeWasResized(mNativeContentViewCore);
            }
        }
    }

    public void setViewportSizeOffset(int i, int j)
    {
        setTopControlsLayoutHeight(j);
    }

    public void setZoomControlsDelegate(ZoomControlsDelegate zoomcontrolsdelegate)
    {
        if (zoomcontrolsdelegate == null)
        {
            mZoomControlsDelegate = NO_OP_ZOOM_CONTROLS_DELEGATE;
            return;
        } else
        {
            mZoomControlsDelegate = zoomcontrolsdelegate;
            return;
        }
    }

    public void setupTransitionView(String s)
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.setupTransitionView(s);
            return;
        }
    }

    public boolean shouldSetAccessibilityFocusOnPageLoad()
    {
        return mShouldSetAccessibilityFocusOnPageLoad;
    }

    public void showInterstitialPage(String s, InterstitialPageDelegateAndroid interstitialpagedelegateandroid)
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.showInterstitialPage(s, interstitialpagedelegateandroid.getNative());
            return;
        }
    }

    public void stopCurrentAccessibilityNotifications()
    {
        mAccessibilityInjector.onPageLostFocus();
    }

    public boolean supportsAccessibilityAction(int i)
    {
        return mAccessibilityInjector.supportsAccessibilityAction(i);
    }

    public void updateDoubleTapSupport(boolean flag)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeSetDoubleTapSupportEnabled(mNativeContentViewCore, flag);
            return;
        }
    }

    void updateGestureStateListener(int i)
    {
        mGestureStateListenersIterator.rewind();
        do
        {
            if (!mGestureStateListenersIterator.hasNext())
            {
                break;
            }
            GestureStateListener gesturestatelistener = (GestureStateListener)mGestureStateListenersIterator.next();
            switch (i)
            {
            case 6: // '\006'
                gesturestatelistener.onScrollStarted(computeVerticalScrollOffset(), computeVerticalScrollExtent());
                break;

            case 12: // '\f'
                gesturestatelistener.onPinchStarted();
                break;

            case 14: // '\016'
                gesturestatelistener.onPinchEnded();
                break;

            case 11: // '\013'
                gesturestatelistener.onFlingEndGesture(computeVerticalScrollOffset(), computeVerticalScrollExtent());
                break;

            case 10: // '\n'
                gesturestatelistener.onFlingCancelGesture();
                break;

            case 8: // '\b'
                gesturestatelistener.onScrollEnded(computeVerticalScrollOffset(), computeVerticalScrollExtent());
                break;
            }
        } while (true);
    }

    public void updateMultiTouchZoomSupport(boolean flag)
    {
        if (mNativeContentViewCore == 0L)
        {
            return;
        } else
        {
            nativeSetMultiTouchZoomSupportEnabled(mNativeContentViewCore, flag);
            return;
        }
    }

    public void updateTopControlsState(boolean flag, boolean flag1, boolean flag2)
    {
        if (!$assertionsDisabled && mWebContents == null)
        {
            throw new AssertionError();
        } else
        {
            mWebContents.updateTopControlsState(flag, flag1, flag2);
            return;
        }
    }

    public boolean zoomIn()
    {
        if (!canZoomIn())
        {
            return false;
        } else
        {
            return pinchByDelta(1.25F);
        }
    }

    public boolean zoomOut()
    {
        if (!canZoomOut())
        {
            return false;
        } else
        {
            return pinchByDelta(0.8F);
        }
    }

    public boolean zoomReset()
    {
        if (!canZoomOut())
        {
            return false;
        } else
        {
            return pinchByDelta(mRenderCoordinates.getMinPageScaleFactor() / mRenderCoordinates.getPageScaleFactor());
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ContentViewCore.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }









/*
    static ActionMode access$1602(ContentViewCore contentviewcore, ActionMode actionmode)
    {
        contentviewcore.mActionMode = actionmode;
        return actionmode;
    }

*/














}

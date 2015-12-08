// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.content.browser.RenderCoordinates;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            JellyBeanBrowserAccessibilityManager

public class BrowserAccessibilityManager
{

    private static final String TAG = "BrowserAccessibilityManager";
    private int mAccessibilityFocusId;
    private Rect mAccessibilityFocusRect;
    private final AccessibilityManager mAccessibilityManager;
    private ContentViewCore mContentViewCore;
    private int mCurrentRootId;
    private boolean mIsHovering;
    private int mLastHoverId;
    private long mNativeObj;
    private boolean mNotifyFrameInfoInitializedCalled;
    private boolean mPendingScrollToMakeNodeVisible;
    private final RenderCoordinates mRenderCoordinates;
    private final int mTempLocation[] = new int[2];
    private boolean mUserHasTouchExplored;
    private final ViewGroup mView;

    protected BrowserAccessibilityManager(long l, ContentViewCore contentviewcore)
    {
        mLastHoverId = -1;
        mNativeObj = l;
        mContentViewCore = contentviewcore;
        mContentViewCore.setBrowserAccessibilityManager(this);
        mAccessibilityFocusId = -1;
        mIsHovering = false;
        mCurrentRootId = -1;
        mView = mContentViewCore.getContainerView();
        mRenderCoordinates = mContentViewCore.getRenderCoordinates();
        mAccessibilityManager = (AccessibilityManager)mContentViewCore.getContext().getSystemService("accessibility");
    }

    private void addAccessibilityNodeInfoChild(AccessibilityNodeInfo accessibilitynodeinfo, int i)
    {
        accessibilitynodeinfo.addChild(mView, i);
    }

    private void announceLiveRegionText(String s)
    {
        mView.announceForAccessibility(s);
    }

    private static BrowserAccessibilityManager create(long l, ContentViewCore contentviewcore)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new JellyBeanBrowserAccessibilityManager(l, contentviewcore);
        } else
        {
            return new BrowserAccessibilityManager(l, contentviewcore);
        }
    }

    private AccessibilityNodeInfo createNodeForHost(int i)
    {
        AccessibilityNodeInfo accessibilitynodeinfo = AccessibilityNodeInfo.obtain(mView);
        AccessibilityNodeInfo accessibilitynodeinfo1 = AccessibilityNodeInfo.obtain(mView);
        mView.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo1);
        Object obj = new Rect();
        accessibilitynodeinfo1.getBoundsInParent(((Rect) (obj)));
        accessibilitynodeinfo.setBoundsInParent(((Rect) (obj)));
        accessibilitynodeinfo1.getBoundsInScreen(((Rect) (obj)));
        accessibilitynodeinfo.setBoundsInScreen(((Rect) (obj)));
        obj = mView.getParentForAccessibility();
        if (obj instanceof View)
        {
            accessibilitynodeinfo.setParent((View)obj);
        }
        accessibilitynodeinfo.setVisibleToUser(accessibilitynodeinfo1.isVisibleToUser());
        accessibilitynodeinfo.setEnabled(accessibilitynodeinfo1.isEnabled());
        accessibilitynodeinfo.setPackageName(accessibilitynodeinfo1.getPackageName());
        accessibilitynodeinfo.setClassName(accessibilitynodeinfo1.getClassName());
        if (isFrameInfoInitialized())
        {
            accessibilitynodeinfo.addChild(mView, i);
        }
        return accessibilitynodeinfo;
    }

    private Bundle getOrCreateBundleForAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        Bundle bundle1 = (Bundle)accessibilityevent.getParcelableData();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
            accessibilityevent.setParcelableData(bundle);
        }
        return bundle;
    }

    private void handleCheckStateChanged(int i)
    {
        sendAccessibilityEvent(i, 1);
    }

    private void handleContentChanged(int i)
    {
        int j = nativeGetRootId(mNativeObj);
        if (j != mCurrentRootId)
        {
            mCurrentRootId = j;
            mView.sendAccessibilityEvent(2048);
            return;
        } else
        {
            sendAccessibilityEvent(i, 2048);
            return;
        }
    }

    private void handleEditableTextChanged(int i)
    {
        sendAccessibilityEvent(i, 16);
    }

    private void handleFocusChanged(int i)
    {
        sendAccessibilityEvent(i, 8);
        moveAccessibilityFocusToId(i);
    }

    private void handleHover(int i)
    {
        if (mLastHoverId == i)
        {
            return;
        } else
        {
            sendAccessibilityEvent(i, 128);
            sendAccessibilityEvent(mLastHoverId, 256);
            mLastHoverId = i;
            return;
        }
    }

    private void handleNavigate()
    {
        mAccessibilityFocusId = -1;
        mAccessibilityFocusRect = null;
        mUserHasTouchExplored = false;
        mView.sendAccessibilityEvent(2048);
    }

    private void handlePageLoaded(int i)
    {
        while (mUserHasTouchExplored || !mContentViewCore.shouldSetAccessibilityFocusOnPageLoad()) 
        {
            return;
        }
        moveAccessibilityFocusToIdAndRefocusIfNeeded(i);
    }

    private void handleScrollPositionChanged(int i)
    {
        sendAccessibilityEvent(i, 4096);
    }

    private void handleScrolledToAnchor(int i)
    {
        moveAccessibilityFocusToId(i);
    }

    private void handleTextSelectionChanged(int i)
    {
        sendAccessibilityEvent(i, 8192);
    }

    private boolean isFrameInfoInitialized()
    {
        return (double)mRenderCoordinates.getContentWidthCss() != 0.0D || (double)mRenderCoordinates.getContentHeightCss() != 0.0D;
    }

    private boolean jumpToElementType(String s, boolean flag)
    {
        int i = nativeFindElementType(mNativeObj, mAccessibilityFocusId, s, flag);
        if (i == 0)
        {
            return false;
        } else
        {
            moveAccessibilityFocusToId(i);
            return true;
        }
    }

    private boolean moveAccessibilityFocusToId(int i)
    {
        if (i == mAccessibilityFocusId)
        {
            return false;
        } else
        {
            mAccessibilityFocusId = i;
            mAccessibilityFocusRect = null;
            sendAccessibilityEvent(mAccessibilityFocusId, 32768);
            return true;
        }
    }

    private void moveAccessibilityFocusToIdAndRefocusIfNeeded(int i)
    {
        if (i == mAccessibilityFocusId)
        {
            sendAccessibilityEvent(i, 0x10000);
            mAccessibilityFocusId = -1;
        }
        moveAccessibilityFocusToId(i);
    }

    private native void nativeBlur(long l);

    private native void nativeClick(long l, int i);

    private native int nativeFindElementType(long l, int i, String s, boolean flag);

    private native void nativeFocus(long l, int i);

    private native int nativeGetRootId(long l);

    private native void nativeHitTest(long l, int i, int j);

    private native boolean nativeIsNodeValid(long l, int i);

    private native boolean nativePopulateAccessibilityEvent(long l, AccessibilityEvent accessibilityevent, int i, int j);

    private native boolean nativePopulateAccessibilityNodeInfo(long l, AccessibilityNodeInfo accessibilitynodeinfo, int i);

    private native void nativeScrollToMakeNodeVisible(long l, int i);

    private void onNativeObjectDestroyed()
    {
        if (mContentViewCore.getBrowserAccessibilityManager() == this)
        {
            mContentViewCore.setBrowserAccessibilityManager(null);
        }
        mNativeObj = 0L;
        mContentViewCore = null;
    }

    private void sendAccessibilityEvent(int i, int j)
    {
        if (!mAccessibilityManager.isEnabled() || mNativeObj == 0L || !isFrameInfoInitialized())
        {
            return;
        }
        mView.postInvalidate();
        if (i == -1)
        {
            mView.sendAccessibilityEvent(j);
            return;
        }
        AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
        accessibilityevent.setPackageName(mContentViewCore.getContext().getPackageName());
        accessibilityevent.setSource(mView, i);
        if (!nativePopulateAccessibilityEvent(mNativeObj, accessibilityevent, i, j))
        {
            accessibilityevent.recycle();
            return;
        } else
        {
            mView.requestSendAccessibilityEvent(mView, accessibilityevent);
            return;
        }
    }

    private void setAccessibilityEventBooleanAttributes(AccessibilityEvent accessibilityevent, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        accessibilityevent.setChecked(flag);
        accessibilityevent.setEnabled(flag1);
        accessibilityevent.setPassword(flag2);
        accessibilityevent.setScrollable(flag3);
    }

    private void setAccessibilityEventClassName(AccessibilityEvent accessibilityevent, String s)
    {
        accessibilityevent.setClassName(s);
    }

    private void setAccessibilityEventListAttributes(AccessibilityEvent accessibilityevent, int i, int j)
    {
        accessibilityevent.setCurrentItemIndex(i);
        accessibilityevent.setItemCount(j);
    }

    private void setAccessibilityEventScrollAttributes(AccessibilityEvent accessibilityevent, int i, int j, int k, int l)
    {
        accessibilityevent.setScrollX(i);
        accessibilityevent.setScrollY(j);
        accessibilityevent.setMaxScrollX(k);
        accessibilityevent.setMaxScrollY(l);
    }

    private void setAccessibilityEventSelectionAttrs(AccessibilityEvent accessibilityevent, int i, int j, int k, String s)
    {
        accessibilityevent.setFromIndex(i);
        accessibilityevent.setAddedCount(j);
        accessibilityevent.setItemCount(k);
        accessibilityevent.getText().add(s);
    }

    private void setAccessibilityEventTextChangedAttrs(AccessibilityEvent accessibilityevent, int i, int j, int k, String s, String s1)
    {
        accessibilityevent.setFromIndex(i);
        accessibilityevent.setAddedCount(j);
        accessibilityevent.setRemovedCount(k);
        accessibilityevent.setBeforeText(s);
        accessibilityevent.getText().add(s1);
    }

    private void setAccessibilityNodeInfoBooleanAttributes(AccessibilityNodeInfo accessibilitynodeinfo, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, 
            boolean flag5, boolean flag6, boolean flag7, boolean flag8, boolean flag9)
    {
        accessibilitynodeinfo.setCheckable(flag);
        accessibilitynodeinfo.setChecked(flag1);
        accessibilitynodeinfo.setClickable(flag2);
        accessibilitynodeinfo.setEnabled(flag3);
        accessibilitynodeinfo.setFocusable(flag4);
        accessibilitynodeinfo.setFocused(flag5);
        accessibilitynodeinfo.setPassword(flag6);
        accessibilitynodeinfo.setScrollable(flag7);
        accessibilitynodeinfo.setSelected(flag8);
        accessibilitynodeinfo.setVisibleToUser(flag9);
        accessibilitynodeinfo.addAction(1024);
        accessibilitynodeinfo.addAction(2048);
        if (flag4)
        {
            if (flag5)
            {
                accessibilitynodeinfo.addAction(2);
            } else
            {
                accessibilitynodeinfo.addAction(1);
            }
        }
        if (mAccessibilityFocusId == i)
        {
            accessibilitynodeinfo.setAccessibilityFocused(true);
            accessibilitynodeinfo.addAction(128);
        } else
        {
            accessibilitynodeinfo.setAccessibilityFocused(false);
            accessibilitynodeinfo.addAction(64);
        }
        if (flag2)
        {
            accessibilitynodeinfo.addAction(16);
        }
    }

    private void setAccessibilityNodeInfoClassName(AccessibilityNodeInfo accessibilitynodeinfo, String s)
    {
        accessibilitynodeinfo.setClassName(s);
    }

    private void setAccessibilityNodeInfoContentDescription(AccessibilityNodeInfo accessibilitynodeinfo, String s, boolean flag)
    {
        if (flag)
        {
            s = new SpannableString(s);
            s.setSpan(new URLSpan(""), 0, s.length(), 0);
            accessibilitynodeinfo.setContentDescription(s);
            return;
        } else
        {
            accessibilitynodeinfo.setContentDescription(s);
            return;
        }
    }

    private void setAccessibilityNodeInfoLocation(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j, int k, int l, int i1, int j1, 
            int k1, boolean flag)
    {
        Rect rect = new Rect(l, i1, l + j1, i1 + k1);
        if (flag)
        {
            rect.offset(0, (int)mRenderCoordinates.getContentOffsetYPix());
        }
        accessibilitynodeinfo.setBoundsInParent(rect);
        rect = new Rect(j, k, j + j1, k + k1);
        rect.offset(-(int)mRenderCoordinates.getScrollX(), -(int)mRenderCoordinates.getScrollY());
        rect.left = (int)mRenderCoordinates.fromLocalCssToPix(rect.left);
        rect.top = (int)mRenderCoordinates.fromLocalCssToPix(rect.top);
        rect.bottom = (int)mRenderCoordinates.fromLocalCssToPix(rect.bottom);
        rect.right = (int)mRenderCoordinates.fromLocalCssToPix(rect.right);
        rect.offset(0, (int)mRenderCoordinates.getContentOffsetYPix());
        int ai[] = new int[2];
        mView.getLocationOnScreen(ai);
        rect.offset(ai[0], ai[1]);
        accessibilitynodeinfo.setBoundsInScreen(rect);
        if (i == mAccessibilityFocusId && i != mCurrentRootId)
        {
            if (mAccessibilityFocusRect == null)
            {
                mAccessibilityFocusRect = rect;
            } else
            if (!mAccessibilityFocusRect.equals(rect))
            {
                mAccessibilityFocusRect = rect;
                moveAccessibilityFocusToIdAndRefocusIfNeeded(i);
                return;
            }
        }
    }

    private void setAccessibilityNodeInfoParent(AccessibilityNodeInfo accessibilitynodeinfo, int i)
    {
        accessibilitynodeinfo.setParent(mView, i);
    }

    protected AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        AccessibilityNodeInfo accessibilitynodeinfo;
        if (!mAccessibilityManager.isEnabled() || mNativeObj == 0L)
        {
            accessibilitynodeinfo = null;
        } else
        {
            int j = nativeGetRootId(mNativeObj);
            if (i == -1)
            {
                return createNodeForHost(j);
            }
            if (!isFrameInfoInitialized())
            {
                return null;
            }
            AccessibilityNodeInfo accessibilitynodeinfo1 = AccessibilityNodeInfo.obtain(mView);
            accessibilitynodeinfo1.setPackageName(mContentViewCore.getContext().getPackageName());
            accessibilitynodeinfo1.setSource(mView, i);
            if (i == j)
            {
                accessibilitynodeinfo1.setParent(mView);
            }
            accessibilitynodeinfo = accessibilitynodeinfo1;
            if (!nativePopulateAccessibilityNodeInfo(mNativeObj, accessibilitynodeinfo1, i))
            {
                accessibilitynodeinfo1.recycle();
                return null;
            }
        }
        return accessibilitynodeinfo;
    }

    protected List findAccessibilityNodeInfosByText(String s, int i)
    {
        return new ArrayList();
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        return null;
    }

    public void notifyFrameInfoInitialized()
    {
        if (!mNotifyFrameInfoInitializedCalled)
        {
            mNotifyFrameInfoInitializedCalled = true;
            mView.sendAccessibilityEvent(2048);
            if (mAccessibilityFocusId != -1)
            {
                moveAccessibilityFocusToIdAndRefocusIfNeeded(mAccessibilityFocusId);
                return;
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        if (!mAccessibilityManager.isEnabled() || mNativeObj == 0L)
        {
            return false;
        }
        if (motionevent.getAction() == 10)
        {
            mIsHovering = false;
            if (mPendingScrollToMakeNodeVisible)
            {
                nativeScrollToMakeNodeVisible(mNativeObj, mAccessibilityFocusId);
            }
            mPendingScrollToMakeNodeVisible = false;
            return true;
        } else
        {
            mIsHovering = true;
            mUserHasTouchExplored = true;
            float f = motionevent.getX();
            float f1 = motionevent.getY();
            int i = (int)mRenderCoordinates.fromPixToLocalCss(f);
            int j = (int)mRenderCoordinates.fromPixToLocalCss(f1);
            nativeHitTest(mNativeObj, i, j);
            return true;
        }
    }

    protected boolean performAction(int i, int j, Bundle bundle)
    {
        boolean flag = true;
        if (mAccessibilityManager.isEnabled() && mNativeObj != 0L && nativeIsNodeValid(mNativeObj, i)) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        switch (j)
        {
        default:
            return false;

        case 64: // '@'
            if (moveAccessibilityFocusToId(i))
            {
                if (!mIsHovering)
                {
                    nativeScrollToMakeNodeVisible(mNativeObj, mAccessibilityFocusId);
                    return true;
                } else
                {
                    mPendingScrollToMakeNodeVisible = true;
                    return true;
                }
            }
            break;

        case 128: 
            if (mAccessibilityFocusId == i)
            {
                sendAccessibilityEvent(mAccessibilityFocusId, 0x10000);
                mAccessibilityFocusId = -1;
                mAccessibilityFocusRect = null;
                return true;
            }
            break;

        case 16: // '\020'
            nativeClick(mNativeObj, i);
            sendAccessibilityEvent(i, 1);
            return true;

        case 1: // '\001'
            nativeFocus(mNativeObj, i);
            return true;

        case 2: // '\002'
            nativeBlur(mNativeObj);
            return true;

        case 1024: 
            if (bundle == null)
            {
                return false;
            }
            bundle = bundle.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
            if (bundle == null)
            {
                return false;
            } else
            {
                return jumpToElementType(bundle.toUpperCase(Locale.US), true);
            }

        case 2048: 
            if (bundle == null)
            {
                return false;
            }
            bundle = bundle.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
            if (bundle == null)
            {
                return false;
            } else
            {
                return jumpToElementType(bundle.toUpperCase(Locale.US), false);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void setAccessibilityEventCollectionInfo(AccessibilityEvent accessibilityevent, int i, int j, boolean flag)
    {
        accessibilityevent = getOrCreateBundleForAccessibilityEvent(accessibilityevent);
        accessibilityevent.putInt("AccessibilityNodeInfo.CollectionInfo.rowCount", i);
        accessibilityevent.putInt("AccessibilityNodeInfo.CollectionInfo.columnCount", j);
        accessibilityevent.putBoolean("AccessibilityNodeInfo.CollectionInfo.hierarchical", flag);
    }

    protected void setAccessibilityEventCollectionItemInfo(AccessibilityEvent accessibilityevent, int i, int j, int k, int l)
    {
        accessibilityevent = getOrCreateBundleForAccessibilityEvent(accessibilityevent);
        accessibilityevent.putInt("AccessibilityNodeInfo.CollectionItemInfo.rowIndex", i);
        accessibilityevent.putInt("AccessibilityNodeInfo.CollectionItemInfo.rowSpan", j);
        accessibilityevent.putInt("AccessibilityNodeInfo.CollectionItemInfo.columnIndex", k);
        accessibilityevent.putInt("AccessibilityNodeInfo.CollectionItemInfo.columnSpan", l);
    }

    protected void setAccessibilityEventHeadingFlag(AccessibilityEvent accessibilityevent, boolean flag)
    {
        getOrCreateBundleForAccessibilityEvent(accessibilityevent).putBoolean("AccessibilityNodeInfo.CollectionItemInfo.heading", flag);
    }

    protected void setAccessibilityEventKitKatAttributes(AccessibilityEvent accessibilityevent, boolean flag, boolean flag1, boolean flag2, boolean flag3, int i, int j)
    {
        accessibilityevent = getOrCreateBundleForAccessibilityEvent(accessibilityevent);
        accessibilityevent.putBoolean("AccessibilityNodeInfo.canOpenPopup", flag);
        accessibilityevent.putBoolean("AccessibilityNodeInfo.contentInvalid", flag1);
        accessibilityevent.putBoolean("AccessibilityNodeInfo.dismissable", flag2);
        accessibilityevent.putBoolean("AccessibilityNodeInfo.multiLine", flag3);
        accessibilityevent.putInt("AccessibilityNodeInfo.inputType", i);
        accessibilityevent.putInt("AccessibilityNodeInfo.liveRegion", j);
    }

    protected void setAccessibilityEventRangeInfo(AccessibilityEvent accessibilityevent, int i, float f, float f1, float f2)
    {
        accessibilityevent = getOrCreateBundleForAccessibilityEvent(accessibilityevent);
        accessibilityevent.putInt("AccessibilityNodeInfo.RangeInfo.type", i);
        accessibilityevent.putFloat("AccessibilityNodeInfo.RangeInfo.min", f);
        accessibilityevent.putFloat("AccessibilityNodeInfo.RangeInfo.max", f1);
        accessibilityevent.putFloat("AccessibilityNodeInfo.RangeInfo.current", f2);
    }

    protected void setAccessibilityNodeInfoCollectionInfo(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j, boolean flag)
    {
    }

    protected void setAccessibilityNodeInfoCollectionItemInfo(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j, int k, int l, boolean flag)
    {
    }

    protected void setAccessibilityNodeInfoKitKatAttributes(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag, boolean flag1, boolean flag2, boolean flag3, int i, int j)
    {
    }

    protected void setAccessibilityNodeInfoRangeInfo(AccessibilityNodeInfo accessibilitynodeinfo, int i, float f, float f1, float f2)
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewParentCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat
{
    private class ExploreByTouchNodeProvider extends AccessibilityNodeProviderCompat
    {

        final ExploreByTouchHelper this$0;

        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
        {
            return createNode(i);
        }

        public boolean performAction(int i, int j, Bundle bundle)
        {
            return ExploreByTouchHelper.this.performAction(i, j, bundle);
        }

        private ExploreByTouchNodeProvider()
        {
            this$0 = ExploreByTouchHelper.this;
            super();
        }

    }


    private static final String DEFAULT_CLASS_NAME = android/view/View.getName();
    public static final int INVALID_ID = 0x80000000;
    private int mFocusedVirtualViewId;
    private int mHoveredVirtualViewId;
    private final AccessibilityManager mManager;
    private ExploreByTouchNodeProvider mNodeProvider;
    private final int mTempGlobalRect[] = new int[2];
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final View mView;

    public ExploreByTouchHelper(View view)
    {
        mFocusedVirtualViewId = 0x80000000;
        mHoveredVirtualViewId = 0x80000000;
        if (view == null)
        {
            throw new IllegalArgumentException("View may not be null");
        } else
        {
            mView = view;
            mManager = (AccessibilityManager)view.getContext().getSystemService("accessibility");
            return;
        }
    }

    private boolean clearAccessibilityFocus(int i)
    {
        if (isAccessibilityFocused(i))
        {
            mFocusedVirtualViewId = 0x80000000;
            mView.invalidate();
            sendEventForVirtualView(i, 0x10000);
            return true;
        } else
        {
            return false;
        }
    }

    private AccessibilityEvent createEvent(int i, int j)
    {
        switch (i)
        {
        default:
            return createEventForChild(i, j);

        case -1: 
            return createEventForHost(j);
        }
    }

    private AccessibilityEvent createEventForChild(int i, int j)
    {
        AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
        accessibilityevent.setEnabled(true);
        accessibilityevent.setClassName(DEFAULT_CLASS_NAME);
        onPopulateEventForVirtualView(i, accessibilityevent);
        if (accessibilityevent.getText().isEmpty() && accessibilityevent.getContentDescription() == null)
        {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        } else
        {
            accessibilityevent.setPackageName(mView.getContext().getPackageName());
            AccessibilityEventCompat.asRecord(accessibilityevent).setSource(mView, i);
            return accessibilityevent;
        }
    }

    private AccessibilityEvent createEventForHost(int i)
    {
        AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(i);
        ViewCompat.onInitializeAccessibilityEvent(mView, accessibilityevent);
        return accessibilityevent;
    }

    private AccessibilityNodeInfoCompat createNode(int i)
    {
        switch (i)
        {
        default:
            return createNodeForChild(i);

        case -1: 
            return createNodeForHost();
        }
    }

    private AccessibilityNodeInfoCompat createNodeForChild(int i)
    {
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain();
        accessibilitynodeinfocompat.setEnabled(true);
        accessibilitynodeinfocompat.setClassName(DEFAULT_CLASS_NAME);
        onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat);
        if (accessibilitynodeinfocompat.getText() == null && accessibilitynodeinfocompat.getContentDescription() == null)
        {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilitynodeinfocompat.getBoundsInParent(mTempParentRect);
        if (mTempParentRect.isEmpty())
        {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int j = accessibilitynodeinfocompat.getActions();
        if ((j & 0x40) != 0)
        {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((j & 0x80) != 0)
        {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilitynodeinfocompat.setPackageName(mView.getContext().getPackageName());
        accessibilitynodeinfocompat.setSource(mView, i);
        accessibilitynodeinfocompat.setParent(mView);
        if (mFocusedVirtualViewId == i)
        {
            accessibilitynodeinfocompat.setAccessibilityFocused(true);
            accessibilitynodeinfocompat.addAction(128);
        } else
        {
            accessibilitynodeinfocompat.setAccessibilityFocused(false);
            accessibilitynodeinfocompat.addAction(64);
        }
        if (intersectVisibleToUser(mTempParentRect))
        {
            accessibilitynodeinfocompat.setVisibleToUser(true);
            accessibilitynodeinfocompat.setBoundsInParent(mTempParentRect);
        }
        mView.getLocationOnScreen(mTempGlobalRect);
        i = mTempGlobalRect[0];
        j = mTempGlobalRect[1];
        mTempScreenRect.set(mTempParentRect);
        mTempScreenRect.offset(i, j);
        accessibilitynodeinfocompat.setBoundsInScreen(mTempScreenRect);
        return accessibilitynodeinfocompat;
    }

    private AccessibilityNodeInfoCompat createNodeForHost()
    {
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain(mView);
        ViewCompat.onInitializeAccessibilityNodeInfo(mView, accessibilitynodeinfocompat);
        Object obj = new LinkedList();
        getVisibleVirtualViews(((List) (obj)));
        Integer integer;
        for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); accessibilitynodeinfocompat.addChild(mView, integer.intValue()))
        {
            integer = (Integer)((Iterator) (obj)).next();
        }

        return accessibilitynodeinfocompat;
    }

    private boolean intersectVisibleToUser(Rect rect)
    {
_L2:
        return false;
        if (rect == null || rect.isEmpty() || mView.getWindowVisibility() != 0) goto _L2; else goto _L1
_L1:
        Object obj = mView.getParent();
_L4:
        if (!(obj instanceof View))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (View)obj;
        if (ViewCompat.getAlpha(((View) (obj))) <= 0.0F || ((View) (obj)).getVisibility() != 0) goto _L2; else goto _L3
_L3:
        obj = ((View) (obj)).getParent();
          goto _L4
        if (obj == null || !mView.getLocalVisibleRect(mTempVisibleRect)) goto _L2; else goto _L5
_L5:
        return rect.intersect(mTempVisibleRect);
    }

    private boolean isAccessibilityFocused(int i)
    {
        return mFocusedVirtualViewId == i;
    }

    private boolean manageFocusForChild(int i, int j, Bundle bundle)
    {
        switch (j)
        {
        default:
            return false;

        case 64: // '@'
            return requestAccessibilityFocus(i);

        case 128: 
            return clearAccessibilityFocus(i);
        }
    }

    private boolean performAction(int i, int j, Bundle bundle)
    {
        switch (i)
        {
        default:
            return performActionForChild(i, j, bundle);

        case -1: 
            return performActionForHost(j, bundle);
        }
    }

    private boolean performActionForChild(int i, int j, Bundle bundle)
    {
        switch (j)
        {
        default:
            return onPerformActionForVirtualView(i, j, bundle);

        case 64: // '@'
        case 128: 
            return manageFocusForChild(i, j, bundle);
        }
    }

    private boolean performActionForHost(int i, Bundle bundle)
    {
        return ViewCompat.performAccessibilityAction(mView, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i)
    {
        while (!mManager.isEnabled() || !AccessibilityManagerCompat.isTouchExplorationEnabled(mManager) || isAccessibilityFocused(i)) 
        {
            return false;
        }
        mFocusedVirtualViewId = i;
        mView.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i)
    {
        if (mHoveredVirtualViewId == i)
        {
            return;
        } else
        {
            int j = mHoveredVirtualViewId;
            mHoveredVirtualViewId = i;
            sendEventForVirtualView(i, 128);
            sendEventForVirtualView(j, 256);
            return;
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (mManager.isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(mManager))
        {
            switch (motionevent.getAction())
            {
            case 8: // '\b'
            default:
                return false;

            case 7: // '\007'
            case 9: // '\t'
                int i = getVirtualViewAt(motionevent.getX(), motionevent.getY());
                updateHoveredVirtualView(i);
                if (i == 0x80000000)
                {
                    flag = false;
                }
                return flag;

            case 10: // '\n'
                break;
            }
            if (mFocusedVirtualViewId != 0x80000000)
            {
                updateHoveredVirtualView(0x80000000);
                return true;
            }
        }
        return false;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        if (mNodeProvider == null)
        {
            mNodeProvider = new ExploreByTouchNodeProvider();
        }
        return mNodeProvider;
    }

    public int getFocusedVirtualView()
    {
        return mFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f, float f1);

    protected abstract void getVisibleVirtualViews(List list);

    public void invalidateRoot()
    {
        invalidateVirtualView(-1);
    }

    public void invalidateVirtualView(int i)
    {
        sendEventForVirtualView(i, 2048);
    }

    protected abstract boolean onPerformActionForVirtualView(int i, int j, Bundle bundle);

    protected abstract void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityevent);

    protected abstract void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

    public boolean sendEventForVirtualView(int i, int j)
    {
        android.view.ViewParent viewparent;
        if (i != 0x80000000 && mManager.isEnabled())
        {
            if ((viewparent = mView.getParent()) != null)
            {
                AccessibilityEvent accessibilityevent = createEvent(i, j);
                return ViewParentCompat.requestSendAccessibilityEvent(viewparent, mView, accessibilityevent);
            }
        }
        return false;
    }



}

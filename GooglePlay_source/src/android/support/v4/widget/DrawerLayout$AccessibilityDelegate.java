// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class this._cls0 extends AccessibilityDelegateCompat
{

    private final Rect mTmpRect = new Rect();
    final DrawerLayout this$0;

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            accessibilityevent = accessibilityevent.getText();
            view = DrawerLayout.access$300(DrawerLayout.this);
            if (view != null)
            {
                int i = getDrawerViewAbsoluteGravity(view);
                view = DrawerLayout.this;
                i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(view));
                if (i == 3)
                {
                    view = ((DrawerLayout) (view)).mTitleLeft;
                } else
                if (i == 5)
                {
                    view = ((DrawerLayout) (view)).mTitleRight;
                } else
                {
                    view = null;
                }
                if (view != null)
                {
                    accessibilityevent.add(view);
                }
            }
            return true;
        } else
        {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        if (DrawerLayout.access$200())
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        } else
        {
            AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
            AccessibilityNodeInfoCompat.IMPL.setSource(accessibilitynodeinfocompat.mInfo, view);
            Object obj = ViewCompat.getParentForAccessibility(view);
            if (obj instanceof View)
            {
                accessibilitynodeinfocompat.setParent((View)obj);
            }
            obj = mTmpRect;
            accessibilitynodeinfocompat1.getBoundsInParent(((Rect) (obj)));
            AccessibilityNodeInfoCompat.IMPL.setBoundsInParent(accessibilitynodeinfocompat.mInfo, ((Rect) (obj)));
            accessibilitynodeinfocompat1.getBoundsInScreen(((Rect) (obj)));
            AccessibilityNodeInfoCompat.IMPL.setBoundsInScreen(accessibilitynodeinfocompat.mInfo, ((Rect) (obj)));
            boolean flag = AccessibilityNodeInfoCompat.IMPL.isVisibleToUser(accessibilitynodeinfocompat1.mInfo);
            AccessibilityNodeInfoCompat.IMPL.setVisibleToUser(accessibilitynodeinfocompat.mInfo, flag);
            obj = accessibilitynodeinfocompat1.getPackageName();
            AccessibilityNodeInfoCompat.IMPL.setPackageName(accessibilitynodeinfocompat.mInfo, ((CharSequence) (obj)));
            accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
            obj = accessibilitynodeinfocompat1.getContentDescription();
            AccessibilityNodeInfoCompat.IMPL.setContentDescription(accessibilitynodeinfocompat.mInfo, ((CharSequence) (obj)));
            flag = accessibilitynodeinfocompat1.isEnabled();
            AccessibilityNodeInfoCompat.IMPL.setEnabled(accessibilitynodeinfocompat.mInfo, flag);
            flag = accessibilitynodeinfocompat1.isClickable();
            AccessibilityNodeInfoCompat.IMPL.setClickable(accessibilitynodeinfocompat.mInfo, flag);
            accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
            accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
            flag = AccessibilityNodeInfoCompat.IMPL.isAccessibilityFocused(accessibilitynodeinfocompat1.mInfo);
            AccessibilityNodeInfoCompat.IMPL.setAccessibilityFocused(accessibilitynodeinfocompat.mInfo, flag);
            flag = accessibilitynodeinfocompat1.isSelected();
            AccessibilityNodeInfoCompat.IMPL.setSelected(accessibilitynodeinfocompat.mInfo, flag);
            flag = accessibilitynodeinfocompat1.isLongClickable();
            AccessibilityNodeInfoCompat.IMPL.setLongClickable(accessibilitynodeinfocompat.mInfo, flag);
            accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
            AccessibilityNodeInfoCompat.IMPL.recycle(accessibilitynodeinfocompat1.mInfo);
            view = (ViewGroup)view;
            int j = view.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view1 = view.getChildAt(i);
                if (DrawerLayout.access$400(view1))
                {
                    AccessibilityNodeInfoCompat.IMPL.addChild(accessibilitynodeinfocompat.mInfo, view1);
                }
                i++;
            }
        }
        accessibilitynodeinfocompat.setClassName(android/support/v4/widget/DrawerLayout.getName());
        accessibilitynodeinfocompat.setFocusable(false);
        accessibilitynodeinfocompat.setFocused(false);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.access$200() || DrawerLayout.access$400(view))
        {
            return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    mpat()
    {
        this$0 = DrawerLayout.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Field;

public final class aaj extends ListViewCompat
{

    private boolean h;
    private boolean i;
    private boolean j;
    private pl k;

    public aaj(Context context, boolean flag)
    {
        super(context, null, 0x7f01011e);
        i = flag;
        setCacheColorHint(0);
    }

    public static boolean a(aaj aaj1, boolean flag)
    {
        aaj1.h = flag;
        return flag;
    }

    protected final boolean a()
    {
        return j || super.a();
    }

    public final boolean a(MotionEvent motionevent, int l)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = jo.a(motionevent);
        i1;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 144
    //                   2 147
    //                   3 136;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = true;
        l = 0;
_L7:
        if (!flag || l != 0)
        {
            j = false;
            setPressed(false);
            drawableStateChanged();
            View view = getChildAt(this.f - getFirstVisiblePosition());
            if (view != null)
            {
                view.setPressed(false);
            }
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (k == null)
        {
            k = new pl(this);
        }
        k.a(true);
        k.onTouch(this, motionevent);
_L9:
        return flag;
_L4:
        flag = false;
        l = 0;
          goto _L7
_L2:
        flag = false;
_L3:
        int j1;
        int k1;
        j1 = motionevent.findPointerIndex(l);
        if (j1 < 0)
        {
            flag = false;
            l = 0;
        } else
        {
label0:
            {
                l = (int)motionevent.getX(j1);
                k1 = (int)motionevent.getY(j1);
                j1 = pointToPosition(l, k1);
                if (j1 != -1)
                {
                    break label0;
                }
                l = 1;
            }
        }
          goto _L7
        View view1 = getChildAt(j1 - getFirstVisiblePosition());
        float f = l;
        float f1 = k1;
        j = true;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            drawableHotspotChanged(f, f1);
        }
        if (!isPressed())
        {
            setPressed(true);
        }
        layoutChildren();
        if (this.f != -1)
        {
            View view2 = getChildAt(this.f - getFirstVisiblePosition());
            if (view2 != null && view2 != view1 && view2.isPressed())
            {
                view2.setPressed(false);
            }
        }
        this.f = j1;
        float f2 = view1.getLeft();
        float f3 = view1.getTop();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            view1.drawableHotspotChanged(f - f2, f1 - f3);
        }
        if (!view1.isPressed())
        {
            view1.setPressed(true);
        }
        setSelection(j1);
        Drawable drawable = getSelector();
        Object obj;
        if (drawable != null && j1 != -1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            drawable.setVisible(false, false);
        }
        obj = super.a;
        ((Rect) (obj)).set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
        obj.left = ((Rect) (obj)).left - super.b;
        obj.top = ((Rect) (obj)).top - super.c;
        obj.right = ((Rect) (obj)).right + super.d;
        obj.bottom = ((Rect) (obj)).bottom + super.e;
        flag = super.g.getBoolean(this);
        if (view1.isEnabled() == flag)
        {
            break MISSING_BLOCK_LABEL_551;
        }
        obj = super.g;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Field) (obj)).set(this, Boolean.valueOf(flag));
        if (j1 != -1)
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
        if (l != 0)
        {
            obj = super.a;
            f2 = ((Rect) (obj)).exactCenterX();
            f3 = ((Rect) (obj)).exactCenterY();
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
            dm.a(drawable, f2, f3);
        }
        drawable = getSelector();
        if (drawable != null && j1 != -1)
        {
            dm.a(drawable, f, f1);
        }
        a(false);
        refreshDrawableState();
        if (i1 == 1)
        {
            performItemClick(view1, j1, getItemIdAtPosition(j1));
        }
          goto _L1
_L6:
        if (k == null) goto _L9; else goto _L8
_L8:
        k.a(false);
        return flag;
          goto _L7
    }

    public final boolean hasFocus()
    {
        return i || super.hasFocus();
    }

    public final boolean hasWindowFocus()
    {
        return i || super.hasWindowFocus();
    }

    public final boolean isFocused()
    {
        return i || super.isFocused();
    }

    public final boolean isInTouchMode()
    {
        return i && h || super.isInTouchMode();
    }
}

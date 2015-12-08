// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.view.at;
import android.support.v4.view.dq;
import android.support.v4.widget.ak;
import android.support.v7.a.b;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Field;

class setCacheColorHint extends ListViewCompat
{

    private boolean g;
    private boolean h;
    private boolean i;
    private dq j;
    private ak k;

    static boolean a(setCacheColorHint setcachecolorhint, boolean flag)
    {
        setcachecolorhint.g = flag;
        return flag;
    }

    protected final boolean a()
    {
        return i || super.a();
    }

    public final boolean a(MotionEvent motionevent, int l)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = at.a(motionevent);
        i1;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 137
    //                   2 140
    //                   3 129;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = true;
        l = 0;
_L7:
        if (!flag || l != 0)
        {
            i = false;
            setPressed(false);
            drawableStateChanged();
            if (j != null)
            {
                j.a();
                j = null;
            }
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (k == null)
        {
            k = new ak(this);
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
        View view = getChildAt(j1 - getFirstVisiblePosition());
        float f = l;
        float f1 = k1;
        i = true;
        setPressed(true);
        layoutChildren();
        setSelection(j1);
        Drawable drawable = getSelector();
        float f2;
        float f3;
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
        ((Rect) (obj)).set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        obj.left = ((Rect) (obj)).left - super.b;
        obj.top = ((Rect) (obj)).top - super.c;
        obj.right = ((Rect) (obj)).right + super.d;
        obj.bottom = ((Rect) (obj)).bottom + super.e;
        flag = super.f.getBoolean(this);
        if (view.isEnabled() == flag)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        obj = super.f;
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
            android.support.v4.a.a.a.a(drawable, f2, f3);
        }
        drawable = getSelector();
        if (drawable != null && j1 != -1)
        {
            android.support.v4.a.a.a.a(drawable, f, f1);
        }
        setSelectorEnabled(false);
        refreshDrawableState();
        if (i1 == 1)
        {
            performItemClick(view, j1, getItemIdAtPosition(j1));
        }
          goto _L1
_L6:
        if (k == null) goto _L9; else goto _L8
_L8:
        k.a(false);
        return flag;
          goto _L7
    }

    public boolean hasFocus()
    {
        return h || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return h || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return h || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return h && g || super.isInTouchMode();
    }

    public (Context context, boolean flag)
    {
        super(context, null, b.dropDownListViewStyle);
        h = flag;
        setCacheColorHint(0);
    }
}

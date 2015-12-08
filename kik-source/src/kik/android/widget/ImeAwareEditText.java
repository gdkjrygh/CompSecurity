// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

// Referenced classes of package kik.android.widget:
//            RobotoEditText

public class ImeAwareEditText extends RobotoEditText
{
    public static interface a
    {

        public abstract void l();
    }

    public static interface b
    {

        public abstract boolean a(KeyEvent keyevent);
    }


    private Rect a;
    private DisplayMetrics b;
    private a c;
    private b d;
    private boolean e;

    public ImeAwareEditText(Context context)
    {
        this(context, null);
    }

    public ImeAwareEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Rect();
        e = false;
        b = getResources().getDisplayMetrics();
    }

    public ImeAwareEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
        e = false;
        b = getResources().getDisplayMetrics();
    }

    public final void a(a a1)
    {
        c = a1;
    }

    public final void a(b b1)
    {
        d = b1;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        if (c != null)
        {
            return d.a(keyevent);
        } else
        {
            return super.dispatchKeyEventPreIme(keyevent);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        if (e && editorinfo != null)
        {
            editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        }
        return inputconnection;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag;
        if (motionevent.getAction() == 1 && isFocused())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if ((getText() instanceof Editable) && onCheckIsTextEditor() && isEnabled())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                getWindowVisibleDisplayFrame(a);
                if (b.heightPixels - a.bottom < 50 && c != null)
                {
                    c.l();
                }
            }
        }
        return super.onTouchEvent(motionevent);
    }
}

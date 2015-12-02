// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster.draglist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.gamebooster.draglist:
//            DragListAdapter, DragLayer, DeleteZone

public class DragLayerListView extends FrameLayout
{
    public static interface a
    {

        public abstract void d();
    }


    boolean a;
    private ListView b;
    private DragLayer c;
    private DeleteZone d;
    private View e;
    private float f;
    private Bitmap g;
    private float h;
    private float i;
    private boolean j;
    private DragListAdapter k;
    private ViewConfiguration l;
    private float m;

    public DragLayerListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = 1.1F;
        a = false;
        l = ViewConfiguration.get(context);
    }

    private void a()
    {
        a = true;
        k.d();
    }

    public void a(int i1)
    {
        if (b == null)
        {
            return;
        } else
        {
            b.smoothScrollToPosition(i1);
            return;
        }
    }

    public void a(View view)
    {
        c.setVisibility(0);
        e = view;
        e.setPressed(false);
        if (k != null)
        {
            k.a(DragListAdapter.DragState.StartDrag, view);
        }
        view = view.findViewById(0x7f0b0049);
        int i1 = (int)(f * (float)view.getMeasuredWidth());
        int j1 = (int)(f * (float)view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        g = Bitmap.createScaledBitmap(view.getDrawingCache(), i1, j1, true);
        view.setDrawingCacheEnabled(false);
        e.setVisibility(4);
        Rect rect = new Rect();
        b.offsetDescendantRectToMyCoords(view, rect);
        rect.top = rect.top + r.a(getContext(), 60F);
        i1 = (int)((float)rect.left - ((float)view.getMeasuredWidth() * (f - 1.0F)) / 2.0F);
        j1 = (int)((float)rect.top - ((float)view.getMeasuredHeight() * (f - 1.0F)) / 2.0F);
        c.setDragBitmap(g);
        c.c(h - (float)i1, i - (float)j1);
        c.a(i1, j1);
        j = true;
        d.setVisibility(0);
        d.a();
    }

    public void a(boolean flag)
    {
        if (e != null)
        {
            e.setVisibility(0);
        }
        e = null;
        invalidate();
        if (g != null)
        {
            g.recycle();
            g = null;
        }
    }

    public ListView getListView()
    {
        return b;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (ListView)findViewById(0x7f0b010d);
        c = (DragLayer)findViewById(0x7f0b010e);
        d = (DeleteZone)findViewById(0x7f0b00f7);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        if (j)
        {
            return true;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 54
    //                   1 48
    //                   2 72;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        h = f1;
        i = f2;
        m = f2;
        continue; /* Loop/switch isn't completed */
_L3:
        if (a)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f2 <= m)
        {
            break; /* Loop/switch isn't completed */
        }
        m = f2;
        if (true) goto _L1; else goto _L4
_L4:
        if (m - f2 <= (float)l.getScaledTouchSlop()) goto _L1; else goto _L5
_L5:
        a();
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        int i1;
        obj = null;
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        switch (motionevent.getAction())
        {
        default:
            return true;

        case 0: // '\0'
            h = f1;
            i = f2;
            return true;

        case 2: // '\002'
            c.b(f1, f2);
            d.a(e, f1, f2);
            return true;

        case 1: // '\001'
        case 3: // '\003'
            d.setVisibility(4);
            c.setDragBitmap(null);
            i1 = d.b(e, f1, f2);
            break;
        }
        i1;
        JVM INSTR tableswitch -1 1: default 144
    //                   -1 203
    //                   0 189
    //                   1 196;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_203;
_L1:
        motionevent = obj;
_L5:
        if (k != null)
        {
            k.a(motionevent, e);
        }
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        j = false;
        return true;
_L3:
        motionevent = DragListAdapter.DragState.Delete;
          goto _L5
_L4:
        motionevent = DragListAdapter.DragState.UnInstall;
          goto _L5
        motionevent = DragListAdapter.DragState.Release;
          goto _L5
    }

    public void setAdapter(DragListAdapter draglistadapter)
    {
        k = draglistadapter;
        if (d != null)
        {
            d.setAdapter(draglistadapter);
        }
    }
}

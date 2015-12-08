// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import com.skype.android.util.UpdateScheduler;

// Referenced classes of package com.skype.android.widget:
//            DynamicListWrapper

public class StaticGridView extends LinearLayout
    implements android.os.Handler.Callback, android.view.View.OnClickListener, android.view.View.OnLongClickListener, DynamicListWrapper
{
    private final class a
    {

        int a;
        int b;
        final StaticGridView c;

        private a()
        {
            c = StaticGridView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private Adapter a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private android.widget.AdapterView.OnItemClickListener i;
    private android.widget.AdapterView.OnItemLongClickListener j;
    private boolean k;
    private boolean l;
    private UpdateScheduler m;
    private DynamicListWrapper.OnRowItemsCountChangedListener n;
    private boolean o;
    private boolean p;

    public StaticGridView(Context context)
    {
        super(context);
        a(context, null);
    }

    public StaticGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public StaticGridView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(context, attributeset);
    }

    private LinearLayout a(int i1)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.setOrientation(i1);
        return linearlayout;
    }

    static UpdateScheduler a(StaticGridView staticgridview)
    {
        return staticgridview.m;
    }

    private void a()
    {
        int j1 = 3;
        int k1 = -1;
        this;
        JVM INSTR monitorenter ;
        boolean flag = isShown();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        removeAllViews();
        Object obj;
        Object obj1;
        int i1;
        int l1;
        if (b)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        setOrientation(i1);
        if (!p || getLayoutParams() == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = getLayoutParams();
        i1 = k1;
        if (b)
        {
            i1 = -2;
        }
        obj.width = i1;
        getLayoutParams().height = -1;
        if (!k) goto _L4; else goto _L3
_L3:
        i1 = d;
_L18:
        d = i1;
        if (!o) goto _L6; else goto _L5
_L5:
        if (!b) goto _L8; else goto _L7
_L7:
        i1 = a.getCount() / d;
_L20:
        if (!b) goto _L10; else goto _L9
_L9:
        j1 = d;
_L21:
        f = (getHeight() - getPaddingTop() - getPaddingBottom() - h * j1) / (j1 - 1);
        e = (getWidth() - getPaddingLeft() - getPaddingRight() - g * i1) / (i1 - 1);
_L22:
        if (b)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        obj = a(k1);
        l1 = 0;
_L41:
        if (l1 >= a.getCount()) goto _L1; else goto _L11
_L11:
        obj1 = a.getView(l1, null, null);
        a a1 = new a((byte)0);
        a1.a = l1;
        a1.b = ((LinearLayout) (obj)).getId();
        ((View) (obj1)).setTag(a1);
        ((View) (obj1)).setOnClickListener(this);
        ((View) (obj1)).setOnLongClickListener(this);
        if (!l) goto _L13; else goto _L12
_L12:
        j1 = c;
        i1 = j1;
_L24:
        ((LinearLayout) (obj)).addView(((View) (obj1)), new android.widget.LinearLayout.LayoutParams(j1, i1));
        if (l1 != a.getCount() - 1) goto _L15; else goto _L14
_L14:
        addView(((View) (obj)));
        obj1 = obj;
          goto _L16
_L4:
        if (!b)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        i1 = j1;
        if (a.getCount() > 8) goto _L18; else goto _L17
_L17:
        i1 = 2;
          goto _L18
        i1 = j1;
        if (a.getCount() <= 8) goto _L18; else goto _L19
_L19:
        i1 = 4;
          goto _L18
_L8:
        i1 = d;
          goto _L20
_L10:
        j1 = a.getCount() / d;
          goto _L21
_L6:
        if (!b)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        i1 = (getHeight() - getPaddingTop() - getPaddingBottom() - (d - 1) * f) / d;
_L23:
        c = i1;
          goto _L22
        obj;
        throw obj;
        i1 = (getWidth() - getPaddingLeft() - getPaddingRight() - (d - 1) * e) / d;
          goto _L23
_L13:
label0:
        {
            if (!o)
            {
                break label0;
            }
            j1 = g;
            i1 = h;
        }
          goto _L24
        if (!b) goto _L26; else goto _L25
_L25:
        if (g == 0) goto _L28; else goto _L27
_L27:
        j1 = g;
_L31:
        if (!b) goto _L30; else goto _L29
_L29:
        i1 = c;
          goto _L24
_L26:
        j1 = c;
          goto _L31
_L30:
        if (h == 0)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        i1 = h;
          goto _L24
_L15:
        if (l1 % d == d - 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L33; else goto _L32
_L32:
        if (!b) goto _L35; else goto _L34
_L34:
        ((LinearLayout) (obj)).setPadding(0, 0, e, 0);
_L36:
        addView(((View) (obj)));
        obj1 = a(k1);
          goto _L16
_L35:
        ((LinearLayout) (obj)).setPadding(0, 0, 0, f);
          goto _L36
_L33:
        if (!b) goto _L38; else goto _L37
_L37:
        obj1 = obj;
        if (f == 0) goto _L16; else goto _L39
_L39:
        ((LinearLayout) (obj)).addView(new View(getContext()), new android.widget.LinearLayout.LayoutParams(1, f));
        obj1 = obj;
          goto _L16
_L38:
        obj1 = obj;
        if (e == 0) goto _L16; else goto _L40
_L40:
        ((LinearLayout) (obj)).addView(new View(getContext()), new android.widget.LinearLayout.LayoutParams(e, 1));
        obj1 = obj;
_L16:
        l1++;
        obj = obj1;
          goto _L41
_L28:
        j1 = -2;
          goto _L31
        i1 = -2;
          goto _L24
    }

    private void a(Context context, AttributeSet attributeset)
    {
        b = b();
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, R.styleable.StaticGridView);
            setMaxItemsPerRow(context.getInt(0, -1));
            l = context.getBoolean(3, true);
            f = context.getDimensionPixelSize(1, 0);
            e = context.getDimensionPixelSize(2, 0);
            g = context.getDimensionPixelSize(6, 0);
            h = context.getDimensionPixelSize(7, 0);
            p = context.getBoolean(4, true);
            o = context.getBoolean(5, false);
            if (o && (g == 0 || h == 0))
            {
                throw new RuntimeException("stretchPaddingToFit specified, but no info about default row/column size");
            }
            context.recycle();
        } else
        {
            setMaxItemsPerRow(-1);
        }
        m = new UpdateScheduler(new Handler(this), 200L);
    }

    private boolean b()
    {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        a();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        if (view.getTag() instanceof a)
        {
            a a1 = (a)view.getTag();
            if (i != null)
            {
                i.onItemClick(null, view, a1.a, a1.b);
            }
            return;
        } else
        {
            throw new RuntimeException("Wrong tag type for view v");
        }
    }

    public boolean onLongClick(View view)
    {
        if (view.getTag() instanceof a)
        {
            a a1 = (a)view.getTag();
            if (j != null)
            {
                j.onItemLongClick(null, view, a1.a, a1.b);
            }
            return true;
        } else
        {
            throw new RuntimeException("Wrong tag type for view v");
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b = b();
        m.a(0);
    }

    public void setChoiceMode(int i1)
    {
    }

    public void setContentAdapter(Adapter adapter)
    {
        a = adapter;
        adapter.registerDataSetObserver(new DataSetObserver() {

            final StaticGridView a;

            public final void onChanged()
            {
                StaticGridView.a(a).a(0);
            }

            
            {
                a = StaticGridView.this;
                super();
            }
        });
        m.a(0);
    }

    public void setDivider(Drawable drawable)
    {
    }

    public void setFastScrollEnabled(boolean flag)
    {
    }

    public void setItemChecked(int i1, boolean flag)
    {
    }

    public void setMaxItemsPerRow(int i1)
    {
        boolean flag = true;
        int j1;
        if (i1 != -1)
        {
            j1 = i1;
        } else
        {
            j1 = 1;
        }
        d = j1;
        if (i1 == -1)
        {
            flag = false;
        }
        k = flag;
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        i = onitemclicklistener;
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        j = onitemlongclicklistener;
    }

    public void setOnRowItemsCountChangeListener(DynamicListWrapper.OnRowItemsCountChangedListener onrowitemscountchangedlistener)
    {
        n = onrowitemscountchangedlistener;
    }

    public void setOverscrollFooter(Drawable drawable)
    {
    }

    public void setOverscrollHeader(Drawable drawable)
    {
    }

    public void setSelection(int i1)
    {
        throw new UnsupportedOperationException("Not implemented!");
    }
}

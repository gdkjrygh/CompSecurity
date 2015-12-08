// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import com.kik.view.adapters.au;
import java.util.HashMap;
import kik.android.util.cu;

// Referenced classes of package kik.android.widget:
//            TransparentListView, dh

public class ResizeEventList extends TransparentListView
{

    int a[];
    private cu b;

    public ResizeEventList(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(ArrayAdapter arrayadapter, boolean flag)
    {
        if (arrayadapter instanceof au)
        {
            ((au)arrayadapter).a(false);
        }
        HashMap hashmap = new HashMap();
        int j = getFirstVisiblePosition();
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            hashmap.put(Long.valueOf(arrayadapter.getItemId(j + i)), new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }

        arrayadapter.notifyDataSetChanged();
        if (arrayadapter instanceof au)
        {
            ((au)arrayadapter).a(true);
        }
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        viewtreeobserver.addOnPreDrawListener(new dh(this, viewtreeobserver, flag, arrayadapter, hashmap));
    }

    public final void a(cu cu1)
    {
        b = cu1;
    }

    protected float getBottomFadingEdgeStrength()
    {
        return 0.0F;
    }

    protected float getTopFadingEdgeStrength()
    {
        return 0.0F;
    }

    public boolean hasWindowFocus()
    {
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null && b != null)
        {
            b.a(a[1], a[3]);
            a = null;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a = (new int[] {
            i, j, k, l
        });
    }
}

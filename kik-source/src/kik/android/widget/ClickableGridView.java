// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.GridView;
import com.kik.sdkutils.y;
import java.lang.reflect.Field;

public class ClickableGridView extends GridView
{

    public ClickableGridView(Context context)
    {
        super(context, null);
        a();
    }

    public ClickableGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        a();
    }

    public ClickableGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        if (y.b(9))
        {
            break MISSING_BLOCK_LABEL_13;
        }
        setOverScrollMode(2);
        return;
        SecurityException securityexception;
        securityexception;
        securityexception.printStackTrace();
        return;
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

    public void setOverScrollMode(int i)
    {
        if (y.a(9) && y.b(11))
        {
            super.setOverScrollMode(0);
            try
            {
                Field field = android/widget/AbsListView.getDeclaredField("mEdgeGlowTop");
                Field field1 = android/widget/AbsListView.getDeclaredField("mEdgeGlowBottom");
                field.setAccessible(true);
                field1.setAccessible(true);
                Object obj = Class.forName("android.widget.EdgeGlow");
                Field field2 = ((Class) (obj)).getDeclaredField("mGlow");
                obj = ((Class) (obj)).getDeclaredField("mEdge");
                field2.setAccessible(true);
                ((Field) (obj)).setAccessible(true);
                field2.set(field.get(this), new BitmapDrawable());
                ((Field) (obj)).set(field.get(this), new BitmapDrawable());
                field2.set(field1.get(this), new BitmapDrawable());
                ((Field) (obj)).set(field1.get(this), new BitmapDrawable());
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        } else
        {
            super.setOverScrollMode(i);
            return;
        }
    }
}

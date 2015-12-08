// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class AmbilWarnaSquare extends View
{

    final float color[] = {
        1.0F, 1.0F, 1.0F
    };
    Shader luar;
    Paint paint;

    public AmbilWarnaSquare(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AmbilWarnaSquare(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (paint == null)
        {
            paint = new Paint();
            luar = new LinearGradient(0.0F, 0.0F, 0.0F, getMeasuredHeight(), -1, 0xff000000, android.graphics.Shader.TileMode.CLAMP);
        }
        int i = Color.HSVToColor(color);
        Object obj = new LinearGradient(0.0F, 0.0F, getMeasuredWidth(), 0.0F, -1, i, android.graphics.Shader.TileMode.CLAMP);
        obj = new ComposeShader(luar, ((Shader) (obj)), android.graphics.PorterDuff.Mode.MULTIPLY);
        paint.setShader(((Shader) (obj)));
        canvas.drawRect(0.0F, 0.0F, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    void setHue(float f)
    {
        color[0] = f;
        invalidate();
    }
}

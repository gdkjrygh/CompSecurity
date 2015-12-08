// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;

// Referenced classes of package com.skype.android.app.dialer:
//            DialKey

public class DialpadButton extends RelativeLayout
{

    private static final int BORDER_PIXEL_SIZE = 2;
    private static final int DEFAULT_STYLE = 0x7f09016b;
    private DialKey key;
    private TextView letters;
    private TextView number;
    private Rect rect;
    private Paint strokePaint;

    public DialpadButton(Context context)
    {
        super(context);
        init(null, 0x7f09016b);
    }

    public DialpadButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset, 0x7f09016b);
    }

    public DialpadButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset, i);
    }

    private void init(AttributeSet attributeset, int i)
    {
        strokePaint = new Paint();
        rect = new Rect(0, 0, 0, 0);
        LayoutInflater.from(getContext()).inflate(0x7f03007d, this, true);
        attributeset = getContext().obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.Dialpad, 0x7f010001, 0x7f09016b);
        letters = (TextView)findViewById(0x7f100351);
        number = (TextView)findViewById(0x7f100350);
        setupKey();
        i = attributeset.getColor(3, getResources().getColor(0x7f0f0121));
        letters.setTextColor(i);
        i = attributeset.getColor(2, getResources().getColor(0x7f0f0121));
        number.setTextColor(i);
        ViewUtil.a(this, attributeset.getDrawable(4));
        i = attributeset.getColor(1, getResources().getColor(0x7f0f0121));
        strokePaint.setStyle(android.graphics.Paint.Style.STROKE);
        strokePaint.setStrokeWidth(2.0F);
        strokePaint.setColor(i);
        attributeset.recycle();
    }

    public DialKey getDialKey()
    {
        return key;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        canvas.drawRect(rect, strokePaint);
    }

    public void setupKey()
    {
        DialKey adialkey[] = DialKey.values();
        int j = adialkey.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    DialKey dialkey = adialkey[i];
                    if (dialkey.getButtonId() != getId())
                    {
                        break label0;
                    }
                    letters.setText(dialkey.getLetters());
                    number.setText(dialkey.getKey());
                    key = dialkey;
                }
                return;
            }
            i++;
        } while (true);
    }
}

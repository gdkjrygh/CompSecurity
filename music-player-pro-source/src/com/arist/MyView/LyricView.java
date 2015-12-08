// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MyView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.Lyric;
import com.arist.util.MusicPreference;
import java.util.ArrayList;
import java.util.List;

public class LyricView extends TextView
{

    private List LyricList;
    private int color;
    private int highLightColor;
    private Paint highLightPaint;
    private float hight;
    private int index;
    private Paint paint;
    private float textHigh;
    private float textSize;
    private float width;

    public LyricView(Context context)
    {
        super(context);
        index = 0;
        LyricList = new ArrayList();
        init();
    }

    public LyricView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        index = 0;
        LyricList = new ArrayList();
        init();
    }

    public LyricView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        index = 0;
        LyricList = new ArrayList();
        init();
    }

    private void init()
    {
        setFocusable(true);
        textSize = MyApplication.musicPref.getLrcSize();
        textHigh = textSize + 10F;
        color = MyApplication.musicPref.getLrcColor();
        highLightColor = MyApplication.musicPref.getHighLightColor();
        highLightPaint = new Paint();
        highLightPaint.setAntiAlias(true);
        highLightPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    public void clearText()
    {
        LyricList = new ArrayList();
        Lyric lyric = new Lyric();
        lyric.setLyric("");
        lyric.setLyricTime(0);
        setText("");
        invalidate();
    }

    public List getLyricList()
    {
        return LyricList;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (canvas != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        highLightPaint.setColor(highLightColor);
        paint.setColor(color);
        highLightPaint.setTextSize(textSize + 3F);
        paint.setTextSize(textSize);
        highLightPaint.setTypeface(Typeface.SERIF);
        paint.setTypeface(Typeface.SERIF);
        float f;
        int i;
        try
        {
            canvas.drawText(((Lyric)LyricList.get(index)).getLyric(), width / 2.0F, hight / 2.0F, highLightPaint);
            f = hight / 2.0F;
            i = index - 1;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            return;
        }
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        f = hight / 2.0F;
        i = index + 1;
_L4:
        if (i >= LyricList.size())
        {
            break; /* Loop/switch isn't completed */
        }
        f += textHigh;
        canvas.drawText(((Lyric)LyricList.get(i)).getLyric(), width / 2.0F, f, paint);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        f -= textHigh;
        canvas.drawText(((Lyric)LyricList.get(i)).getLyric(), width / 2.0F, f, paint);
        i--;
        break MISSING_BLOCK_LABEL_132;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        hight = j;
        width = i;
    }

    public void setColor(int i)
    {
        color = i;
    }

    public void setHighLightColor(int i)
    {
        highLightColor = i;
    }

    public void setIndex(int i)
    {
        index = i;
    }

    public void setLyricList(List list)
    {
        LyricList = list;
    }

    public void setTextSize(float f)
    {
        textSize = f;
        textHigh = 10F + f;
    }
}

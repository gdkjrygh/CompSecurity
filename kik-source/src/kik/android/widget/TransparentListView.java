// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.kik.sdkutils.y;

public class TransparentListView extends ObservableListView
{

    public TransparentListView(Context context)
    {
        super(context);
        a();
    }

    public TransparentListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public TransparentListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        if (y.b(9))
        {
            break MISSING_BLOCK_LABEL_18;
        }
        setOverscrollFooter(null);
        setOverscrollHeader(null);
        return;
        SecurityException securityexception;
        securityexception;
        securityexception.printStackTrace();
        return;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return true;
        }
        return flag;
    }

    public void setTranscriptMode(int i)
    {
        super.setTranscriptMode(i);
    }
}

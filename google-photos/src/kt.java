// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Collections;

public class kt
    implements kq, ner
{

    private final GestureDetector a;

    public kt()
    {
    }

    public kt(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
    {
        a = new GestureDetector(context, ongesturelistener, handler);
    }

    public Object a(nek nek, Cursor cursor, boolean flag)
    {
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        return new nec(flag, Collections.singletonList(Integer.valueOf(cursor.getInt(0))), cursor.getString(1));
    }

    public final void a(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        a.setOnDoubleTapListener(ondoubletaplistener);
    }

    public final void a(boolean flag)
    {
        a.setIsLongpressEnabled(flag);
    }

    public final boolean a()
    {
        return a.isLongpressEnabled();
    }

    public final boolean a(MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }
}

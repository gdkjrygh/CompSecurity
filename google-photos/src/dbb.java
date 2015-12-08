// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.view.DragEvent;
import android.view.MotionEvent;

public interface dbb
{

    public abstract void a(dbd dbd);

    public abstract void a(dbd dbd, Canvas canvas);

    public abstract boolean a(dbd dbd, int i);

    public abstract boolean a(dbd dbd, DragEvent dragevent);

    public abstract boolean a(dbd dbd, MotionEvent motionevent);

    public abstract void b(dbd dbd, int i);
}

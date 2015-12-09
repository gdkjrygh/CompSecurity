// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dgh
{

    public android.view.MotionEvent.PointerProperties a[];
    public android.view.MotionEvent.PointerCoords b[];
    public int c[];
    public int d;

    public dgh()
    {
    }

    public final boolean a(int i)
    {
        return (d & 1 << i) != 0;
    }

    public final void b(int i)
    {
        boolean flag = false;
        if (a == null || a.length < i)
        {
            a = new android.view.MotionEvent.PointerProperties[i];
            for (int j = 0; j < a.length; j++)
            {
                if (a[j] == null)
                {
                    a[j] = new android.view.MotionEvent.PointerProperties();
                }
            }

        }
        if (b == null || b.length < i)
        {
            b = new android.view.MotionEvent.PointerCoords[i];
            for (int k = ((flag) ? 1 : 0); k < b.length; k++)
            {
                if (b[k] == null)
                {
                    b[k] = new android.view.MotionEvent.PointerCoords();
                }
            }

        }
        if (c == null || c.length < i)
        {
            c = new int[i];
        }
    }
}

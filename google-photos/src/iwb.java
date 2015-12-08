// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.touchcapture.TouchCaptureView;

final class iwb
    implements np
{

    private iwa a;

    iwb(iwa iwa1)
    {
        a = iwa1;
        super();
    }

    public final void a(int i, float f, int j)
    {
    }

    public final void b(int i)
    {
        if (a.b != null)
        {
            TouchCaptureView touchcaptureview = a.b.a();
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            touchcaptureview.a = flag;
        }
    }

    public final void c_(int i)
    {
    }
}

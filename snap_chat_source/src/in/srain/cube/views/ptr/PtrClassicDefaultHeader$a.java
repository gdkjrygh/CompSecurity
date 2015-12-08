// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr;

import android.text.TextUtils;

// Referenced classes of package in.srain.cube.views.ptr:
//            PtrClassicDefaultHeader

final class <init>
    implements Runnable
{

    private boolean a;
    private PtrClassicDefaultHeader b;

    static void a(<init> <init>1)
    {
        if (!TextUtils.isEmpty(PtrClassicDefaultHeader.a(<init>1.b)))
        {
            <init>1.a = true;
            <init>1.run();
        }
    }

    static void b(run run1)
    {
        run1.a = false;
        run1.b.removeCallbacks(run1);
    }

    public final void run()
    {
        PtrClassicDefaultHeader.b(b);
        if (a)
        {
            b.postDelayed(this, 1000L);
        }
    }

    private (PtrClassicDefaultHeader ptrclassicdefaultheader)
    {
        b = ptrclassicdefaultheader;
        super();
        a = false;
    }

    a(PtrClassicDefaultHeader ptrclassicdefaultheader, byte byte0)
    {
        this(ptrclassicdefaultheader);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr;


// Referenced classes of package in.srain.cube.views.ptr:
//            PtrFrameLayout

final class a
    implements Runnable
{

    private PtrFrameLayout a;

    public final void run()
    {
        PtrFrameLayout.b(a);
    }

    (PtrFrameLayout ptrframelayout)
    {
        a = ptrframelayout;
        super();
    }
}

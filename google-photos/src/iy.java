// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iy
    implements android.os.CancellationSignal.OnCancelListener
{

    private ix a;

    iy(ix ix1)
    {
        a = ix1;
        super();
    }

    public final void onCancel()
    {
        iw.a(a.a);
        a.cancel(false);
    }
}

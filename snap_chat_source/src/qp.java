// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;

public final class qp
    implements com.snapchat.android.ui.VideoFilterView.a
{
    public static interface a
    {

        public abstract void a(Wi wi);
    }


    private final a a;
    private boolean b;
    private Wi c;

    public qp(a a1)
    {
        b = true;
        a = a1;
    }

    public final void a(int i)
    {
        if (b)
        {
            a.a(c);
        }
        b = false;
        Timber.c("PreviewProgressUpdateCallback", (new StringBuilder("Rendering is ")).append(Integer.toString(i)).append("% complete").toString(), new Object[0]);
    }

    public final void a(Wi wi)
    {
        c = wi;
    }
}

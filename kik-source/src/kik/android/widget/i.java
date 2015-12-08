// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            BugmeBarView

final class i
    implements Runnable
{

    final BugmeBarView a;

    i(BugmeBarView bugmebarview)
    {
        a = bugmebarview;
        super();
    }

    public final void run()
    {
        BugmeBarView.a(a, false);
        if (a.a != null && BugmeBarView.d(a) != null)
        {
            BugmeBarView.e(a);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            ThumbNailListView

final class ef
    implements Runnable
{

    final ThumbNailListView a;

    ef(ThumbNailListView thumbnaillistview)
    {
        a = thumbnaillistview;
        super();
    }

    public final void run()
    {
        a.fullScroll(66);
    }
}

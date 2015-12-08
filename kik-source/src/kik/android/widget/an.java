// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            ak, GalleryWidget

final class an
    implements GalleryWidget.a
{

    final String a;
    final long b;
    final int c;
    final ak d;

    an(ak ak1, String s, long l, int i)
    {
        d = ak1;
        a = s;
        b = l;
        c = i;
        super();
    }

    public final void a()
    {
        GalleryWidget.a(d.a, a, b, false, c);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            ak, GalleryWidget

final class ao
    implements GalleryWidget.a
{

    final int a;
    final String b;
    final ak c;

    ao(ak ak1, int i, String s)
    {
        c = ak1;
        a = i;
        b = s;
        super();
    }

    public final void a()
    {
        GalleryWidget.a(c.a, false, a, b);
    }
}

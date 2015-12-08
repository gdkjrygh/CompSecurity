// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class jcn
    implements android.view.View.OnClickListener
{

    private jcm a;

    jcn(jcm jcm1)
    {
        a = jcm1;
        super();
    }

    public final void onClick(View view)
    {
        view = jcm.a(a);
        long l = ((jcr) (view)).i;
        view.c();
        if (l != -1L)
        {
            if (((jcr) (view)).j.a())
            {
                noy.a("this", view);
            }
            mqx mqx1 = new mqx(((jcr) (view)).c, mqm.a(((jcr) (view)).e.d(), "instant", l));
            mtj.a(((jcr) (view)).c, mqx1);
        }
        ((jcr) (view)).d.b("StartUploadTask");
        ((jcr) (view)).d.b("GetUploadMediaStatusesTask");
        ((jcr) (view)).d.b("UploadPreviewTask");
        jcm.b(a).b();
        jcm.c(a).c();
        view = ((am) (a)).E.h();
        view.a().a(a).b();
        view.b();
    }
}

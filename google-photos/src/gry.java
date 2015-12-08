// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gry
    implements nug
{

    private grx a;

    gry(grx grx1)
    {
        a = grx1;
        super();
    }

    public final void b_(Object obj)
    {
label0:
        {
            obj = a;
            olm olm1 = ((grx) (obj)).c.ai_();
            if (!olm1.equals(((grx) (obj)).d))
            {
                ((grx) (obj)).c();
                gzb gzb1 = (gzb)olm1.b(gzb);
                boolean flag;
                if (gzb1 == null)
                {
                    flag = false;
                } else
                if ((grg)olm1.b(grg) == null)
                {
                    flag = false;
                } else
                {
                    com.google.android.apps.photos.photofragment.components.photoview.PhotoView photoview = gzb1.r();
                    gzb1.a().a(((grx) (obj)).a, false);
                    if (photoview != null)
                    {
                        ((grx) (obj)).a(olm1, gzb1);
                    }
                    flag = true;
                }
                if (!flag)
                {
                    break label0;
                }
                obj.d = olm1;
            }
            return;
        }
        obj.d = null;
    }
}

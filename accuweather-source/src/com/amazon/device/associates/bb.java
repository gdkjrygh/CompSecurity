// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            al, i, j, bo, 
//            p, y, bj

class bb extends al
{

    private static i b;

    public bb()
    {
        super("rut.db", 0x5265c00L);
    }

    protected i a()
    {
        if (b == null)
        {
            b = new i();
            b.a(i.a, "http://www.amazon.com/gp/aw/d/$ASIN?tag=defaulttag-20&linkCode=da2&ascsubtag=$SUBTAG");
            b.a(i.b, "http://www.amazon.com/gp/aw/h.html?tag=defaulttag-20&linkCode=da1&ascsubtag=$SUBTAG");
            b.a(i.c, "tag=defaulttag-20&linkCode=da5&ascsubtag=$SUBTAG");
            b.a(i.d, "www.amazon.com/gp/aw/s?tag=defaulttag-20&linkCode=da4&i=$CATEGORY&k=$SEARCH&sort=$SORTTYPE&p_lbr_brands_browse-bin=$BRAND&ascsubtag=$SUBTAG");
            b.a(i.e, "http://www.amazon.com/gp/aw/d/$ASIN?tag=defaulttag-20&linkCode=da6");
            b.a(i.f, "http://www.amazon.com/gp/aw/d/$ASIN?tag=defaulttag-20&linkCode=da7");
            b.a(i.g, "http://www.amazon.com/gp/dmusic/device/mp3/store/album/$ASIN?$DEVICEtag=defaulttag-20&linkCode=da7");
            b.a(i.h, "http://www.amazon.com/gp/dmusic/device/mp3/store/track/$ASIN?$DEVICEtag=defaulttag-20&linkCode=da7");
        }
        return b;
    }

    protected transient i a(al aal[])
    {
        aal = aal[0];
        Object obj = new j();
        if (obj != null)
        {
            ((j) (obj)).a(bo.b());
            ((j) (obj)).e();
            obj = ((j) (obj)).d();
            if (obj == null)
            {
                aal.b(false);
                aal.a(false);
                if (((al) (aal)).a == null)
                {
                    aal.a = a();
                    p.c("AsyncGetURLTemplatesCacheTask", "Setting Default Templates");
                } else
                {
                    p.c("AsyncGetURLTemplatesCacheTask", "Setting to expired Templates as getTemplates failed");
                }
                return (i)((al) (aal)).a;
            }
            if (((i) (obj)).b() >= 300L && ((i) (obj)).b() <= 400L)
            {
                p.c("AsyncGetURLTemplatesCacheTask", "Checking to load from Cache");
                aal.a = (i)y.a(g());
                if (((al) (aal)).a != null)
                {
                    aal.a(true);
                    aal.b(false);
                    return (i)((al) (aal)).a;
                }
            }
            aal.a = ((bj) (obj));
            aal.a(true);
            aal.b(true);
        }
        return (i)((al) (aal)).a;
    }

    protected volatile bj b()
    {
        return a();
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return a((al[])aobj);
    }
}

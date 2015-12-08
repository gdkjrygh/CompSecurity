// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            al, bx, bn, p, 
//            y, bj

class f extends al
{

    private static bx b = null;

    public f()
    {
        super("catsearch.db", 0x9a7ec800L);
    }

    protected bx a()
    {
        if (b != null)
        {
            return b;
        } else
        {
            b = new bx();
            b.b("All", "aps");
            b.b("Appliances", "appliances");
            b.b("ArtsCraftsAndSewing", "arts-crafts");
            b.b("Automotive", "automotive");
            b.b("Baby", "baby");
            b.b("Beauty", "beauty");
            b.b("Books", "books");
            b.b("CellPhones", "mobile");
            b.b("CellPhoneAccessories", "mobile");
            b.b("ClothingAndAccessories", "apparel");
            b.b("Collectibles", "collectibles");
            b.b("Computers", "computers");
            b.b("Electronics", "electronics");
            b.b("GiftCards", "gift-cards");
            b.b("Grocery", "grocery");
            b.b("Home", "garden");
            b.b("Kitchen", "garden");
            b.b("OutdoorLiving", "garden");
            b.b("HealthPersonalCare", "hpc");
            b.b("IndustrialAndScientific", "industrial");
            b.b("Jewelry", "jewelry");
            b.b("KindleStore", "digital-text");
            b.b("LawnAndGarden", "lawngarden");
            b.b("MagazineSubscriptions", "magazines");
            b.b("Misc", "misc");
            b.b("MobileApps", "mobile-apps");
            b.b("MoviesAndTV", "dvd");
            b.b("MP3Downloads", "digital-music");
            b.b("Music", "music");
            b.b("MusicalInstruments", "mi");
            b.b("OfficeProducts", "office-products");
            b.b("PetSupplies", "pets");
            b.b("Photo", "photo");
            b.b("Shoes", "shoes");
            b.b("Software", "software");
            b.b("SportsAndOutdoors", "sporting");
            b.b("ToolsAndHomeImprovement", "tools");
            b.b("ToysAndGames", "toys");
            b.b("VideoGames", "videogames");
            b.b("Watches", "watches");
            b.a("RELEVANCE", "relevancerank");
            b.a("BESTSELLING", "relevance-fs-browse-rank");
            b.a("PRICE_LOW_TO_HIGH", "price");
            b.a("PRICE_LOW_TO_HIGH", "-price");
            return b;
        }
    }

    protected transient bx a(al aal[])
    {
        aal = aal[0];
        Object obj = new bn();
        if (obj != null)
        {
            ((bn) (obj)).e();
            obj = ((bn) (obj)).d();
            if (obj == null)
            {
                aal.b(false);
                aal.a(false);
                if (((al) (aal)).a == null)
                {
                    aal.a = a();
                    p.c("AsyncGetgetCategorySearchDetailsAsyncTask", "Setting Default Templates");
                } else
                {
                    p.c("AsyncGetgetCategorySearchDetailsAsyncTask", "Setting to expired Templates as getTemplates failed");
                }
                return (bx)((al) (aal)).a;
            }
            if (((bx) (obj)).b() >= 300L && ((bx) (obj)).b() <= 400L)
            {
                p.c("AsyncGetgetCategorySearchDetailsAsyncTask", "Checking to load from Cache");
                aal.a = (bx)y.a(g());
                if (((al) (aal)).a != null)
                {
                    aal.a(true);
                    aal.b(false);
                    return (bx)((al) (aal)).a;
                }
            }
            aal.a = ((bj) (obj));
            aal.a(true);
            aal.b(true);
        }
        return (bx)((al) (aal)).a;
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

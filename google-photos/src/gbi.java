// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbi
    implements gbf
{

    gbi()
    {
    }

    public final String a()
    {
        return "CREATE TABLE media_store_extra_photosphere (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT NOT NULL, photosphere TEXT NOT NULL)";
    }

    public final String[] b()
    {
        return (new String[] {
            "CREATE INDEX media_store_extra_photosphere_photosphere ON media_store_extra_photosphere(photosphere)", "CREATE UNIQUE INDEX media_store_extra_photosphere_content_uri ON media_store_extra_photosphere(content_uri)"
        });
    }
}

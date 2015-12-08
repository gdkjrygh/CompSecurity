// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbe
    implements gbf
{

    gbe()
    {
    }

    public final String a()
    {
        return "CREATE TABLE media_store_extra_fingerprint (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT NOT NULL, fingerprint TEXT NOT NULL, size INTEGER NOT NULL)";
    }

    public final String[] b()
    {
        return (new String[] {
            "CREATE INDEX media_store_extra_fingerprint_fingerprint ON media_store_extra_fingerprint(fingerprint)", "CREATE UNIQUE INDEX media_store_extra_fingerprint_content_uri ON media_store_extra_fingerprint(content_uri)"
        });
    }
}

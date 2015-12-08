// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbb
    implements gbf
{

    gbb()
    {
    }

    public final String a()
    {
        return "CREATE TABLE media_store_extra_animation (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT NOT NULL, animation INTEGER NOT NULL)";
    }

    public final String[] b()
    {
        return (new String[] {
            "CREATE INDEX media_store_extra_animation_mediatype ON media_store_extra_animation(animation)", "CREATE UNIQUE INDEX media_store_extra_animation_content_uri ON media_store_extra_animation(content_uri)"
        });
    }
}

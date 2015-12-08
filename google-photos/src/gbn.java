// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbn
    implements gbf
{

    gbn()
    {
    }

    public final String a()
    {
        return "CREATE TABLE media_store_extra_video_dimension (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT UNIQUE NOT NULL, width INTEGER, height INTEGER)";
    }

    public final String[] b()
    {
        return null;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gbc
    implements gbf
{

    public gbc()
    {
    }

    public final String a()
    {
        return "CREATE TABLE media_store_extra_deleted_media(_id INTEGER PRIMARY KEY AUTOINCREMENT, local_dedup_key TEXT UNIQUE NOT NULL, deleted_timestamp INTEGER NOT NULL )";
    }

    public final String[] b()
    {
        return null;
    }
}

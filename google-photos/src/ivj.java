// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivj
    implements gbf
{

    public ivj()
    {
    }

    public final String a()
    {
        return "CREATE TABLE timezones (content_uri TEXT UNIQUE NOT NULL, timezone_offset INTEGER NOT NULL )";
    }

    public final String[] b()
    {
        return (new String[] {
            "CREATE INDEX content_uri_idx ON timezones(content_uri, timezone_offset)"
        });
    }
}

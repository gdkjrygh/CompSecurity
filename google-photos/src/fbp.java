// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fbp
{

    public static final String a[] = {
        "id", "batch_id", "threshold", "content_uri", "size_bytes", "fingerprint", "last_modified", "width", "height", "type", 
        "is_dismissed", "path", "is_read", "has_original_bytes"
    };

    static String a()
    {
        return "CREATE TABLE device_mgmt_batch (id INTEGER PRIMARY KEY AUTOINCREMENT, batch_id STRING NOT NULL, threshold INTEGER NOT NULL, content_uri STRING NOT NULL, size_bytes INTEGER NOT NULL, fingerprint STRING NOT NULL, last_modified DATETIME NOT NULL, type INTEGER NOT NULL, width INTEGER, height INTEGER, is_dismissed INTEGER DEFAULT 0, path STRING NOT NULL, is_read INTEGER DEFAULT 0, has_original_bytes INTEGER DEFAULT 0)";
    }

}

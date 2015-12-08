// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Locale;

final class 
{

    static final String a;
    static final String b;
    static final String c;

    static 
    {
        a = String.format(Locale.ROOT, "SELECT %s, %s, %s, %s, %s FROM %s", new Object[] {
            "queued", "js", "event", "json", "config_loaded", "queue"
        });
        b = String.format(Locale.ROOT, "DELETE FROM %s WHERE %s < ?", new Object[] {
            "queue", "queued"
        });
        c = String.format(Locale.ROOT, "DELETE FROM %s WHERE %s IN (SELECT %s FROM %s ORDER BY %s ASC LIMIT ((SELECT COUNT(*) FROM %s) - ?)) ", new Object[] {
            "queue", "queued", "queued", "queue", "queued", "queue"
        });
    }
}

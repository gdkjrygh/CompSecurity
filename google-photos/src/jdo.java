// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Locale;

final class jdo
{

    final String a;
    final long b;
    final String c;
    final Uri d;
    private Uri e;

    public jdo(String s, long l, String s1, Uri uri, Uri uri1)
    {
        a = s;
        b = l;
        c = s1;
        e = uri;
        d = uri1;
    }

    public final String toString()
    {
        return String.format(Locale.US, "ContentFileMetadata {displayName: %s, createTimeMs: %d, contentType: %s, contentUri: %s, tempUri: %s}", new Object[] {
            a, Long.valueOf(b), c, e, d
        });
    }
}

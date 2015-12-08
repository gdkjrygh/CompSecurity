// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Locale;

public interface nkz
{

    public abstract String a();

    public abstract Uri b();

    public abstract String[] c();

    
    {
        String.format(Locale.US, "case when %1$s then NULL else %2$s end", new Object[] {
            "_data LIKE '%/DCIM/%'", "bucket_id"
        });
    }
}

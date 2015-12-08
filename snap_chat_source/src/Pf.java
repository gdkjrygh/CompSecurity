// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.snapchat.android.Timber;
import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public final class Pf
{

    private static final String TAG = "CloseableUtils";

    public static void a(Cursor cursor)
    {
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        Timber.a("CloseableUtils", closeable);
        return;
        IncompatibleClassChangeError incompatibleclasschangeerror;
        incompatibleclasschangeerror;
        throw new RuntimeException((new StringBuilder("Caused by attempting to close ")).append(closeable.getClass().getName()).toString(), incompatibleclasschangeerror);
    }

    public static void a(Scanner scanner)
    {
        if (scanner != null)
        {
            scanner.close();
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public abstract class ContentUriUtils
{

    private ContentUriUtils()
    {
    }

    private static ParcelFileDescriptor a(Context context, String s)
    {
        context = context.getContentResolver();
        s = Uri.parse(s);
        try
        {
            context = context.openFileDescriptor(s, "r");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean contentUriExists(Context context, String s)
    {
        return a(context, s) != null;
    }

    public static String getMimeType(Context context, String s)
    {
        context = context.getContentResolver();
        if (context == null)
        {
            return null;
        } else
        {
            return context.getType(Uri.parse(s));
        }
    }

    public static int openContentUriForRead(Context context, String s)
    {
        context = a(context, s);
        if (context != null)
        {
            return context.detachFd();
        } else
        {
            return -1;
        }
    }
}

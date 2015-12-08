// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ckf
{

    public static final String a = ckf.getSimpleName();
    public final ContentResolver b;

    public ckf(ContentResolver contentresolver)
    {
        b = (ContentResolver)b.a(contentresolver, "contentResolver", null);
    }

    private static int a(byte byte0)
    {
        int i = byte0;
        if (byte0 < 0)
        {
            i = byte0 + 256;
        }
        return i;
    }

    private static int a(byte abyte0[], int i)
    {
        return a(abyte0[i]) << 24 | a(abyte0[i + 1]) << 16 | a(abyte0[i + 2]) << 8 | a(abyte0[i + 3]);
    }

    public static byte[] a(Uri uri, int i, ContentResolver contentresolver)
    {
        uri = crr.a(uri, contentresolver);
        if (uri == null)
        {
            return null;
        } else
        {
            contentresolver = a(((InputStream) (uri)), 4096);
            b.a(uri);
            return contentresolver;
        }
    }

    public static byte[] a(Uri uri, ContentResolver contentresolver)
    {
        uri = crr.a(uri, contentresolver);
        if (uri == null)
        {
            return null;
        }
        contentresolver = new byte[8];
_L2:
        int i;
        dek.a(uri, contentresolver, 8);
        i = a(((byte []) (contentresolver)), 0);
        if (a(((byte []) (contentresolver)), 4) != cjw.a)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        contentresolver = a(((InputStream) (uri)), i - 8);
        b.a(uri);
        return contentresolver;
        long l = i - 8;
        try
        {
            uri.skip(l);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            b.a(uri);
            return null;
        }
        finally
        {
            b.a(uri);
        }
        if (true) goto _L2; else goto _L1
_L1:
        throw contentresolver;
    }

    private static byte[] a(InputStream inputstream, int i)
    {
        try
        {
            inputstream = dek.a(inputstream, i);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        return inputstream;
    }

    public static byte[] a(byte abyte0[])
    {
        try
        {
            abyte0 = MessageDigest.getInstance("MD5").digest(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e(a, "MD5 not supported", abyte0);
            return null;
        }
        return abyte0;
    }

}

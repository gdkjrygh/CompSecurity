// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ab;

import android.content.Context;
import com.google.android.m4b.maps.ap.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a extends com.google.android.m4b.maps.ap.a
    implements e
{

    private Context a;
    private final Set b = Collections.synchronizedSet(new HashSet());

    public a(Context context)
    {
        a = context;
    }

    private int b(byte abyte0[], String s)
    {
        byte abyte1[];
        abyte1 = abyte0;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        abyte1 = new byte[0];
        int i;
        abyte0 = a.openFileOutput(c(s), 0);
        abyte0.write(abyte1);
        abyte0.close();
        i = (abyte1.length - 1) / 4096;
        return (i + 1) * 4096;
        abyte0;
        throw new com.google.android.m4b.maps.ap.e.a(abyte0.getMessage());
        abyte0;
        throw new com.google.android.m4b.maps.ap.e.a(abyte0.getMessage());
    }

    private static String c(String s)
    {
        String s1 = String.valueOf("DATA_");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public final int a(byte abyte0[], String s)
    {
        int i;
        try
        {
            i = b(abyte0, s);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return ((com.google.android.m4b.maps.ap.e.a) (abyte0)).a;
        }
        return i;
    }

    public final boolean a(String s)
    {
        return a.deleteFile(c(s));
    }

    public final byte[] b(String s)
    {
        Object obj;
        String s1;
        s1 = c(s);
        obj = a.openFileInput(s1);
        byte abyte0[];
        int j;
        j = (int)a.getFileStreamPath(s1).length();
        abyte0 = new byte[j];
        int i = 0;
_L5:
        if (j <= 0) goto _L2; else goto _L1
_L1:
        int k = ((InputStream) (obj)).read(abyte0, i, j);
        if (k != -1) goto _L4; else goto _L3
_L3:
        throw new IOException((new StringBuilder(String.valueOf(s).length() + 55)).append("Read ").append(i).append(" bytes from ").append(s).append("; expected ").append(j).append(" more").toString());
        s;
_L12:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        s = null;
_L7:
        return s;
_L4:
        j -= k;
        i += k;
          goto _L5
_L2:
        s = abyte0;
        if (obj == null) goto _L7; else goto _L6
_L6:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return abyte0;
        }
        return abyte0;
        s;
        obj = null;
_L11:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
        obj = null;
_L9:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        if (true) goto _L9; else goto _L8
_L8:
        s;
        if (true) goto _L11; else goto _L10
_L10:
        s;
        obj = null;
          goto _L12
    }
}

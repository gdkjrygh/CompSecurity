// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ai;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.y.j;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ai:
//            a

public class d
{

    private static final String a = com/google/android/m4b/maps/ai/d.getSimpleName();
    private final Context b;

    d(Context context)
    {
        b = context;
    }

    private static a a(FileInputStream fileinputstream, String s)
    {
        Object obj = new DataInputStream(fileinputstream);
        long l;
        l = ((DataInputStream) (obj)).readLong();
        fileinputstream = ((DataInputStream) (obj)).readUTF();
        if (s.equals(((DataInputStream) (obj)).readUTF()))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        Log.i(a, "New API Key detected, fetching a new token.");
        try
        {
            ((DataInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            s = a;
            fileinputstream = String.valueOf(fileinputstream.getMessage());
            if (fileinputstream.length() != 0)
            {
                fileinputstream = "Error closing token file: ".concat(fileinputstream);
            } else
            {
                fileinputstream = new String("Error closing token file: ");
            }
            Log.w(s, fileinputstream);
        }
        return null;
        s;
        Log.i(a, "The API Key is not stored with the token");
        s = new a(fileinputstream, l);
        try
        {
            ((DataInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            obj = a;
            fileinputstream = String.valueOf(fileinputstream.getMessage());
            if (fileinputstream.length() != 0)
            {
                fileinputstream = "Error closing token file: ".concat(fileinputstream);
            } else
            {
                fileinputstream = new String("Error closing token file: ");
            }
            Log.w(((String) (obj)), fileinputstream);
        }
        return s;
        fileinputstream;
        s = a;
        fileinputstream = String.valueOf(fileinputstream.getMessage());
        if (fileinputstream.length() == 0)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        fileinputstream = "Error reading token file: ".concat(fileinputstream);
_L1:
        Log.w(s, fileinputstream);
        try
        {
            ((DataInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            s = a;
            fileinputstream = String.valueOf(fileinputstream.getMessage());
            if (fileinputstream.length() != 0)
            {
                fileinputstream = "Error closing token file: ".concat(fileinputstream);
            } else
            {
                fileinputstream = new String("Error closing token file: ");
            }
            Log.w(s, fileinputstream);
        }
        return null;
        fileinputstream = new String("Error reading token file: ");
          goto _L1
        s;
        try
        {
            ((DataInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            String s1 = a;
            fileinputstream = String.valueOf(fileinputstream.getMessage());
            if (fileinputstream.length() != 0)
            {
                fileinputstream = "Error closing token file: ".concat(fileinputstream);
            } else
            {
                fileinputstream = new String("Error closing token file: ");
            }
            Log.w(s1, fileinputstream);
        }
        throw s;
    }

    final a a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        FileInputStream fileinputstream = b.openFileInput("_m_t");
        s = a(fileinputstream, s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b.deleteFile("_m_t")) goto _L2; else goto _L1
_L1:
        Log.i(a, "Deleted saved auth token");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.e(a, "Error while trying to delete the auth token");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void a(String s, String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        j.a(s1);
        Object obj = b.openFileOutput("_m_t", 0);
        obj = new DataOutputStream(((java.io.OutputStream) (obj)));
        ((DataOutputStream) (obj)).writeLong(l);
        ((DataOutputStream) (obj)).writeUTF(s1);
        ((DataOutputStream) (obj)).writeUTF(s);
        ((DataOutputStream) (obj)).close();
_L4:
        Log.i(a, "Saved auth token");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        s1 = a;
        s = String.valueOf(s.getMessage());
        if (s.length() == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s = "Error opening token file: ".concat(s);
_L3:
        Log.w(s1, s);
        if (true) goto _L2; else goto _L1
        s;
        throw s;
_L1:
        s = new String("Error opening token file: ");
          goto _L3
        s;
        s1 = a;
        s = String.valueOf(s.getMessage());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        s = "Error closing token file: ".concat(s);
_L5:
        Log.w(s1, s);
          goto _L4
        s = new String("Error closing token file: ");
          goto _L5
        s;
        s1 = a;
        s = String.valueOf(s.getMessage());
        if (s.length() == 0) goto _L7; else goto _L6
_L6:
        s = "Error writing token file: ".concat(s);
_L10:
        Log.w(s1, s);
        ((DataOutputStream) (obj)).close();
          goto _L4
        s;
        s1 = a;
        s = String.valueOf(s.getMessage());
        if (s.length() == 0) goto _L9; else goto _L8
_L8:
        s = "Error closing token file: ".concat(s);
_L11:
        Log.w(s1, s);
          goto _L4
_L7:
        s = new String("Error writing token file: ");
          goto _L10
        s1;
        ((DataOutputStream) (obj)).close();
_L12:
        throw s1;
_L9:
        s = new String("Error closing token file: ");
          goto _L11
        s;
        obj = a;
        s = String.valueOf(s.getMessage());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        s = "Error closing token file: ".concat(s);
_L13:
        Log.w(((String) (obj)), s);
          goto _L12
        s = new String("Error closing token file: ");
          goto _L13
    }

}

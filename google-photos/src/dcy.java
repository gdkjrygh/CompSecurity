// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;
import org.chromium.net.HttpUrlRequest;

public final class dcy
    implements ddg
{

    public static final ddh a = new ddh();
    private static final String b = dcy.getSimpleName();
    private final Context c;
    private final int d;

    public dcy(Context context, int i)
    {
        c = context;
        d = b.a(i, "readTimeoutMs", null);
    }

    private void a(String s, OutputStream outputstream)
    {
        Object obj;
        obj = new ConditionVariable();
        String s1;
        String s2;
        int i;
        int j;
        try
        {
            dcz dcz1 = new dcz(this, ((ConditionVariable) (obj)));
            outputstream = Channels.newChannel(outputstream);
            outputstream = npi.a(c, s, 3, null, outputstream, dcz1);
            outputstream.g();
            ((ConditionVariable) (obj)).block(d);
            i = outputstream.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i == 200)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        obj = String.valueOf(outputstream.c());
        j = d;
        obj = (new StringBuilder(String.valueOf(obj).length() + 52)).append("status: ").append(i).append(". msg: ").append(((String) (obj))).append(". timeout_ms: ").append(j).append(".").toString();
        s1 = b;
        s2 = String.valueOf(s.toString());
        Log.w(s1, (new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(s2).length())).append("readToOutputStream() ").append(((String) (obj))).append(" URI: ").append(s2).toString());
        if (outputstream.d() == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        s = outputstream.d();
_L1:
        throw s;
        s = new IOException((new StringBuilder(String.valueOf(s).length() + 26 + String.valueOf(obj).length())).append("Error reading uri: ").append(s).append(". err: ").append(((String) (obj))).toString());
          goto _L1
    }

    private static void b(String s)
    {
        if (!s.startsWith("http://") && !s.startsWith("https://"))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Uri is not an HTTP/HTTPS uri: ".concat(s);
            } else
            {
                s = new String("Uri is not an HTTP/HTTPS uri: ");
            }
            throw b.a(s);
        } else
        {
            return;
        }
    }

    public final void a(String s, File file)
    {
        Object obj;
        b(s);
        file.delete();
        obj = String.valueOf(file.getPath());
        Object obj1 = String.valueOf(".tmp");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj1 = new File(((String) (obj)));
        obj = new FileOutputStream(((File) (obj1)));
        a(s, ((OutputStream) (obj)));
        b.a(((java.io.Closeable) (obj)));
        if (!((File) (obj1)).renameTo(file))
        {
            throw new avz(((File) (obj1)), file);
        }
          goto _L1
        s;
        ((File) (obj1)).delete();
        throw s;
        s;
        file = null;
_L3:
        b.a(file);
        throw s;
_L1:
        return;
        s;
        file = ((File) (obj));
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final byte[] a(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        b(s);
        bytearrayoutputstream = new ByteArrayOutputStream();
        a(s, ((OutputStream) (bytearrayoutputstream)));
        s = bytearrayoutputstream.toByteArray();
        b.a(bytearrayoutputstream);
        return s;
        s;
        b.a(bytearrayoutputstream);
        throw s;
    }

}

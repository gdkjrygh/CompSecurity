// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class afe
{

    private static final ahn a = ahn.a("connected.car.sdk");

    public static byte[] a(Context context, String s)
    {
        return b(context, (new StringBuilder("carapplications/")).append(s).append(File.separator).append(s).append(".p7b").toString());
    }

    public static byte[] a(Context context, String s, String s1)
    {
        return b(context, (new StringBuilder("carapplications/")).append(s).append("/rhmi/").append(s1).append(File.separator).append("images.zip").toString());
    }

    private static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[16384];
_L2:
        int i = inputstream.read(abyte0, 0, 16384);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L4:
        return bytearrayoutputstream.toByteArray();
_L1:
        try
        {
            bytearrayoutputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] b(Context context, String s)
    {
        try
        {
            context = a(context.getAssets().open(s));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a.e("Error while retrieving %s", new Object[] {
                s
            });
            return null;
        }
        return context;
    }

    public static byte[] b(Context context, String s, String s1)
    {
        return b(context, (new StringBuilder("carapplications/")).append(s).append("/rhmi/").append(s1).append(File.separator).append("texts.zip").toString());
    }

}

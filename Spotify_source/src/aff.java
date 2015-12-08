// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class aff
{

    private static InputStream a(AssetManager assetmanager, String s)
    {
        try
        {
            assetmanager = assetmanager.open(s);
        }
        // Misplaced declaration of an exception variable
        catch (AssetManager assetmanager)
        {
            assetmanager.printStackTrace();
            return null;
        }
        return assetmanager;
    }

    private static void a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[1024];
_L1:
        int i = inputstream.read(abyte0, 0, 1024);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        inputstream;
        inputstream.printStackTrace();
    }

    public static byte[] a(Context context, String s)
    {
        AssetManager assetmanager;
        ByteArrayOutputStream bytearrayoutputstream;
        String s1;
        ZipOutputStream zipoutputstream;
        assetmanager = context.getAssets();
        s1 = (new StringBuilder("bmwgroup")).append(File.separator).append(s).append(File.separator).append("images").toString();
        bytearrayoutputstream = new ByteArrayOutputStream();
        zipoutputstream = new ZipOutputStream(bytearrayoutputstream);
        String as[];
        int j;
        as = assetmanager.list(s1);
        j = as.length;
        int i = 0;
_L36:
        if (i >= j) goto _L2; else goto _L1
_L1:
        s = as[i];
        if (!s.equalsIgnoreCase("application_icon_57x51.png")) goto _L4; else goto _L3
_L3:
        context = "157.png";
_L34:
        zipoutputstream.putNextEntry(new ZipEntry(context));
        context = a(assetmanager, (new StringBuilder()).append(s1).append(File.separator).append(s).toString());
        a(((InputStream) (context)), ((OutputStream) (zipoutputstream)));
        zipoutputstream.closeEntry();
        context.close();
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_0.png")) goto _L6; else goto _L5
_L5:
        context = "149.png";
          goto _L7
_L6:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_1.png")) goto _L9; else goto _L8
_L8:
        context = "150.png";
          goto _L7
_L9:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_2.png")) goto _L11; else goto _L10
_L10:
        context = "151.png";
          goto _L7
_L11:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_3.png")) goto _L13; else goto _L12
_L12:
        context = "152.png";
          goto _L7
_L13:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_4.png")) goto _L15; else goto _L14
_L14:
        context = "153.png";
          goto _L7
_L15:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_5.png")) goto _L17; else goto _L16
_L16:
        context = "154.png";
          goto _L7
_L17:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_6.png")) goto _L19; else goto _L18
_L18:
        context = "155.png";
          goto _L7
_L19:
        if (!s.equalsIgnoreCase("playerscreen_icon_toolbar_7.png")) goto _L21; else goto _L20
_L20:
        context = "156.png";
          goto _L7
_L21:
        if (!s.equalsIgnoreCase("playerscreen_cover_200x200.png")) goto _L23; else goto _L22
_L22:
        context = "142.png";
          goto _L7
_L23:
        if (!s.equalsIgnoreCase("playerscreen_cover_320x320.png")) goto _L25; else goto _L24
_L24:
        context = "143.png";
          goto _L7
_L25:
        if (!s.equalsIgnoreCase("playerscreen_icon_album_65x51.png")) goto _L27; else goto _L26
_L26:
        context = "144.png";
          goto _L7
_L27:
        if (!s.equalsIgnoreCase("playerscreen_icon_checkmark_65x51.png")) goto _L29; else goto _L28
_L28:
        context = "145.png";
          goto _L7
_L29:
        if (!s.equalsIgnoreCase("playerscreen_icon_interpret_65x51.png")) goto _L31; else goto _L30
_L30:
        context = "146.png";
          goto _L7
_L31:
        if (!s.equalsIgnoreCase("playerscreen_icon_shuffle_on_65x51.png")) goto _L33; else goto _L32
_L32:
        context = "147.png";
          goto _L7
_L33:
        if (s.equalsIgnoreCase("playerscreen_icon_title_65x51.png"))
        {
            context = "148.png";
        } else
        {
            context = s;
        }
_L7:
        if (true) goto _L34; else goto _L2
_L2:
        try
        {
            zipoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return bytearrayoutputstream.toByteArray();
        if (true) goto _L36; else goto _L35
_L35:
    }

    private static void b(InputStream inputstream, OutputStream outputstream)
    {
        BufferedReader bufferedreader;
        inputstream = new InputStreamReader(inputstream);
        bufferedreader = new BufferedReader(inputstream);
        outputstream = new BufferedWriter(new OutputStreamWriter(outputstream));
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        outputstream.write(s.replaceAll("TITLE", "158"));
          goto _L1
        outputstream;
        outputstream.printStackTrace();
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            outputstream.printStackTrace();
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_112;
        outputstream.flush();
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            outputstream.printStackTrace();
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return;
        return;
        outputstream;
        try
        {
            bufferedreader.close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        throw outputstream;
    }

    public static byte[] b(Context context, String s)
    {
        String s1;
        ZipOutputStream zipoutputstream;
        context = context.getAssets();
        s1 = (new StringBuilder("bmwgroup")).append(File.separator).append(s).append(File.separator).append("texts").toString();
        s = new ByteArrayOutputStream();
        zipoutputstream = new ZipOutputStream(s);
        String as[];
        int j;
        as = context.list(s1);
        j = as.length;
        int i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        obj = as[i];
        if (((String) (obj)).endsWith("txt"))
        {
            zipoutputstream.putNextEntry(new ZipEntry(((String) (obj))));
            obj = a(context, (new StringBuilder()).append(s1).append(File.separator).append(((String) (obj))).toString());
            b(((InputStream) (obj)), ((OutputStream) (zipoutputstream)));
            zipoutputstream.closeEntry();
            ((InputStream) (obj)).close();
        }
        break MISSING_BLOCK_LABEL_174;
        try
        {
            zipoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return s.toByteArray();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

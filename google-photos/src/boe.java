// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

public class boe extends mtf
{

    private static String a = boe.getSimpleName();
    private final noj b;
    private final int c;
    private final String j;

    public boe(String s, noj noj1, int i, String s1)
    {
        String s2 = a;
        super((new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(s).length())).append(s2).append("|").append(s).toString());
        b = (noj)b.a(noj1, "provider", null);
        c = i;
        j = (String)b.a(s1, "mediaKey", null);
    }

    protected final mue a(Context context)
    {
        Object obj;
        bzg bzg1;
        File file1;
        bzg1 = (bzg)olm.a(context, bzg);
        Object obj1 = b.b(context, c, j);
        if (obj1 == null)
        {
            context = String.valueOf(j);
            if (context.length() != 0)
            {
                context = "No video stream for mediaKey:".concat(context);
            } else
            {
                context = new String("No video stream for mediaKey:");
            }
            return new mue(0, new IllegalStateException(context), null);
        }
        ConditionVariable conditionvariable;
        Map map;
        bof bof1;
        try
        {
            File file = new File(bzg1.a.getCacheDir(), "trimmer_remote");
            file.mkdirs();
            file1 = File.createTempFile("clip_", ".mp4", file);
            int i = c;
            map = ((nal)olm.a(context, nal)).a(i);
            conditionvariable = new ConditionVariable();
            bof1 = new bof(this, conditionvariable);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            obj = a;
            obj1 = String.valueOf(obj1);
            Log.e(((String) (obj)), (new StringBuilder(String.valueOf(obj1).length() + 24)).append("Error downloading video:").append(((String) (obj1))).toString(), context);
            return new mue(0, context, null);
        }
        obj = Channels.newChannel(new FileOutputStream(file1));
        context = npi.a(context, ((Uri) (obj1)).toString(), 4, map, ((WritableByteChannel) (obj)), bof1);
        context.a("GET");
        context.g();
        conditionvariable.block();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        ((WritableByteChannel) (obj)).close();
        if (context.d() != null)
        {
            throw context.d();
        }
          goto _L1
        context;
        obj = null;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        ((WritableByteChannel) (obj)).close();
        throw context;
_L1:
        int k;
        if (context.i())
        {
            throw new IOException("Download canceled");
        }
        k = context.b();
        if (k == 200)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        throw new IOException((new StringBuilder(34)).append("Download http failure: ").append(k).toString());
        context = j;
        bzg1.b.put(context, file1);
        context = new mue(true);
        context.a().putParcelable("local_file_uri", Uri.fromFile(file1));
        return context;
        context;
        if (true) goto _L3; else goto _L2
_L2:
    }

}

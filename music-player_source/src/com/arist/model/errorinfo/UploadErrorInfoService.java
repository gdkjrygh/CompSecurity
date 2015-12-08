// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.errorinfo;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.arist.model.errorinfo:
//            e, b, c

public class UploadErrorInfoService extends IntentService
    implements e
{

    List a;
    HashMap b;

    public UploadErrorInfoService()
    {
        super("name");
        b = new HashMap();
    }

    private static b a(File file)
    {
        byte abyte0[];
        file = new RandomAccessFile(file, "r");
        long l = file.length();
        file = file.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l);
        abyte0 = new byte[(int)l];
        int i = 0;
_L6:
        if (i < abyte0.length) goto _L2; else goto _L1
_L1:
        file = new String(abyte0, "utf-8");
_L4:
        if ("".equals(file))
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        abyte0[i] = file.get(i);
        i++;
        continue; /* Loop/switch isn't completed */
        file;
        file.printStackTrace();
        file = "";
        continue; /* Loop/switch isn't completed */
        file;
        file.printStackTrace();
        file = "";
        if (true) goto _L4; else goto _L3
_L3:
        file = com.arist.model.errorinfo.b.e(file);
        return file;
        file;
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(Intent intent)
    {
        int i = 0;
        if (intent.getIntExtra("oneError", 0) != 1) goto _L2; else goto _L1
_L1:
        intent = com.arist.model.errorinfo.b.e(intent.getStringExtra("error"));
        if (intent != null)
        {
            b.put(intent.e(), Integer.valueOf(1));
            com.arist.model.errorinfo.c.a().a(this, intent);
            com.arist.model.errorinfo.c.a().b();
        }
_L4:
        return;
_L2:
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            intent = new File("/sdcard/crash/");
            if (intent.exists())
            {
                intent = intent.list();
                while (i < intent.length) 
                {
                    Object obj = new File((new StringBuilder("/sdcard/crash/")).append(intent[i]).toString());
                    if (((File) (obj)).exists())
                    {
                        obj = a(((File) (obj)));
                        if (obj != null)
                        {
                            b.put(((b) (obj)).e(), Integer.valueOf(1));
                            com.arist.model.errorinfo.c.a().a(this, ((b) (obj)));
                            com.arist.model.errorinfo.c.a().b();
                        }
                    }
                    i++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String c(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (s.length() <= 0)
        {
            return null;
        }
        s = new JSONObject(s);
        if (!s.has("errorPath"))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        s = s.getString("errorPath");
        return s;
        s;
        s.printStackTrace();
        return null;
    }

    public final void a(String s)
    {
        s = c(s);
        if (s != null)
        {
            s = new File(s);
            if (s.exists())
            {
                s.delete();
            }
        }
    }

    public final void b(String s)
    {
        if (s != null && s != null && b.containsKey(s) && ((Integer)b.get(s)).intValue() < 2)
        {
            s = new File(s);
            if (s.exists())
            {
                s = a(s);
                if (s != null)
                {
                    b.put(s.e(), Integer.valueOf(2));
                    com.arist.model.errorinfo.c.a().a(this, s);
                    com.arist.model.errorinfo.c.a().b();
                }
            }
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        a = new ArrayList();
        a(intent);
    }
}

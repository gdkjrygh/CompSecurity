// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.Toast;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            UploadPhotoService, c

public final class w
{

    private static Locale a;
    private static ReentrantLock b = new ReentrantLock();

    static String a(String s, int i)
    {
        Object obj3;
        Object obj4;
        Object obj5;
        int j;
        obj4 = null;
        obj5 = null;
        obj3 = null;
        j = 1;
        if (i > 0 && s != null && (new File(s)).isFile()) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        double d;
        double d1;
        int k;
        int l;
        int i1;
        int j1;
        boolean flag;
        try
        {
            BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        i1 = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        j1 = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        k = Math.max(i1, j1);
        if (k <= 0) goto _L1; else goto _L3
_L3:
        if (k <= i) goto _L5; else goto _L4
_L4:
        do
        {
            k >>= 1;
            l = j;
            if (k < i)
            {
                break;
            }
            l = j + 1;
            j = l;
        } while (l <= 100);
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = l;
        obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        if (i1 > j1)
        {
            d = (double)i / (double)i1;
        } else
        {
            d = (double)i / (double)j1;
        }
        d1 = i1;
        obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), (int)Math.round(d1 * d), (int)Math.round(d * (double)j1), true);
        obj2 = obj1;
        if (obj1 == obj)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        ((Bitmap) (obj)).recycle();
        obj2 = obj1;
_L14:
        obj = obj2;
_L9:
        if (obj == null) goto _L1; else goto _L6
_L6:
        obj1 = new File((new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append(File.separator).append(".cache").append(File.separator).append(".share").append(File.separator).toString());
        if (!((File) (obj1)).isDirectory() && !((File) (obj1)).mkdirs()) goto _L8; else goto _L7
_L7:
        obj2 = (new File(((File) (obj1)), String.valueOf(System.currentTimeMillis()))).getAbsolutePath();
        obj1 = new FileOutputStream(((String) (obj2)));
        flag = ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, ((java.io.OutputStream) (obj1)));
        break MISSING_BLOCK_LABEL_354;
        obj;
        obj = null;
          goto _L9
        obj;
        obj = null;
          goto _L9
_L5:
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = 1;
        try
        {
            obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
          goto _L9
        if (flag)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            return ((String) (obj2));
        }
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L8:
        ((Bitmap) (obj)).recycle();
        return s;
        obj1;
        obj1 = obj3;
_L13:
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
          goto _L8
        obj1;
        obj1 = obj4;
_L12:
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
          goto _L8
        s;
        obj = obj5;
_L11:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        obj = obj1;
        if (true) goto _L11; else goto _L10
_L10:
        obj2;
          goto _L12
        obj2;
          goto _L13
        obj1;
          goto _L9
        obj;
        obj = obj1;
          goto _L9
        obj1;
          goto _L9
        obj;
        obj = obj1;
          goto _L9
          goto _L1
        obj2 = obj;
          goto _L14
    }

    static void a(Context context)
    {
        b.lock();
        Locale locale = a;
        if (locale == null || context == null)
        {
            b.unlock();
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (!a.equals(configuration.locale))
        {
            configuration.locale = a;
            context.getResources().updateConfiguration(configuration, null);
        }
        b.unlock();
        return;
        context;
        b.unlock();
        throw context;
    }

    public static void a(Context context, String s, ArrayList arraylist, String s1, String s2, String s3, Locale locale, String s4, 
            String s5)
    {
        if (context == null)
        {
            return;
        } else
        {
            context = context.getApplicationContext();
            Intent intent = new Intent(context, com/roidapp/cloudlib/upload/UploadPhotoService);
            intent.putExtra("fromMainProcess", true);
            intent.putExtra("filePath", s);
            intent.putExtra("size", 0);
            intent.putStringArrayListExtra("apps", arraylist);
            intent.putExtra("contentType", s1);
            intent.putExtra("msg", s2);
            intent.putExtra("taskExsitToast", s3);
            intent.putExtra("language", locale);
            intent.putExtra("thumbPath", s4);
            intent.putExtra("gaMode", s5);
            context.startService(intent);
            return;
        }
    }

    static boolean a(Context context, Intent intent)
    {
        String s;
        String s2;
        String s3;
        String s4;
        String s5;
        Object obj;
        Locale locale;
        int i;
        if (context == null || intent == null || !intent.getBooleanExtra("fromMainProcess", false))
        {
            return false;
        }
        obj = intent.getStringArrayListExtra("apps");
        s = intent.getStringExtra("filePath");
        s2 = intent.getStringExtra("msg");
        s3 = intent.getStringExtra("contentType");
        i = intent.getIntExtra("size", 0);
        s4 = intent.getStringExtra("taskExsitToast");
        locale = (Locale)intent.getSerializableExtra("language");
        s5 = intent.getStringExtra("gaMode");
        String s1 = intent.getStringExtra("thumbPath");
        intent = s1;
        if (s1 == null)
        {
            intent = s;
        }
        b.lock();
        a = locale;
        b.unlock();
        if (s == null || obj == null || s3 == null)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_144;
        context;
        b.unlock();
        throw context;
label0:
        {
            c c1 = com.roidapp.cloudlib.upload.c.a(context);
label1:
            do
            {
                int j;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c1.a(j))
                {
                    j = c1.a(s, i, (String)((Iterator) (obj)).next(), s3, s2, intent, s5);
                    if (j == -1)
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (TextUtils.isEmpty(s4));
            Toast.makeText(context, s4, 0).show();
            return false;
        }
        return true;
    }

}

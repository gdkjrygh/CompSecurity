// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.platform;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import com.kik.platform.util.ExifHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;

// Referenced classes of package com.kik.platform:
//            f

public final class g
{
    private static final class a
    {

        public String a;
        public String b;
        public int c;

        public a(String s, String s1, int i1)
        {
            b = null;
            c = 1000;
            a = s;
            b = s1;
            c = i1;
        }
    }


    private HashMap a;
    private HashMap b;
    private HashMap c;
    private String d[];
    private String e[];
    private String f[];
    private File g;
    private String h;
    private boolean i;
    private final String j = UUID.randomUUID().toString();
    private final String k;
    private android.graphics.BitmapFactory.Options l;
    private int m;

    public g(String s)
    {
        a = new HashMap();
        b = new HashMap();
        c = new HashMap();
        i = true;
        l = new android.graphics.BitmapFactory.Options();
        m = 0;
        m = s.length() + m;
        k = s;
        l.inJustDecodeBounds = true;
    }

    private void a(BitmapDrawable bitmapdrawable)
    {
        a(bitmapdrawable, 0.0F);
    }

    private void a(BitmapDrawable bitmapdrawable, float f1)
    {
        a(((byte []) (null)));
        if (bitmapdrawable == null || bitmapdrawable.getBitmap() == null)
        {
            return;
        }
        bitmapdrawable = bitmapdrawable.getBitmap();
        int i1 = Math.max(bitmapdrawable.getWidth(), bitmapdrawable.getHeight());
        Object obj = new Matrix();
        if (f1 > 0.0F)
        {
            ((Matrix) (obj)).postRotate(f1);
        }
        if (i1 > 192)
        {
            f1 = 192F / (float)i1;
            ((Matrix) (obj)).postScale(f1, f1);
        }
        bitmapdrawable = Bitmap.createBitmap(bitmapdrawable, 0, 0, bitmapdrawable.getWidth(), bitmapdrawable.getHeight(), ((Matrix) (obj)), true);
        obj = new ByteArrayOutputStream();
        i1 = 100;
        int j1;
        do
        {
            ((ByteArrayOutputStream) (obj)).reset();
            bitmapdrawable.compress(android.graphics.Bitmap.CompressFormat.JPEG, i1, ((java.io.OutputStream) (obj)));
            Log.e("PreviewImage", (new StringBuilder("qual: ")).append(i1).append(" size: ").append(((ByteArrayOutputStream) (obj)).size()).toString());
            j1 = i1 - 10;
            if (((ByteArrayOutputStream) (obj)).size() <= 20480)
            {
                break;
            }
            i1 = j1;
        } while (j1 >= 10);
        a(((ByteArrayOutputStream) (obj)).toByteArray());
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapDrawable bitmapdrawable)
        {
            return;
        }
    }

    private void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            c.put("preview", abyte0);
            return;
        } else
        {
            c.remove("preview");
            return;
        }
    }

    public final String a()
    {
        return j;
    }

    final void a(Intent intent)
    {
        boolean flag = false;
        Vector vector = new Vector();
        if (f != null)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                vector.add(new a(f[i1], "iphone", i1 + 1));
            }

        }
        if (e != null)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                vector.add(new a(e[j1], "android", j1 + 1));
            }

        }
        if (d != null)
        {
            for (int k1 = 0; k1 < d.length; k1++)
            {
                vector.add(new a(d[k1], null, k1 + 1));
            }

        }
        String as[] = new String[vector.size()];
        String as1[] = new String[as.length];
        int ai[] = new int[as.length];
        for (int l1 = ((flag) ? 1 : 0); l1 < as.length; l1++)
        {
            as[l1] = ((a)vector.elementAt(l1)).a;
            as1[l1] = ((a)vector.elementAt(l1)).b;
            ai[l1] = ((a)vector.elementAt(l1)).c;
        }

        intent.putExtra("com.kik.platform.content.EXTRA_URIS", as);
        intent.putExtra("com.kik.platform.content.EXTRA_URI_PLATFORMS", as1);
        intent.putExtra("com.kik.platform.content.EXTRA_URI_PRIORITIES", ai);
        intent.putExtra("com.kik.platform.content.EXTRA_EXTRA_HASH", b);
        intent.putExtra("com.kik.platform.content.EXTRA_STRING_HASH", a);
        intent.putExtra("com.kik.platform.content.EXTRA_IMAGE_HASH", c);
        intent.putExtra("allow-forward", i);
        intent.putExtra("com.kik.platform.content.EXTRA_APP_ID", k);
        intent.putExtra("com.kik.platform.content.EXTRA_CONTENT_ID", j);
        intent.putExtra("com.kik.platform.key.intenttype", "com.kik.platform.intent.throughput");
    }

    public final void a(File file)
    {
        if (file == null)
        {
            a(new BitmapDrawable(null));
            return;
        }
        float f1 = ExifHelper.a(file.toString());
        a(((byte []) (null)));
        android.graphics.BitmapFactory.Options options;
        int i1;
        try
        {
            BitmapFactory.decodeStream(new FileInputStream(file), null, l);
            file = new FileInputStream(file);
            options = new android.graphics.BitmapFactory.Options();
            i1 = Math.max(l.outWidth, l.outHeight);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (i1 <= 300)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        options.inSampleSize = i1 / 300;
        options.inDither = true;
        file = BitmapFactory.decodeStream(file, null, options);
        a(new BitmapDrawable(file), f1);
        return;
    }

    public final String b()
    {
        return (String)a.get("text");
    }

    public final void b(File file)
    {
        if (g != null)
        {
            if (!g.exists())
            {
                throw new IOException("Cannot attach file because it does not exist!");
            }
            if (g.length() > 0x989680L)
            {
                throw new IOException("File too large! Cannot exceed 10000000 bytes");
            }
        }
        g = file;
    }

    public final String c()
    {
        return (String)a.get("title");
    }

    final void d()
    {
        if (g != null)
        {
            if (!g.exists())
            {
                throw new f("Cannot attach file because it does not exist!");
            }
            if (g.length() > 0x989680L)
            {
                throw new f("File too large! Cannot exceed 10000000 bytes");
            }
            String s = g.getName();
            long l1 = g.length();
            if (s != null)
            {
                String s1 = s.replaceAll("[^a-zA-Z0-9 -_.,!@#$&()]", "");
                s = s1;
                if (s1.length() > 256)
                {
                    s = s1.substring(s1.length() - 256, s1.length());
                }
                a.put("file-name", s);
            }
            a.put("file-size", Long.toString(l1));
        }
    }

    final void e()
    {
        if (m > 10000)
        {
            throw new f("Message is invalid and cannot send because total data size exceeds limit of 10000 bytes.");
        }
        if (m < 0)
        {
            throw new f("Message is invalid and cannot send because data size has somehow become negative.");
        } else
        {
            return;
        }
    }

    final void f()
    {
        if (!k.matches("[a-zA-Z0-9\\.-]{5,128}"))
        {
            throw new f("Message is invalid and cannot send because of invalid app Id.");
        } else
        {
            return;
        }
    }

    final File g()
    {
        return g;
    }

    final void h()
    {
        byte abyte0[] = (byte[])c.get("preview");
        if (abyte0 == null)
        {
            return;
        }
        Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        float f1 = 60F / (float)bitmap.getHeight();
        Object obj = new Matrix();
        ((Matrix) (obj)).postScale(f1, f1);
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        obj = new ByteArrayOutputStream();
        int i1 = 70;
        int j1;
        do
        {
            ((ByteArrayOutputStream) (obj)).reset();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i1, ((java.io.OutputStream) (obj)));
            j1 = i1 - 10;
            if (((ByteArrayOutputStream) (obj)).size() <= 5120)
            {
                break;
            }
            i1 = j1;
        } while (j1 >= 10);
        a(((ByteArrayOutputStream) (obj)).toByteArray());
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("KikMessage:{App-Id: ");
        stringbuilder.append(k);
        stringbuilder.append(" Content-id: ");
        stringbuilder.append(j);
        stringbuilder.append(" Size: ");
        stringbuilder.append(m);
        stringbuilder.append(" Allow-Forwarding: ");
        stringbuilder.append(i);
        stringbuilder.append(" File url: ");
        stringbuilder.append(h);
        stringbuilder.append(" File:");
        Object obj;
        if (g == null)
        {
            obj = null;
        } else
        {
            obj = g.getAbsolutePath();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" iphone Uris: ");
        if (f == null)
        {
            obj = "[]";
        } else
        {
            obj = f.toString();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" Android Uris: ");
        if (e == null)
        {
            obj = "[]";
        } else
        {
            obj = e.toString();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" Generic Uris: ");
        if (d == null)
        {
            obj = "[]";
        } else
        {
            obj = d.toString();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" Images: [");
        java.util.Map.Entry entry;
        for (obj = c.entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append((new StringBuilder("size:")).append(((byte[])entry.getValue()).length).append(",").toString()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            stringbuilder.append((new StringBuilder("name:")).append(entry.getKey().toString()).toString());
        }

        stringbuilder.append("]");
        stringbuilder.append(" Extras: [");
        java.util.Map.Entry entry1;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("size:")).append(entry1.getValue().toString()).append(",").toString()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
            stringbuilder.append((new StringBuilder("name:")).append(entry1.getKey().toString()).toString());
        }

        stringbuilder.append("]}");
        return stringbuilder.toString();
    }
}

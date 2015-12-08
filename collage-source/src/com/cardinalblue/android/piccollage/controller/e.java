// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import bolts.j;
import com.androidquery.util.a;
import com.cardinalblue.android.b.g;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.a.b;
import com.cardinalblue.android.piccollage.auth.a.c;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class e
{

    private final Activity a;

    public e(Activity activity)
    {
        a = activity;
    }

    static Activity a(e e1)
    {
        return e1.a;
    }

    public static Intent a(ActivityInfo activityinfo, File file)
        throws FileNotFoundException
    {
        String s;
        Intent intent1;
        s = null;
        intent1 = new Intent("android.intent.action.SEND");
        if (!file.getAbsolutePath().endsWith("mp4")) goto _L2; else goto _L1
_L1:
        intent1.setType("video/*").putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
_L4:
        if (activityinfo != null)
        {
            intent1.setClassName(activityinfo.packageName, activityinfo.name);
        }
        return intent1;
_L2:
        String s1 = android.provider.MediaStore.Images.Media.insertImage(k.a().getContentResolver(), file.getAbsolutePath(), file.getName(), null);
        s = s1;
_L5:
        Intent intent = intent1.setType("image/jpg");
        if (TextUtils.isEmpty(s))
        {
            file = Uri.fromFile(file);
        } else
        {
            file = Uri.parse(s);
        }
        intent.putExtra("android.intent.extra.STREAM", file);
        if (true) goto _L4; else goto _L3
_L3:
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
          goto _L5
    }

    public j a(ActivityInfo activityinfo, File file, String s, String s1)
    {
        return j.b(new Callable(activityinfo, file, s1, s) {

            final ActivityInfo a;
            final File b;
            final String c;
            final String d;
            final e e;

            public Void a()
                throws Exception
            {
                Intent intent = com.cardinalblue.android.piccollage.controller.e.a(a, b);
                if (!TextUtils.isEmpty(c))
                {
                    intent.putExtra("android.intent.extra.TEXT", c);
                }
                if (!TextUtils.isEmpty(d))
                {
                    intent.putExtra("android.intent.extra.SUBJECT", d);
                }
                if (com.cardinalblue.android.piccollage.controller.e.a(e) != null)
                {
                    com.cardinalblue.android.piccollage.controller.e.a(e).startActivity(intent);
                }
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                e = e.this;
                a = activityinfo;
                b = file;
                c = s;
                d = s1;
                super();
            }
        });
    }

    public j a(File file, b b, String s, byte abyte0[])
    {
        return j.a(new Callable(b, file, abyte0, s) {

            final b a;
            final File b;
            final byte c[];
            final String d;
            final e e;

            public CBCollageStructResponse a()
                throws Exception
            {
                Object obj = new ArrayList();
                ((List) (obj)).add(a.c());
                android.graphics.Bitmap bitmap;
                Exception exception;
                Object obj1;
                boolean flag;
                if (a instanceof c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.cardinalblue.android.piccollage.a.b.I(i.a(((java.util.Collection) (obj)), ","));
                if (!g.b(b.toString())) goto _L2; else goto _L1
_L1:
                obj = com.androidquery.util.a.a(new FileInputStream(b));
_L9:
                return f.a(com.cardinalblue.android.piccollage.controller.e.a(e), ((byte []) (obj)), c, d, new b[] {
                    a
                });
_L2:
                try
                {
                    obj1 = new FileInputStream(b);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new com.cardinalblue.android.piccollage.model.k.a(((Throwable) (obj)));
                }
                obj = BitmapFactory.decodeStream(((java.io.InputStream) (obj1)));
                if (obj1 == null) goto _L4; else goto _L3
_L3:
                if (true) goto _L6; else goto _L5
_L5:
                ((FileInputStream) (obj1)).close();
_L4:
                if (flag)
                {
                    bitmap = com.cardinalblue.android.piccollage.a.c.a(((android.graphics.Bitmap) (obj)));
                    obj = bitmap;
                    if (bitmap == null)
                    {
                        throw new IOException("Something goes wrong while generating sharing bitmap.");
                    }
                }
                break; /* Loop/switch isn't completed */
                obj;
                throw new NullPointerException();
_L6:
                ((FileInputStream) (obj1)).close();
                if (true) goto _L4; else goto _L7
                obj;
                throw obj;
                exception;
_L10:
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_200;
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_211;
                }
                ((FileInputStream) (obj1)).close();
_L8:
                throw exception;
                obj1;
                ((Throwable) (obj)).addSuppressed(((Throwable) (obj1)));
                  goto _L8
                ((FileInputStream) (obj1)).close();
                  goto _L8
_L7:
                obj = com.cardinalblue.android.b.a.a(((android.graphics.Bitmap) (obj)));
                  goto _L9
                exception;
                obj = null;
                  goto _L10
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                e = e.this;
                a = b1;
                b = file;
                c = abyte0;
                d = s;
                super();
            }
        });
    }
}

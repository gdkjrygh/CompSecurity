// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.ImageView;
import com.qihoo360.mobilesafe.b.s;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            e

public class com.qihoo.security.opti.trashclear.filemanager.c
    implements android.os.Handler.Callback
{
    private static class a extends e
    {

        SoftReference a;

        public void a(Object obj)
        {
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new SoftReference((Bitmap)obj);
            }
            a = ((SoftReference) (obj));
        }

        public boolean a()
        {
            return a == null;
        }

        public boolean a(ImageView imageview)
        {
            if (a.get() == null)
            {
                return false;
            } else
            {
                imageview.setImageBitmap((Bitmap)a.get());
                return true;
            }
        }

        private a()
        {
        }

    }

    private static class b extends e
    {

        SoftReference a;

        public void a(Object obj)
        {
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new SoftReference((Drawable)obj);
            }
            a = ((SoftReference) (obj));
        }

        public boolean a()
        {
            return a == null;
        }

        public boolean a(ImageView imageview)
        {
            if (a.get() == null)
            {
                return false;
            } else
            {
                imageview.setImageDrawable((Drawable)a.get());
                return true;
            }
        }

        private b()
        {
        }

    }

    public static class c
    {

        public String a;
        public long b;
        public FileCategoryHelper.FileCategory c;

        public c(String s1, long l, FileCategoryHelper.FileCategory filecategory)
        {
            a = s1;
            b = l;
            c = filecategory;
        }
    }

    public static interface d
    {

        public abstract void a(ImageView imageview);
    }

    private static abstract class e
    {

        int b;

        public static e a(FileCategoryHelper.FileCategory filecategory)
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[FileCategoryHelper.FileCategory.values().length];
                    try
                    {
                        a[FileCategoryHelper.FileCategory.Apk.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[FileCategoryHelper.FileCategory.Picture.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[FileCategoryHelper.FileCategory.Video.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[filecategory.ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return new b(null);

            case 2: // '\002'
            case 3: // '\003'
                return new a(null);
            }
        }

        public abstract void a(Object obj);

        public abstract boolean a();

        public abstract boolean a(ImageView imageview);

        private e()
        {
        }

    }

    private class f extends HandlerThread
        implements android.os.Handler.Callback
    {

        final com.qihoo.security.opti.trashclear.filemanager.c a;
        private Handler b;

        private Bitmap a(c c1)
        {
            try
            {
                c1 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(com.qihoo.security.opti.trashclear.filemanager.c.b(a).getContentResolver(), c1.b, 3, null);
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                return null;
            }
            return c1;
        }

        private Bitmap b(c c1)
        {
            try
            {
                c1 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(com.qihoo.security.opti.trashclear.filemanager.c.b(a).getContentResolver(), c1.b, 3, null);
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                return null;
            }
            return c1;
        }

        public void a()
        {
            if (b == null)
            {
                b = new Handler(getLooper(), this);
            }
            b.sendEmptyMessage(0);
        }

        public boolean handleMessage(Message message)
        {
            Iterator iterator = com.qihoo.security.opti.trashclear.filemanager.c.a(a).values().iterator();
_L5:
            c c1;
            e e1;
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_241;
                }
                c1 = (c)iterator.next();
                e1 = (e)com.qihoo.security.opti.trashclear.filemanager.c.a().get(c1.a);
            } while (e1 == null || e1.b != 0);
            e1.b = 1;
            _cls1.a[c1.c.ordinal()];
            JVM INSTR tableswitch 1 3: default 108
        //                       1 130
        //                       2 158
        //                       3 158;
               goto _L1 _L2 _L3 _L3
_L1:
            break; /* Loop/switch isn't completed */
_L2:
            break; /* Loop/switch isn't completed */
_L6:
            e1.b = 2;
            com.qihoo.security.opti.trashclear.filemanager.c.a().put(c1.a, e1);
            if (true) goto _L5; else goto _L4
_L4:
            message = com.qihoo.security.opti.trashclear.filemanager.e.a(com.qihoo.security.opti.trashclear.filemanager.c.b(a), c1.a);
            if (message != null)
            {
                e1.a(message);
            }
              goto _L6
_L3:
            boolean flag;
            if (c1.c == FileCategoryHelper.FileCategory.Video)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (c1.b == 0L)
            {
                c1.b = a.a(c1.a, flag);
            }
            if (c1.b != 0L);
            if (flag)
            {
                message = b(c1);
            } else
            {
                message = a(c1);
            }
            e1.a(message);
              goto _L6
            com.qihoo.security.opti.trashclear.filemanager.c.c(a).sendEmptyMessage(2);
            return true;
              goto _L6
        }

        public f()
        {
            a = com.qihoo.security.opti.trashclear.filemanager.c.this;
            super("FileIconLoader");
        }
    }


    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Handler c = new Handler(this);
    private f d;
    private boolean e;
    private boolean f;
    private final Context g;
    private final d h;

    public com.qihoo.security.opti.trashclear.filemanager.c(Context context, d d1)
    {
        g = context.getApplicationContext();
        h = d1;
    }

    static ConcurrentHashMap a()
    {
        return a;
    }

    static ConcurrentHashMap a(com.qihoo.security.opti.trashclear.filemanager.c c1)
    {
        return c1.b;
    }

    private boolean a(ImageView imageview, String s1, FileCategoryHelper.FileCategory filecategory)
    {
        e e1 = (e)a.get(s1);
        if (e1 == null)
        {
            imageview = e.a(filecategory);
            if (imageview == null)
            {
                return false;
            }
            a.put(s1, imageview);
            s1 = imageview;
        } else
        {
            s1 = e1;
            if (e1.b == 2)
            {
                if (e1.a())
                {
                    return true;
                }
                s1 = e1;
                if (e1.a(imageview))
                {
                    return true;
                }
            }
        }
        s1.b = 0;
        return false;
    }

    static Context b(com.qihoo.security.opti.trashclear.filemanager.c c1)
    {
        return c1.g;
    }

    private void b()
    {
        if (!e)
        {
            e = true;
            c.sendEmptyMessage(1);
        }
    }

    static Handler c(com.qihoo.security.opti.trashclear.filemanager.c c1)
    {
        return c1.c;
    }

    private void c()
    {
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ImageView imageview = (ImageView)iterator.next();
            c c1 = (c)b.get(imageview);
            if (a(imageview, c1.a, c1.c))
            {
                iterator.remove();
                h.a(imageview);
            }
        } while (true);
        if (!b.isEmpty())
        {
            b();
        }
    }

    public long a(String s1, boolean flag)
    {
        Object obj1;
        long l;
        obj1 = null;
        android.net.Uri uri;
        if (flag)
        {
            uri = android.provider.MediaStore.Video.Media.getContentUri("external");
        } else
        {
            uri = android.provider.MediaStore.Images.Media.getContentUri("external");
        }
        s1 = g.getContentResolver().query(uri, new String[] {
            "_id", "_data"
        }, "_data=?", new String[] {
            s1
        }, null);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.moveToNext()) goto _L2; else goto _L3
_L3:
        l = s1.getLong(0);
_L8:
        s.a(s1);
        return l;
        s1;
        s1 = null;
_L6:
        s.a(s1);
        return 0L;
        s1;
        Object obj = obj1;
_L5:
        s.a(((Cursor) (obj)));
        throw s1;
        Exception exception1;
        exception1;
        obj = s1;
        s1 = exception1;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        if (true) goto _L6; else goto _L2
_L2:
        l = 0L;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(ImageView imageview)
    {
        b.remove(imageview);
    }

    public boolean a(ImageView imageview, String s1, long l, FileCategoryHelper.FileCategory filecategory)
    {
        boolean flag = a(imageview, s1, filecategory);
        if (flag)
        {
            b.remove(imageview);
        } else
        {
            s1 = new c(s1, l, filecategory);
            b.put(imageview, s1);
            if (!f)
            {
                b();
                return flag;
            }
        }
        return flag;
    }

    public boolean handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 32
    //                   2 79;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L5:
        return flag;
_L2:
        e = false;
        if (!f)
        {
            if (d == null)
            {
                d = new f();
                d.start();
            }
            d.a();
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!f)
        {
            c();
            return true;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

}

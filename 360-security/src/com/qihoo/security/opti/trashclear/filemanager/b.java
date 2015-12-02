// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileCategoryHelper, c, d, e

public class b
    implements c.d
{

    private static HashMap a = new HashMap();
    private static HashMap b = new HashMap();
    private c c;

    public b(Context context)
    {
        c = new c(context, this);
    }

    public static int a(String s)
    {
        s = (Integer)b.get(s.toLowerCase());
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return 0x7f020139;
        }
    }

    private static void a(String as[], int i)
    {
        if (as != null)
        {
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                String s = as[j];
                b.put(s.toLowerCase(), Integer.valueOf(i));
            }

        }
    }

    public void a(ImageView imageview)
    {
        ImageView imageview1 = (ImageView)a.get(imageview);
        if (imageview1 != null)
        {
            imageview1.setVisibility(0);
            a.remove(imageview);
        }
    }

    public void a(d d1, ImageView imageview, ImageView imageview1)
    {
        FileCategoryHelper.FileCategory filecategory;
        long l;
        imageview1 = d1.b;
        l = d1.k;
        d1 = e.a(imageview1);
        filecategory = FileCategoryHelper.a(imageview1);
        imageview.setImageResource(a(((String) (d1))));
        c.a(imageview);
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

        _cls1.a[filecategory.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 87
    //                   2 107
    //                   3 107;
           goto _L1 _L2 _L3 _L3
_L1:
        boolean flag = true;
_L5:
        if (!flag)
        {
            imageview.setImageResource(0x7f020139);
        }
        return;
_L2:
        c.a(imageview, imageview1, l, filecategory);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L3:
        boolean flag1 = c.a(imageview, imageview1, l, filecategory);
        flag = flag1;
        if (!flag1)
        {
            int i;
            if (filecategory == FileCategoryHelper.FileCategory.Picture)
            {
                i = 0x7f020137;
            } else
            {
                i = 0x7f02013a;
            }
            imageview.setImageResource(i);
            flag = true;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        a(FileCategoryHelper.g, 0x7f020130);
        a(FileCategoryHelper.e, 0x7f02013a);
        a(FileCategoryHelper.f, 0x7f020137);
        a(FileCategoryHelper.c, 0x7f020139);
        a(FileCategoryHelper.d, 0x7f02013b);
        a(new String[] {
            "apk"
        }, 0x7f02012f);
    }
}

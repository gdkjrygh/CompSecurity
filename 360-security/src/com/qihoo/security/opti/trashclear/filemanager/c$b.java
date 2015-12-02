// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            c

private static class <init> extends <init>
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

    private ()
    {
        super(null);
    }

    <init>(<init> <init>1)
    {
        this();
    }
}

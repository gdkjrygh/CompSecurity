// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.content.SharedPreferences;
import android.support.v4.d.f;
import java.io.File;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            a, j

final class b extends f
{

    final a a;

    b(a a1)
    {
        a = a1;
        super(30);
    }

    protected final void b(Object obj, Object obj1)
    {
        Object obj2 = (String)obj;
        ((File)obj1).delete();
        Object obj3 = a.a;
        obj1 = ((j) (obj3)).a;
        obj = String.valueOf("text_");
        String s = String.valueOf(obj2);
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj1 = ((SharedPreferences) (obj1)).getString(((String) (obj)), null);
        obj3 = ((j) (obj3)).a.edit();
        obj = String.valueOf("text_");
        obj2 = String.valueOf(obj2);
        if (((String) (obj2)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj2)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj2 = ((android.content.SharedPreferences.Editor) (obj3)).remove(((String) (obj)));
        obj = String.valueOf("name_");
        obj1 = String.valueOf(obj1);
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        ((android.content.SharedPreferences.Editor) (obj2)).remove(((String) (obj))).commit();
    }

    protected final Object c(Object obj)
    {
        obj = (String)obj;
        return new File(a.b, ((String) (obj)));
    }
}

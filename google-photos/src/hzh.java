// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hzh
    implements nuc, opl, ops, opv
{

    public final nud a = new ntz(this);
    public hzj b;
    private final Set c = new HashSet();
    private final Bundle d;

    public hzh(Activity activity, opd opd1)
    {
        d = activity.getIntent().getExtras();
        opd1.a(this);
    }

    public static Set b(Intent intent)
    {
        intent = (hzj)intent.getParcelableExtra("com.google.android.apps.photos.selection.ExtraPhotoPickerSelected");
        if (intent != null)
        {
            return intent.a();
        } else
        {
            return Collections.emptySet();
        }
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Intent intent)
    {
        intent.putExtra("com.google.android.apps.photos.selection.ExtraPhotoPickerSelected", b);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (hzj)bundle.getParcelable("com.google.android.apps.photos.selection.ExtraPhotoPickerSelected");
        } else
        {
            if (d != null)
            {
                b = (hzj)d.getParcelable("com.google.android.apps.photos.selection.ExtraPhotoPickerSelected");
            }
            if (b == null)
            {
                b = new hzj();
                return;
            }
        }
    }

    void a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            collection.next();
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                iterator.next();
            }
        }

    }

    public final boolean a(ekp ekp)
    {
        return b.a.contains(ekp);
    }

    public final int b()
    {
        return b.a.size();
    }

    void b(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            collection.next();
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                iterator.next();
            }
        }

    }

    public final void c()
    {
        Set set = b.a();
        b.a.clear();
        a(set);
        d();
    }

    void d()
    {
        a.b();
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("com.google.android.apps.photos.selection.ExtraPhotoPickerSelected", b);
    }
}

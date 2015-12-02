// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import android.view.View;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.photos.picking:
//            MediaChoiceDialog, b, d

class a
    implements android.view.View.OnClickListener
{

    final MediaChoiceDialog a;

    a(MediaChoiceDialog mediachoicedialog)
    {
        a = mediachoicedialog;
        super();
    }

    public void onClick(View view)
    {
        Iterator iterator = MediaChoiceDialog.a(a).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (view != entry.getValue())
            {
                continue;
            }
            MediaChoiceDialog.a(a, b.access$200((b)entry.getKey()));
            break;
        } while (true);
        if (MediaChoiceDialog.b(a) == null)
        {
            MediaChoiceDialog.a(a, d.CANCEL);
        }
        a.a();
    }
}

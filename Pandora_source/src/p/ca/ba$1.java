// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import com.pandora.android.view.AlbumArtsGallery;

// Referenced classes of package p.ca:
//            ba

class Object
    implements android.view.OnClickListener
{

    final ba a;

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755734: 
            ba.a(a, a.a(), a.d.getSelectedItemPosition());
            return;

        case 2131755735: 
            ba.a(a, a.a());
            return;

        case 2131755736: 
            ba.a(a, view);
            break;
        }
    }

    ew.View(ba ba1)
    {
        a = ba1;
        super();
    }
}

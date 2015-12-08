// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity

final class d
    implements android.view.View.OnClickListener
{

    final CustomGalleryActivity a;

    d(CustomGalleryActivity customgalleryactivity)
    {
        a = customgalleryactivity;
        super();
    }

    public final void onClick(View view)
    {
        if (CustomGalleryActivity.a(a).size() >= CustomGalleryActivity.b(a))
        {
            view = new Intent();
            ArrayList arraylist = new ArrayList(CustomGalleryActivity.a(a).values());
            Collections.sort(arraylist, new CustomGalleryActivity.c(a, (byte)0));
            ArrayList arraylist1 = new ArrayList(arraylist.size());
            for (int i = 0; i < arraylist.size(); i++)
            {
                arraylist1.add(i, ((CustomGalleryActivity.d)arraylist.get(i)).b());
            }

            view.putStringArrayListExtra("CustomGalleryActivity.EXTRA_RESULTS", arraylist1);
            a.setResult(-1, view);
            a.finish();
            return;
        }
        android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(a)).setTitle(0x7f090307);
        if (CustomGalleryActivity.b(a) == 1)
        {
            view = a.getString(0x7f0900c2);
        } else
        {
            view = String.format(a.getString(0x7f0900c3), new Object[] {
                Integer.valueOf(CustomGalleryActivity.b(a))
            });
        }
        builder.setMessage(view).setPositiveButton(0x7f090193, null).create().show();
    }
}

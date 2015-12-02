// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.text.SpannableString;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.orca.emoji.z;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;

// Referenced classes of package com.facebook.orca.photos.view:
//            PhotoViewActivity, b

class d
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final PhotoViewActivity a;

    d(PhotoViewActivity photoviewactivity)
    {
        a = photoviewactivity;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        PhotoViewActivity.a(a);
        if (PhotoViewActivity.b(a).getSelectedItem() != null)
        {
            adapterview = (b)PhotoViewActivity.b(a).getSelectedItem();
            if (adapterview.b() != null)
            {
                view = new SpannableString(n.a(adapterview.b().k(), 120));
                PhotoViewActivity.d(a).a(view, (int)PhotoViewActivity.c(a).getTextSize());
                PhotoViewActivity.c(a).setText(view);
                com.facebook.orca.photos.view.PhotoViewActivity.e(a).setParams(e.a(adapterview.b().i().e()));
                PhotoViewActivity.f(a).setText(adapterview.b().i().d());
                PhotoViewActivity.h(a).setText(PhotoViewActivity.g(a).a(adapterview.b().f()));
                PhotoViewActivity.i(a).setVisibility(0);
            } else
            {
                PhotoViewActivity.i(a).setVisibility(8);
            }
            PhotoViewActivity.j(a).setText(a.getString(o.photo_viewer_message_count, new Object[] {
                Integer.valueOf(i + 1), Integer.valueOf(PhotoViewActivity.b(a).getCount())
            }));
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}

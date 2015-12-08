// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.common.a;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbAlbumListActivity, b, FbFriendListActivity, a

final class j
    implements android.widget.AdapterView.OnItemClickListener
{

    final FbAlbumListActivity a;

    j(FbAlbumListActivity fbalbumlistactivity)
    {
        a = fbalbumlistactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.a();
        adapterview = (b)FbAlbumListActivity.e(a).get(i);
        if (adapterview.c().equals("<friends_albums>"))
        {
            a.startActivity(new Intent(a, com/roidapp/cloudlib/facebook/FbFriendListActivity));
            a.finish();
            return;
        } else
        {
            view = (com.roidapp.cloudlib.facebook.a)al.g().b("FaceBook");
            view = new Intent(a, ((com.roidapp.cloudlib.facebook.a) (view)).b);
            com.roidapp.cloudlib.common.a.a(adapterview.c(), adapterview.d(), adapterview.a(), FbAlbumListActivity.f(a), FbAlbumListActivity.g(a));
            String.format("albumid[%s],albumName[%s],albumCount[%d],userid[%s],username[%s]", new Object[] {
                adapterview.c(), adapterview.d(), Integer.valueOf(adapterview.a()), FbAlbumListActivity.f(a), FbAlbumListActivity.g(a)
            });
            com.roidapp.cloudlib.common.a.n(a);
            a.startActivity(view);
            a.finish();
            return;
        }
    }
}

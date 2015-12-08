// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbFriendListActivity, FbFriend, FbAlbumListActivity

final class r
    implements android.widget.AdapterView.OnItemClickListener
{

    final FbFriendListActivity a;

    r(FbFriendListActivity fbfriendlistactivity)
    {
        a = fbfriendlistactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.a();
        adapterview = (FbFriend)FbFriendListActivity.b(a).get(i);
        view = new Intent(a, com/roidapp/cloudlib/facebook/FbAlbumListActivity);
        view.putExtra("user_id", adapterview.b());
        view.putExtra("user_name", adapterview.c());
        a.startActivity(view);
        a.finish();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbFriendListActivity

final class p
    implements android.view.View.OnClickListener
{

    final EditText a;
    final FbFriendListActivity b;

    p(FbFriendListActivity fbfriendlistactivity, EditText edittext)
    {
        b = fbfriendlistactivity;
        a = edittext;
        super();
    }

    public final void onClick(View view)
    {
        a.setText("");
        FbFriendListActivity.a(b).setVisibility(4);
    }
}

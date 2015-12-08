// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.cardinalblue.android.piccollage.activities.EchoesListActivity;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            j

class a
    implements android.view..OnClickListener
{

    final WebPhoto a;
    final j b;

    public void onClick(View view)
    {
        view = new Intent(j.b(b), com/cardinalblue/android/piccollage/activities/EchoesListActivity);
        view.putExtra("extra_webphoto", a);
        view.putExtra("start_from", b.b());
        j.b(b).startActivity(view);
    }

    (j j1, WebPhoto webphoto)
    {
        b = j1;
        a = webphoto;
        super();
    }
}

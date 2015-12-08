// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.List;

// Referenced classes of package com.google.userfeedback.android.api:
//            h, m, ah, l, 
//            g, a, b, aa, 
//            ac

public class PreviewActivity extends ListActivity
{

    private Button a;
    private Button b;
    private aa c;

    public PreviewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(h.gf_preview_activity);
        bundle = m.c.a.o;
        if (bundle != null && ((l) (bundle)).d != 0)
        {
            getWindow().getDecorView().setBackgroundColor(getResources().getColor(((l) (bundle)).d));
        }
        a = (Button)findViewById(g.gf_send_from_preview);
        a.setOnClickListener(new a(this, this));
        b = (Button)findViewById(g.gf_back);
        b.setOnClickListener(new b(this));
        bundle = m.c;
        if (bundle == null)
        {
            finish();
            return;
        }
        bundle = ((m) (bundle)).g;
        if (bundle == null)
        {
            finish();
            return;
        }
        try
        {
            c = new aa(this, bundle);
            setListAdapter(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        m.a(this);
    }

    protected void onListItemClick(ListView listview, View view, int i, long l1)
    {
        super.onListItemClick(listview, view, i, l1);
        listview = c;
        view = (ac)((aa) (listview)).a.get(i);
        if (view.c())
        {
            Intent intent = new Intent(((aa) (listview)).b, ((ac) (view)).d);
            intent.putExtra("feedback.FIELD_NAME", ((ac) (view)).c.getName());
            ((aa) (listview)).b.startActivity(intent);
        }
    }
}

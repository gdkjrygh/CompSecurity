// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;
import com.arist.activity.base.BaseActivity;
import com.arist.model.b.c;
import com.arist.model.b.d;
import com.arist.model.skin.ColorCheckBox;
import com.arist.model.skin.ColorTextView;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.arist.activity:
//            c, a

public class AddToListActivity extends BaseActivity
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    com.arist.b.c a;
    private List b;
    private boolean c[];
    private com.arist.activity.c d;
    private c e;
    private ProgressDialog g;
    private Handler h;
    private ColorTextView i;
    private View j;
    private String k;
    private List l;
    private d m;

    public AddToListActivity()
    {
        h = new Handler();
    }

    static List a(AddToListActivity addtolistactivity)
    {
        return addtolistactivity.b;
    }

    private void a()
    {
        int i1;
        int j1;
        boolean flag;
        flag = false;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        j1 = 0;
        i1 = 0;
_L3:
        if (j1 < c.length) goto _L2; else goto _L1
_L1:
        i.setText((new StringBuilder(String.valueOf(k))).append(" (").append(i1).append(")").toString());
        View view = j;
        int k1;
        if (i1 > 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        return;
_L2:
        k1 = i1;
        if (c[j1])
        {
            k1 = i1;
            if (!l.contains(b.get(j1)))
            {
                k1 = i1 + 1;
            }
        }
        j1++;
        i1 = k1;
          goto _L3
        i1 = 0;
          goto _L1
    }

    static List b(AddToListActivity addtolistactivity)
    {
        return addtolistactivity.l;
    }

    static boolean[] c(AddToListActivity addtolistactivity)
    {
        return addtolistactivity.c;
    }

    static void d(AddToListActivity addtolistactivity)
    {
        addtolistactivity.a();
    }

    static d e(AddToListActivity addtolistactivity)
    {
        return addtolistactivity.m;
    }

    static Handler f(AddToListActivity addtolistactivity)
    {
        return addtolistactivity.h;
    }

    static void g(AddToListActivity addtolistactivity)
    {
        if (addtolistactivity.g != null && addtolistactivity.g.isShowing())
        {
            addtolistactivity.g.dismiss();
            addtolistactivity.g = null;
        }
    }

    public void handleBackClicked(View view)
    {
        onBackPressed();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        Arrays.fill(c, flag);
        d.notifyDataSetChanged();
        a();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131099793: 
            g = new ProgressDialog(this, 3);
            break;
        }
        g.setMessage(getString(0x7f0900f9));
        g.setCancelable(false);
        g.show();
        (new a(this)).start();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = getString(0x7f09010f);
        setContentView(0x7f030026);
        Object obj = (ListView)findViewById(0x7f06008f);
        e = new c(getApplicationContext());
        m = new d();
        b = e.a();
        a = new com.arist.b.c(getIntent().getIntExtra("playlist_id", 1), getIntent().getStringExtra("playlist_name"), "");
        m.a(a);
        l = a.f();
        d = new com.arist.activity.c(this);
        ((ListView) (obj)).setAdapter(d);
        j = findViewById(0x7f060090);
        i = (ColorTextView)j.findViewById(0x7f060091);
        i.a();
        i.setOnClickListener(this);
        obj = (ColorCheckBox)findViewById(0x7f06008e);
        if (l.size() == b.size())
        {
            ((ColorCheckBox) (obj)).setEnabled(false);
        }
        ((ColorCheckBox) (obj)).a(this);
        if (bundle != null)
        {
            c = bundle.getBooleanArray("mSelectFlags");
            if (c != null && c.length == b.size())
            {
                a();
                return;
            }
        }
        c = new boolean[b.size()];
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (c != null)
        {
            bundle.putBooleanArray("mSelectFlags", c);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Y;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import ao;
import ap;
import com.snapchat.android.content.SnapchatProvider;
import com.snapchat.android.database.schema.HttpMetricSchema;
import kt;
import tP;

public class HttpMetricsActivity extends FragmentActivity
    implements Y.a, android.view.View.OnClickListener
{

    private AbsListView a;
    private kt b;
    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private String h;

    public HttpMetricsActivity()
    {
        h = (new StringBuilder()).append(HttpMetricSchema.TIMESTAMP.getColumnName()).append(" DESC").toString();
    }

    private void c()
    {
        b().b(900, this);
    }

    public void onClick(View view)
    {
        if (view == d)
        {
            h = (new StringBuilder()).append(HttpMetricSchema.TIMESTAMP.getColumnName()).append(" DESC").toString();
            c();
        } else
        {
            if (view == e)
            {
                h = (new StringBuilder()).append(HttpMetricSchema.DURATION.getColumnName()).append(" DESC").toString();
                c();
                return;
            }
            if (view == f)
            {
                h = (new StringBuilder()).append(HttpMetricSchema.RECEIVED_BYTES.getColumnName()).append(" DESC").toString();
                c();
                return;
            }
            if (view == g)
            {
                h = (new StringBuilder()).append(HttpMetricSchema.SENT_BYTES.getColumnName()).append(" DESC").toString();
                c();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04008d);
        a = (AbsListView)findViewById(0x7f0d0309);
        b = new kt(this);
        c = (Button)findViewById(0x7f0d0308);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private HttpMetricsActivity a;

            public final void onClick(View view)
            {
                tP.a(a);
            }

            
            {
                a = HttpMetricsActivity.this;
                super();
            }
        });
        d = (Button)findViewById(0x7f0d0304);
        d.setOnClickListener(this);
        e = (Button)findViewById(0x7f0d0305);
        e.setOnClickListener(this);
        f = (Button)findViewById(0x7f0d0307);
        f.setOnClickListener(this);
        g = (Button)findViewById(0x7f0d0306);
        g.setOnClickListener(this);
        a.setAdapter(b);
        b().a(900, this);
    }

    public ap onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 900: 
            return new ao(this, SnapchatProvider.a, tP.a, h);
        }
    }

    public void onLoadFinished(ap ap1, Object obj)
    {
        obj = (Cursor)obj;
        ap1.getId();
        JVM INSTR tableswitch 900 900: default 28
    //                   900 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (obj != null)
        {
            b.b(((Cursor) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onLoaderReset(ap ap1)
    {
    }
}

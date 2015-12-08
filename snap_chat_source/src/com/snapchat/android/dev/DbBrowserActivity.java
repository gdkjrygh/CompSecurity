// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.dev;

import Fk;
import Y;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import ap;
import com.snapchat.android.database.table.DbTable;
import com.snapchat.android.database.vtable.DbVirtualTable;
import java.util.Arrays;
import java.util.List;
import tt;
import uq;
import ur;

public class DbBrowserActivity extends FragmentActivity
    implements Y.a
{
    final class a extends Fk
    {

        private int a;
        private DbBrowserActivity b;

        public final View getView(int j, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = b.getLayoutInflater().inflate(a, viewgroup, false);
            }
            view = ((View) (getItem(j)));
            viewgroup = (TextView)view1.findViewById(0x7f0d01fe);
            if (view instanceof com.snapchat.android.database.table.DbTable.DatabaseTable)
            {
                viewgroup.setText(((com.snapchat.android.database.table.DbTable.DatabaseTable)view).name());
            } else
            if (view instanceof com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable)
            {
                viewgroup.setText(((com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable)view).name());
                return view1;
            }
            return view1;
        }

        public a(Context context, List list)
        {
            b = DbBrowserActivity.this;
            super(context, 0x7f040055, list);
            a = 0x7f040055;
        }
    }


    private DrawerLayout a;
    private ListView b;
    private ListView c;
    private ListView d;
    private uq e;
    private TextView f;
    private TextView g;
    private com.snapchat.android.database.table.DbTable.DatabaseTable h;
    private com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable i;

    public DbBrowserActivity()
    {
        h = com.snapchat.android.database.table.DbTable.DatabaseTable.CONVERSATION;
        i = null;
    }

    private static Cursor a(Cursor cursor)
    {
        if (cursor != null) goto _L2; else goto _L1
_L1:
        Cursor cursor1 = null;
_L4:
        return cursor1;
_L2:
        cursor1 = cursor;
        if (TextUtils.equals(cursor.getColumnName(0), "_id")) goto _L4; else goto _L3
_L3:
        String as[];
        MatrixCursor matrixcursor;
        as = new String[cursor.getColumnCount() + 1];
        as[0] = "_id";
        for (int j = 0; j < cursor.getColumnCount(); j++)
        {
            as[j + 1] = cursor.getColumnName(j);
        }

        matrixcursor = new MatrixCursor(as);
        if (!cursor.moveToFirst()) goto _L6; else goto _L5
_L5:
        int k = 0;
_L9:
        Object aobj[] = new Object[as.length];
        aobj[0] = Integer.valueOf(k);
        for (int l = 0; l < cursor.getColumnCount(); l++)
        {
            aobj[l + 1] = cursor.getString(l);
        }

        matrixcursor.addRow(aobj);
        if (cursor.moveToNext()) goto _L7; else goto _L6
_L6:
        return matrixcursor;
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static ListView a(DbBrowserActivity dbbrowseractivity)
    {
        return dbbrowseractivity.b;
    }

    static void a(DbBrowserActivity dbbrowseractivity, com.snapchat.android.database.table.DbTable.DatabaseTable databasetable)
    {
        dbbrowseractivity.h = databasetable;
        dbbrowseractivity.i = null;
    }

    static void a(DbBrowserActivity dbbrowseractivity, com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable databasevirtualtable)
    {
        dbbrowseractivity.h = null;
        dbbrowseractivity.i = databasevirtualtable;
    }

    private void a(tt att[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Schema\n\n");
        int k = att.length;
        for (int j = 0; j < k; j++)
        {
            tt tt1 = att[j];
            stringbuilder.append(tt1.getColumnNumber());
            stringbuilder.append(" ");
            stringbuilder.append(tt1.getColumnName());
            stringbuilder.append(" : ");
            stringbuilder.append(tt1.getDataType());
            stringbuilder.append("\n");
        }

        g.setText(stringbuilder.toString());
    }

    static DrawerLayout b(DbBrowserActivity dbbrowseractivity)
    {
        return dbbrowseractivity.a;
    }

    protected final void c()
    {
        b().b(0, this);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040053);
        a = (DrawerLayout)findViewById(0x7f0d01f3);
        b = (ListView)findViewById(0x7f0d01f6);
        g = (TextView)findViewById(0x7f0d01f5);
        e = new uq(this);
        b.setAdapter(e);
        c = (ListView)findViewById(0x7f0d01f9);
        f = (TextView)findViewById(0x7f0d01f4);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            private DbBrowserActivity a;

            public final void onClick(View view1)
            {
                DbBrowserActivity.a(a).smoothScrollToPosition(0);
            }

            
            {
                a = DbBrowserActivity.this;
                super();
            }
        });
        d = (ListView)findViewById(0x7f0d01fc);
        bundle = new a(this, Arrays.asList((Object[])com.snapchat.android.database.table.DbTable.DatabaseTable.values()));
        c.setAdapter(bundle);
        c.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(bundle) {

            private a a;
            private DbBrowserActivity b;

            public final void onItemClick(AdapterView adapterview, View view1, int j, long l)
            {
                adapterview = ((AdapterView) (a.getItem(j)));
                if (adapterview instanceof com.snapchat.android.database.table.DbTable.DatabaseTable)
                {
                    adapterview = (com.snapchat.android.database.table.DbTable.DatabaseTable)adapterview;
                    DbBrowserActivity.a(b, adapterview);
                    b.c();
                }
                DbBrowserActivity.b(b).a(false);
            }

            
            {
                b = DbBrowserActivity.this;
                a = a1;
                super();
            }
        });
        bundle = new a(this, Arrays.asList((Object[])com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable.values()));
        d.setAdapter(bundle);
        d.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(bundle) {

            private a a;
            private DbBrowserActivity b;

            public final void onItemClick(AdapterView adapterview, View view1, int j, long l)
            {
                adapterview = ((AdapterView) (a.getItem(j)));
                if (adapterview instanceof com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable)
                {
                    adapterview = (com.snapchat.android.database.vtable.DbVirtualTable.DatabaseVirtualTable)adapterview;
                    DbBrowserActivity.a(b, adapterview);
                    b.c();
                }
                DbBrowserActivity.b(b).a(false);
            }

            
            {
                b = DbBrowserActivity.this;
                a = a1;
                super();
            }
        });
        b().a(0, this);
        bundle = a;
        View view = bundle.a(3);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(DrawerLayout.b(3)).toString());
        } else
        {
            bundle.e(view);
            return;
        }
    }

    public ap onCreateLoader(int j, Bundle bundle)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            break;
        }
        if (h != null)
        {
            return new ur(this, h.getTable());
        } else
        {
            return new ur(this, i.getVirtualTable());
        }
    }

    public void onLoadFinished(ap ap1, Object obj)
    {
        boolean flag = true;
        obj = (Cursor)obj;
        switch (ap1.getId())
        {
        default:
            return;

        case 0: // '\0'
            break;
        }
        if (obj != null && ((Cursor) (obj)).getCount() > 0)
        {
            b.setBackgroundColor(0);
            b.setAlpha(1.0F);
        } else
        {
            b.setBackgroundColor(0xffff0000);
            ap1 = ObjectAnimator.ofFloat(b, "alpha", new float[] {
                0.0F, 1.0F
            });
            ap1.setDuration(250L);
            ap1.setRepeatMode(2);
            ap1.setRepeatCount(1);
            ap1.start();
        }
        if (obj != null)
        {
            int j = ((Cursor) (obj)).getCount();
            if (h != null)
            {
                f.setText((new StringBuilder()).append(h.name()).append(" (").append(j).append(")").toString());
                if (j == 0)
                {
                    g.setVisibility(0);
                    b.setVisibility(8);
                    a(h.getTable().b());
                } else
                {
                    g.setVisibility(8);
                    b.setVisibility(0);
                }
            } else
            if (i != null)
            {
                f.setText((new StringBuilder()).append(i.name()).append(" (").append(j).append(")").toString());
                if (j == 0)
                {
                    g.setVisibility(0);
                    b.setVisibility(8);
                    a(i.getVirtualTable().c());
                } else
                {
                    g.setVisibility(8);
                    b.setVisibility(0);
                }
            }
        }
        ap1 = a(((Cursor) (obj)));
        obj = e;
        if (ap1 instanceof MatrixCursor)
        {
            flag = false;
        }
        obj.a = flag;
        e.swapCursor(a(ap1));
    }

    public void onLoaderReset(ap ap1)
    {
        ap1.reset();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.gb;
import com.fitbit.data.bl.gc;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bt;
import com.fitbit.util.f;
import com.fitbit.util.format.e;
import com.fitbit.water.Water;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.water.ui:
//            AddWaterActivity

public class EditWaterEntriesActivity extends FitbitActivity
    implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, com.fitbit.util.SimpleConfirmDialogFragment.a
{
    private static class a
    {

        public TextView a;
        public TextView b;

        private a()
        {
        }

    }


    public static final String a = "date";
    public static final String b = "wle";
    public static final String c = "bundle";
    private static final int d = 2;
    private static final String e = "entry_id";
    private static final String f = "delete_activity_dialog";
    private Date g;
    private ListView h;
    private View i;
    private List j;
    private com.fitbit.data.domain.WaterLogEntry.WaterUnits k;
    private gc l;
    private final BaseAdapter m = new BaseAdapter() {

        final EditWaterEntriesActivity a;

        public int getCount()
        {
            return EditWaterEntriesActivity.a(a).size();
        }

        public Object getItem(int i1)
        {
            return EditWaterEntriesActivity.a(a).get(i1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            Water water = ((WaterLogEntry)EditWaterEntriesActivity.a(a).get(i1)).e().a(EditWaterEntriesActivity.b(a));
            if (water.b() == 0.0D)
            {
                view = new View(viewgroup.getContext());
                view.setVisibility(8);
                return view;
            }
            TextView textview;
            if (view == null || view.getVisibility() == 8)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04011c, viewgroup, false);
                viewgroup = new a();
                view.setTag(viewgroup);
                viewgroup.a = (TextView)view.findViewById(0x7f1103a4);
                viewgroup.b = (TextView)view.findViewById(0x7f1103a5);
            } else
            {
                viewgroup = (a)view.getTag();
            }
            textview = ((a) (viewgroup)).a;
            viewgroup = ((a) (viewgroup)).b;
            textview.setText(bt.a(water.b(), 2));
            viewgroup.setText(((com.fitbit.data.domain.WaterLogEntry.WaterUnits)water.a()).getQuantityDisplayName(com.fitbit.util.format.e.b(water.b())));
            return view;
        }

            
            {
                a = EditWaterEntriesActivity.this;
                super();
            }
    };

    public EditWaterEntriesActivity()
    {
        j = new ArrayList();
    }

    static com.fitbit.data.domain.WaterLogEntry.WaterUnits a(EditWaterEntriesActivity editwaterentriesactivity, com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        editwaterentriesactivity.k = waterunits;
        return waterunits;
    }

    static List a(EditWaterEntriesActivity editwaterentriesactivity)
    {
        return editwaterentriesactivity.j;
    }

    static List a(EditWaterEntriesActivity editwaterentriesactivity, List list)
    {
        editwaterentriesactivity.j = list;
        return list;
    }

    private void a(WaterLogEntry waterlogentry)
    {
        j.remove(waterlogentry);
        m.notifyDataSetChanged();
        com.fitbit.util.f.a(new com.fitbit.util.f.a(FitBitApplication.a(), waterlogentry) {

            final WaterLogEntry a;
            final EditWaterEntriesActivity b;

            public void a(Context context)
            {
                gb.a().a(Collections.singletonList(a), context);
            }

            public void b(Object obj)
            {
                a((Context)obj);
            }

            
            {
                b = EditWaterEntriesActivity.this;
                a = waterlogentry;
                super(context);
            }
        });
    }

    static com.fitbit.data.domain.WaterLogEntry.WaterUnits b(EditWaterEntriesActivity editwaterentriesactivity)
    {
        return editwaterentriesactivity.k;
    }

    static gc c(EditWaterEntriesActivity editwaterentriesactivity)
    {
        return editwaterentriesactivity.l;
    }

    static View d(EditWaterEntriesActivity editwaterentriesactivity)
    {
        return editwaterentriesactivity.i;
    }

    static BaseAdapter e(EditWaterEntriesActivity editwaterentriesactivity)
    {
        return editwaterentriesactivity.m;
    }

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        int i1 = simpleconfirmdialogfragment.getArguments().getInt("entry_id");
        a((WaterLogEntry)j.get(i1));
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001b);
        k = r.e();
        i = findViewById(0x7f1100ea);
        g = (Date)getIntent().getSerializableExtra("date");
        if (DateUtils.isToday(g.getTime()))
        {
            setTitle(getString(0x7f080582));
        } else
        {
            setTitle(getString(0x7f080581, new Object[] {
                com.fitbit.util.format.e.f(this, g)
            }));
        }
        h = (ListView)findViewById(0x7f1100e9);
        h.setAdapter(m);
        h.setOnItemClickListener(this);
        h.setOnItemLongClickListener(this);
        l = new gc(this) {

            final EditWaterEntriesActivity a;

            protected void c()
            {
                if (EditWaterEntriesActivity.c(a).b().isEmpty())
                {
                    a.finish();
                } else
                {
                    int i1;
                    if (EditWaterEntriesActivity.c(a).d().b() == 0.0D)
                    {
                        EditWaterEntriesActivity.d(a).setVisibility(0);
                    } else
                    {
                        EditWaterEntriesActivity.d(a).setVisibility(8);
                    }
                    EditWaterEntriesActivity.a(a, EditWaterEntriesActivity.c(a).b());
                    com.fitbit.water.ui.EditWaterEntriesActivity.e(a).notifyDataSetChanged();
                    EditWaterEntriesActivity.a(a, r.e());
                    i1 = 0;
                    while (i1 < EditWaterEntriesActivity.a(a).size()) 
                    {
                        WaterLogEntry waterlogentry = (WaterLogEntry)EditWaterEntriesActivity.a(a).get(i1);
                        waterlogentry.a(waterlogentry.e().a(EditWaterEntriesActivity.b(a)));
                        i1++;
                    }
                }
            }

            
            {
                a = EditWaterEntriesActivity.this;
                super(context);
            }
        };
        l.a(g);
        getSupportLoaderManager().initLoader(3, null, l);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f120009, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = new Bundle();
        adapterview.putParcelable("wle", (WaterLogEntry)j.get(i1));
        view = new Intent(getApplicationContext(), com/fitbit/water/ui/AddWaterActivity);
        view.putExtra("bundle", adapterview);
        startActivity(view);
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = SimpleConfirmDialogFragment.a(this, 0x7f08013c, 0x7f0802c2, 0x7f08013d, 0x7f08005a);
        view = adapterview.getArguments();
        view.putInt("entry_id", i1);
        adapterview.setArguments(view);
        ad.a(getSupportFragmentManager(), "delete_activity_dialog", adapterview);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131821787: 
            menuitem = new Intent(this, com/fitbit/water/ui/AddWaterActivity);
            break;
        }
        menuitem.putExtra("date", g.getTime());
        startActivity(menuitem);
        return true;
    }

    public void onRestart()
    {
        super.onRestart();
        getSupportLoaderManager().restartLoader(3, null, l);
    }
}

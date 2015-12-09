// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Dialog;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.support.v4.app.n;
import android.support.v4.content.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.StationProvider;
import p.cw.c;
import p.l.d;
import p.l.g;
import p.l.j;

public class ai extends f
    implements android.widget.AdapterView.OnItemClickListener
{
    private class a extends ResourceCursorAdapter
    {

        final ai a;

        public void bindView(View view, Context context, Cursor cursor)
        {
            cursor = new y(cursor);
            ((TextView)view.findViewById(0x7f10011b)).setText(cursor.d());
            ImageView imageview = (ImageView)view.findViewById(0x7f1000b5);
            g.b(context).a(cursor.o()).a(0x7f0200e9).a(imageview);
            view = (ImageView)view.findViewById(0x7f100289);
            if (cursor.A())
            {
                view.setVisibility(0);
                view.setImageResource(0x7f0200db);
                return;
            }
            if (cursor.k())
            {
                view.setVisibility(0);
                view.setImageResource(0x7f020257);
                return;
            } else
            {
                view.setVisibility(8);
                return;
            }
        }

        public a(Context context, int i, Cursor cursor)
        {
            a = ai.this;
            super(context, i, cursor);
        }
    }


    private a a;
    private n b;
    private ListView c;
    private AlarmData d;
    private android.support.v4.app.n.a e;

    public ai()
    {
        e = new android.support.v4.app.n.a() {

            final ai a;

            public void a(i i, Cursor cursor)
            {
                ai.a(a).changeCursor(cursor);
            }

            public i onCreateLoader(int i, Bundle bundle)
            {
                return new android.support.v4.content.f(b.a.h(), StationProvider.f, com.pandora.radio.provider.h.l, com.pandora.radio.provider.h.i, null, com.pandora.radio.provider.h.a);
            }

            public void onLoadFinished(i i, Object obj)
            {
                a(i, (Cursor)obj);
            }

            public void onLoaderReset(i i)
            {
                ai.a(a).changeCursor(null);
            }

            
            {
                a = ai.this;
                super();
            }
        };
    }

    static a a(ai ai1)
    {
        return ai1.a;
    }

    public static ai a(AlarmData alarmdata)
    {
        ai ai1 = new ai();
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent_alarm_data", alarmdata);
        ai1.setArguments(bundle);
        return ai1;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d = (AlarmData)getArguments().getParcelable("intent_alarm_data");
        b = getLoaderManager();
        b.a(32, null, e);
        if (a == null)
        {
            a = new a(getActivity(), 0x7f040097, null);
            c.setAdapter(a);
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.setTitle(0x7f08022c);
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = new ListView(getActivity());
        c.setOnItemClickListener(this);
        return c;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b.a(32);
        b.a.b().c(this);
        b.a.e().b(this);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            if (i >= 0)
            {
                adapterview = new y((Cursor)adapterview.getItemAtPosition(i));
                d.b(adapterview.d());
                d.a(adapterview.c());
                b.a.e().a(new p.bz.b(d, false));
                if (!getShowsDialog())
                {
                    break label0;
                }
                dismiss();
            }
            return;
        }
        getFragmentManager().c();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        b.a.b().b(this);
        b.a.e().c(this);
        super.onViewCreated(view, bundle);
    }
}

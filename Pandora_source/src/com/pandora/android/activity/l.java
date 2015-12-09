// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ArtistSearchData;
import com.pandora.radio.data.GenreStationSearchData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SongSearchData;
import com.pandora.radio.data.v;
import java.util.ArrayList;

public class l extends ArrayAdapter
{

    private LayoutInflater a;

    public l(Context context)
    {
        super(context, 0x7f04008c);
        a = LayoutInflater.from(context);
    }

    private String a(com.pandora.radio.data.v.a a1)
    {
        android.app.Application application = b.a.h();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.data.v.a.values().length];
                try
                {
                    a[com.pandora.radio.data.v.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.radio.data.v.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.radio.data.v.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.v.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.v.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 64
    //                   2 70
    //                   3 76
    //                   4 82
    //                   5 88;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_88;
_L1:
        int i = -1;
_L7:
        if (i != -1)
        {
            return application.getResources().getString(i);
        } else
        {
            return null;
        }
_L2:
        i = 0x7f0800ad;
          goto _L7
_L3:
        i = 0x7f0800aa;
          goto _L7
_L4:
        i = 0x7f0800ab;
          goto _L7
_L5:
        i = 0x7f0800ae;
          goto _L7
        i = 0x7f0800ac;
          goto _L7
    }

    private void b(v av[])
    {
        int j = av.length;
        for (int i = 0; i < j; i++)
        {
            add(av[i]);
        }

    }

    private v[] b(MusicSearchData musicsearchdata)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        Object aobj[] = musicsearchdata.a();
        if (aobj != null && aobj.length > 0)
        {
            arraylist.add(new v(null, com.pandora.radio.data.v.a.c, com.pandora.radio.data.t.a.f));
            for (int i = 0; i < aobj.length; i++)
            {
                ArtistSearchData artistsearchdata = aobj[i];
                arraylist.add(new v(artistsearchdata.a(), artistsearchdata.b()));
            }

        }
        aobj = musicsearchdata.b();
        if (aobj != null && aobj.length > 0)
        {
            arraylist.add(new v(null, com.pandora.radio.data.v.a.d, com.pandora.radio.data.t.a.f));
            for (int j = 0; j < aobj.length; j++)
            {
                SongSearchData songsearchdata = aobj[j];
                arraylist.add(new v(songsearchdata.a(), songsearchdata.b(), songsearchdata.d()));
            }

        }
        musicsearchdata = musicsearchdata.c();
        if (musicsearchdata != null && musicsearchdata.length > 0)
        {
            arraylist.add(new v(null, com.pandora.radio.data.v.a.e, com.pandora.radio.data.t.a.f));
            for (int k = ((flag) ? 1 : 0); k < musicsearchdata.length; k++)
            {
                GenreStationSearchData genrestationsearchdata = musicsearchdata[k];
                arraylist.add(new v(genrestationsearchdata.a(), genrestationsearchdata.b(), com.pandora.radio.data.t.a.d));
            }

        }
        return (v[])arraylist.toArray(new v[arraylist.size()]);
    }

    public boolean a(MusicSearchData musicsearchdata)
    {
        v av[] = null;
        if (musicsearchdata != null)
        {
            av = b(musicsearchdata);
        }
        return a(av);
    }

    public boolean a(v av[])
    {
        clear();
        if (av == null || av.length <= 0)
        {
            notifyDataSetInvalidated();
            return false;
        } else
        {
            b(av);
            notifyDataSetChanged();
            return true;
        }
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getItemViewType(int i)
    {
        return ((v)getItem(i)).d() != com.pandora.radio.data.t.a.f ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        v v1 = (v)getItem(i);
        int j = 0x7f040071;
        if (getItemViewType(i) == 1)
        {
            j = 0x7f040070;
        }
        if (view == null)
        {
            view = (TextView)a.inflate(j, viewgroup, false);
        }
        if (v1.a() == null)
        {
            viewgroup = v1.b();
        } else
        {
            viewgroup = a(v1.a());
        }
        ((TextView)view).setText(viewgroup);
        return view;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return ((v)getItem(i)).d() != com.pandora.radio.data.t.a.f;
    }
}

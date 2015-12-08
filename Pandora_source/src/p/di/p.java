// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.ArtistSearchData;
import com.pandora.radio.data.GenreStationSearchData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.SongSearchData;
import com.pandora.radio.util.i;
import com.pandora.radio.util.j;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.ab;
import p.df.a;

public class p extends h
{

    private final String a;
    private final j c;
    private final SearchDescriptor d;
    private final boolean e;
    private final p.cx.x.e f;

    private p(String s, SearchDescriptor searchdescriptor, j j1, boolean flag, p.cx.x.e e1)
    {
        if (searchdescriptor == null)
        {
            throw new IllegalArgumentException("searchDescriptor cannot be null");
        } else
        {
            a = s;
            d = searchdescriptor;
            c = j1;
            e = flag;
            f = e1;
            return;
        }
    }

    public static p a(SearchDescriptor searchdescriptor, j j1, boolean flag, p.cx.x.e e1)
    {
        return new p(searchdescriptor.a(), searchdescriptor, j1, flag, e1);
    }

    public static p a(String s, j j1, boolean flag, boolean flag1, p.cx.x.e e1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("searchText cannot be null");
        } else
        {
            return new p(s, new SearchDescriptor(s, null, null, flag, "any", null), j1, flag1, e1);
        }
    }

    public p a()
    {
        return new p(a, d, c, e, f);
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        c.z.a(new ab(exception.getMessage(), 2003, null));
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public h b()
    {
        return a();
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n
    {
        SongSearchData asongsearchdata[];
        int k;
        c c1 = c.z;
        if (d.a(c1))
        {
            c.a(null, a, c1);
            p.df.a.a("MusicSearchAsyncTask", "MusicSearchAsyncTask - skipping search, timeout has expired");
            return null;
        }
        asongsearchdata = c1.e().a(a, e, d);
        if ((d.d() || !d.d) && asongsearchdata.d() != null)
        {
            c.a(asongsearchdata.f(), asongsearchdata.d(), c1, f, d);
            return null;
        }
        ArtistSearchData aartistsearchdata[];
        GenreStationSearchData agenrestationsearchdata[];
        Object obj;
        int l;
        if (!i.a(d.a) || !i.a(d.c))
        {
            aobj = asongsearchdata.b();
        } else
        {
            aobj = new SongSearchData[0];
        }
        if (!i.a(d.a) || i.a(d.c))
        {
            aartistsearchdata = asongsearchdata.a();
        } else
        {
            aartistsearchdata = new ArtistSearchData[0];
        }
        if (!i.a(d.a) || i.a(d.c))
        {
            agenrestationsearchdata = asongsearchdata.c();
        } else
        {
            agenrestationsearchdata = new GenreStationSearchData[0];
        }
        if (i.a(d.c) || i.a(d.b))
        {
            break MISSING_BLOCK_LABEL_365;
        }
        l = aobj.length;
        k = 0;
_L5:
        asongsearchdata = ((SongSearchData []) (aobj));
        if (k >= l) goto _L2; else goto _L1
_L1:
        obj = aobj[k];
        if (!((SongSearchData) (obj)).b().equalsIgnoreCase(d.b)) goto _L4; else goto _L3
_L3:
        asongsearchdata = new SongSearchData[1];
        asongsearchdata[0] = obj;
_L2:
        aobj = new MusicSearchData(aartistsearchdata, asongsearchdata, agenrestationsearchdata, d);
_L6:
        c.a(((MusicSearchData) (aobj)), a, c1);
        return null;
_L4:
        k++;
          goto _L5
        aobj = asongsearchdata;
          goto _L6
    }
}

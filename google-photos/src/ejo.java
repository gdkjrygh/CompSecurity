// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class ejo
    implements mti, omb, opl, ops, opv
{

    private static final ekk d = (new ekm()).b(elt).b(hpg).b(jdy).a();
    public mtj a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    private ejn e;
    private gfw f;
    private gfy g;
    private final ejq h;
    private final ArrayList i = new ArrayList();
    private final ArrayList j = new ArrayList();
    private final ArrayList k = new ArrayList();
    private noz l;
    private ejm m;

    public ejo(opd opd1, ejq ejq1, gfy gfy1)
    {
        m = ejm.c;
        h = ejq1;
        g = gfy1;
        g.a(new ejp(this));
        opd1.a(this);
    }

    private void a()
    {
        k.addAll(i);
        i.clear();
    }

    static void a(ejo ejo1)
    {
        Uri uri = ejo1.e.a((ekp)ejo1.j.get(0), ejo1.m);
        ejo1.k.add(uri);
        ejo1.j.clear();
        ejo1.a();
        ejo1.b();
    }

    private void b()
    {
        if (b.isEmpty())
        {
            h.a(k);
            return;
        } else
        {
            int i1 = k.size();
            int j1 = k.size();
            int k1 = b.size();
            h.a(i1, j1 + k1);
            Uri uri = (Uri)b.get(0);
            a.a(new ejl(uri));
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (ejn)olm1.a(ejn);
        a = ((mtj)olm1.a(mtj)).a(this);
        f = (gfw)olm1.a(gfw);
        l = noz.a(context, "DownloadBytesMixin", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            m = ejm.valueOf(bundle.getString("DownloadBytesMixin.size"));
            b.addAll(bundle.getParcelableArrayList("DownloadBytesMixin.uris_to_download"));
            i.addAll(bundle.getParcelableArrayList("DownloadBytesMixin.uris_to_resize"));
            j.addAll(bundle.getParcelableArrayList("DownloadBytesMixin.uris_to_send_to_moviemaker"));
            k.addAll(bundle.getParcelableArrayList("DownloadBytesMixin.uris_complete"));
            c = bundle.getBoolean("DownloadBytesMixin.is_running");
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (c)
        {
            if (!eld.a(b.lU).equals(s))
            {
                continue;
            }
            if (mue1 != null && !mue1.c())
            {
                for (s = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list").iterator(); s.hasNext();)
                {
                    mue1 = (ekp)s.next();
                    if (gfw.a(f.a(mue1)))
                    {
                        j.add(mue1);
                    } else
                    {
                        mue1 = e.a(mue1, m);
                        if (e.c(mue1))
                        {
                            b.add(mue1);
                        } else
                        {
                            i.add(mue1);
                        }
                    }
                }

                boolean flag;
                if (j.isEmpty())
                {
                    flag = false;
                } else
                {
                    if (j.size() > 1 && l.a())
                    {
                        noy.a("mediaToSendToMoviMaker.size()", Integer.valueOf(j.size()));
                    }
                    s = f.a((ekp)j.get(0));
                    if (!gfw.a(s))
                    {
                        flag = false;
                    } else
                    {
                        g.a(s, gga.a);
                        flag = true;
                    }
                }
                if (!flag)
                {
                    a();
                    b();
                    return;
                }
            } else
            {
                c = false;
                h.a();
                return;
            }
        }
        do
        {
            return;
        } while (!"DownloadMediaToCacheTask".equals(s));
        if (mue1 != null && !mue1.c())
        {
            s = (Uri)mue1.a().getParcelable("content_uri");
            b.remove(s);
            k.add(s);
            b();
            return;
        } else
        {
            c = false;
            h.a();
            return;
        }
    }

    public final boolean a(ejm ejm1, Collection collection)
    {
        boolean flag;
        if (collection != null && !collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must provide a non-empty mediaList");
        if (c)
        {
            return false;
        } else
        {
            m = ejm1;
            c = true;
            a.a(new eld(new ArrayList(collection), d, b.lU));
            return true;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putString("DownloadBytesMixin.size", m.toString());
        bundle.putParcelableArrayList("DownloadBytesMixin.uris_to_download", b);
        bundle.putParcelableArrayList("DownloadBytesMixin.uris_to_resize", i);
        bundle.putParcelableArrayList("DownloadBytesMixin.uris_to_send_to_moviemaker", j);
        bundle.putParcelableArrayList("DownloadBytesMixin.uris_complete", k);
        bundle.putBoolean("DownloadBytesMixin.is_running", c);
    }

}

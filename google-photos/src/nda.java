// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.libraries.social.ingest.ui.DateTileView;
import com.google.android.libraries.social.ingest.ui.MtpThumbnailTileView;

public final class nda extends BaseAdapter
    implements SectionIndexer
{

    public ndl a;
    private int b;
    private LayoutInflater c;
    private int d;

    public nda(Activity activity)
    {
        b = ndn.b;
        d = 0;
        c = LayoutInflater.from(activity);
    }

    public final int a(int i)
    {
        int j = -1;
        if (a != null) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        Object obj;
        int k;
        int i1;
label0:
        {
            obj = a;
            i1 = b;
            obj = ((ndl) (obj)).d;
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = i;
            if (i1 == ndn.b)
            {
                j = ((ndr) (obj)).b.length - 1 - i;
            }
            k = ((ndr) (obj)).c.length - 1;
            for (i = 0; k >= i;)
            {
                int l = (k + i) / 2;
                if (((ndr) (obj)).c[l].d + ((ndr) (obj)).c[l].e <= j)
                {
                    i = l + 1;
                } else
                {
                    k = l;
                    if (((ndr) (obj)).c[l].d <= j)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = 0;
        }
        i = ((((ndr) (obj)).c[k].b + j) - ((ndr) (obj)).c[k].d) + 1;
        j = i;
        if (i1 == ndn.b)
        {
            return ((ndr) (obj)).a.length - i;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean areAllItemsEnabled()
    {
        return true;
    }

    public final int getCount()
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (a != null)
        {
            ndr ndr1 = a.d;
            i = ((flag) ? 1 : 0);
            if (ndr1 != null)
            {
                i = ndr1.a.length;
            }
        }
        return i;
    }

    public final Object getItem(int i)
    {
        Object obj = a;
        int j = b;
        obj = ((ndl) (obj)).d;
        if (obj == null)
        {
            return null;
        }
        if (j == ndn.a)
        {
            ndd ndd1 = ((ndr) (obj)).c[((ndr) (obj)).a[i]];
            if (ndd1.b == i)
            {
                return ndd1.a;
            } else
            {
                return ((ndr) (obj)).b[(ndd1.d + i) - 1 - ndd1.b];
            }
        }
        i = ((ndr) (obj)).a.length - 1 - i;
        ndd ndd2 = ((ndr) (obj)).c[((ndr) (obj)).a[i]];
        if (ndd2.c == i)
        {
            return ndd2.a;
        } else
        {
            return ((ndr) (obj)).b[(i + ndd2.d) - ndd2.b];
        }
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return i != getPositionForSection(getSectionForPosition(i)) ? 0 : 1;
    }

    public final int getPositionForSection(int i)
    {
        if (getCount() == 0)
        {
            return 0;
        }
        int k = getSections().length;
        int j = i;
        if (i >= k)
        {
            j = k - 1;
        }
        Object obj = a;
        i = b;
        obj = ((ndl) (obj)).d;
        if (i == ndn.a)
        {
            return ((ndr) (obj)).c[j].b;
        } else
        {
            return ((ndr) (obj)).a.length - ((ndr) (obj)).c[((ndr) (obj)).c.length - 1 - j].c - 1;
        }
    }

    public final int getSectionForPosition(int i)
    {
        int k = getCount();
        if (k == 0)
        {
            return 0;
        }
        int j = i;
        if (i >= k)
        {
            j = k - 1;
        }
        Object obj = a;
        i = b;
        obj = ((ndl) (obj)).d;
        if (i == ndn.a)
        {
            return ((ndr) (obj)).a[j];
        } else
        {
            return ((ndr) (obj)).c.length - 1 - ((ndr) (obj)).a[((ndr) (obj)).a.length - 1 - j];
        }
    }

    public final Object[] getSections()
    {
        Object obj;
        int i;
label0:
        {
            if (getCount() > 0)
            {
                obj = a;
                i = b;
                obj = ((ndl) (obj)).d;
                if (obj != null)
                {
                    break label0;
                }
            }
            return null;
        }
        if (i == ndn.a)
        {
            return ((ndr) (obj)).c;
        } else
        {
            return ((ndr) (obj)).d;
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) == 0)
        {
            if (view == null)
            {
                view = (MtpThumbnailTileView)c.inflate(b.FM, viewgroup, false);
            } else
            {
                view = (MtpThumbnailTileView)view;
            }
            view.a(a.b(), (ndg)getItem(i), d);
            viewgroup = view;
        } else
        {
            int j;
            int k;
            if (view == null)
            {
                view = (DateTileView)c.inflate(b.FK, viewgroup, false);
            } else
            {
                view = (DateTileView)view;
            }
            viewgroup = (nds)getItem(i);
            k = ((nds) (viewgroup)).b;
            i = ((nds) (viewgroup)).a;
            j = ((nds) (viewgroup)).c;
            if (k != ((DateTileView) (view)).g)
            {
                view.g = k;
                TextView textview = ((DateTileView) (view)).b;
                if (((DateTileView) (view)).g > 9)
                {
                    viewgroup = Integer.toString(((DateTileView) (view)).g);
                } else
                {
                    int l = ((DateTileView) (view)).g;
                    viewgroup = (new StringBuilder(12)).append("0").append(l).toString();
                }
                textview.setText(viewgroup);
            }
            if (((DateTileView) (view)).h != DateTileView.a)
            {
                view.h = DateTileView.a;
                if (i == ((DateTileView) (view)).e)
                {
                    ((DateTileView) (view)).c.setText(((DateTileView) (view)).h[((DateTileView) (view)).e]);
                }
            }
            if (i != ((DateTileView) (view)).e)
            {
                view.e = i;
                ((DateTileView) (view)).c.setText(((DateTileView) (view)).h[((DateTileView) (view)).e]);
            }
            viewgroup = view;
            if (j != ((DateTileView) (view)).f)
            {
                view.f = j;
                ((DateTileView) (view)).d.setText(Integer.toString(((DateTileView) (view)).f));
                return view;
            }
        }
        return viewgroup;
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    public final boolean isEnabled(int i)
    {
        return true;
    }

    public final void notifyDataSetChanged()
    {
        d = d + 1;
        super.notifyDataSetChanged();
    }

    public final void notifyDataSetInvalidated()
    {
        d = d + 1;
        super.notifyDataSetInvalidated();
    }
}

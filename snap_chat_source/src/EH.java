// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.stories.StoriesSection;
import com.snapchat.android.util.debug.ReleaseManager;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class EH extends EF
{

    protected EG a;
    private final sX b;
    private final Bus c;
    private final EI h;
    private final Set i;

    private EH(Context context, EI ei, sX sx, Bus bus, Set set)
    {
        super(context);
        b = sx;
        c = bus;
        h = ei;
        i = set;
        a = new EG(h);
        k();
    }

    public EH(Context context, sX sx)
    {
        EI ei = new EI();
        Je.a();
        Bus bus = Mf.a();
        HashSet hashset = new HashSet();
        new ta();
        this(context, ei, sx, bus, ((Set) (hashset)));
    }

    public final StoriesSection a(boolean flag)
    {
        return StoriesSection.LIVE;
    }

    public final void a(jW jw)
    {
        if (!i.isEmpty())
        {
            jw.liveStoriesSeen = Jh.a(i, "~");
        }
        i.clear();
        g = -1;
    }

    public final void a(String s)
    {
        if (e != null)
        {
            int l = 0;
            while (l < e.getChildCount()) 
            {
                Object obj = e.getChildAt(l);
                obj = (EJ)e.a(((android.view.View) (obj)));
                if (TextUtils.equals(((EJ) (obj)).s, s))
                {
                    a.c(((EJ) (obj)).e());
                }
                l++;
            }
        }
    }

    public final int c()
    {
        return 3;
    }

    public final android.support.v7.widget.RecyclerView.a d()
    {
        return a;
    }

    public final void e()
    {
        k();
        x_();
    }

    public final void f()
    {
        g = f.o();
        j();
    }

    public final void g()
    {
        c.b(this);
    }

    public final void h()
    {
        c.c(this);
    }

    public final String i()
    {
        return "livestories&";
    }

    protected final void j()
    {
        if (e != null && f != null && h.b.size() > g)
        {
            int l = 0;
            while (l <= g) 
            {
                i.add(((StoryCollection)h.b.get(l)).mUsername);
                l++;
            }
        }
    }

    public final void k()
    {
        EI ei = h;
        ei.b.clear();
        ei.b.addAll(ei.a.a(false));
        ei.b.addAll(ei.a.a(true));
        ((android.support.v7.widget.RecyclerView.a) (a)).a.b();
    }

    public final void onDeepLinkLiveStoryFetchedEvent(Mw mw)
    {
        k();
    }

    public final void onHideSnapStoryEvent(MV mv)
    {
        String s = mv.mUsername;
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        EI ei;
        int l;
        ei = h;
        l = 0;
_L5:
        if (l >= ei.b.size())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        mv = (StoryCollection)ei.b.get(l);
        if (!TextUtils.equals(s, ((StoryCollection) (mv)).mUsername)) goto _L4; else goto _L3
_L3:
        List list = h.b;
        if (mv != null && mv.n() && mv.d() == 0)
        {
            e.postDelayed(new Runnable(list, mv) {

                private List a;
                private StoryCollection b;
                private EH c;

                public final void run()
                {
                    int i1 = a.indexOf(b);
                    a.remove(b);
                    a.add(b);
                    c.a.a(i1, c.a.b() - 1);
                    if (i1 == 0)
                    {
                        c.e.a(0);
                    }
                    c.x_();
                }

            
            {
                c = EH.this;
                a = list;
                b = storycollection;
                super();
            }
            }, 300L);
            return;
        }
          goto _L1
_L4:
        l++;
          goto _L5
        mv = null;
          goto _L3
    }

    public final boolean w_()
    {
        return h.b.isEmpty();
    }

    public final void x_()
    {
        int i1;
        sX sx = b;
        if (sx.c.mPreloadMode == Sc.NO_PRELOAD)
        {
            Timber.a("StoryLoader", "Skipping autoloading shared Stories since settings is no preload.", new Object[0]);
            i1 = 0;
        } else
        {
            i1 = sx.b.a.a("STORY_LOADER_ANDROID", "MAX_NUM_SHARED_STORIES_TO_LOAD_ON_APP_OPEN", 2);
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        List list;
        int l;
        int j1;
        list = h.b;
        j1 = 0;
        l = 0;
_L5:
        if (j1 >= list.size()) goto _L1; else goto _L3
_L3:
        StoryCollection storycollection = (StoryCollection)list.get(j1);
        Bk bk = storycollection.k();
        Object obj;
        boolean flag;
        if (bk != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = bk;
        if (bk == null)
        {
            obj = storycollection.i();
        }
        if (obj == null)
        {
            Timber.d("LiveStoriesListItem", "Skipping prefetching %s because it is empty.", new Object[] {
                storycollection
            });
            if (ReleaseManager.f())
            {
                throw new IllegalStateException(String.format("Cannot prefetch empty story collection %s!", new Object[] {
                    storycollection
                }));
            }
            break; /* Loop/switch isn't completed */
        }
        obj = ta.a(((Bk) (obj)), storycollection, flag, MediaOpenOrigin.STORIES);
        b.a(((sZ) (obj)), b.b(), null, 0, false, StoryLoadingContext.AUTO_LOADED);
        l++;
        if (l == i1) goto _L1; else goto _L4
_L4:
        j1++;
          goto _L5
    }
}

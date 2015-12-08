// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.b.a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import com.b.a.a.b;
import com.squareup.picasso.Picasso;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.adapters.ab;
import com.tinder.adapters.x;
import com.tinder.base.d;
import com.tinder.e.q;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventNewMatch;
import com.tinder.events.match.EventMatchNewMessage;
import com.tinder.events.match.EventMatchRemoved;
import com.tinder.events.match.EventMatchUpdated;
import com.tinder.events.match.EventMatchesLoaded;
import com.tinder.events.match.EventMatchesUpdateCallComplete;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.i;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ad;
import com.tinder.utils.e;
import com.tinder.utils.v;
import com.tinder.views.CustomDrawerLayout;
import com.tinder.views.DividerItemDecoration;
import com.tinder.views.MatchListLayout;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.tinder.fragments:
//            ap, ao, am, an, 
//            ak, al, at, au, 
//            aq, ar

public final class aj extends d
{

    i c;
    c d;
    x e;
    MatchListLayout f;
    View g;
    View h;
    boolean i;
    boolean j;
    private LinearLayoutManager k;
    private LinearLayout l;
    private ab m;
    private com.tinder.utils.ab n;
    private com.tinder.utils.ab o;
    private View p;
    private String q;
    private View r;
    private LinearLayout s;
    private int t;
    private boolean u;

    public aj()
    {
        q = null;
        i = false;
        j = false;
        u = false;
    }

    public static aj a()
    {
        return new aj();
    }

    static MatchListLayout a(aj aj1)
    {
        return aj1.f;
    }

    static void a(aj aj1, int i1)
    {
        Match match = aj1.e.a(i1);
        if (match == null)
        {
            v.b("Clicked a match, but adapter did not know about it!");
        } else
        {
            match = aj1.c.a(match.getId());
            if (match != null)
            {
                ((q)aj1.getActivity()).a(match, false);
                aj1.a(aj1.j, match);
                if (!match.isTouched())
                {
                    aj1.c.a(match);
                    aj1.e.a(i1, match.clone());
                    if (!aj1.j)
                    {
                        aj1.b();
                        return;
                    }
                }
            }
        }
    }

    static void a(aj aj1, boolean flag)
    {
        com.tinder.sunset.d d1 = com.tinder.sunset.d.a();
        (new StringBuilder("Moments hidden? ")).append(ae.A());
        (new StringBuilder("Moments Enabled? ")).append(ae.B());
        (new StringBuilder("Moments Cached? ")).append(d1.b());
        if (ae.A() || !ae.B() || !d1.b() || flag)
        {
            aj1.f.setShowingMoments(false);
            aj1.p.setVisibility(8);
            return;
        } else
        {
            aj1.f.setShowingMoments(true);
            Button button = (Button)aj1.p.findViewById(0x7f0e0119);
            Button button1 = (Button)aj1.p.findViewById(0x7f0e011a);
            button.setOnClickListener(aj1. new android.view.View.OnClickListener() {

                final aj a;

                public final void onClick(View view)
                {
                    com.tinder.fragments.aj.b(a).setVisibility(8);
                    ae.b.putBoolean("KEY_WARNED_MOMENTS_SUNSET", true).commit();
                }

            
            {
                a = aj.this;
                super();
            }
            });
            button1.setOnClickListener(aj1. new android.view.View.OnClickListener() {

                final aj a;

                public final void onClick(View view)
                {
                    if (a.getActivity() != null)
                    {
                        view = (ActivityMain)a.getActivity();
                        ((ActivityMain) (view)).j.closeDrawer();
                        ActivityMainPagerAdapter activitymainpageradapter = ((ActivityMain) (view)).i;
                        activitymainpageradapter.d.add(com.tinder.adapters.ActivityMainPagerAdapter.ModalType.g);
                        activitymainpageradapter.notifyDataSetChanged();
                        view.t();
                    }
                }

            
            {
                a = aj.this;
                super();
            }
            });
            return;
        }
    }

    private void a(Collection collection)
    {
        if (collection != null)
        {
            collection = collection.iterator();
            boolean flag = false;
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                Match match = (Match)collection.next();
                if (match.getPerson() == null)
                {
                    (new StringBuilder("Match has null person, adding for UI. ")).append(match);
                    c(match);
                }
                match = match.clone();
                if (m.c(match) == -1 && m.a(match) >= 0)
                {
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                c();
                e();
                f.scrollToBeginningOfNewMatchList();
            }
        }
    }

    private void a(boolean flag, Match match)
    {
        (new Handler()).postDelayed(new Runnable(flag, match) {

            final boolean a;
            final Match b;
            final aj c;

            public final void run()
            {
                if (c.getActivity() instanceof ActivityMain)
                {
                    ((ActivityMain)c.getActivity()).s();
                }
                if (a)
                {
                    com.tinder.utils.e.a(new com.tinder.utils.e.b(this) {

                        final _cls12 a;

                        public final void a()
                        {
                            long l1 = (com.tinder.fragments.aj.c(a.c).getItemCount() - 1) + com.tinder.fragments.aj.d(a.c).b.size();
                            Object obj = a.c.c.b();
                            long l2 = com.b.a.d.a(((Iterable) (obj))).a(new at(this)).a();
                            long l3 = com.b.a.d.a(((Iterable) (obj))).a(new au(this)).a();
                            obj = (new SparksEvent("Match.SearchSelect")).put("numMatchesWithMessagesResult", Long.valueOf(l2)).put("numMatchesWithNameResult", Long.valueOf(l3)).put("numResults", Long.valueOf(l1));
                            if (a.b.getPerson() != null)
                            {
                                ((SparksEvent) (obj)).put("otherId", a.b.getPerson().userId);
                            }
                            ((SparksEvent) (obj)).put("matchId", a.b.getId());
                            if (a.b.getName().toLowerCase().startsWith(com.tinder.fragments.aj.e(a.c)))
                            {
                                ((SparksEvent) (obj)).put("from", "name");
                            } else
                            {
                                ((SparksEvent) (obj)).put("from", "message");
                            }
                            ((SparksEvent) (obj)).fire();
                        }

            
            {
                a = _pcls12;
                super();
            }
                    }).a(false);
                }
            }

            
            {
                c = aj.this;
                a = flag;
                b = match;
                super();
            }
        }, 800L);
    }

    static boolean a(aj aj1, Match match)
    {
        return match.getName().toLowerCase().startsWith(aj1.q) || com.b.a.d.a(match.getMessages()).b(new ap(aj1));
    }

    static boolean a(aj aj1, Message message)
    {
        return message.getText().toLowerCase().contains(aj1.q);
    }

    static boolean a(Match match)
    {
        return match.hasMessages();
    }

    static View b(aj aj1)
    {
        return aj1.p;
    }

    static void b(aj aj1, int i1)
    {
        Match match = aj1.m.a(i1);
        if (match == null)
        {
            v.b("Clicked a match, but adapter did not know about it!");
        } else
        {
            match = aj1.c.a(match.getId());
            if (match != null)
            {
                ((q)aj1.getActivity()).a(match, false);
                aj1.a(aj1.j, match);
                if (!match.isTouched())
                {
                    aj1.c.a(match);
                    aj1.m.a(i1, match.clone());
                    if (!aj1.j)
                    {
                        aj1.c();
                        return;
                    }
                }
            }
        }
    }

    private void b(Set set)
    {
        if (set != null && !j)
        {
            e.c = true;
            set = set.iterator();
            boolean flag = false;
            do
            {
                if (!set.hasNext())
                {
                    break;
                }
                Match match = (Match)set.next();
                if (match.getPerson() == null)
                {
                    (new StringBuilder("Match has null person, adding for UI. ")).append(match);
                    c(match);
                }
                match = match.clone();
                if (m.b(match))
                {
                    c();
                }
                if (!e.b.contains(match))
                {
                    int i1 = e.a(match);
                    if (!flag)
                    {
                        if (i1 > 0)
                        {
                            flag = true;
                        }
                        if (f.isShowingEmptyView())
                        {
                            f.hideEmptyView();
                        }
                    }
                } else
                {
                    int j1 = e.b(match);
                    Match match1 = e.a(j1);
                    if (match1.getParsedActivityDate() != match.getParsedActivityDate())
                    {
                        match.getMessages().addAll(match1.getMessages());
                        e.a(j1, match);
                        flag = true;
                    } else
                    {
                        (new StringBuilder("Existing and new activity dates were the same, totally ignoring match: ")).append(match);
                    }
                }
            } while (true);
            set = e;
            set.c = false;
            set.notifyDataSetChanged();
            b();
        }
    }

    static boolean b(Match match)
    {
        return !match.hasMessages();
    }

    static x c(aj aj1)
    {
        return aj1.e;
    }

    private void c(Match match)
    {
        Match match1 = c.a(match.getId());
        if (match1 != null && match1.getPerson() == null)
        {
            v.b("Tried to add a match without a person, and the master cache also doesn't have a person.");
        } else
        if (match1 != null)
        {
            match.setPerson(match1.getPerson());
            return;
        }
    }

    private void c(Set set)
    {
        Iterator iterator = c.g().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Match match = (Match)iterator.next();
            if (!match.hasMessages() && !set.contains(match))
            {
                m.b(match);
            }
        } while (true);
    }

    static ab d(aj aj1)
    {
        return aj1.m;
    }

    private void d(Set set)
    {
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            Match match = ((Match)set.next()).clone();
            int i1 = m.c(match);
            if (!match.hasMessages() && i1 < 0)
            {
                m.a(match.clone());
            } else
            if (i1 >= 0)
            {
                m.a(i1, match.clone());
            }
        } while (true);
    }

    static String e(aj aj1)
    {
        return aj1.q;
    }

    private void e(Set set)
    {
        set = ((Set) (set.toArray()));
        int i1 = set.length - 1;
        while (i1 >= 0) 
        {
            Match match = (Match)set[i1];
            int j1 = m.c(match);
            if (!match.hasMessages() && j1 >= 0 && j1 != i1)
            {
                ab ab1 = m;
                if (j1 < 0 || j1 >= ab1.b.size())
                {
                    v.b((new StringBuilder("Cannot recalculate new match position at ")).append(j1).append(", because that is an invalid index.").toString());
                } else
                {
                    Match match1 = (Match)ab1.b.get(j1);
                    Collections.sort(ab1.b);
                    int k1 = ab1.b.indexOf(match1);
                    if (k1 >= 0 && k1 < ab1.b.size() && k1 != j1)
                    {
                        ab1.notifyItemMoved(j1, k1);
                    }
                }
            }
            i1--;
        }
    }

    static View f(aj aj1)
    {
        return aj1.g;
    }

    private void f()
    {
        ad.a(l, 0.85F);
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public final void onClick(View view)
            {
                ((ActivityMain)a.getActivity()).f();
            }

            
            {
                a = aj.this;
                super();
            }
        });
    }

    private void g()
    {
        if (getActivity() != null && (getActivity() instanceof ActivityMain))
        {
            ((ActivityMain)getActivity()).w();
        }
    }

    private b h()
    {
        return new ao(this);
    }

    private void i()
    {
        if (!i && f.isHeaderVisible())
        {
            i = true;
            f.hideHeader();
        }
    }

    final transient void a(View view, View aview[])
    {
        ArrayList arraylist = new ArrayList(2);
        if (view.getVisibility() == 0 && view.getAlpha() == 1.0F)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                1.0F, 0.0F
            });
            objectanimator.addListener(new AnimatorListenerAdapter(view) {

                final View a;
                final aj b;

                public final void onAnimationEnd(Animator animator)
                {
                    a.setVisibility(8);
                }

            
            {
                b = aj.this;
                a = view;
                super();
            }
            });
            arraylist.add(objectanimator);
        }
        for (int i1 = 0; i1 <= 0; i1++)
        {
            view = aview[0];
            if (view.getVisibility() != 0 || view.getAlpha() == 0.0F)
            {
                ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                    0.0F, 1.0F
                });
                objectanimator1.addListener(new AnimatorListenerAdapter(view) {

                    final View a;
                    final aj b;

                    public final void onAnimationStart(Animator animator)
                    {
                        a.setVisibility(0);
                    }

            
            {
                b = aj.this;
                a = view;
                super();
            }
                });
                arraylist.add(objectanimator1);
            }
        }

        view = new AnimatorSet();
        view.playTogether(arraylist);
        view.setDuration(t);
        view.start();
    }

    public final void a(String s1)
    {
        Set set = c.b();
        if (s1 != null && s1.length() > 0)
        {
            q = s1.toLowerCase();
            set = (Set)com.b.a.d.a(set).a(h()).a(new com.b.a.b._cls2());
            if (set.isEmpty())
            {
                a(((View) (f)), new View[] {
                    h
                });
            } else
            {
                (new StringBuilder("Search query has results: ")).append(set.size());
                if (f.getVisibility() == 8)
                {
                    a(h, new View[] {
                        f
                    });
                }
                List list = (List)com.b.a.d.a(set).a(com.tinder.fragments.am.a()).a(new com.b.a.b._cls1());
                Set set1;
                if (list.isEmpty() && !f.isShowingEmptyView())
                {
                    f.showEmptyView();
                } else
                if (!list.isEmpty() && f.isShowingEmptyView())
                {
                    f.hideEmptyView();
                }
                set1 = (Set)com.b.a.d.a(set).a(com.tinder.fragments.an.a()).a(new com.b.a.b._cls2());
                if (set1.isEmpty())
                {
                    if (!i && !f.isHidingHeader())
                    {
                        i();
                    }
                } else
                if (i && !f.isOpeningHeader())
                {
                    e();
                }
                if (!set.isEmpty() && g.getVisibility() != 8)
                {
                    g.setVisibility(8);
                }
                (new com.tinder.utils.e.b(s1, set) {

                    final String a;
                    final Set b;
                    final aj c;

                    public final void a()
                    {
                        Set set2 = c.c.b();
                        SparksEvent sparksevent = new SparksEvent("Match.Search");
                        sparksevent.put("query", a);
                        sparksevent.put("numMatchesWithMessagesResult", Long.valueOf(com.b.a.d.a(set2).a(new aq(this)).a()));
                        sparksevent.put("numMatchesWithNameResult", Long.valueOf(com.b.a.d.a(set2).a(new ar(this)).a()));
                        sparksevent.put("numResults", Integer.valueOf(b.size()));
                        com.tinder.managers.a.c(sparksevent);
                    }

            
            {
                c = aj.this;
                a = s1;
                b = set;
                super();
            }
                }).a();
                e.a(list);
                a(set1);
            }
        } else
        {
            g.setVisibility(0);
            e.a(c.c());
            a(c.g());
            if (c.a() && u && h.getVisibility() == 0)
            {
                a(h, new View[] {
                    f
                });
            }
        }
        if (e.getItemCount() > 1)
        {
            f.scrollToTopOfMatchList();
        }
        if (m.b.size() > 0)
        {
            e();
            s1 = m;
            if (((ab) (s1)).b.size() <= 0)
            {
                v.b("Cannot invalidate new match position at 0, because that is an invalid index.");
            } else
            {
                s1.notifyItemChanged(0);
            }
            f.scrollToBeginningOfNewMatchList();
        }
    }

    final void a(Set set)
    {
        (new StringBuilder("Applying search query results: ")).append(set.size());
        c(set);
        d(set);
        e(set);
    }

    final void b()
    {
        if (!c.a())
        {
            v.b("Cannot set up match count with a null collection.");
            return;
        } else
        {
            long l1 = c.e();
            f.setMatchMessageCount(l1);
            return;
        }
    }

    final void c()
    {
        if (!c.a())
        {
            v.b("Cannot set up new match count with a null collection.");
            return;
        } else
        {
            long l1 = c.h();
            f.setNewMatchCount(l1);
            return;
        }
    }

    final void d()
    {
        if (getView() != null) goto _L2; else goto _L1
_L1:
        v.b("Not setting view visibility, no view to set.");
_L4:
        return;
_L2:
        if (!u)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!c.a())
        {
            if (f.getVisibility() == 0)
            {
                a(f, new View[] {
                    r
                });
                return;
            } else
            {
                a(s, new View[] {
                    r
                });
                return;
            }
        }
        if (r.getVisibility() == 0)
        {
            a(r, new View[] {
                f
            });
        }
        a(s, new View[] {
            f
        });
        if (!c.f() && !f.isShowingEmptyView())
        {
            f.showEmptyView();
        } else
        if (c.f() && f.isShowingEmptyView())
        {
            f.hideEmptyView();
            g();
        }
        if (c.i())
        {
            break; /* Loop/switch isn't completed */
        }
        i();
_L5:
        if (!c.a() && u)
        {
            a(f, new View[] {
                r
            });
            f();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (k.findFirstCompletelyVisibleItemPosition() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && i && !j)
        {
            e();
        } else
        if (!j)
        {
            i = false;
            if (!f.isHeaderVisible())
            {
                f.showHeader();
            }
        }
        g();
          goto _L5
        if (j) goto _L4; else goto _L6
_L6:
        a(f, new View[] {
            s
        });
        return;
    }

    final void e()
    {
        i = false;
        if (!f.isHeaderVisible())
        {
            f.showHeader();
        }
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public final void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        super.onCreate(bundle);
        if (bundle != null)
        {
            boolean flag;
            if (bundle.getInt("locked") == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag;
            if (bundle.getInt("searching") == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            j = flag;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030057, viewgroup, false);
    }

    public final void onDestroyView()
    {
        d.b(e);
        d.b(this);
        RecyclerView recyclerview = f.getMatchList();
        RecyclerView recyclerview1 = f.getNewMatchList();
        recyclerview.removeOnItemTouchListener(n);
        recyclerview1.removeOnItemTouchListener(o);
        super.onDestroyView();
    }

    public final void onEventMainThread(EventGlobalsLoaded eventglobalsloaded)
    {
        com.tinder.sunset.d.a().a(new Runnable() {

            final aj a;

            public final void run()
            {
                if (a.getView() != null)
                {
                    com.tinder.fragments.aj.a(a, false);
                }
            }

            
            {
                a = aj.this;
                super();
            }
        });
    }

    public final void onEventMainThread(EventNewMatch eventnewmatch)
    {
        eventnewmatch = eventnewmatch.getNewMatch();
        if (eventnewmatch.hasMessages())
        {
            if (eventnewmatch.getPerson() == null)
            {
                (new StringBuilder("Match has null person, adding for UI. ")).append(eventnewmatch);
                c(eventnewmatch);
            }
            eventnewmatch = eventnewmatch.clone();
            if (m.b(eventnewmatch))
            {
                c();
            }
            int i1 = 0;
            if (!j || h().test(eventnewmatch))
            {
                i1 = e.b(eventnewmatch);
                if (i1 > 1)
                {
                    e.a(i1, eventnewmatch);
                    i1 = 1;
                } else
                {
                    e.a(eventnewmatch);
                    i1 = 1;
                }
            }
            b();
            if (i1 != 0 && f.isShowingEmptyView())
            {
                f.hideEmptyView();
            }
        } else
        {
            if (eventnewmatch.getPerson() == null)
            {
                (new StringBuilder("Match has null person, adding for UI. ")).append(eventnewmatch);
                c(eventnewmatch);
            }
            eventnewmatch = eventnewmatch.clone();
            if (!j || h().test(eventnewmatch))
            {
                int j1 = e.b(eventnewmatch);
                if (j1 > 1)
                {
                    m.a(j1, eventnewmatch);
                } else
                {
                    m.a(eventnewmatch);
                    e();
                    f.scrollToBeginningOfNewMatchList();
                }
            }
            if (!j)
            {
                c();
                return;
            }
        }
    }

    public final void onEventMainThread(EventMatchNewMessage eventmatchnewmessage)
    {
        eventmatchnewmessage = eventmatchnewmessage.getMatch().clone();
        if (eventmatchnewmessage.getPerson() == null)
        {
            (new StringBuilder("Match has null person, adding for new Message UI. ")).append(eventmatchnewmessage);
            c(eventmatchnewmessage);
        }
        if (m.b(eventmatchnewmessage) && !j)
        {
            c();
        }
        if (!j)
        {
            b();
        }
        eventmatchnewmessage = new HashSet(e.getItemCount() - 1);
        for (int i1 = 1; i1 < e.getItemCount() - 1; i1++)
        {
            Match match = e.a(i1);
            if (eventmatchnewmessage.contains(match.getId()))
            {
                e.b(i1);
            }
            eventmatchnewmessage.add(match.getId());
        }

    }

    public final void onEventMainThread(EventMatchRemoved eventmatchremoved)
    {
        boolean flag1 = false;
        d.e(eventmatchremoved);
        eventmatchremoved = eventmatchremoved.getMatch();
        x x1 = e;
        int i1 = x1.b.indexOf(eventmatchremoved);
        boolean flag = flag1;
        if (i1 >= 0)
        {
            flag = flag1;
            if (x1.b(i1 + 1) != null)
            {
                flag = true;
            }
        }
        if (flag)
        {
            if (!j)
            {
                b();
            }
            d();
        } else
        if (m.b(eventmatchremoved))
        {
            if (!j)
            {
                c();
            }
            d();
            return;
        }
    }

    public final void onEventMainThread(EventMatchUpdated eventmatchupdated)
    {
        (new StringBuilder("Match updated event!")).append(eventmatchupdated.getUpdatedMatch());
        eventmatchupdated = eventmatchupdated.getUpdatedMatch().clone();
        if (eventmatchupdated.getPerson() == null)
        {
            (new StringBuilder("Match has null person, adding for UI. ")).append(eventmatchupdated);
            c(eventmatchupdated);
        }
        int i1 = e.b(eventmatchupdated);
        if (i1 >= 0)
        {
            e.a(i1, eventmatchupdated);
        } else
        {
            int j1 = m.c(eventmatchupdated);
            if (j1 >= 0)
            {
                m.a(j1, eventmatchupdated);
                return;
            }
        }
    }

    public final void onEventMainThread(EventMatchesLoaded eventmatchesloaded)
    {
        boolean flag1 = true;
        (new StringBuilder("Matches loaded. Freshly parsed matches: ")).append(eventmatchesloaded.getNewMatches().size());
        if (!j)
        {
            if (!c.a() && !eventmatchesloaded.hasMatches())
            {
                d();
                return;
            }
            if (eventmatchesloaded.hasNewMatches())
            {
                a(eventmatchesloaded.getNewMatches());
            }
            if (eventmatchesloaded.hasMessagedMatches())
            {
                b(eventmatchesloaded.getMessagedMatches());
            }
            if (eventmatchesloaded.hasMatches())
            {
                u = true;
                ((ActivityMain)getActivity()).w();
                d();
            }
            int j1 = (e.getItemCount() - 1) + m.b.size();
            int i1 = j1;
            if (j1 != c.j())
            {
                a(c.g());
                b(c.c());
                i1 = (e.getItemCount() - 1) + m.b.size();
            }
            boolean flag;
            if (s.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (r.getVisibility() != 0)
            {
                flag1 = false;
            }
            if ((flag || flag1) && i1 > 0)
            {
                d();
                return;
            }
        }
    }

    public final void onEventMainThread(EventMatchesUpdateCallComplete eventmatchesupdatecallcomplete)
    {
        boolean flag = false;
        if (!u)
        {
            if (c.i())
            {
                a(c.g());
            }
            if (c.f())
            {
                b(c.c());
            }
            int l1 = e.getItemCount();
            int k1 = m.getItemCount();
            eventmatchesupdatecallcomplete = c.b();
            int i1 = 0;
            int j1;
            do
            {
                j1 = ((flag) ? 1 : 0);
                if (i1 >= l1)
                {
                    break;
                }
                Match match = e.a(i1);
                if (match != null && !eventmatchesupdatecallcomplete.contains(match))
                {
                    e.b(i1);
                }
                i1++;
            } while (true);
            while (j1 < k1) 
            {
                Match match1 = m.a(j1);
                if (match1 != null && !eventmatchesupdatecallcomplete.contains(match1))
                {
                    ab ab1 = m;
                    if (j1 >= 0 && j1 < ab1.b.size())
                    {
                        ab1.b.remove(j1);
                        ab1.notifyItemRemoved(j1);
                    }
                }
                j1++;
            }
            if (!u)
            {
                u = true;
                ((ActivityMain)getActivity()).w();
                d();
                return;
            }
        }
    }

    public final void onResume()
    {
        super.onResume();
        if (e.getItemCount() - 1 > 0)
        {
            boolean flag;
            if (k.findFirstCompletelyVisibleItemPosition() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && m.b.size() > 0 && !j && f.isHeaderVisible())
            {
                f.resetHeaderTranslation();
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        boolean flag = true;
        super.onSaveInstanceState(bundle);
        int i1;
        if (i)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        bundle.putInt("locked", i1);
        if (j)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        bundle.putInt("searching", i1);
    }

    public final void onStop()
    {
        Picasso.a(getContext()).a(com/tinder/adapters/x);
        Picasso.a(getContext()).a(com/tinder/adapters/ab);
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f = (MatchListLayout)view.findViewById(0x7f0e018c);
        h = view.findViewById(0x7f0e018b);
        p = view.findViewById(0x7f0e0118);
        bundle = f.getMatchList();
        RecyclerView recyclerview = f.getNewMatchList();
        r = view.findViewById(0x7f0e0186);
        s = (LinearLayout)view.findViewById(0x7f0e0188);
        l = (LinearLayout)view.findViewById(0x7f0e0187);
        t = getResources().getInteger(0x10e0000);
        g = view.findViewById(0x7f0e018d);
        com.tinder.sunset.d.a().a(new Runnable() {

            final aj a;

            public final void run()
            {
                if (a.getView() != null)
                {
                    com.tinder.fragments.aj.a(a, false);
                }
            }

            
            {
                a = aj.this;
                super();
            }
        });
        f();
        n = new com.tinder.utils.ab(getContext(), new com.tinder.fragments.ak(this));
        bundle.addOnItemTouchListener(n);
        o = new com.tinder.utils.ab(getContext(), new al(this));
        recyclerview.addOnItemTouchListener(o);
        k = new LinearLayoutManager(getActivity(), 1, false);
        e = new x(getActivity());
        m = new ab(getActivity());
        DividerItemDecoration divideritemdecoration = new DividerItemDecoration(getContext(), android.support.v4.b.a.a(getContext(), 0x7f020222), true);
        divideritemdecoration.setLeftMargin(0x7f090124);
        bundle.addItemDecoration(divideritemdecoration);
        bundle.setLayoutManager(k);
        bundle.setAdapter(e);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        recyclerview.setAdapter(m);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(view) {

            final View a;
            final aj b;

            public final void onGlobalLayout()
            {
                if (com.tinder.fragments.aj.a(b).getMaximumRequiredTopPadding() == 0)
                {
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    return;
                } else
                {
                    a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }

            
            {
                b = aj.this;
                a = view;
                super();
            }
        });
        d.a(this, false);
    }

    // Unreferenced inner class com/tinder/fragments/aj$2

/* anonymous class */
    final class _cls2 extends AnimatorListenerAdapter
    {

        final aj a;

        public final void onAnimationStart(Animator animator)
        {
            com.tinder.fragments.aj.a(a, true);
            aj.f(a).setVisibility(0);
        }

            
            {
                a = aj.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/aj$3

/* anonymous class */
    final class _cls3 extends AnimatorListenerAdapter
    {

        final aj a;

        public final void onAnimationEnd(Animator animator)
        {
            aj.f(a).setVisibility(8);
            com.tinder.fragments.aj.a(a, false);
        }

            
            {
                a = aj.this;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import com.spotify.mobile.android.spotlets.findfriends.model.ResultModel;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class esj extends ArrayAdapter
    implements esp
{

    public int a;
    public int b;
    public boolean c;
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    private Flags f;
    private View g;
    private final android.view.View.OnClickListener h = new android.view.View.OnClickListener() {

        private esj a;

        public final void onClick(View view1)
        {
            ResultModel resultmodel = (ResultModel)view1.getTag();
            ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(resultmodel.getUri(), ((Checkable)view1).isChecked());
            resultmodel.toggleFollowing();
            int i = ((Integer)view1.getTag(0x7f11004b)).intValue();
            Object obj2 = resultmodel.getUri();
            view1 = resultmodel.getTitle();
            esl esl1 = (esl)dmz.a(esh, esl);
            if (resultmodel.isFollowing())
            {
                Object obj;
                if (esj.a(a).contains(resultmodel))
                {
                    esj.a(a).remove(resultmodel);
                } else
                {
                    esj.b(a).add(resultmodel);
                }
                esl1.a(a);
                obj = obj2;
                if (obj2 == null)
                {
                    obj = "";
                }
                obj2 = view1;
                if (view1 == null)
                {
                    obj2 = "";
                }
                view1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ch);
                view1.a("index", String.valueOf(i));
                view1.a("n_friends", String.valueOf(esl1.c));
                view1.a("n_friends_not_followed", String.valueOf(esl1.d));
                view1.a("uri", ((String) (obj)));
                view1.a("name", ((String) (obj2)));
                view1.a("section", "friends_tab");
                view1.a("is_filtered", String.valueOf(esl1.k));
                view1.a("filtered_size", esl1.a());
                obj = esl1.a;
                fop.a(esl1.b, ViewUri.p, view1);
            } else
            {
                Object obj1;
                if (esj.b(a).contains(resultmodel))
                {
                    esj.b(a).remove(resultmodel);
                } else
                {
                    esj.a(a).add(resultmodel);
                }
                esl1.a(a);
                obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = "";
                }
                obj2 = view1;
                if (view1 == null)
                {
                    obj2 = "";
                }
                view1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ci);
                view1.a("index", String.valueOf(i));
                view1.a("n_friends", String.valueOf(esl1.c));
                view1.a("n_friends_not_followed", String.valueOf(esl1.d));
                view1.a("uri", ((String) (obj1)));
                view1.a("name", ((String) (obj2)));
                view1.a("section", "friends_tab");
                view1.a("is_filtered", String.valueOf(esl1.k));
                view1.a("filtered_size", esl1.a());
                obj1 = esl1.a;
                fop.a(esl1.b, ViewUri.p, view1);
            }
            view1 = a;
            if (resultmodel.isFollowing())
            {
                i = esj.c(a) + 1;
            } else
            {
                i = esj.c(a) - 1;
            }
            esj.a(view1, i);
        }

            
            {
                a = esj.this;
                super();
            }
    };

    public esj(Context context, List list, Flags flags, View view)
    {
        super(context, 0, list);
        f = flags;
        g = view;
        ctz.a(g);
        ctz.a(f);
        ctz.a(d);
        ctz.a(e);
    }

    static int a(esj esj1, int i)
    {
        esj1.b = i;
        return i;
    }

    private ResultModel a(int i)
    {
        return (ResultModel)super.getItem(i - 1);
    }

    static Set a(esj esj1)
    {
        return esj1.e;
    }

    static Set b(esj esj1)
    {
        return esj1.d;
    }

    static int c(esj esj1)
    {
        return esj1.b;
    }

    public final void a(eso eso1)
    {
        notifyDataSetChanged();
    }

    public final void addAll(Collection collection)
    {
        super.addAll(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) 
        {
            ResultModel resultmodel = (ResultModel)iterator.next();
            ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(new eso(resultmodel.getUri(), 0, 0, resultmodel.isFollowing()));
            ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(resultmodel.getUri(), this);
            int i;
            if (resultmodel.isFollowing())
            {
                i = b + 1;
            } else
            {
                i = b;
            }
            b = i;
        }
        a = collection.size();
    }

    public final void clear()
    {
        super.clear();
        b = 0;
    }

    public final int getCount()
    {
        return super.getCount() + 1;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final int getItemViewType(int i)
    {
        switch (i)
        {
        default:
            return 1;

        case 0: // '\0'
            return 0;
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) == 0)
        {
            return g;
        }
        ResultModel resultmodel = a(i);
        String s1 = resultmodel.getTitle();
        String s;
        if (TextUtils.isEmpty(resultmodel.getImage()))
        {
            s = null;
        } else
        {
            s = resultmodel.getImage().trim();
        }
        if (view != g)
        {
            view = (ddi)dds.a(view);
        } else
        {
            view = null;
        }
        if (view == null)
        {
            view = dds.a(getContext(), viewgroup);
            viewgroup = esn.a(getContext());
            view.a(viewgroup);
            view.a(true);
            view.a().setOnClickListener(null);
            viewgroup.setOnClickListener(h);
        } else
        {
            viewgroup = view.b();
        }
        view.a(resultmodel);
        viewgroup.setTag(resultmodel);
        viewgroup.setTag(0x7f11004b, Integer.valueOf(i));
        ((Checkable)viewgroup).setChecked(resultmodel.isFollowing());
        dmz.a(gjj);
        gjj.a(getContext()).b(view.d(), s);
        view.a(s1);
        return view.a();
    }

    public final int getViewTypeCount()
    {
        return 3;
    }
}

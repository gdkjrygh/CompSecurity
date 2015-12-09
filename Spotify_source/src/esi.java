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

public final class esi extends ArrayAdapter
    implements esp
{

    public int a;
    public int b;
    public final Set c = new HashSet();
    public final Set d = new HashSet();
    private Flags e;
    private final gji f;
    private final android.view.View.OnClickListener g = new android.view.View.OnClickListener() {

        private esi a;

        public final void onClick(View view)
        {
            ResultModel resultmodel = (ResultModel)view.getTag();
            ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(resultmodel.getUri(), ((Checkable)view).isChecked());
            resultmodel.toggleFollowing();
            int i = ((Integer)view.getTag(0x7f11004b)).intValue();
            Object obj2 = resultmodel.getUri();
            view = resultmodel.getTitle();
            esl esl1 = (esl)dmz.a(esh, esl);
            if (resultmodel.isFollowing())
            {
                Object obj;
                if (esi.a(a).contains(resultmodel))
                {
                    esi.a(a).remove(resultmodel);
                } else
                {
                    esi.b(a).add(resultmodel);
                }
                esl1.a(a);
                obj = obj2;
                if (obj2 == null)
                {
                    obj = "";
                }
                obj2 = view;
                if (view == null)
                {
                    obj2 = "";
                }
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ch);
                view.a("index", String.valueOf(i));
                view.a("n_friends", String.valueOf(esl1.e));
                view.a("n_friends_not_followed", String.valueOf(esl1.f));
                view.a("uri", ((String) (obj)));
                view.a("name", ((String) (obj2)));
                view.a("section", "featured_tab");
                obj = esl1.a;
                fop.a(esl1.b, ViewUri.p, view);
            } else
            {
                Object obj1;
                if (esi.b(a).contains(resultmodel))
                {
                    esi.b(a).remove(resultmodel);
                } else
                {
                    esi.a(a).add(resultmodel);
                }
                esl1.a(a);
                obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = "";
                }
                obj2 = view;
                if (view == null)
                {
                    obj2 = "";
                }
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ci);
                view.a("index", String.valueOf(i));
                view.a("n_friends", String.valueOf(esl1.e));
                view.a("n_friends_not_followed", String.valueOf(esl1.f));
                view.a("uri", ((String) (obj1)));
                view.a("name", ((String) (obj2)));
                view.a("section", "featured_tab");
                obj1 = esl1.a;
                fop.a(esl1.b, ViewUri.p, view);
            }
            view = a;
            if (resultmodel.isFollowing())
            {
                i = esi.c(a) + 1;
            } else
            {
                i = esi.c(a) - 1;
            }
            esi.a(view, i);
        }

            
            {
                a = esi.this;
                super();
            }
    };

    public esi(Context context, List list, Flags flags)
    {
        super(context, 0, list);
        e = flags;
        ctz.a(e);
        ctz.a(c);
        ctz.a(d);
        dmz.a(gjj);
        f = gjj.a(context);
    }

    static int a(esi esi1, int i)
    {
        esi1.b = i;
        return i;
    }

    static Set a(esi esi1)
    {
        return esi1.d;
    }

    static Set b(esi esi1)
    {
        return esi1.c;
    }

    static int c(esi esi1)
    {
        return esi1.b;
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

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        ResultModel resultmodel = (ResultModel)getItem(i);
        String s1 = resultmodel.getTitle();
        String s;
        if (TextUtils.isEmpty(resultmodel.getImage()))
        {
            s = null;
        } else
        {
            s = resultmodel.getImage().trim();
        }
        view = (ddi)dds.a(view);
        if (view == null)
        {
            view = dds.a(getContext(), viewgroup);
            viewgroup = esn.a(getContext());
            view.a(viewgroup);
            view.a(true);
            view.a().setOnClickListener(null);
            viewgroup.setOnClickListener(g);
        } else
        {
            viewgroup = view.b();
        }
        view.a(resultmodel);
        viewgroup.setTag(resultmodel);
        viewgroup.setTag(0x7f11004b, Integer.valueOf(i));
        ((Checkable)viewgroup).setChecked(resultmodel.isFollowing());
        f.b(view.d(), s);
        view.a(s1);
        return view.a();
    }
}

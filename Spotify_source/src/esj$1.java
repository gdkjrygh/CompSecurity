// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Checkable;
import com.spotify.mobile.android.spotlets.findfriends.model.ResultModel;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Set;

final class ang.Object
    implements android.view.nClickListener
{

    private esj a;

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
            obj2 = view;
            if (view == null)
            {
                obj2 = "";
            }
            view = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.ch);
            view.a("index", String.valueOf(i));
            view.a("n_friends", String.valueOf(esl1.c));
            view.a("n_friends_not_followed", String.valueOf(esl1.d));
            view.a("uri", ((String) (obj)));
            view.a("name", ((String) (obj2)));
            view.a("section", "friends_tab");
            view.a("is_filtered", String.valueOf(esl1.k));
            view.a("filtered_size", esl1.a());
            obj = esl1.a;
            fop.a(esl1.b, ViewUri.p, view);
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
            obj2 = view;
            if (view == null)
            {
                obj2 = "";
            }
            view = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.ci);
            view.a("index", String.valueOf(i));
            view.a("n_friends", String.valueOf(esl1.c));
            view.a("n_friends_not_followed", String.valueOf(esl1.d));
            view.a("uri", ((String) (obj1)));
            view.a("name", ((String) (obj2)));
            view.a("section", "friends_tab");
            view.a("is_filtered", String.valueOf(esl1.k));
            view.a("filtered_size", esl1.a());
            obj1 = esl1.a;
            fop.a(esl1.b, ViewUri.p, view);
        }
        view = a;
        if (resultmodel.isFollowing())
        {
            i = esj.c(a) + 1;
        } else
        {
            i = esj.c(a) - 1;
        }
        esj.a(view, i);
    }

    (esj esj1)
    {
        a = esj1;
        super();
    }
}

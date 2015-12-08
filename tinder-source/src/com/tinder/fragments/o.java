// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.util.SortedList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.base.d;
import com.tinder.d.a;
import com.tinder.e.q;
import com.tinder.e.t;
import com.tinder.enums.UserPhotoSize;
import com.tinder.events.match.EventMatchNewMessage;
import com.tinder.events.match.EventMatchesLoaded;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerNotifications;
import com.tinder.managers.i;
import com.tinder.managers.w;
import com.tinder.managers.z;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;
import com.tinder.views.RoundImageView;
import de.greenrobot.event.c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;

// Referenced classes of package com.tinder.fragments:
//            q, p

public final class o extends d
    implements android.view.View.OnClickListener, x, com.tinder.adapters.z.b, t
{

    private static final SimpleDateFormat i = new SimpleDateFormat("M/d/yy");
    private static String j = null;
    i c;
    z d;
    w e;
    ManagerNotifications f;
    c g;
    a h;
    private String k;
    private String l;
    private LinearLayout m;
    private EditText n;
    private CustomTextView o;
    private com.tinder.adapters.z p;
    private RecyclerView q;
    private RoundImageView r;
    private String s[];
    private Match t;
    private boolean u;

    public o()
    {
    }

    public static o a(Match match)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("arg_match", match);
        match = new o();
        match.setArguments(bundle);
        return match;
    }

    static void a(o o1)
    {
        Object obj = o1.n.getText().toString();
        o1.n.setText(null);
        User user = o1.d.b();
        if (!TextUtils.isEmpty(((String) (obj)).trim()) && user != null)
        {
            long l1 = System.currentTimeMillis();
            obj = new Message(o1.t.getId(), DateUtils.b().format(Long.valueOf(l1)), user.getId(), ((String) (obj)), true, l1);
            ((Message) (obj)).setIsPending(true);
            int j1;
            if (o1.p == null)
            {
                android.support.v4.app.i i1 = o1.getActivity();
                String s1 = o1.l;
                o1.p = new com.tinder.adapters.z(i1, new Message[] {
                    obj
                }, s1, o1);
                o1.q.setAdapter(o1.p);
            } else
            {
                o1.p.a(((Message) (obj)));
            }
            j1 = o1.p.getItemCount();
            o1.q.scrollToPosition(j1 - 1);
            o1.e.a(o1, ((Message) (obj)));
            o1.c();
            return;
        } else
        {
            v.a("message null or blank, not adding");
            return;
        }
    }

    static boolean a(o o1, Match match)
    {
        return match.getId().equals(o1.t.getId());
    }

    public static String b()
    {
        return j;
    }

    private void b(Match match)
    {
        if (p != null)
        {
            ArrayList arraylist = new ArrayList(5);
            Iterator iterator = match.getMessages().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Message message = (Message)iterator.next();
                if (p.b.indexOf(message) == -1)
                {
                    arraylist.add(message);
                }
            } while (true);
            t = match;
            if (!arraylist.isEmpty())
            {
                (new StringBuilder("Adding ")).append(arraylist.size()).append(" messages to adapter");
                p.a(arraylist);
                q.scrollToPosition(p.getItemCount() - 1);
            }
        }
    }

    private void c()
    {
_L2:
        return;
        if (t == null || m == null || getActivity() == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1 = (TextView)m.findViewById(0x7f0e030f);
        TextView textview = (TextView)m.findViewById(0x7f0e0310);
        r = (RoundImageView)m.findViewById(0x7f0e0312);
        r.setOnClickListener(this);
        if (t.hasMessages())
        {
            m.setVisibility(8);
            q.setVisibility(0);
            o.setVisibility(0);
            return;
        }
        if (p != null && p.getItemCount() > 0)
        {
            m.setVisibility(8);
            q.setVisibility(0);
            o.setVisibility(0);
            return;
        }
        q.setVisibility(8);
        m.setVisibility(0);
        o.setVisibility(8);
        obj = d.b();
        if (!t.isSuperlike())
        {
            obj = getString(0x7f060118);
        } else
        if (obj != null && TextUtils.equals(((User) (obj)).getId(), t.getSuperLiker()))
        {
            obj = getString(0x7f0601eb);
        } else
        {
            obj = getString(0x7f0601ec);
        }
        ((TextView) (obj1)).setText(String.format(((String) (obj)), new Object[] {
            k
        }));
        obj = "";
        obj1 = android.text.format.DateUtils.getRelativeTimeSpanString(DateUtils.a().parse(t.getCreatedDate()).getTime());
        obj = obj1;
_L4:
        textview.setText(((CharSequence) (obj)));
        if (t.getPerson() == null) goto _L2; else goto _L3
_L3:
        obj = t.getPerson().profilePhotos;
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        obj = ((ProfilePhoto)((List) (obj)).get(0)).getProcessedPhoto(UserPhotoSize.MED);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        obj = ((ProcessedPhoto) (obj)).imageUrl;
_L5:
        if (obj != null && ((String) (obj)).trim().length() != 0)
        {
            Picasso.a(getActivity()).a(((String) (obj))).a(0x7f02004f).a().a(0x7f090194, 0x7f090194).b().a(this);
            return;
        }
          goto _L2
        ParseException parseexception;
        parseexception;
        v.a("Failed to parse match creation date in order to get the time ago string", parseexception);
          goto _L4
        obj = null;
          goto _L5
    }

    private void d()
    {
        Object obj = c.a(j);
        if (obj != null && ((Match) (obj)).hasMessages())
        {
            t = ((Match) (obj)).clone();
            obj = t.getMessages();
            if (p == null)
            {
                obj = (Message[])((TreeSet) (obj)).toArray(new Message[((TreeSet) (obj)).size()]);
                p = new com.tinder.adapters.z(getActivity(), ((Message []) (obj)), l, this);
                q.setAdapter(p);
            } else
            {
                p.a(((java.util.Collection) (obj)));
                if (!((TreeSet) (obj)).isEmpty())
                {
                    q.scrollToPosition(p.getItemCount() - 1);
                    return;
                }
            }
        }
    }

    static boolean d(Message message)
    {
        return message.isFromMe();
    }

    public final void a()
    {
        ((q)getActivity()).p();
    }

    public final void a(Message message)
    {
        Message message1 = message.clone();
        message1.setViewed(true);
        message1.setIsPending(true);
        if (p != null)
        {
            p.b.remove(message);
            p.a(message1);
        }
        e.a(this, message1);
    }

    public final void b(Message message)
    {
        long l1 = 0L;
        Object obj = c.a(t.getId());
        if (obj != null)
        {
            t = ((Match) (obj)).clone();
        }
        if (t.getPerson() == null)
        {
            v.b("Cannot perform after message-sent actions with a null Person.");
            return;
        }
        b(t);
        String s1 = t.getPerson().userId;
        h.k();
        long l2;
        boolean flag;
        if (t.hasMessages())
        {
            l1 = com.b.a.d.a(t.getMessages()).a(com.tinder.fragments.q.a()).a();
            l2 = (long)t.getMessages().size() - l1;
            SparksEvent sparksevent;
            if (((Message)t.getMessages().last()).isFromMe())
            {
                obj = "self";
            } else
            {
                obj = "other";
            }
        } else
        {
            obj = "none";
            l2 = 0L;
        }
        sparksevent = new SparksEvent("Chat.SendMessage");
        sparksevent.put("otherId", s1);
        sparksevent.put("matchId", t.getId());
        sparksevent.put("message", message.getText());
        sparksevent.put("numMessagesOther", Long.valueOf(l2));
        sparksevent.put("numMessagesMe", Long.valueOf(l1));
        sparksevent.put("lastMessageFrom", obj);
        message = d.b();
        if (message != null)
        {
            flag = TextUtils.equals(message.getId(), t.getSuperLiker());
        } else
        {
            flag = false;
        }
        sparksevent.put("superLike", Boolean.valueOf(flag));
        sparksevent.put("didSuperLike", Boolean.valueOf(t.superLikerIsThem()));
        com.tinder.managers.a.a(sparksevent);
    }

    public final void c(Message message)
    {
        if (u)
        {
            f.b(null, com.tinder.managers.ManagerNotifications.NotificationType.c, null);
        }
        if (p != null)
        {
            com.tinder.adapters.z z1 = p;
            int i1 = z1.b.indexOf(message);
            if (i1 != -1)
            {
                message = ((Message)z1.b.get(i1)).clone();
                message.setIsPending(false);
                message.setIsFailed(true);
                z1.b.updateItemAt(i1, message);
            }
        }
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public final void onBitmapFailed(Drawable drawable)
    {
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        r.setImageBitmap(bitmap);
    }

    public final void onClick(View view)
    {
        (new StringBuilder("view=")).append(view);
        switch (view.getId())
        {
        default:
            v.a("view not recognized");
            return;

        case 2131624722: 
            a();
            break;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        t = (Match)getArguments().getParcelable("arg_match");
        if (t == null)
        {
            v.b("Match was null but we're trying to chat. Going back.");
            ((q)getActivity()).r();
        } else
        {
            j = t.getId();
        }
        s = getActivity().getResources().getStringArray(0x7f070002);
        i.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        u = false;
        if (t == null)
        {
            v.a("Match was not set, going back from conversation.");
            ((q)getActivity()).r();
        }
        viewgroup = layoutinflater.inflate(0x7f0300a7, viewgroup, false);
        layoutinflater = (TextView)viewgroup.findViewById(0x7f0e0313);
        m = (LinearLayout)viewgroup.findViewById(0x7f0e030d);
        bundle = (ImageView)viewgroup.findViewById(0x7f0e0318);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final o a;

            public final void onClick(View view)
            {
                com.tinder.fragments.o.a(a);
            }

            
            {
                a = o.this;
                super();
            }
        });
        bundle.requestFocus();
        n = (CustomEditText)viewgroup.findViewById(0x7f0e0317);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            n.setBackground(null);
        } else
        {
            n.setBackgroundDrawable(null);
        }
        q = (RecyclerView)viewgroup.findViewById(0x7f0e0314);
        bundle = new LinearLayoutManager(getActivity());
        bundle.setStackFromEnd(true);
        q.setLayoutManager(bundle);
        q.setHasFixedSize(true);
        k = t.getName();
        l = t.getThumbnailUrl();
        if (!t.hasMessageFromMe())
        {
            layoutinflater.setText(s[(int)Math.floor(Math.random() * (double)s.length)]);
        }
        layoutinflater = t.getDraftMsg();
        if (layoutinflater != null)
        {
            n.append(layoutinflater);
        }
        o = (CustomTextView)viewgroup.findViewById(0x7f0e0315);
        layoutinflater = d.b();
        if (!t.isSuperlike())
        {
            layoutinflater = getString(0x7f060119);
        } else
        if (layoutinflater != null && TextUtils.equals(layoutinflater.getId(), t.getSuperLiker()))
        {
            layoutinflater = getString(0x7f06011b);
        } else
        {
            layoutinflater = getString(0x7f06011a);
        }
        bundle = i.format(Long.valueOf(DateUtils.a(t.getCreatedDate())));
        o.setText(String.format(layoutinflater, new Object[] {
            t.getName(), bundle
        }));
        d();
        g.a(this, false);
        return viewgroup;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        g.b(this);
        u = true;
        ad.a(n.getWindowToken(), getActivity());
    }

    public final void onEventMainThread(EventMatchNewMessage eventmatchnewmessage)
    {
        if (!eventmatchnewmessage.getMatch().getId().equals(j))
        {
            return;
        } else
        {
            b(eventmatchnewmessage.getMatch().clone());
            return;
        }
    }

    public final void onEventMainThread(EventMatchesLoaded eventmatchesloaded)
    {
        if (p == null)
        {
            d();
            if (m != null && m.getVisibility() == 0)
            {
                c();
            }
        } else
        if (eventmatchesloaded.hasMessagedMatches())
        {
            eventmatchesloaded = com.b.a.d.a(eventmatchesloaded.getMessagedMatches()).a(new p(this)).b();
            if (eventmatchesloaded.c())
            {
                b((Match)eventmatchesloaded.b());
                if (m != null && m.getVisibility() == 0)
                {
                    c();
                    return;
                }
            }
        }
    }

    public final void onPause()
    {
        super.onPause();
        j = null;
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    public final void onResume()
    {
        super.onResume();
        c.k();
        f.b(j);
        if (!c.b().contains(t))
        {
            v.a("Match cache does not contain match, going back from conversation.");
            ((q)getActivity()).r();
        } else
        {
            c();
        }
        if (q != null && p != null)
        {
            q.scrollToPosition(p.getItemCount() - 1);
        }
        n.setText("");
        n.append(t.getDraftMsg());
        n.requestFocus();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        String s1 = n.getText().toString();
        t.setDraftMsg(s1);
        i i1 = c;
        String s2 = t.getId();
        Match match = i1.a(s2);
        if (match != null)
        {
            match.setDraftMsg(s1);
            (new com.tinder.managers.i._cls9(i1)).execute(new String[] {
                s2, s1
            });
        }
        n.setText("");
        super.onSaveInstanceState(bundle);
    }

}

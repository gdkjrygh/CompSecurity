// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import java.util.List;

public class yQ extends yY
    implements HU.a, mh.a, zz.a
{

    final ImageButton l;
    Friend m;
    private final FriendManager r;
    private final ProgressBar s;
    private final TextView t;
    private yP u;

    public yQ(View view)
    {
        FriendManager friendmanager = FriendManager.e();
        HU.a();
        this(view, friendmanager);
    }

    private yQ(View view, FriendManager friendmanager)
    {
        super(view);
        r = friendmanager;
        l = (ImageButton)view.findViewById(0x7f0d04d3);
        s = (ProgressBar)view.findViewById(0x7f0d04d4);
        t = (TextView)view.findViewById(0x7f0d04d1);
        l.setOnClickListener(new android.view.View.OnClickListener() {

            private yQ a;

            public final void onClick(View view1)
            {
                view1 = a;
                Friend friend;
                boolean flag;
                if (!a.l.isSelected())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view1.a(false, flag, true);
                friend = a.m;
                if (a.l.isSelected())
                {
                    view1 = FriendAction.ADD;
                } else
                {
                    view1 = FriendAction.DELETE;
                }
                view1 = new mh(friend, view1);
                view1.mAddSourceType = a.s();
                view1.mAnalyticsContext = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.STORIES;
                view1.mFriendActionCompleteCallback = a;
                view1 = view1.a();
                view1.mActionMethod = hT.CHECKMARK;
                view1.execute();
            }

            
            {
                a = yQ.this;
                super();
            }
        });
        view = new zz(this, n, 0x7f0d04cf, 0x7f0d04d0);
        p.add(view);
    }

    public final void a(FriendAction friendaction, boolean flag, String s1)
    {
        if (flag && friendaction == FriendAction.DELETE)
        {
            m.mSuggestionState = com.snapchat.android.model.Friend.SuggestState.EXISTS;
        }
        a(((zo) (u)));
    }

    public final void a(zo zo)
    {
        boolean flag = false;
        u = (yP)zo;
        m = u.a;
        if (m.mIsVerifiedSearchResult)
        {
            String s1 = m.q();
            t.setText(s1);
            TextView textview = t;
            byte byte0;
            if (TextUtils.isEmpty(s1))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            textview.setVisibility(byte0);
        } else
        {
            t.setVisibility(8);
        }
        if (m.mHasBeenAddedAsFriend || r.c(m.g()))
        {
            flag = true;
        }
        HU.a(m, flag, this);
        super.a(zo);
    }

    public final void a(boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3 = false;
        Object obj = l;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageButton) (obj)).setVisibility(i);
        l.setSelected(flag1);
        obj = s;
        if (flag2)
        {
            i = ((flag3) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i);
    }

    protected com.snapchat.android.model.Friend.AddSourceType s()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AddFriendSourceType.USERNAME.getAddSourceType();
    }

    public final String t()
    {
        return m.c();
    }

    public final String u()
    {
        return m.g();
    }

    public final boolean v()
    {
        return false;
    }

    public final boolean w()
    {
        return m.f();
    }
}

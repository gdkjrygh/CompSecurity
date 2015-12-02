// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.common.time.a;
import com.facebook.common.w.n;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.messages.threads.ui.name.g;
import com.facebook.orca.compose.ComposeAttachmentContainer;
import com.facebook.orca.photos.picking.PickMediaOperation;
import com.facebook.ui.media.attachments.d;
import com.google.common.a.ax;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.broadcast:
//            n, o, p, k, 
//            l, m, q

public class ComposeBroadcastFragment extends FbFragment
    implements b
{

    private View Z;
    private InputMethodManager a;
    private ImageButton aa;
    private ComposeAttachmentContainer ab;
    private d b;
    private a c;
    private c d;
    private com.facebook.orca.broadcast.q e;
    private View f;
    private TextView g;
    private ThreadNameView h;
    private EditText i;

    public ComposeBroadcastFragment()
    {
    }

    private boolean O()
    {
        q q1 = q();
        if ((PickMediaOperation)q1.a("pickMediaOperation") != null)
        {
            return true;
        }
        if (!q1.c())
        {
            return false;
        } else
        {
            PickMediaOperation pickmediaoperation = new PickMediaOperation();
            ad ad1 = q1.a();
            ad1.a(pickmediaoperation, "pickMediaOperation");
            ad1.a();
            q1.b();
            return true;
        }
    }

    static com.facebook.orca.broadcast.q a(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.e;
    }

    static boolean b(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.O();
    }

    static ComposeAttachmentContainer c(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.ab;
    }

    static View d(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.Z;
    }

    static EditText e(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.i;
    }

    static InputMethodManager f(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.a;
    }

    static d g(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.b;
    }

    static a h(ComposeBroadcastFragment composebroadcastfragment)
    {
        return composebroadcastfragment.c;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(k.compose_broadcast_fragment, viewgroup, false);
    }

    public Animation a(int j, boolean flag, int i1)
    {
        Animation animation;
        if (flag)
        {
            animation = AnimationUtils.loadAnimation(l(), com.facebook.b.in_from_left);
        } else
        {
            animation = AnimationUtils.loadAnimation(l(), com.facebook.b.out_to_left);
        }
        animation.setAnimationListener(new com.facebook.orca.broadcast.n(this, flag));
        return animation;
    }

    public void a()
    {
        h.setVisibility(8);
        g.setVisibility(0);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = t.a(n());
        b = (d)bundle.a(com/facebook/ui/media/attachments/d);
        a = (InputMethodManager)bundle.a(android/view/inputmethod/InputMethodManager);
        c = (a)bundle.a(com/facebook/common/time/a);
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (fragment instanceof PickMediaOperation)
        {
            ((PickMediaOperation)fragment).a(new o(this));
        }
    }

    public void a(c c1)
    {
        d = c1;
    }

    public void a(com.facebook.orca.broadcast.q q1)
    {
        e = q1;
    }

    public void a(es es1)
    {
        if (es1 == null || es1.isEmpty())
        {
            a();
            return;
        } else
        {
            es1 = new g(false, null, es.a(ax.a(es1, new p(this))));
            h.setData(es1);
            g.setVisibility(8);
            h.setVisibility(0);
            return;
        }
    }

    public boolean b()
    {
        return n.c(c()) && ab.b();
    }

    public String c()
    {
        return i.getText().toString();
    }

    public List d()
    {
        return ab.getMediaResources();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        f = d(i.add_friends_button);
        g = (TextView)d(i.add_friedns_button_empty_label);
        h = (ThreadNameView)d(i.add_friedns_button_label);
        i = (EditText)d(i.composer_text);
        aa = (ImageButton)d(i.add_photo_button);
        ab = (ComposeAttachmentContainer)d(i.compose_attachment_container);
        Z = d(i.compose_attachment_divider);
        f.setOnClickListener(new com.facebook.orca.broadcast.k(this));
        aa.setOnClickListener(new l(this));
        ab.setListener(new m(this));
    }
}

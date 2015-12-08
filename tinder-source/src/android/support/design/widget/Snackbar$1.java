// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Message;
import android.support.v4.view.af;
import android.support.v4.view.x;
import android.support.v4.widget.u;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.design.widget:
//            Snackbar, f, a

static final class Layout.e
    implements android.os.lback
{

    public final boolean handleMessage(Message message)
    {
        boolean flag1;
        flag1 = false;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            message = (Snackbar)message.obj;
            if (((Snackbar) (message)).b.getParent() == null)
            {
                android.view.ayoutParams ayoutparams = ((Snackbar) (message)).b.getLayoutParams();
                if (ayoutparams instanceof Layout.e)
                {
                    nListener nlistener = new <init>(message);
                    nlistener.f = f.a(0.1F);
                    nlistener.g = f.a(0.6F);
                    nlistener.d = 0;
                    nlistener.c = new <init>(message);
                    ((Layout.e)ayoutparams).a(nlistener);
                }
                ((Snackbar) (message)).a.addView(((Snackbar) (message)).b);
            }
            if (x.E(((Snackbar) (message)).b))
            {
                message.a();
            } else
            {
                ((Snackbar) (message)).b.setOnLayoutChangeListener(new <init>(message));
            }
            return true;

        case 1: // '\001'
            message = (Snackbar)message.obj;
            break;
        }
        if (((Snackbar) (message)).b.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        Object obj = ((Snackbar) (message)).b.getLayoutParams();
        boolean flag = flag1;
        if (obj instanceof Layout.e)
        {
            obj = ((Layout.e)obj).a;
            flag = flag1;
            if (obj instanceof f)
            {
                obj = (f)obj;
                int i;
                if (((f) (obj)).b != null)
                {
                    i = ((f) (obj)).b.a;
                } else
                {
                    i = 0;
                }
                flag = flag1;
                if (i != 0)
                {
                    flag = true;
                }
            }
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        message.b();
_L5:
        return true;
_L3:
        if (android.os.ON.SDK_INT >= 14)
        {
            x.s(((Snackbar) (message)).b).c(((Snackbar) (message)).b.getHeight()).a(a.b).a(250L).a(new <init>(message)).b();
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(((Snackbar) (message)).b.getContext(), android.support.design.r_out);
            animation.setInterpolator(a.b);
            animation.setDuration(250L);
            animation.setAnimationListener(new <init>(message));
            ((Snackbar) (message)).b.startAnimation(animation);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    Layout.e()
    {
    }
}

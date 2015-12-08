// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.miniplayer.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import ero;
import eth;
import etl;
import etm;
import etq;
import etz;
import eua;
import eub;
import euc;
import eud;
import ezj;
import ho;
import java.util.Iterator;
import java.util.List;

public class MiniPlayerPageView extends LinearLayout
    implements etm
{

    public PlayerTrack a;
    public MiniPlayerDisplayRule b;
    public eub c;
    private final boolean d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ConnectView h;
    private TextView i;
    private etq j;
    private View k;
    private etl l;
    private ero m;

    public MiniPlayerPageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new MiniPlayerDisplayRule();
        c = new etz(this);
        d = context.getResources().getBoolean(0x7f0a0006);
    }

    private View a(com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item item)
    {
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.values().length];
                try
                {
                    a[com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[item.ordinal()])
        {
        default:
            throw new IllegalStateException("Unknown item type");

        case 1: // '\001'
            return h;

        case 2: // '\002'
            return g;

        case 3: // '\003'
            return i;
        }
    }

    public static TextView a(MiniPlayerPageView miniplayerpageview)
    {
        return miniplayerpageview.e;
    }

    private static void a(View view, int i1)
    {
        view.setTag(0x7f1100b5, Integer.valueOf(i1));
        view.setVisibility(8);
    }

    static PlayerTrack b(MiniPlayerPageView miniplayerpageview)
    {
        return miniplayerpageview.a;
    }

    private static void b(View view, int i1)
    {
        view.setTag(0x7f1100b5, Integer.valueOf(i1));
        view.setVisibility(0);
    }

    static eub c(MiniPlayerPageView miniplayerpageview)
    {
        return miniplayerpageview.c;
    }

    public static TextView d(MiniPlayerPageView miniplayerpageview)
    {
        return miniplayerpageview.f;
    }

    public final void a()
    {
        View view;
        View view1;
        if (j == null)
        {
            return;
        }
        view = null;
        if (j.a())
        {
            view = a(j.b());
        }
        if (view == null)
        {
            a(new MiniPlayerDisplayRule());
            return;
        }
        view1 = k;
        if (view1 == null || view1.equals(view)) goto _L2; else goto _L1
_L1:
        a(view1, -1);
        b(view, 1);
_L4:
        k = view;
        return;
_L2:
        if (view1 == null)
        {
            b(view, 1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(MiniPlayerDisplayRule miniplayerdisplayrule)
    {
        boolean flag;
        flag = false;
        b = miniplayerdisplayrule;
        if (d) goto _L2; else goto _L1
_L1:
        Iterator iterator = miniplayerdisplayrule.a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (((eth)((ho)iterator.next()).b).a != -1) goto _L6; else goto _L5
_L5:
        int i1 = 1;
_L11:
        View aview[];
        if (i1 != 0 && !(c instanceof eua))
        {
            a(((View) (f)), -1);
            c = new eua(this);
        } else
        if (c instanceof eua)
        {
            b(f, -1);
            c = new etz(this);
        }
        e.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            private MiniPlayerPageView a;

            public final boolean onPreDraw()
            {
                MiniPlayerPageView.a(a).getViewTreeObserver().removeOnPreDrawListener(this);
                Object obj = MiniPlayerPageView.a(a);
                Object obj1 = MiniPlayerPageView.c(a).b(MiniPlayerPageView.b(a));
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[] {
                    1.0F, 0.0F
                });
                objectanimator.setDuration(150L);
                objectanimator.addListener(new etx._cls1(((View) (obj)), ((String) (obj1))));
                obj = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[] {
                    0.0F, 1.0F
                });
                ((ObjectAnimator) (obj)).setDuration(150L);
                obj1 = new AnimatorSet();
                ((AnimatorSet) (obj1)).playSequentially(new Animator[] {
                    objectanimator, obj
                });
                ((Animator) (obj1)).start();
                return true;
            }

            
            {
                a = MiniPlayerPageView.this;
                super();
            }
        });
_L2:
        aview = new View[3];
        aview[0] = h;
        aview[1] = g;
        aview[2] = i;
        j = new etq(miniplayerdisplayrule.a);
        if (j.a())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        i1 = 0;
        while (i1 < 3) 
        {
            a(aview[i1], 1);
            i1++;
        }
          goto _L7
_L4:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
        k = a(j.b());
        for (i1 = ((flag) ? 1 : 0); i1 < 3; i1++)
        {
            miniplayerdisplayrule = aview[i1];
            if (miniplayerdisplayrule != k)
            {
                a(((View) (miniplayerdisplayrule)), 1);
            }
        }

        b(k, 1);
_L9:
        return;
_L7:
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a(etl etl1)
    {
        if (l != null)
        {
            l.b.remove(this);
        }
        l = etl1;
        if (l != null)
        {
            etl1 = l;
            etl1.b.add(this);
            a(new MiniPlayerDisplayRule());
            a(etl1.a);
        }
    }

    public final ezj b()
    {
        return m;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        e = (TextView)findViewById(0x7f11026e);
        f = (TextView)findViewById(0x7f1102ef);
        g = (TextView)findViewById(0x7f110496);
        h = (ConnectView)findViewById(0x7f110328);
        i = (TextView)findViewById(0x7f110497);
        LayoutTransition layouttransition = getLayoutTransition();
        layouttransition.setAnimateParentHierarchy(false);
        layouttransition.setStartDelay(2, 0L);
        layouttransition.setStartDelay(1, 0L);
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofInt("top", new int[] {
                0, 1
            }), PropertyValuesHolder.ofInt("bottom", new int[] {
                0, 1
            })
        });
        layouttransition.setAnimator(0, objectanimator);
        layouttransition.setAnimator(1, objectanimator.clone());
        objectanimator = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] {
                0.0F, 1.0F
            }), PropertyValuesHolder.ofFloat(View.ALPHA, new float[] {
                1.0F, 0.0F
            })
        });
        objectanimator.addListener(new eud(false));
        objectanimator.addListener(new euc((byte)0));
        layouttransition.setAnimator(3, objectanimator);
        objectanimator = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] {
                1.0F, 0.0F
            }), PropertyValuesHolder.ofFloat(View.ALPHA, new float[] {
                0.0F, 1.0F
            })
        });
        objectanimator.addListener(new eud(true));
        objectanimator.addListener(new euc((byte)0));
        layouttransition.setAnimator(2, objectanimator);
        setLayerType(2, null);
        m = new ero(h, 0);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.facebook.a.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.adapters.i;
import com.tinder.adapters.j;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.d;
import com.tinder.cards.CardStackLayout;
import com.tinder.e.a;
import com.tinder.e.ac;
import com.tinder.e.aj;
import com.tinder.e.al;
import com.tinder.e.ao;
import com.tinder.e.au;
import com.tinder.e.l;
import com.tinder.e.n;
import com.tinder.e.q;
import com.tinder.e.r;
import com.tinder.e.u;
import com.tinder.enums.Blend;
import com.tinder.enums.ConfirmationType;
import com.tinder.enums.PaywallPerk;
import com.tinder.enums.RateType;
import com.tinder.enums.SwipeType;
import com.tinder.enums.UserPhotoSize;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventNewMatch;
import com.tinder.events.EventRecsAdded;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.ag;
import com.tinder.managers.e;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.model.Career;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.GlobalConfig;
import com.tinder.model.Match;
import com.tinder.model.Paywall;
import com.tinder.model.Person;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.views.CustomTextView;
import com.tinder.views.LikeMeter;
import com.tinder.views.LoadingView;
import com.tinder.views.RecCard;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            by, FragmentAnchoredPopup, bx, bm, 
//            bv, ac

public final class bd extends d
    implements android.view.View.OnClickListener, com.tinder.cards.CardStackLayout.a, a, com.tinder.e.d, l, r, u, by
{

    public static boolean c;
    private static boolean w;
    private ImageButton A;
    private ImageButton B;
    private ImageButton C;
    private ImageButton D;
    private LikeMeter E;
    private LikeMeter F;
    private RelativeLayout G;
    private com.tinder.c.ae H;
    private ViewGroup I;
    private i J;
    private RecCard K;
    private User L;
    private com.tinder.cards.d M;
    private SwipeType N;
    private LoadingView O;
    private Context P;
    private com.tinder.c.l Q;
    private com.tinder.c.l R;
    private int S;
    private int T;
    private float U;
    private float V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private int ag;
    private ac ah;
    private bv ai;
    private CustomTextView aj;
    private Handler ak;
    int d;
    y e;
    com.tinder.managers.i f;
    ab g;
    z h;
    ManagerLiveRail i;
    ae j;
    com.tinder.managers.d k;
    aa l;
    ag m;
    c n;
    e o;
    CardStackLayout p;
    RelativeLayout q;
    boolean r;
    private View s;
    private View t;
    private boolean u;
    private boolean v;
    private View x;
    private View y;
    private ImageButton z;

    public bd()
    {
        u = false;
        v = false;
        S = 0;
        U = 1.0F;
        V = 1.0F;
    }

    static boolean A(bd bd1)
    {
        bd1.W = true;
        return true;
    }

    static void B(bd bd1)
    {
        bd1.x();
    }

    static boolean C(bd bd1)
    {
        bd1.af = false;
        return false;
    }

    static SwipeType D(bd bd1)
    {
        return bd1.N;
    }

    static Context E(bd bd1)
    {
        return bd1.P;
    }

    static int a(bd bd1, int i1)
    {
        bd1.ag = i1;
        return i1;
    }

    private static AnimatorSet a(View view, float f1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
            f1, 1.0F
        });
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
            f1, 1.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, view
        });
        animatorset.setInterpolator(new OvershootInterpolator(4F));
        animatorset.setDuration(100L);
        return animatorset;
    }

    static User a(bd bd1, User user)
    {
        bd1.L = user;
        return user;
    }

    private void a(View view)
    {
        View view1;
        if (Y)
        {
            view1 = s;
        } else
        {
            view1 = t;
        }
        q = (RelativeLayout)(RelativeLayout)view1;
        if (Y)
        {
            if (!w)
            {
                y.setVisibility(0);
            }
            b(view);
        }
        if (Y)
        {
            s.setVisibility(0);
            t.setVisibility(8);
            return;
        } else
        {
            t.setVisibility(0);
            s.setVisibility(8);
            return;
        }
    }

    private void a(SwipeType swipetype)
    {
label0:
        {
            V = 1.0F;
            U = 1.0F;
            S = 0;
            if (K != null)
            {
                K.onPoppedOffStack(swipetype);
            }
            o();
            swipetype = J;
            if (!((i) (swipetype)).a.isEmpty())
            {
                ((i) (swipetype)).a.remove(0);
                swipetype.notifyDataSetChanged();
            }
            if (J.getCount() == 0)
            {
                if (!g.e)
                {
                    break label0;
                }
                m();
            }
            return;
        }
        l();
    }

    static void a(bd bd1, View view)
    {
        bd1.b(view);
    }

    static void a(bd bd1, SwipeType swipetype)
    {
        bd1.a(swipetype);
    }

    static void a(bd bd1, User user, RecCard reccard)
    {
        user = user.getPhotos();
        if (user.size() > 0)
        {
            int i1 = 0;
            if (bd1.S < user.size())
            {
                i1 = bd1.S;
            }
            bd1 = ((ProfilePhoto)user.get(i1)).getProcessedPhoto(com.tinder.utils.ad.a(bd1.getActivity()));
            if (bd1 != null)
            {
                bd1 = ((ProcessedPhoto) (bd1)).imageUrl;
            } else
            {
                bd1 = null;
            }
        } else
        {
            bd1 = null;
        }
        if (bd1 != null)
        {
            reccard.setImageUrl(bd1);
        }
    }

    private void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = ((User)list.next()).getMainPhoto();
            if (obj != null)
            {
                obj = ((ProfilePhoto) (obj)).getProcessedPhoto(com.tinder.utils.ad.a((Activity)getContext()));
                if (obj != null)
                {
                    Picasso.a(getActivity()).a(((ProcessedPhoto) (obj)).imageUrl).c();
                }
            }
        } while (true);
    }

    private void a(boolean flag, int i1)
    {
        v();
        Object obj = (FragmentAnchoredPopup)((ActivityMain)getActivity()).b("superlike_reminder");
        if (K != null && K.getRec() != null)
        {
            bx bx1 = new bx(K.getRec());
            if (getActivity() == null || ((FragmentAnchoredPopup) (obj)).getActivity() == null)
            {
                com.tinder.utils.v.b("Cannot configure a dialog when the recomendation fragment does not have an activity");
            } else
            {
                bx1.b = ((FragmentAnchoredPopup) (obj)).getActivity();
                bx1.a = ((FragmentAnchoredPopup) (obj));
                bx1.a.a(0x7f0e012f, com.tinder.fragments.FragmentAnchoredPopup.Strategy.a, new Object[] {
                    this
                });
                bx1.a.a(bx1.a.getResources().getColor(0x7f0d0113));
                Object obj1 = bx1.a.b(0x7f0e012a);
                if (obj1 != null)
                {
                    ((View) (obj1)).setVisibility(8);
                }
                obj1 = bx1.a.b(0x7f0e012d);
                if (obj1 != null)
                {
                    ((View) (obj1)).setPadding(0, 0, 0, 0);
                }
                if (bx1.d != null)
                {
                    obj1 = String.format(bx1.b.getResources().getString(0x7f0601ea), new Object[] {
                        bx1.d.getName()
                    });
                    String s1 = String.format(bx1.b.getResources().getString(0x7f0601e7), new Object[] {
                        bx1.d.getName()
                    });
                    View view = LayoutInflater.from(bx1.a.getActivity()).inflate(0x7f030051, bx1.a.s, false);
                    ((TextView)view.findViewById(0x7f0e016c)).setText(((CharSequence) (obj1)));
                    ((TextView)view.findViewById(0x7f0e016e)).setText(s1);
                    bx1.a.setCenterView(view);
                }
                obj1 = LayoutInflater.from(bx1.a.getActivity()).inflate(0x7f030050, q, false);
                ((View) (obj1)).findViewById(0x7f0e016b).setOnClickListener(new bx._cls1(bx1));
                ((View) (obj1)).findViewById(0x7f0e016a).setOnClickListener(new bx._cls2(bx1));
                bx1.a.setBottomView(((View) (obj1)));
                obj1 = (ImageButton)bx1.a.b(0x7f0e0132);
                if (obj1 != null)
                {
                    ((ImageButton) (obj1)).setImageDrawable(android.support.v4.b.a.a(bx1.b, 0x7f0201ae));
                }
                StringBuilder stringbuilder = new StringBuilder("passport button null?:");
                boolean flag1;
                if (obj1 == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                stringbuilder.append(flag1);
            }
            bx1.c = new com.tinder.e.f(flag, i1) {

                final boolean a;
                final int b;
                final bd c;

                public final void a()
                {
                    if (com.tinder.fragments.bd.c(c) != null && !a)
                    {
                        com.tinder.fragments.bd.e(c).a();
                    }
                    SparksEvent sparksevent = new SparksEvent("SuperLikeTutorial.Select");
                    sparksevent.put("from", Integer.valueOf(b));
                    sparksevent.put("action", Integer.valueOf(1));
                    com.tinder.managers.a.a(sparksevent);
                }

                public final void b()
                {
                    SparksEvent sparksevent;
                    if (a)
                    {
                        bd.B(c);
                        c.a(RateType.SUPERLIKE);
                    } else
                    {
                        bd.B(c);
                        bd.b(c, a);
                    }
                    sparksevent = new SparksEvent("SuperLikeTutorial.Select");
                    sparksevent.put("from", Integer.valueOf(b));
                    sparksevent.put("action", Integer.valueOf(2));
                    com.tinder.managers.a.a(sparksevent);
                }

            
            {
                c = bd.this;
                a = flag;
                b = i1;
                super();
            }
            };
            obj.t = new FragmentAnchoredPopup.a(flag) {

                final boolean a;
                final bd b;

                public final void a()
                {
                    if (!a && com.tinder.fragments.bd.c(b) != null)
                    {
                        com.tinder.fragments.bd.e(b).a();
                    }
                }

            
            {
                b = bd.this;
                a = flag;
                super();
            }
            };
            obj.p = new Runnable() {

                final bd a;

                public final void run()
                {
                    com.tinder.fragments.bd.a(a, a.getView());
                }

            
            {
                a = bd.this;
                super();
            }
            };
            ((FragmentAnchoredPopup) (obj)).a();
        }
        m.a("super_like_action", new aj() {

            final bd a;

            public final void a()
            {
                ae ae1 = a.j;
                com.tinder.managers.ae.a(true);
            }

            
            {
                a = bd.this;
                super();
            }
        });
        obj = new SparksEvent("SuperLikeTutorial.View");
        ((SparksEvent) (obj)).put("from", Integer.valueOf(i1));
        com.tinder.managers.a.a(((SparksEvent) (obj)));
    }

    static boolean a(bd bd1)
    {
        return bd1.z();
    }

    static boolean a(bd bd1, boolean flag)
    {
        bd1.ab = flag;
        return flag;
    }

    static int b(bd bd1, int i1)
    {
        bd1.S = i1;
        return i1;
    }

    static CardStackLayout b(bd bd1)
    {
        return bd1.p;
    }

    private void b(View view)
    {
label0:
        {
label1:
            {
                if (view != null)
                {
                    view = view.findViewById(0x7f0e0134);
                    if (view != null)
                    {
                        if (w)
                        {
                            view.setVisibility(8);
                            x.setVisibility(0);
                        } else
                        {
                            view.setVisibility(0);
                        }
                    }
                }
                if (w && !ac)
                {
                    view = g.d();
                    if (K == null || view == null)
                    {
                        break label0;
                    }
                    (new StringBuilder("isBrand:")).append(view.isBrand());
                    if (!K.canBeSuperLiked())
                    {
                        break label1;
                    }
                    v();
                }
                return;
            }
            w();
            return;
        }
        w();
    }

    static void b(bd bd1, boolean flag)
    {
        bd1.g(flag);
    }

    static RecCard c(bd bd1)
    {
        return bd1.K;
    }

    static void d(bd bd1)
    {
        bd1.e(false);
    }

    private void d(boolean flag)
    {
        if (Y && com.tinder.managers.ae.a() || Y && !com.tinder.managers.ae.a() && flag)
        {
            G.setEnabled(flag);
            C.setEnabled(flag);
        }
    }

    static i e(bd bd1)
    {
        return bd1.J;
    }

    private void e(boolean flag)
    {
        Object obj;
        boolean flag1;
        if (!z())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        W = false;
        ae = ab;
        ab = false;
        (new StringBuilder("lastRecWasSuperlike?")).append(ab);
        if (K != null && flag1)
        {
            User user = K.getRec();
            if (user != null)
            {
                String s1 = K.getRecId();
                SparksEvent sparksevent;
                int i1;
                boolean flag2;
                boolean flag3;
                if (flag)
                {
                    obj = "BUTTON";
                } else
                {
                    obj = "SWIPE";
                }
                flag2 = user.isRecAndPassporting();
                flag3 = K.getRec().isSuperLike();
                i1 = com.tinder.managers.ab.c(com.tinder.managers.ae.C()).source;
                sparksevent = new SparksEvent("Recs.Rate");
                sparksevent.put("didSuperLike", Boolean.valueOf(flag3));
                sparksevent.put("superLike", Boolean.valueOf(ab));
                sparksevent.put("otherId", s1);
                sparksevent.put("method", obj);
                sparksevent.put("fromMore", Boolean.valueOf(W));
                sparksevent.put("like", Boolean.valueOf(false));
                sparksevent.put("userTraveling", Boolean.valueOf(e.b()));
                sparksevent.put("recTraveling", Boolean.valueOf(flag2));
                sparksevent.put("blend", Integer.valueOf(i1));
                o.a(s1, sparksevent);
                user.getCareer().appendAnalyticsInfo(sparksevent);
                if (user.getConnections() != null)
                {
                    obj = user.getConnections();
                    sparksevent.put("firstDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(1)));
                    sparksevent.put("secondDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(2)));
                }
                com.tinder.managers.a.a(sparksevent);
                g.a(s1, null);
            }
            W = false;
        }
        if (Y && flag1)
        {
            u();
        }
        if (flag)
        {
            obj = SwipeType.PASS_BUTTON;
        } else
        {
            obj = SwipeType.PASS_SWIPE;
        }
        a(((SwipeType) (obj)));
        W = false;
    }

    static void f(bd bd1)
    {
        bd1.f(false);
    }

    private void f(boolean flag)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        if (!z())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ae = ab;
        ab = false;
        (new StringBuilder("lastRecWasSuperlike? ")).append(ab);
        W = false;
        obj = g;
        if (((ab) (obj)).g == 0 && ((ab) (obj)).a() > 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 && flag1)
        {
            if (K != null)
            {
                J.a();
                X = false;
                if (Y)
                {
                    F.setPercentFull(0.0F);
                    F.postDelayed(new Runnable() {

                        final bd a;

                        public final void run()
                        {
                            if (a.getActivity() != null && (a.getActivity() instanceof Paywall))
                            {
                                ((Paywall)a.getActivity()).launchSwipeLimitRoadblock(com.tinder.fragments.bd.c(a).getRecId());
                            }
                        }

            
            {
                a = bd.this;
                super();
            }
                    }, 200L);
                    return;
                } else
                {
                    E.setPercentFull(0.0F);
                    E.postDelayed(new Runnable() {

                        final bd a;

                        public final void run()
                        {
                            if (a.getActivity() != null && (a.getActivity() instanceof Paywall))
                            {
                                ((Paywall)a.getActivity()).launchSwipeLimitRoadblock(com.tinder.fragments.bd.c(a).getRecId());
                            }
                        }

            
            {
                a = bd.this;
                super();
            }
                    }, 200L);
                    return;
                }
            } else
            {
                com.tinder.utils.v.b("Card current is null - can't show Roadblock");
                return;
            }
        }
        if (K != null && flag1)
        {
            User user = K.getRec();
            String s1 = K.getRecId();
            boolean flag3 = K.getRec().isSuperLike();
            SparksEvent sparksevent;
            int i1;
            if (flag)
            {
                obj = "BUTTON";
            } else
            {
                obj = "SWIPE";
            }
            i1 = com.tinder.managers.ab.c(com.tinder.managers.ae.C()).source;
            sparksevent = new SparksEvent("Recs.Rate");
            sparksevent.put("didSuperLike", Boolean.valueOf(flag3));
            sparksevent.put("superLike", Boolean.valueOf(ab));
            sparksevent.put("otherId", s1);
            sparksevent.put("method", obj);
            sparksevent.put("fromMore", Boolean.valueOf(W));
            sparksevent.put("like", Boolean.valueOf(true));
            sparksevent.put("userTraveling", Boolean.valueOf(e.b()));
            sparksevent.put("recTraveling", Boolean.valueOf(user.isRecAndPassporting()));
            sparksevent.put("blend", Integer.valueOf(i1));
            o.a(s1, sparksevent);
            user.getCareer().appendAnalyticsInfo(sparksevent);
            if (user.getConnections() != null)
            {
                obj = user.getConnections();
                sparksevent.put("firstDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(1)));
                sparksevent.put("secondDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(2)));
            }
            com.tinder.managers.a.a(sparksevent);
            g.a(s1, this);
        }
        if (flag1 && Y)
        {
            u();
        }
        if (flag)
        {
            obj = SwipeType.LIKE_BUTTON;
        } else
        {
            obj = SwipeType.LIKE_SWIPE;
        }
        a(((SwipeType) (obj)));
        W = false;
    }

    private void g(boolean flag)
    {
        ae = ab;
        if (K != null)
        {
            L = K.getRec();
            com.tinder.cards.d d1;
            if (com.tinder.cards.d.b(K))
            {
                d1 = M;
            } else
            {
                d1 = com.tinder.cards.d.a(K);
            }
            M = d1;
        }
        if (!g.i.isOutOfSuperlikes()) goto _L2; else goto _L1
_L1:
        ab = ae;
        v();
        J.a();
        r();
_L4:
        X = false;
        W = false;
        return;
_L2:
        if (!flag)
        {
            x();
        }
        ab = true;
        if (K != null)
        {
            User user = K.getRec();
            K.post(new Runnable(flag, user) {

                final boolean a;
                final User b;
                final bd c;

                public final void run()
                {
                    String s1 = com.tinder.fragments.bd.c(c).getRecId();
                    ab ab1 = c.g;
                    al al = new al(this, s1) {

                        final String a;
                        final _cls6 b;

                        public final void a()
                        {
                            com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                            (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                            com.tinder.fragments.bd.l(b.c);
                            b.c.k.e();
                        }

                        public final void a(Match match)
                        {
                            b.c.n.c(new EventNewMatch(match));
                        }

                        public final void a(SuperlikeStatus superlikestatus)
                        {
                            Object obj;
                            Object obj1;
                            int i1;
                            boolean flag;
                            if (b.a)
                            {
                                obj = "BUTTON";
                            } else
                            {
                                obj = "SWIPE";
                            }
                            flag = com.tinder.fragments.bd.c(b.c).getRec().isSuperLike();
                            obj1 = b.c.j;
                            i1 = com.tinder.managers.ab.c(com.tinder.managers.ae.C()).source;
                            obj1 = new SparksEvent("Recs.Rate");
                            ((SparksEvent) (obj1)).put("didSuperLike", Boolean.valueOf(flag));
                            ((SparksEvent) (obj1)).put("superLike", Boolean.valueOf(bd.g(b.c)));
                            ((SparksEvent) (obj1)).put("otherId", a);
                            ((SparksEvent) (obj1)).put("method", obj);
                            ((SparksEvent) (obj1)).put("fromMore", Boolean.valueOf(bd.h(b.c)));
                            ((SparksEvent) (obj1)).put("like", Boolean.valueOf(true));
                            ((SparksEvent) (obj1)).put("userTraveling", Boolean.valueOf(b.c.e.b()));
                            b.c.o.a(a, ((SparksEvent) (obj1)));
                            ((SparksEvent) (obj1)).put("blend", Integer.valueOf(i1));
                            if (b.b != null)
                            {
                                ((SparksEvent) (obj1)).put("recTraveling", Boolean.valueOf(b.b.isRecAndPassporting()));
                                obj = b.b.getConnections();
                                if (obj != null)
                                {
                                    ((SparksEvent) (obj1)).put("firstDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(1)));
                                    ((SparksEvent) (obj1)).put("secondDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(2)));
                                }
                            }
                            com.tinder.managers.a.a(((SparksEvent) (obj1)));
                            if (com.tinder.fragments.bd.i(b.c))
                            {
                                if (com.tinder.fragments.bd.j(b.c))
                                {
                                    bd.k(b.c);
                                }
                                bd bd1 = b.c;
                                if (b.a)
                                {
                                    obj = SwipeType.SUPER_LIKE_BUTTON;
                                } else
                                {
                                    obj = SwipeType.SUPER_LIKE_SWIPE;
                                }
                                com.tinder.fragments.bd.a(bd1, ((SwipeType) (obj)));
                                com.tinder.fragments.bd.a(b.c, superlikestatus.numRemaining);
                                com.tinder.fragments.bd.l(b.c);
                            }
                        }

                        public final void a(User user)
                        {
                            com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                            (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                            if (com.tinder.fragments.bd.i(b.c))
                            {
                                if (user != null)
                                {
                                    Toast.makeText(b.c.getActivity(), b.c.getString(0x7f0601e3, new Object[] {
                                        user.getName()
                                    }), 0).show();
                                }
                                if (com.tinder.fragments.bd.c(b.c) != null)
                                {
                                    if (com.tinder.fragments.bd.c(b.c).getRecId().equals(a))
                                    {
                                        com.tinder.fragments.bd.e(b.c).a();
                                    } else
                                    {
                                        user = b.c.g;
                                        User user1 = b.b;
                                        if (((ab) (user)).a.size() > 2)
                                        {
                                            ((ab) (user)).a.add(2, user1);
                                        } else
                                        {
                                            ((ab) (user)).a.add(user1);
                                        }
                                    }
                                }
                                com.tinder.fragments.bd.l(b.c);
                                b.c.a(false);
                            }
                        }

                        public final void b()
                        {
                            com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                            (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                            if (com.tinder.fragments.bd.c(b.c) != null)
                            {
                                com.tinder.fragments.bd.e(b.c).a();
                            }
                            com.tinder.fragments.bd.l(b.c);
                            b.c.d();
                        }

                        public final void b(SuperlikeStatus superlikestatus)
                        {
                            com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                            (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                            if (com.tinder.fragments.bd.i(b.c))
                            {
                                com.tinder.fragments.bd.a(b.c, superlikestatus.numRemaining);
                                com.tinder.fragments.bd.e(b.c).a();
                                com.tinder.fragments.bd.n(b.c);
                            }
                        }

            
            {
                b = _pcls6;
                a = s1;
                super();
            }
                    };
                    ab1.n.g(s1);
                    Object obj;
                    if (ab1.a.size() > 0)
                    {
                        obj = (User)ab1.a.getFirst();
                        if (obj != null && ((User) (obj)).getId().equals(s1))
                        {
                            User user1 = ab1.b(s1);
                            obj = user1;
                            if (user1 != null)
                            {
                                ab1.f();
                                obj = user1;
                            }
                        } else
                        {
                            obj = null;
                        }
                    } else
                    {
                        obj = null;
                    }
                    obj = new com.tinder.a.d(1, String.format(ab1.m.O, new Object[] {
                        s1
                    }), new JSONObject(), new com.tinder.managers.ab._cls2(ab1, ((User) (obj)), al, s1), new com.tinder.managers.ab._cls3(ab1, al, ((User) (obj)), s1), com.tinder.managers.d.b());
                    obj.j = new com.android.volley.c(20000, 1, 1.0F);
                    ManagerApp.b().a(((Request) (obj)));
                }

            
            {
                c = bd.this;
                a = flag;
                b = user;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean g(bd bd1)
    {
        return bd1.ab;
    }

    static boolean h(bd bd1)
    {
        return bd1.W;
    }

    static boolean i(bd bd1)
    {
        return bd1.s();
    }

    static boolean j(bd bd1)
    {
        return bd1.Y;
    }

    static void k(bd bd1)
    {
        bd1.u();
    }

    static void l(bd bd1)
    {
        bd1.v();
    }

    static boolean m(bd bd1)
    {
        return bd1.ae;
    }

    static void n(bd bd1)
    {
        bd1.r();
    }

    static User o(bd bd1)
    {
        return bd1.L;
    }

    private void p()
    {
        if (Y)
        {
            com.tinder.utils.a.a(F, 0.7F, 200L, 200L);
            com.tinder.utils.a.a(D, 0.7F, 200L, 200L);
            if (B != null)
            {
                B.clearAnimation();
            }
            if (w)
            {
                if (y != null)
                {
                    y.clearAnimation();
                }
                com.tinder.utils.a.a(x, 0.7F, 200L, 200L);
            } else
            {
                if (x != null)
                {
                    x.clearAnimation();
                }
                com.tinder.utils.a.a(y, 0.7F, 200L, 200L);
            }
            com.tinder.utils.a.a(C, 0.7F, 200L, 200L);
            return;
        }
        com.tinder.utils.a.a(E, 0.7F, 200L, 200L);
        com.tinder.utils.a.a(A, 0.7F, 200L, 200L);
        if (y != null)
        {
            y.clearAnimation();
        }
        if (x != null)
        {
            x.clearAnimation();
        }
        if (C != null)
        {
            C.clearAnimation();
        }
        com.tinder.utils.a.a(B, 0.7F, 200L, 200L);
    }

    static boolean p(bd bd1)
    {
        bd1.X = false;
        return false;
    }

    private void q()
    {
        if (Y)
        {
            a(D, V).start();
            V = 1.0F;
            a(F, U).start();
            U = 1.0F;
            return;
        } else
        {
            a(A, V).start();
            V = 1.0F;
            a(E, U).start();
            U = 1.0F;
            return;
        }
    }

    static void q(bd bd1)
    {
        if (bd1.s())
        {
            Toast.makeText(bd1.getActivity(), 0x7f0601f4, 1).show();
        }
    }

    private void r()
    {
        if (getActivity() != null && K != null && K.getRec() != null)
        {
            ((ActivitySignedInBase)getActivity()).a(K.getRec(), S, new com.tinder.c.ak.a() {

                final bd a;

                public final void a()
                {
                    ((Paywall)a.getActivity()).launchPlusSubscriptionPaywall(4, PaywallPerk.SUPER_LIKE);
                }

            
            {
                a = bd.this;
                super();
            }
            }, new android.content.DialogInterface.OnDismissListener() {

                final bd a;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                }

            
            {
                a = bd.this;
                super();
            }
            });
        }
    }

    static void r(bd bd1)
    {
        bd1.d(true);
    }

    static ImageButton s(bd bd1)
    {
        return bd1.C;
    }

    private boolean s()
    {
        return getActivity() != null && !getActivity().isFinishing();
    }

    private void t()
    {
        if (Y)
        {
            C.setRotation(0.0F);
            d(false);
        }
        L = null;
    }

    static void t(bd bd1)
    {
        bd1.t();
    }

    static Handler u(bd bd1)
    {
        return bd1.ak;
    }

    private void u()
    {
        if (K != null)
        {
            L = K.getRec();
            com.tinder.cards.d d1;
            if (com.tinder.cards.d.b(K))
            {
                d1 = M;
            } else
            {
                d1 = com.tinder.cards.d.a(K);
            }
            M = d1;
            d(true);
        }
    }

    static LikeMeter v(bd bd1)
    {
        return bd1.F;
    }

    private void v()
    {
        if (!ac)
        {
            z.setEnabled(true);
            x.setEnabled(true);
        }
    }

    static LikeMeter w(bd bd1)
    {
        return bd1.E;
    }

    private void w()
    {
        if (!ac)
        {
            z.setEnabled(false);
            x.setEnabled(false);
        }
    }

    static CustomTextView x(bd bd1)
    {
        return bd1.aj;
    }

    private void x()
    {
        ad = true;
        (new Handler()).postDelayed(new Runnable() {

            final bd a;

            public final void run()
            {
                com.tinder.fragments.ac ac1 = ((ActivityMain)a.getActivity()).i.b;
                if (ac1 != null && !ac1.z && !ac1.z)
                {
                    ac1.z = true;
                    ac1.y.setAlpha(0.0F);
                    ac1.y.animate().alpha(1.0F).setDuration(200L).setStartDelay(300L).setListener(new ac._cls12(ac1)).start();
                    ac1.A = com.tinder.utils.a.a();
                    ac1.A.c(100D);
                    ac1.A.a(com.facebook.a.f.b(13D, 17D));
                    ac1.A.a(new ac._cls13(ac1));
                    ac1.x.setPivotX(ac1.x.getWidth());
                    ac1.x.setPivotY(0.0F);
                    ac1.A.a(0.0D);
                    ac1.A.b(1.0D);
                }
            }

            
            {
                a = bd.this;
                super();
            }
        }, 200L);
        ViewGroup viewgroup = (ViewGroup)getView().findViewById(0x7f0e024e);
        viewgroup.bringChildToFront(q);
        ViewGroup viewgroup1 = I;
        float f1 = -com.tinder.utils.ad.b() / 4;
        android.support.v4.view.b.a a1 = new android.support.v4.view.b.a();
        ag = g.i.numRemaining;
        int i1 = ag;
        aj.setText(String.valueOf(ag));
        AnimatorSet animatorset = new AnimatorSet();
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setDuration(380L);
        valueanimator.setIntValues(new int[] {
            0, 1
        });
        valueanimator.setInterpolator(a1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(viewgroup1, f1) {

            final View a;
            final float b;
            final bd c;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                float f2 = valueanimator3.getAnimatedFraction();
                a.setTranslationY(b * f2);
                com.tinder.utils.ad.c(a, 1.0F + 0.4F * f2);
                bd.x(c).setAlpha(f2);
            }

            
            {
                c = bd.this;
                a = view;
                b = f1;
                super();
            }
        });
        ValueAnimator valueanimator1 = new ValueAnimator();
        valueanimator1.setDuration(320L);
        valueanimator1.setInterpolator(a1);
        valueanimator1.setIntValues(new int[] {
            0, 1
        });
        valueanimator1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(viewgroup1, String.valueOf(i1 - 1)) {

            boolean a;
            final View b;
            final String c;
            final bd d;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                float f2 = valueanimator3.getAnimatedFraction();
                b.setRotationY(f2 * 180F);
                if (!a && f2 >= 0.5F)
                {
                    bd.x(d).setRotationY(180F);
                    bd.x(d).setText(c);
                    a = true;
                }
            }

            
            {
                d = bd.this;
                b = view;
                c = s1;
                super();
            }
        });
        Object obj = com.tinder.utils.a.a();
        ((com.facebook.a.e) (obj)).c(100D);
        ((com.facebook.a.e) (obj)).a(com.facebook.a.f.b(20D, 23D));
        ((com.facebook.a.e) (obj)).a(0.75D);
        ((com.facebook.a.e) (obj)).a(new com.facebook.a.d() {

            final bd a;

            public final void onSpringAtRest(com.facebook.a.e e1)
            {
                com.tinder.fragments.bd.z(a);
            }

            public final void onSpringUpdate(com.facebook.a.e e1)
            {
                com.tinder.utils.ad.c(com.tinder.fragments.bd.y(a), (float)e1.d.a);
            }

            
            {
                a = bd.this;
                super();
            }
        });
        ValueAnimator valueanimator2 = new ValueAnimator();
        valueanimator2.setIntValues(new int[] {
            0, 1
        });
        valueanimator2.setStartDelay(60L);
        valueanimator2.addListener(new au(((com.facebook.a.e) (obj))) {

            final com.facebook.a.e a;
            final bd b;

            public final void onAnimationStart(Animator animator)
            {
                a.b(1.0D);
            }

            
            {
                b = bd.this;
                a = e1;
                super();
            }
        });
        obj = new ValueAnimator();
        ((ValueAnimator) (obj)).setIntValues(new int[] {
            0, 1
        });
        ((ValueAnimator) (obj)).setDuration(100L);
        ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(valueanimator2) {

            final ValueAnimator a;
            final bd b;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                com.tinder.utils.ad.c(com.tinder.fragments.bd.y(b), com.tinder.utils.o.a(valueanimator3.getAnimatedFraction(), 0.0F, 1.0F, 1.0F, 0.75F));
                a.start();
            }

            
            {
                b = bd.this;
                a = valueanimator;
                super();
            }
        });
        valueanimator2 = new ValueAnimator();
        valueanimator2.setInterpolator(a1);
        valueanimator2.setIntValues(new int[] {
            0, 1
        });
        valueanimator2.setDuration(300L);
        valueanimator2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(viewgroup1, f1, ((ValueAnimator) (obj))) {

            boolean a;
            final View b;
            final float c;
            final ValueAnimator d;
            final bd e;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                float f2 = valueanimator3.getAnimatedFraction();
                b.setTranslationY(c - c * f2);
                bd.x(e).setAlpha(1.0F - f2);
                com.tinder.utils.ad.c(b, (1.0F - f2) * 0.4F + 1.0F);
                if (!a && f2 >= 0.9F)
                {
                    a = true;
                    d.start();
                }
            }

            
            {
                e = bd.this;
                b = view;
                c = f1;
                d = valueanimator;
                super();
            }
        });
        valueanimator2.addListener(new au(viewgroup1, viewgroup) {

            final View a;
            final ViewGroup b;
            final bd c;

            public final void onAnimationEnd(Animator animator)
            {
                a.setRotationY(0.0F);
                bd.x(c).setRotationY(0.0F);
                b.bringChildToFront(bd.b(c));
            }

            
            {
                c = bd.this;
                a = view;
                b = viewgroup;
                super();
            }
        });
        animatorset.playSequentially(new Animator[] {
            valueanimator, valueanimator1, valueanimator2
        });
        animatorset.start();
    }

    static View y(bd bd1)
    {
        return bd1.x;
    }

    private void y()
    {
        if (!af)
        {
            af = true;
            if (g.d() != null && K != null)
            {
                c = true;
                Object obj = com.tinder.utils.ad.a(K.getImageView());
                int j2 = com.tinder.utils.ad.c(ManagerApp.c());
                int k2 = ((Point) (obj)).y;
                int i2 = getResources().getDimensionPixelSize(0x7f090076);
                int l1 = getResources().getDimensionPixelOffset(0x7f090176);
                Point point;
                User user;
                int i1;
                int j1;
                int k1;
                if (getActivity() != null)
                {
                    i1 = com.tinder.utils.ad.c(getActivity());
                } else
                {
                    i1 = 0;
                }
                if (getActivity() != null)
                {
                    j1 = (int)com.tinder.utils.ad.a(1.0F, getActivity());
                } else
                {
                    j1 = 0;
                }
                k1 = j1;
                if (w)
                {
                    k1 = 0;
                    l1 = 0;
                    i2 = 0;
                }
                if (com.tinder.utils.ad.d())
                {
                    j1 = i1;
                } else
                {
                    j1 = 0;
                }
                d = j1 + (k1 + (l1 + (i2 + i1)));
                i1 = d;
                j1 = K.getCardWidth();
                k1 = (int)com.tinder.utils.ad.a(0.5F, getActivity());
                l1 = K.getCardHeight();
                point = com.tinder.utils.ad.a(K.getSuperLikeStar());
                user = K.getRec();
                if (ah == null)
                {
                    ah = new ac() {

                        final bd a;

                        public final void a()
                        {
                            User user1 = a.g.d();
                            if (com.tinder.fragments.bd.c(a) != null && user1 != null && user1.isSuperLike())
                            {
                                com.tinder.fragments.bd.c(a).getSuperLikeStar().setAlpha(0.0F);
                            }
                        }

                        public final void a(int l2)
                        {
                            bd.b(a, l2);
                            if (com.tinder.fragments.bd.c(a) != null && com.tinder.fragments.bd.c(a).getRec() != null)
                            {
                                com.tinder.fragments.bd.a(a, com.tinder.fragments.bd.c(a).getRec(), com.tinder.fragments.bd.c(a));
                            }
                        }

                        public final void a(RateType ratetype)
                        {
                            bd.A(a);
                            if (a.getView() != null)
                            {
                                com.tinder.fragments.bd.u(a).postDelayed(new Runnable(this, ratetype) {

                                    final RateType a;
                                    final _cls31 b;

                                    public final void run()
                                    {
                                        b.a.a(a);
                                        if (a.equals(RateType.SUPERLIKE))
                                        {
                                            bd.B(b.a);
                                        }
                                    }

            
            {
                b = _pcls31;
                a = ratetype;
                super();
            }
                                }, 375L);
                            }
                        }

                        public final void b()
                        {
                            bd.C(a);
                            if (com.tinder.fragments.bd.c(a) != null)
                            {
                                User user1 = com.tinder.fragments.bd.c(a).getRec();
                                if (user1 != null && user1.isSuperLike())
                                {
                                    com.tinder.fragments.bd.c(a).getSuperLikeStar().animate().alpha(1.0F).start();
                                }
                            }
                        }

            
            {
                a = bd.this;
                super();
            }
                    };
                }
                obj = com.tinder.fragments.bm.a(user, ah, S, ((Point) (obj)).x, k2 - i1, j1 - k1, l1, point.x, point.y - j2);
                if (isResumed())
                {
                    ((bm) (obj)).show(getChildFragmentManager(), "fvp");
                    return;
                }
            }
        }
    }

    private boolean z()
    {
        return K != null && K.getCardMode() == com.tinder.views.RecCard.CardMode.VIDEO_AD;
    }

    static boolean z(bd bd1)
    {
        bd1.ad = false;
        return false;
    }

    public final void a()
    {
label0:
        {
            K = null;
            J = new i();
            LinkedList linkedlist = g.a;
            a(((List) (linkedlist)));
            if (linkedlist == null || linkedlist.isEmpty())
            {
                ((ActivityMain)P).j();
            } else
            {
                J.a = new ArrayList(linkedlist);
                p.setAdapter(J);
                p.setVisibility(0);
            }
            if (Y)
            {
                if (L == null)
                {
                    break label0;
                }
                d(true);
            }
            return;
        }
        t();
    }

    public final void a(int i1)
    {
        if (com.tinder.managers.ae.u())
        {
            float f1;
            float f2;
            com.facebook.a.e e1;
            if (Y)
            {
                f1 = F.getPercentFull();
            } else
            {
                f1 = E.getPercentFull();
            }
            f2 = (float)i1 / 100F;
            e1 = com.tinder.utils.a.a();
            e1.a(com.facebook.a.f.a(68D, 4D));
            e1.a(new com.facebook.a.d() {

                final bd a;

                public final void onSpringUpdate(com.facebook.a.e e2)
                {
                    if (com.tinder.fragments.bd.j(a))
                    {
                        com.tinder.fragments.bd.v(a).setPercentFull((float)e2.d.a);
                        return;
                    } else
                    {
                        bd.w(a).setPercentFull((float)e2.d.a);
                        return;
                    }
                }

            
            {
                a = bd.this;
                super();
            }
            });
            e1.a(f1);
            e1.b(f2);
        }
    }

    public final void a(int i1, boolean flag)
    {
        if (i1 == 0)
        {
            ((ActivityMain)P).j();
        }
        (new StringBuilder("total count ")).append(i1).append(" isFirstLayout ").append(flag);
    }

    public final void a(com.tinder.cards.a a1)
    {
        if (K != null)
        {
            K.resetPosition();
            y();
        }
    }

    public final void a(com.tinder.cards.a a1, float f1, float f2, float f3, float f4, boolean flag)
    {
        p.a(f1);
        boolean flag1;
        if (f3 < 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        f1 = com.tinder.utils.o.a(f1, 0.0F, 1.0F, 1.0F, 1.07F);
        if (flag1)
        {
            V = f1;
            if (Y)
            {
                com.tinder.utils.ad.c(D, f1);
                return;
            } else
            {
                com.tinder.utils.ad.c(A, f1);
                return;
            }
        }
        U = f1;
        if (Y)
        {
            com.tinder.utils.ad.c(F, f1);
            return;
        } else
        {
            com.tinder.utils.ad.c(E, f1);
            return;
        }
    }

    public final void a(com.tinder.cards.a a1, boolean flag)
    {
        if (!af)
        {
            if (com.tinder.cards.d.b(a1))
            {
                a1 = M;
            } else
            {
                a1 = com.tinder.cards.d.a(a1);
            }
            M = a1;
            q();
            if (!z() && !flag && !ae.a.getBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_LEFT", false))
            {
                if (K != null)
                {
                    a1 = K.getRec();
                    if (a1 != null)
                    {
                        R = new com.tinder.c.l(getActivity(), ConfirmationType.DRAGGING_LEFT, a1.getName(), new android.view.View.OnClickListener() {

                            final bd a;

                            public final void onClick(View view)
                            {
                                com.tinder.fragments.bd.d(a);
                            }

            
            {
                a = bd.this;
                super();
            }
                        }, new android.view.View.OnClickListener() {

                            final bd a;

                            public final void onClick(View view)
                            {
                                if (com.tinder.fragments.bd.c(a) != null)
                                {
                                    com.tinder.fragments.bd.e(a).a();
                                }
                            }

            
            {
                a = bd.this;
                super();
            }
                        }, new android.content.DialogInterface.OnKeyListener() {

                            final bd a;

                            public final boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
                            {
                                if (i1 == 4 && com.tinder.fragments.bd.c(a) != null)
                                {
                                    com.tinder.fragments.bd.e(a).a();
                                    return false;
                                } else
                                {
                                    return true;
                                }
                            }

            
            {
                a = bd.this;
                super();
            }
                        });
                        R.show();
                    }
                    ae.b.putBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_LEFT", true);
                    ae.b.commit();
                    return;
                }
            } else
            {
                e(flag);
                return;
            }
        }
    }

    public final void a(RateType ratetype)
    {
        if (K != null && !K.isMoving())
        {
            X = true;
            K.animateTouchlessSwipe(ratetype, new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final bd a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    bd.b(a).a(valueanimator.getAnimatedFraction());
                }

            
            {
                a = bd.this;
                super();
            }
            });
        }
    }

    public final void a(Match match)
    {
        (new StringBuilder("match=")).append(match);
        ((q)getActivity()).a(match, false);
        com.tinder.utils.ad.c(H);
    }

    public final void a(boolean flag)
    {
        if (p.getVisibility() == 8 || p.getChildCount() == 0 || flag)
        {
            a();
            p.setVisibility(0);
            O.setVisibility(8);
            O.cancelAllAnimations();
            if (Y && !com.tinder.managers.ae.a())
            {
                d(true);
            } else
            if (!Y)
            {
                B.setEnabled(true);
                B.setOnClickListener(this);
            }
            if (Y)
            {
                D.setEnabled(true);
                F.setEnabled(true);
            } else
            {
                A.setEnabled(true);
                E.setEnabled(true);
            }
        }
        if (com.tinder.managers.ae.u())
        {
            if (Y)
            {
                F.setPercentFullInt(g.g);
            } else
            {
                E.setPercentFullInt(g.g);
            }
        }
        b(getView());
        T = 0;
        v = false;
        u = false;
    }

    public final void b()
    {
        (new StringBuilder("mLastSwipeWasSuperlike was ")).append(ab);
        if (ab)
        {
            d(false);
            g.a(L, new ao() {

                final bd a;

                public final void a()
                {
                    (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(a));
                    bd.p(a);
                    com.tinder.fragments.bd.q(a);
                }

                public final void a(User user)
                {
                    a.k.a(1, new n(this, user) {

                        final User a;
                        final _cls7 b;

                        public final void a()
                        {
                            b.a.g.a(a, new ao(this) {

                                final _cls1 a;

                                public final void a()
                                {
                                    bd.p(a.b.a);
                                    com.tinder.fragments.bd.q(a.b.a);
                                }

                                public final void a(User user)
                                {
                                    bd.p(a.b.a);
                                    com.tinder.fragments.bd.q(a.b.a);
                                }

                                public final void a(User user, SuperlikeStatus superlikestatus)
                                {
                                    com.tinder.fragments.bd.a(a.b.a, user);
                                    com.tinder.fragments.bd.a(a.b.a, bd.m(a.b.a));
                                    a.b.a.g.a.add(0, user);
                                    com.tinder.fragments.bd.a(a.b.a, superlikestatus.numRemaining);
                                    com.tinder.fragments.bd.e(a.b.a).a(com.tinder.fragments.bd.o(a.b.a));
                                }

                                public final void a(String s1)
                                {
                                    bd.p(a.b.a);
                                    (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(a.b.a));
                                    com.tinder.fragments.bd.q(a.b.a);
                                    if (TextUtils.equals(com.tinder.fragments.bd.o(a.b.a).getId(), s1))
                                    {
                                        com.tinder.fragments.bd.r(a.b.a);
                                    }
                                }

                                public final void b()
                                {
                                    bd.p(a.b.a);
                                    com.tinder.fragments.bd.q(a.b.a);
                                }

            
            {
                a = _pcls1;
                super();
            }
                            });
                        }

                        public final void b()
                        {
                            bd.p(b.a);
                            com.tinder.fragments.bd.q(b.a);
                        }

                        public final void c()
                        {
                            bd.p(b.a);
                            com.tinder.fragments.bd.q(b.a);
                        }

            
            {
                b = _pcls7;
                a = user;
                super();
            }
                    });
                }

                public final void a(User user, SuperlikeStatus superlikestatus)
                {
                    com.tinder.fragments.bd.a(a, bd.m(a));
                    com.tinder.fragments.bd.a(a, superlikestatus.numRemaining);
                    com.tinder.fragments.bd.e(a).a(com.tinder.fragments.bd.o(a));
                }

                public final void a(String s1)
                {
                    (new StringBuilder("mLastSwipeWasSuperlike was ")).append(bd.g(a));
                    bd.p(a);
                    com.tinder.fragments.bd.q(a);
                    if (TextUtils.equals(com.tinder.fragments.bd.o(a).getId(), s1))
                    {
                        com.tinder.fragments.bd.r(a);
                    }
                }

                public final void b()
                {
                    a.k.e();
                }

            
            {
                a = bd.this;
                super();
            }
            });
            return;
        } else
        {
            ab = ae;
            (new StringBuilder("lastRecWasSuperlike? ")).append(ab);
            J.a(L);
            return;
        }
    }

    public final void b(com.tinder.cards.a a1)
    {
        int i1;
        boolean flag = true;
        K = (RecCard)a1;
        K.setAdCacheListener(this);
        a1 = J;
        boolean flag1 = ((i) (a1)).b;
        a1.b = false;
        if (flag1)
        {
            if (M != null && s())
            {
                a1 = K.getRecId();
                boolean flag4 = K.getRec().isRecAndPassporting();
                Object obj;
                boolean flag2;
                boolean flag5;
                if (K.getTranslationX() > 0.0F)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                flag5 = K.getRec().isSuperLike();
                X = true;
                if (2 == T)
                {
                    a(false);
                }
                AsyncTask.execute(new Runnable(flag2, flag4, a1, flag5) {

                    final boolean a;
                    final boolean b;
                    final String c;
                    final boolean d;
                    final bd e;

                    public final void run()
                    {
                        SparksEvent sparksevent = new SparksEvent("Undo.Undo");
                        sparksevent.put("like", Boolean.valueOf(a));
                        sparksevent.put("userTraveling", Boolean.valueOf(e.e.b()));
                        sparksevent.put("recTraveling", Boolean.valueOf(b));
                        sparksevent.put("otherId", c);
                        sparksevent.put("didSuperLike", Boolean.valueOf(d));
                        sparksevent.put("superLike", Boolean.valueOf(bd.g(e)));
                        com.tinder.managers.a.a(sparksevent);
                    }

            
            {
                e = bd.this;
                a = flag;
                b = flag1;
                c = s1;
                d = flag2;
                super();
            }
                });
                K.setTranslationX(M.e);
                K.setTranslationY(M.c);
                K.setRotation(M.k);
                if (flag2)
                {
                    a1 = K.getStampLike();
                } else
                {
                    a1 = K.getStampNope();
                }
                a1 = (ImageView)(ImageView)a1;
                a1.setVisibility(0);
                if (flag2)
                {
                    i1 = 0x7f0201bb;
                } else
                {
                    i1 = 0x7f0201bd;
                }
                a1.setImageResource(i1);
                a1.getDrawable().setAlpha(255);
                obj = new ValueAnimator();
                ((ValueAnimator) (obj)).setDuration(125L);
                ((ValueAnimator) (obj)).setIntValues(new int[] {
                    255, 0
                });
                ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(a1) {

                    final ImageView a;
                    final bd b;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        if (ad.a)
                        {
                            a.setImageAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
                            return;
                        } else
                        {
                            a.setAlpha(valueanimator.getAnimatedFraction());
                            return;
                        }
                    }

            
            {
                b = bd.this;
                a = imageview;
                super();
            }
                });
                ((ValueAnimator) (obj)).addListener(new au(a1, flag2) {

                    final ImageView a;
                    final boolean b;
                    final bd c;

                    public final void onAnimationEnd(Animator animator)
                    {
                        animator = a;
                        int j1;
                        if (b)
                        {
                            j1 = 0x7f0201bc;
                        } else
                        {
                            j1 = 0x7f0201be;
                        }
                        animator.setImageResource(j1);
                    }

            
            {
                c = bd.this;
                a = imageview;
                b = flag;
                super();
            }
                });
                K.resetPosition(true, new com.facebook.a.d(((ValueAnimator) (obj))) {

                    final ValueAnimator a;
                    final bd b;

                    public final void onSpringAtRest(com.facebook.a.e e1)
                    {
                        a.start();
                        bd.p(b);
                        bd.t(b);
                    }

                    public final void onSpringUpdate(com.facebook.a.e e1)
                    {
                        float f1 = (float)e1.d.a;
                        com.tinder.fragments.bd.s(b).setRotation(-com.tinder.utils.o.a(f1, 0.0F, 0.0F, 1.0F, 360F));
                    }

            
            {
                b = bd.this;
                a = valueanimator;
                super();
            }
                });
            }
        } else
        {
            a1 = J;
            boolean flag3 = ((i) (a1)).c;
            a1.c = false;
            if (flag3 && M != null)
            {
                K.setTranslationX(M.e);
                K.setTranslationY(M.c);
                K.setRotation(M.k);
                K.resetPosition();
            }
        }
        if (w)
        {
            if (K != null && !K.isMoving() && !K.canBeSuperLiked())
            {
                if (K.getCardMode() == com.tinder.views.RecCard.CardMode.SUPER_LIKE)
                {
                    K.animateSuperLike();
                }
                w();
            } else
            {
                v();
            }
        }
        a1 = com.tinder.managers.d.c();
        if (a1 != null && com.tinder.managers.ae.e() > ((UserMeta) (a1)).globalConfig.adSwipeLimit)
        {
            com.tinder.managers.ae.d();
        }
        if (!Z || aa) goto _L2; else goto _L1
_L1:
        a1 = i;
        obj = com.tinder.managers.d.c();
        if (obj == null) goto _L4; else goto _L3
_L3:
        i1 = ((UserMeta) (obj)).globalConfig.adSwipeLimit;
        if (!ManagerApp.c || com.tinder.managers.ae.e() < i1 / 2 || i1 == 0 || com.tinder.managers.ae.a() && !((ManagerLiveRail) (a1)).v) goto _L4; else goto _L5
_L5:
        i1 = 1;
_L8:
        if (i1 != 0)
        {
            aa = true;
            a1 = i;
            a1.n = 0;
            a1.u = false;
            a1.m = null;
            a1.b = null;
            a1.c = null;
            a1.d = null;
            a1.e = null;
            a1.f = null;
            a1.g = null;
            a1.h = null;
            a1.i = null;
            a1.j = null;
            a1.k = null;
            a1.l = null;
            ((ManagerLiveRail) (a1)).q.a.clear();
            ((ManagerLiveRail) (a1)).r.a.clear();
            a1 = i;
            obj = new Runnable() {

                final bd a;

                public final void run()
                {
                    String s1 = a.i.i;
                    Context context = ManagerApp.c();
                    Runnable runnable = new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
                            a.a.r = true;
                        }

            
            {
                a = _pcls1;
                super();
            }
                    };
                    (new com.tinder.utils.z.a(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                        s1, runnable
                    });
                }

            
            {
                a = bd.this;
                super();
            }
            };
            ((ManagerLiveRail) (a1)).q.a(((Runnable) (obj)), true);
            a1 = i;
            obj = new Runnable() {

                final bd a;

                public final void run()
                {
                    a.n();
                    if (com.tinder.fragments.bd.a(a))
                    {
                        a.g();
                    }
                }

            
            {
                a = bd.this;
                super();
            }
            };
            ((ManagerLiveRail) (a1)).r.a(((Runnable) (obj)), false);
            i.a();
        }
_L2:
        if (!r || !Z) goto _L7; else goto _L6
_L6:
        a1 = i;
        obj = com.tinder.managers.d.c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_849;
        }
        i1 = ((UserMeta) (obj)).globalConfig.adSwipeLimit;
        if (com.tinder.managers.ae.e() < i1 || i1 == 0 || com.tinder.managers.ae.a() && !((ManagerLiveRail) (a1)).v || ((ManagerLiveRail) (a1)).i == null)
        {
            break MISSING_BLOCK_LABEL_849;
        }
        i1 = ((flag) ? 1 : 0);
_L9:
        if (i1 != 0)
        {
            com.tinder.managers.ae.d();
            J.a(new String("ad"), 4);
        }
_L7:
        ak.postDelayed(new Runnable() {

            final bd a;

            public final void run()
            {
                if (bd.b(a).getVisibility() == 0 && com.tinder.fragments.bd.c(a) != null)
                {
                    com.tinder.fragments.bd.c(a).onPushedToTopOfStack();
                }
            }

            
            {
                a = bd.this;
                super();
            }
        }, 200L);
        X = false;
        return;
_L4:
        i1 = 0;
          goto _L8
        i1 = 0;
          goto _L9
    }

    public final void b(com.tinder.cards.a a1, boolean flag)
    {
        if (af)
        {
            return;
        }
        if (com.tinder.cards.d.b(a1))
        {
            a1 = M;
        } else
        {
            a1 = com.tinder.cards.d.a(a1);
        }
        M = a1;
        q();
        if (!z() && !flag && !ae.a.getBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_RIGHT", false))
        {
            a1 = g.d();
            if (a1 != null)
            {
                Q = new com.tinder.c.l(getActivity(), ConfirmationType.DRAGGING_RIGHT, a1.getName(), new android.view.View.OnClickListener() {

                    final bd a;

                    public final void onClick(View view)
                    {
                        com.tinder.fragments.bd.f(a);
                    }

            
            {
                a = bd.this;
                super();
            }
                }, new android.view.View.OnClickListener() {

                    final bd a;

                    public final void onClick(View view)
                    {
                        if (com.tinder.fragments.bd.c(a) != null)
                        {
                            com.tinder.fragments.bd.e(a).a();
                        }
                    }

            
            {
                a = bd.this;
                super();
            }
                }, new android.content.DialogInterface.OnKeyListener() {

                    final bd a;

                    public final boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
                    {
                        if (i1 == 4 && com.tinder.fragments.bd.c(a) != null)
                        {
                            com.tinder.fragments.bd.e(a).a();
                            return false;
                        } else
                        {
                            return true;
                        }
                    }

            
            {
                a = bd.this;
                super();
            }
                });
                Q.show();
            }
            ae.b.putBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_RIGHT", true);
            ae.b.commit();
            return;
        } else
        {
            f(flag);
            return;
        }
    }

    public final void b(Match match)
    {
        (new StringBuilder("match=")).append(match);
        ((q)getActivity()).a(match, true);
        com.tinder.utils.ad.c(H);
    }

    public final void b(boolean flag)
    {
        com.tinder.utils.ad.a(y, android.support.v4.b.a.a(getActivity(), 0x7f0201c2));
        if (flag)
        {
            t();
        }
    }

    public final void c()
    {
        k.e();
    }

    public final void c(com.tinder.cards.a a1, boolean flag)
    {
        if (af)
        {
            return;
        }
        if (com.tinder.cards.d.b(a1))
        {
            a1 = M;
        } else
        {
            a1 = com.tinder.cards.d.a(a1);
        }
        M = a1;
        q();
        if (!flag && !com.tinder.managers.ae.j() && w)
        {
            a(flag, 3);
            return;
        } else
        {
            g(flag);
            return;
        }
    }

    public final void c(boolean flag)
    {
        com.tinder.utils.ad.a(y, android.support.v4.b.a.a(getActivity(), 0x7f0201c0));
        if (flag)
        {
            t();
        }
    }

    public final void d()
    {
        k.a(1, null);
    }

    public final String e()
    {
        return "fragment recommendations";
    }

    public final void f()
    {
    }

    public final void g()
    {
        if (X)
        {
            return;
        }
        User user = g.d();
        if (user != null)
        {
            if (!ae.a.getBoolean("NOTIFICATION_VIEWED_TAPPING_X", false) && K != null)
            {
                R = new com.tinder.c.l(getActivity(), ConfirmationType.TAPPING_X, user.getName(), new android.view.View.OnClickListener() {

                    final bd a;

                    public final void onClick(View view)
                    {
                        a.a(RateType.PASS);
                    }

            
            {
                a = bd.this;
                super();
            }
                }, new android.view.View.OnClickListener() {

                    final bd a;

                    public final void onClick(View view)
                    {
                        com.tinder.fragments.bd.e(a).a();
                    }

            
            {
                a = bd.this;
                super();
            }
                }, new android.content.DialogInterface.OnKeyListener() {

                    final bd a;

                    public final boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
                    {
                        if (i1 == 4)
                        {
                            com.tinder.fragments.bd.e(a).a();
                            return false;
                        } else
                        {
                            return true;
                        }
                    }

            
            {
                a = bd.this;
                super();
            }
                });
                R.show();
                ae.b.putBoolean("NOTIFICATION_VIEWED_TAPPING_X", true);
                ae.b.commit();
                return;
            } else
            {
                a(RateType.PASS);
                return;
            }
        } else
        {
            a(RateType.PASS);
            return;
        }
    }

    public final void h()
    {
        if (getView() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag1;
        boolean flag = com.tinder.managers.ae.t();
        flag1 = com.tinder.managers.ae.z();
        if (Y == flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        Y = flag;
        if (w != flag1)
        {
            w = flag1;
        }
        View view = getView();
        if (view != null)
        {
            a(view);
            p();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!Y || w == flag1) goto _L1; else goto _L3
_L3:
        w = flag1;
        View view1 = getView();
        if (view1 != null)
        {
            a(view1);
            p();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void i()
    {
        if (getActivity() != null)
        {
            ((ActivityMain)getActivity()).a("newMatch");
        }
    }

    public final void j()
    {
        ((ActivityMain)getActivity()).q();
        com.tinder.utils.ad.c(H);
    }

    public final void k()
    {
        android.support.v4.app.i i1 = getActivity();
        if (H != null && i1 != null && !i1.isFinishing())
        {
            H.show();
        }
    }

    public final void l()
    {
        if (u)
        {
            return;
        }
        u = true;
        p.setVisibility(4);
        p.removeAllViews();
        O.setLoadingText(0x7f0600c7);
        O.setVisibility(0);
        O.startAllPingAnimations();
        if (Y)
        {
            d(false);
            F.setEnabled(false);
            D.setEnabled(false);
        } else
        {
            B.setEnabled(false);
            E.setEnabled(false);
            A.setEnabled(false);
        }
        if (w)
        {
            w();
        }
        T = 1;
    }

    public final void m()
    {
        if (!v)
        {
            p.setVisibility(4);
            O.setVisibility(0);
            O.setLoadingText(0x7f060138);
            O.startAllPingAnimations();
            v = true;
            if (!Y)
            {
                B.setEnabled(false);
            }
            boolean flag;
            if (Y)
            {
                F.setEnabled(false);
                D.setEnabled(false);
            } else
            {
                E.setEnabled(false);
                A.setEnabled(false);
            }
            T = 2;
            if (w)
            {
                w();
            }
            flag = com.tinder.managers.ae.a();
            if (Y && (flag && L != null || !flag))
            {
                d(true);
                return;
            }
        }
    }

    public final void n()
    {
        r = false;
        aa = false;
    }

    public final void o()
    {
        if (K != null && z())
        {
            K.onPause();
        }
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        com.tinder.utils.o.a(this, i1, j1, intent);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 8: default 80
    //                   2131624239: 81
    //                   2131624245: 228
    //                   2131624247: 207
    //                   2131624249: 864
    //                   2131624250: 223
    //                   2131624761: 864
    //                   2131624762: 223
    //                   2131624763: 998;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L6 _L7
_L1:
        return;
_L2:
        if (w && !ad)
        {
            if (g.i.isOutOfSuperlikes())
            {
                r();
                v();
                return;
            }
            boolean flag;
            if (K != null && K.getRec() != null && K.getRec().isSuperLike())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (X || flag)
            {
                v();
                return;
            }
            if (g.d() != null && !com.tinder.managers.ae.j())
            {
                a(true, 1);
                return;
            } else
            {
                x();
                a(RateType.SUPERLIKE);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        l.a(new com.tinder.e.ak() {

            final bd a;

            public final void a()
            {
                a.b();
            }

            public final void b()
            {
                SparksEvent sparksevent = new SparksEvent("Undo.Undo");
                if (com.tinder.fragments.bd.o(a) != null)
                {
                    boolean flag1;
                    if (bd.D(a) == SwipeType.LIKE_BUTTON || bd.D(a) == SwipeType.LIKE_SWIPE)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    sparksevent.put("like", Boolean.valueOf(flag1));
                    sparksevent.put("otherId", com.tinder.fragments.bd.o(a).getId());
                    sparksevent.put("recTraveling", Boolean.valueOf(com.tinder.fragments.bd.o(a).isRecAndPassporting()));
                    sparksevent.put("didSuperLike", Boolean.valueOf(com.tinder.fragments.bd.o(a).isSuperLike()));
                    sparksevent.put("superLike", Boolean.valueOf(bd.g(a)));
                }
                sparksevent.put("userTraveling", Boolean.valueOf(a.e.b()));
                com.tinder.managers.a.a(sparksevent);
                if (a.getActivity() != null && (a.getActivity() instanceof Paywall))
                {
                    ((Paywall)a.getActivity()).launchPlusSubscriptionPaywall(0, PaywallPerk.UNDO);
                }
            }

            public final void c()
            {
                Toast.makeText(bd.E(a), a.getResources().getString(0x7f0600ab), 1).show();
            }

            
            {
                a = bd.this;
                super();
            }
        });
        return;
_L6:
        g();
        return;
_L3:
        view = ((ActivityMain)getActivity()).e();
        if (view != null && !view.c())
        {
            Object obj = new SparksEvent("Passport.MenuOpen");
            ((SparksEvent) (obj)).put("recsExhausted", Boolean.valueOf(O.getLoadingText().equals(getResources().getString(0x7f060138))));
            ((SparksEvent) (obj)).put("from", Integer.valueOf(1));
            com.tinder.managers.a.a(((SparksEvent) (obj)));
            Object obj1;
            if (Y)
            {
                D.measure(0, 0);
            } else
            {
                A.measure(0, 0);
            }
            y.measure(0, 0);
            ai = new bv();
            obj = ai;
            obj1 = ((ActivityMain)getActivity()).e();
            if (getActivity() == null)
            {
                com.tinder.utils.v.b("Cannot configure a dialog when the recomendation fragment does not have an activity");
            } else
            {
                obj.j = ((FragmentAnchoredPopup) (obj1));
                ((bv) (obj)).j.a(0x7f0e0134, com.tinder.fragments.FragmentAnchoredPopup.Strategy.a, new Object[] {
                    this
                });
                obj1 = getActivity();
                ((bv) (obj)).j.a(android.support.v4.b.a.a(((Context) (obj1)), 0x7f0201c1));
                ((bv) (obj)).j.p = new bv._cls4(((bv) (obj)));
                ((bv) (obj)).j.setCenterView(LayoutInflater.from(((bv) (obj)).j.getActivity()).inflate(0x7f03004c, q, false));
                ((bv) (obj)).j.setBottomView(LayoutInflater.from(((bv) (obj)).j.getActivity()).inflate(0x7f03004b, q, false));
                ((bv) (obj)).j.a(((bv) (obj)).j.getResources().getColor(0x7f0d00c4));
                ImageView imageview = (ImageView)q.findViewById(0x7f0e0135);
                ((bv) (obj)).j.r = new bv._cls5(((bv) (obj)), imageview, ((Context) (obj1)));
                ((bv) (obj)).j.q = new bv._cls6(((bv) (obj)), imageview, ((Context) (obj1)));
                obj.e = (ListView)((bv) (obj)).j.b(0x7f0e013f);
                obj1 = ((bv) (obj)).j.getActivity();
                obj.f = LayoutInflater.from(((Context) (obj1))).inflate(0x7f030026, ((bv) (obj)).e, false);
                obj.k = android.support.v4.b.a.b(((Context) (obj1)), 0x7f0d00ce);
                obj.l = android.support.v4.b.a.b(((Context) (obj1)), 0x7f0d00fb);
                ((ImageView)((bv) (obj)).f.findViewById(0x7f0e00af)).setImageResource(0x7f0201c3);
                obj.h = (TextView)((bv) (obj)).f.findViewById(0x7f0e00b1);
                ((bv) (obj)).h.setText(0x7f060128);
                obj.g = (ImageView)((bv) (obj)).f.findViewById(0x7f0e00b0);
                ((bv) (obj)).a();
                ((bv) (obj)).e.addHeaderView(((bv) (obj)).f);
                ((bv) (obj)).e.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (obj)));
                obj.i = new j(com.tinder.managers.y.a(5));
                ((bv) (obj)).i.a(((bv) (obj)).b.b);
                ((bv) (obj)).a();
                ((bv) (obj)).e.setAdapter(((bv) (obj)).i);
                obj1 = ((bv) (obj)).j.b(0x7f0e013b);
                ((View) (obj1)).setClickable(true);
                ((View) (obj1)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
                com.tinder.utils.ad.a(((View) (obj1)), com.tinder.fragments.bv.a);
            }
            if (ai.i != null)
            {
                obj = com.tinder.managers.y.a(5);
                ai.i.d = ((List) (obj));
                ai.i.a(e.b);
                ai.a();
                ai.i.notifyDataSetChanged();
            }
            view.a();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        view = RateType.LIKE;
        if (!X)
        {
            User user = g.d();
            if (user != null)
            {
                if (!ae.a.getBoolean("NOTIFICATION_VIEWED_TAPPING_HEART", false) && K != null)
                {
                    Q = new com.tinder.c.l(getActivity(), ConfirmationType.TAPPING_HEART, user.getName(), new android.view.View.OnClickListener(view) {

                        final RateType a;
                        final bd b;

                        public final void onClick(View view1)
                        {
                            b.a(a);
                        }

            
            {
                b = bd.this;
                a = ratetype;
                super();
            }
                    }, new android.view.View.OnClickListener() {

                        final bd a;

                        public final void onClick(View view1)
                        {
                            com.tinder.fragments.bd.e(a).a();
                        }

            
            {
                a = bd.this;
                super();
            }
                    }, new android.content.DialogInterface.OnKeyListener() {

                        final bd a;

                        public final boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
                        {
                            if (i1 == 4)
                            {
                                com.tinder.fragments.bd.e(a).a();
                                return false;
                            } else
                            {
                                return true;
                            }
                        }

            
            {
                a = bd.this;
                super();
            }
                    });
                    Q.show();
                    ae.b.putBoolean("NOTIFICATION_VIEWED_TAPPING_HEART", true);
                    ae.b.commit();
                    return;
                } else
                {
                    a(view);
                    return;
                }
            } else
            {
                a(view);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (K != null && !K.isMoving())
        {
            y();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03009c, viewgroup, false);
    }

    public final void onDestroyView()
    {
        K = null;
        com.tinder.utils.ad.c(H);
        com.tinder.utils.ad.c(Q);
        com.tinder.utils.ad.c(R);
        super.onDestroyView();
    }

    public final void onDetach()
    {
        super.onDetach();
        com.tinder.utils.ad.c(H);
        H = null;
    }

    public final void onEventMainThread(EventGlobalsLoaded eventglobalsloaded)
    {
        UserMeta usermeta;
label0:
        {
            usermeta = eventglobalsloaded.getUserMeta();
            eventglobalsloaded = eventglobalsloaded.getGlobalConfig();
            Z = true;
            h();
            if (usermeta != null)
            {
                if (eventglobalsloaded != null && ((GlobalConfig) (eventglobalsloaded)).superLikeEnabled)
                {
                    ag = usermeta.superlikeStatus.numRemaining;
                }
                if (com.tinder.managers.ae.u())
                {
                    if (!Y)
                    {
                        break label0;
                    }
                    F.setPercentFullInt(usermeta.likesPercentRemaining);
                }
            }
            return;
        }
        E.setPercentFullInt(usermeta.likesPercentRemaining);
    }

    public final void onEventMainThread(EventNewMatch eventnewmatch)
    {
        Object obj;
        if (L != null && eventnewmatch.getNewMatch().getPerson().userId.equals(L.getId()))
        {
            t();
        }
        f.a(true);
        com.tinder.utils.ad.c(H);
        obj = h.b();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((User) (obj)).getPhotos();
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L4; else goto _L3
_L3:
        obj = ((ProfilePhoto)((ArrayList) (obj)).get(0)).getProcessedPhoto(UserPhotoSize.SMALL);
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = ((ProcessedPhoto) (obj)).imageUrl;
_L7:
        if (getActivity() != null)
        {
            H = new com.tinder.c.ae(getActivity(), this, ((String) (obj)), eventnewmatch.getNewMatch());
        }
_L2:
        return;
_L4:
        obj = "";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onEventMainThread(EventRecsAdded eventrecsadded)
    {
        eventrecsadded = eventrecsadded.getAddedRecs();
        a(eventrecsadded);
        i i1 = J;
        eventrecsadded.removeAll(i1.a);
        i1.a.addAll(new ArrayList(eventrecsadded));
        i1.notifyDataSetChanged();
        a(false);
    }

    public final void onPause()
    {
        n.b(this);
        super.onPause();
        o();
    }

    public final void onResume()
    {
        super.onResume();
        (new StringBuilder("superlike mEnableSuperlike:")).append(w);
        c = false;
        if (!n.a(this))
        {
            n.a(this, true);
        }
        if (Y)
        {
            LikeMeter likemeter = F;
            com.tinder.views.LikeMeter.AssetMode assetmode;
            if (Y)
            {
                assetmode = com.tinder.views.LikeMeter.AssetMode.PLUS;
            } else
            {
                assetmode = com.tinder.views.LikeMeter.AssetMode.NORMAL;
            }
            likemeter.setAssetMode(assetmode);
            if (!w)
            {
                if (e.b())
                {
                    b(false);
                } else
                {
                    c(false);
                }
            }
            if (L != null)
            {
                d(true);
            } else
            {
                L = null;
                d(false);
            }
        } else
        {
            LikeMeter likemeter1 = E;
            com.tinder.views.LikeMeter.AssetMode assetmode1;
            if (Y)
            {
                assetmode1 = com.tinder.views.LikeMeter.AssetMode.PLUS;
            } else
            {
                assetmode1 = com.tinder.views.LikeMeter.AssetMode.NORMAL;
            }
            likemeter1.setAssetMode(assetmode1);
        }
        if (K == null)
        {
            a();
        }
        h();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        Y = com.tinder.managers.ae.t();
        w = com.tinder.managers.ae.z();
        t = view.findViewById(0x7f0e02d7);
        s = view.findViewById(0x7f0e02d9);
        D = (ImageButton)view.findViewById(0x7f0e033a);
        F = (LikeMeter)view.findViewById(0x7f0e0339);
        G = (RelativeLayout)view.findViewById(0x7f0e0136);
        C = (ImageButton)view.findViewById(0x7f0e0137);
        C.setOnClickListener(this);
        C.setClickable(true);
        z = (ImageButton)view.findViewById(0x7f0e0132);
        x = view.findViewById(0x7f0e012f);
        I = (ViewGroup)view.findViewById(0x7f0e0131);
        aj = (CustomTextView)getView().findViewById(0x7f0e0133);
        y = view.findViewById(0x7f0e0135);
        D = (ImageButton)view.findViewById(0x7f0e033a);
        D.setOnClickListener(this);
        F.setOnClickListener(this);
        F.setAssetMode(com.tinder.views.LikeMeter.AssetMode.PLUS);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        B = (ImageButton)view.findViewById(0x7f0e033b);
        B.setOnClickListener(this);
        A = (ImageButton)view.findViewById(0x7f0e013a);
        E = (LikeMeter)view.findViewById(0x7f0e0139);
        A.setOnClickListener(this);
        E.setOnClickListener(this);
        E.setAssetMode(com.tinder.views.LikeMeter.AssetMode.NORMAL);
        p = (CardStackLayout)view.findViewById(0x7f0e02d8);
        O = (LoadingView)view.findViewById(0x7f0e02da);
        com.tinder.utils.ad.c(t, 0.8F);
        view = getView();
        if (view != null)
        {
            a(view);
            p();
        }
        w = com.tinder.managers.ae.z();
        P = getActivity();
        ak = new Handler();
        q.setVisibility(4);
        O.refreshProfileAvatarImage();
        p();
        view = new RecCard(getActivity());
        view.measure(0, 0);
        J = new i();
        p.setAdapter(J);
        p.setDimConfig(new com.tinder.cards.c(view.getDimNone(), view.getDimMedium(), view.getDimFull()));
        p.setListenerCards(this);
        p.setListenerStack(this);
        bundle = (android.widget.RelativeLayout.LayoutParams)p.getLayoutParams();
        bundle.height = view.getCardHeight();
        p.setLayoutParams(bundle);
        O.bringToFront();
        q.bringToFront();
        p.bringToFront();
        (new StringBuilder("passport enabled ? ")).append(e.b());
        if (com.tinder.managers.ae.t())
        {
            d(true);
        }
        q.setVisibility(0);
    }
}

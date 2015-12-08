// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v7.widget.GridLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.a.c;
import com.tinder.a.f;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.activities.ActivityJob;
import com.tinder.activities.ActivitySchool;
import com.tinder.c.ab;
import com.tinder.c.ac;
import com.tinder.c.u;
import com.tinder.d.d;
import com.tinder.e.aq;
import com.tinder.e.y;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.managers.x;
import com.tinder.managers.z;
import com.tinder.model.Career;
import com.tinder.model.Job;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.School;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class w extends Fragment
    implements TextWatcher, android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, android.widget.RadioGroup.OnCheckedChangeListener, d, aq, y
{

    private ProgressBar A;
    private ProgressBar B;
    private ProgressBar C;
    private View D;
    private View E;
    private View F;
    private ImageView G;
    private ImageView H;
    private ImageView I;
    private CustomTextView J;
    private CustomTextView K;
    private View L;
    private View M;
    private RadioGroup N;
    private int O;
    private u P;
    private Intent Q;
    private User R;
    private Gender S;
    private boolean T;
    private ProcessedPhoto U[];
    private ProfilePhoto V[];
    private ArrayList W;
    private ArrayList X;
    private ArrayList Y;
    private String Z;
    z a;
    private boolean aa;
    private boolean ab;
    private String ac;
    private int ad;
    private int ae;
    private boolean af[];
    private int ag;
    private int ah;
    private float ai;
    private float aj;
    private com.tinder.d.c ak;
    private CustomTextView al;
    private CustomTextView am;
    private ProgressBar an;
    private int ao;
    private int ap;
    com.tinder.managers.d b;
    ae c;
    x d;
    com.tinder.d.a e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private ScrollView r;
    private LinearLayout s;
    private EditText t;
    private TextView u;
    private TextView v;
    private GridLayout w;
    private ProgressBar x;
    private ProgressBar y;
    private ProgressBar z;

    public w()
    {
        O = 1;
        af = new boolean[6];
    }

    static float a(w w1, float f1)
    {
        w1.ai = f1;
        return f1;
    }

    static int a(w w1, int i1)
    {
        w1.ap = i1;
        return i1;
    }

    static void a(w w1, boolean flag)
    {
        boolean flag1 = false;
        if (w1.ao != 0) goto _L2; else goto _L1
_L1:
label0:
        {
            w1.ah = -1;
            w1.ag = -1;
            int i1 = 0;
            do
            {
                if (i1 >= w1.af.length)
                {
                    break label0;
                }
                if (w1.af[i1])
                {
                    if (w1.ag >= 0)
                    {
                        break;
                    }
                    w1.ag = i1;
                }
                i1++;
            } while (true);
            w1.ah = i1;
        }
        if (flag)
        {
            w1.ah = 0;
        }
        if (w1.ag < 0 || w1.ah < 0) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        ProfilePhoto aprofilephoto[];
        ((ProgressBar)w1.X.get(w1.ag)).setVisibility(0);
        ((ProgressBar)w1.X.get(w1.ah)).setVisibility(0);
        w1.ao = w1.ao + 1;
        obj1 = w1.a;
        int j1 = w1.ag;
        int l1 = w1.ah;
        aprofilephoto = w1.V;
        obj = new JSONObject();
        ProfilePhoto profilephoto = aprofilephoto[j1];
        aprofilephoto[j1] = aprofilephoto[l1];
        aprofilephoto[l1] = profilephoto;
        Object obj2;
        int i2;
        obj2 = new JSONArray();
        i2 = aprofilephoto.length;
        int k1 = ((flag1) ? 1 : 0);
_L12:
        if (k1 >= i2) goto _L6; else goto _L5
_L5:
        ProfilePhoto profilephoto1 = aprofilephoto[k1];
        if (profilephoto1 == null) goto _L8; else goto _L7
_L7:
        ((JSONArray) (obj2)).put(profilephoto1.getPhotoId());
          goto _L8
_L6:
        String s1;
        try
        {
            ((JSONObject) (obj)).put("change_order", obj2);
            ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.a("Failed to create json to swap photos", jsonexception);
        }
        s1 = ((z) (obj1)).a.e;
        obj2 = new com.tinder.managers.z._cls20(((z) (obj1)), w1);
        obj1 = new com.tinder.managers.z._cls21(((z) (obj1)), w1);
        ManagerApp.h().g();
        obj = new c(s1, ((JSONObject) (obj)), ((com.android.volley.i.b) (obj2)), ((com.android.volley.i.a) (obj1)), com.tinder.managers.d.b());
        obj.j = new com.android.volley.c(20000, 3, 1.0F);
        ManagerApp.b().a(((Request) (obj)));
        if (w1.ah <= w1.ag) goto _L10; else goto _L9
_L9:
        obj = new SparksEvent("Profile.ChangePhotoOrder");
        ((SparksEvent) (obj)).put("photoId", w1.V[w1.ah].getPhotoId());
        ((SparksEvent) (obj)).put("fromIdx", Integer.valueOf(w1.ah));
        ((SparksEvent) (obj)).put("toIdx", Integer.valueOf(w1.ag));
        com.tinder.managers.a.a(((SparksEvent) (obj)));
_L2:
        return;
_L10:
        SparksEvent sparksevent = new SparksEvent("Profile.ChangePhotoOrder");
        sparksevent.put("photoId", w1.V[w1.ag].getPhotoId());
        sparksevent.put("fromIdx", Integer.valueOf(w1.ag));
        sparksevent.put("toIdx", Integer.valueOf(w1.ah));
        com.tinder.managers.a.a(sparksevent);
        return;
_L4:
        com.tinder.utils.v.b("Two photos not selected");
        w1.k();
        return;
_L8:
        k1++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void a(boolean flag, int i1)
    {
        (new StringBuilder("isPhotoAvailable=")).append(flag).append(", containNumber=").append(i1);
        if (!flag)
        {
            ((ImageView)W.get(i1)).setScaleType(android.widget.ImageView.ScaleType.CENTER);
            ((ImageView)W.get(i1)).setBackgroundResource(0x7f020102);
        }
        ((ImageView)W.get(i1)).setClickable(true);
        ((ProgressBar)X.get(i1)).setVisibility(4);
    }

    static ProfilePhoto[] a(w w1)
    {
        return w1.V;
    }

    static float b(w w1, float f1)
    {
        w1.aj = f1;
        return f1;
    }

    static int b(w w1)
    {
        return w1.ao;
    }

    static void b(w w1, int i1)
    {
        w1.e(i1);
    }

    private void b(String s1)
    {
        int j1;
label0:
        {
            int i1 = 500 - s1.length();
            if (u != null)
            {
                u.setText(String.valueOf(i1));
                j1 = t.length();
                if (i1 >= 0)
                {
                    break label0;
                }
                u.setTextColor(getResources().getColor(0x7f0d00da));
                t.getText().setSpan(new BackgroundColorSpan(0xffff0000), i1 + j1, j1, 33);
            }
            return;
        }
        u.setTextColor(getResources().getColor(0x7f0d00fd));
        t.getText().setSpan(new BackgroundColorSpan(getActivity().getResources().getColor(0x7f0d0107)), 0, j1, 33);
    }

    private void b(boolean flag)
    {
        CustomTextView customtextview = am;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        customtextview.setVisibility(i1);
    }

    private void c(boolean flag)
    {
        CustomTextView customtextview = al;
        Resources resources = getResources();
        int i1;
        if (flag)
        {
            i1 = 0x7f0d009e;
        } else
        {
            i1 = 0x7f0d0101;
        }
        customtextview.setTextColor(resources.getColor(i1));
    }

    static boolean c(w w1)
    {
        w1.aa = true;
        return true;
    }

    static Intent d(w w1)
    {
        return w1.Q;
    }

    private void d(int i1)
    {
        ImageView imageview = (ImageView)W.get(i1);
        if (V[i1] != null)
        {
            imageview.setBackgroundDrawable(android.support.v4.b.a.a(getContext(), 0x7f020056));
            af[i1] = false;
            ae = ae - 1;
            ((ImageView)Y.get(i1)).setSelected(false);
        }
        l();
    }

    static int e(w w1)
    {
        for (int i1 = 0; i1 < w1.af.length; i1++)
        {
            if (w1.af[i1])
            {
                return i1;
            }
        }

        return 0;
    }

    private void e(int i1)
    {
        if (ao != 0) goto _L2; else goto _L1
_L1:
        if (V[i1] != null) goto _L4; else goto _L3
_L3:
        if (ao != 0) goto _L2; else goto _L5
_L5:
        i1 = 0;
_L11:
        if (i1 >= V.length) goto _L7; else goto _L6
_L6:
        if (V[i1] != null) goto _L9; else goto _L8
_L8:
        ap = i1;
        startActivityForResult(Q, 1111);
_L2:
        return;
_L9:
        i1++;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = 0;
        if (true) goto _L8; else goto _L4
_L4:
        if (af[i1])
        {
            d(i1);
            return;
        }
        ((ImageView)W.get(i1)).setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020055));
        af[i1] = true;
        ae = ae + 1;
        ((ImageView)Y.get(i1)).setSelected(true);
        l();
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static void f(w w1)
    {
        if (!w1.ab && w1.ao == 0)
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            int i1 = 0;
            while (i1 < w1.af.length) 
            {
                if (w1.af[i1])
                {
                    if (i1 < w1.V.length)
                    {
                        ProfilePhoto profilephoto = w1.V[i1];
                        if (profilephoto != null)
                        {
                            w1.ao = w1.ao + 1;
                            arraylist.add(profilephoto.getPhotoId());
                            arraylist1.add(Integer.valueOf(i1));
                            ((ProgressBar)w1.X.get(i1)).setVisibility(0);
                        } else
                        {
                            com.tinder.utils.v.b("photo to delete is null, doh");
                        }
                    } else
                    {
                        com.tinder.utils.v.b("index out of range");
                    }
                    w1.d(i1);
                }
                i1++;
            }
            if (arraylist.size() > 0)
            {
                w1.a.a(arraylist, arraylist1, w1);
                return;
            } else
            {
                com.tinder.utils.v.a("No photos to delete");
                return;
            }
        } else
        {
            w1.ab = false;
            return;
        }
    }

    static GridLayout g(w w1)
    {
        return w1.w;
    }

    static ScrollView h(w w1)
    {
        return w1.r;
    }

    static com.tinder.d.c i(w w1)
    {
        return w1.ak;
    }

    private void j()
    {
        int i1;
        int j1;
        if (R != null)
        {
            i1 = R.getPhotos().size();
        } else
        {
            i1 = 0;
        }
        V = new ProfilePhoto[6];
        U = new ProcessedPhoto[6];
        j1 = 0;
        while (j1 < 6) 
        {
            ProfilePhoto profilephoto;
            if (j1 < i1 && R != null)
            {
                V[j1] = (ProfilePhoto)R.getPhotos().get(j1);
            } else
            {
                V[j1] = null;
            }
            profilephoto = V[j1];
            if (profilephoto != null)
            {
                if (j1 == 0)
                {
                    U[j1] = profilephoto.getProcessedPhoto(UserPhotoSize.LARGE);
                } else
                {
                    U[j1] = profilephoto.getProcessedPhoto(UserPhotoSize.LARGE);
                }
            } else
            {
                U[j1] = null;
            }
            j1++;
        }
        if (i1 > 0 && V[0] != null)
        {
            V[0].isMain = true;
        }
    }

    private void k()
    {
        for (int i1 = 0; i1 < W.size(); i1++)
        {
            d(i1);
        }

        ae = 0;
    }

    private void l()
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view)
            {
                int i1 = 0;
                do
                {
label0:
                    {
                        if (i1 < com.tinder.fragments.w.a(a).length)
                        {
                            if (w.b(a) != 0 || com.tinder.fragments.w.a(a)[i1] != null)
                            {
                                break label0;
                            }
                            com.tinder.fragments.w.c(a);
                            com.tinder.fragments.w.a(a, i1);
                            a.startActivityForResult(com.tinder.fragments.w.d(a), 1111);
                        }
                        return;
                    }
                    i1++;
                } while (true);
            }

            
            {
                a = w.this;
                super();
            }
        };
        android.view.View.OnClickListener onclicklistener1 = new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view)
            {
                com.tinder.fragments.w.a(a, false);
            }

            
            {
                a = w.this;
                super();
            }
        };
        android.view.View.OnClickListener onclicklistener2 = new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view)
            {
                com.tinder.fragments.w.a(a, true);
            }

            
            {
                a = w.this;
                super();
            }
        };
        android.view.View.OnClickListener onclicklistener3 = new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view)
            {
                if (w.b(a) == 0)
                {
                    int i1 = w.e(a);
                    w.b(a, i1);
                    com.tinder.fragments.w.a(a, i1);
                    a.startActivityForResult(com.tinder.fragments.w.d(a), 1111);
                }
            }

            
            {
                a = w.this;
                super();
            }
        };
        android.view.View.OnClickListener onclicklistener4 = new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view)
            {
                com.tinder.fragments.w.f(a);
            }

            
            {
                a = w.this;
                super();
            }
        };
        if (ae == 0)
        {
            if (com.tinder.utils.o.a(V) < V.length)
            {
                G.setVisibility(8);
                H.setVisibility(8);
                I.setVisibility(0);
                I.setImageResource(0x7f0201ea);
                I.setOnClickListener(onclicklistener);
                return;
            } else
            {
                G.setVisibility(8);
                H.setVisibility(8);
                I.setVisibility(8);
                return;
            }
        }
        if (ae == 1)
        {
            if (af[0])
            {
                G.setVisibility(8);
                H.setVisibility(8);
                I.setVisibility(0);
                I.setImageResource(0x7f0201e1);
                I.setOnClickListener(onclicklistener3);
                return;
            } else
            {
                G.setVisibility(0);
                H.setVisibility(0);
                I.setVisibility(0);
                G.setImageResource(0x7f0201e1);
                G.setOnClickListener(onclicklistener3);
                H.setImageResource(0x7f0201e5);
                H.setOnClickListener(onclicklistener2);
                I.setImageResource(0x7f0201e2);
                I.setOnClickListener(onclicklistener4);
                return;
            }
        }
        if (ae == 2)
        {
            if (af[0])
            {
                G.setVisibility(8);
                H.setVisibility(8);
                I.setVisibility(0);
                I.setImageResource(0x7f0201e8);
                I.setOnClickListener(onclicklistener1);
                return;
            } else
            {
                G.setVisibility(8);
                H.setVisibility(0);
                I.setVisibility(0);
                H.setImageResource(0x7f0201e8);
                H.setOnClickListener(onclicklistener1);
                I.setImageResource(0x7f0201e2);
                I.setOnClickListener(onclicklistener4);
                return;
            }
        }
        if (af[0])
        {
            G.setVisibility(8);
            H.setVisibility(8);
            I.setVisibility(8);
            return;
        } else
        {
            G.setVisibility(8);
            H.setVisibility(8);
            I.setVisibility(0);
            I.setImageResource(0x7f0201e2);
            I.setOnClickListener(onclicklistener4);
            return;
        }
    }

    private void m()
    {
label0:
        {
label1:
            {
                if (R != null)
                {
                    R = a.b();
                    Object obj1 = R.getCareer();
                    Object obj;
                    if (((Career) (obj1)).hasJobs() && ((Career) (obj1)).getMyJob() != null)
                    {
                        K.setText(((Career) (obj1)).getMyJob().getSpannedStrict());
                    } else
                    {
                        K.setText(getString(0x7f0601c9));
                    }
                    if (!((Career) (obj1)).hasSchools())
                    {
                        break label0;
                    }
                    obj = null;
                    obj1 = ((Career) (obj1)).getSchools().iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        School school = (School)((Iterator) (obj1)).next();
                        if (school.isDisplayed)
                        {
                            if (obj == null)
                            {
                                obj = school.getSpanned();
                            } else
                            {
                                obj = TextUtils.concat(new CharSequence[] {
                                    obj, ", ", school.getSpanned()
                                });
                            }
                        }
                    } while (true);
                    if (obj == null)
                    {
                        break label1;
                    }
                    J.setText(((CharSequence) (obj)));
                }
                return;
            }
            J.setText(getString(0x7f0601c8));
            return;
        }
        J.setText(getString(0x7f0601c8));
    }

    private void n()
    {
        int i1 = 0;
        while (i1 < V.length) 
        {
            if (i1 < U.length && U[i1] != null && U[i1].imageUrl != null)
            {
                String s1 = U[i1].imageUrl;
                Picasso.a(getActivity()).a(s1).a(0x7f020102).a(0x7f09000d, 0x7f09000d).b().a((ImageView)W.get(i1), null);
                ((ImageView)W.get(i1)).setTag(s1);
                a(true, i1);
            } else
            {
                ((ImageView)W.get(i1)).setImageDrawable(null);
                a(false, i1);
            }
            i1++;
        }
    }

    private void o()
    {
        if (TextUtils.isEmpty(com.tinder.managers.ae.v()))
        {
            ak.a(O);
            return;
        } else
        {
            (new ac(getActivity(), new com.tinder.c.ac.a() {

                final w a;

                public final void a()
                {
                    com.tinder.fragments.w.i(a).b(1);
                }

            
            {
                a = w.this;
                super();
            }
            })).show();
            return;
        }
    }

    public final void a()
    {
        ao = ao - 1;
        if (getActivity() == null) goto _L2; else goto _L1
_L1:
        ImageView imageview1;
        AnimationSet animationset;
        AnimationSet animationset1;
        ScaleAnimation scaleanimation;
        ScaleAnimation scaleanimation1;
        j();
        k();
        ((ProgressBar)X.get(ag)).setVisibility(4);
        ((ProgressBar)X.get(ah)).setVisibility(4);
        int i1 = ag;
        int j1 = ah;
        (new StringBuilder("index1=")).append(i1).append(", index2=").append(j1);
        float f1;
        float f2;
        float f3;
        float f4;
        ViewGroup viewgroup;
        ViewGroup viewgroup1;
        ImageView imageview;
        int ai1[];
        TranslateAnimation translateanimation;
        int ai2[];
        TranslateAnimation translateanimation1;
        if (i1 == 3)
        {
            viewgroup = (ViewGroup)w.getChildAt(5);
        } else
        if (i1 == 5)
        {
            viewgroup = (ViewGroup)w.getChildAt(3);
        } else
        {
            viewgroup = (ViewGroup)w.getChildAt(i1);
        }
        if (j1 == 3)
        {
            viewgroup1 = (ViewGroup)w.getChildAt(5);
        } else
        if (j1 == 5)
        {
            viewgroup1 = (ViewGroup)w.getChildAt(3);
        } else
        {
            viewgroup1 = (ViewGroup)w.getChildAt(j1);
        }
        imageview = (ImageView)W.get(i1);
        imageview1 = (ImageView)W.get(j1);
        ai1 = new int[2];
        ai2 = new int[2];
        viewgroup.getLocationInWindow(ai1);
        viewgroup1.getLocationInWindow(ai2);
        f1 = ai2[0] - ai1[0];
        f2 = ai2[1] - ai1[1];
        f3 = ai1[0] - ai2[0];
        f4 = ai1[1] - ai2[1];
        translateanimation = new TranslateAnimation(0.0F, f1, 0.0F, f2);
        translateanimation.setDuration(230L);
        translateanimation.setFillAfter(false);
        translateanimation1 = new TranslateAnimation(0.0F, f3, 0.0F, f4);
        translateanimation1.setDuration(230L);
        translateanimation1.setFillAfter(false);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(viewgroup, viewgroup1, imageview, imageview1) {

            final ViewGroup a;
            final ViewGroup b;
            final ImageView c;
            final ImageView d;
            final w e;

            public final void onAnimationEnd(Animation animation)
            {
                animation = c.getDrawable();
                android.graphics.drawable.Drawable drawable = d.getDrawable();
                c.setImageDrawable(drawable);
                d.setImageDrawable(animation);
                if (com.tinder.utils.ad.a())
                {
                    com.tinder.utils.ad.b(a, 1.0F);
                    com.tinder.utils.ad.b(b, 1.0F);
                    return;
                }
                animation = ObjectAnimator.ofFloat(a, "alpha", new float[] {
                    1.0F
                });
                if (animation == null)
                {
                    animation.setDuration(100L);
                }
                ObjectAnimator.ofFloat(a, "alpha", new float[] {
                    1.0F
                }).setDuration(100L).start();
                ObjectAnimator.ofFloat(b, "alpha", new float[] {
                    1.0F
                }).setDuration(100L).start();
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
                if (com.tinder.utils.ad.a())
                {
                    com.tinder.utils.ad.b(a, 0.2F);
                    com.tinder.utils.ad.b(b, 0.2F);
                    return;
                } else
                {
                    ObjectAnimator.ofFloat(a, "alpha", new float[] {
                        0.2F
                    }).setDuration(50L).start();
                    ObjectAnimator.ofFloat(b, "alpha", new float[] {
                        0.2F
                    }).setDuration(50L).start();
                    return;
                }
            }

            
            {
                e = w.this;
                a = viewgroup;
                b = viewgroup1;
                c = imageview;
                d = imageview1;
                super();
            }
        });
        animationset = new AnimationSet(true);
        animationset1 = new AnimationSet(true);
        scaleanimation = new ScaleAnimation(1.0F, aj, 1.0F, aj);
        scaleanimation.setDuration(230L);
        scaleanimation1 = new ScaleAnimation(1.0F, ai, 1.0F, ai);
        scaleanimation1.setDuration(230L);
        if (!imageview.equals(f)) goto _L4; else goto _L3
_L3:
        animationset.addAnimation(scaleanimation);
        animationset1.addAnimation(scaleanimation1);
_L6:
        animationset.addAnimation(translateanimation);
        animationset1.addAnimation(translateanimation1);
        animationset.setZAdjustment(-1);
        animationset1.setZAdjustment(1);
        animationset.setInterpolator(new LinearInterpolator());
        animationset1.setInterpolator(new LinearInterpolator());
        viewgroup.startAnimation(animationset);
        viewgroup1.startAnimation(animationset1);
        l();
_L2:
        return;
_L4:
        if (imageview1.equals(f))
        {
            animationset.addAnimation(scaleanimation1);
            animationset1.addAnimation(scaleanimation);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(int i1)
    {
        ao = ao - 1;
        if (getActivity() == null)
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), 0x7f0600b3, 1).show();
            ((ProgressBar)X.get(i1)).setVisibility(4);
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        (new StringBuilder("oldIndex=")).append(i1).append(", index=").append(j1);
        ao = ao - 1;
        if (getActivity() == null)
        {
            return;
        }
        ((ProgressBar)X.get(j1)).setVisibility(4);
        for (int k1 = 0; k1 < V.length; k1++)
        {
            if (k1 != j1 && V[k1] != null)
            {
                V[k1].isMain = false;
            }
        }

        a(true, i1);
        a(true, j1);
        ad = j1;
    }

    public final void a(int i1, ProfilePhoto profilephoto)
    {
        (new StringBuilder("ADD PHOTO SUCCESS : ")).append(profilephoto.getPhotoId()).append(" contents: ").append(profilephoto);
        ao = ao - 1;
        if (getActivity() == null)
        {
            return;
        }
        ((ImageView)W.get(i1)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        Object obj = profilephoto.getProcessedPhoto(UserPhotoSize.SMALL);
        if (obj != null)
        {
            obj = ((ProcessedPhoto) (obj)).imageUrl;
            Picasso.a(getActivity()).a(((String) (obj))).a(0x7f09000d, 0x7f09000d).a((ImageView)W.get(i1), null);
        }
        ((ImageView)W.get(i1)).setTag(profilephoto.imageUrl);
        a(true, i1);
        V[i1] = profilephoto;
        ((ProgressBar)X.get(i1)).setVisibility(4);
        e.b();
        obj = new SparksEvent("Profile.AddPhoto");
        ((SparksEvent) (obj)).put("photoId", profilephoto.getPhotoId());
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        l();
        a.a(V, this);
    }

    public final void a(String s1)
    {
        al.setText(s1);
        c(true);
        b(true);
    }

    public final void a(List list)
    {
        Collections.sort(list, new Comparator() {

            final w a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (Integer)obj;
                return ((Integer)obj1).compareTo(((Integer) (obj)));
            }

            
            {
                a = w.this;
                super();
            }
        });
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            b(((Integer)list.get(i1)).intValue());
        }

    }

    public final void a(boolean flag)
    {
        JSONObject jsonobject;
        Object obj;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        flag3 = false;
        flag2 = true;
        (new StringBuilder()).append(this).append(" ENTER");
        T = flag;
        obj = t.getText().toString();
        jsonobject = new JSONObject();
        if (R.getBio().equals(obj))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        jsonobject.put("bio", obj);
        obj = e;
        if (Z.length() > 0)
        {
            flag3 = true;
        }
        ((com.tinder.d.a) (obj)).a(flag3);
        e.e();
        flag1 = true;
        Z = t.getText().toString();
        if (S == R.getGender())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        jsonobject.put("gender", S.ordinal());
        flag1 = flag2;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        P.show();
        a.a(jsonobject, this);
        return;
        if (flag)
        {
            try
            {
                getActivity().setResult(-1);
                getActivity().finish();
                return;
            }
            catch (JSONException jsonexception)
            {
                com.tinder.utils.v.b(jsonexception.toString());
            }
            return;
        } else
        {
            return;
        }
    }

    public final void afterTextChanged(Editable editable)
    {
        (new StringBuilder("editable=")).append(editable);
        b(editable.toString());
    }

    public final void b()
    {
        ao = ao - 1;
        if (getActivity() != null)
        {
            k();
            Toast.makeText(getActivity(), 0x7f0600b6, 1).show();
            ab = true;
            ((ProgressBar)X.get(ag)).setVisibility(4);
            ((ProgressBar)X.get(ah)).setVisibility(4);
        }
    }

    public final void b(int i1)
    {
        boolean flag = false;
        ao = ao - 1;
        if (getActivity() == null)
        {
            return;
        }
        ProfilePhoto profilephoto = V[i1];
        if (profilephoto != null)
        {
            SparksEvent sparksevent = new SparksEvent("Profile.DeletePhoto");
            sparksevent.put("photoId", profilephoto.getPhotoId());
            com.tinder.managers.a.a(sparksevent);
            e.c();
        }
        V[i1] = null;
        ((ImageView)W.get(i1)).setScaleType(android.widget.ImageView.ScaleType.CENTER);
        ((ImageView)W.get(i1)).setImageBitmap(null);
        ((ImageView)W.get(i1)).setBackgroundResource(0x7f020102);
        a(false, i1);
        ((ProgressBar)X.get(i1)).setVisibility(4);
        int j1;
        do
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 >= V.length - 1)
            {
                break;
            }
            ProfilePhoto profilephoto1 = V[i1 + 1];
            if (profilephoto1 != null)
            {
                ImageView imageview1 = (ImageView)W.get(i1);
                imageview1.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                Picasso.a(getActivity()).a(profilephoto1.imageUrl).a(0x7f09000d, 0x7f09000d).a(imageview1, null);
            }
            V[i1] = V[i1 + 1];
            V[i1 + 1] = null;
            i1++;
        } while (true);
        for (; j1 < V.length; j1++)
        {
            if (V[j1] == null)
            {
                ImageView imageview = (ImageView)W.get(j1);
                imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                imageview.setImageResource(0x7f020102);
            }
        }

        l();
    }

    public final void b(int i1, int j1)
    {
        (new StringBuilder("oldIndex=")).append(i1).append(", index=").append(j1);
        ao = ao - 1;
        if (getActivity() == null)
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), 0x7f0600b5, 1).show();
            ab = true;
            ((ProgressBar)X.get(j1)).setVisibility(4);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
        b(charsequence.toString());
    }

    public final void c()
    {
        d.a(this);
    }

    public final void c(int i1)
    {
        ao = ao - 1;
        if (getActivity() == null)
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), 0x7f0600b4, 1).show();
            ((ProgressBar)X.get(i1)).setVisibility(4);
            return;
        }
    }

    public final void d()
    {
        al.setText(getResources().getText(0x7f0600e3));
        c(false);
        b(false);
    }

    public final void e()
    {
        (new com.tinder.c.d(getActivity(), ak)).show();
    }

    public final void f()
    {
        am.setVisibility(0);
        (new ab(getActivity(), ak)).show();
    }

    public final void g()
    {
        (new com.tinder.c.c(getActivity())).show();
    }

    public final void h()
    {
        an.setVisibility(0);
        am.setVisibility(4);
    }

    public final void i()
    {
        an.setVisibility(8);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            O = bundle.getInt("instagramConnectValue", 1);
            if (O != 1)
            {
                o();
                r.post(new Runnable() {

                    final w a;

                    public final void run()
                    {
                        w.h(a).fullScroll(130);
                    }

            
            {
                a = w.this;
                super();
            }
                });
            }
        }
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        String.format("onActivityResult %s %s", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        i1;
        JVM INSTR lookupswitch 2: default 52
    //                   7: 60
    //                   1111: 146;
           goto _L1 _L2 _L3
_L1:
        super.onActivityResult(i1, j1, intent);
_L5:
        return;
_L2:
        switch (j1)
        {
        default:
            com.tinder.managers.a.a(new SparksEvent("Account.InstagramLoginFail"));
            e();
            return;

        case 0: // '\0'
            break;

        case -1: 
            intent = intent.getStringExtra("access_code");
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!TextUtils.isEmpty(intent))
        {
            ak.a(intent);
            return;
        } else
        {
            com.tinder.managers.a.a(new SparksEvent("Account.InstagramLoginFail"));
            e();
            return;
        }
_L3:
        float f1;
        float f2;
        float f3;
        float f4;
        String s1;
        Object obj1;
        if (j1 != -1 || intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = intent.getStringExtra("source");
        obj1 = intent.getStringExtra("id");
        f1 = intent.getFloatExtra("xoffset_percent", -1F);
        f2 = intent.getFloatExtra("yoffset_percent", -1F);
        f3 = intent.getFloatExtra("xdistance_percent", -1F);
        f4 = intent.getFloatExtra("ydistance_percent", -1F);
        if (f1 == -1F || f2 == -1F || f3 == -1F || f4 == -1F) goto _L5; else goto _L6
_L6:
        (new StringBuilder("cropXOff: ")).append(f1).append(" cropXDist: ").append(f3).append(" cropYOff: ").append(f2).append(" cropYDist: ").append(f4);
        obj1 = new ProfilePhoto(((String) (obj1)), s1);
        obj1.xOffsetPercent = f1;
        obj1.yOffsetPercent = f2;
        obj1.xDistancePercent = f3;
        obj1.yDistancePercent = f4;
        int k1 = ap;
        boolean flag = false;
        if (k1 < V.length)
        {
            Object obj = V[k1];
            Object obj2;
            String s2;
            Object obj3;
            JSONObject jsonobject;
            int l1;
            if (obj != null)
            {
                ac = ((ProfilePhoto) (obj)).getPhotoId();
                flag = ((ProfilePhoto) (obj)).isMain;
            } else
            {
                flag = false;
            }
        } else
        {
            ac = null;
        }
        ao = ao + 1;
        obj2 = a;
        l1 = ad;
        s2 = ac;
        obj = new JSONObject();
        try
        {
            obj3 = new JSONArray();
            jsonobject = new JSONObject();
            jsonobject.put("id", ((ProfilePhoto) (obj1)).facebookId);
            jsonobject.put("xdistance_percent", ((ProfilePhoto) (obj1)).xDistancePercent);
            jsonobject.put("ydistance_percent", ((ProfilePhoto) (obj1)).yDistancePercent);
            jsonobject.put("xoffset_percent", ((ProfilePhoto) (obj1)).xOffsetPercent);
            jsonobject.put("yoffset_percent", ((ProfilePhoto) (obj1)).yOffsetPercent);
            ((JSONArray) (obj3)).put(jsonobject);
            ((JSONObject) (obj)).put("transmit", "fb");
            ((JSONObject) (obj)).put("assets", obj3);
            ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.b(jsonexception.getMessage());
        }
        ((JSONObject) (obj)).toString();
        obj3 = ((z) (obj2)).a.e;
        obj1 = new com.tinder.managers.z._cls5(((z) (obj2)), ((ProfilePhoto) (obj1)), ((ProfilePhoto) (obj1)), s2, l1, k1, this, flag);
        obj2 = new com.tinder.managers.z._cls6(((z) (obj2)), this, k1);
        ManagerApp.h().g();
        obj = new com.tinder.a.d(1, ((String) (obj3)), ((JSONObject) (obj)), ((com.android.volley.i.b) (obj1)), ((com.android.volley.i.a) (obj2)), com.tinder.managers.d.b());
        obj.j = new com.android.volley.c(20000, 3, 1.0F);
        ManagerApp.b().a(((Request) (obj)));
        ((ProgressBar)X.get(k1)).setVisibility(0);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
        if (context instanceof Activity)
        {
            ((Activity)context).getWindow().setSoftInputMode(16);
        }
    }

    public final void onCheckedChanged(RadioGroup radiogroup, int i1)
    {
        if (i1 == 0x7f0e0292)
        {
            radiogroup = Gender.MALE;
        } else
        {
            radiogroup = Gender.FEMALE;
        }
        S = radiogroup;
    }

    public final void onClick(View view)
    {
        (new StringBuilder("view=")).append(view);
        switch (view.getId())
        {
        default:
            return;

        case 2131624455: 
            a(true);
            return;

        case 2131624563: 
        case 2131624565: 
            e(0);
            return;

        case 2131624566: 
        case 2131624568: 
            e(1);
            return;

        case 2131624569: 
        case 2131624571: 
            e(2);
            return;

        case 2131624578: 
        case 2131624580: 
            e(3);
            return;

        case 2131624575: 
        case 2131624577: 
            e(4);
            return;

        case 2131624572: 
        case 2131624574: 
            e(5);
            return;

        case 2131624590: 
            O = 1;
            break;
        }
        o();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            ap = bundle.getInt("key_photo_pos", 0);
        }
        Q = new Intent(getActivity(), com/tinder/activities/ActivityAddPhoto);
        Q.addFlags(0x4000000);
        R = a.b();
        j();
        P = new u(getActivity());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030097, viewgroup, false);
        f = (ImageView)layoutinflater.findViewById(0x7f0e0273);
        g = (ImageView)layoutinflater.findViewById(0x7f0e0276);
        h = (ImageView)layoutinflater.findViewById(0x7f0e0279);
        i = (ImageView)layoutinflater.findViewById(0x7f0e0282);
        j = (ImageView)layoutinflater.findViewById(0x7f0e027f);
        k = (ImageView)layoutinflater.findViewById(0x7f0e027c);
        l = (ImageView)layoutinflater.findViewById(0x7f0e0275);
        m = (ImageView)layoutinflater.findViewById(0x7f0e0278);
        n = (ImageView)layoutinflater.findViewById(0x7f0e027b);
        o = (ImageView)layoutinflater.findViewById(0x7f0e0284);
        p = (ImageView)layoutinflater.findViewById(0x7f0e0281);
        q = (ImageView)layoutinflater.findViewById(0x7f0e027e);
        s = (LinearLayout)layoutinflater.findViewById(0x7f0e0285);
        t = (EditText)layoutinflater.findViewById(0x7f0e0287);
        u = (TextView)layoutinflater.findViewById(0x7f0e0288);
        w = (GridLayout)layoutinflater.findViewById(0x7f0e0272);
        x = (ProgressBar)layoutinflater.findViewById(0x7f0e0274);
        y = (ProgressBar)layoutinflater.findViewById(0x7f0e0277);
        z = (ProgressBar)layoutinflater.findViewById(0x7f0e027a);
        A = (ProgressBar)layoutinflater.findViewById(0x7f0e0283);
        B = (ProgressBar)layoutinflater.findViewById(0x7f0e0280);
        C = (ProgressBar)layoutinflater.findViewById(0x7f0e027d);
        r = (ScrollView)layoutinflater.findViewById(0x7f0e006b);
        D = layoutinflater.findViewById(0x7f0e008b);
        E = layoutinflater.findViewById(0x7f0e01ab);
        F = layoutinflater.findViewById(0x7f0e008a);
        G = (ImageView)layoutinflater.findViewById(0x7f0e026e);
        H = (ImageView)layoutinflater.findViewById(0x7f0e026f);
        I = (ImageView)layoutinflater.findViewById(0x7f0e0270);
        al = (CustomTextView)layoutinflater.findViewById(0x7f0e028f);
        am = (CustomTextView)layoutinflater.findViewById(0x7f0e0290);
        v = (TextView)layoutinflater.findViewById(0x7f0e0286);
        layoutinflater.findViewById(0x7f0e028e).setOnClickListener(this);
        an = (ProgressBar)layoutinflater.findViewById(0x7f0e00a7);
        L = layoutinflater.findViewById(0x7f0e0289);
        M = layoutinflater.findViewById(0x7f0e028b);
        J = (CustomTextView)layoutinflater.findViewById(0x7f0e028c);
        K = (CustomTextView)layoutinflater.findViewById(0x7f0e028a);
        N = (RadioGroup)layoutinflater.findViewById(0x7f0e0291);
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        com.tinder.utils.ad.c(P);
    }

    public final void onPause()
    {
        super.onPause();
        (new StringBuilder()).append(this).append(" ENTER mSelectingPic: ").append(aa);
        if (!aa)
        {
            a(false);
        }
        if (getActivity() != null)
        {
            getActivity().getWindow().setSoftInputMode(32);
        }
    }

    public final void onResume()
    {
        super.onResume();
        (new StringBuilder("ENTER :")).append(this);
        aa = false;
        l();
        m();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("key_photo_pos", ap);
        super.onSaveInstanceState(bundle);
    }

    public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        (new StringBuilder("ENTER : ")).append(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        W = new ArrayList(6);
        W.add(f);
        W.add(g);
        W.add(h);
        W.add(i);
        W.add(j);
        W.add(k);
        W.trimToSize();
        X = new ArrayList(6);
        X.add(x);
        X.add(y);
        X.add(z);
        X.add(A);
        X.add(B);
        X.add(C);
        Y = new ArrayList(6);
        Y.add(l);
        Y.add(m);
        Y.add(n);
        Y.add(o);
        Y.add(p);
        Y.add(q);
        if (R != null)
        {
            Z = R.getBio();
            v.setText((new StringBuilder()).append(getString(0x7f060057)).append(' ').append(R.getName()).toString());
        }
        if (Z != null && Z.length() > 500)
        {
            Z = Z.substring(0, 500);
        }
        t.setText(Z);
        t.addTextChangedListener(this);
        b(Z);
        S = R.getGender();
        int i1;
        if (S == Gender.MALE)
        {
            i1 = 0x7f0e0292;
        } else
        {
            i1 = 0x7f0e0293;
        }
        N.check(i1);
        N.setOnCheckedChangeListener(this);
        n();
        w.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final w a;

            public final boolean onPreDraw()
            {
                int j1 = w.g(a).getMeasuredWidth();
                int l1 = (j1 + 0) / 3;
                int i2 = (j1 - l1) + 0;
                w.g(a).getChildAt(0).getLayoutParams().width = i2;
                w.g(a).getChildAt(0).getLayoutParams().height = i2;
                for (int k1 = 1; k1 < com.tinder.fragments.w.a(a).length; k1++)
                {
                    w.g(a).getChildAt(k1).getLayoutParams().width = l1;
                    w.g(a).getChildAt(k1).getLayoutParams().height = l1;
                }

                w.g(a).setVisibility(0);
                com.tinder.fragments.w.a(a, i2 / l1);
                w.b(a, (float)l1 / (float)i2);
                return true;
            }

            
            {
                a = w.this;
                super();
            }
        });
        view = new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view1)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = w.this;
                super();
            }
        };
        D.setOnClickListener(view);
        F.setOnClickListener(view);
        E.setOnClickListener(view);
        ak = new com.tinder.g.a(this, b);
        view = com.tinder.managers.ae.v();
        bundle = getResources().getString(0x7f0600e3);
        if (!TextUtils.isEmpty(view))
        {
            al.setText(view);
            c(true);
            b(true);
        } else
        {
            al.setText(bundle);
            c(false);
            b(false);
        }
        an.setVisibility(8);
        L.setOnClickListener(new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view1)
            {
                a.startActivity(new Intent(a.getActivity(), com/tinder/activities/ActivityJob));
            }

            
            {
                a = w.this;
                super();
            }
        });
        M.setOnClickListener(new android.view.View.OnClickListener() {

            final w a;

            public final void onClick(View view1)
            {
                a.startActivity(new Intent(a.getActivity(), com/tinder/activities/ActivitySchool));
            }

            
            {
                a = w.this;
                super();
            }
        });
        m();
    }

    public final void u()
    {
        if (P != null && P.isShowing())
        {
            P.dismiss();
        }
        if (getActivity() != null && T)
        {
            Toast.makeText(getActivity(), 0x7f06020f, 1).show();
            getActivity().setResult(-1);
            getActivity().finish();
        }
    }

    public final void v()
    {
        if (getActivity() != null)
        {
            Toast.makeText(getActivity(), 0x7f0600b8, 1).show();
        }
        com.tinder.utils.ad.c(P);
    }
}

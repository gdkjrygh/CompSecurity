// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

public final class cxg extends Fragment
{

    cxk a;
    int b;
    com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState c;
    private Activity d;
    private GestureDetector e;
    private Handler f;
    private Runnable g;
    private Runnable h;
    private View i;
    private boolean j;

    public cxg()
    {
    }

    private void a()
    {
        if (!j)
        {
            f.removeCallbacks(g);
            f.removeCallbacks(h);
            UpdateDisplayState.a(b);
            d.getFragmentManager().beginTransaction().remove(this).commit();
        }
        j = true;
    }

    static void a(cxg cxg1)
    {
        if (cxg1.d != null && !cxg1.j)
        {
            cxg1.f.removeCallbacks(cxg1.g);
            cxg1.f.removeCallbacks(cxg1.h);
            cxg1.d.getFragmentManager().beginTransaction().setCustomAnimations(0, 0x7f040015).remove(cxg1).commit();
            UpdateDisplayState.a(cxg1.b);
            cxg1.j = true;
        }
    }

    static View b(cxg cxg1)
    {
        return cxg1.i;
    }

    static com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState c(cxg cxg1)
    {
        return cxg1.c;
    }

    static GestureDetector d(cxg cxg1)
    {
        return cxg1.e;
    }

    static Activity e(cxg cxg1)
    {
        return cxg1.d;
    }

    static cxk f(cxg cxg1)
    {
        return cxg1.a;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = activity;
        if (c == null)
        {
            a();
            return;
        } else
        {
            f = new Handler();
            g = new Runnable() {

                private cxg a;

                public final void run()
                {
                    cxg.a(a);
                }

            
            {
                a = cxg.this;
                super();
            }
            };
            h = new Runnable() {

                final cxg a;

                public final void run()
                {
                    cxg.b(a).setVisibility(0);
                    cxg.b(a).setBackgroundColor(cxg.c(a).b);
                    cxg.b(a).setOnTouchListener(new android.view.View.OnTouchListener(this) {

                        private _cls2 a;

                        public final boolean onTouch(View view, MotionEvent motionevent)
                        {
                            return cxg.d(a.a).onTouchEvent(motionevent);
                        }

            
            {
                a = _pcls2;
                super();
            }
                    });
                    ImageView imageview = (ImageView)cxg.b(a).findViewById(0x7f11031a);
                    float f1 = TypedValue.applyDimension(1, 75F, cxg.e(a).getResources().getDisplayMetrics());
                    Object obj = new TranslateAnimation(0.0F, 0.0F, f1, 0.0F);
                    ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
                    ((TranslateAnimation) (obj)).setDuration(200L);
                    cxg.b(a).startAnimation(((android.view.animation.Animation) (obj)));
                    obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, f1 / 2.0F, f1 / 2.0F);
                    ((ScaleAnimation) (obj)).setInterpolator(new cxh());
                    ((ScaleAnimation) (obj)).setDuration(400L);
                    ((ScaleAnimation) (obj)).setStartOffset(200L);
                    imageview.startAnimation(((android.view.animation.Animation) (obj)));
                }

            
            {
                a = cxg.this;
                super();
            }
            };
            e = new GestureDetector(activity, new android.view.GestureDetector.OnGestureListener() {

                private cxg a;

                public final boolean onDown(MotionEvent motionevent)
                {
                    return true;
                }

                public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
                {
                    if (f2 > 0.0F)
                    {
                        cxg.a(a);
                    }
                    return true;
                }

                public final void onLongPress(MotionEvent motionevent)
                {
                }

                public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
                {
                    return false;
                }

                public final void onShowPress(MotionEvent motionevent)
                {
                }

                public final boolean onSingleTapUp(MotionEvent motionevent)
                {
                    motionevent = cxg.c(a).a;
                    Object obj = ((InAppNotification) (motionevent)).g;
                    if (obj != null && ((String) (obj)).length() > 0)
                    {
                        try
                        {
                            obj = Uri.parse(((String) (obj)));
                        }
                        // Misplaced declaration of an exception variable
                        catch (MotionEvent motionevent)
                        {
                            Log.i("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", motionevent);
                            return true;
                        }
                        try
                        {
                            Intent intent = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
                            cxg.e(a).startActivity(intent);
                            cxg.f(a).b.a("$campaign_open", motionevent);
                        }
                        // Misplaced declaration of an exception variable
                        catch (MotionEvent motionevent)
                        {
                            Log.i("MixpanelAPI.InAppFrag", (new StringBuilder("User doesn't have an activity for notification URI ")).append(obj).toString());
                        }
                    }
                    cxg.a(a);
                    return true;
                }

            
            {
                a = cxg.this;
                super();
            }
            });
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = false;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (c == null)
        {
            a();
        } else
        {
            i = layoutinflater.inflate(0x7f030061, viewgroup, false);
            layoutinflater = (TextView)i.findViewById(0x7f110317);
            viewgroup = (ImageView)i.findViewById(0x7f11031a);
            bundle = c.a;
            layoutinflater.setText(((InAppNotification) (bundle)).c);
            viewgroup.setImageBitmap(((InAppNotification) (bundle)).a);
            f.postDelayed(g, 10000L);
        }
        return i;
    }

    public final void onPause()
    {
        super.onPause();
        a();
    }

    public final void onResume()
    {
        super.onResume();
        f.postDelayed(h, 500L);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        a();
        super.onSaveInstanceState(bundle);
    }

    public final void onStart()
    {
        super.onStart();
        if (j)
        {
            d.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }
}

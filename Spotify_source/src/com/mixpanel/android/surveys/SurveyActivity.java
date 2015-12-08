// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.Survey;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import cwv;
import cwx;
import cxi;
import cxk;
import cxm;
import cyb;
import cyh;
import cyi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout, FadingImageView

public class SurveyActivity extends Activity
{

    private static final int k = Color.argb(255, 90, 90, 90);
    private AlertDialog a;
    private CardCarouselLayout b;
    private cxk c;
    private View d;
    private View e;
    private TextView f;
    private UpdateDisplayState g;
    private boolean h;
    private int i;
    private int j;

    public SurveyActivity()
    {
        h = false;
        i = 0;
        j = -1;
    }

    private com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState a()
    {
        return (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState)g.c;
    }

    static cxk a(SurveyActivity surveyactivity)
    {
        return surveyactivity.c;
    }

    private void a(int l)
    {
        cyb cyb1;
        Object obj;
        int i1;
        obj = a();
        List list = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).a.c;
        if (l == 0 || list.size() == 0)
        {
            d.setEnabled(false);
        } else
        {
            d.setEnabled(true);
        }
        if (l >= list.size() - 1)
        {
            e.setEnabled(false);
        } else
        {
            e.setEnabled(true);
        }
        i1 = i;
        i = l;
        cyb1 = (cyb)list.get(l);
        obj = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).b.a(Integer.valueOf(cyb1.a));
        if (i1 >= l) goto _L2; else goto _L1
_L1:
        try
        {
            b.a(cyb1, ((String) (obj)), CardCarouselLayout.Direction.a);
        }
        catch (CardCarouselLayout.UnrecognizedAnswerTypeException unrecognizedanswertypeexception)
        {
            goToNextQuestion();
            return;
        }
_L3:
        if (list.size() > 1)
        {
            f.setText((new StringBuilder()).append(l + 1).append(" of ").append(list.size()).toString());
            return;
        } else
        {
            f.setText("");
            return;
        }
_L2:
        if (i1 <= l)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        b.a(cyb1, ((String) (obj)), CardCarouselLayout.Direction.b);
        break MISSING_BLOCK_LABEL_114;
        CardCarouselLayout cardcarousellayout = b;
        cardcarousellayout.a.a(cyb1, ((String) (obj)));
        cardcarousellayout.removeAllViews();
        cardcarousellayout.addView(cardcarousellayout.a.b);
        cardcarousellayout.addView(cardcarousellayout.b.b);
        cardcarousellayout.invalidate();
          goto _L3
    }

    static void a(SurveyActivity surveyactivity, int l)
    {
        surveyactivity.a(l);
    }

    static void a(SurveyActivity surveyactivity, cyb cyb1, String s)
    {
        surveyactivity.a().b.a(Integer.valueOf(cyb1.a), s.toString());
    }

    static int b(SurveyActivity surveyactivity)
    {
        return surveyactivity.j;
    }

    private boolean b()
    {
        if (g == null)
        {
            return false;
        } else
        {
            return "SurveyState".equals(g.c.a());
        }
    }

    static void c(SurveyActivity surveyactivity)
    {
        surveyactivity.goToNextQuestion();
    }

    private boolean c()
    {
        if (g == null)
        {
            return false;
        } else
        {
            return "InAppNotificationState".equals(g.c.a());
        }
    }

    private void completeSurvey()
    {
        finish();
    }

    static boolean d(SurveyActivity surveyactivity)
    {
        surveyactivity.h = true;
        return true;
    }

    static int e(SurveyActivity surveyactivity)
    {
        return surveyactivity.i;
    }

    private void goToNextQuestion()
    {
        int l = a().a.c.size();
        if (i < l - 1)
        {
            a(i + 1);
            return;
        } else
        {
            completeSurvey();
            return;
        }
    }

    private void goToPreviousQuestion()
    {
        if (i > 0)
        {
            a(i - 1);
            return;
        } else
        {
            completeSurvey();
            return;
        }
    }

    public void completeSurvey(View view)
    {
        completeSurvey();
    }

    public void goToNextQuestion(View view)
    {
        goToNextQuestion();
    }

    public void goToPreviousQuestion(View view)
    {
        goToPreviousQuestion();
    }

    public void onBackPressed()
    {
        if (b() && i > 0)
        {
            goToPreviousQuestion();
            return;
        }
        if (c())
        {
            UpdateDisplayState.a(j);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = getIntent().getIntExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", 0x7fffffff);
        g = UpdateDisplayState.b(j);
        if (g == null)
        {
            Log.e("MixpanelAPI.SrvyActvty", "SurveyActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        c = cxk.a(this, g.b);
        if (!c()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        setContentView(0x7f030060);
        obj2 = (ImageView)findViewById(0x7f110314);
        obj = (FadingImageView)findViewById(0x7f11031a);
        bundle = (TextView)findViewById(0x7f110317);
        TextView textview = (TextView)findViewById(0x7f110318);
        Button button = (Button)findViewById(0x7f110319);
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f110315);
        Object obj1 = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)g.c).a;
        Object obj3 = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        ((Display) (obj3)).getSize(point);
        if (getResources().getConfiguration().orientation == 1)
        {
            obj3 = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).setMargins(0, 0, 0, (int)((float)point.y * 0.06F));
            linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        }
        obj3 = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[] {
            0xe560607c, 0xe548485d, 0xe518181f, 0xe518181f
        });
        ((GradientDrawable) (obj3)).setGradientType(1);
        if (getResources().getConfiguration().orientation == 2)
        {
            ((GradientDrawable) (obj3)).setGradientCenter(0.25F, 0.5F);
            ((GradientDrawable) (obj3)).setGradientRadius((float)Math.min(point.x, point.y) * 0.8F);
        } else
        {
            ((GradientDrawable) (obj3)).setGradientCenter(0.5F, 0.33F);
            ((GradientDrawable) (obj3)).setGradientRadius((float)Math.min(point.x, point.y) * 0.7F);
        }
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            ((View) (obj2)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
        } else
        {
            ((View) (obj2)).setBackground(((android.graphics.drawable.Drawable) (obj3)));
        }
        bundle.setText(((InAppNotification) (obj1)).c);
        textview.setText(((InAppNotification) (obj1)).d);
        obj2 = ((InAppNotification) (obj1)).a;
        ((FadingImageView) (obj)).setBackgroundResource(0x7f02016a);
        if (((Bitmap) (obj2)).getWidth() >= 100 && ((Bitmap) (obj2)).getHeight() >= 100) goto _L4; else goto _L3
_L3:
        ((FadingImageView) (obj)).setBackgroundResource(0x7f02016b);
_L10:
        ((FadingImageView) (obj)).setImageBitmap(((Bitmap) (obj2)));
        obj2 = ((InAppNotification) (obj1)).g;
        if (obj2 != null && ((String) (obj2)).length() > 0)
        {
            button.setText(((InAppNotification) (obj1)).f);
        }
        button.setOnClickListener(new android.view.View.OnClickListener(((InAppNotification) (obj1))) {

            private InAppNotification a;
            private SurveyActivity b;

            public final void onClick(View view)
            {
                view = a.g;
                if (view != null && view.length() > 0)
                {
                    try
                    {
                        view = Uri.parse(view);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Log.i("MixpanelAPI.SrvyActvty", "Can't parse notification URI, will not take any action", view);
                        return;
                    }
                    try
                    {
                        view = new Intent("android.intent.action.VIEW", view);
                        b.startActivity(view);
                        SurveyActivity.a(b).b.a("$campaign_open", a);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Log.i("MixpanelAPI.SrvyActvty", "User doesn't have an activity for notification URI");
                    }
                }
                b.finish();
                UpdateDisplayState.a(SurveyActivity.b(b));
            }

            
            {
                b = SurveyActivity.this;
                a = inappnotification;
                super();
            }
        });
        button.setOnTouchListener(new android.view.View.OnTouchListener() {

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundResource(0x7f020154);
                } else
                {
                    view.setBackgroundResource(0x7f020153);
                }
                return false;
            }

        });
        linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

            private SurveyActivity a;

            public final void onClick(View view)
            {
                a.finish();
                UpdateDisplayState.a(SurveyActivity.b(a));
            }

            
            {
                a = SurveyActivity.this;
                super();
            }
        });
        obj1 = new ScaleAnimation(0.95F, 1.0F, 0.95F, 1.0F, 1, 0.5F, 1, 1.0F);
        ((ScaleAnimation) (obj1)).setDuration(200L);
        ((FadingImageView) (obj)).startAnimation(((android.view.animation.Animation) (obj1)));
        obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.5F, 1, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(200L);
        bundle.startAnimation(((android.view.animation.Animation) (obj)));
        textview.startAnimation(((android.view.animation.Animation) (obj)));
        button.startAnimation(((android.view.animation.Animation) (obj)));
        linearlayout.startAnimation(AnimationUtils.loadAnimation(this, 0x7f040013));
        return;
_L4:
        int k1 = ((Bitmap) (obj2)).getHeight() / 100;
        int l1 = ((Bitmap) (obj2)).getWidth() / 100;
        Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj2)), l1, k1, false);
        int l = 0;
        do
        {
            if (l >= l1)
            {
                continue; /* Loop/switch isn't completed */
            }
            int j1 = 0;
            do
            {
                if (j1 >= k1)
                {
                    break;
                }
                if (Color.alpha(bitmap.getPixel(l, j1)) < 255)
                {
                    ((FadingImageView) (obj)).setBackgroundResource(0x7f02016b);
                    continue; /* Loop/switch isn't completed */
                }
                j1++;
            } while (true);
            l++;
        } while (true);
_L2:
        if (!b())
        {
            break MISSING_BLOCK_LABEL_971;
        }
        if (android.os.Build.VERSION.SDK_INT < 18) goto _L6; else goto _L5
_L5:
        setRequestedOrientation(14);
_L8:
        if (bundle != null)
        {
            i = bundle.getInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", 0);
            h = bundle.getBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY");
        }
        if (g.a == null)
        {
            Log.i("MixpanelAPI.SrvyActvty", "Can't show a survey to a user with no distinct id set");
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        int i1 = getResources().getConfiguration().orientation;
        if (i1 == 2)
        {
            setRequestedOrientation(0);
        } else
        if (i1 == 1)
        {
            setRequestedOrientation(1);
        }
        if (true) goto _L8; else goto _L7
_L7:
        setContentView(0x7f030062);
        bundle = a().c;
        if (bundle == null)
        {
            findViewById(0x7f11031b).setBackgroundColor(k);
        } else
        {
            getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), bundle));
        }
        d = findViewById(0x7f11031c);
        e = findViewById(0x7f11031e);
        f = (TextView)findViewById(0x7f11031d);
        b = (CardCarouselLayout)findViewById(0x7f11031f);
        b.c = new cyh() {

            private SurveyActivity a;

            public final void a(cyb cyb1, String s)
            {
                SurveyActivity.a(a, cyb1, s);
                SurveyActivity.c(a);
            }

            
            {
                a = SurveyActivity.this;
                super();
            }
        };
        return;
        finish();
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void onDestroy()
    {
        if (b())
        {
            if (c != null)
            {
                if (g != null)
                {
                    Object obj1 = a();
                    Survey survey = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).a;
                    Object obj2 = survey.c;
                    Object obj = g.a;
                    obj = c.b.c(((String) (obj)));
                    ((cxm) (obj)).b("$responses", Integer.valueOf(survey.b));
                    obj1 = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).b;
                    obj2 = ((List) (obj2)).iterator();
                    do
                    {
                        if (!((Iterator) (obj2)).hasNext())
                        {
                            break;
                        }
                        Object obj3 = (cyb)((Iterator) (obj2)).next();
                        String s = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.AnswerMap) (obj1)).a(Integer.valueOf(((cyb) (obj3)).a));
                        if (s != null)
                        {
                            try
                            {
                                JSONObject jsonobject = new JSONObject();
                                jsonobject.put("$survey_id", survey.a);
                                jsonobject.put("$collection_id", survey.b);
                                jsonobject.put("$question_id", ((cyb) (obj3)).a);
                                jsonobject.put("$question_type", ((cyb) (obj3)).a().toString());
                                obj3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                                ((DateFormat) (obj3)).setTimeZone(TimeZone.getTimeZone("UTC"));
                                jsonobject.put("$time", ((DateFormat) (obj3)).format(new Date()));
                                jsonobject.put("$value", s);
                                ((cxm) (obj)).b("$answers", jsonobject);
                            }
                            catch (JSONException jsonexception)
                            {
                                Log.e("MixpanelAPI.SrvyActvty", "Couldn't record user's answer.", jsonexception);
                            }
                        }
                    } while (true);
                }
                cwv cwv1 = c.a;
                Message message = Message.obtain();
                message.what = 2;
                cwv1.a.a(message);
            }
            UpdateDisplayState.a(j);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        if (a != null)
        {
            a.dismiss();
            a = null;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (b())
        {
            bundle.putBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY", h);
            bundle.putInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", i);
            bundle.putParcelable("com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY", g);
        }
    }

    protected void onStart()
    {
        super.onStart();
        com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState displaystate = g.c;
        if (displaystate != null && displaystate.a() == "SurveyState" && !h)
        {
            if (!cxi.a(this).f)
            {
                Survey survey = a().a;
                cxm cxm1 = c.b.c(g.a);
                cxm1.b("$surveys", Integer.valueOf(survey.a));
                cxm1.b("$collections", Integer.valueOf(survey.b));
            }
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle(0x7f08061a);
            builder.setMessage(0x7f080619);
            builder.setPositiveButton(0x7f080618, new android.content.DialogInterface.OnClickListener() {

                private SurveyActivity a;

                public final void onClick(DialogInterface dialoginterface, int l)
                {
                    a.findViewById(0x7f11031b).setVisibility(0);
                    SurveyActivity.d(a);
                    SurveyActivity.a(a, SurveyActivity.e(a));
                }

            
            {
                a = SurveyActivity.this;
                super();
            }
            });
            builder.setNegativeButton(0x7f080615, new android.content.DialogInterface.OnClickListener() {

                private SurveyActivity a;

                public final void onClick(DialogInterface dialoginterface, int l)
                {
                    a.finish();
                }

            
            {
                a = SurveyActivity.this;
                super();
            }
            });
            builder.setCancelable(false);
            a = builder.create();
            a.show();
        }
    }

}

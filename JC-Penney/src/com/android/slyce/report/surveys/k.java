// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
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
import com.android.a.b;
import com.android.a.c;
import com.android.a.d;
import com.android.a.e;
import com.android.slyce.report.mpmetrics.InAppNotification;
import com.android.slyce.report.mpmetrics.Survey;
import com.android.slyce.report.mpmetrics.UpdateDisplayState;
import com.android.slyce.report.mpmetrics.ab;
import com.android.slyce.report.mpmetrics.af;
import com.android.slyce.report.mpmetrics.ak;
import com.android.slyce.report.mpmetrics.bf;
import com.android.slyce.report.mpmetrics.bg;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.surveys:
//            p, q, j, d, 
//            CardCarouselLayout, FadingImageView, l, m, 
//            n, o

public class k extends Activity
{

    private static final int k = Color.argb(255, 90, 90, 90);
    private AlertDialog a;
    private CardCarouselLayout b;
    private af c;
    private View d;
    private View e;
    private TextView f;
    private UpdateDisplayState g;
    private boolean h;
    private int i;
    private int j;

    public k()
    {
        h = false;
        i = 0;
        j = -1;
    }

    static af a(k k1)
    {
        return k1.c;
    }

    private void a()
    {
        if (h)
        {
            return;
        }
        if (!ab.a(this).h())
        {
            f();
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("We'd love your feedback!");
        builder.setMessage("Mind taking a quick survey?");
        builder.setPositiveButton("Sure", new p(this));
        builder.setNegativeButton("No, Thanks", new q(this));
        builder.setCancelable(false);
        a = builder.create();
        a.show();
    }

    private void a(int i1)
    {
        bf bf1;
        Object obj;
        int k1;
        obj = c();
        List list = ((com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).d().d();
        if (i1 == 0 || list.size() == 0)
        {
            d.setEnabled(false);
        } else
        {
            d.setEnabled(true);
        }
        if (i1 >= list.size() - 1)
        {
            e.setEnabled(false);
        } else
        {
            e.setEnabled(true);
        }
        k1 = i;
        i = i1;
        bf1 = (bf)list.get(i1);
        obj = ((com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).c().a(Integer.valueOf(bf1.a()));
        if (k1 >= i1) goto _L2; else goto _L1
_L1:
        try
        {
            b.a(bf1, ((String) (obj)), d.a);
        }
        catch (j j1)
        {
            goToNextQuestion();
            return;
        }
_L3:
        if (list.size() > 1)
        {
            f.setText((new StringBuilder()).append("").append(i1 + 1).append(" of ").append(list.size()).toString());
            return;
        } else
        {
            f.setText("");
            return;
        }
_L2:
        if (k1 <= i1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        b.a(bf1, ((String) (obj)), com.android.slyce.report.surveys.d.b);
        break MISSING_BLOCK_LABEL_114;
        b.a(bf1, ((String) (obj)));
          goto _L3
    }

    private void a(Bundle bundle)
    {
        Object obj;
        Object obj2;
        setContentView(e.com_mixpanel_android_activity_notification_full);
        obj2 = (ImageView)findViewById(d.com_mixpanel_android_notification_gradient);
        obj = (FadingImageView)findViewById(d.com_mixpanel_android_notification_image);
        bundle = (TextView)findViewById(d.com_mixpanel_android_notification_title);
        TextView textview = (TextView)findViewById(d.com_mixpanel_android_notification_subtext);
        Button button = (Button)findViewById(d.com_mixpanel_android_notification_button);
        LinearLayout linearlayout = (LinearLayout)findViewById(d.com_mixpanel_android_button_exit_wrapper);
        Object obj1 = ((com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)g.c()).c();
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
        a(((View) (obj2)), ((Drawable) (obj3)));
        bundle.setText(((InAppNotification) (obj1)).e());
        textview.setText(((InAppNotification) (obj1)).f());
        obj2 = ((InAppNotification) (obj1)).k();
        ((FadingImageView) (obj)).setBackgroundResource(c.com_mixpanel_android_square_dropshadow);
        if (((Bitmap) (obj2)).getWidth() >= 100 && ((Bitmap) (obj2)).getHeight() >= 100) goto _L2; else goto _L1
_L1:
        ((FadingImageView) (obj)).setBackgroundResource(c.com_mixpanel_android_square_nodropshadow);
_L4:
        ((FadingImageView) (obj)).setImageBitmap(((Bitmap) (obj2)));
        obj2 = ((InAppNotification) (obj1)).j();
        if (obj2 != null && ((String) (obj2)).length() > 0)
        {
            button.setText(((InAppNotification) (obj1)).i());
        }
        button.setOnClickListener(new l(this, ((InAppNotification) (obj1))));
        button.setOnTouchListener(new m(this));
        linearlayout.setOnClickListener(new n(this));
        obj1 = new ScaleAnimation(0.95F, 1.0F, 0.95F, 1.0F, 1, 0.5F, 1, 1.0F);
        ((ScaleAnimation) (obj1)).setDuration(200L);
        ((FadingImageView) (obj)).startAnimation(((android.view.animation.Animation) (obj1)));
        obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.5F, 1, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(200L);
        bundle.startAnimation(((android.view.animation.Animation) (obj)));
        textview.startAnimation(((android.view.animation.Animation) (obj)));
        button.startAnimation(((android.view.animation.Animation) (obj)));
        linearlayout.startAnimation(AnimationUtils.loadAnimation(this, b.com_mixpanel_android_fade_in));
        return;
_L2:
        if (Color.alpha(Bitmap.createScaledBitmap(((Bitmap) (obj2)), 1, 1, false).getPixel(0, 0)) < 255)
        {
            ((FadingImageView) (obj)).setBackgroundResource(c.com_mixpanel_android_square_nodropshadow);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            view.setBackgroundDrawable(drawable);
            return;
        } else
        {
            view.setBackground(drawable);
            return;
        }
    }

    private void a(bf bf1, String s)
    {
        c().c().a(Integer.valueOf(bf1.a()), s.toString());
    }

    static void a(k k1, int i1)
    {
        k1.a(i1);
    }

    static void a(k k1, bf bf1, String s)
    {
        k1.a(bf1, s);
    }

    static boolean a(k k1, boolean flag)
    {
        k1.h = flag;
        return flag;
    }

    static int b(k k1)
    {
        return k1.j;
    }

    private void b()
    {
        if (c != null)
        {
            if (g != null)
            {
                Object obj1 = c();
                Survey survey = ((com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).d();
                Object obj2 = survey.d();
                Object obj = g.d();
                obj = c.c().c(((String) (obj)));
                ((ak) (obj)).a("$responses", Integer.valueOf(survey.c()));
                obj1 = ((com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).c();
                obj2 = ((List) (obj2)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    Object obj3 = (bf)((Iterator) (obj2)).next();
                    String s = ((com.android.slyce.report.mpmetrics.UpdateDisplayState.AnswerMap) (obj1)).a(Integer.valueOf(((bf) (obj3)).a()));
                    if (s != null)
                    {
                        try
                        {
                            JSONObject jsonobject = new JSONObject();
                            jsonobject.put("$survey_id", survey.b());
                            jsonobject.put("$collection_id", survey.c());
                            jsonobject.put("$question_id", ((bf) (obj3)).a());
                            jsonobject.put("$question_type", ((bf) (obj3)).d().toString());
                            obj3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                            ((DateFormat) (obj3)).setTimeZone(TimeZone.getTimeZone("UTC"));
                            jsonobject.put("$time", ((DateFormat) (obj3)).format(new Date()));
                            jsonobject.put("$value", s);
                            ((ak) (obj)).a("$answers", jsonobject);
                        }
                        catch (JSONException jsonexception)
                        {
                            Log.e("MixpanelAPI.SurveyActivity", "Couldn't record user's answer.", jsonexception);
                        }
                    }
                } while (true);
            }
            c.a();
        }
        UpdateDisplayState.a(j);
    }

    private void b(Bundle bundle)
    {
        g();
        if (bundle != null)
        {
            i = bundle.getInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", 0);
            h = bundle.getBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY");
        }
        if (g.d() == null)
        {
            Log.i("MixpanelAPI.SurveyActivity", "Can't show a survey to a user with no distinct id set");
            finish();
            return;
        }
        setContentView(e.com_mixpanel_android_activity_survey);
        bundle = c().b();
        if (bundle == null)
        {
            findViewById(d.com_mixpanel_android_activity_survey_id).setBackgroundColor(k);
        } else
        {
            getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), bundle));
        }
        d = findViewById(d.com_mixpanel_android_button_previous);
        e = findViewById(d.com_mixpanel_android_button_next);
        f = (TextView)findViewById(d.com_mixpanel_android_progress_text);
        b = (CardCarouselLayout)findViewById(d.com_mixpanel_android_question_card_holder);
        b.setOnQuestionAnsweredListener(new o(this));
    }

    private com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.SurveyState c()
    {
        return (com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState.SurveyState)g.c();
    }

    private void c(Bundle bundle)
    {
        bundle.putBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY", h);
        bundle.putInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", i);
        bundle.putParcelable("com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY", g);
    }

    static void c(k k1)
    {
        k1.goToNextQuestion();
    }

    private void completeSurvey()
    {
        finish();
    }

    static int d(k k1)
    {
        return k1.i;
    }

    private boolean d()
    {
        if (g == null)
        {
            return false;
        } else
        {
            return "SurveyState".equals(g.c().a());
        }
    }

    private boolean e()
    {
        if (g == null)
        {
            return false;
        } else
        {
            return "InAppNotificationState".equals(g.c().a());
        }
    }

    private void f()
    {
        Survey survey = c().d();
        ak ak1 = c.c().c(g.d());
        ak1.a("$surveys", Integer.valueOf(survey.b()));
        ak1.a("$collections", Integer.valueOf(survey.c()));
    }

    private void g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            setRequestedOrientation(14);
        } else
        {
            int i1 = getResources().getConfiguration().orientation;
            if (i1 == 2)
            {
                setRequestedOrientation(0);
                return;
            }
            if (i1 == 1)
            {
                setRequestedOrientation(1);
                return;
            }
        }
    }

    private void goToNextQuestion()
    {
        int i1 = c().d().d().size();
        if (i < i1 - 1)
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
        if (d() && i > 0)
        {
            goToPreviousQuestion();
            return;
        }
        if (e())
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
            Log.e("MixpanelAPI.SurveyActivity", "SurveyActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        c = af.a(this, g.e());
        if (e())
        {
            a(bundle);
            return;
        }
        if (d())
        {
            b(bundle);
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onDestroy()
    {
        if (d())
        {
            b();
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
        if (d())
        {
            c(bundle);
        }
    }

    protected void onStart()
    {
        super.onStart();
        com.android.slyce.report.mpmetrics.UpdateDisplayState.DisplayState displaystate = g.c();
        if (displaystate != null && displaystate.a() == "SurveyState")
        {
            a();
        }
    }

}

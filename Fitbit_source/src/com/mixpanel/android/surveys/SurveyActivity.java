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
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
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
import com.mixpanel.android.mpmetrics.g;
import com.mixpanel.android.mpmetrics.h;
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

    public static final String a = "com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY";
    private static final String l = "com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY";
    private static final String m = "com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY";
    private static final String n = "com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY";
    private static final int o = Color.argb(255, 90, 90, 90);
    private static final int p = 100;
    private static final String q = "MixpanelAPI.SrvyActvty";
    private AlertDialog b;
    private CardCarouselLayout c;
    private h d;
    private View e;
    private View f;
    private TextView g;
    private UpdateDisplayState h;
    private boolean i;
    private int j;
    private int k;

    public SurveyActivity()
    {
        i = false;
        j = 0;
        k = -1;
    }

    static h a(SurveyActivity surveyactivity)
    {
        return surveyactivity.d;
    }

    private void a()
    {
        if (i)
        {
            return;
        }
        if (!com.mixpanel.android.mpmetrics.g.a(this).i())
        {
            f();
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(com.mixpanel.android.R.string.com_mixpanel_android_survey_prompt_dialog_title);
        builder.setMessage(com.mixpanel.android.R.string.com_mixpanel_android_survey_prompt_dialog_message);
        builder.setPositiveButton(com.mixpanel.android.R.string.com_mixpanel_android_sure, new android.content.DialogInterface.OnClickListener() {

            final SurveyActivity a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                a.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_activity_survey_id).setVisibility(0);
                SurveyActivity.a(a, true);
                SurveyActivity.a(a, SurveyActivity.d(a));
            }

            
            {
                a = SurveyActivity.this;
                super();
            }
        });
        builder.setNegativeButton(com.mixpanel.android.R.string.com_mixpanel_android_no_thanks, new android.content.DialogInterface.OnClickListener() {

            final SurveyActivity a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                a.finish();
            }

            
            {
                a = SurveyActivity.this;
                super();
            }
        });
        builder.setCancelable(false);
        b = builder.create();
        b.show();
    }

    private void a(int i1)
    {
        com.mixpanel.android.mpmetrics.Survey.a a1;
        Object obj;
        int j1;
        obj = c();
        List list = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).e().d();
        if (i1 == 0 || list.size() == 0)
        {
            e.setEnabled(false);
        } else
        {
            e.setEnabled(true);
        }
        if (i1 >= list.size() - 1)
        {
            f.setEnabled(false);
        } else
        {
            f.setEnabled(true);
        }
        j1 = j;
        j = i1;
        a1 = (com.mixpanel.android.mpmetrics.Survey.a)list.get(i1);
        obj = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).c().a(Integer.valueOf(a1.a()));
        if (j1 >= i1) goto _L2; else goto _L1
_L1:
        try
        {
            c.a(a1, ((String) (obj)), CardCarouselLayout.Direction.a);
        }
        catch (CardCarouselLayout.UnrecognizedAnswerTypeException unrecognizedanswertypeexception)
        {
            goToNextQuestion();
            return;
        }
_L3:
        if (list.size() > 1)
        {
            g.setText((new StringBuilder()).append("").append(i1 + 1).append(" of ").append(list.size()).toString());
            return;
        } else
        {
            g.setText("");
            return;
        }
_L2:
        if (j1 <= i1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        c.a(a1, ((String) (obj)), CardCarouselLayout.Direction.b);
        break MISSING_BLOCK_LABEL_114;
        c.a(a1, ((String) (obj)));
          goto _L3
    }

    private void a(Bundle bundle)
    {
        Object obj;
        Object obj2;
        setContentView(com.mixpanel.android.R.layout.com_mixpanel_android_activity_notification_full);
        obj2 = (ImageView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_gradient);
        obj = (FadingImageView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_image);
        bundle = (TextView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_title);
        TextView textview = (TextView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_subtext);
        Button button = (Button)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_button);
        LinearLayout linearlayout = (LinearLayout)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_button_exit_wrapper);
        Object obj1 = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)h.c()).c();
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
        bundle.setText(((InAppNotification) (obj1)).f());
        textview.setText(((InAppNotification) (obj1)).g());
        obj2 = ((InAppNotification) (obj1)).m();
        ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_square_dropshadow);
        if (((Bitmap) (obj2)).getWidth() >= 100 && ((Bitmap) (obj2)).getHeight() >= 100) goto _L2; else goto _L1
_L1:
        ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_square_nodropshadow);
_L4:
        ((FadingImageView) (obj)).setImageBitmap(((Bitmap) (obj2)));
        obj2 = ((InAppNotification) (obj1)).l();
        if (obj2 != null && ((String) (obj2)).length() > 0)
        {
            button.setText(((InAppNotification) (obj1)).k());
        }
        button.setOnClickListener(new android.view.View.OnClickListener(((InAppNotification) (obj1))) {

            final InAppNotification a;
            final SurveyActivity b;

            public void onClick(View view)
            {
                view = a.l();
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
                        SurveyActivity.a(b).e().a("$campaign_open", a);
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

            final SurveyActivity a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_cta_button_highlight);
                } else
                {
                    view.setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_cta_button);
                }
                return false;
            }

            
            {
                a = SurveyActivity.this;
                super();
            }
        });
        linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

            final SurveyActivity a;

            public void onClick(View view)
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
        linearlayout.startAnimation(AnimationUtils.loadAnimation(this, com.mixpanel.android.R.anim.com_mixpanel_android_fade_in));
        return;
_L2:
        if (Color.alpha(Bitmap.createScaledBitmap(((Bitmap) (obj2)), 1, 1, false).getPixel(0, 0)) < 255)
        {
            ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_square_nodropshadow);
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

    private void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s)
    {
        c().c().a(Integer.valueOf(a1.a()), s.toString());
    }

    static void a(SurveyActivity surveyactivity, int i1)
    {
        surveyactivity.a(i1);
    }

    static void a(SurveyActivity surveyactivity, com.mixpanel.android.mpmetrics.Survey.a a1, String s)
    {
        surveyactivity.a(a1, s);
    }

    static boolean a(SurveyActivity surveyactivity, boolean flag)
    {
        surveyactivity.i = flag;
        return flag;
    }

    static int b(SurveyActivity surveyactivity)
    {
        return surveyactivity.k;
    }

    private void b()
    {
        if (d != null)
        {
            if (h != null)
            {
                Object obj1 = c();
                Survey survey = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).e();
                Object obj2 = survey.d();
                Object obj = h.d();
                obj = d.e().e(((String) (obj)));
                ((com.mixpanel.android.mpmetrics.h.b) (obj)).c("$responses", Integer.valueOf(survey.c()));
                obj1 = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).c();
                obj2 = ((List) (obj2)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    Object obj3 = (com.mixpanel.android.mpmetrics.Survey.a)((Iterator) (obj2)).next();
                    String s = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.AnswerMap) (obj1)).a(Integer.valueOf(((com.mixpanel.android.mpmetrics.Survey.a) (obj3)).a()));
                    if (s != null)
                    {
                        try
                        {
                            JSONObject jsonobject = new JSONObject();
                            jsonobject.put("$survey_id", survey.b());
                            jsonobject.put("$collection_id", survey.c());
                            jsonobject.put("$question_id", ((com.mixpanel.android.mpmetrics.Survey.a) (obj3)).a());
                            jsonobject.put("$question_type", ((com.mixpanel.android.mpmetrics.Survey.a) (obj3)).d().toString());
                            obj3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                            ((DateFormat) (obj3)).setTimeZone(TimeZone.getTimeZone("UTC"));
                            jsonobject.put("$time", ((DateFormat) (obj3)).format(new Date()));
                            jsonobject.put("$value", s);
                            ((com.mixpanel.android.mpmetrics.h.b) (obj)).c("$answers", jsonobject);
                        }
                        catch (JSONException jsonexception)
                        {
                            Log.e("MixpanelAPI.SrvyActvty", "Couldn't record user's answer.", jsonexception);
                        }
                    }
                } while (true);
            }
            d.a();
        }
        UpdateDisplayState.a(k);
    }

    private void b(Bundle bundle)
    {
        g();
        if (bundle != null)
        {
            j = bundle.getInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", 0);
            i = bundle.getBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY");
        }
        if (h.d() == null)
        {
            Log.i("MixpanelAPI.SrvyActvty", "Can't show a survey to a user with no distinct id set");
            finish();
            return;
        }
        setContentView(com.mixpanel.android.R.layout.com_mixpanel_android_activity_survey);
        bundle = c().b();
        if (bundle == null)
        {
            findViewById(com.mixpanel.android.R.id.com_mixpanel_android_activity_survey_id).setBackgroundColor(o);
        } else
        {
            getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), bundle));
        }
        e = findViewById(com.mixpanel.android.R.id.com_mixpanel_android_button_previous);
        f = findViewById(com.mixpanel.android.R.id.com_mixpanel_android_button_next);
        g = (TextView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_progress_text);
        c = (CardCarouselLayout)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_question_card_holder);
        c.a(new CardCarouselLayout.b() {

            final SurveyActivity a;

            public void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s)
            {
                SurveyActivity.a(a, a1, s);
                SurveyActivity.c(a);
            }

            
            {
                a = SurveyActivity.this;
                super();
            }
        });
    }

    private com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState c()
    {
        return (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState)h.c();
    }

    private void c(Bundle bundle)
    {
        bundle.putBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY", i);
        bundle.putInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", j);
        bundle.putParcelable("com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY", h);
    }

    static void c(SurveyActivity surveyactivity)
    {
        surveyactivity.goToNextQuestion();
    }

    private void completeSurvey()
    {
        finish();
    }

    static int d(SurveyActivity surveyactivity)
    {
        return surveyactivity.j;
    }

    private boolean d()
    {
        if (h == null)
        {
            return false;
        } else
        {
            return "SurveyState".equals(h.c().a());
        }
    }

    private boolean e()
    {
        if (h == null)
        {
            return false;
        } else
        {
            return "InAppNotificationState".equals(h.c().a());
        }
    }

    private void f()
    {
        Survey survey = c().e();
        com.mixpanel.android.mpmetrics.h.b b1 = d.e().e(h.d());
        b1.c("$surveys", Integer.valueOf(survey.b()));
        b1.c("$collections", Integer.valueOf(survey.c()));
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
        int i1 = c().e().d().size();
        if (j < i1 - 1)
        {
            a(j + 1);
            return;
        } else
        {
            completeSurvey();
            return;
        }
    }

    private void goToPreviousQuestion()
    {
        if (j > 0)
        {
            a(j - 1);
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
        if (d() && j > 0)
        {
            goToPreviousQuestion();
            return;
        }
        if (e())
        {
            UpdateDisplayState.a(k);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = getIntent().getIntExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", 0x7fffffff);
        h = UpdateDisplayState.b(k);
        if (h == null)
        {
            Log.e("MixpanelAPI.SrvyActvty", "SurveyActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        d = com.mixpanel.android.mpmetrics.h.a(this, h.e());
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
        if (b != null)
        {
            b.dismiss();
            b = null;
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
        com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState displaystate = h.c();
        if (displaystate != null && displaystate.a() == "SurveyState")
        {
            a();
        }
    }

}

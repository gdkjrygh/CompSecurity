// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
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
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.Survey;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import com.mixpanel.android.mpmetrics.t;
import com.mixpanel.android.mpmetrics.v;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout, FadingImageView, e, f, 
//            g, h, i, j

public class SurveyActivity extends Activity
{

    private static final int k = Color.argb(255, 90, 90, 90);
    private AlertDialog a;
    private CardCarouselLayout b;
    private v c;
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

    static int a(SurveyActivity surveyactivity)
    {
        return surveyactivity.j;
    }

    private com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState a()
    {
        return (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState)g.c();
    }

    private void a(int l)
    {
        com.mixpanel.android.mpmetrics.Survey.a a1;
        Object obj;
        int i1;
        obj = a();
        List list = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).d().c();
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
        a1 = (com.mixpanel.android.mpmetrics.Survey.a)list.get(l);
        obj = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).c().a(Integer.valueOf(a1.a()));
        if (i1 >= l) goto _L2; else goto _L1
_L1:
        try
        {
            b.a(a1, ((String) (obj)), CardCarouselLayout.b.a);
        }
        catch (CardCarouselLayout.e e1)
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
        b.a(a1, ((String) (obj)), CardCarouselLayout.b.b);
        break MISSING_BLOCK_LABEL_114;
        b.a(a1, ((String) (obj)));
          goto _L3
    }

    static void a(SurveyActivity surveyactivity, int l)
    {
        surveyactivity.a(l);
    }

    static void a(SurveyActivity surveyactivity, com.mixpanel.android.mpmetrics.Survey.a a1, String s)
    {
        surveyactivity.a().c().a(Integer.valueOf(a1.a()), s.toString());
    }

    static void b(SurveyActivity surveyactivity)
    {
        surveyactivity.goToNextQuestion();
    }

    private boolean b()
    {
        com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState displaystate = g.c();
        return displaystate != null && displaystate.a() == "SurveyState";
    }

    private boolean c()
    {
        com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState displaystate = g.c();
        return displaystate != null && displaystate.a() == "InAppNotificationState";
    }

    static boolean c(SurveyActivity surveyactivity)
    {
        surveyactivity.h = true;
        return true;
    }

    private void completeSurvey()
    {
        finish();
    }

    static int d(SurveyActivity surveyactivity)
    {
        return surveyactivity.i;
    }

    private void goToNextQuestion()
    {
        int l = a().d().c().size();
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
            Log.e("MixpanelAPI SurveyActivity", "SurveyActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        c = v.a(this, g.e());
        if (!c()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        setContentView(com.mixpanel.android.a.d.a);
        obj2 = (ImageView)findViewById(com.mixpanel.android.a.c.h);
        obj = (FadingImageView)findViewById(com.mixpanel.android.a.c.i);
        bundle = (TextView)findViewById(com.mixpanel.android.a.c.k);
        TextView textview = (TextView)findViewById(com.mixpanel.android.a.c.j);
        Button button = (Button)findViewById(com.mixpanel.android.a.c.g);
        LinearLayout linearlayout = (LinearLayout)findViewById(com.mixpanel.android.a.c.b);
        Object obj1 = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)g.c()).c();
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
        bundle.setText(((InAppNotification) (obj1)).d());
        textview.setText(((InAppNotification) (obj1)).e());
        obj2 = ((InAppNotification) (obj1)).j();
        ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.a.b.c);
        if (((Bitmap) (obj2)).getWidth() >= 100 && ((Bitmap) (obj2)).getHeight() >= 100) goto _L4; else goto _L3
_L3:
        ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.a.b.d);
_L5:
        ((FadingImageView) (obj)).setImageBitmap(((Bitmap) (obj2)));
        obj2 = ((InAppNotification) (obj1)).i();
        if (obj2 != null && ((String) (obj2)).length() > 0)
        {
            button.setText(((InAppNotification) (obj1)).h());
        }
        button.setOnClickListener(new e(this, ((InAppNotification) (obj1))));
        button.setOnTouchListener(new f(this));
        linearlayout.setOnClickListener(new g(this));
        obj1 = new ScaleAnimation(0.95F, 1.0F, 0.95F, 1.0F, 1, 0.5F, 1, 1.0F);
        ((ScaleAnimation) (obj1)).setDuration(200L);
        ((FadingImageView) (obj)).startAnimation(((android.view.animation.Animation) (obj1)));
        obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.5F, 1, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(200L);
        bundle.startAnimation(((android.view.animation.Animation) (obj)));
        textview.startAnimation(((android.view.animation.Animation) (obj)));
        button.startAnimation(((android.view.animation.Animation) (obj)));
        linearlayout.startAnimation(AnimationUtils.loadAnimation(this, com.mixpanel.android.a.a.a));
        return;
_L4:
        if (Color.alpha(Bitmap.createScaledBitmap(((Bitmap) (obj2)), 1, 1, false).getPixel(0, 0)) < 255)
        {
            ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.a.b.d);
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (!b())
        {
            break MISSING_BLOCK_LABEL_896;
        }
        if (android.os.Build.VERSION.SDK_INT < 18) goto _L7; else goto _L6
_L6:
        setRequestedOrientation(14);
_L9:
        if (bundle != null)
        {
            i = bundle.getInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", 0);
            h = bundle.getBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY");
        }
        if (g.d() == null)
        {
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        int l = getResources().getConfiguration().orientation;
        if (l == 2)
        {
            setRequestedOrientation(0);
        } else
        if (l == 1)
        {
            setRequestedOrientation(1);
        }
        if (true) goto _L9; else goto _L8
_L8:
        setContentView(com.mixpanel.android.a.d.c);
        bundle = a().b();
        if (bundle == null)
        {
            findViewById(com.mixpanel.android.a.c.a).setBackgroundColor(k);
        } else
        {
            getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), bundle));
        }
        d = findViewById(com.mixpanel.android.a.c.d);
        e = findViewById(com.mixpanel.android.a.c.c);
        f = (TextView)findViewById(com.mixpanel.android.a.c.l);
        b = (CardCarouselLayout)findViewById(com.mixpanel.android.a.c.m);
        b.a(new h(this));
        return;
        finish();
        return;
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
                    Survey survey = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).d();
                    Object obj2 = survey.c();
                    Object obj = g.d();
                    obj = c.c().b(((String) (obj)));
                    ((com.mixpanel.android.mpmetrics.v.b) (obj)).a("$responses", Integer.valueOf(survey.b()));
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
                                jsonobject.put("$survey_id", survey.a());
                                jsonobject.put("$collection_id", survey.b());
                                jsonobject.put("$question_id", ((com.mixpanel.android.mpmetrics.Survey.a) (obj3)).a());
                                jsonobject.put("$question_type", ((com.mixpanel.android.mpmetrics.Survey.a) (obj3)).d().toString());
                                obj3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                                ((DateFormat) (obj3)).setTimeZone(TimeZone.getTimeZone("UTC"));
                                jsonobject.put("$time", ((DateFormat) (obj3)).format(new Date()));
                                jsonobject.put("$value", s);
                                ((com.mixpanel.android.mpmetrics.v.b) (obj)).a("$answers", jsonobject);
                            }
                            catch (JSONException jsonexception)
                            {
                                Log.e("MixpanelAPI SurveyActivity", "Couldn't record user's answer.", jsonexception);
                            }
                        }
                    } while (true);
                }
                c.a();
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
        com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState displaystate = g.c();
        if (displaystate != null && displaystate.a() == "SurveyState" && !h)
        {
            if (!t.a(this).e())
            {
                Survey survey = a().d();
                com.mixpanel.android.mpmetrics.v.b b1 = c.c().b(g.d());
                b1.a("$surveys", Integer.valueOf(survey.a()));
                b1.a("$collections", Integer.valueOf(survey.b()));
            }
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle("We'd love your feedback!");
            builder.setMessage("Mind taking a quick survey?");
            builder.setPositiveButton("Sure", new i(this));
            builder.setNegativeButton("No, Thanks", new j(this));
            builder.setCancelable(false);
            a = builder.create();
            a.show();
        }
    }

}

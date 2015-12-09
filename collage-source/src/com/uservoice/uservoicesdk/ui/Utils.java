// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.activity.TopicActivity;
import com.uservoice.uservoicesdk.dialog.ArticleDialogFragment;
import com.uservoice.uservoicesdk.dialog.SuggestionDialogFragment;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.model.Topic;
import java.util.Locale;

public class Utils
{

    public Utils()
    {
    }

    public static void displayArticle(WebView webview, Article article, Context context)
    {
        String s = "iframe, img { max-width: 100%; }";
        if (isDarkTheme(context))
        {
            webview.setBackgroundColor(Color.parseColor("#303030"));
            s = (new StringBuilder()).append("iframe, img { max-width: 100%; }").append("body { background-color: #303030; color: #F6F6F6; } a { color: #0099FF; }").toString();
        }
        article = String.format("<html><head><meta charset=\"utf-8\"><link rel=\"stylesheet\" type=\"text/css\" href=\"http://cdn.uservoice.com/stylesheets/vendor/typeset.css\"/><style>%s</style></head><body class=\"typeset\" style=\"font-family: sans-serif; margin: 1em\"><h3>%s</h3><br>%s</body></html>", new Object[] {
            s, article.getTitle(), article.getHtml()
        });
        webview.setWebChromeClient(new WebChromeClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
        webview.loadUrl(String.format("data:text/html;charset=utf-8,%s", new Object[] {
            Uri.encode(article)
        }));
    }

    public static void displayInstantAnswer(View view, BaseModel basemodel)
    {
        TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_title);
        TextView textview2 = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_detail);
        View view1 = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_details);
        view = (ImageView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_icon);
        if (basemodel instanceof Article)
        {
            basemodel = (Article)basemodel;
            view.setImageResource(com.uservoice.uservoicesdk.R.drawable.uv_article);
            textview.setText(basemodel.getTitle());
            if (basemodel.getTopicName() != null)
            {
                textview2.setVisibility(0);
                textview2.setText(basemodel.getTopicName());
            } else
            {
                textview2.setVisibility(8);
            }
            view1.setVisibility(8);
        } else
        if (basemodel instanceof Suggestion)
        {
            basemodel = (Suggestion)basemodel;
            view.setImageResource(com.uservoice.uservoicesdk.R.drawable.uv_idea);
            textview.setText(basemodel.getTitle());
            textview2.setVisibility(0);
            textview2.setText(basemodel.getForumName());
            if (basemodel.getStatus() != null)
            {
                view = view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_status_color);
                TextView textview1 = (TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_status);
                int i = Color.parseColor(basemodel.getStatusColor());
                view1.setVisibility(0);
                textview1.setText(basemodel.getStatus().toUpperCase(Locale.getDefault()));
                textview1.setTextColor(i);
                view.setBackgroundColor(i);
                return;
            } else
            {
                view1.setVisibility(8);
                return;
            }
        }
    }

    public static String getQuantityString(View view, int i, int j)
    {
        return String.format("%,d %s", new Object[] {
            Integer.valueOf(j), view.getContext().getResources().getQuantityString(i, j)
        });
    }

    public static boolean isDarkTheme(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        float af[] = new float[3];
        context.getTheme().resolveAttribute(0x1010036, typedvalue, true);
        Color.colorToHSV(context.getResources().getColor(typedvalue.resourceId), af);
        return af[2] > 0.5F;
    }

    public static void showModel(FragmentActivity fragmentactivity, BaseModel basemodel)
    {
        showModel(fragmentactivity, basemodel, null);
    }

    public static void showModel(FragmentActivity fragmentactivity, BaseModel basemodel, String s)
    {
        if (basemodel instanceof Article)
        {
            (new ArticleDialogFragment((Article)basemodel, s)).show(fragmentactivity.getSupportFragmentManager(), "ArticleDialogFragment");
        } else
        {
            if (basemodel instanceof Suggestion)
            {
                (new SuggestionDialogFragment((Suggestion)basemodel, s)).show(fragmentactivity.getSupportFragmentManager(), "SuggestionDialogFragment");
                return;
            }
            if (basemodel instanceof Topic)
            {
                s = new Intent(fragmentactivity, com/uservoice/uservoicesdk/activity/TopicActivity);
                s.putExtra("topic", (Topic)basemodel);
                fragmentactivity.startActivity(s);
                return;
            }
        }
    }
}

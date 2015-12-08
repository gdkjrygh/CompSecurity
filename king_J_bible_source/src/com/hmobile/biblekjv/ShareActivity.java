// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;
import com.hmobile.model.VerseInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, HolyBibleApplication

public class ShareActivity extends BaseActivity
    implements android.view.View.OnClickListener, com.hmobile.model.LikeShareInfo.LikeShareDelegate
{

    private String BookName;
    private String ShareText;
    private EditText edtSharetext;
    private Facebook facebook;
    private ImageView imgFacebook;
    private ImageView imgShare;
    private ImageView imgTwitter;
    private AsyncFacebookRunner mAsyncRunner;
    private TextView txtContent;
    private TextView txtContentLink;

    public ShareActivity()
    {
        ShareText = "";
        BookName = "";
    }

    public void Failed()
    {
        hideProgress();
    }

    public void SuccessFully()
    {
        VerseInfo verseinfo = VerseInfo.getVerseInfoByVerse(ShareText);
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(verseinfo.VerseNumber));
        PostShare(arraylist, verseinfo.BookId, verseinfo.ChapterNumber);
        hideProgress();
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onClick(View view)
    {
        if (view == imgFacebook)
        {
            signInWithFb(BookName, ShareText, true);
        } else
        {
            if (view == imgTwitter)
            {
                view = (new StringBuilder(String.valueOf(edtSharetext.getText().toString()))).append(" \n").append(txtContent.getText().toString()).append(" ").append(txtContentLink.getText().toString()).toString();
                if (view.length() > 1)
                {
                    if (view.length() > 140)
                    {
                        showAlertForTwitterShare(view, this);
                        return;
                    } else
                    {
                        signInwithTwitter(view, this);
                        return;
                    }
                } else
                {
                    Toast.makeText(getApplicationContext(), "Please insert some text to share", 1).show();
                    return;
                }
            }
            if (view == imgShare)
            {
                view = edtSharetext.getText().toString();
                if (view.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Please insert some text to share", 1).show();
                    return;
                } else
                {
                    Object obj = getResources().getString(0x7f070084);
                    Intent intent1 = new Intent("android.intent.action.SEND");
                    intent1.setType("text/plain");
                    intent1.putExtra("android.intent.extra.SUBJECT", getString(0x7f070086));
                    intent1.putExtra("android.intent.extra.TEXT", (new StringBuilder(String.valueOf(view))).append(" \n").append(txtContent.getText().toString()).append(" ").append(((String) (obj))).toString());
                    startActivity(Intent.createChooser(intent1, "Share using"));
                    view = VerseInfo.getVerseInfoByVerse(ShareText);
                    obj = new ArrayList();
                    ((ArrayList) (obj)).add(Integer.valueOf(((VerseInfo) (view)).VerseNumber));
                    PostShare(((ArrayList) (obj)), ((VerseInfo) (view)).BookId, ((VerseInfo) (view)).ChapterNumber);
                    return;
                }
            }
            if (view.equals(txtContentLink))
            {
                view = txtContentLink.getText().toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(view));
                startActivity(intent);
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002f);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("SHARETEXT"))
            {
                ShareText = bundle.getString("SHARETEXT");
            }
            if (bundle.containsKey("book"))
            {
                BookName = bundle.getString("book");
            }
        }
        edtSharetext = (EditText)findViewById(0x7f0e009d);
        txtContent = (TextView)findViewById(0x7f0e0050);
        txtContentLink = (TextView)findViewById(0x7f0e0121);
        if (ShareText.length() > 1)
        {
            edtSharetext.setText(ShareText);
        }
        if (BookName.length() > 1)
        {
            txtContent.setText((new StringBuilder(String.valueOf(BookName))).append(". ").toString());
            txtContentLink.setText(getString(0x7f070084));
            underlineText(txtContentLink);
        }
        imgFacebook = (ImageView)findViewById(0x7f0e003b);
        imgTwitter = (ImageView)findViewById(0x7f0e003d);
        imgShare = (ImageView)findViewById(0x7f0e003f);
        imgFacebook.setOnClickListener(this);
        imgTwitter.setOnClickListener(this);
        imgShare.setOnClickListener(this);
        txtContentLink.setOnClickListener(this);
        if (!HolyBibleApplication.isPurchased)
        {
            addAdView();
            return;
        } else
        {
            hideAdView();
            return;
        }
    }

    public void underlineText(TextView textview)
    {
        try
        {
            SpannableString spannablestring = new SpannableString(textview.getText().toString());
            spannablestring.setSpan(new UnderlineSpan(), 0, spannablestring.length(), 0);
            textview.setText(spannablestring);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            return;
        }
    }
}

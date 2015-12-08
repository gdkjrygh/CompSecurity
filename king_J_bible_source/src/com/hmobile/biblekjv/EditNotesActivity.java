// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.model.NotesInfo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EditNotesActivity extends Activity
    implements android.view.View.OnClickListener
{

    private Button btnCancelNotes;
    private Button btnFavorite;
    private Button btnSaveNotes;
    private EditText edtLable;
    private EditText edtTitle;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    private NotesInfo ninfo;

    public EditNotesActivity()
    {
    }

    private void loadData()
    {
        edtLable.setText(ninfo.Lable);
        edtTitle.setText(ninfo.Title);
    }

    public String getDate(long l)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MMM/dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        return simpledateformat.format(calendar.getTime());
    }

    public void onClick(View view)
    {
        if (view != btnSaveNotes) goto _L2; else goto _L1
_L1:
        String s;
        view = edtLable.getText().toString();
        s = edtTitle.getText().toString();
        if (view.length() >= 1) goto _L4; else goto _L3
_L3:
        Toast.makeText(getApplicationContext(), "Please insert Lable.", 1).show();
_L6:
        return;
_L4:
        if (s.length() < 1)
        {
            Toast.makeText(getApplicationContext(), "Please insert Title.", 1).show();
            return;
        }
        try
        {
            ninfo.Lable = view;
            ninfo.Title = s;
            ninfo.save();
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        edtTitle.setText("");
        edtLable.setText("");
        setResult(-1);
        finish();
        return;
_L2:
        if (view == btnCancelNotes)
        {
            setResult(-1);
            finish();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        bundle = getIntent().getExtras();
        long l = 0L;
        if (bundle != null)
        {
            l = bundle.getLong("notes_id");
        }
        getWindow().setLayout(-1, -2);
        ninfo = NotesInfo.getNotesInfoById(l);
        setTitle(getString(0x7f0700e2));
        btnSaveNotes = (Button)findViewById(0x7f0e004b);
        btnCancelNotes = (Button)findViewById(0x7f0e004c);
        edtLable = (EditText)findViewById(0x7f0e0049);
        edtTitle = (EditText)findViewById(0x7f0e0048);
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/FavoritesActivity");
        btnCancelNotes.setOnClickListener(this);
        btnSaveNotes.setOnClickListener(this);
        if (ninfo != null)
        {
            loadData();
        }
    }

    protected void onResume()
    {
        super.onResume();
    }
}

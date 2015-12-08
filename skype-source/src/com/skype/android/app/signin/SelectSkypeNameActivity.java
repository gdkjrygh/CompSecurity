// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;

public class SelectSkypeNameActivity extends SkypeActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    public static final String CHOSEN_NAME_KEY = "chosenName";
    public static final String SUGGESTED_NAMES_KEY = "suggestedName";
    public static final int SUGGESTED_NAMES_RESULT = 101;
    ActionBarCustomizer actionBarCustomizer;
    SkyLib lib;
    ListView nameList;
    private String selection;

    public SelectSkypeNameActivity()
    {
        selection = null;
    }

    private void makeSuggestionList(String s)
    {
        s = s.split(";");
        ArrayAdapter arrayadapter = new ArrayAdapter(this, 0x7f030101);
        for (int i = 0; i < s.length; i++)
        {
            arrayadapter.add(s[i]);
        }

        nameList.setAdapter(arrayadapter);
        nameList.setOnItemClickListener(this);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitle(getString(0x7f080276));
        actionBarCustomizer.setWhiteOnBlueTheme(true);
        bundle = getIntent().getStringExtra("suggestedName");
        if (TextUtils.isEmpty(bundle))
        {
            finish();
            return;
        } else
        {
            makeSuggestionList(bundle);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        selection = (String)adapterview.getItemAtPosition(i);
        adapterview = new Intent();
        adapterview.putExtra("chosenName", selection);
        setResult(-1, adapterview);
        finish();
    }
}

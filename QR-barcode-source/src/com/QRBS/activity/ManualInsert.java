// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;

public class ManualInsert extends SherlockActivity
{

    private EditText edit;
    private InputFilter filters[];
    private CheckBox four;
    private ImageView image;
    private CheckBox one;
    private String result;
    private Button search;
    private CheckBox three;
    private CheckBox two;

    public ManualInsert()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030033);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d4);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        edit = (EditText)findViewById(0x7f0d00a8);
        image = (ImageView)findViewById(0x7f0d00a7);
        one = (CheckBox)findViewById(0x7f0d00aa);
        two = (CheckBox)findViewById(0x7f0d00ad);
        three = (CheckBox)findViewById(0x7f0d00b0);
        four = (CheckBox)findViewById(0x7f0d00b3);
        search = (Button)findViewById(0x7f0d0092);
        filters = new InputFilter[1];
        edit.setEnabled(false);
        edit.setFocusableInTouchMode(false);
        one.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ManualInsert this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    compoundbutton.setChecked(true);
                    two.setChecked(false);
                    three.setChecked(false);
                    four.setChecked(false);
                    image.setBackgroundResource(0x7f02009e);
                    filters[0] = new android.text.InputFilter.LengthFilter(8);
                    edit.setFilters(filters);
                    edit.setInputType(2);
                    edit.setEnabled(true);
                    edit.setFocusableInTouchMode(true);
                    edit.setHint(0x7f08011d);
                    return;
                } else
                {
                    edit.setFocusableInTouchMode(false);
                    edit.setFocusable(false);
                    edit.setEnabled(false);
                    edit.setText("");
                    edit.setHint(0x7f08011c);
                    return;
                }
            }

            
            {
                this$0 = ManualInsert.this;
                super();
            }
        });
        two.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ManualInsert this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    compoundbutton.setChecked(true);
                    one.setChecked(false);
                    three.setChecked(false);
                    four.setChecked(false);
                    image.setBackgroundResource(0x7f0200a0);
                    filters[0] = new android.text.InputFilter.LengthFilter(13);
                    edit.setFilters(filters);
                    edit.setInputType(2);
                    edit.setEnabled(true);
                    edit.setFocusableInTouchMode(true);
                    edit.setHint(0x7f08011d);
                    return;
                } else
                {
                    edit.setFocusableInTouchMode(false);
                    edit.setFocusable(false);
                    edit.setEnabled(false);
                    edit.setText("");
                    edit.setHint(0x7f08011c);
                    return;
                }
            }

            
            {
                this$0 = ManualInsert.this;
                super();
            }
        });
        three.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ManualInsert this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    compoundbutton.setChecked(true);
                    one.setChecked(false);
                    two.setChecked(false);
                    four.setChecked(false);
                    image.setBackgroundResource(0x7f02009f);
                    edit.setInputType(1);
                    edit.setEnabled(true);
                    edit.setFocusableInTouchMode(true);
                    edit.setHint(0x7f08011d);
                    return;
                } else
                {
                    edit.setFocusableInTouchMode(false);
                    edit.setFocusable(false);
                    edit.setEnabled(false);
                    edit.setText("");
                    edit.setHint(0x7f08011c);
                    return;
                }
            }

            
            {
                this$0 = ManualInsert.this;
                super();
            }
        });
        four.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ManualInsert this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    compoundbutton.setChecked(true);
                    one.setChecked(false);
                    three.setChecked(false);
                    two.setChecked(false);
                    image.setBackgroundResource(0x7f02009d);
                    edit.setInputType(1);
                    edit.setEnabled(true);
                    edit.setFocusableInTouchMode(true);
                    edit.setHint(0x7f08011d);
                    return;
                } else
                {
                    edit.setFocusableInTouchMode(false);
                    edit.setFocusable(false);
                    edit.setEnabled(false);
                    edit.setText("");
                    edit.setHint(0x7f08011c);
                    return;
                }
            }

            
            {
                this$0 = ManualInsert.this;
                super();
            }
        });
        search.setOnClickListener(new android.view.View.OnClickListener() {

            final ManualInsert this$0;

            public void onClick(View view)
            {
                result = edit.getText().toString();
                if (result.equals(""))
                {
                    return;
                }
                if (!one.isChecked())
                {
                    if (two.isChecked())
                    {
                        view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(result).toString());
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(view);
                        startActivity(intent);
                        return;
                    }
                    if (three.isChecked())
                    {
                        view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(result).toString());
                        Intent intent1 = new Intent("android.intent.action.VIEW");
                        intent1.setData(view);
                        startActivity(intent1);
                        return;
                    }
                    if (!four.isChecked())
                    {
                        Log.d("", "No one checked");
                        return;
                    } else
                    {
                        view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(result).toString());
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(view);
                        startActivity(intent2);
                        return;
                    }
                } else
                {
                    view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(result).toString());
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(view);
                    startActivity(intent3);
                    return;
                }
            }

            
            {
                this$0 = ManualInsert.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }









}

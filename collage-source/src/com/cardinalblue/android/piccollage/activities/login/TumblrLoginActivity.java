// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.volley.g;
import com.android.volley.r;
import com.android.volley.toolbox.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.auth.a.e;
import com.cardinalblue.android.piccollage.lib.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class TumblrLoginActivity extends ActionBarActivity
{

    public TumblrLoginActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003f);
        bundle = (EditText)findViewById(0x7f100101);
        ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(2, 0);
        bundle.requestFocus();
        findViewById(0x7f100103).setOnClickListener(new android.view.View.OnClickListener() {

            final TumblrLoginActivity a;

            public void onClick(View view)
            {
                String s = ((EditText)a.findViewById(0x7f100101)).getText().toString().trim();
                String s1 = ((EditText)a.findViewById(0x7f100102)).getText().toString().trim();
                view = new ProgressDialog(a);
                view.setMessage((new StringBuilder()).append(a.getString(0x7f0702af)).append("...").toString());
                view.setCancelable(false);
                k.b(a, view);
                try
                {
                    k.a(s, s1, "xlXBUSdFYWoT80Kog1IRmpdnoXTWJiiBOQliH4VrAXYNHYwaMw", "1mdf722FH2PYQIr641CICy6dO04Xht8mhydCyVDn8iweGxbrF8", "https://www.tumblr.com/oauth/access_token", new com.android.volley.m.b(this, view) {

                        final ProgressDialog a;
                        final _cls1 b;

                        public volatile void a(Object obj)
                        {
                            a((String)obj);
                        }

                        public void a(String s)
                        {
                            String s1;
                            try
                            {
                                s = e.a(s);
                            }
                            // Misplaced declaration of an exception variable
                            catch (String s)
                            {
                                k.a(b.a, a);
                                k.a(b.a, b.a.getString(0x7f0702ae), 0);
                                f.a(s);
                                return;
                            }
                            try
                            {
                                s1 = k.a(null, s, "xlXBUSdFYWoT80Kog1IRmpdnoXTWJiiBOQliH4VrAXYNHYwaMw", "1mdf722FH2PYQIr641CICy6dO04Xht8mhydCyVDn8iweGxbrF8", "GET", "https://api.tumblr.com/v2/user/info");
                            }
                            // Misplaced declaration of an exception variable
                            catch (String s)
                            {
                                k.a(b.a, a);
                                k.a(b.a, b.a.getString(0x7f0702ae), 0);
                                f.a(s);
                                return;
                            }
                            s = new j(this, 0, "https://api.tumblr.com/v2/user/info", new com.android.volley.m.b(this, s) {

                                final org.a.d.f a;
                                final _cls1 b;

                                public volatile void a(Object obj)
                                {
                                    a((JSONObject)obj);
                                }

                                public void a(JSONObject jsonobject)
                                {
                                    k.a(b.b.a, b.a);
                                    try
                                    {
                                        jsonobject = jsonobject.getJSONObject("response").getJSONObject("user").getString("name");
                                        e.a(a, jsonobject);
                                        jsonobject = new Intent();
                                        jsonobject.putExtra("key_token", a);
                                        b.b.a.setResult(-1, jsonobject);
                                        b.b.a.finish();
                                        return;
                                    }
                                    // Misplaced declaration of an exception variable
                                    catch (JSONObject jsonobject)
                                    {
                                        k.a(b.b.a, b.b.a.getString(0x7f0702ae), 0);
                                    }
                                    f.a(jsonobject);
                                }

            
            {
                b = _pcls1;
                a = f1;
                super();
            }
                            }, new com.android.volley.m.a(this) {

                                final _cls1 a;

                                public void a(r r)
                                {
                                    k.a(a.b.a, a.a);
                                    k.a(a.b.a, a.b.a.getString(0x7f0702ae), 0);
                                    f.a(r);
                                }

            
            {
                a = _pcls1;
                super();
            }
                            }, s1) {

                                final String a;
                                final _cls1 b;

                                public Map k()
                                {
                                    HashMap hashmap = new HashMap();
                                    hashmap.put("Authorization", a);
                                    return hashmap;
                                }

            
            {
                b = _pcls1;
                a = s1;
                super(i, s, b1, a1);
            }
                            };
                            i.a(k.a()).b(s);
                        }

            
            {
                b = _pcls1;
                a = progressdialog;
                super();
            }
                    }, new com.android.volley.m.a(this, view) {

                        final ProgressDialog a;
                        final _cls1 b;

                        public void a(r r1)
                        {
                            k.a(b.a, a);
                            if (r1.a != null && r1.a.a == 409)
                            {
                                k.a(b.a, b.a.getString(0x7f0702b0), 1);
                            } else
                            {
                                k.a(b.a, b.a.getString(0x7f0702b1), 0);
                            }
                            f.a(r1);
                        }

            
            {
                b = _pcls1;
                a = progressdialog;
                super();
            }
                    });
                    return;
                }
                catch (Exception exception)
                {
                    k.a(a, view);
                }
                k.a(a, a.getString(0x7f0702ae), 0);
            }

            
            {
                a = TumblrLoginActivity.this;
                super();
            }
        });
    }

    public void onPause()
    {
        super.onPause();
        ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}

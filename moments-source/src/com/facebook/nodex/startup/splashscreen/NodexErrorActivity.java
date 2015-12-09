// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.acra.ErrorReporter;
import com.facebook.common.build.BuildConstants;
import com.facebook.nodex.resources.NodexResources;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexBaseActivity

public class NodexErrorActivity extends NodexBaseActivity
{

    private TextView a;
    private TextView b;
    private TextView c;
    private Button d;
    private NodexResources e;
    private Action f;

    public NodexErrorActivity()
    {
        f = Action.NONE;
    }

    private void a()
    {
        Throwable throwable = null;
        Intent intent = getIntent();
        String s;
        String s1;
        if (intent != null)
        {
            String s2 = intent.getStringExtra("title");
            String s3 = intent.getStringExtra("message");
            Throwable throwable1 = (Throwable)intent.getSerializableExtra("exception");
            throwable = throwable1;
            s = s3;
            s1 = s2;
            if (intent.hasExtra("action"))
            {
                f = Action.valueOf(intent.getStringExtra("action"));
                s1 = s2;
                s = s3;
                throwable = throwable1;
            }
        } else
        {
            s = null;
            s1 = null;
        }
        if (s1 != null)
        {
            a.setVisibility(0);
            a.setText(s1);
        } else
        {
            a.setVisibility(8);
        }
        if (s != null)
        {
            b.setVisibility(0);
            b.setText(s);
        } else
        {
            b.setVisibility(8);
        }
        if (throwable != null && BuildConstants.c())
        {
            c.setVisibility(0);
            c.setText(throwable.toString());
        } else
        {
            c.setVisibility(8);
        }
        if (f == Action.NONE)
        {
            d.setVisibility(8);
            return;
        } else
        {
            d.setText(getString(e.c(f.resIdButtonText)));
            d.setVisibility(0);
            return;
        }
    }

    private static void a(Intent intent)
    {
        Object obj = (Throwable)intent.getSerializableExtra("exception");
        intent = new Throwable("NodexError activity was shown to user.", ((Throwable) (obj)));
        obj = String.format(Locale.ENGLISH, "NodexErrorActivity (%s)", new Object[] {
            ((Throwable) (obj)).toString()
        });
        HashMap hashmap = new HashMap();
        hashmap.put("soft_error_category", obj);
        ErrorReporter.getInstance().handleException(intent, hashmap);
    }

    static void a(NodexErrorActivity nodexerroractivity)
    {
        nodexerroractivity.b();
    }

    private void b()
    {
        _cls2.a[f.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 37
    //                   2 44;
           goto _L1 _L2 _L3
_L1:
        finish();
        return;
_L2:
        c();
        continue; /* Loop/switch isn't completed */
_L3:
        d();
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void c()
    {
        startActivity(new Intent("android.intent.action.DELETE", Uri.parse((new StringBuilder("package:")).append(getPackageName()).toString())));
    }

    private void d()
    {
        startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = new NodexResources(this);
        setContentView(e.a("nodex_error_activity"));
        a = (TextView)findViewById(e.b("nodex_title"));
        b = (TextView)findViewById(e.b("nodex_message"));
        c = (TextView)findViewById(e.b("nodex_exception"));
        d = (Button)findViewById(e.b("nodex_button"));
        d.setOnClickListener(new _cls1());
        a();
        if (bundle == null)
        {
            a(getIntent());
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
        a();
    }

    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action APP_SETTINGS;
        public static final Action NONE;
        public static final Action UNINSTALL;
        public final String resIdButtonText;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/facebook/nodex/startup/splashscreen/NodexErrorActivity$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            UNINSTALL = new Action("UNINSTALL", 0, "nodex_uninstall_string");
            APP_SETTINGS = new Action("APP_SETTINGS", 1, "nodex_app_settings_string");
            NONE = new Action("NONE", 2, null);
            $VALUES = (new Action[] {
                UNINSTALL, APP_SETTINGS, NONE
            });
        }

        private Action(String s, int i, String s1)
        {
            super(s, i);
            resIdButtonText = s1;
        }
    }


    private class _cls2
    {

        static final int a[];

        static 
        {
            a = new int[Action.values().length];
            try
            {
                a[Action.UNINSTALL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Action.APP_SETTINGS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Action.NONE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NodexErrorActivity a;

        public void onClick(View view)
        {
            NodexErrorActivity.a(a);
        }

        _cls1()
        {
            a = NodexErrorActivity.this;
            super();
        }
    }

}

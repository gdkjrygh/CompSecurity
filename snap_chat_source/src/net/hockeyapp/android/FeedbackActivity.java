// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afM;
import afR;
import afT;
import afU;
import afW;
import afX;
import age;
import agf;
import agg;
import agl;
import agn;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.hockeyapp.android.views.AttachmentListView;
import net.hockeyapp.android.views.AttachmentView;
import net.hockeyapp.android.views.FeedbackView;

// Referenced classes of package net.hockeyapp.android:
//            PaintActivity

public class FeedbackActivity extends Activity
    implements android.view.View.OnClickListener
{

    private Context a;
    private TextView b;
    private EditText c;
    private EditText d;
    private EditText e;
    private EditText f;
    private Button g;
    private Button h;
    private Button i;
    private Button j;
    private ScrollView k;
    private LinearLayout l;
    private ListView m;
    private agf n;
    private Handler o;
    private age p;
    private Handler q;
    private String r;
    private afT s;
    private afR t;
    private ArrayList u;
    private boolean v;
    private boolean w;
    private String x;

    public FeedbackActivity()
    {
    }

    static afR a(FeedbackActivity feedbackactivity, afR afr)
    {
        feedbackactivity.t = afr;
        return afr;
    }

    static afT a(FeedbackActivity feedbackactivity)
    {
        return feedbackactivity.s;
    }

    static afT a(FeedbackActivity feedbackactivity, afT aft)
    {
        feedbackactivity.s = aft;
        return aft;
    }

    static ArrayList a(FeedbackActivity feedbackactivity, ArrayList arraylist)
    {
        feedbackactivity.u = arraylist;
        return arraylist;
    }

    private void a()
    {
        x = agl.a.a.a(this);
        if (x == null || v)
        {
            b(false);
            return;
        } else
        {
            b(true);
            a(r, null, null, null, null, null, x, o, true);
            return;
        }
    }

    private void a(EditText edittext, int i1)
    {
        edittext.setError(afM.a(i1));
        a(true);
    }

    private void a(String s1, String s2, String s3, String s4, String s5, List list, String s6, 
            Handler handler, boolean flag)
    {
        n = new agf(a, s1, s2, s3, s4, s5, list, s6, handler, flag);
        agg.a(n);
    }

    static void a(FeedbackActivity feedbackactivity, afX afx)
    {
        feedbackactivity.runOnUiThread(feedbackactivity. new Runnable(afx) {

            private afX a;
            private FeedbackActivity b;

            public final void run()
            {
                b.b(true);
                Object obj1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                SimpleDateFormat simpledateformat = new SimpleDateFormat("d MMM h:mm a");
                if (a != null && a.b != null && a.b.a != null && a.b.a.size() > 0)
                {
                    FeedbackActivity.a(b, a.b.a);
                    Collections.reverse(FeedbackActivity.e(b));
                    try
                    {
                        obj1 = ((SimpleDateFormat) (obj1)).parse(((afW)FeedbackActivity.e(b).get(0)).b);
                        FeedbackActivity.f(b).setText(String.format("Last Updated: %s", new Object[] {
                            simpledateformat.format(((java.util.Date) (obj1)))
                        }));
                    }
                    catch (ParseException parseexception)
                    {
                        parseexception.printStackTrace();
                    }
                    if (FeedbackActivity.g(b) == null)
                    {
                        FeedbackActivity.a(b, new afR(FeedbackActivity.c(b), FeedbackActivity.e(b)));
                    } else
                    {
                        Object obj = FeedbackActivity.g(b);
                        if (((afR) (obj)).a != null)
                        {
                            ((afR) (obj)).a.clear();
                        }
                        obj = FeedbackActivity.e(b).iterator();
                        do
                        {
                            if (!((Iterator) (obj)).hasNext())
                            {
                                break;
                            }
                            afW afw = (afW)((Iterator) (obj)).next();
                            afR afr = FeedbackActivity.g(b);
                            if (afw != null && afr.a != null)
                            {
                                afr.a.add(afw);
                            }
                        } while (true);
                        FeedbackActivity.g(b).notifyDataSetChanged();
                    }
                    FeedbackActivity.h(b).setAdapter(FeedbackActivity.g(b));
                }
            }

            
            {
                b = FeedbackActivity.this;
                a = afx;
                super();
            }
        });
    }

    static void a(FeedbackActivity feedbackactivity, String s1, String s2)
    {
        feedbackactivity.p = new age(feedbackactivity, s1, feedbackactivity.q, s2);
        agg.a(feedbackactivity.p);
    }

    static void b(FeedbackActivity feedbackactivity)
    {
        feedbackactivity.runOnUiThread(feedbackactivity. new Runnable() {

            private FeedbackActivity a;

            public final void run()
            {
                agl.a.a.a(a, null);
                agl.a(a.getSharedPreferences("net.hockeyapp.android.feedback", 0).edit().remove("idLastMessageSend").remove("idLastMessageProcessed"));
                a.b(false);
            }

            
            {
                a = FeedbackActivity.this;
                super();
            }
        });
    }

    static Context c(FeedbackActivity feedbackactivity)
    {
        return feedbackactivity.a;
    }

    static boolean d(FeedbackActivity feedbackactivity)
    {
        feedbackactivity.v = false;
        return false;
    }

    static ArrayList e(FeedbackActivity feedbackactivity)
    {
        return feedbackactivity.u;
    }

    static TextView f(FeedbackActivity feedbackactivity)
    {
        return feedbackactivity.b;
    }

    static afR g(FeedbackActivity feedbackactivity)
    {
        return feedbackactivity.t;
    }

    static ListView h(FeedbackActivity feedbackactivity)
    {
        return feedbackactivity.m;
    }

    public final void a(boolean flag)
    {
        if (g != null)
        {
            g.setEnabled(flag);
        }
    }

    protected final void b(boolean flag)
    {
        k = (ScrollView)findViewById(0x20017);
        l = (LinearLayout)findViewById(0x20015);
        m = (ListView)findViewById(0x20016);
        if (flag)
        {
            l.setVisibility(0);
            k.setVisibility(8);
            b = (TextView)findViewById(8192);
            i = (Button)findViewById(0x20010);
            i.setOnClickListener(this);
            j = (Button)findViewById(0x20011);
            j.setOnClickListener(this);
            return;
        }
        l.setVisibility(8);
        k.setVisibility(0);
        c = (EditText)findViewById(8194);
        d = (EditText)findViewById(8196);
        e = (EditText)findViewById(8198);
        f = (EditText)findViewById(8200);
        if (!w)
        {
            Object obj = agl.a.a;
            Context context = a;
            if (context == null)
            {
                obj = null;
            } else
            {
                obj.a = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
                if (((agl) (obj)).a == null)
                {
                    obj = null;
                } else
                {
                    obj = ((agl) (obj)).a.getString("net.hockeyapp.android.prefs_key_name_email", null);
                }
            }
            if (obj != null)
            {
                obj = ((String) (obj)).split("\\|");
                if (obj != null && obj.length >= 2)
                {
                    c.setText(obj[0]);
                    d.setText(obj[1]);
                    if (obj.length >= 3)
                    {
                        e.setText(obj[2]);
                        f.requestFocus();
                    } else
                    {
                        e.requestFocus();
                    }
                }
            } else
            {
                c.setText("");
                d.setText("");
                e.setText("");
                c.requestFocus();
            }
            w = true;
        }
        f.setText("");
        if (agl.a.a.a(a) != null)
        {
            e.setVisibility(8);
        } else
        {
            e.setVisibility(0);
        }
        ((ViewGroup)findViewById(8209)).removeAllViews();
        h = (Button)findViewById(8208);
        h.setOnClickListener(this);
        registerForContextMenu(h);
        g = (Button)findViewById(8201);
        g.setOnClickListener(this);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        if (j1 == -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i1 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((intent = intent.getData()) != null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(8209);
            viewgroup.addView(new AttachmentView(this, viewgroup, intent));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i1 != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getData();
        if (intent != null)
        {
            try
            {
                Intent intent1 = new Intent(this, net/hockeyapp/android/PaintActivity);
                intent1.putExtra("imageUri", intent);
                startActivityForResult(intent1, 3);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (i1 != 3) goto _L1; else goto _L4
_L4:
        intent = (Uri)intent.getParcelableExtra("imageUri");
        if (intent != null)
        {
            ViewGroup viewgroup1 = (ViewGroup)findViewById(8209);
            viewgroup1.addView(new AttachmentView(this, viewgroup1, intent));
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 8201: 
            a(false);
            if (f != null)
            {
                ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(f.getWindowToken(), 0);
            }
            view = agl.a.a.a(a);
            String s1 = c.getText().toString().trim();
            String s2 = d.getText().toString().trim();
            String s3 = e.getText().toString().trim();
            String s4 = f.getText().toString().trim();
            if (TextUtils.isEmpty(s3))
            {
                e.setVisibility(0);
                a(e, 1038);
                return;
            }
            if (TextUtils.isEmpty(s1))
            {
                a(c, 1041);
                return;
            }
            if (TextUtils.isEmpty(s2))
            {
                a(d, 1042);
                return;
            }
            if (TextUtils.isEmpty(s4))
            {
                a(f, 1043);
                return;
            }
            if (!agn.b(s2))
            {
                a(d, 1039);
                return;
            }
            Object obj = agl.a.a;
            Context context = a;
            if (context != null)
            {
                obj.a = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
                if (((agl) (obj)).a != null)
                {
                    obj.b = ((agl) (obj)).a.edit();
                    if (s1 == null || s2 == null || s3 == null)
                    {
                        ((agl) (obj)).b.putString("net.hockeyapp.android.prefs_key_name_email", null);
                    } else
                    {
                        ((agl) (obj)).b.putString("net.hockeyapp.android.prefs_key_name_email", String.format("%s|%s|%s", new Object[] {
                            s1, s2, s3
                        }));
                    }
                    agl.a(((agl) (obj)).b);
                }
            }
            obj = ((AttachmentListView)findViewById(8209)).a();
            a(r, s1, s2, s3, s4, ((List) (obj)), view, o, false);
            return;

        case 8208: 
            if (((ViewGroup)findViewById(8209)).getChildCount() >= 3)
            {
                Toast.makeText(this, "Only 3 attachments allowed.", 1000).show();
                return;
            } else
            {
                openContextMenu(view);
                return;
            }

        case 131088: 
            b(false);
            v = true;
            return;

        case 131089: 
            a(r, null, null, null, null, null, agl.a.a.a(a), o, true);
            return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        int i1;
        switch (menuitem.getItemId())
        {
        default:
            return super.onContextItemSelected(menuitem);

        case 1: // '\001'
        case 2: // '\002'
            i1 = menuitem.getItemId();
            break;
        }
        if (i1 == 2)
        {
            menuitem = new Intent();
            menuitem.setType("*/*");
            menuitem.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(Intent.createChooser(menuitem, "Select File"), 2);
            return true;
        }
        if (i1 == 1)
        {
            menuitem = new Intent();
            menuitem.setType("image/*");
            menuitem.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(Intent.createChooser(menuitem, "Select Picture"), 1);
            return true;
        } else
        {
            return false;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(new FeedbackView(this));
        setTitle(afM.a(1035));
        a = this;
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 != null)
        {
            r = bundle1.getString("url");
        }
        if (bundle != null)
        {
            w = bundle.getBoolean("feedbackViewInitialized");
            v = bundle.getBoolean("inSendFeedback");
        } else
        {
            v = false;
            w = false;
        }
        ((NotificationManager)getSystemService("notification")).cancel(2);
        o = new Handler() {

            final FeedbackActivity a;

            public final void handleMessage(Message message)
            {
                boolean flag = false;
                FeedbackActivity.a(a, new afT());
                if (message != null && message.getData() != null)
                {
                    Object obj = message.getData();
                    message = ((Bundle) (obj)).getString("feedback_response");
                    String s1 = ((Bundle) (obj)).getString("feedback_status");
                    obj = ((Bundle) (obj)).getString("request_type");
                    if (((String) (obj)).equals("send") && (message == null || Integer.parseInt(s1) != 201))
                    {
                        FeedbackActivity.a(a).a = afM.a(1036);
                    } else
                    if (((String) (obj)).equals("fetch") && s1 != null && (Integer.parseInt(s1) == 404 || Integer.parseInt(s1) == 422))
                    {
                        FeedbackActivity.b(a);
                        flag = true;
                    } else
                    if (message != null)
                    {
                        FeedbackActivity.a(a, message, ((String) (obj)));
                        flag = true;
                    } else
                    {
                        FeedbackActivity.a(a).a = afM.a(1037);
                    }
                } else
                {
                    FeedbackActivity.a(a).a = afM.a(1036);
                }
                if (!flag)
                {
                    a.runOnUiThread(new Runnable(this) {

                        private _cls2 a;

                        public final void run()
                        {
                            a.a.a(true);
                            a.a.showDialog(0);
                        }

            
            {
                a = _pcls2;
                super();
            }
                    });
                }
            }

            
            {
                a = FeedbackActivity.this;
                super();
            }
        };
        q = new Handler() {

            final FeedbackActivity a;

            public final void handleMessage(Message message)
            {
                FeedbackActivity.a(a, new afT());
                if (message == null || message.getData() == null) goto _L2; else goto _L1
_L1:
                message = (afX)message.getData().getSerializable("parse_feedback_response");
                if (message == null) goto _L2; else goto _L3
_L3:
                boolean flag;
                if (((afX) (message)).a.equalsIgnoreCase("success"))
                {
                    if (((afX) (message)).c != null)
                    {
                        agl.a.a.a(FeedbackActivity.c(a), ((afX) (message)).c);
                        FeedbackActivity.a(a, message);
                        FeedbackActivity.d(a);
                        flag = true;
                    } else
                    {
                        flag = true;
                    }
                } else
                {
                    flag = false;
                }
_L5:
                if (!flag)
                {
                    a.runOnUiThread(new Runnable(this) {

                        private _cls3 a;

                        public final void run()
                        {
                            a.a.showDialog(0);
                        }

            
            {
                a = _pcls3;
                super();
            }
                    });
                }
                a.a(true);
                return;
_L2:
                flag = false;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                a = FeedbackActivity.this;
                super();
            }
        };
        a();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        contextmenu.add(0, 2, 0, "Attach File");
        contextmenu.add(0, 1, 0, "Attach Picture");
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(0x1080027).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                private FeedbackActivity a;

                public final void onClick(DialogInterface dialoginterface, int j1)
                {
                    FeedbackActivity.a(a, null);
                    dialoginterface.cancel();
                }

            
            {
                a = FeedbackActivity.this;
                super();
            }
            }).create();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            if (v)
            {
                v = false;
                a();
            } else
            {
                finish();
            }
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            dialog = (AlertDialog)dialog;
            break;
        }
        if (s != null)
        {
            dialog.setMessage(s.a);
            return;
        } else
        {
            dialog.setMessage(afM.a(1040));
            return;
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(8209);
            for (Iterator iterator = bundle.getParcelableArrayList("attachments").iterator(); iterator.hasNext(); viewgroup.addView(new AttachmentView(this, viewgroup, (Uri)iterator.next()))) { }
            w = bundle.getBoolean("feedbackViewInitialized");
        }
        super.onRestoreInstanceState(bundle);
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (n != null)
        {
            agf agf1 = n;
            agf1.a = null;
            agf1.b = null;
        }
        return n;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelableArrayList("attachments", ((AttachmentListView)findViewById(8209)).a());
        bundle.putBoolean("feedbackViewInitialized", w);
        bundle.putBoolean("inSendFeedback", v);
        super.onSaveInstanceState(bundle);
    }
}

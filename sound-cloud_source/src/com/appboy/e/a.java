// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appboy.d;
import com.appboy.f.b;
import com.appboy.f.c;

// Referenced classes of package com.appboy.e:
//            e

public class com.appboy.e.a
{
    private static final class a extends AsyncTask
    {

        private final Context a;

        protected final Object doInBackground(Object aobj[])
        {
            aobj = (Intent[])aobj;
            if (a != null)
            {
                return com.appboy.e.a.b(a, ((Intent) (aobj[0])));
            } else
            {
                return null;
            }
        }

        protected final void onPostExecute(Object obj)
        {
label0:
            {
                obj = (Intent)obj;
                if (obj != null && a != null)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    a.startActivity(((Intent) (obj)));
                }
                return;
            }
            com.appboy.e.a.a();
        }

        public a(Context context)
        {
            a = context;
        }
    }


    private static final String a;

    public com.appboy.e.a()
    {
    }

    static String a()
    {
        return a;
    }

    private static String a(int i, Bundle bundle, String s)
    {
        s = bundle.getString(s.replace("*", String.valueOf(i)));
        bundle = s;
        if (s == null)
        {
            bundle = "";
        }
        return bundle;
    }

    public static void a(Context context, Intent intent)
    {
        String s;
        String s1;
        String s2;
        int i;
        try
        {
            s = intent.getStringExtra("appboy_action_type");
            if (com.appboy.ui.d.d.a(s))
            {
                String.format("Notification action button type was blank or null.  Doing nothing.", new Object[0]);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            String.format("Caught exception while handling notification action button click.", new Object[] {
                context
            });
            return;
        }
        i = intent.getIntExtra("nid", -1);
        if (s.equals("ab_none")) goto _L2; else goto _L1
_L1:
        s1 = intent.getStringExtra("cid");
        s2 = intent.getStringExtra("appboy_action_id");
        if (!com.appboy.ui.d.d.a(s1)) goto _L4; else goto _L3
_L3:
        String.format("No campaign Id associated with this notification.  Not logging push action click to Appboy.", new Object[0]);
_L2:
        if (!s.equals("ab_uri") && !s.equals("ab_open")) goto _L6; else goto _L5
_L5:
        e.a(context, i);
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        if (!s.equals("ab_uri") || !intent.getExtras().containsKey("appboy_action_uri")) goto _L8; else goto _L7
_L7:
        intent.putExtra("uri", intent.getStringExtra("appboy_action_uri"));
_L9:
        com.appboy.e.e.c(context, intent);
        return;
_L4:
label0:
        {
            if (!com.appboy.ui.d.d.a(s2))
            {
                break label0;
            }
            String.format("No action button Id associated with this notification action.  Not logging push action click to Appboy.", new Object[0]);
        }
          goto _L2
        String.format((new StringBuilder("Logging push action click to Appboy. Campaign Id: ")).append(s1).append(" Action Button Id: ").append(s2).toString(), new Object[0]);
        com.appboy.a.a(context).a(s1, s2);
          goto _L2
_L8:
        intent.removeExtra("uri");
          goto _L9
_L6:
        if (s.equals("ab_share"))
        {
            e.a(context, i);
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            (new a(context)).execute(new Intent[] {
                intent
            });
            return;
        }
        if (s.equals("ab_none"))
        {
            e.a(context, i);
            return;
        }
        String.format("Custom notification action button clicked. Doing nothing and passing on data to client receiver.", new Object[0]);
        com.appboy.e.e.c(context, intent);
        return;
          goto _L2
    }

    public static void a(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        Object obj;
        String s;
        Object obj1;
        int i;
        int j;
        boolean flag;
        try
        {
            String.format("Notification extras were null. Doing nothing.", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            String.format("Caught exception while adding notification action buttons.", new Object[] {
                context
            });
        }
          goto _L3
_L2:
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L3; else goto _L4
_L4:
        i = 0;
_L11:
        if (com.appboy.ui.d.d.a(a(i, bundle, "ab_a*_a"))) goto _L3; else goto _L5
_L5:
        bundle1 = new Bundle(bundle);
        obj = a(i, bundle, "ab_a*_a");
        bundle1.putInt("appboy_action_index", i);
        bundle1.putString("appboy_action_type", ((String) (obj)));
        bundle1.putString("appboy_action_id", a(i, bundle, "ab_a*_id"));
        bundle1.putString("appboy_action_uri", a(i, bundle, "ab_a*_uri"));
        if (!((String) (obj)).equals("ab_uri")) goto _L7; else goto _L6
_L6:
        flag = false;
_L8:
        bundle1.putBoolean("appboy_is_custom_action", flag);
        obj = a(i, bundle, "ab_a*_ic");
        bundle1.putString("appboy_action_icon", a(i, bundle, "ab_a*_ic"));
        obj1 = (new Intent("com.appboy.action.APPBOY_ACTION_CLICKED")).setClass(context, com.appboy.e.e.b());
        ((Intent) (obj1)).putExtras(bundle1);
        s = a(i, bundle, "ab_a*_t");
        obj1 = PendingIntent.getBroadcast(context, com.appboy.f.b.a(), ((Intent) (obj1)), 0x8000000);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        if (com.appboy.ui.d.d.a(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_331;
        }
        j = context.getResources().getIdentifier(((String) (obj)), "drawable", c.a(context));
_L9:
        obj = new android.support.v4.app.NotificationCompat.Action.Builder(j, s, ((PendingIntent) (obj1)));
        ((android.support.v4.app.NotificationCompat.Action.Builder) (obj)).addExtras(new Bundle(bundle1));
        builder.addAction(((android.support.v4.app.NotificationCompat.Action.Builder) (obj)).build());
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        if (!((String) (obj)).equals("ab_open"))
        {
            break MISSING_BLOCK_LABEL_289;
        }
        flag = false;
          goto _L8
        if (!((String) (obj)).equals("ab_none"))
        {
            break MISSING_BLOCK_LABEL_305;
        }
        flag = false;
          goto _L8
        flag = ((String) (obj)).equals("ab_share");
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
          goto _L8
        j = 0;
          goto _L9
_L3:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static Intent b(Context context, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", bundle.getString("t"));
        intent.putExtra("android.intent.extra.TEXT", bundle.getString("a"));
        Object obj = bundle.getBundle("extra");
        boolean flag;
        if (obj != null && ((Bundle) (obj)).containsKey("appboy_image_url") && com.appboy.b.a(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            String s = Long.toString(System.currentTimeMillis());
            obj = com.appboy.b.a(((Bundle) (obj)).getString("appboy_image_url"));
            context = com.appboy.b.a(context.getApplicationContext(), ((android.graphics.Bitmap) (obj)), s, "Shared Photos");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", context);
            intent.addFlags(1);
        } else
        {
            intent.setType("text/plain");
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/e/a.getName()
        });
    }
}

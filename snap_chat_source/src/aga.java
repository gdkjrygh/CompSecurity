// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import net.hockeyapp.android.UpdateActivity;
import org.json.JSONArray;

public final class aga extends afZ
{

    private Activity c;
    private AlertDialog d;
    private boolean e;

    public aga(WeakReference weakreference, String s, String s1)
    {
        super(weakreference, s, s1);
        c = null;
        d = null;
        e = false;
        c = (Activity)weakreference.get();
        e = true;
    }

    static Activity a(aga aga1)
    {
        return aga1.c;
    }

    static void a(aga aga1, JSONArray jsonarray)
    {
        FragmentTransaction fragmenttransaction;
        if (aga1.c == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        fragmenttransaction = aga1.c.getFragmentManager().beginTransaction();
        fragmenttransaction.setTransition(4097);
        android.app.Fragment fragment = aga1.c.getFragmentManager().findFragmentByTag("hockey_update_dialog");
        if (fragment != null)
        {
            fragmenttransaction.remove(fragment);
        }
        fragmenttransaction.addToBackStack(null);
        ((DialogFragment)afO.getMethod("newInstance", new Class[] {
            org/json/JSONArray, java/lang/String
        }).invoke(null, new Object[] {
            jsonarray, aga1.a("apk")
        })).show(fragmenttransaction, "hockey_update_dialog");
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        aga1.a(jsonarray, Boolean.valueOf(false));
        return;
    }

    static void a(aga aga1, JSONArray jsonarray, Boolean boolean1)
    {
        aga1.a(jsonarray, boolean1);
    }

    private void a(JSONArray jsonarray, Boolean boolean1)
    {
        if (c != null)
        {
            Intent intent = new Intent();
            intent.setClass(c, net/hockeyapp/android/UpdateActivity);
            intent.putExtra("json", jsonarray.toString());
            intent.putExtra("url", a("apk"));
            c.startActivity(intent);
            if (boolean1.booleanValue())
            {
                c.finish();
            }
        }
        b();
    }

    public final void a()
    {
        super.a();
        c = null;
        if (d != null)
        {
            d.dismiss();
            d = null;
        }
    }

    protected final void a(JSONArray jsonarray)
    {
label0:
        {
            super.a(jsonarray);
            if (jsonarray != null && e)
            {
                ago.a(c, jsonarray.toString());
                if (c != null && !c.isFinishing())
                {
                    break label0;
                }
            }
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        builder.setTitle(afM.b(513));
        if (!b.booleanValue())
        {
            builder.setMessage(afM.b(514));
            builder.setNegativeButton(afM.b(515), new android.content.DialogInterface.OnClickListener() {

                private aga a;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    a.b();
                }

            
            {
                a = aga.this;
                super();
            }
            });
            builder.setPositiveButton(afM.b(516), new android.content.DialogInterface.OnClickListener(jsonarray) {

                private JSONArray a;
                private aga b;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    ago.a(aga.a(b), "[]");
                    dialoginterface = new WeakReference(aga.a(b));
                    if (agn.a().booleanValue() && agn.a(dialoginterface).booleanValue())
                    {
                        aga.a(b, a);
                        return;
                    } else
                    {
                        aga.a(b, a, Boolean.valueOf(false));
                        return;
                    }
                }

            
            {
                b = aga.this;
                a = jsonarray;
                super();
            }
            });
            d = builder.create();
            d.show();
            return;
        } else
        {
            Toast.makeText(c, afM.b(512), 1).show();
            a(jsonarray, Boolean.valueOf(true));
            return;
        }
    }

    protected final void b()
    {
        super.b();
        c = null;
        d = null;
    }

    protected final void onPostExecute(Object obj)
    {
        a((JSONArray)obj);
    }
}

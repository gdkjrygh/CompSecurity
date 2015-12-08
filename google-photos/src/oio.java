// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spannable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class oio extends omn
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnMultiChoiceClickListener
{

    public oio()
    {
    }

    public static oio a(String s, CharSequence charsequence, String s1, String s2)
    {
        oio oio1 = new oio();
        Bundle bundle = new Bundle();
        if (s != null)
        {
            bundle.putString("title", s);
        }
        if (charsequence != null)
        {
            bundle.putCharSequence("message", charsequence);
        }
        if (s1 != null)
        {
            bundle.putString("positive", s1);
        }
        if (s2 != null)
        {
            bundle.putString("negative", s2);
        }
        oio1.f(bundle);
        return oio1;
    }

    private oip t()
    {
        if (super.r instanceof oip)
        {
            return (oip)super.r;
        }
        if (O_() instanceof oip)
        {
            return (oip)O_();
        } else
        {
            return null;
        }
    }

    public final Dialog c(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder;
        Object obj;
        bundle = super.q;
        obj = r();
        builder = new android.app.AlertDialog.Builder(((Context) (obj)));
        if (bundle.containsKey("title"))
        {
            builder.setTitle(bundle.getString("title"));
        }
        if (!bundle.containsKey("message")) goto _L2; else goto _L1
_L1:
        CharSequence charsequence = bundle.getCharSequence("message");
        TextView textview;
        obj = LayoutInflater.from(((Context) (obj))).inflate(b.If, null);
        textview = (TextView)((View) (obj)).findViewById(b.Ie);
        if (textview == null) goto _L4; else goto _L3
_L3:
        if (!(charsequence instanceof String)) goto _L6; else goto _L5
_L5:
        b.a(textview, (String)charsequence);
_L4:
        builder.setView(((View) (obj)));
_L2:
        if (bundle.containsKey("positive"))
        {
            builder.setPositiveButton(bundle.getString("positive"), this);
        }
        if (bundle.containsKey("negative"))
        {
            builder.setNegativeButton(bundle.getString("negative"), this);
        }
        if (bundle.containsKey("icon_attribute") && android.os.Build.VERSION.SDK_INT >= 11)
        {
            builder.setIconAttribute(bundle.getInt("icon_attribute"));
        } else
        if (bundle.containsKey("icon"))
        {
            builder.setIcon(bundle.getInt("icon"));
        }
        if (bundle.containsKey("list"))
        {
            builder.setItems(bundle.getStringArray("list"), this);
        }
        if (bundle.containsKey("multi_choice_list"))
        {
            charsequence = bundle.getStringArray("multi_choice_list");
            Exception exception;
            if (bundle.containsKey("multi_choice_list_states"))
            {
                bundle = bundle.getBooleanArray("multi_choice_list_states");
            } else
            {
                bundle = new boolean[charsequence.length];
            }
            builder.setMultiChoiceItems(charsequence, bundle, this);
        }
        return builder.create();
_L6:
        if (!(charsequence instanceof Spannable)) goto _L4; else goto _L7
_L7:
        b.a(textview, (Spannable)charsequence);
          goto _L4
        exception;
        Log.e("AlertFragmentDialog", "Cannot inflated view", exception);
        builder.setMessage(charsequence);
          goto _L2
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            dialoginterface = t();
            if (dialoginterface != null)
            {
                switch (i)
                {
                default:
                    super.q.containsKey("list");
                    break;

                case -2: 
                    break;

                case -1: 
                    break label0;
                }
            }
            return;
        }
        dialoginterface.a(super.H);
    }

    public void onClick(DialogInterface dialoginterface, int i, boolean flag)
    {
        if (t() != null)
        {
            super.q.containsKey("multi_choice_list");
        }
    }

    public Context r()
    {
        return O_();
    }
}

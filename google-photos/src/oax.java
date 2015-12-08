// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

public class oax extends nzw
    implements oao
{

    public int a;
    public boolean b;
    public boolean c;
    private int d;

    public oax(Context context)
    {
        this(context, null);
    }

    private oax(Context context, AttributeSet attributeset)
    {
        this(context, null, b.HP);
    }

    private oax(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, oaw.I, i, 0);
        a = context.getInt(oaw.J, 1);
        b = context.getBoolean(oaw.K, true);
        c = context.getBoolean(oaw.L, true);
        context.recycle();
    }

    private void a(Uri uri)
    {
        if (uri != null)
        {
            uri = uri.toString();
        } else
        {
            uri = "";
        }
        e(uri);
    }

    protected final Object a(TypedArray typedarray, int i)
    {
        return typedarray.getString(i);
    }

    protected final void a()
    {
        Object obj = null;
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        String s = a(((String) (null)));
        if (!TextUtils.isEmpty(s))
        {
            obj = Uri.parse(s);
        }
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", ((android.os.Parcelable) (obj)));
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", b);
        if (b)
        {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(a));
        }
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", c);
        intent.putExtra("android.intent.extra.ringtone.TYPE", a);
        intent.putExtra("android.intent.extra.ringtone.TITLE", super.m);
        obj = super.h.b;
        if (obj != null)
        {
            ((oad) (obj)).a(intent, d);
            return;
        } else
        {
            super.h.a.startActivityForResult(intent, d);
            return;
        }
    }

    protected final void a(oam oam1)
    {
        super.a(oam1);
        oam1;
        JVM INSTR monitorenter ;
        if (oam1.d == null)
        {
            oam1.d = new ArrayList();
        }
        if (!oam1.d.contains(this))
        {
            oam1.d.add(this);
        }
        oam1;
        JVM INSTR monitorexit ;
        d = oam1.d();
        return;
        Exception exception;
        exception;
        oam1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a(boolean flag, Object obj)
    {
        for (obj = (String)obj; flag || TextUtils.isEmpty(((CharSequence) (obj)));)
        {
            return;
        }

        a(Uri.parse(((String) (obj))));
    }

    public final boolean a(int i, Intent intent)
    {
        if (i == d)
        {
            if (intent != null)
            {
                Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                if (uri != null)
                {
                    intent = uri.toString();
                } else
                {
                    intent = "";
                }
                if (b(intent))
                {
                    a(uri);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }
}

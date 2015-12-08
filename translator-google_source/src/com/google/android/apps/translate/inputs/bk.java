// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.libraries.translate.c.b;
import com.google.android.libraries.translate.c.c;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.languages.Language;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            bj, bl

final class bk extends HandlerThread
    implements android.os.Handler.Callback
{

    public Handler a;
    final bj b;
    private final String c;
    private h d;
    private h e;

    public bk(bj bj1, Language language)
    {
        b = bj1;
        super(language.getShortName());
        if ("auto".equals(language.getShortName()))
        {
            bj1 = null;
        } else
        {
            bj1 = language.getShortName();
        }
        c = bj1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = new Handler(getLooper(), this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            if (d == null)
            {
                d = (new c()).b(bj.a(b));
                e = com.google.android.libraries.translate.c.b.b().b(bj.a(b));
            }
            message = (String)message.obj;
            ArrayList arraylist = new ArrayList();
            HashSet hashset = new HashSet();
            if (TextUtils.isEmpty(message))
            {
                arraylist.addAll(d.a(message, c));
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); hashset.add(((Entry)iterator.next()).getInputText())) { }
            } else
            {
                arraylist.addAll(e.a(message, c));
                for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); hashset.add(((Entry)iterator1.next()).getInputText())) { }
                if (arraylist.size() < 3)
                {
                    Iterator iterator2 = d.a(message, c).iterator();
                    do
                    {
                        if (!iterator2.hasNext())
                        {
                            break;
                        }
                        Entry entry = (Entry)iterator2.next();
                        if (arraylist.size() >= 3)
                        {
                            break;
                        }
                        if (!hashset.contains(entry.getInputText()))
                        {
                            arraylist.add(entry);
                            hashset.add(entry.getInputText());
                        }
                    } while (true);
                }
            }
            b.c.post(new bl(this, message, arraylist, hashset));
            return true;
        } else
        {
            return false;
        }
    }
}

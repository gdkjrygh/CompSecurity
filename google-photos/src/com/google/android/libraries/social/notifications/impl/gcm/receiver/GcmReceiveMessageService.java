// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.notifications.impl.gcm.receiver;

import android.app.IntentService;
import android.content.Intent;
import android.util.Base64;
import android.util.Pair;
import b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mmv;
import mmx;
import mmz;
import nqk;
import nql;
import nqq;
import nqr;
import nqv;
import nqw;
import nqx;
import nrc;
import nrd;
import nsj;
import nsu;
import ntf;
import nth;
import nti;
import ntn;
import olm;
import oyc;
import ozm;
import ozn;
import qlv;
import qlw;
import qqv;

// Referenced classes of package com.google.android.libraries.social.notifications.impl.gcm.receiver:
//            GcmReceiver

public final class GcmReceiveMessageService extends IntentService
{

    private static final String a = ntn.a("GcmReceiveMsgService");

    public GcmReceiveMessageService()
    {
        super("GcmReceiveMessageService");
    }

    private static ozn a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = (ozn)qlw.a(new ozn(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ntn.b(a, "Failed to parse payload to it's proto form.", abyte0);
            return null;
        }
        return abyte0;
    }

    private void a(int i, oyc aoyc[])
    {
        Object obj = getApplicationContext();
        ntn.a(a, String.format("Processing %d notifications.", new Object[] {
            Integer.valueOf(aoyc.length)
        }));
        nsj.a(((android.content.Context) (obj)), i, aoyc, nqx.b);
        aoyc = nsj.a(aoyc);
        ntn.a(a, String.format("Have %d notifications after filtering ack notifications.", new Object[] {
            Integer.valueOf(aoyc.length)
        }));
        ArrayList arraylist = new ArrayList();
        int l = aoyc.length;
        for (int j = 0; j < l; j++)
        {
            oyc oyc1 = aoyc[j];
            if (a(i, oyc1))
            {
                arraylist.add(oyc1);
            }
        }

        ntn.a(a, String.format("Have %d notifications after filtering by processors.", new Object[] {
            Integer.valueOf(arraylist.size())
        }));
        if (!arraylist.isEmpty())
        {
            aoyc = (oyc[])arraylist.toArray(new oyc[arraylist.size()]);
            ntf.a(((android.content.Context) (obj)), i, aoyc, true);
            aoyc = ntf.b(((android.content.Context) (obj)), i, b.a(aoyc, new int[] {
                1
            }));
            if (aoyc.length > 0)
            {
                obj = olm.c(((android.content.Context) (obj)), nqr);
                int k = ((List) (obj)).size();
                nqq nqq1 = nqq.a;
                Arrays.asList(aoyc);
                for (i = 0; i < k; i++)
                {
                    ((List) (obj)).get(i);
                }

            }
        }
    }

    private boolean a(int i, oyc oyc1)
    {
        Iterator iterator = olm.c(getApplicationContext(), nrc).iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            if (((nrc)iterator.next()).a(i, oyc1) == nrd.b && flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        return flag;
    }

    private static byte[] a(String s)
    {
        try
        {
            s = Base64.decode(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ntn.b(a, "Failed to parse payload string into bytes.", s);
            return null;
        }
        return s;
    }

    private int b(String s)
    {
        mmv mmv1 = (mmv)olm.a(getApplicationContext(), mmv);
        for (Iterator iterator = mmv1.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext();)
        {
            Integer integer = (Integer)iterator.next();
            if (s.equals(mmv1.a(integer.intValue()).b("gaia_id")))
            {
                return integer.intValue();
            }
        }

        ntn.d(a, "Invalid recipientOid");
        return -1;
    }

    protected final void onHandleIntent(Intent intent)
    {
        int i;
        i = 1;
        if (intent == null)
        {
            return;
        }
        if (intent.hasExtra("ht")) goto _L2; else goto _L1
_L1:
        ntn.d(a, "Intent did not contain the payload key.");
_L9:
        GcmReceiver.a(intent);
        return;
_L2:
        Object obj;
        obj = a(a(intent.getStringExtra("ht")));
        String s = a;
        String s1 = String.valueOf(obj);
        ntn.b(s, (new StringBuilder(String.valueOf(s1).length() + 18)).append("Received payload: ").append(s1).toString());
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((ozn) (obj)).a == null) goto _L4; else goto _L5
_L5:
        if (i != 0) goto _L7; else goto _L6
_L6:
        ntn.d(a, "Intent did not contain a valid payload.");
        obj = null;
_L7:
        if (obj == null) goto _L9; else goto _L8
_L8:
        i = b(((ozn) (obj)).a);
        if (i == -1) goto _L9; else goto _L10
_L10:
        Object obj1;
        obj1 = (mmv)olm.a(getApplicationContext(), mmv);
        if (((mmv) (obj1)).a(i).c("GCM_ENABLED"))
        {
            ((mmv) (obj1)).b(i).c("GCM_ENABLED", true).d();
        }
        obj1 = getApplicationContext();
        if (((ozn) (obj)).c == null) goto _L12; else goto _L11
_L11:
        nql nql1 = (nql)olm.a(((android.content.Context) (obj1)), nql);
        ((ozn) (obj)).c.a;
        JVM INSTR tableswitch 1 3: default 517
    //                   1 274
    //                   2 302
    //                   3 340;
           goto _L13 _L14 _L15 _L16
_L13:
        ntn.d(a, "Got UNKNOWN instruction in heavy tickle.");
          goto _L9
        obj;
        GcmReceiver.a(intent);
        throw obj;
_L4:
        i = 0;
          goto _L5
_L14:
        ntn.a(a, "Got SYNC instruction in heavy tickle.");
        nql1.a(i, nqk.a, nqx.b);
          goto _L9
_L15:
        ntn.a(a, "Got COMPLTE_SYNC instruction in heavy tickle.");
        nql1.b(i);
        nql1.a(i, nqk.a, nqx.b);
          goto _L9
_L16:
        ntn.a(a, "Got FETCH_BY_KEY instruction in heavy tickle.");
        obj1 = (nsu)olm.a(((android.content.Context) (obj1)), nsu);
        obj = ((ozn) (obj)).c.b;
        b.v();
        if (i != -1) goto _L18; else goto _L17
_L17:
        obj = Pair.create(new nqv(nqw.c, new IllegalArgumentException("Invalid account ID")), null);
_L19:
        if (((nqv)((Pair) (obj)).first).a == nqw.a && ((Pair) (obj)).second != null)
        {
            a(i, ((qqv)((Pair) (obj)).second).a);
        }
          goto _L9
_L18:
        Object obj2 = nsu.a(((nsu) (obj1)).a, ((String []) (obj)));
        obj2 = new nth(((nsu) (obj1)).a, i, ((qqu) (obj2)));
        olm.a(((nsu) (obj1)).a, nti);
        obj = nsu.a(i, ((String []) (obj)), (nth)nti.a(((nzc) (obj2)), ((nsu) (obj1)).a));
          goto _L19
_L12:
        a(i, ((ozn) (obj)).b);
          goto _L9
    }

}

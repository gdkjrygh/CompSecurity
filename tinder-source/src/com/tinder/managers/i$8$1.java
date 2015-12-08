// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.n;
import com.tinder.f.ak;
import com.tinder.utils.v;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// Referenced classes of package com.tinder.managers:
//            i, ManagerApp, d

final class a
    implements n
{

    final a a;

    public final void a()
    {
        i.g(a.a);
    }

    public final void b()
    {
        i.g(a.a);
    }

    public final void c()
    {
        i.g(a.a);
    }

    rror(rror rror)
    {
        a = rror;
        super();
    }

    // Unreferenced inner class com/tinder/managers/i$8

/* anonymous class */
    final class i._cls8
        implements com.android.volley.i.a
    {

        final i a;

        private void a(int j)
        {
            if (j == 401)
            {
                ManagerApp.h().g().a(String.valueOf(j), new i._cls8._cls1(this));
            }
        }

        public final void a(VolleyError volleyerror)
        {
            v.a("Volley request to /updates failed! ", volleyerror);
            i.g(a);
            if (volleyerror == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            if (volleyerror.a != null)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            a(500);
            a.k();
            return;
            int j = volleyerror.a.a;
            j;
            JVM INSTR lookupswitch 4: default 335
        //                       400: 131
        //                       401: 156
        //                       404: 193
        //                       500: 219;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            v.b((new StringBuilder("Failed to run /updates call, unexpected response code: ")).append(j).toString());
            a(j);
_L6:
            a.k();
            return;
_L2:
            a(j);
              goto _L6
            volleyerror;
            v.a("Failed to parse /update response", volleyerror);
            a.k();
            return;
_L3:
            (new StringBuilder("reason=")).append(volleyerror.getMessage());
            a(j);
              goto _L6
            volleyerror;
            a.k();
            throw volleyerror;
_L4:
            (new StringBuilder("reason=")).append(volleyerror.getMessage());
            a(j);
              goto _L6
_L5:
            (new StringBuilder("reason=")).append(volleyerror.getMessage());
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(volleyerror.a.b)));
            volleyerror = new StringBuilder();
_L9:
            String s = bufferedreader.readLine();
            if (s == null) goto _L8; else goto _L7
_L7:
            volleyerror.append(s);
              goto _L9
            volleyerror;
_L10:
            if (bufferedreader == null)
            {
                break MISSING_BLOCK_LABEL_300;
            }
            bufferedreader.close();
            throw volleyerror;
_L8:
            (new StringBuilder("total response =")).append(volleyerror);
            bufferedreader.close();
            a(j);
              goto _L6
            volleyerror;
            bufferedreader = null;
              goto _L10
        }

            
            {
                a = j;
                super();
            }
    }

}

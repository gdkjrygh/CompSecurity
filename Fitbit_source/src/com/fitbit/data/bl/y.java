// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.d.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, aq, EntityMerger, bs

public class y extends e
{

    private static final String a = "LoadProfileInfoOperation";
    private String b;

    public y(bs bs1, boolean flag, String s)
    {
        super(bs1, flag);
        b = s;
    }

    public static String a(String s)
    {
        return (new StringBuilder()).append("LoadProfileInfoOperation").append(s).toString();
    }

    private void a(RankedUser rankeduser)
    {
        com.fitbit.data.repo.an an = com.fitbit.data.bl.aq.a().z();
        ArrayList arraylist = new ArrayList();
        arraylist.add(rankeduser);
        rankeduser = new EntityMerger(arraylist, an, new _cls1());
        rankeduser.a(new _cls2());
        rankeduser.a(new _cls3());
        rankeduser.a(new _cls4());
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        a1 = new RankedUser();
        a1.initFromPublicApiJsonObject(com.fitbit.d.a.h(e().a().c(b), "user"));
        a(((RankedUser) (a1)));
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, b, com.fitbit.savedstate.LoadSavedState.Status.b);
        e().a(false);
        return;
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, b, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return a(b);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}

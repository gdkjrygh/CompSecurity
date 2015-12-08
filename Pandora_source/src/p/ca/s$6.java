// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import com.facebook.FacebookRequestError;
import com.facebook.Response;
import com.facebook.model.GraphUser;
import com.pandora.android.util.s;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

// Referenced classes of package p.ca:
//            s

class .Object
    implements com.facebook.est.GraphUserListCallback
{

    final p.ca.s a;

    public void onCompleted(List list, Response response)
    {
        response = response.getError();
        if (response != null)
        {
            s.d(a, false);
            p.df.a.a("FindPeopleFragment", (new StringBuilder()).append("FindPeopleFragment.callback.onComplete() --> Failed to load Facebook Friends : ").append(response.getErrorMessage()).toString());
            return;
        }
        p.df.a.a("FindPeopleFragment", "FindPeopleFragment.callback.onComplete() --> Faebook friends loaded successfully");
        response = new JSONObject();
        for (list = list.iterator(); list.hasNext();)
        {
            GraphUser graphuser = (GraphUser)list.next();
            try
            {
                response.put(graphuser.getId(), graphuser.getName());
            }
            catch (JSONException jsonexception)
            {
                p.df.a.a("FindPeopleFragment", "FindPeopleFragment.callback.onComplete() : ", jsonexception);
            }
        }

        list = response.toString();
        if (!s.a(list))
        {
            s.b(a, list);
            s.e(a, false);
        }
        s.d(a, true);
        p.ca.s.a(a, a.b);
    }

    tion(p.ca.s s1)
    {
        a = s1;
        super();
    }
}

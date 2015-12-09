// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import com.facebook.FacebookRequestError;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

// Referenced classes of package p.ca:
//            al

class Object
    implements com.facebook.st.Callback
{

    final al a;

    public void onCompleted(Response response)
    {
        GraphObject graphobject = response.getGraphObject();
        Object obj1 = null;
        Object obj = obj1;
        if (graphobject != null)
        {
            obj = graphobject.getInnerJSONObject();
            try
            {
                obj = ((JSONObject) (obj)).getString("id");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                p.df.a.a("ShareFragment", (new StringBuilder()).append("JSON error ").append(((JSONException) (obj)).getMessage()).toString());
                obj = obj1;
            }
        }
        response = response.getError();
        if (response != null)
        {
            p.df.a.c("ShareFragment", (new StringBuilder()).append("Facebook post error : ").append(response.getErrorMessage()).toString());
            return;
        } else
        {
            p.df.a.a("ShareFragment", (new StringBuilder()).append("Facebook post successful.  postId : ").append(((String) (obj))).toString());
            return;
        }
    }

    on(al al1)
    {
        a = al1;
        super();
    }
}

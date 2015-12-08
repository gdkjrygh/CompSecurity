// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageFull;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.models.InAppMessageModal;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.support.AppboyLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            eu, cw, cu, cd

public final class ct
{

    private static final String d;
    public final JSONArray a;
    public final IInAppMessage b;
    public final cw c;

    public ct(JSONObject jsonobject, cd cd)
    {
        Object obj;
        Object obj1;
        MessageType messagetype;
        obj = null;
        super();
        obj1 = jsonobject.optJSONArray("feed");
        if (obj1 != null)
        {
            a = ((JSONArray) (obj1));
        } else
        {
            a = null;
        }
        obj1 = jsonobject.optJSONObject("inapp");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        messagetype = (MessageType)eu.a(((JSONObject) (obj1)), "type", com/appboy/enums/inappmessage/MessageType, null);
        if (messagetype != null) goto _L4; else goto _L3
_L3:
        AppboyLogger.i(d, (new StringBuilder("In-app message type was null.  Not parsing in-app message JSON: ")).append(((JSONObject) (obj1)).toString()).toString());
        cd = null;
_L10:
        b = cd;
        cd = jsonobject.optJSONObject("config");
        jsonobject = obj;
        if (cd != null)
        {
            try
            {
                jsonobject = new cw(cd);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                AppboyLogger.w(d, (new StringBuilder("Encountered JSONException processing server config: ")).append(cd.toString()).toString(), jsonobject);
                jsonobject = obj;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                AppboyLogger.w(d, (new StringBuilder("Encountered Exception processing server config: ")).append(cd.toString()).toString(), jsonobject);
                jsonobject = obj;
            }
        }
        c = jsonobject;
        return;
_L4:
        cu.a[messagetype.ordinal()];
        JVM INSTR tableswitch 1 4: default 390
    //                   1 200
    //                   2 248
    //                   3 296
    //                   4 310;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        AppboyLogger.e(d, (new StringBuilder("Unknown in-app message type.  Not parsing in-app message JSON: ")).append(((JSONObject) (obj1)).toString()).toString());
        cd = null;
          goto _L10
_L6:
        cd = new InAppMessageFull(((JSONObject) (obj1)), cd);
          goto _L10
        cd;
        AppboyLogger.w(d, (new StringBuilder("Encountered JSONException processing In-app message: ")).append(((JSONObject) (obj1)).toString()).toString(), cd);
        cd = null;
          goto _L10
_L7:
        cd = new InAppMessageModal(((JSONObject) (obj1)), cd);
          goto _L10
        cd;
        AppboyLogger.w(d, (new StringBuilder("Encountered Exception processing In-app message: ")).append(((JSONObject) (obj1)).toString()).toString(), cd);
_L2:
        cd = null;
          goto _L10
_L8:
        cd = new InAppMessageSlideup(((JSONObject) (obj1)), cd);
          goto _L10
_L9:
        cd = new InAppMessageHtmlFull(((JSONObject) (obj1)), cd);
          goto _L10
    }

    static 
    {
        d = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ct.getName()
        });
    }
}

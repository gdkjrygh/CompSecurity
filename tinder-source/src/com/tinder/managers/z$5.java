// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.crashlytics.android.Crashlytics;
import com.tinder.e.y;
import com.tinder.enums.UserPhotoSize;
import com.tinder.f.ak;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import com.tinder.utils.v;
import java.util.ArrayList;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp

public final class g
    implements com.android.volley.
{

    final ProfilePhoto a;
    final ProfilePhoto b;
    final String c;
    final int d;
    final int e;
    final y f;
    final boolean g;
    final z h;

    public final void a(Object obj)
    {
        ArrayList arraylist;
        obj = (JSONObject)obj;
        ((JSONObject) (obj)).toString();
        Object obj1;
        try
        {
            obj = ((JSONObject) (obj)).getJSONArray("assets");
            arraylist = new ArrayList(6);
            obj1 = h.b();
            ManagerApp.h().d();
            UserParse.a(((org.json.JSONArray) (obj)), arraylist, ((User) (obj1)).getId());
            obj1 = z.a(a, arraylist);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b(((Exception) (obj)).toString());
            Crashlytics.a(((Exception) (obj)).toString());
            f.a(e);
            return;
        }
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = b;
        obj1 = ((ProfilePhoto)arraylist.get(arraylist.size() - 1)).getPhotoId();
        z.a(((ProfilePhoto) (obj)).getProcessedPhoto(UserPhotoSize.LARGE).imageUrl);
        if (c != null)
        {
            h.a(d, e, c, ((String) (obj1)), f, true, g, ((ProfilePhoto) (obj)));
            return;
        }
        if (g)
        {
            h.a(d, e, ((String) (obj1)), h.b().getOtherPhotoIds(((String) (obj1))), f, ((ProfilePhoto) (obj)));
            return;
        }
        h.a(arraylist);
        f.a(e, ((ProfilePhoto) (obj)));
        return;
    }

    public Photo(z z1, ProfilePhoto profilephoto, ProfilePhoto profilephoto1, String s, int i, int j, y y1, 
            boolean flag)
    {
        h = z1;
        a = profilephoto;
        b = profilephoto1;
        c = s;
        d = i;
        e = j;
        f = y1;
        g = flag;
        super();
    }
}

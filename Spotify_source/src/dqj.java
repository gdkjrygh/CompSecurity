// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.util.logging.Logger;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

public final class dqj
    implements dqk
{

    private final DateFormat a;

    public dqj(DateFormat dateformat)
    {
        a = dateformat;
    }

    public final boolean a(JsonNode jsonnode, ImageView imageview)
    {
        if (a == null || !jsonnode.isTextual()) goto _L2; else goto _L1
_L1:
        java.util.Date date = a.parse(jsonnode.asText());
        jsonnode = date;
_L3:
        dsu.a(imageview).a(jsonnode, Locale.getDefault());
        return true;
        ParseException parseexception;
        parseexception;
        Object obj = null;
        Logger.b("Date format could not be parsed: %s", new Object[] {
            jsonnode.asText()
        });
        jsonnode = obj;
        if (true) goto _L3; else goto _L2
_L2:
        if (jsonnode.isNumber())
        {
            imageview = dsu.a(imageview);
            long l = jsonnode.asLong();
            jsonnode = Locale.getDefault();
            ((dsu) (imageview)).a.setTimeInMillis(l);
            imageview.a(jsonnode);
            return true;
        } else
        {
            return false;
        }
    }
}

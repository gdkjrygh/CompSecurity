// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.s;
import com.pandora.radio.data.SearchDescriptor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import p.df.a;
import p.di.p;

public class c
    implements k.c
{

    public c()
    {
    }

    private static Bundle a(List list)
    {
        if (list == null)
        {
            return null;
        }
        Bundle bundle = new Bundle(list.size());
        NameValuePair namevaluepair;
        for (list = list.iterator(); list.hasNext(); bundle.putString(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)list.next();
        }

        return bundle;
    }

    private static String a(NameValuePair namevaluepair)
    {
        String s1 = namevaluepair.getValue();
        namevaluepair = s1;
        if (s.a(s1))
        {
            namevaluepair = null;
        }
        return namevaluepair;
    }

    public p.cp.b.c a(Uri uri)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list;
        Iterator iterator;
        try
        {
            uri = new URI(uri.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            p.df.a.c("CreateStationHandler", (new StringBuilder()).append("handleCreateStation exception ").append(uri.getMessage()).toString(), uri);
            return null;
        }
        list = URLEncodedUtils.parse(uri, "UTF-8");
        uri = null;
        obj1 = null;
        obj5 = null;
        obj = null;
        obj3 = null;
        obj4 = null;
        obj2 = null;
        obj6 = null;
        iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Object obj7 = (NameValuePair)iterator.next();
            Object obj9;
            Object obj18;
            boolean flag;
            if ("stationId".equalsIgnoreCase(((NameValuePair) (obj7)).getName()) || "musicId".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                Object obj17 = a(((NameValuePair) (obj7)));
                uri = ((Uri) (obj4));
                Object obj8 = obj5;
                obj7 = obj3;
                obj5 = obj17;
                obj17 = obj2;
                obj4 = obj1;
                obj3 = obj8;
                obj2 = obj;
                obj1 = obj7;
                obj = uri;
                uri = ((Uri) (obj17));
            } else
            if ("song".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                obj7 = a(((NameValuePair) (obj7)));
                obj1 = obj4;
                obj4 = obj7;
                Object obj10 = obj;
                obj7 = uri;
                uri = ((Uri) (obj2));
                obj = obj1;
                obj1 = obj3;
                obj2 = obj10;
                obj3 = obj5;
                obj5 = obj7;
            } else
            if ("artist".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                obj5 = a(((NameValuePair) (obj7)));
                Object obj11 = obj4;
                obj4 = obj5;
                obj5 = obj1;
                Object obj19 = obj;
                obj7 = uri;
                uri = ((Uri) (obj2));
                obj = obj11;
                obj1 = obj3;
                obj2 = obj19;
                obj3 = obj4;
                obj4 = obj5;
                obj5 = obj7;
            } else
            if ("test".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                String s1 = a(((NameValuePair) (obj7)));
                obj7 = uri;
                Object obj12 = obj1;
                uri = ((Uri) (obj2));
                obj = obj4;
                obj1 = obj3;
                obj2 = s1;
                obj3 = obj5;
                obj4 = obj12;
                obj5 = obj7;
            } else
            if ("startingTrackToken".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                String s2 = a(((NameValuePair) (obj7)));
                obj7 = obj1;
                obj3 = obj;
                Uri uri2 = uri;
                obj1 = s2;
                uri = ((Uri) (obj2));
                obj = obj4;
                obj2 = obj3;
                obj3 = obj5;
                obj4 = obj7;
                obj5 = uri2;
            } else
            if ("autoShare".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                String s3 = ((NameValuePair) (obj7)).getValue();
                obj4 = obj1;
                Object obj13 = obj;
                obj7 = uri;
                uri = ((Uri) (obj2));
                obj = s3;
                obj1 = obj3;
                obj2 = obj13;
                obj3 = obj5;
                obj5 = obj7;
            } else
            if ("autoShareLidToken".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                String s4 = ((NameValuePair) (obj7)).getValue();
                obj2 = obj4;
                obj4 = obj1;
                Object obj14 = obj;
                obj7 = uri;
                uri = s4;
                obj = obj2;
                obj1 = obj3;
                obj2 = obj14;
                obj3 = obj5;
                obj5 = obj7;
            } else
            if ("type".equalsIgnoreCase(((NameValuePair) (obj7)).getName()))
            {
                String s5 = ((NameValuePair) (obj7)).getValue();
                obj6 = obj4;
                obj4 = obj1;
                Object obj15 = obj;
                obj7 = uri;
                uri = ((Uri) (obj2));
                obj = obj6;
                obj1 = obj3;
                obj2 = obj15;
                obj3 = obj5;
                obj6 = s5;
                obj5 = obj7;
            } else
            {
                Object obj16 = obj4;
                obj4 = obj1;
                Object obj20 = obj;
                Uri uri1 = uri;
                uri = ((Uri) (obj2));
                obj = obj16;
                obj1 = obj3;
                obj2 = obj20;
                obj3 = obj5;
                obj5 = uri1;
            }
            obj7 = obj5;
            obj9 = obj2;
            obj18 = obj1;
            obj2 = uri;
            obj5 = obj3;
            obj1 = obj4;
            obj4 = obj;
            obj3 = obj18;
            obj = obj9;
            uri = ((Uri) (obj7));
        }
        if (uri != null)
        {
            obj = new PandoraIntent("cmd_create_station");
            ((Intent) (obj)).putExtra("intent_station_creation_source", p.cx.x.e.g.ordinal());
            ((Intent) (obj)).putExtra("intent_music_token", uri);
            if (obj3 != null)
            {
                ((Intent) (obj)).putExtra("intent_start_track_token", ((String) (obj3)));
            }
            if (obj4 != null)
            {
                ((Intent) (obj)).putExtra("intent_auto_share_social_network", ((String) (obj4)));
                if (obj2 != null)
                {
                    ((Intent) (obj)).putExtra("intent_auto_share_lid_token", ((String) (obj2)));
                }
            }
            return new p.cp.b.c(((Intent) (obj)));
        }
        if (obj1 != null || obj5 != null)
        {
            obj = new SearchDescriptor(null, ((String) (obj5)), ((String) (obj1)), true, ((String) (obj6)), a(list));
            if (((SearchDescriptor) (obj)).c())
            {
                uri = Integer.valueOf(0x2942b588);
            } else
            {
                uri = null;
            }
            uri = new com.pandora.radio.util.c(uri);
            if (!((SearchDescriptor) (obj)).c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return new p.cp.b.c(p.a(((SearchDescriptor) (obj)), uri, flag, p.cx.x.e.g));
        }
        if (obj != null)
        {
            uri = new PandoraIntent("cmd_music_search_to_create_station");
            uri.putExtra("intent_search_seed", ((String) (obj)));
            uri.putExtra("intent_station_creation_source", p.cx.x.e.g.ordinal());
            return new p.cp.b.c(uri);
        } else
        {
            return null;
        }
    }
}

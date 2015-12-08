// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.common:
//            EmoticonPack, Emoticon, Charsets

public class EmoticonPackList
    implements Iterable
{
    public static class DeserializeResult
        implements g
    {

        private EmoticonPackList packList;
        private final Status status;

        public EmoticonPackList getPackList()
        {
            return packList;
        }

        public Status getStatus()
        {
            return status;
        }

        private DeserializeResult(Status status1)
        {
            status = status1;
        }


        private DeserializeResult(EmoticonPackList emoticonpacklist)
        {
            packList = emoticonpacklist;
            status = new Status(0);
        }

    }


    private List packs;

    public EmoticonPackList()
    {
        packs = new ArrayList();
    }

    public static EmoticonPackList deserialize(String s)
        throws JSONException
    {
        s = new JSONArray(s);
        EmoticonPackList emoticonpacklist = new EmoticonPackList();
        for (int i = 0; i < s.length(); i++)
        {
            Object obj = s.getJSONObject(i);
            EmoticonPack emoticonpack = new EmoticonPack(((JSONObject) (obj)).optString("name"), ((JSONObject) (obj)).optString("type"));
            emoticonpack.setBitmapsDataUri(Uri.parse(((JSONObject) (obj)).optString("staticAssetDataUri")));
            obj = ((JSONObject) (obj)).optJSONArray("contents");
            if (obj != null)
            {
                for (int j = 0; j < ((JSONArray) (obj)).length(); j++)
                {
                    JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(j);
                    emoticonpack.add(new Emoticon(jsonobject.optInt("id"), jsonobject.optString("stringId"), jsonobject.optInt("sortOrder"), jsonobject.optString("staticBitmapAssetKey")));
                }

            }
            emoticonpacklist.add(emoticonpack);
        }

        return emoticonpacklist;
    }

    public static void deserialize(com.google.android.gms.common.api.c c1, Asset asset, h h1)
    {
        if (asset == null)
        {
            h1.onResult(new DeserializeResult(new Status(13, "Asset is null.")));
            return;
        } else
        {
            o.a.a(c1, asset).a(new h(h1) {

                final h val$resultCallback;

                public final volatile void onResult(g g)
                {
                    onResult((com.google.android.gms.wearable.c.d)g);
                }

                public final void onResult(com.google.android.gms.wearable.c.d d)
                {
                    boolean flag = d.getStatus().d();
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_115;
                    }
                    EmoticonPackList emoticonpacklist = EmoticonPackList.deserialize((new Scanner(d.b(), Charsets.UTF_8.name())).useDelimiter("\\A").next());
                    resultCallback.onResult(new DeserializeResult(emoticonpacklist));
_L1:
                    d.a();
                    return;
                    Object obj;
                    obj;
                    Status status = new Status(13, ((JSONException) (obj)).getMessage());
                    resultCallback.onResult(new DeserializeResult(status));
                      goto _L1
                    status;
                    d.a();
                    throw status;
                    resultCallback.onResult(new DeserializeResult(d.getStatus()));
                      goto _L1
                }

            
            {
                resultCallback = h1;
                super();
            }
            });
            return;
        }
    }

    public void add(EmoticonPack emoticonpack)
    {
        packs.add(emoticonpack);
    }

    public int emoticonListSize()
    {
        for (Iterator iterator1 = packs.iterator(); iterator1.hasNext();)
        {
            EmoticonPack emoticonpack = (EmoticonPack)iterator1.next();
            if (emoticonpack.getType().equals("MEDIA_EMOTICON"))
            {
                return emoticonpack.size();
            }
        }

        return 0;
    }

    public Iterator iterator()
    {
        return packs.iterator();
    }

    public Asset serializeAsAsset()
    {
        Asset asset;
        try
        {
            asset = Asset.a(serializeAsJson().getBytes(Charsets.UTF_8));
        }
        catch (JSONException jsonexception)
        {
            throw new IllegalStateException(jsonexception);
        }
        return asset;
    }

    public String serializeAsJson()
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        Collections.sort(packs);
        JSONObject jsonobject;
        for (Iterator iterator1 = packs.iterator(); iterator1.hasNext(); jsonarray.put(jsonobject))
        {
            EmoticonPack emoticonpack = (EmoticonPack)iterator1.next();
            jsonobject = new JSONObject();
            jsonobject.put("name", emoticonpack.getName());
            jsonobject.put("type", emoticonpack.getType());
            JSONArray jsonarray1 = new JSONArray();
            emoticonpack.sort();
            JSONObject jsonobject1;
            for (Iterator iterator2 = emoticonpack.getEmoticons().iterator(); iterator2.hasNext(); jsonarray1.put(jsonobject1))
            {
                Emoticon emoticon = (Emoticon)iterator2.next();
                String s = emoticon.getStringId();
                jsonobject1 = new JSONObject();
                jsonobject1.put("id", emoticon.getId());
                jsonobject1.put("stringId", s);
                jsonobject1.put("sortOrder", emoticon.getSortOrder());
                jsonobject1.put("staticBitmapAssetKey", emoticon.getStringId());
            }

            jsonobject.put("contents", jsonarray1);
            jsonobject.put("staticAssetDataUri", emoticonpack.getBitmapsDataUri().toString());
        }

        return jsonarray.toString();
    }
}

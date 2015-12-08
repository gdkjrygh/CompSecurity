// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.EmoticonSpan;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.mediacontent.OnMRUListUpdated;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MRUManager
{
    private static final class a
    {

        JSONArray array;
        com.skype.MediaDocument.DOCUMENT_TYPE type;

        public final JSONObject toJson()
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("mediaType", type);
                jsonobject.put("mediaList", array);
            }
            catch (JSONException jsonexception)
            {
                MRUManager.log.severe((new StringBuilder("error generating json for ")).append(toString()).append(": ").append(jsonexception.getMessage()).toString());
                return jsonobject;
            }
            return jsonobject;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[MRUlist: \"");
            stringbuilder.append(type.toString());
            stringbuilder.append("\", ");
            stringbuilder.append(array.toString());
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public a(com.skype.MediaDocument.DOCUMENT_TYPE document_type, List list)
        {
            array = new JSONArray();
            type = document_type;
            for (document_type = list.iterator(); document_type.hasNext(); array.put(list))
            {
                list = (String)document_type.next();
            }

        }

        public a(JSONObject jsonobject)
            throws JSONException
        {
            array = new JSONArray();
            type = com.skype.MediaDocument.DOCUMENT_TYPE.valueOf(jsonobject.getString("mediaType"));
            array = jsonobject.getJSONArray("mediaList");
        }
    }


    private static final String JSON_PARAM_LIST = "mediaList";
    private static final String JSON_PARAM_LISTS = "lists";
    private static final String JSON_PARAM_MEDIA_TYPE = "mediaType";
    private static final String PREF_KEY_LIST = "mru_list";
    private static final String PREF_NAME = "mru";
    private static final int RECENTS_MAX_NUMBER = 40;
    private static final Logger log = Logger.getLogger("MRUManager");
    private Provider accountProvider;
    private EcsConfiguration configuration;
    private final Context context;
    private EventBus eventBus;
    private HashMap lists;
    private ObjectIdMap map;
    private FormattedMessageCache messageCache;

    public MRUManager(ObjectIdMap objectidmap, FormattedMessageCache formattedmessagecache, Provider provider, Context context1, EventBus eventbus, EcsConfiguration ecsconfiguration)
    {
        lists = new HashMap();
        map = objectidmap;
        messageCache = formattedmessagecache;
        accountProvider = provider;
        context = context1;
        eventBus = eventbus;
        configuration = ecsconfiguration;
        (new EventSubscriberBinder(EventBusInstance.a(), this)).bind();
        load();
    }

    private SharedPreferences getSharedPreferences()
    {
        return context.getSharedPreferences((new StringBuilder("mru")).append(((Account)accountProvider.get()).getSkypenameProp()).toString(), 0);
    }

    private void load()
    {
        Object obj;
        obj = getSharedPreferences().getString("mru_list", "");
        log.info((new StringBuilder("loading mru list: ")).append(((String) (obj))).toString());
        lists.clear();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_214;
        }
        obj = (new JSONObject(((String) (obj)))).getJSONArray("lists");
        int i = 0;
_L3:
        a a1;
        LinkedList linkedlist;
        if (i >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_214;
        }
        a1 = new a(((JSONArray) (obj)).getJSONObject(i));
        linkedlist = new LinkedList();
        int j = 0;
_L2:
        if (j >= Math.min(a1.array.length(), 40))
        {
            break; /* Loop/switch isn't completed */
        }
        linkedlist.add(a1.array.getString(j));
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        lists.put(a1.type, linkedlist);
        log.info((new StringBuilder("list loaded: ")).append(a1.toString()).toString());
        i++;
          goto _L3
        JSONException jsonexception;
        jsonexception;
        log.severe((new StringBuilder("error loading mru list: ")).append(jsonexception.getMessage()).toString());
    }

    private void onMediaDocumentSent(String s, com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        LinkedList linkedlist1 = (LinkedList)lists.get(document_type);
        LinkedList linkedlist = linkedlist1;
        if (linkedlist1 == null)
        {
            linkedlist = new LinkedList();
            lists.put(document_type, linkedlist);
        }
        linkedlist.remove(s);
        linkedlist.addFirst(s);
        if (linkedlist.size() == 40)
        {
            linkedlist.removeLast();
        }
        log.info(String.format("added item '%s', new list size: %d", new Object[] {
            s, Integer.valueOf(linkedlist.size())
        }));
    }

    private void save()
    {
        android.content.SharedPreferences.Editor editor;
        JSONObject jsonobject;
        editor = getSharedPreferences().edit();
        jsonobject = new JSONObject();
        Object obj;
        obj = new JSONArray();
        java.util.Map.Entry entry;
        for (Iterator iterator = lists.entrySet().iterator(); iterator.hasNext(); ((JSONArray) (obj)).put((new a((com.skype.MediaDocument.DOCUMENT_TYPE)entry.getKey(), (List)entry.getValue())).toJson()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

          goto _L1
_L3:
        log.info((new StringBuilder("saving mru list: ")).append(jsonobject.toString()).toString());
        editor.putString("mru_list", jsonobject.toString());
        editor.apply();
        eventBus.a(new OnMRUListUpdated());
        return;
_L1:
        try
        {
            jsonobject.put("lists", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            log.severe((new StringBuilder("error saving mru list: ")).append(((JSONException) (obj)).getMessage()).toString());
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public List getRecentItemsOfType(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        List list = (List)lists.get(document_type);
        if (document_type == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK && !configuration.isMojiSupported())
        {
            log.info((new StringBuilder("ignoring request for ")).append(document_type).append(" since mojis are not supported").toString());
            return new ArrayList();
        }
        if (list == null)
        {
            log.info((new StringBuilder("no recent items for type ")).append(document_type).toString());
            return new ArrayList();
        } else
        {
            log.info(String.format("returning %d items for type %s", new Object[] {
                Integer.valueOf(list.size()), document_type
            }));
            return list;
        }
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        if (((Account)onpropertychange.getSender()).getStatusProp() == com.skype.Account.STATUS.LOGGED_IN && onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS)
        {
            load();
        }
    }

    public void onMojisPosted(MojiContent mojicontent)
    {
        int i = mojicontent.k();
        if (i >= 0)
        {
            onMediaDocumentSent(String.valueOf(i), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK);
            save();
        }
    }

    public List onTextPosted(CharSequence charsequence)
    {
        ArrayList arraylist = new ArrayList();
        boolean flag1 = false;
        boolean flag = false;
        boolean flag2 = flag1;
        if (charsequence instanceof SpannableStringBuilder)
        {
            charsequence = (SpannableStringBuilder)charsequence;
            charsequence = (EmoticonSpan[])charsequence.getSpans(0, charsequence.length(), com/skype/android/mediacontent/EmoticonSpan);
            flag2 = flag1;
            if (charsequence != null)
            {
                flag2 = flag1;
                if (charsequence.length > 0)
                {
                    int j = charsequence.length;
                    int i = 0;
                    do
                    {
                        flag2 = flag;
                        if (i >= j)
                        {
                            break;
                        }
                        EmoticonSpan emoticonspan = charsequence[i];
                        EmoticonContent emoticoncontent = emoticonspan.b();
                        if (emoticoncontent != null)
                        {
                            onMediaDocumentSent(emoticoncontent.e(), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
                            flag = true;
                            arraylist.add(emoticonspan);
                        }
                        i++;
                    } while (true);
                }
            }
        }
        if (flag2)
        {
            save();
        }
        return arraylist;
    }


}

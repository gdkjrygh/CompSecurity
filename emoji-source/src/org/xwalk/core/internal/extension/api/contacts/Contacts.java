// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.internal.extension.XWalkExtensionWithActivityStateListener;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            ContactEventListener, ContactSaver, ContactFinder

public class Contacts extends XWalkExtensionWithActivityStateListener
{

    public static final String JS_API_PATH = "jsapi/contacts_api.js";
    private static final String NAME = "xwalk.experimental.contacts";
    private static final String TAG = "Contacts";
    private final ContactEventListener mObserver;
    private final ContentResolver mResolver;

    public Contacts(String s, Activity activity)
    {
        super("xwalk.experimental.contacts", s, activity);
        mResolver = activity.getContentResolver();
        mObserver = new ContactEventListener(new Handler(), this, mResolver);
        mResolver.registerContentObserver(android.provider.ContactsContract.Contacts.CONTENT_URI, true, mObserver);
    }

    private void handleClear()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj2 = mResolver.query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
_L4:
        obj = obj2;
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToNext()) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj1 = obj2;
        Object obj3 = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("lookup"));
        obj = obj2;
        obj1 = obj2;
        obj3 = Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, ((String) (obj3)));
        obj = obj2;
        obj1 = obj2;
        mResolver.delete(((Uri) (obj3)), null, null);
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj1 = obj;
        Log.e("Contacts", (new StringBuilder()).append("handleClear - failed to query: ").append(((SecurityException) (obj2)).toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L6:
        return;
_L2:
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj2)).close();
        return;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw exception;
    }

    public void onActivityStateChange(Activity activity, int i)
    {
        switch (i)
        {
        case 5: // '\005'
        default:
            return;

        case 3: // '\003'
            mObserver.onResume();
            mResolver.registerContentObserver(android.provider.ContactsContract.Contacts.CONTENT_URI, true, mObserver);
            return;

        case 4: // '\004'
        case 6: // '\006'
            mResolver.unregisterContentObserver(mObserver);
            break;
        }
    }

    public void onMessage(int i, String s)
    {
        Object obj;
        Object obj1;
        if (s.isEmpty())
        {
            return;
        }
        try
        {
            obj = new JSONObject(s);
            obj1 = ((JSONObject) (obj)).getString("cmd");
            if (((String) (obj1)).equals("addEventListener"))
            {
                mObserver.startListening();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Contacts", s.toString());
            return;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("asyncCallId", ((JSONObject) (obj)).getString("asyncCallId"));
        if (!((String) (obj1)).equals("save")) goto _L2; else goto _L1
_L1:
        jsonobject.put("data", (new ContactSaver(mResolver)).save(((JSONObject) (obj)).getString("contact")));
_L5:
        postMessage(i, jsonobject.toString());
        return;
_L2:
        if (!((String) (obj1)).equals("find")) goto _L4; else goto _L3
_L3:
        obj1 = new ContactFinder(mResolver);
        if (!((JSONObject) (obj)).has("options"))
        {
            break MISSING_BLOCK_LABEL_356;
        }
        s = ((JSONObject) (obj)).getString("options");
_L6:
        jsonobject.put("data", ((ContactFinder) (obj1)).find(s));
          goto _L5
_L4:
        if (!((String) (obj1)).equals("remove"))
        {
            break MISSING_BLOCK_LABEL_313;
        }
        s = new ArrayList();
        obj = ((JSONObject) (obj)).getString("contactId");
        s.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id=?", new String[] {
            obj
        }).build());
        mResolver.applyBatch("com.android.contacts", s);
          goto _L5
        s;
        if ((s instanceof RemoteException) || (s instanceof OperationApplicationException) || (s instanceof SecurityException))
        {
            Log.e("Contacts", (new StringBuilder()).append("onMessage - Failed to apply batch: ").append(s.toString()).toString());
            return;
        }
        throw new RuntimeException(s);
        if (!((String) (obj1)).equals("clear"))
        {
            break MISSING_BLOCK_LABEL_330;
        }
        handleClear();
          goto _L5
        Log.e("Contacts", (new StringBuilder()).append("Unexpected message received: ").append(s).toString());
        return;
        s = null;
          goto _L6
    }

    public String onSyncMessage(int i, String s)
    {
        return null;
    }
}

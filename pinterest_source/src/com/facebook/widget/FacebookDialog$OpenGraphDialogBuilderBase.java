// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphObjectException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.OpenGraphAction;
import com.facebook.model.OpenGraphObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class previewPropertyName extends previewPropertyName
{

    private OpenGraphAction action;
    private String actionType;
    private boolean dataErrorsFatal;
    private String previewPropertyName;

    private JSONObject flattenChildrenOfGraphObject(JSONObject jsonobject)
    {
        try
        {
            jsonobject = new JSONObject(jsonobject.toString());
            Iterator iterator = jsonobject.keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (!s.equalsIgnoreCase("image"))
                {
                    jsonobject.put(s, flattenObject(jsonobject.get(s)));
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new FacebookException(jsonobject);
        }
        return jsonobject;
    }

    private Object flattenObject(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return obj1;
_L2:
        if (!(obj instanceof JSONObject))
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = (JSONObject)obj;
        obj1 = obj;
        if (!jsonobject.optBoolean("fbsdk:create_object"))
        {
            if (jsonobject.has("id"))
            {
                return jsonobject.getString("id");
            }
            obj1 = obj;
            if (jsonobject.has("url"))
            {
                return jsonobject.getString("url");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        if (obj instanceof JSONArray)
        {
            obj = (JSONArray)obj;
            JSONArray jsonarray = new JSONArray();
            int j = ((JSONArray) (obj)).length();
            for (int i = 0; i < j; i++)
            {
                jsonarray.put(flattenObject(((JSONArray) (obj)).get(i)));
            }

            return jsonarray;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void updateActionAttachmentUrls(List list, boolean flag)
    {
        Object obj;
        obj = action.getImage();
        if (obj == null)
        {
            obj = new ArrayList(list.size());
        }
        list = list.iterator();
_L3:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)list.next();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", s);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new FacebookException("Unable to attach images", list);
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject.put("user_generated", true);
        ((List) (obj)).add(jsonobject);
          goto _L3
_L2:
        action.setImage(((List) (obj)));
        return;
    }

    protected Bundle getMethodArguments()
    {
        Bundle bundle = new Bundle();
        putExtra(bundle, "PREVIEW_PROPERTY_NAME", previewPropertyName);
        putExtra(bundle, "ACTION_TYPE", actionType);
        bundle.putBoolean("DATA_FAILURES_FATAL", dataErrorsFatal);
        putExtra(bundle, "ACTION", flattenChildrenOfGraphObject(action.getInnerJSONObject()).toString());
        return bundle;
    }

    protected Bundle setBundleExtras(Bundle bundle)
    {
        putExtra(bundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", previewPropertyName);
        putExtra(bundle, "com.facebook.platform.extra.ACTION_TYPE", actionType);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", dataErrorsFatal);
        putExtra(bundle, "com.facebook.platform.extra.ACTION", flattenChildrenOfGraphObject(action.getInnerJSONObject()).toString());
        return bundle;
    }

    public action setDataErrorsFatal(boolean flag)
    {
        dataErrorsFatal = flag;
        return this;
    }

    public dataErrorsFatal setImageAttachmentFilesForAction(List list)
    {
        return setImageAttachmentFilesForAction(list, false);
    }

    public setImageAttachmentFilesForAction setImageAttachmentFilesForAction(List list, boolean flag)
    {
        Validate.containsNoNulls(list, "bitmapFiles");
        if (action == null)
        {
            throw new FacebookException("Can not set attachments prior to setting action.");
        } else
        {
            updateActionAttachmentUrls(addImageAttachmentFiles(list), flag);
            return this;
        }
    }

    public addImageAttachmentFiles setImageAttachmentFilesForObject(String s, List list)
    {
        return setImageAttachmentFilesForObject(s, list, false);
    }

    public setImageAttachmentFilesForObject setImageAttachmentFilesForObject(String s, List list, boolean flag)
    {
        Validate.notNull(s, "objectProperty");
        Validate.containsNoNulls(list, "bitmapFiles");
        if (action == null)
        {
            throw new FacebookException("Can not set attachments prior to setting action.");
        } else
        {
            updateObjectAttachmentUrls(s, addImageAttachmentFiles(list), flag);
            return this;
        }
    }

    public addImageAttachmentFiles setImageAttachmentsForAction(List list)
    {
        return setImageAttachmentsForAction(list, false);
    }

    public setImageAttachmentsForAction setImageAttachmentsForAction(List list, boolean flag)
    {
        Validate.containsNoNulls(list, "bitmaps");
        if (action == null)
        {
            throw new FacebookException("Can not set attachments prior to setting action.");
        } else
        {
            updateActionAttachmentUrls(addImageAttachments(list), flag);
            return this;
        }
    }

    public addImageAttachments setImageAttachmentsForObject(String s, List list)
    {
        return setImageAttachmentsForObject(s, list, false);
    }

    public setImageAttachmentsForObject setImageAttachmentsForObject(String s, List list, boolean flag)
    {
        Validate.notNull(s, "objectProperty");
        Validate.containsNoNulls(list, "bitmaps");
        if (action == null)
        {
            throw new FacebookException("Can not set attachments prior to setting action.");
        } else
        {
            updateObjectAttachmentUrls(s, addImageAttachments(list), flag);
            return this;
        }
    }

    void updateObjectAttachmentUrls(String s, List list, boolean flag)
    {
        OpenGraphObject opengraphobject;
        try
        {
            opengraphobject = (OpenGraphObject)action.getPropertyAs(s, com/facebook/model/OpenGraphObject);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalArgumentException((new StringBuilder("Property '")).append(s).append("' is not a graph object").toString());
        }
        if (opengraphobject != null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        throw new IllegalArgumentException((new StringBuilder("Action does not contain a property '")).append(s).append("'").toString());
        if (!opengraphobject.getCreateObject())
        {
            throw new IllegalArgumentException((new StringBuilder("The Open Graph object in '")).append(s).append("' is not marked for creation").toString());
        }
        s = opengraphobject.getImage();
        if (s == null)
        {
            s = com.facebook.model..action(com/facebook/model/GraphObject);
        }
        GraphObject graphobject;
        for (list = list.iterator(); list.hasNext(); s.add(graphobject))
        {
            String s1 = (String)list.next();
            graphobject = com.facebook.model..action();
            graphobject.setProperty("url", s1);
            if (flag)
            {
                graphobject.setProperty("user_generated", Boolean.valueOf(true));
            }
        }

        opengraphobject.setImage(s);
        return;
    }

    public (Activity activity, OpenGraphAction opengraphaction, String s)
    {
        super(activity);
        Validate.notNull(opengraphaction, "action");
        Validate.notNullOrEmpty(opengraphaction.getType(), "action.getType()");
        Validate.notNullOrEmpty(s, "previewPropertyName");
        if (opengraphaction.getProperty(s) == null)
        {
            throw new IllegalArgumentException((new StringBuilder("A property named \"")).append(s).append("\" was not found on the action.  The name of the preview property must match the name of an action property.").toString());
        } else
        {
            action = opengraphaction;
            actionType = opengraphaction.getType();
            previewPropertyName = s;
            return;
        }
    }

    public previewPropertyName(Activity activity, OpenGraphAction opengraphaction, String s, String s1)
    {
        super(activity);
        Validate.notNull(opengraphaction, "action");
        Validate.notNullOrEmpty(s, "actionType");
        Validate.notNullOrEmpty(s1, "previewPropertyName");
        if (opengraphaction.getProperty(s1) == null)
        {
            throw new IllegalArgumentException((new StringBuilder("A property named \"")).append(s1).append("\" was not found on the action.  The name of the preview property must match the name of an action property.").toString());
        }
        activity = opengraphaction.getType();
        if (!Utility.isNullOrEmpty(activity) && !activity.equals(s))
        {
            throw new IllegalArgumentException("'actionType' must match the type of 'action' if it is specified. Consider using OpenGraphDialogBuilderBase(Activity activity, OpenGraphAction action, String previewPropertyName) instead.");
        } else
        {
            action = opengraphaction;
            actionType = s;
            previewPropertyName = s1;
            return;
        }
    }
}

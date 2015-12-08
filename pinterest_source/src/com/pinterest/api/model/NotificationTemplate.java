// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.utils.PStringUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.api.model:
//            Model

public class NotificationTemplate extends Model
{

    private HashMap _subjectMap;
    private Date cacheExpirationDate;
    private String subjectsJson;
    private String templateString;
    private String uid;

    public NotificationTemplate()
    {
    }

    public NotificationTemplate(String s)
    {
        uid = s;
    }

    public NotificationTemplate(String s, Date date, String s1, String s2)
    {
        uid = s;
        cacheExpirationDate = date;
        templateString = s1;
        subjectsJson = s2;
    }

    private void createSubjectMap()
    {
        _subjectMap = new HashMap();
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject(subjectsJson);
        Iterator iterator = pinterestjsonobject.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c(s);
            if (pinterestjsonobject1 != null)
            {
                SubjectType subjecttype = SubjectType.parse(pinterestjsonobject1.a("type", ""));
                if (subjecttype != null)
                {
                    NotificationSubject notificationsubject = new NotificationSubject();
                    notificationsubject.setType(subjecttype);
                    notificationsubject.setValue(pinterestjsonobject1.a("value", ""));
                    notificationsubject.setUid(pinterestjsonobject1.a("uid", ""));
                    notificationsubject.setIsArray(pinterestjsonobject1.a("isArray"));
                    _subjectMap.put(s, notificationsubject);
                }
            }
        } while (true);
    }

    public static NotificationTemplate make(PinterestJsonObject pinterestjsonobject, String s, String s1)
    {
        return make(pinterestjsonobject, s, s1, true);
    }

    public static NotificationTemplate make(PinterestJsonObject pinterestjsonobject, String s, String s1, boolean flag)
    {
        final NotificationTemplate template;
        HashMap hashmap;
        Iterator iterator;
        template = new NotificationTemplate();
        template.setTemplateString(s1);
        template.setUid(s);
        hashmap = new HashMap();
        iterator = pinterestjsonobject.d().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s3 = (String)iterator.next();
        Object obj1 = pinterestjsonobject.c(s3);
        if (obj1 != null)
        {
            HashMap hashmap1 = new HashMap();
            hashmap1.put("value", ((PinterestJsonObject) (obj1)).a("string_value", ""));
            s = ((PinterestJsonObject) (obj1)).a("data_type", "");
            s1 = "";
            Object obj = Boolean.valueOf(false);
            if (s.equals("model"))
            {
                obj1 = ((PinterestJsonObject) (obj1)).c("data");
                if (obj1 != null)
                {
                    s = ((PinterestJsonObject) (obj1)).a("type", "");
                    s1 = ((PinterestJsonObject) (obj1)).a("id", "0");
                }
                obj1 = s1;
                Object obj2 = obj;
                s1 = s;
                obj = obj1;
                s = ((String) (obj2));
            } else
            if (s.equals("array"))
            {
                obj = Boolean.valueOf(true);
                obj1 = ((PinterestJsonObject) (obj1)).e("data");
                ArrayList arraylist = new ArrayList();
                int j = ((PinterestJsonArray) (obj1)).a();
                int i = 0;
                s1 = s;
                for (; i < j; i++)
                {
                    s = ((PinterestJsonArray) (obj1)).c(i);
                    s1 = s.a("type", null);
                    arraylist.add(s.a("id", null));
                }

                obj1 = PStringUtils.concatStringArray(arraylist, ",");
                s = ((String) (obj));
                obj = obj1;
            } else
            {
                s1 = s;
                String s2 = "";
                s = ((String) (obj));
                obj = s2;
            }
            hashmap1.put("uid", obj);
            hashmap1.put("type", s1);
            hashmap1.put("isArray", s.toString());
            hashmap.put(s3, hashmap1);
        }
        if (true) goto _L3; else goto _L2
_L2:
        template.setSubjectsJson((new PinterestJsonObject(hashmap)).toString());
        if (flag)
        {
            (new _cls1()).execute();
        }
        return template;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public NotificationSubject getSubject(String s)
    {
        if (_subjectMap == null)
        {
            createSubjectMap();
        }
        return (NotificationSubject)_subjectMap.get(s);
    }

    public ArrayList getSubjects()
    {
        if (_subjectMap == null)
        {
            createSubjectMap();
        }
        return new ArrayList(_subjectMap.values());
    }

    public String getSubjectsJson()
    {
        return subjectsJson;
    }

    public String getTemplateString()
    {
        return templateString;
    }

    public String getUid()
    {
        return uid;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setSubjectsJson(String s)
    {
        subjectsJson = s;
    }

    public void setTemplateString(String s)
    {
        templateString = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    private class SubjectType extends Enum
    {

        private static final SubjectType $VALUES[];
        public static final SubjectType ARRAY;
        public static final SubjectType BOARD;
        public static final SubjectType COMMENT;
        public static final SubjectType PIN;
        public static final SubjectType USER;

        public static SubjectType parse(String s)
        {
            try
            {
                s = valueOf(PStringUtils.toEnumUpperCase(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static SubjectType valueOf(String s)
        {
            return (SubjectType)Enum.valueOf(com/pinterest/api/model/NotificationTemplate$SubjectType, s);
        }

        public static SubjectType[] values()
        {
            return (SubjectType[])$VALUES.clone();
        }

        static 
        {
            PIN = new SubjectType("PIN", 0);
            USER = new SubjectType("USER", 1);
            BOARD = new SubjectType("BOARD", 2);
            COMMENT = new SubjectType("COMMENT", 3);
            ARRAY = new SubjectType("ARRAY", 4);
            $VALUES = (new SubjectType[] {
                PIN, USER, BOARD, COMMENT, ARRAY
            });
        }

        private SubjectType(String s, int i)
        {
            super(s, i);
        }
    }


    private class NotificationSubject
    {

        private SubjectType _dataType;
        private Boolean _isArray;
        private SubjectType _type;
        private String _uid;
        private String _value;
        final NotificationTemplate this$0;

        public Boolean getIsArray()
        {
            return _isArray;
        }

        public SubjectType getType()
        {
            return _type;
        }

        public String getUid()
        {
            return _uid;
        }

        public String getValue()
        {
            return _value;
        }

        public void setIsArray(Boolean boolean1)
        {
            _isArray = boolean1;
        }

        public void setType(SubjectType subjecttype)
        {
            _type = subjecttype;
        }

        public void setUid(String s)
        {
            _uid = s;
        }

        public void setValue(String s)
        {
            _value = s;
        }

        public NotificationSubject()
        {
            this$0 = NotificationTemplate.this;
            super();
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final NotificationTemplate val$template;

        public final void run()
        {
            ModelHelper.setNotificationTemplate(template);
        }

        _cls1()
        {
            template = notificationtemplate;
            super();
        }
    }

}

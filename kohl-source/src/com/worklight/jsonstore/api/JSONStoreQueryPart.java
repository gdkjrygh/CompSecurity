// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import com.worklight.jsonstore.database.QueryPartOperation;
import com.worklight.jsonstore.exceptions.JSONStoreFindException;
import com.worklight.jsonstore.util.JSONStoreLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.api:
//            JSONStoreQueryPartItem

public class JSONStoreQueryPart
{

    private static final String EXCEPTION_SEARCH_FIELD_MUST_BE_A_NONEMPTY_STRING = "Search field must be a nonempty string";
    private static final String EXCEPTION_VALUE_MUST_NOT_BE_NULL = "Value must not be null";
    private List queryItems;

    public JSONStoreQueryPart()
    {
        queryItems = new LinkedList();
    }

    public JSONStoreQueryPart(JSONObject jsonobject)
        throws JSONStoreFindException
    {
        queryItems = new LinkedList();
        QueryPartOperation aquerypartoperation[] = QueryPartOperation.values();
        for (int i = 0; i < aquerypartoperation.length; i++)
        {
            parse(jsonobject, aquerypartoperation[i], queryItems);
        }

    }

    private boolean isObjectPrimitive(Object obj)
    {
        return !(obj instanceof JSONArray) && !(obj instanceof JSONObject);
    }

    private void parse(JSONObject jsonobject, QueryPartOperation querypartoperation, List list)
        throws JSONStoreFindException
    {
        if (jsonobject != null && querypartoperation != null && list != null)
        {
            Iterator iterator = jsonobject.keys();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                if (querypartoperation.queryStringMatches(s))
                {
                    JSONArray jsonarray;
                    int i;
                    try
                    {
                        jsonarray = jsonobject.getJSONArray(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONObject jsonobject)
                    {
                        throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. ").append(s).append(" query must be a json array.").toString(), jsonobject);
                    }
                    i = 0;
                    while (i < jsonarray.length()) 
                    {
                        JSONObject jsonobject1;
                        try
                        {
                            jsonobject1 = jsonarray.getJSONObject(i);
                        }
                        // Misplaced declaration of an exception variable
                        catch (JSONObject jsonobject)
                        {
                            throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. ").append(s).append(" query must contain a JSON object at index ").append(i).toString(), jsonobject);
                        }
                        parseTuple(jsonobject1, querypartoperation, list);
                        i++;
                    }
                }
            }
        }
    }

    private JSONStoreQueryPartItem parseItem(String s, boolean flag, QueryPartOperation querypartoperation, Object obj)
        throws JSONStoreFindException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$jsonstore$database$QueryPartOperation$QueryPartOperationRestriction[];

            static 
            {
                $SwitchMap$com$worklight$jsonstore$database$QueryPartOperation$QueryPartOperationRestriction = new int[com.worklight.jsonstore.database.QueryPartOperation.QueryPartOperationRestriction.values().length];
                try
                {
                    $SwitchMap$com$worklight$jsonstore$database$QueryPartOperation$QueryPartOperationRestriction[com.worklight.jsonstore.database.QueryPartOperation.QueryPartOperationRestriction.ARRAY_ONLY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$jsonstore$database$QueryPartOperation$QueryPartOperationRestriction[com.worklight.jsonstore.database.QueryPartOperation.QueryPartOperationRestriction.RANGE_ONLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$jsonstore$database$QueryPartOperation$QueryPartOperationRestriction[com.worklight.jsonstore.database.QueryPartOperation.QueryPartOperationRestriction.PRIMITIVE_ONLY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj1;
        int i;
        try
        {
            i = _cls1..SwitchMap.com.worklight.jsonstore.database.QueryPartOperation.QueryPartOperationRestriction[querypartoperation.getRestriction().ordinal()];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            JSONStoreLogger.getLogger("QueryContentPart").logTrace((new StringBuilder()).append("Invalid syntax: ").append(s.getMessage()).toString());
            return null;
        }
        i;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 57
    //                   2 264
    //                   3 488;
           goto _L1 _L2 _L3 _L4
_L1:
        obj1 = obj;
_L6:
        return new JSONStoreQueryPartItem(s, false, querypartoperation, obj1);
_L2:
        if (!(obj instanceof JSONArray))
        {
            throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" must be an array").toString(), null);
        }
        obj = (JSONArray)obj;
        obj1 = new ArrayList(((JSONArray) (obj)).length());
        i = 0;
_L8:
        int j = ((JSONArray) (obj)).length();
        if (i >= j) goto _L6; else goto _L5
_L5:
        Object obj2;
        obj2 = ((JSONArray) (obj)).get(i);
        if (!isObjectPrimitive(obj2))
        {
            throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" at index ").append(i).append("cannot be an JSONArray or JSONObject").toString(), null);
        }
          goto _L7
        s;
        throw new JSONStoreFindException("Cannot parse query content part. An internal error occured", s);
_L7:
        ((List) (obj1)).add(obj2);
        i++;
          goto _L8
_L3:
        if (!(obj instanceof JSONArray))
        {
            throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" must be an array").toString(), null);
        }
        obj1 = (JSONArray)obj;
        if (((JSONArray) (obj1)).length() != 2)
        {
            throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" must be an array of size 2").toString(), null);
        }
        obj = ((JSONArray) (obj1)).get(0);
        obj2 = ((JSONArray) (obj1)).get(1);
        if (!isObjectPrimitive(obj) || !isObjectPrimitive(obj2))
        {
            throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" must be an array of size 2 primitives").toString(), null);
        }
          goto _L9
        querypartoperation;
        throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" caused an internal error ").toString(), querypartoperation);
_L9:
        obj1 = new ArrayList(2);
        ((List) (obj1)).add(obj);
        ((List) (obj1)).add(obj2);
          goto _L6
_L4:
        obj1 = obj;
        if (isObjectPrimitive(obj)) goto _L6; else goto _L10
_L10:
        throw new JSONStoreFindException((new StringBuilder()).append("Cannot parse query content part. Tuple with key ").append(s).append(" cannot be an array or object").toString(), null);
    }

    private void parseTuple(JSONObject jsonobject, QueryPartOperation querypartoperation, List list)
        throws JSONStoreFindException
    {
        if (jsonobject.length() == 0)
        {
            throw new JSONStoreFindException("Cannot parse query content part. An internal error occurred parsing part tuple", null);
        }
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            Object obj1;
            try
            {
                obj1 = jsonobject.get(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new JSONStoreFindException("Cannot parse query content query part. An internal error occurred parsing part tuple", jsonobject);
            }
            obj = parseItem(((String) (obj)), false, querypartoperation, obj1);
            if (obj != null)
            {
                list.add(obj);
            }
        } while (true);
    }

    public void addBetween(String s, Number number, Number number1)
    {
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        }
        if (number1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            ArrayList arraylist = new ArrayList(2);
            arraylist.add(number);
            arraylist.add(number1);
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.BETWEEN, arraylist));
            return;
        }
    }

    public void addEqual(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.EXACT_EQUALS, boolean1));
            return;
        }
    }

    public void addEqual(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.EXACT_EQUALS, number));
            return;
        }
    }

    public void addEqual(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.EXACT_EQUALS, s1));
            return;
        }
    }

    public void addGreaterThan(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.GREATER_THAN, number));
            return;
        }
    }

    public void addGreaterThanOrEqual(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.GREATER_THAN_OR_EQUALS, number));
            return;
        }
    }

    public void addInside(String s, List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        }
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            if (obj != null && ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)))
            {
                arraylist.add(obj);
            }
        } while (true);
        queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.IN, arraylist));
    }

    public void addLeftLike(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_LEFT_EQUALS, boolean1));
            return;
        }
    }

    public void addLeftLike(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_LEFT_EQUALS, number));
            return;
        }
    }

    public void addLeftLike(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_LEFT_EQUALS, s1));
            return;
        }
    }

    public void addLessThan(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.LESS_THAN, number));
            return;
        }
    }

    public void addLessThanOrEqual(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.LESS_THAN_OR_EQUALS, number));
            return;
        }
    }

    public void addLike(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_EQUALS, boolean1));
            return;
        }
    }

    public void addLike(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_EQUALS, number));
            return;
        }
    }

    public void addLike(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_EQUALS, s1));
            return;
        }
    }

    public void addNotBetween(String s, Number number, Number number1)
    {
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        }
        if (number1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            ArrayList arraylist = new ArrayList(2);
            arraylist.add(number);
            arraylist.add(number1);
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.NOT_BETWEEN, arraylist));
            return;
        }
    }

    public void addNotEqual(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.EXACT_NOT_EQUALS, boolean1));
            return;
        }
    }

    public void addNotEqual(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.EXACT_NOT_EQUALS, number));
            return;
        }
    }

    public void addNotEqual(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.EXACT_NOT_EQUALS, s1));
            return;
        }
    }

    public void addNotInside(String s, List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        }
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            if (obj != null && ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)))
            {
                arraylist.add(obj);
            }
        } while (true);
        queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.NOT_IN, arraylist));
    }

    public void addNotLeftLike(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_LEFT_EQUALS, boolean1));
            return;
        }
    }

    public void addNotLeftLike(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_LEFT_EQUALS, number));
            return;
        }
    }

    public void addNotLeftLike(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_LEFT_EQUALS, s1));
            return;
        }
    }

    public void addNotLike(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_EQUALS, boolean1));
            return;
        }
    }

    public void addNotLike(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_EQUALS, number));
            return;
        }
    }

    public void addNotLike(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_EQUALS, s1));
            return;
        }
    }

    public void addNotRightLike(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_RIGHT_EQUALS, boolean1));
            return;
        }
    }

    public void addNotRightLike(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_RIGHT_EQUALS, number));
            return;
        }
    }

    public void addNotRightLike(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_NOT_RIGHT_EQUALS, s1));
            return;
        }
    }

    void addRawItem(String s, boolean flag, QueryPartOperation querypartoperation, Object obj)
    {
        queryItems.add(new JSONStoreQueryPartItem(s, flag, querypartoperation, obj));
    }

    public void addRightLike(String s, Boolean boolean1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_RIGHT_EQUALS, boolean1));
            return;
        }
    }

    public void addRightLike(String s, Number number)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (number == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_RIGHT_EQUALS, number));
            return;
        }
    }

    public void addRightLike(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Search field must be a nonempty string");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Value must not be null");
        } else
        {
            queryItems.add(new JSONStoreQueryPartItem(s, false, QueryPartOperation.FUZZY_RIGHT_EQUALS, s1));
            return;
        }
    }

    public List getQueryBlockItems()
    {
        return queryItems;
    }
}

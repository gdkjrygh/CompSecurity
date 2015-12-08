// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.machinetags;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.machinetags:
//            Namespace, Pair, Predicate, Value, 
//            NamespacesList

public class MachinetagsInterface
{

    private static final String METHOD_GET_NAMESPACES = "flickr.machinetags.getNamespaces";
    private static final String METHOD_GET_PAIRS = "flickr.machinetags.getPairs";
    private static final String METHOD_GET_PREDICATES = "flickr.machinetags.getPredicates";
    private static final String METHOD_GET_RECENTVALUES = "flickr.machinetags.getRecentValues";
    private static final String METHOD_GET_VALUES = "flickr.machinetags.getValues";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public MachinetagsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Namespace parseNamespace(JSONObject jsonobject)
    {
        Namespace namespace = new Namespace();
        namespace.setUsage(jsonobject.getString("usage"));
        namespace.setPredicates(jsonobject.getString("predicates"));
        namespace.setValue(jsonobject.getString("_content"));
        return namespace;
    }

    private Pair parsePair(JSONObject jsonobject)
    {
        Pair pair = new Pair();
        pair.setUsage(jsonobject.getString("usage"));
        pair.setNamespace(jsonobject.getString("namespace"));
        pair.setPredicate(jsonobject.getString("predicate"));
        return pair;
    }

    private Predicate parsePredicate(JSONObject jsonobject)
    {
        Predicate predicate = new Predicate();
        predicate.setUsage(jsonobject.getString("usage"));
        predicate.setNamespaces(jsonobject.getString("namespaces"));
        predicate.setValue(jsonobject.getString("_content"));
        return predicate;
    }

    private Value parseValue(JSONObject jsonobject)
    {
        Value value = new Value();
        value.setUsage(jsonobject.getString("usage"));
        value.setNamespace(jsonobject.getString("namespace"));
        value.setPredicate(jsonobject.getString("predicate"));
        value.setFirstAdded(jsonobject.getString("first_added"));
        value.setLastAdded(jsonobject.getString("last_added"));
        value.setValue(jsonobject.getString("_content"));
        return value;
    }

    public NamespacesList getNamespaces(String s, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        NamespacesList namespaceslist = new NamespacesList();
        arraylist.add(new Parameter("method", "flickr.machinetags.getNamespaces"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("predicate", s));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("namespaces").getJSONArray("namespace");
        namespaceslist.setPage(1);
        namespaceslist.setPages(1);
        namespaceslist.setPerPage(s.length());
        namespaceslist.setTotal(s.length());
        i = 0;
        do
        {
            if (i >= s.length())
            {
                return namespaceslist;
            }
            namespaceslist.add(parseNamespace(s.getJSONObject(i)));
            i++;
        } while (true);
    }

    public NamespacesList getPairs(String s, String s1, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        NamespacesList namespaceslist = new NamespacesList();
        arraylist.add(new Parameter("method", "flickr.machinetags.getPairs"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("namespace", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("predicate", s1));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("pairs");
        s1 = s.getJSONArray("pair");
        namespaceslist.setPage(s.getInt("page"));
        namespaceslist.setPages(s.getInt("pages"));
        namespaceslist.setPerPage(s.getInt("perPage"));
        namespaceslist.setTotal(s1.length());
        i = 0;
        do
        {
            if (i >= s1.length())
            {
                return namespaceslist;
            }
            namespaceslist.add(parsePair(s1.getJSONObject(i)));
            i++;
        } while (true);
    }

    public NamespacesList getPredicates(String s, int i, int j)
    {
        Object obj = new ArrayList();
        NamespacesList namespaceslist = new NamespacesList();
        ((List) (obj)).add(new Parameter("method", "flickr.machinetags.getPredicates"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            ((List) (obj)).add(new Parameter("namespace", s));
        }
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", String.valueOf(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("predicates");
        obj = s.getJSONArray("predicate");
        namespaceslist.setPage(s.getInt("page"));
        namespaceslist.setPages(s.getInt("pages"));
        namespaceslist.setPerPage(s.getInt("perPage"));
        namespaceslist.setTotal(((JSONArray) (obj)).length());
        i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                return namespaceslist;
            }
            namespaceslist.add(parsePredicate(((JSONArray) (obj)).getJSONObject(i)));
            i++;
        } while (true);
    }

    public NamespacesList getRecentValues(String s, String s1, Date date)
    {
        ArrayList arraylist = new ArrayList();
        NamespacesList namespaceslist = new NamespacesList();
        arraylist.add(new Parameter("method", "flickr.machinetags.getRecentValues"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("namespace", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("predicate", s1));
        }
        if (date != null)
        {
            arraylist.add(new Parameter("added_since", new Long(date.getTime() / 1000L)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("values");
        s1 = s.getJSONArray("value");
        namespaceslist.setPage(s.getInt("page"));
        namespaceslist.setPages(s.getInt("pages"));
        namespaceslist.setPerPage(s.getInt("perPage"));
        namespaceslist.setTotal(s1.length());
        int i = 0;
        do
        {
            if (i >= s1.length())
            {
                return namespaceslist;
            }
            namespaceslist.add(parseValue(s1.getJSONObject(i)));
            i++;
        } while (true);
    }

    public NamespacesList getValues(String s, String s1, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        NamespacesList namespaceslist = new NamespacesList();
        arraylist.add(new Parameter("method", "flickr.machinetags.getValues"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("namespace", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("predicate", s1));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("values");
        s1 = s.getJSONArray("value");
        namespaceslist.setPage(s.getInt("page"));
        namespaceslist.setPages(s.getInt("pages"));
        namespaceslist.setPerPage(s.getInt("perPage"));
        namespaceslist.setTotal(s1.length());
        i = 0;
        do
        {
            if (i >= s1.length())
            {
                return namespaceslist;
            }
            namespaceslist.add(parseValue(s1.getJSONObject(i)));
            i++;
        } while (true);
    }
}

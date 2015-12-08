// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.creativerepackaging;

import android.util.Log;
import com.auditude.ads.loader.DataLoader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.auditude.creativerepackaging:
//            Rule

public class UrlNormalizingRules
    implements com.auditude.ads.loader.DataLoader.DataLoaderListener
{
    public static interface UrlNormalizingRulesListener
    {

        public abstract void onRulesLoaded(Boolean boolean1);
    }


    private static final int DEFAULT_TIMEOUT = 5;
    public static final String NORMALIZE_RULES_URL = "http://cdn2.auditude.com/crs/rules.xml";
    private static UrlNormalizingRules instance;
    private Boolean _loaded;
    private Boolean _loading;
    private DataLoader dataLoader;
    private CopyOnWriteArrayList listeners;
    private XmlPullParser parser;
    private ArrayList rules;

    public UrlNormalizingRules()
    {
        _loaded = Boolean.valueOf(false);
        _loading = Boolean.valueOf(false);
        listeners = new CopyOnWriteArrayList();
    }

    private void dispatchLoaded(Boolean boolean1)
    {
        Iterator iterator = listeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((UrlNormalizingRulesListener)iterator.next()).onRulesLoaded(boolean1);
        } while (true);
    }

    public static UrlNormalizingRules getInstance()
    {
        if (instance == null)
        {
            instance = new UrlNormalizingRules();
        }
        return instance;
    }

    private ArrayList parseCraterias()
        throws XmlPullParserException, IOException
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        i = 2;
_L2:
        String s;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("Domain".equalsIgnoreCase(s))
        {
            arraylist.add(parser.nextText().replaceAll("\t", ""));
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"Criteria".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
        return arraylist;
    }

    private Rule parseRule()
        throws XmlPullParserException, IOException
    {
        String s;
        String s1;
        ArrayList arraylist;
        int i;
        s1 = null;
        s = null;
        arraylist = null;
        i = 2;
_L2:
        ArrayList arraylist1;
        String s2;
        String s3;
        String s4;
        s4 = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("Find".equalsIgnoreCase(s4))
        {
            s2 = parser.nextText().replaceAll("\t", "");
            s3 = s;
            arraylist1 = arraylist;
        } else
        if ("Replace".equalsIgnoreCase(s4))
        {
            s3 = parser.nextText().replaceAll("\t", "");
            arraylist1 = arraylist;
            s2 = s1;
        } else
        {
            arraylist1 = arraylist;
            s2 = s1;
            s3 = s;
            if ("Criteria".equalsIgnoreCase(s4))
            {
                arraylist1 = parseCraterias();
                s2 = s1;
                s3 = s;
            }
        }
_L3:
        i = parser.next();
        arraylist = arraylist1;
        s1 = s2;
        s = s3;
        if (true) goto _L2; else goto _L1
_L1:
        arraylist1 = arraylist;
        s2 = s1;
        s3 = s;
        if (i == 3)
        {
            arraylist1 = arraylist;
            s2 = s1;
            s3 = s;
            if ("Rule".equalsIgnoreCase(s4))
            {
                return new Rule(s1, s, arraylist);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void addEventListener(UrlNormalizingRulesListener urlnormalizingruleslistener)
    {
        listeners.add(urlnormalizingruleslistener);
    }

    public Boolean getIsRulesLoaded()
    {
        return _loaded;
    }

    public void loadRules()
    {
        if (rules == null && !_loaded.booleanValue() && !_loading.booleanValue())
        {
            _loading = Boolean.valueOf(true);
            dataLoader = new DataLoader();
            dataLoader.setDataLoaderListener(this);
            dataLoader.load("http://cdn2.auditude.com/crs/rules.xml", null, 5);
        } else
        if (!_loading.booleanValue())
        {
            dispatchLoaded(Boolean.valueOf(true));
            return;
        }
    }

    public String normalize(String s)
    {
        URI uri;
        Iterator iterator;
        String s1;
        try
        {
            uri = new URI(s);
        }
        catch (Exception exception)
        {
            return s;
        }
        s1 = s;
        if (rules == null) goto _L2; else goto _L1
_L1:
        s1 = s;
        if (rules.size() <= 0) goto _L2; else goto _L3
_L3:
        iterator = rules.iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        s1 = s;
_L2:
        return s1;
_L5:
        Rule rule = (Rule)iterator.next();
        if (rule.replace == null || rule.find == null) goto _L7; else goto _L6
_L6:
        Boolean boolean1;
        Iterator iterator1;
        boolean1 = Boolean.valueOf(false);
        if (rule.domains == null || rule.domains.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        iterator1 = rule.domains.iterator();
_L10:
        if (iterator1.hasNext()) goto _L9; else goto _L8
_L8:
        if (boolean1.booleanValue())
        {
            s = s.replaceAll(rule.find, rule.replace);
        }
          goto _L7
_L9:
        String s2 = (String)iterator1.next();
        if (uri.getHost().endsWith(s2))
        {
            boolean1 = Boolean.valueOf(true);
        }
          goto _L10
        boolean1 = Boolean.valueOf(true);
          goto _L8
    }

    public void onRequestComplete(String s)
    {
        dataLoader = null;
        rules = new ArrayList();
        int i;
        parser = XmlPullParserFactory.newInstance().newPullParser();
        parser.setInput(new StringReader(s));
        i = parser.getEventType();
_L5:
        if (i != 1) goto _L2; else goto _L1
_L1:
        _loaded = Boolean.valueOf(true);
        _loading = Boolean.valueOf(false);
        dispatchLoaded(Boolean.valueOf(true));
        return;
_L2:
        i;
        JVM INSTR tableswitch 2 2: default 104
    //                   2 117;
           goto _L3 _L4
_L3:
        i = parser.next();
          goto _L5
_L4:
        if (!"Rule".equalsIgnoreCase(parser.getName())) goto _L3; else goto _L6
_L6:
        rules.add(parseRule());
          goto _L3
        s;
        Log.v("UrlNormalizingRules", (new StringBuilder("Error Parsing : ")).append(s.getMessage()).toString());
          goto _L1
    }

    public void onRequestFailed(Throwable throwable)
    {
        _loaded = Boolean.valueOf(true);
        _loading = Boolean.valueOf(false);
        dispatchLoaded(Boolean.valueOf(false));
    }

    public void removeEventListener(UrlNormalizingRulesListener urlnormalizingruleslistener)
    {
        if (listeners.contains(urlnormalizingruleslistener))
        {
            listeners.remove(urlnormalizingruleslistener);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.Base64;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Throwables;
import com.google.api.client.util.Types;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.http:
//            LowLevelHttpRequest, LowLevelHttpResponse

public class HttpHeaders extends GenericData
{
    private static class HeaderParsingFakeLevelHttpRequest extends LowLevelHttpRequest
    {

        private final ParseHeaderState state;
        private final HttpHeaders target;

        public void addHeader(String s, String s1)
        {
            target.parseHeader(s, s1, state);
        }

        public LowLevelHttpResponse execute()
            throws IOException
        {
            throw new UnsupportedOperationException();
        }

        HeaderParsingFakeLevelHttpRequest(HttpHeaders httpheaders, ParseHeaderState parseheaderstate)
        {
            target = httpheaders;
            state = parseheaderstate;
        }
    }

    private static final class ParseHeaderState
    {

        final ArrayValueMap arrayValueMap;
        final ClassInfo classInfo;
        final List context;
        final StringBuilder logger;

        void finish()
        {
            arrayValueMap.setValues();
        }

        public ParseHeaderState(HttpHeaders httpheaders, StringBuilder stringbuilder)
        {
            Class class1 = httpheaders.getClass();
            context = Arrays.asList(new Type[] {
                class1
            });
            classInfo = ClassInfo.of(class1, true);
            logger = stringbuilder;
            arrayValueMap = new ArrayValueMap(httpheaders);
        }
    }


    private List accept;
    private List acceptEncoding;
    private List age;
    private List authenticate;
    private List authorization;
    private List cacheControl;
    private List contentEncoding;
    private List contentLength;
    private List contentMD5;
    private List contentRange;
    private List contentType;
    private List cookie;
    private List date;
    private List etag;
    private List expires;
    private List ifMatch;
    private List ifModifiedSince;
    private List ifNoneMatch;
    private List ifRange;
    private List ifUnmodifiedSince;
    private List lastModified;
    private List location;
    private List mimeVersion;
    private List range;
    private List retryAfter;
    private List userAgent;

    public HttpHeaders()
    {
        super(EnumSet.of(com.google.api.client.util.GenericData.Flags.IGNORE_CASE));
        acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    private static void addHeader(Logger logger, StringBuilder stringbuilder, StringBuilder stringbuilder1, LowLevelHttpRequest lowlevelhttprequest, String s, Object obj, Writer writer)
        throws IOException
    {
        if (obj != null && !Data.isNull(obj)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        String s1;
label0:
        {
            s1 = toStringValue(obj);
            obj = s1;
            if (!"Authorization".equalsIgnoreCase(s))
            {
                obj1 = obj;
                if (!"Cookie".equalsIgnoreCase(s))
                {
                    break label0;
                }
            }
            if (logger != null)
            {
                obj1 = obj;
                if (logger.isLoggable(Level.ALL))
                {
                    break label0;
                }
            }
            obj1 = "<Not Logged>";
        }
        if (stringbuilder != null)
        {
            stringbuilder.append(s).append(": ");
            stringbuilder.append(((String) (obj1)));
            stringbuilder.append(StringUtils.LINE_SEPARATOR);
        }
        if (stringbuilder1 != null)
        {
            stringbuilder1.append(" -H '").append(s).append(": ").append(((String) (obj1))).append("'");
        }
        if (lowlevelhttprequest != null)
        {
            lowlevelhttprequest.addHeader(s, s1);
        }
        if (writer != null)
        {
            writer.write(s);
            writer.write(": ");
            writer.write(s1);
            writer.write("\r\n");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private List getAsList(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(obj);
            return arraylist;
        }
    }

    private Object getFirstHeaderValue(List list)
    {
        if (list == null)
        {
            return null;
        } else
        {
            return list.get(0);
        }
    }

    private static Object parseValue(Type type, List list, String s)
    {
        return Data.parsePrimitiveValue(Data.resolveWildcardTypeOrTypeVariable(list, type), s);
    }

    static void serializeHeaders(HttpHeaders httpheaders, StringBuilder stringbuilder, StringBuilder stringbuilder1, Logger logger, LowLevelHttpRequest lowlevelhttprequest)
        throws IOException
    {
        serializeHeaders(httpheaders, stringbuilder, stringbuilder1, logger, lowlevelhttprequest, null);
    }

    static void serializeHeaders(HttpHeaders httpheaders, StringBuilder stringbuilder, StringBuilder stringbuilder1, Logger logger, LowLevelHttpRequest lowlevelhttprequest, Writer writer)
        throws IOException
    {
        HashSet hashset = new HashSet();
        Iterator iterator1 = httpheaders.entrySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            Object obj = (String)entry.getKey();
            Preconditions.checkArgument(hashset.add(obj), "multiple headers of the same name (headers are case insensitive): %s", new Object[] {
                obj
            });
            Object obj1 = entry.getValue();
            if (obj1 != null)
            {
                String s = ((String) (obj));
                obj = httpheaders.getClassInfo().getFieldInfo(((String) (obj)));
                if (obj != null)
                {
                    s = ((FieldInfo) (obj)).getName();
                }
                obj = obj1.getClass();
                if ((obj1 instanceof Iterable) || ((Class) (obj)).isArray())
                {
                    Iterator iterator = Types.iterableOf(obj1).iterator();
                    while (iterator.hasNext()) 
                    {
                        addHeader(logger, stringbuilder, stringbuilder1, lowlevelhttprequest, s, iterator.next(), writer);
                    }
                } else
                {
                    addHeader(logger, stringbuilder, stringbuilder1, lowlevelhttprequest, s, obj1, writer);
                }
            }
        } while (true);
        if (writer != null)
        {
            writer.flush();
        }
    }

    public static void serializeHeadersForMultipartRequests(HttpHeaders httpheaders, StringBuilder stringbuilder, Logger logger, Writer writer)
        throws IOException
    {
        serializeHeaders(httpheaders, stringbuilder, null, logger, null, writer);
    }

    private static String toStringValue(Object obj)
    {
        if (obj instanceof Enum)
        {
            return FieldInfo.of((Enum)obj).getName();
        } else
        {
            return obj.toString();
        }
    }

    public HttpHeaders clone()
    {
        return (HttpHeaders)super.clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final void fromHttpHeaders(HttpHeaders httpheaders)
    {
        try
        {
            ParseHeaderState parseheaderstate = new ParseHeaderState(this, null);
            serializeHeaders(httpheaders, null, null, null, new HeaderParsingFakeLevelHttpRequest(this, parseheaderstate));
            parseheaderstate.finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpHeaders httpheaders)
        {
            throw Throwables.propagate(httpheaders);
        }
    }

    public final void fromHttpResponse(LowLevelHttpResponse lowlevelhttpresponse, StringBuilder stringbuilder)
        throws IOException
    {
        clear();
        stringbuilder = new ParseHeaderState(this, stringbuilder);
        int j = lowlevelhttpresponse.getHeaderCount();
        for (int i = 0; i < j; i++)
        {
            parseHeader(lowlevelhttpresponse.getHeaderName(i), lowlevelhttpresponse.getHeaderValue(i), stringbuilder);
        }

        stringbuilder.finish();
    }

    public final String getAccept()
    {
        return (String)getFirstHeaderValue(accept);
    }

    public final String getAcceptEncoding()
    {
        return (String)getFirstHeaderValue(acceptEncoding);
    }

    public final Long getAge()
    {
        return (Long)getFirstHeaderValue(age);
    }

    public final String getAuthenticate()
    {
        return (String)getFirstHeaderValue(authenticate);
    }

    public final List getAuthenticateAsList()
    {
        return authenticate;
    }

    public final String getAuthorization()
    {
        return (String)getFirstHeaderValue(authorization);
    }

    public final List getAuthorizationAsList()
    {
        return authorization;
    }

    public final String getCacheControl()
    {
        return (String)getFirstHeaderValue(cacheControl);
    }

    public final String getContentEncoding()
    {
        return (String)getFirstHeaderValue(contentEncoding);
    }

    public final Long getContentLength()
    {
        return (Long)getFirstHeaderValue(contentLength);
    }

    public final String getContentMD5()
    {
        return (String)getFirstHeaderValue(contentMD5);
    }

    public final String getContentRange()
    {
        return (String)getFirstHeaderValue(contentRange);
    }

    public final String getContentType()
    {
        return (String)getFirstHeaderValue(contentType);
    }

    public final String getCookie()
    {
        return (String)getFirstHeaderValue(cookie);
    }

    public final String getDate()
    {
        return (String)getFirstHeaderValue(date);
    }

    public final String getETag()
    {
        return (String)getFirstHeaderValue(etag);
    }

    public final String getExpires()
    {
        return (String)getFirstHeaderValue(expires);
    }

    public String getFirstHeaderStringValue(String s)
    {
        s = ((String) (get(s.toLowerCase())));
        if (s == null)
        {
            return null;
        }
        Class class1 = s.getClass();
        if ((s instanceof Iterable) || class1.isArray())
        {
            Iterator iterator = Types.iterableOf(s).iterator();
            if (iterator.hasNext())
            {
                return toStringValue(iterator.next());
            }
        }
        return toStringValue(s);
    }

    public List getHeaderStringValues(String s)
    {
        s = ((String) (get(s.toLowerCase())));
        if (s == null)
        {
            return Collections.emptyList();
        }
        Class class1 = s.getClass();
        if ((s instanceof Iterable) || class1.isArray())
        {
            ArrayList arraylist = new ArrayList();
            for (s = Types.iterableOf(s).iterator(); s.hasNext(); arraylist.add(toStringValue(s.next()))) { }
            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.singletonList(toStringValue(s));
        }
    }

    public final String getIfMatch()
    {
        return (String)getFirstHeaderValue(ifMatch);
    }

    public final String getIfModifiedSince()
    {
        return (String)getFirstHeaderValue(ifModifiedSince);
    }

    public final String getIfNoneMatch()
    {
        return (String)getFirstHeaderValue(ifNoneMatch);
    }

    public final String getIfRange()
    {
        return (String)getFirstHeaderValue(ifRange);
    }

    public final String getIfUnmodifiedSince()
    {
        return (String)getFirstHeaderValue(ifUnmodifiedSince);
    }

    public final String getLastModified()
    {
        return (String)getFirstHeaderValue(lastModified);
    }

    public final String getLocation()
    {
        return (String)getFirstHeaderValue(location);
    }

    public final String getMimeVersion()
    {
        return (String)getFirstHeaderValue(mimeVersion);
    }

    public final String getRange()
    {
        return (String)getFirstHeaderValue(range);
    }

    public final String getRetryAfter()
    {
        return (String)getFirstHeaderValue(retryAfter);
    }

    public final String getUserAgent()
    {
        return (String)getFirstHeaderValue(userAgent);
    }

    void parseHeader(String s, String s1, ParseHeaderState parseheaderstate)
    {
        Object obj = parseheaderstate.context;
        Object obj1 = parseheaderstate.classInfo;
        ArrayValueMap arrayvaluemap = parseheaderstate.arrayValueMap;
        parseheaderstate = parseheaderstate.logger;
        if (parseheaderstate != null)
        {
            parseheaderstate.append((new StringBuilder()).append(s).append(": ").append(s1).toString()).append(StringUtils.LINE_SEPARATOR);
        }
        obj1 = ((ClassInfo) (obj1)).getFieldInfo(s);
        if (obj1 != null)
        {
            Type type = Data.resolveWildcardTypeOrTypeVariable(((List) (obj)), ((FieldInfo) (obj1)).getGenericType());
            if (Types.isArray(type))
            {
                s = Types.getRawArrayComponentType(((List) (obj)), Types.getArrayComponentType(type));
                arrayvaluemap.put(((FieldInfo) (obj1)).getField(), s, parseValue(s, ((List) (obj)), s1));
                return;
            }
            if (Types.isAssignableToOrFrom(Types.getRawArrayComponentType(((List) (obj)), type), java/lang/Iterable))
            {
                parseheaderstate = (Collection)((FieldInfo) (obj1)).getValue(this);
                s = parseheaderstate;
                if (parseheaderstate == null)
                {
                    s = Data.newCollectionInstance(type);
                    ((FieldInfo) (obj1)).setValue(this, s);
                }
                if (type == java/lang/Object)
                {
                    parseheaderstate = null;
                } else
                {
                    parseheaderstate = Types.getIterableParameter(type);
                }
                s.add(parseValue(parseheaderstate, ((List) (obj)), s1));
                return;
            } else
            {
                ((FieldInfo) (obj1)).setValue(this, parseValue(type, ((List) (obj)), s1));
                return;
            }
        }
        obj = (ArrayList)get(s);
        parseheaderstate = ((ParseHeaderState) (obj));
        if (obj == null)
        {
            parseheaderstate = new ArrayList();
            set(s, parseheaderstate);
        }
        parseheaderstate.add(s1);
    }

    public HttpHeaders set(String s, Object obj)
    {
        return (HttpHeaders)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public HttpHeaders setAccept(String s)
    {
        accept = getAsList(s);
        return this;
    }

    public HttpHeaders setAcceptEncoding(String s)
    {
        acceptEncoding = getAsList(s);
        return this;
    }

    public HttpHeaders setAge(Long long1)
    {
        age = getAsList(long1);
        return this;
    }

    public HttpHeaders setAuthenticate(String s)
    {
        authenticate = getAsList(s);
        return this;
    }

    public HttpHeaders setAuthorization(String s)
    {
        return setAuthorization(getAsList(s));
    }

    public HttpHeaders setAuthorization(List list)
    {
        authorization = list;
        return this;
    }

    public HttpHeaders setBasicAuthentication(String s, String s1)
    {
        s = Base64.encodeBase64String(StringUtils.getBytesUtf8((new StringBuilder()).append((String)Preconditions.checkNotNull(s)).append(":").append((String)Preconditions.checkNotNull(s1)).toString()));
        return setAuthorization((new StringBuilder()).append("Basic ").append(s).toString());
    }

    public HttpHeaders setCacheControl(String s)
    {
        cacheControl = getAsList(s);
        return this;
    }

    public HttpHeaders setContentEncoding(String s)
    {
        contentEncoding = getAsList(s);
        return this;
    }

    public HttpHeaders setContentLength(Long long1)
    {
        contentLength = getAsList(long1);
        return this;
    }

    public HttpHeaders setContentMD5(String s)
    {
        contentMD5 = getAsList(s);
        return this;
    }

    public HttpHeaders setContentRange(String s)
    {
        contentRange = getAsList(s);
        return this;
    }

    public HttpHeaders setContentType(String s)
    {
        contentType = getAsList(s);
        return this;
    }

    public HttpHeaders setCookie(String s)
    {
        cookie = getAsList(s);
        return this;
    }

    public HttpHeaders setDate(String s)
    {
        date = getAsList(s);
        return this;
    }

    public HttpHeaders setETag(String s)
    {
        etag = getAsList(s);
        return this;
    }

    public HttpHeaders setExpires(String s)
    {
        expires = getAsList(s);
        return this;
    }

    public HttpHeaders setIfMatch(String s)
    {
        ifMatch = getAsList(s);
        return this;
    }

    public HttpHeaders setIfModifiedSince(String s)
    {
        ifModifiedSince = getAsList(s);
        return this;
    }

    public HttpHeaders setIfNoneMatch(String s)
    {
        ifNoneMatch = getAsList(s);
        return this;
    }

    public HttpHeaders setIfRange(String s)
    {
        ifRange = getAsList(s);
        return this;
    }

    public HttpHeaders setIfUnmodifiedSince(String s)
    {
        ifUnmodifiedSince = getAsList(s);
        return this;
    }

    public HttpHeaders setLastModified(String s)
    {
        lastModified = getAsList(s);
        return this;
    }

    public HttpHeaders setLocation(String s)
    {
        location = getAsList(s);
        return this;
    }

    public HttpHeaders setMimeVersion(String s)
    {
        mimeVersion = getAsList(s);
        return this;
    }

    public HttpHeaders setRange(String s)
    {
        range = getAsList(s);
        return this;
    }

    public HttpHeaders setRetryAfter(String s)
    {
        retryAfter = getAsList(s);
        return this;
    }

    public HttpHeaders setUserAgent(String s)
    {
        userAgent = getAsList(s);
        return this;
    }
}

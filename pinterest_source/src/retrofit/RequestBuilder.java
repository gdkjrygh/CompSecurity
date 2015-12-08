// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.http.Body;
import retrofit.http.EncodedPath;
import retrofit.http.EncodedQuery;
import retrofit.http.EncodedQueryMap;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.Part;
import retrofit.http.PartMap;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import retrofit.mime.FormUrlEncodedTypedOutput;
import retrofit.mime.MultipartTypedOutput;
import retrofit.mime.TypedOutput;
import retrofit.mime.TypedString;

// Referenced classes of package retrofit:
//            RestMethodInfo

final class RequestBuilder
    implements RequestInterceptor.RequestFacade
{

    private final String apiUrl;
    private TypedOutput body;
    private String contentTypeHeader;
    private final Converter converter;
    private final FormUrlEncodedTypedOutput formBody;
    private List headers;
    private final boolean isObservable;
    private final boolean isSynchronous;
    private final MultipartTypedOutput multipartBody = null;
    private final Annotation paramAnnotations[];
    private StringBuilder queryParams;
    private String relativeUrl;
    private final String requestMethod;

    RequestBuilder(String s, RestMethodInfo restmethodinfo, Converter converter1)
    {
        apiUrl = s;
        converter = converter1;
        paramAnnotations = restmethodinfo.requestParamAnnotations;
        requestMethod = restmethodinfo.requestMethod;
        isSynchronous = restmethodinfo.isSynchronous;
        isObservable = restmethodinfo.isObservable;
        if (restmethodinfo.headers != null)
        {
            headers = new ArrayList(restmethodinfo.headers);
        }
        contentTypeHeader = restmethodinfo.contentTypeHeader;
        relativeUrl = restmethodinfo.requestUrl;
        s = restmethodinfo.requestQuery;
        if (s != null)
        {
            queryParams = (new StringBuilder("?")).append(s);
        }
        switch (_cls1..SwitchMap.retrofit.RestMethodInfo.RequestType[restmethodinfo.requestType.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown request type: ")).append(restmethodinfo.requestType).toString());

        case 1: // '\001'
            formBody = new FormUrlEncodedTypedOutput();
            multipartBody = null;
            body = formBody;
            return;

        case 2: // '\002'
            formBody = null;
            multipartBody = new MultipartTypedOutput();
            body = multipartBody;
            return;

        case 3: // '\003'
            formBody = null;
            break;
        }
    }

    private void addPathParam(String s, String s1, boolean flag)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Path replacement \"")).append(s).append("\" value must not be null.").toString());
        }
        if (flag)
        {
            try
            {
                String s2 = URLEncoder.encode(String.valueOf(s1), "UTF-8").replace("+", "%20");
                relativeUrl = relativeUrl.replace((new StringBuilder("{")).append(s).append("}").toString(), s2);
                return;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new RuntimeException((new StringBuilder("Unable to convert path parameter \"")).append(s).append("\" value to UTF-8:").append(s1).toString(), unsupportedencodingexception);
            }
        }
        relativeUrl = relativeUrl.replace((new StringBuilder("{")).append(s).append("}").toString(), String.valueOf(s1));
        return;
    }

    private void addQueryParam(String s, Object obj, boolean flag, boolean flag1)
    {
        if (obj instanceof Iterable)
        {
            obj = ((Iterable)obj).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = ((Iterator) (obj)).next();
                if (obj1 != null)
                {
                    addQueryParam(s, obj1.toString(), flag, flag1);
                }
            } while (true);
        } else
        if (obj.getClass().isArray())
        {
            int i = 0;
            for (int j = Array.getLength(obj); i < j; i++)
            {
                Object obj2 = Array.get(obj, i);
                if (obj2 != null)
                {
                    addQueryParam(s, obj2.toString(), flag, flag1);
                }
            }

        } else
        {
            addQueryParam(s, obj.toString(), flag, flag1);
        }
    }

    private void addQueryParam(String s, String s1, boolean flag, boolean flag1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Query param \"")).append(s).append("\" value must not be null.").toString());
        }
        String s3 = s;
        String s4 = s1;
        char c;
        String s2;
        StringBuilder stringbuilder;
        try
        {
            stringbuilder = queryParams;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder("Unable to convert query parameter \"")).append(s3).append("\" value to UTF-8: ").append(s4).toString(), s);
        }
        if (stringbuilder != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s3 = s;
        s4 = s1;
        stringbuilder = new StringBuilder();
        s3 = s;
        s4 = s1;
        queryParams = stringbuilder;
        s3 = s;
        s4 = s1;
        if (stringbuilder.length() > 0)
        {
            c = '&';
        } else
        {
            c = '?';
        }
        s3 = s;
        s4 = s1;
        stringbuilder.append(c);
        s2 = s;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        s3 = s;
        s4 = s1;
        s2 = URLEncoder.encode(s, "UTF-8");
        s = s1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s3 = s2;
        s4 = s1;
        s = URLEncoder.encode(s1, "UTF-8");
        s3 = s2;
        s4 = s;
        stringbuilder.append(s2).append('=').append(s);
        return;
    }

    private void addQueryParamMap(int i, Map map, boolean flag, boolean flag1)
    {
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)map.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            if (obj == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Parameter #")).append(i + 1).append(" query map contained null key.").toString());
            }
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            if (obj1 != null)
            {
                addQueryParam(obj.toString(), obj1.toString(), flag, flag1);
            }
        } while (true);
    }

    public final void addEncodedPathParam(String s, String s1)
    {
        addPathParam(s, s1, false);
    }

    public final void addEncodedQueryParam(String s, String s1)
    {
        addQueryParam(s, s1, false, false);
    }

    public final void addHeader(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Header name must not be null.");
        }
        if ("Content-Type".equalsIgnoreCase(s))
        {
            contentTypeHeader = s1;
            return;
        }
        List list = headers;
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList(2);
            headers = ((List) (obj));
        }
        ((List) (obj)).add(new Header(s, s1));
    }

    public final void addPathParam(String s, String s1)
    {
        addPathParam(s, s1, true);
    }

    public final void addQueryParam(String s, String s1)
    {
        addQueryParam(s, s1, false, true);
    }

    final Request build()
    {
        if (multipartBody != null && multipartBody.getPartCount() == 0)
        {
            throw new IllegalStateException("Multipart requests must contain at least one part.");
        }
        Object obj = apiUrl;
        StringBuilder stringbuilder = new StringBuilder(((String) (obj)));
        if (((String) (obj)).endsWith("/"))
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        stringbuilder.append(relativeUrl);
        obj = queryParams;
        if (obj != null)
        {
            stringbuilder.append(((CharSequence) (obj)));
        }
        obj = body;
        List list = headers;
        if (contentTypeHeader != null)
        {
            if (obj != null)
            {
                obj = new MimeOverridingTypedOutput(((TypedOutput) (obj)), contentTypeHeader);
            } else
            {
                Header header = new Header("Content-Type", contentTypeHeader);
                if (list == null)
                {
                    list = Collections.singletonList(header);
                } else
                {
                    list.add(header);
                }
            }
        }
        return new Request(requestMethod, stringbuilder.toString(), list, ((TypedOutput) (obj)));
    }

    final void setArguments(Object aobj[])
    {
        if (aobj != null)
        {
            int i = aobj.length;
            if (!isSynchronous && !isObservable)
            {
                i--;
            }
            int j = 0;
            while (j < i) 
            {
                Object obj = aobj[j];
                Object obj1 = paramAnnotations[j];
                Object obj2 = ((Annotation) (obj1)).annotationType();
                if (obj2 == retrofit/http/Path)
                {
                    obj1 = (Path)obj1;
                    obj2 = ((Path) (obj1)).value();
                    if (obj == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Path parameter \"")).append(((String) (obj2))).append("\" value must not be null.").toString());
                    }
                    addPathParam(((String) (obj2)), obj.toString(), ((Path) (obj1)).encode());
                } else
                if (obj2 == retrofit/http/EncodedPath)
                {
                    obj1 = ((EncodedPath)obj1).value();
                    if (obj == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Path parameter \"")).append(((String) (obj1))).append("\" value must not be null.").toString());
                    }
                    addPathParam(((String) (obj1)), obj.toString(), false);
                } else
                if (obj2 == retrofit/http/Query)
                {
                    if (obj != null)
                    {
                        obj1 = (Query)obj1;
                        addQueryParam(((Query) (obj1)).value(), obj, ((Query) (obj1)).encodeName(), ((Query) (obj1)).encodeValue());
                    }
                } else
                if (obj2 == retrofit/http/EncodedQuery)
                {
                    if (obj != null)
                    {
                        addQueryParam(((EncodedQuery)obj1).value(), obj, false, false);
                    }
                } else
                if (obj2 == retrofit/http/QueryMap)
                {
                    if (obj != null)
                    {
                        obj1 = (QueryMap)obj1;
                        addQueryParamMap(j, (Map)obj, ((QueryMap) (obj1)).encodeNames(), ((QueryMap) (obj1)).encodeValues());
                    }
                } else
                if (obj2 == retrofit/http/EncodedQueryMap)
                {
                    if (obj != null)
                    {
                        addQueryParamMap(j, (Map)obj, false, false);
                    }
                } else
                if (obj2 == retrofit/http/Header)
                {
                    if (obj != null)
                    {
                        obj1 = ((retrofit.http.Header)obj1).value();
                        if (obj instanceof Iterable)
                        {
                            obj = ((Iterable)obj).iterator();
                            while (((Iterator) (obj)).hasNext()) 
                            {
                                obj2 = ((Iterator) (obj)).next();
                                if (obj2 != null)
                                {
                                    addHeader(((String) (obj1)), obj2.toString());
                                }
                            }
                        } else
                        if (obj.getClass().isArray())
                        {
                            int i1 = Array.getLength(obj);
                            int k = 0;
                            while (k < i1) 
                            {
                                obj2 = Array.get(obj, k);
                                if (obj2 != null)
                                {
                                    addHeader(((String) (obj1)), obj2.toString());
                                }
                                k++;
                            }
                        } else
                        {
                            addHeader(((String) (obj1)), obj.toString());
                        }
                    }
                } else
                if (obj2 == retrofit/http/Field)
                {
                    if (obj != null)
                    {
                        obj2 = (Field)obj1;
                        obj1 = ((Field) (obj2)).value();
                        boolean flag = ((Field) (obj2)).encodeName();
                        boolean flag2 = ((Field) (obj2)).encodeValue();
                        if (obj instanceof Iterable)
                        {
                            obj = ((Iterable)obj).iterator();
                            while (((Iterator) (obj)).hasNext()) 
                            {
                                obj2 = ((Iterator) (obj)).next();
                                if (obj2 != null)
                                {
                                    formBody.addField(((String) (obj1)), flag, obj2.toString(), flag2);
                                }
                            }
                        } else
                        if (obj.getClass().isArray())
                        {
                            int j1 = Array.getLength(obj);
                            int l = 0;
                            while (l < j1) 
                            {
                                obj2 = Array.get(obj, l);
                                if (obj2 != null)
                                {
                                    formBody.addField(((String) (obj1)), flag, obj2.toString(), flag2);
                                }
                                l++;
                            }
                        } else
                        {
                            formBody.addField(((String) (obj1)), flag, obj.toString(), flag2);
                        }
                    }
                } else
                if (obj2 == retrofit/http/FieldMap)
                {
                    if (obj != null)
                    {
                        obj1 = (FieldMap)obj1;
                        boolean flag1 = ((FieldMap) (obj1)).encodeNames();
                        boolean flag3 = ((FieldMap) (obj1)).encodeValues();
                        obj = ((Map)obj).entrySet().iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                            obj1 = ((java.util.Map.Entry) (obj2)).getKey();
                            if (obj1 == null)
                            {
                                throw new IllegalArgumentException((new StringBuilder("Parameter #")).append(j + 1).append(" field map contained null key.").toString());
                            }
                            obj2 = ((java.util.Map.Entry) (obj2)).getValue();
                            if (obj2 != null)
                            {
                                formBody.addField(obj1.toString(), flag1, obj2.toString(), flag3);
                            }
                        }
                    }
                } else
                if (obj2 == retrofit/http/Part)
                {
                    if (obj != null)
                    {
                        obj2 = ((Part)obj1).value();
                        obj1 = ((Part)obj1).encoding();
                        if (obj instanceof TypedOutput)
                        {
                            multipartBody.addPart(((String) (obj2)), ((String) (obj1)), (TypedOutput)obj);
                        } else
                        if (obj instanceof String)
                        {
                            multipartBody.addPart(((String) (obj2)), ((String) (obj1)), new TypedString((String)obj));
                        } else
                        {
                            multipartBody.addPart(((String) (obj2)), ((String) (obj1)), converter.toBody(obj));
                        }
                    }
                } else
                if (obj2 == retrofit/http/PartMap)
                {
                    if (obj != null)
                    {
                        obj1 = ((PartMap)obj1).encoding();
                        obj = ((Map)obj).entrySet().iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                            Object obj3 = ((java.util.Map.Entry) (obj2)).getKey();
                            if (obj3 == null)
                            {
                                throw new IllegalArgumentException((new StringBuilder("Parameter #")).append(j + 1).append(" part map contained null key.").toString());
                            }
                            obj3 = obj3.toString();
                            obj2 = ((java.util.Map.Entry) (obj2)).getValue();
                            if (obj2 != null)
                            {
                                if (obj2 instanceof TypedOutput)
                                {
                                    multipartBody.addPart(((String) (obj3)), ((String) (obj1)), (TypedOutput)obj2);
                                } else
                                if (obj2 instanceof String)
                                {
                                    multipartBody.addPart(((String) (obj3)), ((String) (obj1)), new TypedString((String)obj2));
                                } else
                                {
                                    multipartBody.addPart(((String) (obj3)), ((String) (obj1)), converter.toBody(obj2));
                                }
                            }
                        }
                    }
                } else
                if (obj2 == retrofit/http/Body)
                {
                    if (obj == null)
                    {
                        throw new IllegalArgumentException("Body parameter value must not be null.");
                    }
                    if (obj instanceof TypedOutput)
                    {
                        body = (TypedOutput)obj;
                    } else
                    {
                        body = converter.toBody(obj);
                    }
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Unknown annotation: ")).append(((Class) (obj2)).getCanonicalName()).toString());
                }
                j++;
            }
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$retrofit$RestMethodInfo$RequestType[];

        static 
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType = new int[RestMethodInfo.RequestType.values().length];
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.FORM_URL_ENCODED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.MULTIPART.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.SIMPLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class MimeOverridingTypedOutput
        implements TypedOutput
    {

        private final TypedOutput _flddelegate;
        private final String mimeType;

        public String fileName()
        {
            return _flddelegate.fileName();
        }

        public long length()
        {
            return _flddelegate.length();
        }

        public String mimeType()
        {
            return mimeType;
        }

        public void writeTo(OutputStream outputstream)
        {
            _flddelegate.writeTo(outputstream);
        }

        MimeOverridingTypedOutput(TypedOutput typedoutput, String s)
        {
            _flddelegate = typedoutput;
            mimeType = s;
        }
    }

}

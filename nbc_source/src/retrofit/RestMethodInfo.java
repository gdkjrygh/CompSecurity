// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.EncodedPath;
import retrofit.http.EncodedQuery;
import retrofit.http.EncodedQueryMap;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.Part;
import retrofit.http.PartMap;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import retrofit.http.RestMethod;
import retrofit.http.Streaming;
import rx.Observable;

// Referenced classes of package retrofit:
//            Callback, Platform, Types

final class RestMethodInfo
{
    static final class RequestType extends Enum
    {

        private static final RequestType $VALUES[];
        public static final RequestType FORM_URL_ENCODED;
        public static final RequestType MULTIPART;
        public static final RequestType SIMPLE;

        public static RequestType valueOf(String s)
        {
            return (RequestType)Enum.valueOf(retrofit/RestMethodInfo$RequestType, s);
        }

        public static RequestType[] values()
        {
            return (RequestType[])$VALUES.clone();
        }

        static 
        {
            SIMPLE = new RequestType("SIMPLE", 0);
            MULTIPART = new RequestType("MULTIPART", 1);
            FORM_URL_ENCODED = new RequestType("FORM_URL_ENCODED", 2);
            $VALUES = (new RequestType[] {
                SIMPLE, MULTIPART, FORM_URL_ENCODED
            });
        }

        private RequestType(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class ResponseType extends Enum
    {

        private static final ResponseType $VALUES[];
        public static final ResponseType OBJECT;
        public static final ResponseType OBSERVABLE;
        public static final ResponseType VOID;

        public static ResponseType valueOf(String s)
        {
            return (ResponseType)Enum.valueOf(retrofit/RestMethodInfo$ResponseType, s);
        }

        public static ResponseType[] values()
        {
            return (ResponseType[])$VALUES.clone();
        }

        static 
        {
            VOID = new ResponseType("VOID", 0);
            OBSERVABLE = new ResponseType("OBSERVABLE", 1);
            OBJECT = new ResponseType("OBJECT", 2);
            $VALUES = (new ResponseType[] {
                VOID, OBSERVABLE, OBJECT
            });
        }

        private ResponseType(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class RxSupport
    {

        public static Type getObservableType(Type type, Class class1)
        {
            return Types.getSupertype(type, class1, rx/Observable);
        }

        public static boolean isObservable(Class class1)
        {
            return class1 == rx/Observable;
        }

        private RxSupport()
        {
        }
    }


    private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
    private static final Pattern PARAM_NAME_REGEX = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    String contentTypeHeader;
    List headers;
    final boolean isObservable;
    boolean isStreaming;
    final boolean isSynchronous;
    boolean loaded;
    final Method method;
    boolean requestHasBody;
    String requestMethod;
    Annotation requestParamAnnotations[];
    String requestQuery;
    RequestType requestType;
    String requestUrl;
    Set requestUrlParamNames;
    Type responseObjectType;
    final ResponseType responseType = parseResponseType();

    RestMethodInfo(Method method1)
    {
        boolean flag1 = true;
        super();
        loaded = false;
        requestType = RequestType.SIMPLE;
        method = method1;
        boolean flag;
        if (responseType == ResponseType.OBJECT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isSynchronous = flag;
        if (responseType == ResponseType.OBSERVABLE)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isObservable = flag;
    }

    private static Type getParameterUpperBound(ParameterizedType parameterizedtype)
    {
        parameterizedtype = parameterizedtype.getActualTypeArguments();
        for (int i = 0; i < parameterizedtype.length; i++)
        {
            Object obj = parameterizedtype[i];
            if (obj instanceof WildcardType)
            {
                parameterizedtype[i] = ((WildcardType)obj).getUpperBounds()[0];
            }
        }

        return parameterizedtype[0];
    }

    private transient RuntimeException methodError(String s, Object aobj[])
    {
        String s1 = s;
        if (aobj.length > 0)
        {
            s1 = String.format(s, aobj);
        }
        return new IllegalArgumentException((new StringBuilder()).append(method.getDeclaringClass().getSimpleName()).append(".").append(method.getName()).append(": ").append(s1).toString());
    }

    private transient RuntimeException parameterError(int i, String s, Object aobj[])
    {
        return methodError((new StringBuilder()).append(s).append(" (parameter #").append(i + 1).append(")").toString(), aobj);
    }

    private void parseMethodAnnotations()
    {
        Annotation aannotation[];
        int i;
        int k;
        aannotation = method.getAnnotations();
        k = aannotation.length;
        i = 0;
_L6:
        String s;
        Class class1;
        Annotation annotation;
        Annotation aannotation1[];
        int j;
        int l;
        if (i < k)
        {
            annotation = aannotation[i];
            class1 = annotation.annotationType();
            s = null;
            aannotation1 = class1.getAnnotations();
            l = aannotation1.length;
            j = 0;
            break MISSING_BLOCK_LABEL_54;
        }
          goto _L1
        j++;
        if (true) goto _L3; else goto _L2
_L3:
        Object obj = s;
        if (j < l)
        {
            obj = aannotation1[j];
            if (retrofit/http/RestMethod != ((Annotation) (obj)).annotationType())
            {
                break MISSING_BLOCK_LABEL_123;
            }
            obj = (RestMethod)obj;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (requestMethod != null)
        {
            throw methodError("Only one HTTP method is allowed. Found: %s and %s.", new Object[] {
                requestMethod, ((RestMethod) (obj)).value()
            });
        }
        try
        {
            s = (String)class1.getMethod("value", new Class[0]).invoke(annotation, new Object[0]);
        }
        catch (Exception exception)
        {
            throw methodError("Failed to extract String 'value' from @%s annotation.", new Object[] {
                class1.getSimpleName()
            });
        }
        parsePath(s);
        requestMethod = ((RestMethod) (obj)).value();
        requestHasBody = ((RestMethod) (obj)).hasBody();
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (class1 == retrofit/http/Headers)
        {
            String as[] = ((Headers)annotation).value();
            if (as.length == 0)
            {
                throw methodError("@Headers annotation is empty.", new Object[0]);
            }
            headers = parseHeaders(as);
        } else
        if (class1 == retrofit/http/Multipart)
        {
            if (requestType != RequestType.SIMPLE)
            {
                throw methodError("Only one encoding annotation is allowed.", new Object[0]);
            }
            requestType = RequestType.MULTIPART;
        } else
        if (class1 == retrofit/http/FormUrlEncoded)
        {
            if (requestType != RequestType.SIMPLE)
            {
                throw methodError("Only one encoding annotation is allowed.", new Object[0]);
            }
            requestType = RequestType.FORM_URL_ENCODED;
        } else
        if (class1 == retrofit/http/Streaming)
        {
            if (responseObjectType != retrofit/client/Response)
            {
                throw methodError("Only methods having %s as data type are allowed to have @%s annotation.", new Object[] {
                    retrofit/client/Response.getSimpleName(), retrofit/http/Streaming.getSimpleName()
                });
            }
            isStreaming = true;
        }
        if (true) goto _L4; else goto _L1
_L1:
        if (requestMethod == null)
        {
            throw methodError("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if (!requestHasBody)
        {
            if (requestType == RequestType.MULTIPART)
            {
                throw methodError("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
            if (requestType == RequestType.FORM_URL_ENCODED)
            {
                throw methodError("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
        }
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void parseParameters()
    {
        Class aclass[] = method.getParameterTypes();
        Annotation aannotation[][] = method.getParameterAnnotations();
        int i = aannotation.length;
        int j = i;
        if (!isSynchronous)
        {
            j = i;
            if (!isObservable)
            {
                j = i - 1;
            }
        }
        Annotation aannotation1[] = new Annotation[j];
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = false;
        int k = 0;
        do
        {
            if (k >= j)
            {
                break;
            }
            Class class1 = aclass[k];
            Annotation aannotation2[] = aannotation[k];
            boolean flag3 = flag1;
            boolean flag4 = flag2;
            boolean flag5 = flag;
            if (aannotation2 != null)
            {
                int i1 = aannotation2.length;
                int l = 0;
label0:
                do
                {
label1:
                    {
                        flag3 = flag1;
                        flag4 = flag2;
                        flag5 = flag;
                        if (l >= i1)
                        {
                            break label0;
                        }
                        Annotation annotation = aannotation2[l];
                        Class class2 = annotation.annotationType();
                        if (class2 == retrofit/http/Path)
                        {
                            validatePathName(k, ((Path)annotation).value());
                            flag4 = flag;
                            flag3 = flag2;
                            flag5 = flag1;
                        } else
                        if (class2 == retrofit/http/EncodedPath)
                        {
                            validatePathName(k, ((EncodedPath)annotation).value());
                            flag5 = flag1;
                            flag3 = flag2;
                            flag4 = flag;
                        } else
                        {
                            flag5 = flag1;
                            flag3 = flag2;
                            flag4 = flag;
                            if (class2 != retrofit/http/Query)
                            {
                                flag5 = flag1;
                                flag3 = flag2;
                                flag4 = flag;
                                if (class2 != retrofit/http/EncodedQuery)
                                {
                                    if (class2 == retrofit/http/QueryMap)
                                    {
                                        flag5 = flag1;
                                        flag3 = flag2;
                                        flag4 = flag;
                                        if (!java/util/Map.isAssignableFrom(class1))
                                        {
                                            throw parameterError(k, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else
                                    if (class2 == retrofit/http/EncodedQueryMap)
                                    {
                                        flag5 = flag1;
                                        flag3 = flag2;
                                        flag4 = flag;
                                        if (!java/util/Map.isAssignableFrom(class1))
                                        {
                                            throw parameterError(k, "@EncodedQueryMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else
                                    {
                                        flag5 = flag1;
                                        flag3 = flag2;
                                        flag4 = flag;
                                        if (class2 != retrofit/http/Header)
                                        {
                                            if (class2 == retrofit/http/Field)
                                            {
                                                if (requestType != RequestType.FORM_URL_ENCODED)
                                                {
                                                    throw parameterError(k, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                flag3 = true;
                                                flag5 = flag1;
                                                flag4 = flag;
                                            } else
                                            if (class2 == retrofit/http/FieldMap)
                                            {
                                                if (requestType != RequestType.FORM_URL_ENCODED)
                                                {
                                                    throw parameterError(k, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                if (!java/util/Map.isAssignableFrom(class1))
                                                {
                                                    throw parameterError(k, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                flag3 = true;
                                                flag5 = flag1;
                                                flag4 = flag;
                                            } else
                                            if (class2 == retrofit/http/Part)
                                            {
                                                if (requestType != RequestType.MULTIPART)
                                                {
                                                    throw parameterError(k, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                flag4 = true;
                                                flag5 = flag1;
                                                flag3 = flag2;
                                            } else
                                            if (class2 == retrofit/http/PartMap)
                                            {
                                                if (requestType != RequestType.MULTIPART)
                                                {
                                                    throw parameterError(k, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                if (!java/util/Map.isAssignableFrom(class1))
                                                {
                                                    throw parameterError(k, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                flag4 = true;
                                                flag5 = flag1;
                                                flag3 = flag2;
                                            } else
                                            {
                                                flag5 = flag1;
                                                flag3 = flag2;
                                                flag4 = flag;
                                                if (class2 != retrofit/http/Body)
                                                {
                                                    break label1;
                                                }
                                                if (requestType != RequestType.SIMPLE)
                                                {
                                                    throw parameterError(k, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (flag1)
                                                {
                                                    throw methodError("Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                flag5 = true;
                                                flag3 = flag2;
                                                flag4 = flag;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (aannotation1[k] != null)
                        {
                            throw parameterError(k, "Multiple Retrofit annotations found, only one allowed: @%s, @%s.", new Object[] {
                                aannotation1[k].annotationType().getSimpleName(), class2.getSimpleName()
                            });
                        }
                        aannotation1[k] = annotation;
                    }
                    l++;
                    flag1 = flag5;
                    flag2 = flag3;
                    flag = flag4;
                } while (true);
            }
            if (aannotation1[k] == null)
            {
                throw parameterError(k, "No Retrofit annotation found.", new Object[0]);
            }
            k++;
            flag1 = flag3;
            flag2 = flag4;
            flag = flag5;
        } while (true);
        if (requestType == RequestType.SIMPLE && !requestHasBody && flag1)
        {
            throw methodError("Non-body HTTP method cannot contain @Body or @TypedOutput.", new Object[0]);
        }
        if (requestType == RequestType.FORM_URL_ENCODED && !flag2)
        {
            throw methodError("Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if (requestType == RequestType.MULTIPART && !flag)
        {
            throw methodError("Multipart method must contain at least one @Part.", new Object[0]);
        } else
        {
            requestParamAnnotations = aannotation1;
            return;
        }
    }

    private void parsePath(String s)
    {
        if (s == null || s.length() == 0 || s.charAt(0) != '/')
        {
            throw methodError("URL path \"%s\" must start with '/'.", new Object[] {
                s
            });
        }
        String s3 = s;
        Object obj = null;
        int i = s.indexOf('?');
        String s1 = obj;
        String s2 = s3;
        if (i != -1)
        {
            s1 = obj;
            s2 = s3;
            if (i < s.length() - 1)
            {
                s2 = s.substring(0, i);
                String s4 = s.substring(i + 1);
                s1 = s4;
                if (PARAM_URL_REGEX.matcher(s4).find())
                {
                    throw methodError("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", new Object[] {
                        s4
                    });
                }
            }
        }
        s = parsePathParameters(s);
        requestUrl = s2;
        requestUrlParamNames = s;
        requestQuery = s1;
    }

    static Set parsePathParameters(String s)
    {
        s = PARAM_URL_REGEX.matcher(s);
        LinkedHashSet linkedhashset = new LinkedHashSet();
        for (; s.find(); linkedhashset.add(s.group(1))) { }
        return linkedhashset;
    }

    private ResponseType parseResponseType()
    {
        boolean flag1 = true;
        Type type1 = method.getGenericReturnType();
        Object obj2 = null;
        Object obj4 = null;
        Type atype[] = method.getGenericParameterTypes();
        Object obj1 = obj4;
        if (atype.length > 0)
        {
            obj1 = atype[atype.length - 1];
            Object obj = obj1;
            Object obj3 = obj1;
            if (obj1 instanceof ParameterizedType)
            {
                obj3 = ((ParameterizedType)obj1).getRawType();
            }
            obj1 = obj4;
            obj2 = obj;
            if (obj3 instanceof Class)
            {
                obj1 = (Class)obj3;
                obj2 = obj;
            }
        }
        boolean flag;
        if (type1 != Void.TYPE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj1 == null || !retrofit/Callback.isAssignableFrom(((Class) (obj1))))
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            throw methodError("Must have return type or Callback as last argument, not both.", new Object[0]);
        }
        if (!flag && !flag1)
        {
            throw methodError("Must have either a return type or Callback as last argument.", new Object[0]);
        }
        if (flag)
        {
            if (Platform.HAS_RX_JAVA)
            {
                Class class1 = Types.getRawType(type1);
                if (RxSupport.isObservable(class1))
                {
                    responseObjectType = getParameterUpperBound((ParameterizedType)RxSupport.getObservableType(type1, class1));
                    return ResponseType.OBSERVABLE;
                }
            }
            responseObjectType = type1;
            return ResponseType.OBJECT;
        }
        Type type = Types.getSupertype(((Type) (obj2)), Types.getRawType(((Type) (obj2))), retrofit/Callback);
        if (type instanceof ParameterizedType)
        {
            responseObjectType = getParameterUpperBound((ParameterizedType)type);
            return ResponseType.VOID;
        } else
        {
            throw methodError("Last parameter must be of type Callback<X> or Callback<? super X>.", new Object[0]);
        }
    }

    private void validatePathName(int i, String s)
    {
        if (!PARAM_NAME_REGEX.matcher(s).matches())
        {
            throw parameterError(i, "@Path parameter name must match %s. Found: %s", new Object[] {
                PARAM_URL_REGEX.pattern(), s
            });
        }
        if (!requestUrlParamNames.contains(s))
        {
            throw parameterError(i, "URL \"%s\" does not contain \"{%s}\".", new Object[] {
                requestUrl, s
            });
        } else
        {
            return;
        }
    }

    void init()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = loaded;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        parseMethodAnnotations();
        parseParameters();
        loaded = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    List parseHeaders(String as[])
    {
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            int k = s1.indexOf(':');
            if (k == -1 || k == 0 || k == s1.length() - 1)
            {
                throw methodError("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[] {
                    s1
                });
            }
            String s = s1.substring(0, k);
            s1 = s1.substring(k + 1).trim();
            if ("Content-Type".equalsIgnoreCase(s))
            {
                contentTypeHeader = s1;
            } else
            {
                arraylist.add(new retrofit.client.Header(s, s1));
            }
            i++;
        }
        return arraylist;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;


// Referenced classes of package org.c.c:
//            m

public final class l extends Enum
{

    public static final l ACCEPTED;
    public static final l ALREADY_REPORTED;
    public static final l BAD_GATEWAY;
    public static final l BAD_REQUEST;
    public static final l BANDWIDTH_LIMIT_EXCEEDED;
    public static final l CHECKPOINT;
    public static final l CONFLICT;
    public static final l CONTINUE;
    public static final l CREATED;
    public static final l DESTINATION_LOCKED;
    public static final l EXPECTATION_FAILED;
    public static final l FAILED_DEPENDENCY;
    public static final l FORBIDDEN;
    public static final l FOUND;
    public static final l GATEWAY_TIMEOUT;
    public static final l GONE;
    public static final l HTTP_VERSION_NOT_SUPPORTED;
    public static final l IM_USED;
    public static final l INSUFFICIENT_SPACE_ON_RESOURCE;
    public static final l INSUFFICIENT_STORAGE;
    public static final l INTERNAL_SERVER_ERROR;
    public static final l I_AM_A_TEAPOT;
    public static final l LENGTH_REQUIRED;
    public static final l LOCKED;
    public static final l LOOP_DETECTED;
    public static final l METHOD_FAILURE;
    public static final l METHOD_NOT_ALLOWED;
    public static final l MOVED_PERMANENTLY;
    public static final l MOVED_TEMPORARILY;
    public static final l MULTIPLE_CHOICES;
    public static final l MULTI_STATUS;
    public static final l NETWORK_AUTHENTICATION_REQUIRED;
    public static final l NON_AUTHORITATIVE_INFORMATION;
    public static final l NOT_ACCEPTABLE;
    public static final l NOT_EXTENDED;
    public static final l NOT_FOUND;
    public static final l NOT_IMPLEMENTED;
    public static final l NOT_MODIFIED;
    public static final l NO_CONTENT;
    public static final l OK;
    public static final l PARTIAL_CONTENT;
    public static final l PAYMENT_REQUIRED;
    public static final l PRECONDITION_FAILED;
    public static final l PRECONDITION_REQUIRED;
    public static final l PROCESSING;
    public static final l PROXY_AUTHENTICATION_REQUIRED;
    public static final l REQUESTED_RANGE_NOT_SATISFIABLE;
    public static final l REQUEST_ENTITY_TOO_LARGE;
    public static final l REQUEST_HEADER_FIELDS_TOO_LARGE;
    public static final l REQUEST_TIMEOUT;
    public static final l REQUEST_URI_TOO_LONG;
    public static final l RESET_CONTENT;
    public static final l RESUME_INCOMPLETE;
    public static final l SEE_OTHER;
    public static final l SERVICE_UNAVAILABLE;
    public static final l SWITCHING_PROTOCOLS;
    public static final l TEMPORARY_REDIRECT;
    public static final l TOO_MANY_REQUESTS;
    public static final l UNAUTHORIZED;
    public static final l UNPROCESSABLE_ENTITY;
    public static final l UNSUPPORTED_MEDIA_TYPE;
    public static final l UPGRADE_REQUIRED;
    public static final l USE_PROXY;
    public static final l VARIANT_ALSO_NEGOTIATES;
    private static final l c[];
    private final int a;
    private final String b;

    private l(String s, int i, int j, String s1)
    {
        super(s, i);
        a = j;
        b = s1;
    }

    public static l valueOf(int i)
    {
        l al[] = values();
        int k = al.length;
        for (int j = 0; j < k; j++)
        {
            l l1 = al[j];
            if (l1.a == i)
            {
                return l1;
            }
        }

        throw new IllegalArgumentException((new StringBuilder("No matching constant for [")).append(i).append("]").toString());
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(org/c/c/l, s);
    }

    public static l[] values()
    {
        return (l[])c.clone();
    }

    public final String getReasonPhrase()
    {
        return b;
    }

    public final m series()
    {
        return m.a(this);
    }

    public final String toString()
    {
        return Integer.toString(a);
    }

    public final int value()
    {
        return a;
    }

    static 
    {
        CONTINUE = new l("CONTINUE", 0, 100, "Continue");
        SWITCHING_PROTOCOLS = new l("SWITCHING_PROTOCOLS", 1, 101, "Switching Protocols");
        PROCESSING = new l("PROCESSING", 2, 102, "Processing");
        CHECKPOINT = new l("CHECKPOINT", 3, 103, "Checkpoint");
        OK = new l("OK", 4, 200, "OK");
        CREATED = new l("CREATED", 5, 201, "Created");
        ACCEPTED = new l("ACCEPTED", 6, 202, "Accepted");
        NON_AUTHORITATIVE_INFORMATION = new l("NON_AUTHORITATIVE_INFORMATION", 7, 203, "Non-Authoritative Information");
        NO_CONTENT = new l("NO_CONTENT", 8, 204, "No Content");
        RESET_CONTENT = new l("RESET_CONTENT", 9, 205, "Reset Content");
        PARTIAL_CONTENT = new l("PARTIAL_CONTENT", 10, 206, "Partial Content");
        MULTI_STATUS = new l("MULTI_STATUS", 11, 207, "Multi-Status");
        ALREADY_REPORTED = new l("ALREADY_REPORTED", 12, 208, "Already Reported");
        IM_USED = new l("IM_USED", 13, 226, "IM Used");
        MULTIPLE_CHOICES = new l("MULTIPLE_CHOICES", 14, 300, "Multiple Choices");
        MOVED_PERMANENTLY = new l("MOVED_PERMANENTLY", 15, 301, "Moved Permanently");
        FOUND = new l("FOUND", 16, 302, "Found");
        MOVED_TEMPORARILY = new l("MOVED_TEMPORARILY", 17, 302, "Moved Temporarily");
        SEE_OTHER = new l("SEE_OTHER", 18, 303, "See Other");
        NOT_MODIFIED = new l("NOT_MODIFIED", 19, 304, "Not Modified");
        USE_PROXY = new l("USE_PROXY", 20, 305, "Use Proxy");
        TEMPORARY_REDIRECT = new l("TEMPORARY_REDIRECT", 21, 307, "Temporary Redirect");
        RESUME_INCOMPLETE = new l("RESUME_INCOMPLETE", 22, 308, "Resume Incomplete");
        BAD_REQUEST = new l("BAD_REQUEST", 23, 400, "Bad Request");
        UNAUTHORIZED = new l("UNAUTHORIZED", 24, 401, "Unauthorized");
        PAYMENT_REQUIRED = new l("PAYMENT_REQUIRED", 25, 402, "Payment Required");
        FORBIDDEN = new l("FORBIDDEN", 26, 403, "Forbidden");
        NOT_FOUND = new l("NOT_FOUND", 27, 404, "Not Found");
        METHOD_NOT_ALLOWED = new l("METHOD_NOT_ALLOWED", 28, 405, "Method Not Allowed");
        NOT_ACCEPTABLE = new l("NOT_ACCEPTABLE", 29, 406, "Not Acceptable");
        PROXY_AUTHENTICATION_REQUIRED = new l("PROXY_AUTHENTICATION_REQUIRED", 30, 407, "Proxy Authentication Required");
        REQUEST_TIMEOUT = new l("REQUEST_TIMEOUT", 31, 408, "Request Timeout");
        CONFLICT = new l("CONFLICT", 32, 409, "Conflict");
        GONE = new l("GONE", 33, 410, "Gone");
        LENGTH_REQUIRED = new l("LENGTH_REQUIRED", 34, 411, "Length Required");
        PRECONDITION_FAILED = new l("PRECONDITION_FAILED", 35, 412, "Precondition Failed");
        REQUEST_ENTITY_TOO_LARGE = new l("REQUEST_ENTITY_TOO_LARGE", 36, 413, "Request Entity Too Large");
        REQUEST_URI_TOO_LONG = new l("REQUEST_URI_TOO_LONG", 37, 414, "Request-URI Too Long");
        UNSUPPORTED_MEDIA_TYPE = new l("UNSUPPORTED_MEDIA_TYPE", 38, 415, "Unsupported Media Type");
        REQUESTED_RANGE_NOT_SATISFIABLE = new l("REQUESTED_RANGE_NOT_SATISFIABLE", 39, 416, "Requested range not satisfiable");
        EXPECTATION_FAILED = new l("EXPECTATION_FAILED", 40, 417, "Expectation Failed");
        I_AM_A_TEAPOT = new l("I_AM_A_TEAPOT", 41, 418, "I'm a teapot");
        INSUFFICIENT_SPACE_ON_RESOURCE = new l("INSUFFICIENT_SPACE_ON_RESOURCE", 42, 419, "Insufficient Space On Resource");
        METHOD_FAILURE = new l("METHOD_FAILURE", 43, 420, "Method Failure");
        DESTINATION_LOCKED = new l("DESTINATION_LOCKED", 44, 421, "Destination Locked");
        UNPROCESSABLE_ENTITY = new l("UNPROCESSABLE_ENTITY", 45, 422, "Unprocessable Entity");
        LOCKED = new l("LOCKED", 46, 423, "Locked");
        FAILED_DEPENDENCY = new l("FAILED_DEPENDENCY", 47, 424, "Failed Dependency");
        UPGRADE_REQUIRED = new l("UPGRADE_REQUIRED", 48, 426, "Upgrade Required");
        PRECONDITION_REQUIRED = new l("PRECONDITION_REQUIRED", 49, 428, "Precondition Required");
        TOO_MANY_REQUESTS = new l("TOO_MANY_REQUESTS", 50, 429, "Too Many Requests");
        REQUEST_HEADER_FIELDS_TOO_LARGE = new l("REQUEST_HEADER_FIELDS_TOO_LARGE", 51, 431, "Request Header Fields Too Large");
        INTERNAL_SERVER_ERROR = new l("INTERNAL_SERVER_ERROR", 52, 500, "Internal Server Error");
        NOT_IMPLEMENTED = new l("NOT_IMPLEMENTED", 53, 501, "Not Implemented");
        BAD_GATEWAY = new l("BAD_GATEWAY", 54, 502, "Bad Gateway");
        SERVICE_UNAVAILABLE = new l("SERVICE_UNAVAILABLE", 55, 503, "Service Unavailable");
        GATEWAY_TIMEOUT = new l("GATEWAY_TIMEOUT", 56, 504, "Gateway Timeout");
        HTTP_VERSION_NOT_SUPPORTED = new l("HTTP_VERSION_NOT_SUPPORTED", 57, 505, "HTTP Version not supported");
        VARIANT_ALSO_NEGOTIATES = new l("VARIANT_ALSO_NEGOTIATES", 58, 506, "Variant Also Negotiates");
        INSUFFICIENT_STORAGE = new l("INSUFFICIENT_STORAGE", 59, 507, "Insufficient Storage");
        LOOP_DETECTED = new l("LOOP_DETECTED", 60, 508, "Loop Detected");
        BANDWIDTH_LIMIT_EXCEEDED = new l("BANDWIDTH_LIMIT_EXCEEDED", 61, 509, "Bandwidth Limit Exceeded");
        NOT_EXTENDED = new l("NOT_EXTENDED", 62, 510, "Not Extended");
        NETWORK_AUTHENTICATION_REQUIRED = new l("NETWORK_AUTHENTICATION_REQUIRED", 63, 511, "Network Authentication Required");
        c = (new l[] {
            CONTINUE, SWITCHING_PROTOCOLS, PROCESSING, CHECKPOINT, OK, CREATED, ACCEPTED, NON_AUTHORITATIVE_INFORMATION, NO_CONTENT, RESET_CONTENT, 
            PARTIAL_CONTENT, MULTI_STATUS, ALREADY_REPORTED, IM_USED, MULTIPLE_CHOICES, MOVED_PERMANENTLY, FOUND, MOVED_TEMPORARILY, SEE_OTHER, NOT_MODIFIED, 
            USE_PROXY, TEMPORARY_REDIRECT, RESUME_INCOMPLETE, BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED, NOT_ACCEPTABLE, 
            PROXY_AUTHENTICATION_REQUIRED, REQUEST_TIMEOUT, CONFLICT, GONE, LENGTH_REQUIRED, PRECONDITION_FAILED, REQUEST_ENTITY_TOO_LARGE, REQUEST_URI_TOO_LONG, UNSUPPORTED_MEDIA_TYPE, REQUESTED_RANGE_NOT_SATISFIABLE, 
            EXPECTATION_FAILED, I_AM_A_TEAPOT, INSUFFICIENT_SPACE_ON_RESOURCE, METHOD_FAILURE, DESTINATION_LOCKED, UNPROCESSABLE_ENTITY, LOCKED, FAILED_DEPENDENCY, UPGRADE_REQUIRED, PRECONDITION_REQUIRED, 
            TOO_MANY_REQUESTS, REQUEST_HEADER_FIELDS_TOO_LARGE, INTERNAL_SERVER_ERROR, NOT_IMPLEMENTED, BAD_GATEWAY, SERVICE_UNAVAILABLE, GATEWAY_TIMEOUT, HTTP_VERSION_NOT_SUPPORTED, VARIANT_ALSO_NEGOTIATES, INSUFFICIENT_STORAGE, 
            LOOP_DETECTED, BANDWIDTH_LIMIT_EXCEEDED, NOT_EXTENDED, NETWORK_AUTHENTICATION_REQUIRED
        });
    }
}

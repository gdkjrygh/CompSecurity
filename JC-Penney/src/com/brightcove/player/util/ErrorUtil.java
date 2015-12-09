// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.util;

import java.io.PrintStream;
import java.util.ResourceBundle;

public class ErrorUtil
{

    public static final String ANNOTATION_REQUIRED = "annotationRequired";
    public static final String BASE_URL_REQUIRED = "baseURLRequired";
    public static final String COULD_NOT_FIND_PROPERTY = "couldNotFindProperty";
    public static final String CUE_POINTS_REQUIRED = "cuePointsRequired";
    public static final String DELIVERY_TYPE_REQUIRED = "deliveryTypeRequired";
    public static final String DUPLICATE_DELIVERY_TYPES = "duplicateDeliveryTypes";
    public static final String ERROR = "error";
    public static final String ERROR_CONVERTING = "errorConverting";
    public static final String EVENT_EMITTER_AND_COMPONENT_REQUIRED = "eventEmitterAndComponentRequired";
    public static final String EVENT_EMITTER_AND_MEDIA_PLAYER_REQUIRED = "eventEmitterAndMediaPlayerRequired";
    public static final String EVENT_EMITTER_REQUIRED = "eventEmitterRequired";
    public static final String EVENT_REQUIRED = "eventRequired";
    public static final String EVENT_TYPE_AND_LISTENER_REQUIRED = "eventTypeAndListenerRequired";
    public static final String HEADERS_REQUIRED = "headersRequired";
    public static final String ID_FIELD_REQUIRED = "idFieldRequired";
    public static final String ID_REQUIRED = "idRequired";
    public static final String IMAGE_VIEW_AND_EVENT_EMITTER_REQUIRED = "imageViewAndEventEmitterRequired";
    public static final String IMAGE_VIEW_REQUIRED = "imageViewRequired";
    public static final String INVALID_EMIT = "invalidEmit";
    public static final String INVALID_POINT_IN_TIME = "invalidPointInTime";
    public static final String INVALID_SURFACE = "invalidSurface";
    public static final String INVALID_URI = "invalidURI";
    public static final String INVALID_URL = "invalidURL";
    public static final String JSON_AND_PROPERTIES_REQUIRED = "jsonAndPropertiesRequired";
    public static final String JSON_ARRAY = "jsonArray";
    public static final String JSON_REQUIRED = "jsonRequired";
    public static final String KEY_NOT_FOUND = "keyNotFound";
    public static final String LISTENER_REQUIRED = "listenerRequired";
    public static final String MEDIA_API_COMMAND_REQUIRED = "mediaAPICommandRequired";
    public static final String MEDIA_DELIVERY_REQUIRED = "mediaDeliveryRequired";
    public static final String MEDIA_REQUEST_ERROR = "mediaRequestError";
    public static final String MEDIA_REQUEST_INVALID_JSON = "mediaRequestInvalidJSON";
    public static final String MEDIA_REQUEST_NO_JSON = "mediaRequestNoJSON";
    public static final String MEDIA_REQUEST_NO_RESULTS = "mediaRequestNoResults";
    public static final String MISSING_CUE_POINT_PROPERTY = "missingCuePointProperty";
    public static final String NOT_PERMITTED_TO_EMIT = "notPermittedToEmit";
    public static final String NOT_PERMITTED_TO_LISTEN = "notPermittedToListen";
    public static final String NO_USABLE_SOURCE = "noUsableSource";
    public static final String OTHER_CONSTRUCTOR = "otherConstructor";
    public static final String OUT_OF_FLOW = "outOfFlow";
    public static final String PROPERTIES_REQUIRED = "propertiesRequired";
    public static final String QUERY_BASE_URL_REQUIRED = "queryBaseURLRequired";
    public static final String READ_TOKEN_REQUIRED = "readTokenRequired";
    public static final String RENDER_VIEW_AND_EVENT_EMITTER_REQUIRED = "renderViewAndEventEmitterRequired";
    public static final String SOURCES_REQUIRED = "sourcesRequired";
    public static final String SOURCE_COLLECTIONS_REQUIRED = "sourceCollectionsRequired";
    public static final String SOURCE_COLLECTION_REQUIRED = "sourceCollectionRequired";
    public static final String SOURCE_REQUIRED = "sourceRequired";
    public static final String TOKEN_REQUIRED = "tokenRequired";
    public static final String UNEXPECTED_TYPE = "unexpectedType";
    public static final String URI_ERROR = "uriError";
    public static final String URI_REQUIRED = "uriRequired";
    public static final String URL_REQUIRED = "urlRequired";
    public static final String VIDEOS_REQUIRED = "videosRequired";
    public static final String VIDEO_PLAY_IOEXCEPTION = "videoPlayIOException";
    public static final String VIDEO_REQUIRED = "videoRequired";
    private static ResourceBundle a;

    public ErrorUtil()
    {
    }

    public static String getMessage(String s)
    {
        String s1;
        try
        {
            s1 = a.getString(s);
        }
        catch (Exception exception)
        {
            return s;
        }
        return s1;
    }

    static 
    {
        try
        {
            a = ResourceBundle.getBundle("BrightcoveErrorMessages");
        }
        catch (Exception exception)
        {
            System.err.println((new StringBuilder()).append("Exception in ErrorUtil initializer: ").append(exception.getMessage()).toString());
            exception.printStackTrace();
        }
    }
}

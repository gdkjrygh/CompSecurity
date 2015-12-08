// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.text.TextUtils;
import android.util.Base64;
import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.Batch;
import com.pinterest.api.model.BatchRequest;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.base.Device;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class PinApi extends BaseApi
{

    public static final String a;
    public static final String b;

    static void a(Pin pin, ByteArrayInputStream bytearrayinputstream)
    {
        (new _cls2(pin, bytearrayinputstream)).execute();
    }

    static void a(PinFeed pinfeed)
    {
        for (int i = 0; i < pinfeed.getCount(); i++)
        {
            Pin pin = (Pin)pinfeed.get(i);
            if (pin != null && pin.getCinematicSrc() != null && BooleanUtils.isTrue(pin.getIsCinematic()))
            {
                String s = pin.getCinematicSrc();
                Preferences.persisted().remove((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_LOOPCOUNT").toString());
                Preferences.persisted().remove((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_FRAMES").toString());
                (new _cls1(pin)).execute();
            }
        }

    }

    public static void a(PinDetailParams pindetailparams, ApiResponseHandler apiresponsehandler, String s)
    {
        Batch batch = new Batch();
        String s2 = String.format("/v3/pins/%s/repin/", new Object[] {
            pindetailparams.a
        });
        HashMap hashmap = new HashMap();
        hashmap.put("board_id", pindetailparams.b);
        hashmap.put("description", pindetailparams.d);
        hashmap.put("place", pindetailparams.c);
        if (pindetailparams.e)
        {
            hashmap.put("share_facebook", "1");
        }
        String s1;
        if (pindetailparams.f)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        hashmap.put("share_twitter", s1);
        if (pindetailparams.g != null)
        {
            hashmap.put("image_signature", pindetailparams.g);
        }
        batch.add((new BatchRequest("POST", s2, hashmap)).toRequest());
        c("batch/", batch.toRequestParam(), apiresponsehandler, s);
    }

    public static void a(PinDetailParams pindetailparams, BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("board_id", pindetailparams.b);
        requestparams.a("description", pindetailparams.d);
        requestparams.a("place", pindetailparams.c);
        if (pindetailparams.e)
        {
            requestparams.a("share_facebook", "1");
        }
        String s1;
        if (pindetailparams.f)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        requestparams.a("share_twitter", s1);
        if (pindetailparams.g != null)
        {
            requestparams.a("image_signature", pindetailparams.g);
        }
        requestparams.a("add_fields", ApiFields.e());
        a("pins/%s/", pindetailparams.a, requestparams, baseapiresponsehandler, s);
    }

    public static void a(PinSubmitParams pinsubmitparams, BaseApiResponseHandler baseapiresponsehandler)
    {
        byte abyte0[] = Base64.decode(pinsubmitparams.h, 0);
        RequestParams requestparams = new RequestParams();
        if (pinsubmitparams.j != null && pinsubmitparams.j.length() > 0)
        {
            requestparams.a("sdk_client_id", pinsubmitparams.j);
        }
        if (pinsubmitparams.i != null && pinsubmitparams.i.length() > 0)
        {
            requestparams.a("sdk_package_id", pinsubmitparams.i);
        }
        requestparams.a("board_id", pinsubmitparams.a);
        requestparams.a("description", pinsubmitparams.b);
        requestparams.a("share_twitter", String.valueOf(pinsubmitparams.f));
        if (!TextUtils.isEmpty(pinsubmitparams.l))
        {
            requestparams.a("method", pinsubmitparams.l);
        }
        if (ModelHelper.isValid(pinsubmitparams.d))
        {
            requestparams.a("image_url", pinsubmitparams.d);
        } else
        {
            requestparams.a("image", new ByteArrayInputStream(abyte0), "myphoto.jpg", "image/jpeg");
        }
        if (ModelHelper.isValidString(pinsubmitparams.c))
        {
            requestparams.a("source_url", pinsubmitparams.c);
        }
        if (ModelHelper.isValidString(pinsubmitparams.k))
        {
            requestparams.a("place", pinsubmitparams.k);
        }
        if (ModelHelper.isValidString(pinsubmitparams.m))
        {
            requestparams.a("parent_csr_id", pinsubmitparams.m);
        }
        requestparams.a("add_fields", a);
        b("pins/", requestparams, baseapiresponsehandler, null);
    }

    public static void a(String s, int i, int j, ApiResponseHandler apiresponsehandler, String s1)
    {
        s = String.format("promoted/%s/feedback/reason/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        if (ModelHelper.isValid(Integer.valueOf(j)))
        {
            requestparams.a("complaint_reason", j);
        }
        if (ModelHelper.isValid(Integer.valueOf(i)))
        {
            requestparams.a("feedback_type", i);
        }
        b(s, requestparams, apiresponsehandler, s1);
    }

    public static void a(String s, int i, ApiResponseHandler apiresponsehandler)
    {
        s = String.format("promoted/%s/feedback/", new Object[] {
            s, Integer.valueOf(i)
        });
        RequestParams requestparams = new RequestParams();
        if (ModelHelper.isValid(Integer.valueOf(i)))
        {
            requestparams.a("feedback_type", i);
        }
        b(s, requestparams, apiresponsehandler, null);
    }

    public static void a(String s, int i, String s1, int j, int k, ApiResponseHandler apiresponsehandler)
    {
        s = String.format("pfy/%s/feedback/reason/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        if (ModelHelper.isValid(s1))
        {
            requestparams.a("through_id", s1);
        }
        if (ModelHelper.isValid(Integer.valueOf(j)))
        {
            requestparams.a("rec_reason_id", j);
        }
        if (ModelHelper.isValid(Integer.valueOf(k)))
        {
            requestparams.a("complaint_reason", k);
        }
        if (ModelHelper.isValid(Integer.valueOf(i)))
        {
            requestparams.a("feedback_type", i);
        }
        b(s, requestparams, apiresponsehandler, null);
    }

    public static void a(String s, int i, String s1, int j, ApiResponseHandler apiresponsehandler, String s2)
    {
        s = String.format("pfy/%s/feedback/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        if (ModelHelper.isValid(Integer.valueOf(i)))
        {
            requestparams.a("feedback_type", i);
        }
        if (ModelHelper.isValid(s1))
        {
            requestparams.a("through_id", s1);
        }
        if (ModelHelper.isValid(Integer.valueOf(j)))
        {
            requestparams.a("rec_reason_type", j);
        }
        b(s, requestparams, apiresponsehandler, s2);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler, String s1)
    {
        a((new StringBuilder("pins/")).append(s).append("/interests/").toString(), ((BaseApiResponseHandler) (apiresponsehandler)), s1);
    }

    public static void a(String s, BaseApiResponseHandler baseapiresponsehandler, String s1, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.w);
        requestparams.a("bookmark", s1);
        a(String.format("aggregated_pin_data/%s/activities/", new Object[] {
            s
        }), requestparams, baseapiresponsehandler, s2);
    }

    public static void a(String s, BoardApi.BoardFeedApiResponse boardfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.l);
        requestparams.a("page_size", Device.getPageSizeString());
        a(String.format("pins/%s/repinned_onto/", new Object[] {
            s
        }), requestparams, ((BaseApiResponseHandler) (boardfeedapiresponse)), s1);
    }

    public static void a(String s, PinApiResponse pinapiresponse, String s1)
    {
        a(s, true, pinapiresponse, s1);
    }

    public static void a(String s, PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.b());
        requestparams.a("page_size", Device.getPageSizeString());
        a((new StringBuilder("pins/")).append(s).append("/related/pin/").toString(), requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    public static void a(String s, UserApi.UserFeedApiResponse userfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.i);
        requestparams.a("page_size", Device.getPageSizeString());
        a(String.format("pins/%s/likes/", new Object[] {
            s
        }), requestparams, ((BaseApiResponseHandler) (userfeedapiresponse)), s1);
    }

    public static void a(String s, String s1)
    {
        s = String.format("pfy/%s/feedback/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        requestparams.a("feedback_type", 1);
        b(s, requestparams, null, s1);
    }

    public static void a(String s, String s1, CommentApiResponse commentapiresponse)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("text", s1);
        a("pins/%s/comment/", s, requestparams, ((BaseApiResponseHandler) (commentapiresponse)), null);
    }

    public static void a(String s, String s1, CommentDeleteApiResponse commentdeleteapiresponse)
    {
        if (commentdeleteapiresponse != null)
        {
            commentdeleteapiresponse.setCommentUid(s1);
        }
        c((new StringBuilder("pins/%s/comments/")).append(s1).append("/").toString(), s, commentdeleteapiresponse, null);
    }

    public static void a(String s, String s1, String s2, int i, int j, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("reason", s1);
        requestparams.a("explanation", s2);
        if (i != -1)
        {
            requestparams.a("view_type", String.valueOf(i));
        }
        if (j != -1)
        {
            requestparams.a("view_paramter_type", String.valueOf(j));
        }
        a("pins/%s/mark/", s, requestparams, baseapiresponsehandler);
    }

    public static void a(String s, String s1, List list, String s2, int i, int j, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("reason", s1);
        requestparams.a("detailed_reasons", list);
        requestparams.a("explanation", s2);
        if (i != -1)
        {
            requestparams.a("view_type", String.valueOf(i));
        }
        if (j != -1)
        {
            requestparams.a("view_paramter_type", String.valueOf(j));
        }
        a("pins/%s/mark/", s, requestparams, baseapiresponsehandler);
    }

    public static void a(String s, boolean flag, PinApiResponse pinapiresponse, String s1)
    {
        s = String.format("pins/%s/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("fields", ApiFields.f());
        a(s, flag, ((Map) (treemap)), ((BaseApiResponseHandler) (pinapiresponse)), s1);
    }

    public static void a(String s, boolean flag, PinLikeApiResponse pinlikeapiresponse)
    {
        if (flag)
        {
            b("pins/%s/like/", s, pinlikeapiresponse, null);
            return;
        } else
        {
            c("pins/%s/like/", s, pinlikeapiresponse, null);
            return;
        }
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.w);
        a(String.format("aggregated_pin_data/%s/activities/", new Object[] {
            s
        }), requestparams, baseapiresponsehandler, s1);
    }

    public static void g(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        a("pins/%s/comments/", s, baseapiresponsehandler, s1);
    }

    public static void h(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        c("pins/%s/", s, baseapiresponsehandler, s1);
    }

    static 
    {
        String s;
        if (Device.shouldLoadBigImages())
        {
            s = "pin.images[236x,736x,136x136]";
        } else
        {
            s = "pin.images[550x,90x90]";
        }
        a = s;
        b = (new StringBuilder(",")).append(a).toString();
    }

    private class _cls2 extends BackgroundTask
    {

        final Pin a;
        final ByteArrayInputStream b;

        public final void onFinish()
        {
            IOUtils.closeQuietly(b);
            super.onFinish();
        }

        public final void run()
        {
            String s = a.getCinematicSrc();
            GifDecoder gifdecoder = GifDecoder.instance((new StringBuilder("Cinematic")).append(s).toString());
            DiskCache.ensureDirectory("Cinematic");
            if (BooleanUtils.isFalse(Boolean.valueOf(DiskCache.cacheFileExists(s, "Cinematic"))))
            {
                gifdecoder.read(b);
            }
        }

        _cls2(Pin pin, ByteArrayInputStream bytearrayinputstream)
        {
            a = pin;
            b = bytearrayinputstream;
            super();
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final Pin a;
        private ByteArrayInputStream b;

        public final void onFinish()
        {
            IOUtils.closeQuietly(b);
            super.onFinish();
        }

        public final void run()
        {
            Response response;
            try
            {
                response = ApiHttpClient.cacheGifResponse(a.getCinematicSrc());
            }
            catch (IOException ioexception)
            {
                PLog.error(ioexception, "exception occurred", new Object[0]);
                return;
            }
            if (response == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            b = new ByteArrayInputStream(response.g().e());
            PinApi.a(a, b);
            return;
        }

        _cls1(Pin pin)
        {
            a = pin;
            super();
            b = null;
        }
    }


    private class PinDetailParams
    {

        public String a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public String g;

        public PinDetailParams()
        {
        }
    }


    private class PinSubmitParams
    {

        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public Bitmap g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;

        public static PinSubmitParams a(PinterestJsonObject pinterestjsonobject)
        {
            PinSubmitParams pinsubmitparams = new PinSubmitParams();
            try
            {
                pinsubmitparams.i = pinterestjsonobject.a("sdk_package_id", "");
                pinsubmitparams.j = pinterestjsonobject.a("sdk_client_id", "");
                pinsubmitparams.a = pinterestjsonobject.a("board_id", "");
                pinsubmitparams.b = pinterestjsonobject.a("summary", "");
                pinsubmitparams.e = pinterestjsonobject.a("share_facebook", 0);
                pinsubmitparams.f = pinterestjsonobject.a("share_twitter", 0);
                pinsubmitparams.c = pinterestjsonobject.a("source_url", "");
                pinsubmitparams.d = pinterestjsonobject.a("image_url", "");
                pinsubmitparams.k = pinterestjsonobject.a("place", "");
                pinsubmitparams.h = pinterestjsonobject.a("imageData", "");
                pinsubmitparams.l = pinterestjsonobject.a("method", "");
                pinsubmitparams.m = pinterestjsonobject.a("parent_csr_id", "");
            }
            // Misplaced declaration of an exception variable
            catch (PinterestJsonObject pinterestjsonobject)
            {
                PLog.error(pinterestjsonobject, "PinApi#fromJSON", new Object[0]);
                return pinsubmitparams;
            }
            return pinsubmitparams;
        }

        public final PinterestJsonObject a()
        {
            PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
            try
            {
                pinterestjsonobject.b("sdk_client_id", j);
                pinterestjsonobject.b("sdk_package_id", i);
                pinterestjsonobject.b("board_id", a);
                pinterestjsonobject.b("summary", b);
                pinterestjsonobject.b("source_url", c);
                pinterestjsonobject.b("image_url", d);
                pinterestjsonobject.b("share_facebook", String.valueOf(e));
                pinterestjsonobject.b("share_twitter", String.valueOf(f));
                pinterestjsonobject.b("place", k);
                pinterestjsonobject.b("method", l);
                pinterestjsonobject.b("parent_csr_id", m);
                if (g != null)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    g.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
                    bytearrayoutputstream.flush();
                    byte abyte0[] = bytearrayoutputstream.toByteArray();
                    bytearrayoutputstream.close();
                    pinterestjsonobject.b("imageData", Base64.encodeToString(abyte0, 0));
                }
            }
            catch (Exception exception)
            {
                PLog.error(exception, "exception occurred", new Object[0]);
                return pinterestjsonobject;
            }
            return pinterestjsonobject;
        }

        public PinSubmitParams()
        {
            a = "";
            b = "";
            c = "";
            d = "";
            e = 0;
            f = 0;
            g = null;
            h = "";
            i = "";
            j = "";
            k = "";
            l = "";
            m = "";
        }
    }


    private class CommentDeleteApiResponse extends ApiResponseHandler
    {

        protected String _commentUid;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            class _cls1 extends BackgroundTask
            {

                final CommentDeleteApiResponse a;

                public void run()
                {
                    com.pinterest.api.model.Comment comment = ModelHelper.getComment(a._commentUid);
                    ModelHelper.deletePinComment(a._commentUid);
                    Pinalytics.a(EventType.PIN_DELETE_COMMENT, a._commentUid);
                    Events.post(new com.pinterest.api.model.Comment.UpdateEvent(comment, true));
                }

                _cls1()
                {
                    a = CommentDeleteApiResponse.this;
                    super();
                }
            }

            (new _cls1()).execute();
        }

        public void setCommentUid(String s)
        {
            _commentUid = s;
        }

        protected CommentDeleteApiResponse()
        {
        }

        protected CommentDeleteApiResponse(int i)
        {
            super(i);
        }

        protected CommentDeleteApiResponse(boolean flag)
        {
            super(flag);
        }
    }

}

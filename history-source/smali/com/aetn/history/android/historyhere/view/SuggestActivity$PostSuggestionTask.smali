.class Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;
.super Landroid/os/AsyncTask;
.source "SuggestActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/view/SuggestActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PostSuggestionTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;


# direct methods
.method private constructor <init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;
    .param p2, "x1"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;

    .prologue
    .line 248
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;)Ljava/lang/Boolean;
    .locals 21
    .param p1, "data"    # [Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    .prologue
    .line 250
    move-object/from16 v0, p1

    array-length v4, v0

    .line 251
    .local v4, "count":I
    new-instance v17, Ljava/util/Date;

    invoke-direct/range {v17 .. v17}, Ljava/util/Date;-><init>()V

    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    move-result-wide v17

    const-wide/16 v19, 0x3e8

    div-long v17, v17, v19

    move-wide/from16 v0, v17

    long-to-float v0, v0

    move/from16 v17, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    move-result v15

    .line 252
    .local v15, "time":I
    const/16 v17, 0x0

    aget-object v9, p1, v17

    .line 253
    .local v9, "mData":Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    const-string v16, "/v1/suggestaplace/create?"

    .line 254
    .local v16, "urlPath":Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v17

    move-object/from16 v0, v17

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/model/Configuration;->suggestServiceHost:Ljava/lang/String;

    .line 255
    .local v14, "serviceURL":Ljava/lang/String;
    const-string v17, "hh_android_3"

    const-string v18, "nd78tYq6e4"

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-static {v14, v0, v1, v2, v15}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForSuggestAPlaceService(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    .line 256
    .local v7, "finalRequestString":Ljava/lang/String;
    const-string v17, "SuggestActivity"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "PostSuggestionTask():finalRequestString: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 258
    .local v3, "client":Lorg/apache/http/client/HttpClient;
    invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v17

    const/16 v18, 0x2710

    invoke-static/range {v17 .. v18}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 260
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 262
    .local v8, "json":Lorg/json/JSONObject;
    :try_start_0
    new-instance v10, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v10, v7}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 263
    .local v10, "post":Lorg/apache/http/client/methods/HttpPost;
    const-string v17, "lat"

    iget-wide v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lat:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    move-wide/from16 v1, v18

    invoke-virtual {v8, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 264
    const-string v17, "lng"

    iget-wide v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lat:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    move-wide/from16 v1, v18

    invoke-virtual {v8, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 265
    const-string v17, "placeName"

    iget-object v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->placeName:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 266
    const-string v17, "address"

    iget-object v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->address:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 267
    const-string v17, "city"

    iget-object v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->city:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 268
    const-string v17, "state"

    iget-object v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->state:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 269
    const-string v17, "zip"

    iget-object v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->zip:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 270
    const-string v17, "historicalSignificance"

    iget-object v0, v9, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->historicalSignificance:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 271
    new-instance v13, Lorg/apache/http/entity/StringEntity;

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-direct {v13, v0}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    .line 272
    .local v13, "se":Lorg/apache/http/entity/StringEntity;
    const-string v17, "SuggestActivity"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "PostSuggestionTask():json.toString(): "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    new-instance v17, Lorg/apache/http/message/BasicHeader;

    const-string v18, "Content-Type"

    const-string v19, "application/json"

    invoke-direct/range {v17 .. v19}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v17

    invoke-virtual {v13, v0}, Lorg/apache/http/entity/StringEntity;->setContentType(Lorg/apache/http/Header;)V

    .line 274
    invoke-virtual {v10, v13}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 275
    invoke-interface {v3, v10}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v11

    .line 278
    .local v11, "response":Lorg/apache/http/HttpResponse;
    if-eqz v11, :cond_1

    .line 279
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    .line 280
    .local v6, "entity":Lorg/apache/http/HttpEntity;
    const-string v17, "UTF-8"

    move-object/from16 v0, v17

    invoke-static {v6, v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 281
    .local v12, "responseString":Ljava/lang/String;
    const-string v17, "SuggestActivity"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "sendJson() response:"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 282
    const-string v17, "OK"

    move-object/from16 v0, v17

    invoke-virtual {v12, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v17

    const/16 v18, -0x1

    move/from16 v0, v17

    move/from16 v1, v18

    if-le v0, v1, :cond_0

    .line 283
    const-string v17, "SuggestActivity"

    const-string v18, "PostSuggestionTask():SUCCESS: "

    invoke-static/range {v17 .. v18}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const/16 v17, 0x1

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    .line 297
    .end local v6    # "entity":Lorg/apache/http/HttpEntity;
    .end local v10    # "post":Lorg/apache/http/client/methods/HttpPost;
    .end local v11    # "response":Lorg/apache/http/HttpResponse;
    .end local v12    # "responseString":Ljava/lang/String;
    .end local v13    # "se":Lorg/apache/http/entity/StringEntity;
    :goto_0
    return-object v17

    .line 286
    .restart local v6    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v10    # "post":Lorg/apache/http/client/methods/HttpPost;
    .restart local v11    # "response":Lorg/apache/http/HttpResponse;
    .restart local v12    # "responseString":Ljava/lang/String;
    .restart local v13    # "se":Lorg/apache/http/entity/StringEntity;
    :cond_0
    const-string v17, "SuggestActivity"

    const-string v18, "PostSuggestionTask():OOPS: "

    invoke-static/range {v17 .. v18}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v17

    goto :goto_0

    .line 291
    .end local v6    # "entity":Lorg/apache/http/HttpEntity;
    .end local v10    # "post":Lorg/apache/http/client/methods/HttpPost;
    .end local v11    # "response":Lorg/apache/http/HttpResponse;
    .end local v12    # "responseString":Ljava/lang/String;
    .end local v13    # "se":Lorg/apache/http/entity/StringEntity;
    :catch_0
    move-exception v5

    .line 292
    .local v5, "e":Ljava/lang/Exception;
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 293
    const-string v17, "SuggestActivity"

    const-string v18, "PostSuggestionTask():ERROR: "

    invoke-static/range {v17 .. v18}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    goto :goto_0

    .line 297
    .end local v5    # "e":Ljava/lang/Exception;
    .restart local v10    # "post":Lorg/apache/http/client/methods/HttpPost;
    .restart local v11    # "response":Lorg/apache/http/HttpResponse;
    .restart local v13    # "se":Lorg/apache/http/entity/StringEntity;
    :cond_1
    const/16 v17, 0x1

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    goto :goto_0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 248
    check-cast p1, [Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->doInBackground([Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 2
    .param p1, "result"    # Ljava/lang/Boolean;

    .prologue
    .line 305
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    const-string v0, "SuggestActivity"

    const-string v1, "PostSuggestionTask():onPostExecute:TRUE -- show success message: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # invokes: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setSuccessMessage()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$1300(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    .line 308
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$1400(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v0

    const-string v1, "Submit Suggestion"

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->tagEvent(Ljava/lang/String;)V

    .line 313
    :goto_0
    return-void

    .line 310
    :cond_0
    const-string v0, "SuggestActivity"

    const-string v1, "PostSuggestionTask():onPostExecute:TRUE -- show error message: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # invokes: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setGenericErrorMessage()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$1500(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 248
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "progress"    # [Ljava/lang/Integer;

    .prologue
    .line 302
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 248
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method

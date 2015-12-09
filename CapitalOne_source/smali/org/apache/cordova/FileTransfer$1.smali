.class Lorg/apache/cordova/FileTransfer$1;
.super Ljava/lang/Object;
.source "FileTransfer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/FileTransfer;->upload(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/FileTransfer;

.field final synthetic val$chunkedMode:Z

.field final synthetic val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

.field final synthetic val$fileKey:Ljava/lang/String;

.field final synthetic val$fileName:Ljava/lang/String;

.field final synthetic val$headers:Lorg/json/JSONObject;

.field final synthetic val$mimeType:Ljava/lang/String;

.field final synthetic val$objectId:Ljava/lang/String;

.field final synthetic val$params:Lorg/json/JSONObject;

.field final synthetic val$source:Ljava/lang/String;

.field final synthetic val$target:Ljava/lang/String;

.field final synthetic val$trustEveryone:Z

.field final synthetic val$url:Ljava/net/URL;

.field final synthetic val$useHttps:Z


# direct methods
.method constructor <init>(Lorg/apache/cordova/FileTransfer;Lorg/apache/cordova/FileTransfer$RequestContext;ZZLjava/net/URL;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lorg/apache/cordova/FileTransfer$1;->this$0:Lorg/apache/cordova/FileTransfer;

    iput-object p2, p0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    iput-boolean p3, p0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    iput-boolean p4, p0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    iput-object p5, p0, Lorg/apache/cordova/FileTransfer$1;->val$url:Ljava/net/URL;

    iput-object p6, p0, Lorg/apache/cordova/FileTransfer$1;->val$target:Ljava/lang/String;

    iput-object p7, p0, Lorg/apache/cordova/FileTransfer$1;->val$headers:Lorg/json/JSONObject;

    iput-object p8, p0, Lorg/apache/cordova/FileTransfer$1;->val$params:Lorg/json/JSONObject;

    iput-object p9, p0, Lorg/apache/cordova/FileTransfer$1;->val$fileKey:Ljava/lang/String;

    iput-object p10, p0, Lorg/apache/cordova/FileTransfer$1;->val$mimeType:Ljava/lang/String;

    iput-object p11, p0, Lorg/apache/cordova/FileTransfer$1;->val$fileName:Ljava/lang/String;

    iput-object p12, p0, Lorg/apache/cordova/FileTransfer$1;->val$source:Ljava/lang/String;

    iput-boolean p13, p0, Lorg/apache/cordova/FileTransfer$1;->val$chunkedMode:Z

    iput-object p14, p0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 47

    .prologue
    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    move/from16 v43, v0

    if-eqz v43, :cond_1

    .line 465
    :cond_0
    :goto_0
    return-void

    .line 215
    :cond_1
    const/4 v8, 0x0

    .line 216
    .local v8, "conn":Ljava/net/HttpURLConnection;
    const/16 v26, 0x0

    .line 217
    .local v26, "oldHostnameVerifier":Ljavax/net/ssl/HostnameVerifier;
    const/16 v27, 0x0

    .line 220
    .local v27, "oldSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    :try_start_0
    new-instance v35, Lorg/apache/cordova/FileUploadResult;

    invoke-direct/range {v35 .. v35}, Lorg/apache/cordova/FileUploadResult;-><init>()V

    .line 221
    .local v35, "result":Lorg/apache/cordova/FileUploadResult;
    new-instance v29, Lorg/apache/cordova/FileProgressResult;

    invoke-direct/range {v29 .. v29}, Lorg/apache/cordova/FileProgressResult;-><init>()V

    .line 225
    .local v29, "progress":Lorg/apache/cordova/FileProgressResult;
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_6

    .line 227
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-nez v43, :cond_5

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$url:Ljava/net/URL;

    move-object/from16 v43, v0

    invoke-virtual/range {v43 .. v43}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v43

    move-object/from16 v0, v43

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v8, v0

    .line 249
    :goto_1
    const/16 v43, 0x1

    move/from16 v0, v43

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 252
    const/16 v43, 0x1

    move/from16 v0, v43

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 255
    const/16 v43, 0x0

    move/from16 v0, v43

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 258
    const-string v43, "POST"

    move-object/from16 v0, v43

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 259
    const-string v43, "Connection"

    const-string v44, "Keep-Alive"

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-virtual {v8, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string v43, "Content-Type"

    const-string v44, "multipart/form-data;boundary=+++++"

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-virtual {v8, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$target:Ljava/lang/String;

    move-object/from16 v44, v0

    invoke-virtual/range {v43 .. v44}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 264
    .local v9, "cookie":Ljava/lang/String;
    if-eqz v9, :cond_2

    .line 265
    const-string v43, "Cookie"

    move-object/from16 v0, v43

    invoke-virtual {v8, v0, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$headers:Lorg/json/JSONObject;

    move-object/from16 v43, v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    if-eqz v43, :cond_7

    .line 271
    :try_start_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$headers:Lorg/json/JSONObject;

    move-object/from16 v43, v0

    invoke-virtual/range {v43 .. v43}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v23

    .local v23, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_3
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v43

    if-eqz v43, :cond_7

    .line 272
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v18

    .line 273
    .local v18, "headerKey":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$headers:Lorg/json/JSONObject;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v19

    .line 274
    .local v19, "headerValues":Lorg/json/JSONArray;
    if-nez v19, :cond_4

    .line 275
    new-instance v19, Lorg/json/JSONArray;

    .end local v19    # "headerValues":Lorg/json/JSONArray;
    invoke-direct/range {v19 .. v19}, Lorg/json/JSONArray;-><init>()V

    .line 276
    .restart local v19    # "headerValues":Lorg/json/JSONArray;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$headers:Lorg/json/JSONObject;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    move-object/from16 v0, v19

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 278
    :cond_4
    const/16 v43, 0x0

    move-object/from16 v0, v19

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v43

    move-object/from16 v0, v18

    move-object/from16 v1, v43

    invoke-virtual {v8, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const/16 v21, 0x1

    .local v21, "i":I
    :goto_2
    invoke-virtual/range {v19 .. v19}, Lorg/json/JSONArray;->length()I

    move-result v43

    move/from16 v0, v21

    move/from16 v1, v43

    if-ge v0, v1, :cond_3

    .line 280
    move-object/from16 v0, v19

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v43

    move-object/from16 v0, v18

    move-object/from16 v1, v43

    invoke-virtual {v8, v0, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    .line 279
    add-int/lit8 v21, v21, 0x1

    goto :goto_2

    .line 234
    .end local v9    # "cookie":Ljava/lang/String;
    .end local v18    # "headerKey":Ljava/lang/String;
    .end local v19    # "headerValues":Lorg/json/JSONArray;
    .end local v21    # "i":I
    .end local v23    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_5
    :try_start_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$url:Ljava/net/URL;

    move-object/from16 v43, v0

    invoke-virtual/range {v43 .. v43}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v20

    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 235
    .local v20, "https":Ljavax/net/ssl/HttpsURLConnection;
    # invokes: Lorg/apache/cordova/FileTransfer;->trustAllHosts(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;
    invoke-static/range {v20 .. v20}, Lorg/apache/cordova/FileTransfer;->access$000(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v27

    .line 237
    invoke-virtual/range {v20 .. v20}, Ljavax/net/ssl/HttpsURLConnection;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v26

    .line 239
    # getter for: Lorg/apache/cordova/FileTransfer;->DO_NOT_VERIFY:Ljavax/net/ssl/HostnameVerifier;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$100()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v43

    move-object/from16 v0, v20

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 240
    move-object/from16 v8, v20

    .line 241
    goto/16 :goto_1

    .line 245
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$url:Ljava/net/URL;

    move-object/from16 v43, v0

    invoke-virtual/range {v43 .. v43}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v43

    move-object/from16 v0, v43

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v8, v0

    goto/16 :goto_1

    .line 283
    .restart local v9    # "cookie":Ljava/lang/String;
    :catch_0
    move-exception v43

    .line 292
    :cond_7
    const-string v15, ""
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    .line 294
    .local v15, "extraParams":Ljava/lang/String;
    :try_start_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$params:Lorg/json/JSONObject;

    move-object/from16 v43, v0

    invoke-virtual/range {v43 .. v43}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v23

    .restart local v23    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_8
    :goto_3
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v43

    if-eqz v43, :cond_9

    .line 295
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    .line 296
    .local v24, "key":Ljava/lang/Object;
    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v43

    const-string v44, "headers"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v43

    if-nez v43, :cond_8

    .line 298
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "--+++++\r\n"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 299
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "Content-Disposition: form-data; name=\""

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v44

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "\";"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 300
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "\r\n\r\n"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 301
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$params:Lorg/json/JSONObject;

    move-object/from16 v44, v0

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v45

    invoke-virtual/range {v44 .. v45}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 302
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "\r\n"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    move-result-object v15

    goto/16 :goto_3

    .line 305
    .end local v23    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v24    # "key":Ljava/lang/Object;
    :catch_1
    move-exception v12

    .line 306
    .local v12, "e":Lorg/json/JSONException;
    :try_start_4
    const-string v43, "FileTransfer"

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v44

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-static {v0, v1, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 309
    .end local v12    # "e":Lorg/json/JSONException;
    :cond_9
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "--+++++\r\n"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 310
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "Content-Disposition: form-data; name=\""

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$fileKey:Ljava/lang/String;

    move-object/from16 v44, v0

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "\";"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, " filename=\""

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 311
    const-string v43, "UTF-8"

    move-object/from16 v0, v43

    invoke-virtual {v15, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v14

    .line 313
    .local v14, "extraBytes":[B
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    const-string v44, "\"\r\nContent-Type: "

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$mimeType:Ljava/lang/String;

    move-object/from16 v44, v0

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "\r\n"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    const-string v44, "\r\n"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    .line 314
    .local v25, "midParams":Ljava/lang/String;
    const-string v39, "\r\n--+++++--\r\n"

    .line 315
    .local v39, "tailParams":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$fileName:Ljava/lang/String;

    move-object/from16 v43, v0

    const-string v44, "UTF-8"

    invoke-virtual/range {v43 .. v44}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v16

    .line 319
    .local v16, "fileNameBytes":[B
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->this$0:Lorg/apache/cordova/FileTransfer;

    move-object/from16 v43, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$source:Ljava/lang/String;

    move-object/from16 v44, v0

    # invokes: Lorg/apache/cordova/FileTransfer;->getPathFromUri(Ljava/lang/String;)Ljava/io/InputStream;
    invoke-static/range {v43 .. v44}, Lorg/apache/cordova/FileTransfer;->access$200(Lorg/apache/cordova/FileTransfer;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v36

    .line 321
    .local v36, "sourceInputStream":Ljava/io/InputStream;
    array-length v0, v14

    move/from16 v43, v0

    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v44

    add-int v43, v43, v44

    invoke-virtual/range {v39 .. v39}, Ljava/lang/String;->length()I

    move-result v44

    add-int v43, v43, v44

    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v44, v0

    add-int v37, v43, v44

    .line 322
    .local v37, "stringLength":I
    const-string v43, "FileTransfer"

    new-instance v44, Ljava/lang/StringBuilder;

    invoke-direct/range {v44 .. v44}, Ljava/lang/StringBuilder;-><init>()V

    const-string v45, "String Length: "

    invoke-virtual/range {v44 .. v45}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v44

    move-object/from16 v0, v44

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v44

    invoke-virtual/range {v44 .. v44}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v44

    invoke-static/range {v43 .. v44}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 323
    const/16 v17, -0x1

    .line 324
    .local v17, "fixedLength":I
    move-object/from16 v0, v36

    instance-of v0, v0, Ljava/io/FileInputStream;

    move/from16 v43, v0

    if-eqz v43, :cond_a

    .line 325
    move-object/from16 v0, v36

    check-cast v0, Ljava/io/FileInputStream;

    move-object/from16 v43, v0

    invoke-virtual/range {v43 .. v43}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v43

    invoke-virtual/range {v43 .. v43}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v44

    move-wide/from16 v0, v44

    long-to-int v0, v0

    move/from16 v43, v0

    add-int v17, v43, v37

    .line 326
    const/16 v43, 0x1

    move-object/from16 v0, v29

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Lorg/apache/cordova/FileProgressResult;->setLengthComputable(Z)V

    .line 327
    move/from16 v0, v17

    int-to-long v0, v0

    move-wide/from16 v44, v0

    move-object/from16 v0, v29

    move-wide/from16 v1, v44

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/FileProgressResult;->setTotal(J)V

    .line 329
    :cond_a
    const-string v43, "FileTransfer"

    new-instance v44, Ljava/lang/StringBuilder;

    invoke-direct/range {v44 .. v44}, Ljava/lang/StringBuilder;-><init>()V

    const-string v45, "Content Length: "

    invoke-virtual/range {v44 .. v45}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v44

    move-object/from16 v0, v44

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v44

    invoke-virtual/range {v44 .. v44}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v44

    invoke-static/range {v43 .. v44}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$chunkedMode:Z

    move/from16 v43, v0

    if-eqz v43, :cond_e

    sget v43, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v44, 0x8

    move/from16 v0, v43

    move/from16 v1, v44

    if-lt v0, v1, :cond_b

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_e

    :cond_b
    const/16 v42, 0x1

    .line 334
    .local v42, "useChunkedMode":Z
    :goto_4
    if-nez v42, :cond_c

    const/16 v43, -0x1

    move/from16 v0, v17

    move/from16 v1, v43

    if-ne v0, v1, :cond_f

    :cond_c
    const/16 v42, 0x1

    .line 336
    :goto_5
    if-eqz v42, :cond_10

    .line 337
    const/16 v43, 0x4000

    move/from16 v0, v43

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 340
    const-string v43, "Transfer-Encoding"

    const-string v44, "chunked"

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-virtual {v8, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_b

    .line 345
    :goto_6
    const/4 v10, 0x0

    .line 347
    .local v10, "dos":Ljava/io/DataOutputStream;
    :try_start_5
    new-instance v11, Ljava/io/DataOutputStream;

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v43

    move-object/from16 v0, v43

    invoke-direct {v11, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    .line 348
    .end local v10    # "dos":Ljava/io/DataOutputStream;
    .local v11, "dos":Ljava/io/DataOutputStream;
    :try_start_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v44, v0

    monitor-enter v44
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 349
    :try_start_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    move/from16 v43, v0

    if-eqz v43, :cond_12

    .line 350
    monitor-exit v44
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 392
    :try_start_8
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v36 .. v36}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 393
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v11}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_9
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_d

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_d

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_d
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 333
    .end local v11    # "dos":Ljava/io/DataOutputStream;
    .end local v42    # "useChunkedMode":Z
    :cond_e
    const/16 v42, 0x0

    goto/16 :goto_4

    .line 334
    .restart local v42    # "useChunkedMode":Z
    :cond_f
    const/16 v42, 0x0

    goto/16 :goto_5

    .line 342
    :cond_10
    :try_start_a
    move/from16 v0, v17

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_a
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    goto :goto_6

    .line 432
    .end local v9    # "cookie":Ljava/lang/String;
    .end local v14    # "extraBytes":[B
    .end local v15    # "extraParams":Ljava/lang/String;
    .end local v16    # "fileNameBytes":[B
    .end local v17    # "fixedLength":I
    .end local v25    # "midParams":Ljava/lang/String;
    .end local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .end local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .end local v36    # "sourceInputStream":Ljava/io/InputStream;
    .end local v37    # "stringLength":I
    .end local v39    # "tailParams":Ljava/lang/String;
    .end local v42    # "useChunkedMode":Z
    :catch_2
    move-exception v12

    .line 433
    .local v12, "e":Ljava/io/FileNotFoundException;
    :try_start_b
    sget v43, Lorg/apache/cordova/FileTransfer;->FILE_NOT_FOUND_ERR:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$source:Ljava/lang/String;

    move-object/from16 v44, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$target:Ljava/lang/String;

    move-object/from16 v45, v0

    move/from16 v0, v43

    move-object/from16 v1, v44

    move-object/from16 v2, v45

    # invokes: Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    invoke-static {v0, v1, v2, v8}, Lorg/apache/cordova/FileTransfer;->access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v13

    .line 434
    .local v13, "error":Lorg/json/JSONObject;
    const-string v43, "FileTransfer"

    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v44

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-static {v0, v1, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 435
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    new-instance v44, Lorg/apache/cordova/api/PluginResult;

    sget-object v45, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v44

    move-object/from16 v1, v45

    invoke-direct {v0, v1, v13}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v43 .. v44}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_c
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_11

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_11

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_11
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 451
    .end local v12    # "e":Ljava/io/FileNotFoundException;
    .end local v13    # "error":Lorg/json/JSONObject;
    .restart local v9    # "cookie":Ljava/lang/String;
    .restart local v11    # "dos":Ljava/io/DataOutputStream;
    .restart local v14    # "extraBytes":[B
    .restart local v15    # "extraParams":Ljava/lang/String;
    .restart local v16    # "fileNameBytes":[B
    .restart local v17    # "fixedLength":I
    .restart local v25    # "midParams":Ljava/lang/String;
    .restart local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .restart local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .restart local v36    # "sourceInputStream":Ljava/io/InputStream;
    .restart local v37    # "stringLength":I
    .restart local v39    # "tailParams":Ljava/lang/String;
    .restart local v42    # "useChunkedMode":Z
    :catchall_0
    move-exception v43

    :try_start_d
    monitor-exit v44
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    throw v43

    .line 352
    :cond_12
    :try_start_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    iput-object v11, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->currentOutputStream:Ljava/io/OutputStream;

    .line 353
    monitor-exit v44
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 355
    :try_start_f
    invoke-virtual {v11, v14}, Ljava/io/DataOutputStream;->write([B)V

    .line 356
    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 357
    move-object/from16 v0, v25

    invoke-virtual {v11, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 360
    invoke-virtual/range {v36 .. v36}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 361
    .local v6, "bytesAvailable":I
    const/16 v43, 0x4000

    move/from16 v0, v43

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 362
    .local v5, "bufferSize":I
    new-array v4, v5, [B

    .line 365
    .local v4, "buffer":[B
    const/16 v43, 0x0

    move-object/from16 v0, v36

    move/from16 v1, v43

    invoke-virtual {v0, v4, v1, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    .line 366
    .local v7, "bytesRead":I
    const-wide/16 v40, 0x0

    .line 368
    .local v40, "totalBytes":J
    const-wide/16 v30, 0x0

    .line 369
    .local v30, "prevBytesRead":J
    :goto_7
    if-lez v7, :cond_15

    .line 370
    int-to-long v0, v7

    move-wide/from16 v44, v0

    add-long v40, v40, v44

    .line 371
    move-object/from16 v0, v35

    move-wide/from16 v1, v40

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/FileUploadResult;->setBytesSent(J)V

    .line 372
    const/16 v43, 0x0

    move/from16 v0, v43

    invoke-virtual {v11, v4, v0, v5}, Ljava/io/DataOutputStream;->write([BII)V

    .line 373
    const-wide/32 v44, 0x19000

    add-long v44, v44, v30

    cmp-long v43, v40, v44

    if-lez v43, :cond_13

    .line 374
    move-wide/from16 v30, v40

    .line 375
    const-string v43, "FileTransfer"

    new-instance v44, Ljava/lang/StringBuilder;

    invoke-direct/range {v44 .. v44}, Ljava/lang/StringBuilder;-><init>()V

    const-string v45, "Uploaded "

    invoke-virtual/range {v44 .. v45}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v44

    move-object/from16 v0, v44

    move-wide/from16 v1, v40

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v44

    const-string v45, " of "

    invoke-virtual/range {v44 .. v45}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v44

    move-object/from16 v0, v44

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v44

    const-string v45, " bytes"

    invoke-virtual/range {v44 .. v45}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v44

    invoke-virtual/range {v44 .. v44}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v44

    invoke-static/range {v43 .. v44}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    :cond_13
    invoke-virtual/range {v36 .. v36}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 378
    const/16 v43, 0x4000

    move/from16 v0, v43

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 379
    const/16 v43, 0x0

    move-object/from16 v0, v36

    move/from16 v1, v43

    invoke-virtual {v0, v4, v1, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    .line 382
    move-object/from16 v0, v29

    move-wide/from16 v1, v40

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/FileProgressResult;->setLoaded(J)V

    .line 383
    new-instance v32, Lorg/apache/cordova/api/PluginResult;

    sget-object v43, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual/range {v29 .. v29}, Lorg/apache/cordova/FileProgressResult;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v44

    move-object/from16 v0, v32

    move-object/from16 v1, v43

    move-object/from16 v2, v44

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 384
    .local v32, "progressResult":Lorg/apache/cordova/api/PluginResult;
    const/16 v43, 0x1

    move-object/from16 v0, v32

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 385
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto/16 :goto_7

    .line 392
    .end local v4    # "buffer":[B
    .end local v5    # "bufferSize":I
    .end local v6    # "bytesAvailable":I
    .end local v7    # "bytesRead":I
    .end local v30    # "prevBytesRead":J
    .end local v32    # "progressResult":Lorg/apache/cordova/api/PluginResult;
    .end local v40    # "totalBytes":J
    :catchall_1
    move-exception v43

    move-object v10, v11

    .end local v11    # "dos":Ljava/io/DataOutputStream;
    .restart local v10    # "dos":Ljava/io/DataOutputStream;
    :goto_8
    :try_start_10
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v36 .. v36}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 393
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v10}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    throw v43
    :try_end_10
    .catch Ljava/io/FileNotFoundException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 436
    .end local v9    # "cookie":Ljava/lang/String;
    .end local v10    # "dos":Ljava/io/DataOutputStream;
    .end local v14    # "extraBytes":[B
    .end local v15    # "extraParams":Ljava/lang/String;
    .end local v16    # "fileNameBytes":[B
    .end local v17    # "fixedLength":I
    .end local v25    # "midParams":Ljava/lang/String;
    .end local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .end local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .end local v36    # "sourceInputStream":Ljava/io/InputStream;
    .end local v37    # "stringLength":I
    .end local v39    # "tailParams":Ljava/lang/String;
    .end local v42    # "useChunkedMode":Z
    :catch_3
    move-exception v12

    .line 437
    .local v12, "e":Ljava/io/IOException;
    :try_start_11
    sget v43, Lorg/apache/cordova/FileTransfer;->CONNECTION_ERR:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$source:Ljava/lang/String;

    move-object/from16 v44, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$target:Ljava/lang/String;

    move-object/from16 v45, v0

    move/from16 v0, v43

    move-object/from16 v1, v44

    move-object/from16 v2, v45

    # invokes: Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    invoke-static {v0, v1, v2, v8}, Lorg/apache/cordova/FileTransfer;->access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v13

    .line 438
    .restart local v13    # "error":Lorg/json/JSONObject;
    const-string v43, "FileTransfer"

    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v44

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-static {v0, v1, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 439
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    new-instance v44, Lorg/apache/cordova/api/PluginResult;

    sget-object v45, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v44

    move-object/from16 v1, v45

    invoke-direct {v0, v1, v13}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v43 .. v44}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_12
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_14

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_14

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_14
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 353
    .end local v12    # "e":Ljava/io/IOException;
    .end local v13    # "error":Lorg/json/JSONObject;
    .restart local v9    # "cookie":Ljava/lang/String;
    .restart local v11    # "dos":Ljava/io/DataOutputStream;
    .restart local v14    # "extraBytes":[B
    .restart local v15    # "extraParams":Ljava/lang/String;
    .restart local v16    # "fileNameBytes":[B
    .restart local v17    # "fixedLength":I
    .restart local v25    # "midParams":Ljava/lang/String;
    .restart local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .restart local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .restart local v36    # "sourceInputStream":Ljava/io/InputStream;
    .restart local v37    # "stringLength":I
    .restart local v39    # "tailParams":Ljava/lang/String;
    .restart local v42    # "useChunkedMode":Z
    :catchall_2
    move-exception v43

    :try_start_13
    monitor-exit v44
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    :try_start_14
    throw v43

    .line 389
    .restart local v4    # "buffer":[B
    .restart local v5    # "bufferSize":I
    .restart local v6    # "bytesAvailable":I
    .restart local v7    # "bytesRead":I
    .restart local v30    # "prevBytesRead":J
    .restart local v40    # "totalBytes":J
    :cond_15
    move-object/from16 v0, v39

    invoke-virtual {v11, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 390
    invoke-virtual {v11}, Ljava/io/DataOutputStream;->flush()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 392
    :try_start_15
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v36 .. v36}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 393
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v11}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 395
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    const/16 v44, 0x0

    move-object/from16 v0, v44

    move-object/from16 v1, v43

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentOutputStream:Ljava/io/OutputStream;

    .line 399
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_15
    .catch Ljava/io/FileNotFoundException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_3
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_5
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    move-result v33

    .line 400
    .local v33, "responseCode":I
    const/16 v22, 0x0

    .line 402
    .local v22, "inStream":Ljava/io/InputStream;
    :try_start_16
    # invokes: Lorg/apache/cordova/FileTransfer;->getInputStream(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    invoke-static {v8}, Lorg/apache/cordova/FileTransfer;->access$400(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v22

    .line 403
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v44, v0

    monitor-enter v44
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 404
    :try_start_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    move-object/from16 v0, v43

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    move/from16 v43, v0

    if-eqz v43, :cond_17

    .line 405
    monitor-exit v44
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    .line 420
    :try_start_18
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    const/16 v44, 0x0

    move-object/from16 v0, v44

    move-object/from16 v1, v43

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 421
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v22 .. v22}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V
    :try_end_18
    .catch Ljava/io/FileNotFoundException; {:try_start_18 .. :try_end_18} :catch_2
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_3
    .catch Lorg/json/JSONException; {:try_start_18 .. :try_end_18} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_18} :catch_5
    .catchall {:try_start_18 .. :try_end_18} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_19
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_16

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_16

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_16
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 451
    :catchall_3
    move-exception v43

    :try_start_1a
    monitor-exit v44
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    throw v43

    .line 407
    :cond_17
    :try_start_1b
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v43

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 408
    monitor-exit v44
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_5

    .line 411
    :try_start_1c
    new-instance v28, Ljava/io/ByteArrayOutputStream;

    invoke-direct/range {v28 .. v28}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 412
    .local v28, "out":Ljava/io/ByteArrayOutputStream;
    const/16 v43, 0x400

    move/from16 v0, v43

    new-array v4, v0, [B

    .line 413
    const/4 v7, 0x0

    .line 415
    :goto_9
    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-lez v7, :cond_19

    .line 416
    const/16 v43, 0x0

    move-object/from16 v0, v28

    move/from16 v1, v43

    invoke-virtual {v0, v4, v1, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    goto :goto_9

    .line 420
    .end local v28    # "out":Ljava/io/ByteArrayOutputStream;
    :catchall_4
    move-exception v43

    :try_start_1d
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v44, v0

    const/16 v45, 0x0

    move-object/from16 v0, v45

    move-object/from16 v1, v44

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 421
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v22 .. v22}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    throw v43
    :try_end_1d
    .catch Ljava/io/FileNotFoundException; {:try_start_1d .. :try_end_1d} :catch_2
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_3
    .catch Lorg/json/JSONException; {:try_start_1d .. :try_end_1d} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_1d} :catch_5
    .catchall {:try_start_1d .. :try_end_1d} :catchall_b

    .line 440
    .end local v4    # "buffer":[B
    .end local v5    # "bufferSize":I
    .end local v6    # "bytesAvailable":I
    .end local v7    # "bytesRead":I
    .end local v9    # "cookie":Ljava/lang/String;
    .end local v11    # "dos":Ljava/io/DataOutputStream;
    .end local v14    # "extraBytes":[B
    .end local v15    # "extraParams":Ljava/lang/String;
    .end local v16    # "fileNameBytes":[B
    .end local v17    # "fixedLength":I
    .end local v22    # "inStream":Ljava/io/InputStream;
    .end local v25    # "midParams":Ljava/lang/String;
    .end local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .end local v30    # "prevBytesRead":J
    .end local v33    # "responseCode":I
    .end local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .end local v36    # "sourceInputStream":Ljava/io/InputStream;
    .end local v37    # "stringLength":I
    .end local v39    # "tailParams":Ljava/lang/String;
    .end local v40    # "totalBytes":J
    .end local v42    # "useChunkedMode":Z
    :catch_4
    move-exception v12

    .line 441
    .local v12, "e":Lorg/json/JSONException;
    :try_start_1e
    const-string v43, "FileTransfer"

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v44

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    invoke-static {v0, v1, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 442
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    new-instance v44, Lorg/apache/cordova/api/PluginResult;

    sget-object v45, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct/range {v44 .. v45}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    invoke-virtual/range {v43 .. v44}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_1f
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_9

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_18

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_18

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_18
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 408
    .end local v12    # "e":Lorg/json/JSONException;
    .restart local v4    # "buffer":[B
    .restart local v5    # "bufferSize":I
    .restart local v6    # "bytesAvailable":I
    .restart local v7    # "bytesRead":I
    .restart local v9    # "cookie":Ljava/lang/String;
    .restart local v11    # "dos":Ljava/io/DataOutputStream;
    .restart local v14    # "extraBytes":[B
    .restart local v15    # "extraParams":Ljava/lang/String;
    .restart local v16    # "fileNameBytes":[B
    .restart local v17    # "fixedLength":I
    .restart local v22    # "inStream":Ljava/io/InputStream;
    .restart local v25    # "midParams":Ljava/lang/String;
    .restart local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .restart local v30    # "prevBytesRead":J
    .restart local v33    # "responseCode":I
    .restart local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .restart local v36    # "sourceInputStream":Ljava/io/InputStream;
    .restart local v37    # "stringLength":I
    .restart local v39    # "tailParams":Ljava/lang/String;
    .restart local v40    # "totalBytes":J
    .restart local v42    # "useChunkedMode":Z
    :catchall_5
    move-exception v43

    :try_start_20
    monitor-exit v44
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_5

    :try_start_21
    throw v43

    .line 418
    .restart local v28    # "out":Ljava/io/ByteArrayOutputStream;
    :cond_19
    const-string v43, "UTF-8"

    move-object/from16 v0, v28

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_4

    move-result-object v34

    .line 420
    .local v34, "responseString":Ljava/lang/String;
    :try_start_22
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    const/16 v44, 0x0

    move-object/from16 v0, v44

    move-object/from16 v1, v43

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 421
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v22 .. v22}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 424
    const-string v43, "FileTransfer"

    const-string v44, "got response from server"

    invoke-static/range {v43 .. v44}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 425
    const-string v43, "FileTransfer"

    const/16 v44, 0x0

    const/16 v45, 0x100

    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v46

    invoke-static/range {v45 .. v46}, Ljava/lang/Math;->min(II)I

    move-result v45

    move-object/from16 v0, v34

    move/from16 v1, v44

    move/from16 v2, v45

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v44

    invoke-static/range {v43 .. v44}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 428
    move-object/from16 v0, v35

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/FileUploadResult;->setResponseCode(I)V

    .line 429
    move-object/from16 v0, v35

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Lorg/apache/cordova/FileUploadResult;->setResponse(Ljava/lang/String;)V

    .line 431
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    new-instance v44, Lorg/apache/cordova/api/PluginResult;

    sget-object v45, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual/range {v35 .. v35}, Lorg/apache/cordova/FileUploadResult;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v46

    invoke-direct/range {v44 .. v46}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v43 .. v44}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_22
    .catch Ljava/io/FileNotFoundException; {:try_start_22 .. :try_end_22} :catch_2
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_3
    .catch Lorg/json/JSONException; {:try_start_22 .. :try_end_22} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_22 .. :try_end_22} :catch_5
    .catchall {:try_start_22 .. :try_end_22} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_23
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_6

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_1a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_1a

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_1a
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 451
    :catchall_6
    move-exception v43

    :try_start_24
    monitor-exit v44
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_6

    throw v43

    .end local v4    # "buffer":[B
    .end local v5    # "bufferSize":I
    .end local v6    # "bytesAvailable":I
    .end local v7    # "bytesRead":I
    .end local v9    # "cookie":Ljava/lang/String;
    .end local v11    # "dos":Ljava/io/DataOutputStream;
    .end local v14    # "extraBytes":[B
    .end local v15    # "extraParams":Ljava/lang/String;
    .end local v16    # "fileNameBytes":[B
    .end local v17    # "fixedLength":I
    .end local v22    # "inStream":Ljava/io/InputStream;
    .end local v25    # "midParams":Ljava/lang/String;
    .end local v28    # "out":Ljava/io/ByteArrayOutputStream;
    .end local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .end local v30    # "prevBytesRead":J
    .end local v33    # "responseCode":I
    .end local v34    # "responseString":Ljava/lang/String;
    .end local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .end local v36    # "sourceInputStream":Ljava/io/InputStream;
    .end local v37    # "stringLength":I
    .end local v39    # "tailParams":Ljava/lang/String;
    .end local v40    # "totalBytes":J
    .end local v42    # "useChunkedMode":Z
    .local v12, "e":Ljava/io/FileNotFoundException;
    .restart local v13    # "error":Lorg/json/JSONObject;
    :catchall_7
    move-exception v43

    :try_start_25
    monitor-exit v44
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    throw v43

    .local v12, "e":Ljava/io/IOException;
    :catchall_8
    move-exception v43

    :try_start_26
    monitor-exit v44
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_8

    throw v43

    .end local v13    # "error":Lorg/json/JSONObject;
    .local v12, "e":Lorg/json/JSONException;
    :catchall_9
    move-exception v43

    :try_start_27
    monitor-exit v44
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_9

    throw v43

    .line 443
    .end local v12    # "e":Lorg/json/JSONException;
    :catch_5
    move-exception v38

    .line 445
    .local v38, "t":Ljava/lang/Throwable;
    :try_start_28
    sget v43, Lorg/apache/cordova/FileTransfer;->CONNECTION_ERR:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$source:Ljava/lang/String;

    move-object/from16 v44, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$target:Ljava/lang/String;

    move-object/from16 v45, v0

    move/from16 v0, v43

    move-object/from16 v1, v44

    move-object/from16 v2, v45

    # invokes: Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    invoke-static {v0, v1, v2, v8}, Lorg/apache/cordova/FileTransfer;->access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v13

    .line 446
    .restart local v13    # "error":Lorg/json/JSONObject;
    const-string v43, "FileTransfer"

    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v44

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    move-object/from16 v2, v38

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 447
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v43, v0

    new-instance v44, Lorg/apache/cordova/api/PluginResult;

    sget-object v45, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v44

    move-object/from16 v1, v45

    invoke-direct {v0, v1, v13}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v43 .. v44}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_b

    .line 449
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_29
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v43

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v0, v43

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_a

    .line 453
    if-eqz v8, :cond_0

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v43, v0

    if-eqz v43, :cond_1b

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v43, v0

    if-eqz v43, :cond_1b

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_1b
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 451
    :catchall_a
    move-exception v43

    :try_start_2a
    monitor-exit v44
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_a

    throw v43

    .line 449
    .end local v13    # "error":Lorg/json/JSONObject;
    .end local v38    # "t":Ljava/lang/Throwable;
    :catchall_b
    move-exception v43

    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v44

    monitor-enter v44

    .line 450
    :try_start_2b
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v45

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$objectId:Ljava/lang/String;

    move-object/from16 v46, v0

    invoke-virtual/range {v45 .. v46}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    monitor-exit v44
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_c

    .line 453
    if-eqz v8, :cond_1d

    .line 456
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$trustEveryone:Z

    move/from16 v44, v0

    if-eqz v44, :cond_1c

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$1;->val$useHttps:Z

    move/from16 v44, v0

    if-eqz v44, :cond_1c

    move-object/from16 v20, v8

    .line 457
    check-cast v20, Ljavax/net/ssl/HttpsURLConnection;

    .line 458
    .restart local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 459
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 462
    .end local v20    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_1c
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1d
    throw v43

    .line 451
    :catchall_c
    move-exception v43

    :try_start_2c
    monitor-exit v44
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_c

    throw v43

    .line 392
    .restart local v9    # "cookie":Ljava/lang/String;
    .restart local v10    # "dos":Ljava/io/DataOutputStream;
    .restart local v14    # "extraBytes":[B
    .restart local v15    # "extraParams":Ljava/lang/String;
    .restart local v16    # "fileNameBytes":[B
    .restart local v17    # "fixedLength":I
    .restart local v25    # "midParams":Ljava/lang/String;
    .restart local v29    # "progress":Lorg/apache/cordova/FileProgressResult;
    .restart local v35    # "result":Lorg/apache/cordova/FileUploadResult;
    .restart local v36    # "sourceInputStream":Ljava/io/InputStream;
    .restart local v37    # "stringLength":I
    .restart local v39    # "tailParams":Ljava/lang/String;
    .restart local v42    # "useChunkedMode":Z
    :catchall_d
    move-exception v43

    goto/16 :goto_8
.end method

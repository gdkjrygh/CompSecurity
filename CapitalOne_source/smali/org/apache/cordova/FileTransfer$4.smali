.class Lorg/apache/cordova/FileTransfer$4;
.super Ljava/lang/Object;
.source "FileTransfer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/FileTransfer;->download(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/FileTransfer;

.field final synthetic val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

.field final synthetic val$objectId:Ljava/lang/String;

.field final synthetic val$source:Ljava/lang/String;

.field final synthetic val$target:Ljava/lang/String;

.field final synthetic val$trustEveryone:Z

.field final synthetic val$url:Ljava/net/URL;

.field final synthetic val$useHttps:Z


# direct methods
.method constructor <init>(Lorg/apache/cordova/FileTransfer;Lorg/apache/cordova/FileTransfer$RequestContext;Ljava/lang/String;ZZLjava/net/URL;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 619
    iput-object p1, p0, Lorg/apache/cordova/FileTransfer$4;->this$0:Lorg/apache/cordova/FileTransfer;

    iput-object p2, p0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    iput-object p3, p0, Lorg/apache/cordova/FileTransfer$4;->val$target:Ljava/lang/String;

    iput-boolean p4, p0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    iput-boolean p5, p0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    iput-object p6, p0, Lorg/apache/cordova/FileTransfer$4;->val$url:Ljava/net/URL;

    iput-object p7, p0, Lorg/apache/cordova/FileTransfer$4;->val$source:Ljava/lang/String;

    iput-object p8, p0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 26

    .prologue
    .line 621
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    move/from16 v22, v0

    if-eqz v22, :cond_1

    .line 748
    :cond_0
    :goto_0
    return-void

    .line 624
    :cond_1
    const/4 v6, 0x0

    .line 625
    .local v6, "connection":Ljava/net/HttpURLConnection;
    const/4 v15, 0x0

    .line 626
    .local v15, "oldHostnameVerifier":Ljavax/net/ssl/HostnameVerifier;
    const/16 v16, 0x0

    .line 631
    .local v16, "oldSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->this$0:Lorg/apache/cordova/FileTransfer;

    move-object/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$target:Ljava/lang/String;

    move-object/from16 v23, v0

    # invokes: Lorg/apache/cordova/FileTransfer;->getFileFromPath(Ljava/lang/String;)Ljava/io/File;
    invoke-static/range {v22 .. v23}, Lorg/apache/cordova/FileTransfer;->access$700(Lorg/apache/cordova/FileTransfer;Ljava/lang/String;)Ljava/io/File;

    move-result-object v10

    .line 632
    .local v10, "file":Ljava/io/File;
    invoke-virtual {v10}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->mkdirs()Z

    .line 636
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_6

    .line 638
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-nez v22, :cond_5

    .line 639
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$url:Ljava/net/URL;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v22

    move-object/from16 v0, v22

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v6, v0

    .line 659
    :goto_1
    const-string v22, "GET"

    move-object/from16 v0, v22

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 662
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$source:Ljava/lang/String;

    move-object/from16 v23, v0

    invoke-virtual/range {v22 .. v23}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 663
    .local v7, "cookie":Ljava/lang/String;
    if-eqz v7, :cond_2

    .line 665
    const-string v22, "cookie"

    move-object/from16 v0, v22

    invoke-virtual {v6, v0, v7}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 668
    :cond_2
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 670
    const-string v22, "FileTransfer"

    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    const-string v24, "Download file:"

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$url:Ljava/net/URL;

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 672
    new-instance v18, Lorg/apache/cordova/FileProgressResult;

    invoke-direct/range {v18 .. v18}, Lorg/apache/cordova/FileProgressResult;-><init>()V

    .line 673
    .local v18, "progress":Lorg/apache/cordova/FileProgressResult;
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v22

    if-nez v22, :cond_3

    .line 675
    const/16 v22, 0x1

    move-object/from16 v0, v18

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/apache/cordova/FileProgressResult;->setLengthComputable(Z)V

    .line 676
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v22

    move/from16 v0, v22

    int-to-long v0, v0

    move-wide/from16 v22, v0

    move-object/from16 v0, v18

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/FileProgressResult;->setTotal(J)V

    .line 679
    :cond_3
    new-instance v17, Ljava/io/FileOutputStream;

    move-object/from16 v0, v17

    invoke-direct {v0, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 680
    .local v17, "outputStream":Ljava/io/FileOutputStream;
    const/4 v14, 0x0

    .line 683
    .local v14, "inputStream":Ljava/io/InputStream;
    :try_start_1
    # invokes: Lorg/apache/cordova/FileTransfer;->getInputStream(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    invoke-static {v6}, Lorg/apache/cordova/FileTransfer;->access$400(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v14

    .line 684
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v23, v0

    monitor-enter v23
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 685
    :try_start_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    move/from16 v22, v0

    if-eqz v22, :cond_7

    .line 686
    monitor-exit v23
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 705
    :try_start_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v22

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 706
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v14}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 707
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v17 .. v17}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 733
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_4
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 737
    if-eqz v6, :cond_0

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-eqz v22, :cond_4

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_4

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .local v13, "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_4
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 645
    .end local v7    # "cookie":Ljava/lang/String;
    .end local v14    # "inputStream":Ljava/io/InputStream;
    .end local v17    # "outputStream":Ljava/io/FileOutputStream;
    .end local v18    # "progress":Lorg/apache/cordova/FileProgressResult;
    :cond_5
    :try_start_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$url:Ljava/net/URL;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v13

    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 646
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    # invokes: Lorg/apache/cordova/FileTransfer;->trustAllHosts(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;
    invoke-static {v13}, Lorg/apache/cordova/FileTransfer;->access$000(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v16

    .line 648
    invoke-virtual {v13}, Ljavax/net/ssl/HttpsURLConnection;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v15

    .line 650
    # getter for: Lorg/apache/cordova/FileTransfer;->DO_NOT_VERIFY:Ljavax/net/ssl/HostnameVerifier;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$100()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 651
    move-object v6, v13

    .line 652
    goto/16 :goto_1

    .line 656
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$url:Ljava/net/URL;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v22

    move-object/from16 v0, v22

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v6, v0
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    goto/16 :goto_1

    .line 735
    .restart local v7    # "cookie":Ljava/lang/String;
    .restart local v14    # "inputStream":Ljava/io/InputStream;
    .restart local v17    # "outputStream":Ljava/io/FileOutputStream;
    .restart local v18    # "progress":Lorg/apache/cordova/FileProgressResult;
    :catchall_0
    move-exception v22

    :try_start_6
    monitor-exit v23
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v22

    .line 688
    :cond_7
    :try_start_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iput-object v14, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 689
    monitor-exit v23
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 692
    const/16 v22, 0x4000

    :try_start_8
    move/from16 v0, v22

    new-array v4, v0, [B

    .line 693
    .local v4, "buffer":[B
    const/4 v5, 0x0

    .line 694
    .local v5, "bytesRead":I
    const-wide/16 v20, 0x0

    .line 695
    .local v20, "totalBytes":J
    :goto_2
    invoke-virtual {v14, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_9

    .line 696
    const/16 v22, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v22

    invoke-virtual {v0, v4, v1, v5}, Ljava/io/FileOutputStream;->write([BII)V

    .line 697
    int-to-long v0, v5

    move-wide/from16 v22, v0

    add-long v20, v20, v22

    .line 699
    move-object/from16 v0, v18

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/FileProgressResult;->setLoaded(J)V

    .line 700
    new-instance v19, Lorg/apache/cordova/api/PluginResult;

    sget-object v22, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual/range {v18 .. v18}, Lorg/apache/cordova/FileProgressResult;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v23

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 701
    .local v19, "progressResult":Lorg/apache/cordova/api/PluginResult;
    const/16 v22, 0x1

    move-object/from16 v0, v19

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 702
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_2

    .line 705
    .end local v4    # "buffer":[B
    .end local v5    # "bytesRead":I
    .end local v19    # "progressResult":Lorg/apache/cordova/api/PluginResult;
    .end local v20    # "totalBytes":J
    :catchall_1
    move-exception v22

    :try_start_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, v24

    move-object/from16 v1, v23

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 706
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v14}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 707
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v17 .. v17}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    throw v22
    :try_end_9
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 717
    .end local v7    # "cookie":Ljava/lang/String;
    .end local v10    # "file":Ljava/io/File;
    .end local v14    # "inputStream":Ljava/io/InputStream;
    .end local v17    # "outputStream":Ljava/io/FileOutputStream;
    .end local v18    # "progress":Lorg/apache/cordova/FileProgressResult;
    :catch_0
    move-exception v8

    .line 718
    .local v8, "e":Ljava/io/FileNotFoundException;
    :try_start_a
    sget v22, Lorg/apache/cordova/FileTransfer;->FILE_NOT_FOUND_ERR:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$source:Ljava/lang/String;

    move-object/from16 v23, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$target:Ljava/lang/String;

    move-object/from16 v24, v0

    move/from16 v0, v22

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    # invokes: Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    invoke-static {v0, v1, v2, v6}, Lorg/apache/cordova/FileTransfer;->access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v9

    .line 719
    .local v9, "error":Lorg/json/JSONObject;
    const-string v22, "FileTransfer"

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 720
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    new-instance v23, Lorg/apache/cordova/api/PluginResult;

    sget-object v24, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-direct {v0, v1, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v22 .. v23}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 733
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_b
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 737
    if-eqz v6, :cond_0

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-eqz v22, :cond_8

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_8

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_8
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 689
    .end local v8    # "e":Ljava/io/FileNotFoundException;
    .end local v9    # "error":Lorg/json/JSONObject;
    .restart local v7    # "cookie":Ljava/lang/String;
    .restart local v10    # "file":Ljava/io/File;
    .restart local v14    # "inputStream":Ljava/io/InputStream;
    .restart local v17    # "outputStream":Ljava/io/FileOutputStream;
    .restart local v18    # "progress":Lorg/apache/cordova/FileProgressResult;
    :catchall_2
    move-exception v22

    :try_start_c
    monitor-exit v23
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :try_start_d
    throw v22
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 705
    .restart local v4    # "buffer":[B
    .restart local v5    # "bytesRead":I
    .restart local v20    # "totalBytes":J
    :cond_9
    :try_start_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v22

    iput-object v0, v1, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    .line 706
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v14}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 707
    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static/range {v17 .. v17}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 710
    const-string v22, "FileTransfer"

    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    const-string v24, "Saved file: "

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$target:Ljava/lang/String;

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 713
    new-instance v12, Lorg/apache/cordova/FileUtils;

    invoke-direct {v12}, Lorg/apache/cordova/FileUtils;-><init>()V

    .line 714
    .local v12, "fileUtil":Lorg/apache/cordova/FileUtils;
    invoke-virtual {v12, v10}, Lorg/apache/cordova/FileUtils;->getEntry(Ljava/io/File;)Lorg/json/JSONObject;

    move-result-object v11

    .line 716
    .local v11, "fileEntry":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    new-instance v23, Lorg/apache/cordova/api/PluginResult;

    sget-object v24, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-direct {v0, v1, v11}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v22 .. v23}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_e
    .catch Ljava/io/FileNotFoundException; {:try_start_e .. :try_end_e} :catch_0
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 733
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_f
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 737
    if-eqz v6, :cond_0

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-eqz v22, :cond_a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_a

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_a
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 735
    :catchall_3
    move-exception v22

    :try_start_10
    monitor-exit v23
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    throw v22

    .end local v4    # "buffer":[B
    .end local v5    # "bytesRead":I
    .end local v7    # "cookie":Ljava/lang/String;
    .end local v10    # "file":Ljava/io/File;
    .end local v11    # "fileEntry":Lorg/json/JSONObject;
    .end local v12    # "fileUtil":Lorg/apache/cordova/FileUtils;
    .end local v14    # "inputStream":Ljava/io/InputStream;
    .end local v17    # "outputStream":Ljava/io/FileOutputStream;
    .end local v18    # "progress":Lorg/apache/cordova/FileProgressResult;
    .end local v20    # "totalBytes":J
    .restart local v8    # "e":Ljava/io/FileNotFoundException;
    .restart local v9    # "error":Lorg/json/JSONObject;
    :catchall_4
    move-exception v22

    :try_start_11
    monitor-exit v23
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    throw v22

    .line 721
    .end local v8    # "e":Ljava/io/FileNotFoundException;
    .end local v9    # "error":Lorg/json/JSONObject;
    :catch_1
    move-exception v8

    .line 722
    .local v8, "e":Ljava/io/IOException;
    :try_start_12
    sget v22, Lorg/apache/cordova/FileTransfer;->CONNECTION_ERR:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$source:Ljava/lang/String;

    move-object/from16 v23, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$target:Ljava/lang/String;

    move-object/from16 v24, v0

    move/from16 v0, v22

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    # invokes: Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    invoke-static {v0, v1, v2, v6}, Lorg/apache/cordova/FileTransfer;->access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v9

    .line 723
    .restart local v9    # "error":Lorg/json/JSONObject;
    const-string v22, "FileTransfer"

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 724
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    new-instance v23, Lorg/apache/cordova/api/PluginResult;

    sget-object v24, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-direct {v0, v1, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v22 .. v23}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 733
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_13
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 737
    if-eqz v6, :cond_0

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-eqz v22, :cond_b

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_b

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_b
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 735
    :catchall_5
    move-exception v22

    :try_start_14
    monitor-exit v23
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    throw v22

    .line 725
    .end local v8    # "e":Ljava/io/IOException;
    .end local v9    # "error":Lorg/json/JSONObject;
    :catch_2
    move-exception v8

    .line 726
    .local v8, "e":Lorg/json/JSONException;
    :try_start_15
    const-string v22, "FileTransfer"

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 727
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    new-instance v23, Lorg/apache/cordova/api/PluginResult;

    sget-object v24, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct/range {v23 .. v24}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    invoke-virtual/range {v22 .. v23}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    .line 733
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_16
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 737
    if-eqz v6, :cond_0

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-eqz v22, :cond_c

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_c

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_c
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 735
    :catchall_6
    move-exception v22

    :try_start_17
    monitor-exit v23
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    throw v22

    .line 728
    .end local v8    # "e":Lorg/json/JSONException;
    :catch_3
    move-exception v8

    .line 729
    .local v8, "e":Ljava/lang/Throwable;
    :try_start_18
    sget v22, Lorg/apache/cordova/FileTransfer;->CONNECTION_ERR:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$source:Ljava/lang/String;

    move-object/from16 v23, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$target:Ljava/lang/String;

    move-object/from16 v24, v0

    move/from16 v0, v22

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    # invokes: Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    invoke-static {v0, v1, v2, v6}, Lorg/apache/cordova/FileTransfer;->access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v9

    .line 730
    .restart local v9    # "error":Lorg/json/JSONObject;
    const-string v22, "FileTransfer"

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 731
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v22, v0

    new-instance v23, Lorg/apache/cordova/api/PluginResult;

    sget-object v24, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-direct {v0, v1, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual/range {v22 .. v23}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    .line 733
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_19
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v22

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    .line 737
    if-eqz v6, :cond_0

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v22, v0

    if-eqz v22, :cond_d

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v22, v0

    if-eqz v22, :cond_d

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_d
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 735
    :catchall_7
    move-exception v22

    :try_start_1a
    monitor-exit v23
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_7

    throw v22

    .line 733
    .end local v8    # "e":Ljava/lang/Throwable;
    .end local v9    # "error":Lorg/json/JSONObject;
    :catchall_8
    move-exception v22

    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v23

    monitor-enter v23

    .line 734
    :try_start_1b
    # getter for: Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;
    invoke-static {}, Lorg/apache/cordova/FileTransfer;->access$600()Ljava/util/HashMap;

    move-result-object v24

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$objectId:Ljava/lang/String;

    move-object/from16 v25, v0

    invoke-virtual/range {v24 .. v25}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    monitor-exit v23
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 737
    if-eqz v6, :cond_f

    .line 739
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$trustEveryone:Z

    move/from16 v23, v0

    if-eqz v23, :cond_e

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/cordova/FileTransfer$4;->val$useHttps:Z

    move/from16 v23, v0

    if-eqz v23, :cond_e

    move-object v13, v6

    .line 740
    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;

    .line 741
    .restart local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    invoke-virtual {v13, v15}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 742
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 745
    .end local v13    # "https":Ljavax/net/ssl/HttpsURLConnection;
    :cond_e
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_f
    throw v22

    .line 735
    :catchall_9
    move-exception v22

    :try_start_1c
    monitor-exit v23
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_9

    throw v22
.end method

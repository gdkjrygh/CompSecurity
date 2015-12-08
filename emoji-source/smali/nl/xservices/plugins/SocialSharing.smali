.class public Lnl/xservices/plugins/SocialSharing;
.super Lorg/apache/cordova/CordovaPlugin;
.source "SocialSharing.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnl/xservices/plugins/SocialSharing$SocialSharingRunnable;
    }
.end annotation


# static fields
.field private static final ACTION_AVAILABLE_EVENT:Ljava/lang/String; = "available"

.field private static final ACTION_CAN_SHARE_VIA:Ljava/lang/String; = "canShareVia"

.field private static final ACTION_CAN_SHARE_VIA_EMAIL:Ljava/lang/String; = "canShareViaEmail"

.field private static final ACTION_SHARE_EVENT:Ljava/lang/String; = "share"

.field private static final ACTION_SHARE_VIA:Ljava/lang/String; = "shareVia"

.field private static final ACTION_SHARE_VIA_EMAIL_EVENT:Ljava/lang/String; = "shareViaEmail"

.field private static final ACTION_SHARE_VIA_FACEBOOK_EVENT:Ljava/lang/String; = "shareViaFacebook"

.field private static final ACTION_SHARE_VIA_FACEBOOK_WITH_PASTEMESSAGEHINT:Ljava/lang/String; = "shareViaFacebookWithPasteMessageHint"

.field private static final ACTION_SHARE_VIA_SMS_EVENT:Ljava/lang/String; = "shareViaSMS"

.field private static final ACTION_SHARE_VIA_TWITTER_EVENT:Ljava/lang/String; = "shareViaTwitter"

.field private static final ACTION_SHARE_VIA_WHATSAPP_EVENT:Ljava/lang/String; = "shareViaWhatsApp"

.field private static final ACTIVITY_CODE_SENDVIAEMAIL:I = 0x2


# instance fields
.field private _callbackContext:Lorg/apache/cordova/CallbackContext;

.field private pasteMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    .line 54
    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 34
    invoke-static {p0}, Lnl/xservices/plugins/SocialSharing;->notEmpty(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lorg/json/JSONArray;)[Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 34
    invoke-static {p0}, Lnl/xservices/plugins/SocialSharing;->toStringArray(Lorg/json/JSONArray;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lnl/xservices/plugins/SocialSharing;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lnl/xservices/plugins/SocialSharing;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 34
    invoke-direct {p0}, Lnl/xservices/plugins/SocialSharing;->getDownloadDir()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$300(Lnl/xservices/plugins/SocialSharing;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;
    .locals 1
    .param p0, "x0"    # Lnl/xservices/plugins/SocialSharing;
    .param p1, "x1"    # Landroid/content/Intent;
    .param p2, "x2"    # Ljava/lang/String;
    .param p3, "x3"    # Ljava/lang/String;
    .param p4, "x4"    # Ljava/lang/String;
    .param p5, "x5"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 34
    invoke-direct/range {p0 .. p5}, Lnl/xservices/plugins/SocialSharing;->getFileUriAndSetType(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;Landroid/content/Intent;Ljava/lang/String;)Landroid/content/pm/ActivityInfo;
    .locals 1
    .param p0, "x0"    # Lnl/xservices/plugins/SocialSharing;
    .param p1, "x1"    # Lorg/apache/cordova/CallbackContext;
    .param p2, "x2"    # Landroid/content/Intent;
    .param p3, "x3"    # Ljava/lang/String;

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Lnl/xservices/plugins/SocialSharing;->getActivity(Lorg/apache/cordova/CallbackContext;Landroid/content/Intent;Ljava/lang/String;)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lnl/xservices/plugins/SocialSharing;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lnl/xservices/plugins/SocialSharing;

    .prologue
    .line 34
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing;->pasteMessage:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lnl/xservices/plugins/SocialSharing;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lnl/xservices/plugins/SocialSharing;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/lang/String;

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Lnl/xservices/plugins/SocialSharing;->showPasteMessage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private cleanupOldFiles(Ljava/io/File;)V
    .locals 4
    .param p1, "dir"    # Ljava/io/File;

    .prologue
    .line 465
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    array-length v3, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v0, v2, v1

    .line 467
    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 465
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 469
    .end local v0    # "f":Ljava/io/File;
    :cond_0
    return-void
.end method

.method private createOrCleanDir(Ljava/lang/String;)V
    .locals 3
    .param p1, "downloadDir"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 421
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 422
    .local v0, "dir":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 423
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_1

    .line 424
    new-instance v1, Ljava/io/IOException;

    const-string v2, "CREATE_DIRS_FAILED"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 427
    :cond_0
    invoke-direct {p0, v0}, Lnl/xservices/plugins/SocialSharing;->cleanupOldFiles(Ljava/io/File;)V

    .line 429
    :cond_1
    return-void
.end method

.method private doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 12
    .param p1, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .param p2, "msg"    # Ljava/lang/String;
    .param p3, "subject"    # Ljava/lang/String;
    .param p4, "files"    # Lorg/json/JSONArray;
    .param p5, "url"    # Ljava/lang/String;
    .param p6, "appPackageName"    # Ljava/lang/String;
    .param p7, "peek"    # Z

    .prologue
    .line 170
    iget-object v9, p0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 171
    .local v9, "mycordova":Lorg/apache/cordova/CordovaInterface;
    move-object v10, p0

    .line 173
    .local v10, "plugin":Lorg/apache/cordova/CordovaPlugin;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v11

    new-instance v0, Lnl/xservices/plugins/SocialSharing$2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p4

    move-object v5, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Lnl/xservices/plugins/SocialSharing$2;-><init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaPlugin;)V

    invoke-interface {v11, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 262
    const/4 v0, 0x1

    return v0
.end method

.method private getActivity(Lorg/apache/cordova/CallbackContext;Landroid/content/Intent;Ljava/lang/String;)Landroid/content/pm/ActivityInfo;
    .locals 6
    .param p1, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .param p2, "shareIntent"    # Landroid/content/Intent;
    .param p3, "appPackageName"    # Ljava/lang/String;

    .prologue
    .line 390
    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v3}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 391
    .local v2, "pm":Landroid/content/pm/PackageManager;
    const/4 v3, 0x0

    invoke-virtual {v2, p2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 392
    .local v0, "activityList":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 393
    .local v1, "app":Landroid/content/pm/ResolveInfo;
    iget-object v4, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 394
    iget-object v3, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 399
    .end local v1    # "app":Landroid/content/pm/ResolveInfo;
    :goto_0
    return-object v3

    .line 398
    :cond_1
    new-instance v3, Lorg/apache/cordova/PluginResult;

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->ERROR:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {p0, v0}, Lnl/xservices/plugins/SocialSharing;->getShareActivities(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONArray;)V

    invoke-virtual {p1, v3}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 399
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private getBytes(Ljava/io/InputStream;)[B
    .locals 4
    .param p1, "is"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 441
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 442
    .local v1, "bis":Ljava/io/BufferedInputStream;
    new-instance v0, Lorg/apache/http/util/ByteArrayBuffer;

    const/16 v3, 0x1388

    invoke-direct {v0, v3}, Lorg/apache/http/util/ByteArrayBuffer;-><init>(I)V

    .line 444
    .local v0, "baf":Lorg/apache/http/util/ByteArrayBuffer;
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->read()I

    move-result v2

    .local v2, "current":I
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 445
    int-to-byte v3, v2

    invoke-virtual {v0, v3}, Lorg/apache/http/util/ByteArrayBuffer;->append(I)V

    goto :goto_0

    .line 447
    :cond_0
    invoke-virtual {v0}, Lorg/apache/http/util/ByteArrayBuffer;->toByteArray()[B

    move-result-object v3

    return-object v3
.end method

.method private getDownloadDir()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/socialsharing-downloads"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 164
    .local v0, "dir":Ljava/lang/String;
    invoke-direct {p0, v0}, Lnl/xservices/plugins/SocialSharing;->createOrCleanDir(Ljava/lang/String;)V

    .line 165
    return-object v0
.end method

.method private getFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 432
    const/16 v1, 0x2f

    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 433
    .local v0, "lastIndexOfSlash":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 436
    .end local p1    # "url":Ljava/lang/String;
    :goto_0
    return-object p1

    .restart local p1    # "url":Ljava/lang/String;
    :cond_0
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private getFileUriAndSetType(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;
    .locals 13
    .param p1, "sendIntent"    # Landroid/content/Intent;
    .param p2, "dir"    # Ljava/lang/String;
    .param p3, "image"    # Ljava/lang/String;
    .param p4, "subject"    # Ljava/lang/String;
    .param p5, "nthFile"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 283
    move-object/from16 v8, p3

    .line 284
    .local v8, "localImage":Ljava/lang/String;
    const-string v10, "image/*"

    invoke-virtual {p1, v10}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 285
    const-string v10, "http"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_0

    const-string v10, "www/"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 286
    :cond_0
    move-object/from16 v0, p3

    invoke-direct {p0, v0}, Lnl/xservices/plugins/SocialSharing;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 287
    .local v6, "filename":Ljava/lang/String;
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "file://"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "/"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 288
    const-string v10, "http"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 290
    new-instance v10, Ljava/net/URL;

    move-object/from16 v0, p3

    invoke-direct {v10, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    .line 291
    .local v1, "connection":Ljava/net/URLConnection;
    const-string v10, "Content-Disposition"

    invoke-virtual {v1, v10}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 292
    .local v2, "disposition":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 293
    const-string v10, "filename=([^;]+)"

    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    .line 294
    .local v3, "dispositionPattern":Ljava/util/regex/Pattern;
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 295
    .local v9, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    move-result v10

    if-eqz v10, :cond_1

    .line 296
    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "[^a-zA-Z0-9._-]"

    const-string v12, ""

    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 297
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "file://"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "/"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 300
    .end local v3    # "dispositionPattern":Ljava/util/regex/Pattern;
    .end local v9    # "matcher":Ljava/util/regex/Matcher;
    :cond_1
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10

    invoke-direct {p0, v10}, Lnl/xservices/plugins/SocialSharing;->getBytes(Ljava/io/InputStream;)[B

    move-result-object v10

    invoke-direct {p0, v10, p2, v6}, Lnl/xservices/plugins/SocialSharing;->saveFile([BLjava/lang/String;Ljava/lang/String;)V

    .line 329
    .end local v1    # "connection":Ljava/net/URLConnection;
    .end local v2    # "disposition":Ljava/lang/String;
    .end local v6    # "filename":Ljava/lang/String;
    :cond_2
    :goto_0
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    :goto_1
    return-object v10

    .line 302
    .restart local v6    # "filename":Ljava/lang/String;
    :cond_3
    iget-object v10, p0, Lnl/xservices/plugins/SocialSharing;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v10}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v10

    move-object/from16 v0, p3

    invoke-virtual {v10, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v10

    invoke-direct {p0, v10}, Lnl/xservices/plugins/SocialSharing;->getBytes(Ljava/io/InputStream;)[B

    move-result-object v10

    invoke-direct {p0, v10, p2, v6}, Lnl/xservices/plugins/SocialSharing;->saveFile([BLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 304
    .end local v6    # "filename":Ljava/lang/String;
    :cond_4
    const-string v10, "data:"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    .line 306
    const-string v10, ";base64,"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_5

    .line 307
    const-string v10, "text/plain"

    invoke-virtual {p1, v10}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 308
    const/4 v10, 0x0

    goto :goto_1

    .line 311
    :cond_5
    const-string v10, ";base64,"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0x8

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 313
    .local v4, "encodedImg":Ljava/lang/String;
    const-string v10, "data:image/"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 314
    const-string v10, "data:"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0x5

    const-string v11, ";base64"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    move-object/from16 v0, p3

    invoke-virtual {v0, v10, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    :cond_6
    const-string v10, "/"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    const-string v11, ";base64"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    move-object/from16 v0, p3

    invoke-virtual {v0, v10, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 318
    .local v7, "imgExtension":Ljava/lang/String;
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "file."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 320
    .local v5, "fileName":Ljava/lang/String;
    invoke-static/range {p4 .. p4}, Lnl/xservices/plugins/SocialSharing;->notEmpty(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 322
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {p4 .. p4}, Lnl/xservices/plugins/SocialSharing;->sanitizeFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    if-nez p5, :cond_8

    const-string v10, ""

    :goto_2
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 324
    :cond_7
    const/4 v10, 0x0

    invoke-static {v4, v10}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v10

    invoke-direct {p0, v10, p2, v5}, Lnl/xservices/plugins/SocialSharing;->saveFile([BLjava/lang/String;Ljava/lang/String;)V

    .line 325
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "file://"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "/"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 326
    goto/16 :goto_0

    .line 322
    :cond_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "_"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move/from16 v0, p5

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    .line 326
    .end local v4    # "encodedImg":Ljava/lang/String;
    .end local v5    # "fileName":Ljava/lang/String;
    .end local v7    # "imgExtension":Ljava/lang/String;
    :cond_9
    const-string v10, "file://"

    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    .line 327
    new-instance v10, Ljava/lang/IllegalArgumentException;

    const-string v11, "URL_NOT_SUPPORTED"

    invoke-direct {v10, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v10
.end method

.method private static getPhoneNumbersWithManufacturerSpecificSeparators(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "phonenumbers"    # Ljava/lang/String;

    .prologue
    .line 377
    invoke-static {p0}, Lnl/xservices/plugins/SocialSharing;->notEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 379
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "samsung"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 380
    const/16 v0, 0x2c

    .line 384
    .local v0, "separator":C
    :goto_0
    const/16 v1, 0x3b

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2c

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 386
    .end local v0    # "separator":C
    :goto_1
    return-object v1

    .line 382
    :cond_0
    const/16 v0, 0x3b

    .restart local v0    # "separator":C
    goto :goto_0

    .line 386
    .end local v0    # "separator":C
    :cond_1
    const/4 v1, 0x0

    goto :goto_1
.end method

.method private getShareActivities(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/content/pm/ResolveInfo;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .prologue
    .line 403
    .local p1, "activityList":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 404
    .local v1, "packages":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 405
    .local v0, "app":Landroid/content/pm/ResolveInfo;
    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 407
    .end local v0    # "app":Landroid/content/pm/ResolveInfo;
    :cond_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    return-object v2
.end method

.method private invokeEmailIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;)Z
    .locals 11
    .param p1, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "subject"    # Ljava/lang/String;
    .param p4, "to"    # Lorg/json/JSONArray;
    .param p5, "cc"    # Lorg/json/JSONArray;
    .param p6, "bcc"    # Lorg/json/JSONArray;
    .param p7, "files"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 108
    move-object v9, p0

    .line 109
    .local v9, "plugin":Lnl/xservices/plugins/SocialSharing;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v10

    new-instance v0, Lnl/xservices/plugins/SocialSharing$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v9}, Lnl/xservices/plugins/SocialSharing$1;-><init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lnl/xservices/plugins/SocialSharing;)V

    invoke-interface {v10, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 157
    const/4 v0, 0x1

    return v0
.end method

.method private invokeSMSIntent(Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;Ljava/lang/String;)Z
    .locals 9
    .param p1, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .param p2, "options"    # Lorg/json/JSONObject;
    .param p3, "p_phonenumbers"    # Ljava/lang/String;

    .prologue
    .line 333
    const-string v0, "message"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 337
    .local v4, "message":Ljava/lang/String;
    const/4 v5, 0x0

    .line 338
    .local v5, "subject":Ljava/lang/String;
    const/4 v6, 0x0

    .line 339
    .local v6, "image":Ljava/lang/String;
    invoke-static {p3}, Lnl/xservices/plugins/SocialSharing;->getPhoneNumbersWithManufacturerSpecificSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 340
    .local v3, "phonenumbers":Ljava/lang/String;
    move-object v7, p0

    .line 341
    .local v7, "plugin":Lnl/xservices/plugins/SocialSharing;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    new-instance v0, Lnl/xservices/plugins/SocialSharing$3;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing$3;-><init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnl/xservices/plugins/SocialSharing;)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 373
    const/4 v0, 0x1

    return v0
.end method

.method private isEmailAvailable()Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 102
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.SENDTO"

    const-string v4, "mailto"

    const-string v5, "someone@domain.com"

    const/4 v6, 0x0

    invoke-static {v4, v5, v6}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 103
    .local v0, "intent":Landroid/content/Intent;
    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v1, :cond_0

    :goto_0
    return v1

    :cond_0
    move v1, v2

    goto :goto_0
.end method

.method private static notEmpty(Ljava/lang/String;)Z
    .locals 1
    .param p0, "what"    # Ljava/lang/String;

    .prologue
    .line 472
    if-eqz p0, :cond_0

    const-string v0, ""

    .line 473
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    .line 474
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static sanitizeFilename(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 486
    const-string v0, "[:\\\\/*?|<> ]"

    const-string v1, "_"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private saveFile([BLjava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "bytes"    # [B
    .param p2, "dirName"    # Ljava/lang/String;
    .param p3, "fileName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 451
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 452
    .local v0, "dir":Ljava/io/File;
    new-instance v1, Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 453
    .local v1, "fos":Ljava/io/FileOutputStream;
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 454
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 455
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 456
    return-void
.end method

.method private showPasteMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "msg"    # Ljava/lang/String;
    .param p2, "label"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 267
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-ge v3, v4, :cond_0

    .line 279
    :goto_0
    return-void

    .line 271
    :cond_0
    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const-string v4, "clipboard"

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 272
    .local v1, "clipboard":Landroid/content/ClipboardManager;
    invoke-static {p2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    .line 273
    .local v0, "clip":Landroid/content/ClipData;
    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 276
    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v3}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, p2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 277
    .local v2, "toast":Landroid/widget/Toast;
    const/16 v3, 0x11

    invoke-virtual {v2, v3, v5, v5}, Landroid/widget/Toast;->setGravity(III)V

    .line 278
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method private static toStringArray(Lorg/json/JSONArray;)[Ljava/lang/String;
    .locals 3
    .param p0, "jsonArray"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 478
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v1, v2, [Ljava/lang/String;

    .line 479
    .local v1, "result":[Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 480
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 479
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 482
    :cond_0
    return-object v1
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 9
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x4

    const/4 v4, 0x2

    const/4 v1, 0x3

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 63
    iput-object p3, p0, Lnl/xservices/plugins/SocialSharing;->_callbackContext:Lorg/apache/cordova/CallbackContext;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lnl/xservices/plugins/SocialSharing;->pasteMessage:Ljava/lang/String;

    .line 65
    const-string v0, "available"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    move v7, v8

    .line 97
    :goto_0
    return v7

    .line 68
    :cond_0
    const-string v0, "share"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto :goto_0

    .line 70
    :cond_1
    const-string v0, "shareViaTwitter"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "twitter"

    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto :goto_0

    .line 72
    :cond_2
    const-string v0, "shareViaFacebook"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 73
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "com.facebook.katana"

    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto :goto_0

    .line 74
    :cond_3
    const-string v0, "shareViaFacebookWithPasteMessageHint"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 75
    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnl/xservices/plugins/SocialSharing;->pasteMessage:Ljava/lang/String;

    .line 76
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "com.facebook.katana"

    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto/16 :goto_0

    .line 77
    :cond_4
    const-string v0, "shareViaWhatsApp"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 78
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "whatsapp"

    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto/16 :goto_0

    .line 79
    :cond_5
    const-string v0, "canShareVia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 80
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v1, p3

    move v7, v8

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto/16 :goto_0

    .line 81
    :cond_6
    const-string v0, "canShareViaEmail"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 82
    invoke-direct {p0}, Lnl/xservices/plugins/SocialSharing;->isEmailAvailable()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 83
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    move v7, v8

    .line 84
    goto/16 :goto_0

    .line 86
    :cond_7
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->ERROR:Lorg/apache/cordova/PluginResult$Status;

    const-string v2, "not available"

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto/16 :goto_0

    .line 89
    :cond_8
    const-string v0, "shareVia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 90
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->doSendIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    goto/16 :goto_0

    .line 91
    :cond_9
    const-string v0, "shareViaSMS"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 92
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p3, v0, v1}, Lnl/xservices/plugins/SocialSharing;->invokeSMSIntent(Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    goto/16 :goto_0

    .line 93
    :cond_a
    const-string v0, "shareViaEmail"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 94
    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v6, 0x0

    :goto_2
    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v7, 0x0

    :goto_3
    move-object v0, p0

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lnl/xservices/plugins/SocialSharing;->invokeEmailIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;)Z

    move-result v7

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v5

    goto :goto_1

    :cond_c
    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v6

    goto :goto_2

    :cond_d
    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v7

    goto :goto_3

    .line 96
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "socialSharing."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not a supported function. Did you mean \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "share"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "intent"    # Landroid/content/Intent;

    .prologue
    .line 412
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 413
    invoke-super {p0, p1, p2, p3}, Lorg/apache/cordova/CordovaPlugin;->onActivityResult(IILandroid/content/Intent;)V

    .line 414
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing;->_callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Lorg/apache/cordova/CallbackContext;->success()V

    .line 418
    :goto_0
    return-void

    .line 416
    :cond_0
    iget-object v1, p0, Lnl/xservices/plugins/SocialSharing;->_callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v2, Lorg/apache/cordova/PluginResult;

    sget-object v3, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-direct {v2, v3, v0}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Z)V

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

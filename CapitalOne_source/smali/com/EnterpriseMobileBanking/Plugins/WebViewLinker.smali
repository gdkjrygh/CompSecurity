.class public Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
.super Lorg/apache/cordova/api/Plugin;
.source "WebViewLinker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "WebViewLinker"

.field public static TITLEBAR_HEIGHT:I

.field private static final callbackIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static innerViewCanGoBack:Z

.field private static outsideAppList:Lorg/json/JSONArray;

.field private static outsideAppListLoadedFromCache:Z

.field private static transiteWorker:Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;


# instance fields
.field private transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 33
    sput-boolean v1, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->innerViewCanGoBack:Z

    .line 100
    const/high16 v0, -0x80000000

    sput v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->TITLEBAR_HEIGHT:I

    .line 102
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->callbackIds:Ljava/util/Set;

    .line 104
    sput-object v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWorker:Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;

    .line 108
    sput-object v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;

    .line 110
    sput-boolean v1, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppListLoadedFromCache:Z

    .line 114
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskLoader;->LoadAllTasks()V

    .line 115
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->loadOutsideAppListFromCache()V

    .line 116
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    return-void
.end method

.method static synthetic access$002(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 29
    sput-boolean p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->innerViewCanGoBack:Z

    return p0
.end method

.method static synthetic access$100(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 29
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    return-object v0
.end method

.method static synthetic access$102(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;)Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    .param p1, "x1"    # Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    .prologue
    .line 29
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    return-object p1
.end method

.method public static allowedtoOpenOutOfApp(Ljava/lang/String;)Z
    .locals 6
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 411
    const-string v3, "WebViewLinker"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "allowedtoOpenOutOfApp("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ");"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    const/4 v1, 0x0

    .line 413
    .local v1, "ret":Z
    if-eqz p0, :cond_1

    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;

    if-eqz v3, :cond_1

    .line 414
    const/4 v2, 0x0

    .local v2, "x":I
    :goto_0
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    if-nez v1, :cond_1

    .line 415
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v0

    .line 416
    .local v0, "item":Ljava/lang/String;
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_0

    .line 417
    const/4 v1, 0x1

    .line 414
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 422
    .end local v0    # "item":Ljava/lang/String;
    .end local v2    # "x":I
    :cond_1
    const-string v4, "WebViewLinker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "allowedtoOpenOutofApp returning "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-eqz v1, :cond_2

    const-string v3, "true"

    :goto_1
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    return v1

    .line 422
    :cond_2
    const-string v3, "false"

    goto :goto_1
.end method

.method private declared-synchronized createWorker()V
    .locals 2

    .prologue
    .line 318
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWorker:Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    if-eqz v0, :cond_0

    .line 319
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    invoke-direct {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;-><init>(Landroid/webkit/WebView;)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWorker:Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    :cond_0
    monitor-exit p0

    return-void

    .line 318
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static getHeightWidthDPI(I)I
    .locals 3
    .param p0, "heightWidth"    # I

    .prologue
    .line 336
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 339
    .local v0, "metrics":Landroid/util/DisplayMetrics;
    const/high16 v1, -0x80000000

    if-ne p0, v1, :cond_0

    .line 341
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v2, 0x140

    if-le v1, v2, :cond_1

    .line 342
    const/16 p0, 0x38

    sput p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->TITLEBAR_HEIGHT:I

    .line 348
    :cond_0
    :goto_0
    int-to-float v1, p0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    return v1

    .line 344
    :cond_1
    const/16 p0, 0x50

    sput p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->TITLEBAR_HEIGHT:I

    goto :goto_0
.end method

.method public static getInnerHeight()I
    .locals 1

    .prologue
    .line 325
    const/4 v0, 0x0

    return v0
.end method

.method private static loadOutsideAppListFromCache()V
    .locals 5

    .prologue
    .line 427
    sget-boolean v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppListLoadedFromCache:Z

    if-nez v2, :cond_1

    .line 428
    const-string v2, "SP_URL_OPEN_OUTSIDE"

    const-string v3, ""

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 429
    .local v1, "list":Ljava/lang/String;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 431
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    sput-object v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 436
    :cond_0
    :goto_0
    const/4 v2, 0x1

    sput-boolean v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppListLoadedFromCache:Z

    .line 438
    :cond_1
    return-void

    .line 432
    :catch_0
    move-exception v0

    .line 433
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "WebViewLinker"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static setOutsideAppList(Lorg/json/JSONArray;)V
    .locals 5
    .param p0, "lst"    # Lorg/json/JSONArray;

    .prologue
    .line 353
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 356
    :try_start_0
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;

    const-string v3, ","

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->join(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 357
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->outsideAppList:Lorg/json/JSONArray;

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 359
    :catch_0
    move-exception v0

    .line 360
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "WebViewLinker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSONException in setOutsideAppList : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 363
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_1
    return-void
.end method

.method public static shouldShowBackButton()Z
    .locals 1

    .prologue
    .line 367
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->innerViewCanGoBack:Z

    return v0
.end method


# virtual methods
.method public declared-synchronized createTransiteView()V
    .locals 4

    .prologue
    .line 273
    monitor-enter p0

    move-object v1, p0

    .line 275
    .local v1, "me":Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    :try_start_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    if-nez v2, :cond_0

    .line 277
    const-string v2, "WebViewLinker"

    const-string v3, "Creating Transite View"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 281
    :try_start_1
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v2

    new-instance v3, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;

    invoke-direct {v3, p0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 308
    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 311
    :cond_0
    monitor-exit p0

    return-void

    .line 304
    :catch_0
    move-exception v0

    .line 305
    .local v0, "e":Ljava/lang/InterruptedException;
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 308
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 273
    :catchall_1
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 24
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 121
    monitor-enter p0

    :try_start_0
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "action="

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, ", callbackId="

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v21, "WebViewLinker"

    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v17, Lorg/apache/cordova/api/PluginResult;

    sget-object v21, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v17

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 128
    .local v17, "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual/range {p0 .. p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->createTransiteView()V

    .line 129
    invoke-direct/range {p0 .. p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->createWorker()V

    .line 130
    invoke-static/range {p1 .. p1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->hasAction(Ljava/lang/String;)Z

    move-result v21

    if-eqz v21, :cond_1

    .line 133
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "Found task for action: "

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p2

    move-object/from16 v3, p0

    invoke-static {v0, v1, v2, v3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->getCallbackTask(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;

    move-result-object v19

    .line 138
    .local v19, "task":Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    if-eqz v19, :cond_0

    .line 140
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "Pending Tasks: "

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    sget-object v23, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->callbackIds:Ljava/util/Set;

    invoke-interface/range {v23 .. v23}, Ljava/util/Set;->size()I

    move-result v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const/16 v21, 0x1

    move-object/from16 v0, v17

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 147
    sget-object v21, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->callbackIds:Ljava/util/Set;

    move-object/from16 v0, v21

    move-object/from16 v1, p3

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 148
    sget-object v21, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWorker:Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;

    move-object/from16 v0, v21

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->processCallback(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    .end local v19    # "task":Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v17

    .line 150
    :cond_1
    :try_start_1
    const-string v21, "openLocalWeb"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v21

    if-eqz v21, :cond_5

    .line 155
    const/16 v21, 0x0

    :try_start_2
    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 160
    .local v5, "destination":Ljava/lang/String;
    const-string v21, "products"

    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_2

    .line 162
    const-string v5, "product"

    .line 168
    :cond_2
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getProductsUri()Ljava/lang/String;

    move-result-object v16

    .line 170
    .local v16, "products":Ljava/lang/String;
    const/16 v18, 0x0

    .line 171
    .local v18, "start":I
    const/16 v20, -0x1

    .line 174
    .local v20, "temp":I
    :cond_3
    const-string v21, "/"

    add-int/lit8 v22, v20, 0x1

    move-object/from16 v0, v16

    move-object/from16 v1, v21

    move/from16 v2, v22

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v20

    .line 175
    const/16 v21, -0x1

    move/from16 v0, v20

    move/from16 v1, v21

    if-eq v0, v1, :cond_4

    move/from16 v18, v20

    const/16 v21, -0x1

    move/from16 v0, v20

    move/from16 v1, v21

    if-ne v0, v1, :cond_3

    .line 177
    :cond_4
    const-string v21, "."

    move-object/from16 v0, v16

    move-object/from16 v1, v21

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v10

    .line 178
    .local v10, "end":I
    add-int/lit8 v21, v18, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v21

    invoke-virtual {v0, v1, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v16

    .line 180
    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_0

    .line 182
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->switchProducts()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 184
    .end local v5    # "destination":Ljava/lang/String;
    .end local v10    # "end":I
    .end local v16    # "products":Ljava/lang/String;
    .end local v18    # "start":I
    .end local v20    # "temp":I
    :catch_0
    move-exception v6

    .line 185
    .local v6, "e":Lorg/json/JSONException;
    :try_start_3
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "error, caught exception: "

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 121
    .end local v6    # "e":Lorg/json/JSONException;
    .end local v17    # "result":Lorg/apache/cordova/api/PluginResult;
    :catchall_0
    move-exception v21

    monitor-exit p0

    throw v21

    .line 188
    .restart local v17    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_5
    :try_start_4
    const-string v21, "switchLOB"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_6

    .line 189
    const-string v21, "WebViewLinker"

    const-string v22, "Switching to card LOB"

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 191
    const/16 v21, 0x0

    :try_start_5
    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/EnterpriseMobileBanking/AppHelper;->handleNative(Ljava/lang/String;)Z
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    .line 192
    :catch_1
    move-exception v6

    .line 193
    .restart local v6    # "e":Lorg/json/JSONException;
    :try_start_6
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_0

    .line 195
    .end local v6    # "e":Lorg/json/JSONException;
    :cond_6
    const-string v21, "enableTitleBarButtons"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result v21

    if-eqz v21, :cond_8

    .line 196
    move-object/from16 v13, p0

    .line 197
    .local v13, "me":Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    const/4 v4, 0x0

    .line 199
    .local v4, "cmd":Ljava/lang/String;
    const/16 v21, 0x0

    :try_start_7
    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v4

    .line 204
    :goto_1
    :try_start_8
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "WebViewLinkerCommand"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v21, "true"

    move-object/from16 v0, v21

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_7

    const/4 v9, 0x1

    .line 206
    .local v9, "enabled":Z
    :goto_2
    monitor-enter v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    move-object/from16 v21, v0

    invoke-interface/range {v21 .. v21}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v21

    new-instance v22, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v13, v9}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Z)V

    invoke-virtual/range {v21 .. v22}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 216
    monitor-exit v13

    goto/16 :goto_0

    :catchall_1
    move-exception v21

    monitor-exit v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v21

    .line 200
    .end local v9    # "enabled":Z
    :catch_2
    move-exception v6

    .line 202
    .restart local v6    # "e":Lorg/json/JSONException;
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1

    .line 205
    .end local v6    # "e":Lorg/json/JSONException;
    :cond_7
    const/4 v9, 0x0

    goto :goto_2

    .line 217
    .end local v4    # "cmd":Ljava/lang/String;
    .end local v13    # "me":Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    :cond_8
    const-string v21, "alertDialog"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_b

    .line 219
    const-string v15, "Oops"

    .line 220
    .local v15, "messageTitle":Ljava/lang/String;
    const-string v14, "An error has occured."
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 225
    .local v14, "messageDialog":Ljava/lang/String;
    :try_start_b
    new-instance v11, Lorg/json/JSONObject;

    const/16 v21, 0x0

    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-direct {v11, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 227
    .local v11, "jOBJ2":Lorg/json/JSONObject;
    invoke-virtual {v11}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v12

    .line 229
    .local v12, "jsArray":Lorg/json/JSONArray;
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v21

    if-ltz v21, :cond_9

    .line 230
    const/16 v21, 0x0

    move/from16 v0, v21

    invoke-virtual {v12, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 233
    .local v7, "element":Ljava/lang/String;
    const-string v21, "A problem has occured"

    move-object/from16 v0, v21

    invoke-virtual {v11, v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 235
    .end local v7    # "element":Ljava/lang/String;
    :cond_9
    const/16 v21, 0x1

    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v22

    move/from16 v0, v21

    move/from16 v1, v22

    if-gt v0, v1, :cond_a

    .line 236
    const/16 v21, 0x1

    move/from16 v0, v21

    invoke-virtual {v12, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 239
    .local v8, "element2":Ljava/lang/String;
    const-string v21, "Try Again"

    move-object/from16 v0, v21

    invoke-virtual {v11, v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result-object v15

    .line 246
    .end local v8    # "element2":Ljava/lang/String;
    .end local v11    # "jOBJ2":Lorg/json/JSONObject;
    .end local v12    # "jsArray":Lorg/json/JSONArray;
    :cond_a
    :goto_3
    :try_start_c
    invoke-static {v15, v14}, Lcom/EnterpriseMobileBanking/AppHelper;->showError(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 242
    :catch_3
    move-exception v6

    .line 243
    .restart local v6    # "e":Lorg/json/JSONException;
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "error, caught exception: "

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3

    .line 249
    .end local v6    # "e":Lorg/json/JSONException;
    .end local v14    # "messageDialog":Ljava/lang/String;
    .end local v15    # "messageTitle":Ljava/lang/String;
    :cond_b
    const-string v21, "tickle"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_c

    .line 250
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v21

    check-cast v21, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual/range {v21 .. v21}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Lcom/capitalone/mobile/banking/session/SessionManager;->resetTimeout()V

    goto/16 :goto_0

    .line 253
    :cond_c
    const-string v21, "WebViewLinker"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    const-string v23, "Did not find a task for: "

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v21, "INGDirectApp.hideBusyIndicator();"

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 255
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-object/from16 v21, v0

    const/16 v22, 0x8

    invoke-virtual/range {v21 .. v22}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setVisibility(I)V

    .line 256
    new-instance v17, Lorg/apache/cordova/api/PluginResult;

    .end local v17    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v21, Lorg/apache/cordova/api/PluginResult$Status;->INVALID_ACTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v17

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .restart local v17    # "result":Lorg/apache/cordova/api/PluginResult;
    goto/16 :goto_0
.end method

.method public sendJavascript(Ljava/lang/String;)V
    .locals 3
    .param p1, "statement"    # Ljava/lang/String;

    .prologue
    .line 265
    const-string v0, "WebViewLinker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending Javascript: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(function(){ try{ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " } catch( err ) { WL.Logger.debug( \'Error: \' + err ); } })();"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 268
    return-void
.end method

.method public sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
    .locals 3
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "task"    # Lcom/EnterpriseMobileBanking/Utils/CallbackTask;

    .prologue
    .line 372
    invoke-virtual {p2}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->getCallbackId()Ljava/lang/String;

    move-result-object v0

    .line 375
    .local v0, "cbId":Ljava/lang/String;
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->callbackIds:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 377
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->callbackIds:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 378
    invoke-virtual {p2}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->setComplete()V

    .line 380
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;

    invoke-direct {v2, p0, p1, v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 400
    :cond_0
    return-void
.end method

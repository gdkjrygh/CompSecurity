.class public Lorg/apache/cordova/facebook/ConnectPlugin;
.super Lorg/apache/cordova/CordovaPlugin;
.source "ConnectPlugin.java"


# static fields
.field private static final INVALID_ERROR_CODE:I = -0x2

.field private static final MANAGE_PERMISSION_PREFIX:Ljava/lang/String; = "manage"

.field private static final OTHER_PUBLISH_PERMISSIONS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PUBLISH_PERMISSION_PREFIX:Ljava/lang/String; = "publish"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private applicationId:Ljava/lang/String;

.field private graphContext:Lorg/apache/cordova/CallbackContext;

.field private graphPath:Ljava/lang/String;

.field private logger:Lcom/facebook/AppEventsLogger;

.field private loginContext:Lorg/apache/cordova/CallbackContext;

.field private method:Ljava/lang/String;

.field private paramBundle:Landroid/os/Bundle;

.field private showDialogContext:Lorg/apache/cordova/CallbackContext;

.field private trackingPendingCall:Z

.field private uiHelper:Lcom/facebook/UiLifecycleHelper;

.field private userID:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lorg/apache/cordova/facebook/ConnectPlugin$1;

    invoke-direct {v0}, Lorg/apache/cordova/facebook/ConnectPlugin$1;-><init>()V

    sput-object v0, Lorg/apache/cordova/facebook/ConnectPlugin;->OTHER_PUBLISH_PERMISSIONS:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 47
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    .line 60
    const-string v0, "ConnectPlugin"

    iput-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->TAG:Ljava/lang/String;

    .line 63
    iput-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->applicationId:Ljava/lang/String;

    .line 64
    iput-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    .line 65
    iput-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;

    .line 66
    iput-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z

    return-void
.end method

.method static synthetic access$000(Lorg/apache/cordova/facebook/ConnectPlugin;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Lcom/facebook/SessionState;
    .param p2, "x2"    # Ljava/lang/Exception;

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/facebook/ConnectPlugin;->onSessionStateChange(Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic access$100(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 47
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;

    return-object v0
.end method

.method static synthetic access$1000(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 47
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    return-object v0
.end method

.method static synthetic access$1002(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/CallbackContext;)Lorg/apache/cordova/CallbackContext;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 47
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    return-object p1
.end method

.method static synthetic access$200(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Ljava/lang/Exception;
    .param p2, "x2"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/facebook/ConnectPlugin;->handleError(Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V

    return-void
.end method

.method static synthetic access$300(Lorg/apache/cordova/facebook/ConnectPlugin;Landroid/os/Bundle;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Landroid/os/Bundle;

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lorg/apache/cordova/facebook/ConnectPlugin;->handleSuccess(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$402(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 47
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 47
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;

    return-object v0
.end method

.method static synthetic access$600(Lorg/apache/cordova/facebook/ConnectPlugin;)Lcom/facebook/UiLifecycleHelper;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 47
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    return-object v0
.end method

.method static synthetic access$702(Lorg/apache/cordova/facebook/ConnectPlugin;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Z

    .prologue
    .line 47
    iput-boolean p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z

    return p1
.end method

.method static synthetic access$800(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 47
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    return-object v0
.end method

.method static synthetic access$802(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/CallbackContext;)Lorg/apache/cordova/CallbackContext;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 47
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    return-object p1
.end method

.method static synthetic access$902(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/facebook/ConnectPlugin;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 47
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphPath:Ljava/lang/String;

    return-object p1
.end method

.method private checkActiveSession(Lcom/facebook/Session;)Z
    .locals 1
    .param p1, "session"    # Lcom/facebook/Session;

    .prologue
    .line 562
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/Session;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    const/4 v0, 0x1

    .line 565
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getUserInfo(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)V
    .locals 1
    .param p1, "session"    # Lcom/facebook/Session;
    .param p2, "graphUserCb"    # Lcom/facebook/Request$GraphUserCallback;

    .prologue
    .line 623
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    if-eqz v0, :cond_0

    .line 624
    invoke-static {p1, p2}, Lcom/facebook/Request;->newMeRequest(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)Lcom/facebook/Request;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 626
    :cond_0
    return-void
.end method

.method private handleError(Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V
    .locals 4
    .param p1, "exception"    # Ljava/lang/Exception;
    .param p2, "context"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 570
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Facebook error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 571
    .local v0, "errMsg":Ljava/lang/String;
    const/4 v1, -0x2

    .line 573
    .local v1, "errorCode":I
    instance-of v2, p1, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v2, :cond_1

    .line 574
    const-string v0, "User cancelled dialog"

    .line 575
    const/16 v1, 0x1069

    .line 581
    :cond_0
    :goto_0
    const-string v2, "ConnectPlugin"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 582
    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->getErrorResponse(Ljava/lang/Exception;Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p2, v2}, Lorg/apache/cordova/CallbackContext;->error(Lorg/json/JSONObject;)V

    .line 583
    return-void

    .line 576
    :cond_1
    instance-of v2, p1, Lcom/facebook/FacebookDialogException;

    if-eqz v2, :cond_0

    .line 578
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Dialog error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private handleSuccess(Landroid/os/Bundle;)V
    .locals 10
    .param p1, "values"    # Landroid/os/Bundle;

    .prologue
    .line 591
    invoke-virtual {p1}, Landroid/os/Bundle;->size()I

    move-result v7

    if-lez v7, :cond_3

    .line 592
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 594
    .local v5, "response":Lorg/json/JSONObject;
    :try_start_0
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v3

    .line 595
    .local v3, "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 597
    .local v2, "key":Ljava/lang/String;
    const-string v8, "["

    invoke-virtual {v2, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 598
    .local v0, "beginArrayCharIndex":I
    if-ltz v0, :cond_2

    .line 599
    const/4 v8, 0x0

    invoke-virtual {v2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 601
    .local v4, "normalizedKey":Ljava/lang/String;
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 602
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/json/JSONArray;

    .line 607
    .local v6, "result":Lorg/json/JSONArray;
    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v8

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 612
    .end local v0    # "beginArrayCharIndex":I
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .end local v4    # "normalizedKey":Ljava/lang/String;
    .end local v6    # "result":Lorg/json/JSONArray;
    :catch_0
    move-exception v1

    .line 613
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 615
    .end local v1    # "e":Lorg/json/JSONException;
    :cond_0
    iget-object v7, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v7, v5}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    .line 620
    .end local v5    # "response":Lorg/json/JSONObject;
    :goto_2
    return-void

    .line 604
    .restart local v0    # "beginArrayCharIndex":I
    .restart local v2    # "key":Ljava/lang/String;
    .restart local v3    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v4    # "normalizedKey":Ljava/lang/String;
    .restart local v5    # "response":Lorg/json/JSONObject;
    :cond_1
    :try_start_1
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 605
    .restart local v6    # "result":Lorg/json/JSONArray;
    invoke-virtual {v5, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 609
    .end local v4    # "normalizedKey":Ljava/lang/String;
    .end local v6    # "result":Lorg/json/JSONArray;
    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 617
    .end local v0    # "beginArrayCharIndex":I
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .end local v5    # "response":Lorg/json/JSONObject;
    :cond_3
    const-string v7, "ConnectPlugin"

    const-string v8, "User cancelled dialog"

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 618
    iget-object v7, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;

    const-string v8, "User cancelled dialog"

    invoke-virtual {v7, v8}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private isPublishPermission(Ljava/lang/String;)Z
    .locals 1
    .param p1, "permission"    # Ljava/lang/String;

    .prologue
    .line 728
    if-eqz p1, :cond_1

    const-string v0, "publish"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "manage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lorg/apache/cordova/facebook/ConnectPlugin;->OTHER_PUBLISH_PERMISSIONS:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private makeGraphCall()V
    .locals 17

    .prologue
    .line 629
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v9

    .line 631
    .local v9, "session":Lcom/facebook/Session;
    new-instance v3, Lorg/apache/cordova/facebook/ConnectPlugin$12;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lorg/apache/cordova/facebook/ConnectPlugin$12;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V

    .line 650
    .local v3, "graphCallback":Lcom/facebook/Request$Callback;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v13, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphPath:Ljava/lang/String;

    const-string v14, "UTF-8"

    invoke-static {v13, v14}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p0

    iput-object v13, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphPath:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 655
    :goto_0
    move-object/from16 v0, p0

    iget-object v13, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphPath:Ljava/lang/String;

    const-string v14, "\\?"

    invoke-virtual {v13, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 656
    .local v11, "urlParts":[Ljava/lang/String;
    const/4 v13, 0x0

    aget-object v2, v11, v13

    .line 657
    .local v2, "graphAction":Ljava/lang/String;
    const/4 v13, 0x0

    invoke-static {v13, v2, v3}, Lcom/facebook/Request;->newGraphPathRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;

    move-result-object v4

    .line 658
    .local v4, "graphRequest":Lcom/facebook/Request;
    invoke-virtual {v4}, Lcom/facebook/Request;->getParameters()Landroid/os/Bundle;

    move-result-object v6

    .line 660
    .local v6, "params":Landroid/os/Bundle;
    array-length v13, v11

    const/4 v14, 0x1

    if-le v13, v14, :cond_1

    .line 661
    const/4 v13, 0x1

    aget-object v13, v11, v13

    const-string v14, "&"

    invoke-virtual {v13, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 663
    .local v7, "queries":[Ljava/lang/String;
    array-length v14, v7

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v14, :cond_1

    aget-object v8, v7, v13

    .line 664
    .local v8, "query":Ljava/lang/String;
    const-string v15, "="

    invoke-virtual {v8, v15}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 665
    .local v10, "splitPoint":I
    if-lez v10, :cond_0

    .line 666
    const/4 v15, 0x0

    invoke-virtual {v8, v15, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 667
    .local v5, "key":Ljava/lang/String;
    add-int/lit8 v15, v10, 0x1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v16

    move/from16 v0, v16

    invoke-virtual {v8, v15, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 668
    .local v12, "value":Ljava/lang/String;
    invoke-virtual {v6, v5, v12}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 663
    .end local v5    # "key":Ljava/lang/String;
    .end local v12    # "value":Ljava/lang/String;
    :cond_0
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 651
    .end local v2    # "graphAction":Ljava/lang/String;
    .end local v4    # "graphRequest":Lcom/facebook/Request;
    .end local v6    # "params":Landroid/os/Bundle;
    .end local v7    # "queries":[Ljava/lang/String;
    .end local v8    # "query":Ljava/lang/String;
    .end local v10    # "splitPoint":I
    .end local v11    # "urlParts":[Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 652
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 672
    .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
    .restart local v2    # "graphAction":Ljava/lang/String;
    .restart local v4    # "graphRequest":Lcom/facebook/Request;
    .restart local v6    # "params":Landroid/os/Bundle;
    .restart local v11    # "urlParts":[Ljava/lang/String;
    :cond_1
    const-string v13, "access_token"

    invoke-virtual {v9}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v13, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    invoke-virtual {v4, v6}, Lcom/facebook/Request;->setParameters(Landroid/os/Bundle;)V

    .line 675
    invoke-virtual {v4}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 676
    return-void
.end method

.method private onSessionStateChange(Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 4
    .param p1, "state"    # Lcom/facebook/SessionState;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 682
    const-string v1, "ConnectPlugin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSessionStateChange:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/SessionState;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 683
    if-eqz p2, :cond_1

    instance-of v1, p2, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v1, :cond_1

    .line 686
    const-string v1, "ConnectPlugin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 687
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0, p2, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->handleError(Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V

    .line 722
    :cond_0
    :goto_0
    return-void

    .line 689
    :cond_1
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 691
    .local v0, "session":Lcom/facebook/Session;
    invoke-virtual {p1}, Lcom/facebook/SessionState;->isOpened()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 692
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    if-eqz v1, :cond_2

    .line 694
    new-instance v1, Lorg/apache/cordova/facebook/ConnectPlugin$13;

    invoke-direct {v1, p0}, Lorg/apache/cordova/facebook/ConnectPlugin$13;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V

    invoke-direct {p0, v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->getUserInfo(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)V

    goto :goto_0

    .line 714
    :cond_2
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    if-eqz v1, :cond_0

    .line 716
    invoke-direct {p0}, Lorg/apache/cordova/facebook/ConnectPlugin;->makeGraphCall()V

    goto :goto_0

    .line 718
    :cond_3
    sget-object v1, Lcom/facebook/SessionState;->CLOSED_LOGIN_FAILED:Lcom/facebook/SessionState;

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    if-eqz v1, :cond_0

    .line 719
    new-instance v1, Lcom/facebook/FacebookAuthorizationException;

    const-string v2, "Session was closed and was not closed normally"

    invoke-direct {v1, v2}, Lcom/facebook/FacebookAuthorizationException;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0, v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->handleError(Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V

    goto :goto_0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 39
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 164
    const-string v33, "login"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_9

    .line 165
    const-string v33, "ConnectPlugin"

    const-string v36, "login FB"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    move/from16 v0, v33

    new-array v6, v0, [Ljava/lang/String;

    .line 168
    .local v6, "arrayPermissions":[Ljava/lang/String;
    const/4 v14, 0x0

    .local v14, "i":I
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    move/from16 v0, v33

    if-ge v14, v0, :cond_0

    .line 169
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v33

    aput-object v33, v6, v14

    .line 168
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 172
    :cond_0
    const/16 v25, 0x0

    .line 173
    .local v25, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    array-length v0, v6

    move/from16 v33, v0

    if-lez v33, :cond_1

    .line 174
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v25

    .line 178
    :cond_1
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v32

    .line 181
    .local v32, "session":Lcom/facebook/Session;
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    .line 182
    new-instance v27, Lorg/apache/cordova/PluginResult;

    sget-object v33, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    move-object/from16 v0, v27

    move-object/from16 v1, v33

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    .line 183
    .local v27, "pr":Lorg/apache/cordova/PluginResult;
    const/16 v33, 0x1

    move-object/from16 v0, v27

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 187
    move-object/from16 v0, p0

    move-object/from16 v1, v32

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->checkActiveSession(Lcom/facebook/Session;)Z

    move-result v33

    if-eqz v33, :cond_8

    .line 189
    const/16 v28, 0x0

    .line 190
    .local v28, "publishPermissions":Z
    const/16 v29, 0x0

    .line 192
    .local v29, "readPermissions":Z
    if-nez v25, :cond_2

    .line 194
    const/16 v29, 0x1

    .line 198
    :cond_2
    array-length v0, v6

    move/from16 v36, v0

    const/16 v33, 0x0

    :goto_1
    move/from16 v0, v33

    move/from16 v1, v36

    if-ge v0, v1, :cond_3

    aget-object v24, v6, v33

    .line 199
    .local v24, "permission":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->isPublishPermission(Ljava/lang/String;)Z

    move-result v37

    if-eqz v37, :cond_4

    .line 200
    const/16 v28, 0x1

    .line 205
    :goto_2
    if-eqz v28, :cond_5

    if-eqz v29, :cond_5

    .line 209
    .end local v24    # "permission":Ljava/lang/String;
    :cond_3
    if-eqz v28, :cond_6

    if-eqz v29, :cond_6

    .line 210
    const-string v33, "Cannot ask for both read and publish permissions."

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 249
    .end local v28    # "publishPermissions":Z
    .end local v29    # "readPermissions":Z
    :goto_3
    const/16 v33, 0x1

    .line 557
    .end local v6    # "arrayPermissions":[Ljava/lang/String;
    .end local v14    # "i":I
    .end local v25    # "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v27    # "pr":Lorg/apache/cordova/PluginResult;
    .end local v32    # "session":Lcom/facebook/Session;
    :goto_4
    return v33

    .line 202
    .restart local v6    # "arrayPermissions":[Ljava/lang/String;
    .restart local v14    # "i":I
    .restart local v24    # "permission":Ljava/lang/String;
    .restart local v25    # "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v27    # "pr":Lorg/apache/cordova/PluginResult;
    .restart local v28    # "publishPermissions":Z
    .restart local v29    # "readPermissions":Z
    .restart local v32    # "session":Lcom/facebook/Session;
    :cond_4
    const/16 v29, 0x1

    goto :goto_2

    .line 198
    :cond_5
    add-int/lit8 v33, v33, 0x1

    goto :goto_1

    .line 213
    .end local v24    # "permission":Ljava/lang/String;
    :cond_6
    new-instance v20, Lcom/facebook/Session$NewPermissionsRequest;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v20

    move-object/from16 v1, v33

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lcom/facebook/Session$NewPermissionsRequest;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    .line 215
    .local v20, "newPermissionsRequest":Lcom/facebook/Session$NewPermissionsRequest;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Lorg/apache/cordova/CordovaInterface;->setActivityResultCallback(Lorg/apache/cordova/CordovaPlugin;)V

    .line 217
    if-eqz v28, :cond_7

    .line 219
    move-object/from16 v0, v32

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->requestNewPublishPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V

    goto :goto_3

    .line 222
    :cond_7
    move-object/from16 v0, v32

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->requestNewReadPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V

    goto :goto_3

    .line 229
    .end local v20    # "newPermissionsRequest":Lcom/facebook/Session$NewPermissionsRequest;
    .end local v28    # "publishPermissions":Z
    .end local v29    # "readPermissions":Z
    :cond_8
    new-instance v33, Lcom/facebook/Session$Builder;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v36, v0

    invoke-interface/range {v36 .. v36}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v36

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-direct {v0, v1}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->applicationId:Ljava/lang/String;

    move-object/from16 v36, v0

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v33

    invoke-virtual/range {v33 .. v33}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v32

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Lorg/apache/cordova/CordovaInterface;->setActivityResultCallback(Lorg/apache/cordova/CordovaPlugin;)V

    .line 233
    invoke-static/range {v32 .. v32}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V

    .line 235
    new-instance v21, Lcom/facebook/Session$OpenRequest;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v21

    move-object/from16 v1, v33

    invoke-direct {v0, v1}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    .line 237
    .local v21, "openRequest":Lcom/facebook/Session$OpenRequest;
    move-object/from16 v0, v21

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    .line 239
    new-instance v33, Lorg/apache/cordova/facebook/ConnectPlugin$4;

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin$4;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V

    move-object/from16 v0, v21

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;

    .line 247
    move-object/from16 v0, v32

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V

    goto/16 :goto_3

    .line 250
    .end local v6    # "arrayPermissions":[Ljava/lang/String;
    .end local v14    # "i":I
    .end local v21    # "openRequest":Lcom/facebook/Session$OpenRequest;
    .end local v25    # "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v27    # "pr":Lorg/apache/cordova/PluginResult;
    .end local v32    # "session":Lcom/facebook/Session;
    :cond_9
    const-string v33, "logout"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_c

    .line 252
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v32

    .line 253
    .restart local v32    # "session":Lcom/facebook/Session;
    move-object/from16 v0, p0

    move-object/from16 v1, v32

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->checkActiveSession(Lcom/facebook/Session;)Z

    move-result v33

    if-eqz v33, :cond_a

    .line 254
    invoke-virtual/range {v32 .. v32}, Lcom/facebook/Session;->closeAndClearTokenInformation()V

    .line 255
    const/16 v33, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;

    .line 256
    invoke-virtual/range {p3 .. p3}, Lorg/apache/cordova/CallbackContext;->success()V

    .line 265
    :goto_5
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 258
    :cond_a
    if-eqz v32, :cond_b

    .line 260
    const-string v33, "Session not open."

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_5

    .line 262
    :cond_b
    const-string v33, "No valid session found, must call init and login before logout."

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_5

    .line 266
    .end local v32    # "session":Lcom/facebook/Session;
    :cond_c
    const-string v33, "getLoginStatus"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_e

    .line 267
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v32

    .line 268
    .restart local v32    # "session":Lcom/facebook/Session;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;

    move-object/from16 v33, v0

    if-nez v33, :cond_d

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v33

    if-eqz v33, :cond_d

    invoke-virtual/range {v32 .. v32}, Lcom/facebook/Session;->isOpened()Z

    move-result v33

    if-eqz v33, :cond_d

    .line 271
    move-object/from16 v4, p3

    .line 272
    .local v4, "_callbackContext":Lorg/apache/cordova/CallbackContext;
    new-instance v33, Lorg/apache/cordova/facebook/ConnectPlugin$5;

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Lorg/apache/cordova/facebook/ConnectPlugin$5;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/CallbackContext;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v32

    move-object/from16 v2, v33

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->getUserInfo(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)V

    .line 288
    .end local v4    # "_callbackContext":Lorg/apache/cordova/CallbackContext;
    :goto_6
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 286
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lorg/apache/cordova/facebook/ConnectPlugin;->getResponse()Lorg/json/JSONObject;

    move-result-object v33

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    goto :goto_6

    .line 289
    .end local v32    # "session":Lcom/facebook/Session;
    :cond_e
    const-string v33, "getAccessToken"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_11

    .line 290
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v32

    .line 291
    .restart local v32    # "session":Lcom/facebook/Session;
    move-object/from16 v0, p0

    move-object/from16 v1, v32

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->checkActiveSession(Lcom/facebook/Session;)Z

    move-result v33

    if-eqz v33, :cond_f

    .line 292
    invoke-virtual/range {v32 .. v32}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    .line 301
    :goto_7
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 294
    :cond_f
    if-nez v32, :cond_10

    .line 295
    const-string v33, "No valid session found, must call init and login before logout."

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_7

    .line 298
    :cond_10
    const-string v33, "Session not open."

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_7

    .line 302
    .end local v32    # "session":Lcom/facebook/Session;
    :cond_11
    const-string v33, "logEvent"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_17

    .line 303
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    if-nez v33, :cond_12

    .line 305
    const-string v33, "Invalid arguments"

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 306
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 308
    :cond_12
    const/16 v33, 0x0

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 309
    .local v13, "eventName":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    const/16 v36, 0x1

    move/from16 v0, v33

    move/from16 v1, v36

    if-ne v0, v1, :cond_14

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->logger:Lcom/facebook/AppEventsLogger;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    invoke-virtual {v0, v13}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;)V

    .line 344
    :cond_13
    :goto_8
    invoke-virtual/range {p3 .. p3}, Lorg/apache/cordova/CallbackContext;->success()V

    .line 345
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 313
    :cond_14
    const/16 v33, 0x1

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v23

    .line 314
    .local v23, "params":Lorg/json/JSONObject;
    new-instance v22, Landroid/os/Bundle;

    invoke-direct/range {v22 .. v22}, Landroid/os/Bundle;-><init>()V

    .line 316
    .local v22, "parameters":Landroid/os/Bundle;
    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v17

    .line 317
    .local v17, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :goto_9
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v33

    if-eqz v33, :cond_15

    .line 320
    :try_start_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 321
    .local v18, "key":Ljava/lang/String;
    move-object/from16 v0, v23

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    .line 322
    .local v34, "value":Ljava/lang/String;
    move-object/from16 v0, v22

    move-object/from16 v1, v18

    move-object/from16 v2, v34

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    .line 323
    .end local v18    # "key":Ljava/lang/String;
    .end local v34    # "value":Ljava/lang/String;
    :catch_0
    move-exception v11

    .line 325
    .local v11, "e":Ljava/lang/Exception;
    const-string v36, "ConnectPlugin"

    new-instance v33, Ljava/lang/StringBuilder;

    invoke-direct/range {v33 .. v33}, Ljava/lang/StringBuilder;-><init>()V

    const-string v37, "Type in AppEvent parameters was not String for key: "

    move-object/from16 v0, v33

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v37

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Ljava/lang/String;

    move-object/from16 v0, v37

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v33

    invoke-virtual/range {v33 .. v33}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, v36

    move-object/from16 v1, v33

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    :try_start_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 328
    .restart local v18    # "key":Ljava/lang/String;
    move-object/from16 v0, v23

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v34

    .line 329
    .local v34, "value":I
    move-object/from16 v0, v22

    move-object/from16 v1, v18

    move/from16 v2, v34

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    .line 330
    .end local v18    # "key":Ljava/lang/String;
    .end local v34    # "value":I
    :catch_1
    move-exception v12

    .line 332
    .local v12, "e2":Ljava/lang/Exception;
    const-string v36, "ConnectPlugin"

    new-instance v33, Ljava/lang/StringBuilder;

    invoke-direct/range {v33 .. v33}, Ljava/lang/StringBuilder;-><init>()V

    const-string v37, "Unsupported type in AppEvent parameters for key: "

    move-object/from16 v0, v33

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v37

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Ljava/lang/String;

    move-object/from16 v0, v37

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v33

    invoke-virtual/range {v33 .. v33}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, v36

    move-object/from16 v1, v33

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    .line 336
    .end local v11    # "e":Ljava/lang/Exception;
    .end local v12    # "e2":Ljava/lang/Exception;
    :cond_15
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    const/16 v36, 0x2

    move/from16 v0, v33

    move/from16 v1, v36

    if-ne v0, v1, :cond_16

    .line 337
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->logger:Lcom/facebook/AppEventsLogger;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, v22

    invoke-virtual {v0, v13, v1}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 339
    :cond_16
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    const/16 v36, 0x3

    move/from16 v0, v33

    move/from16 v1, v36

    if-ne v0, v1, :cond_13

    .line 340
    const/16 v33, 0x2

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v34

    .line 341
    .local v34, "value":D
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->logger:Lcom/facebook/AppEventsLogger;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-wide/from16 v1, v34

    move-object/from16 v3, v22

    invoke-virtual {v0, v13, v1, v2, v3}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;DLandroid/os/Bundle;)V

    goto/16 :goto_8

    .line 346
    .end local v13    # "eventName":Ljava/lang/String;
    .end local v17    # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v22    # "parameters":Landroid/os/Bundle;
    .end local v23    # "params":Lorg/json/JSONObject;
    .end local v34    # "value":D
    :cond_17
    const-string v33, "logPurchase"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_19

    .line 351
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v33

    const/16 v36, 0x2

    move/from16 v0, v33

    move/from16 v1, v36

    if-eq v0, v1, :cond_18

    .line 352
    const-string v33, "Invalid arguments"

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 353
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 355
    :cond_18
    const/16 v33, 0x0

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v34

    .line 356
    .local v34, "value":I
    const/16 v33, 0x1

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 357
    .local v9, "currency":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->logger:Lcom/facebook/AppEventsLogger;

    move-object/from16 v33, v0

    move/from16 v0, v34

    int-to-long v0, v0

    move-wide/from16 v36, v0

    invoke-static/range {v36 .. v37}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v36

    invoke-static {v9}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v37

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    move-object/from16 v2, v37

    invoke-virtual {v0, v1, v2}, Lcom/facebook/AppEventsLogger;->logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;)V

    .line 358
    invoke-virtual/range {p3 .. p3}, Lorg/apache/cordova/CallbackContext;->success()V

    .line 359
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 360
    .end local v9    # "currency":Ljava/lang/String;
    .end local v34    # "value":I
    :cond_19
    const-string v33, "showDialog"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_27

    .line 361
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 362
    .local v8, "collect":Landroid/os/Bundle;
    const/16 v23, 0x0

    .line 364
    .restart local v23    # "params":Lorg/json/JSONObject;
    const/16 v33, 0x0

    :try_start_2
    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v23

    .line 369
    :goto_a
    move-object/from16 v19, p0

    .line 370
    .local v19, "me":Lorg/apache/cordova/facebook/ConnectPlugin;
    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v16

    .line 371
    .local v16, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :goto_b
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v33

    if-eqz v33, :cond_1b

    .line 372
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 373
    .restart local v18    # "key":Ljava/lang/String;
    const-string v33, "method"

    move-object/from16 v0, v18

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1a

    .line 375
    :try_start_3
    move-object/from16 v0, v23

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->method:Ljava/lang/String;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_b

    .line 376
    :catch_2
    move-exception v11

    .line 377
    .local v11, "e":Lorg/json/JSONException;
    const-string v33, "ConnectPlugin"

    const-string v36, "Nonstring method parameter provided to dialog"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_b

    .line 365
    .end local v11    # "e":Lorg/json/JSONException;
    .end local v16    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v18    # "key":Ljava/lang/String;
    .end local v19    # "me":Lorg/apache/cordova/facebook/ConnectPlugin;
    :catch_3
    move-exception v11

    .line 366
    .restart local v11    # "e":Lorg/json/JSONException;
    new-instance v23, Lorg/json/JSONObject;

    .end local v23    # "params":Lorg/json/JSONObject;
    invoke-direct/range {v23 .. v23}, Lorg/json/JSONObject;-><init>()V

    .restart local v23    # "params":Lorg/json/JSONObject;
    goto :goto_a

    .line 381
    .end local v11    # "e":Lorg/json/JSONException;
    .restart local v16    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .restart local v18    # "key":Ljava/lang/String;
    .restart local v19    # "me":Lorg/apache/cordova/facebook/ConnectPlugin;
    :cond_1a
    :try_start_4
    move-object/from16 v0, v23

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, v18

    move-object/from16 v1, v33

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_b

    .line 382
    :catch_4
    move-exception v11

    .line 384
    .restart local v11    # "e":Lorg/json/JSONException;
    const-string v33, "ConnectPlugin"

    const-string v36, "Nonstring parameter provided to dialog discarded"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_b

    .line 388
    .end local v11    # "e":Lorg/json/JSONException;
    .end local v18    # "key":Ljava/lang/String;
    :cond_1b
    new-instance v33, Landroid/os/Bundle;

    move-object/from16 v0, v33

    invoke-direct {v0, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;

    .line 392
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->method:Ljava/lang/String;

    move-object/from16 v33, v0

    const-string v36, "share"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v33

    if-nez v33, :cond_1c

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->method:Ljava/lang/String;

    move-object/from16 v33, v0

    const-string v36, "share_open_graph"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v33

    if-eqz v33, :cond_1e

    :cond_1c
    const/4 v15, 0x1

    .line 395
    .local v15, "isShareDialog":Z
    :goto_c
    if-eqz v15, :cond_1f

    move-object/from16 v0, v19

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    const/16 v36, 0x1

    move/from16 v0, v36

    new-array v0, v0, [Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;

    move-object/from16 v36, v0

    const/16 v37, 0x0

    sget-object v38, Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;->SHARE_DIALOG:Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;

    aput-object v38, v36, v37

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Lcom/facebook/widget/FacebookDialog;->canPresentShareDialog(Landroid/content/Context;[Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/4 v7, 0x1

    .line 397
    .local v7, "canPresentShareDialog":Z
    :goto_d
    if-eqz v15, :cond_1d

    if-nez v7, :cond_20

    :cond_1d
    const/16 v30, 0x1

    .line 398
    .local v30, "requiresAnActiveSession":Z
    :goto_e
    if-eqz v30, :cond_21

    .line 399
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v32

    .line 400
    .restart local v32    # "session":Lcom/facebook/Session;
    move-object/from16 v0, p0

    move-object/from16 v1, v32

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->checkActiveSession(Lcom/facebook/Session;)Z

    move-result v33

    if-nez v33, :cond_21

    .line 401
    const-string v33, "No active session"

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 402
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 392
    .end local v7    # "canPresentShareDialog":Z
    .end local v15    # "isShareDialog":Z
    .end local v30    # "requiresAnActiveSession":Z
    .end local v32    # "session":Lcom/facebook/Session;
    :cond_1e
    const/4 v15, 0x0

    goto :goto_c

    .line 395
    .restart local v15    # "isShareDialog":Z
    :cond_1f
    const/4 v7, 0x0

    goto :goto_d

    .line 397
    .restart local v7    # "canPresentShareDialog":Z
    :cond_20
    const/16 v30, 0x0

    goto :goto_e

    .line 407
    .restart local v30    # "requiresAnActiveSession":Z
    :cond_21
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;

    .line 408
    new-instance v27, Lorg/apache/cordova/PluginResult;

    sget-object v33, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    move-object/from16 v0, v27

    move-object/from16 v1, v33

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    .line 409
    .restart local v27    # "pr":Lorg/apache/cordova/PluginResult;
    const/16 v33, 0x1

    move-object/from16 v0, v27

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 413
    new-instance v10, Lorg/apache/cordova/facebook/ConnectPlugin$6;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lorg/apache/cordova/facebook/ConnectPlugin$6;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V

    .line 425
    .local v10, "dialogCallback":Lcom/facebook/widget/WebDialog$OnCompleteListener;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->method:Ljava/lang/String;

    move-object/from16 v33, v0

    const-string v36, "feed"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v33

    if-eqz v33, :cond_22

    .line 426
    new-instance v31, Lorg/apache/cordova/facebook/ConnectPlugin$7;

    move-object/from16 v0, v31

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2, v10}, Lorg/apache/cordova/facebook/ConnectPlugin$7;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;Lcom/facebook/widget/WebDialog$OnCompleteListener;)V

    .line 432
    .local v31, "runnable":Ljava/lang/Runnable;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 501
    .end local v31    # "runnable":Ljava/lang/Runnable;
    :goto_f
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 433
    :cond_22
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->method:Ljava/lang/String;

    move-object/from16 v33, v0

    const-string v36, "apprequests"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v33

    if-eqz v33, :cond_23

    .line 434
    new-instance v31, Lorg/apache/cordova/facebook/ConnectPlugin$8;

    move-object/from16 v0, v31

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2, v10}, Lorg/apache/cordova/facebook/ConnectPlugin$8;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;Lcom/facebook/widget/WebDialog$OnCompleteListener;)V

    .line 441
    .restart local v31    # "runnable":Ljava/lang/Runnable;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_f

    .line 442
    .end local v31    # "runnable":Ljava/lang/Runnable;
    :cond_23
    if-eqz v15, :cond_25

    .line 443
    if-eqz v7, :cond_24

    .line 444
    new-instance v31, Lorg/apache/cordova/facebook/ConnectPlugin$9;

    move-object/from16 v0, v31

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin$9;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;)V

    .line 457
    .restart local v31    # "runnable":Ljava/lang/Runnable;
    const/16 v33, 0x1

    move/from16 v0, v33

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_f

    .line 461
    .end local v31    # "runnable":Ljava/lang/Runnable;
    :cond_24
    new-instance v31, Lorg/apache/cordova/facebook/ConnectPlugin$10;

    move-object/from16 v0, v31

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2, v10}, Lorg/apache/cordova/facebook/ConnectPlugin$10;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;Lcom/facebook/widget/WebDialog$OnCompleteListener;)V

    .line 467
    .restart local v31    # "runnable":Ljava/lang/Runnable;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_f

    .line 469
    .end local v31    # "runnable":Ljava/lang/Runnable;
    :cond_25
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->method:Ljava/lang/String;

    move-object/from16 v33, v0

    const-string v36, "send"

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v33

    if-eqz v33, :cond_26

    .line 470
    new-instance v31, Lorg/apache/cordova/facebook/ConnectPlugin$11;

    move-object/from16 v0, v31

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin$11;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;)V

    .line 496
    .restart local v31    # "runnable":Ljava/lang/Runnable;
    const/16 v33, 0x1

    move/from16 v0, v33

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z

    .line 497
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_f

    .line 499
    .end local v31    # "runnable":Ljava/lang/Runnable;
    :cond_26
    const-string v33, "Unsupported dialog method."

    move-object/from16 v0, p3

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto/16 :goto_f

    .line 502
    .end local v7    # "canPresentShareDialog":Z
    .end local v8    # "collect":Landroid/os/Bundle;
    .end local v10    # "dialogCallback":Lcom/facebook/widget/WebDialog$OnCompleteListener;
    .end local v15    # "isShareDialog":Z
    .end local v16    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v19    # "me":Lorg/apache/cordova/facebook/ConnectPlugin;
    .end local v23    # "params":Lorg/json/JSONObject;
    .end local v27    # "pr":Lorg/apache/cordova/PluginResult;
    .end local v30    # "requiresAnActiveSession":Z
    :cond_27
    const-string v33, "graphApi"

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_30

    .line 503
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    .line 504
    new-instance v27, Lorg/apache/cordova/PluginResult;

    sget-object v33, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    move-object/from16 v0, v27

    move-object/from16 v1, v33

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    .line 505
    .restart local v27    # "pr":Lorg/apache/cordova/PluginResult;
    const/16 v33, 0x1

    move-object/from16 v0, v27

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 506
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 508
    const/16 v33, 0x0

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/apache/cordova/facebook/ConnectPlugin;->graphPath:Ljava/lang/String;

    .line 510
    const/16 v33, 0x1

    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v5

    .line 512
    .local v5, "arr":Lorg/json/JSONArray;
    new-instance v26, Ljava/util/ArrayList;

    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    .line 513
    .local v26, "permissionsList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v14, 0x0

    .restart local v14    # "i":I
    :goto_10
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v33

    move/from16 v0, v33

    if-ge v14, v0, :cond_28

    .line 514
    invoke-virtual {v5, v14}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v0, v26

    move-object/from16 v1, v33

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 513
    add-int/lit8 v14, v14, 0x1

    goto :goto_10

    .line 517
    :cond_28
    const/16 v28, 0x0

    .line 518
    .restart local v28    # "publishPermissions":Z
    const/16 v29, 0x0

    .line 519
    .restart local v29    # "readPermissions":Z
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    move-result v33

    if-lez v33, :cond_2f

    .line 520
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v33

    :cond_29
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    move-result v36

    if-eqz v36, :cond_2a

    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/String;

    .line 521
    .restart local v24    # "permission":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    invoke-direct {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->isPublishPermission(Ljava/lang/String;)Z

    move-result v36

    if-eqz v36, :cond_2b

    .line 522
    const/16 v28, 0x1

    .line 527
    :goto_11
    if-eqz v28, :cond_29

    if-eqz v29, :cond_29

    .line 531
    .end local v24    # "permission":Ljava/lang/String;
    :cond_2a
    if-eqz v28, :cond_2c

    if-eqz v29, :cond_2c

    .line 532
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;

    move-object/from16 v33, v0

    const-string v36, "Cannot ask for both read and publish permissions."

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 555
    :goto_12
    const/16 v33, 0x1

    goto/16 :goto_4

    .line 524
    .restart local v24    # "permission":Ljava/lang/String;
    :cond_2b
    const/16 v29, 0x1

    goto :goto_11

    .line 534
    .end local v24    # "permission":Ljava/lang/String;
    :cond_2c
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v32

    .line 535
    .restart local v32    # "session":Lcom/facebook/Session;
    invoke-virtual/range {v32 .. v32}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v33

    move-object/from16 v0, v33

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v33

    if-eqz v33, :cond_2d

    .line 536
    invoke-direct/range {p0 .. p0}, Lorg/apache/cordova/facebook/ConnectPlugin;->makeGraphCall()V

    goto :goto_12

    .line 539
    :cond_2d
    new-instance v20, Lcom/facebook/Session$NewPermissionsRequest;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    invoke-interface/range {v33 .. v33}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v33

    move-object/from16 v0, v20

    move-object/from16 v1, v33

    move-object/from16 v2, v26

    invoke-direct {v0, v1, v2}, Lcom/facebook/Session$NewPermissionsRequest;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    .line 541
    .restart local v20    # "newPermissionsRequest":Lcom/facebook/Session$NewPermissionsRequest;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v33, v0

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Lorg/apache/cordova/CordovaInterface;->setActivityResultCallback(Lorg/apache/cordova/CordovaPlugin;)V

    .line 543
    if-eqz v28, :cond_2e

    .line 545
    move-object/from16 v0, v32

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->requestNewPublishPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V

    goto :goto_12

    .line 548
    :cond_2e
    move-object/from16 v0, v32

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->requestNewReadPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V

    goto :goto_12

    .line 553
    .end local v20    # "newPermissionsRequest":Lcom/facebook/Session$NewPermissionsRequest;
    .end local v32    # "session":Lcom/facebook/Session;
    :cond_2f
    invoke-direct/range {p0 .. p0}, Lorg/apache/cordova/facebook/ConnectPlugin;->makeGraphCall()V

    goto :goto_12

    .line 557
    .end local v5    # "arr":Lorg/json/JSONArray;
    .end local v14    # "i":I
    .end local v26    # "permissionsList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v27    # "pr":Lorg/apache/cordova/PluginResult;
    .end local v28    # "publishPermissions":Z
    .end local v29    # "readPermissions":Z
    :cond_30
    const/16 v33, 0x0

    goto/16 :goto_4
.end method

.method public getErrorResponse(Ljava/lang/Exception;Ljava/lang/String;I)Lorg/json/JSONObject;
    .locals 4
    .param p1, "error"    # Ljava/lang/Exception;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "errorCode"    # I

    .prologue
    .line 797
    instance-of v2, p1, Lcom/facebook/FacebookServiceException;

    if-eqz v2, :cond_0

    .line 798
    check-cast p1, Lcom/facebook/FacebookServiceException;

    .end local p1    # "error":Ljava/lang/Exception;
    invoke-virtual {p1}, Lcom/facebook/FacebookServiceException;->getRequestError()Lcom/facebook/FacebookRequestError;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->getFacebookRequestErrorResponse(Lcom/facebook/FacebookRequestError;)Lorg/json/JSONObject;

    move-result-object v2

    .line 823
    :goto_0
    return-object v2

    .line 801
    .restart local p1    # "error":Ljava/lang/Exception;
    :cond_0
    const-string v1, "{"

    .line 803
    .local v1, "response":Ljava/lang/String;
    instance-of v2, p1, Lcom/facebook/FacebookDialogException;

    if-eqz v2, :cond_1

    move-object v2, p1

    .line 804
    check-cast v2, Lcom/facebook/FacebookDialogException;

    invoke-virtual {v2}, Lcom/facebook/FacebookDialogException;->getErrorCode()I

    move-result p3

    .line 807
    :cond_1
    const/4 v2, -0x2

    if-eq p3, v2, :cond_2

    .line 808
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"errorCode\": \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 811
    :cond_2
    if-nez p2, :cond_3

    .line 812
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 815
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"errorMessage\": \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 818
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 819
    :catch_0
    move-exception v0

    .line 821
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 823
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0
.end method

.method public getFacebookRequestErrorResponse(Lcom/facebook/FacebookRequestError;)Lorg/json/JSONObject;
    .locals 7
    .param p1, "error"    # Lcom/facebook/FacebookRequestError;

    .prologue
    .line 768
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "{\"errorCode\": \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 769
    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError;->getErrorCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\"errorType\": \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 770
    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError;->getErrorType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\"errorMessage\": \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 771
    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 773
    .local v3, "response":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError;->getUserActionMessageId()I

    move-result v2

    .line 776
    .local v2, "messageId":I
    if-eqz v2, :cond_0

    .line 777
    iget-object v4, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 779
    .local v1, "errorUserMessage":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 780
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ",\"errorUserMessage\": \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v5}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError;->getUserActionMessageId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 784
    .end local v1    # "errorUserMessage":Ljava/lang/String;
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "}"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 787
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 792
    :goto_0
    return-object v4

    .line 788
    :catch_0
    move-exception v0

    .line 790
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 792
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0
.end method

.method public getResponse()Lorg/json/JSONObject;
    .locals 12

    .prologue
    const-wide/16 v2, 0x0

    .line 737
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v6

    .line 738
    .local v6, "session":Lcom/facebook/Session;
    invoke-direct {p0, v6}, Lorg/apache/cordova/facebook/ConnectPlugin;->checkActiveSession(Lcom/facebook/Session;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 739
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 740
    .local v7, "today":Ljava/util/Date;
    invoke-virtual {v6}, Lcom/facebook/Session;->getExpirationDate()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    sub-long/2addr v8, v10

    const-wide/16 v10, 0x3e8

    div-long v4, v8, v10

    .line 741
    .local v4, "expiresTimeInterval":J
    cmp-long v8, v4, v2

    if-lez v8, :cond_0

    move-wide v2, v4

    .line 742
    .local v2, "expiresIn":J
    :cond_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "{\"status\": \"connected\",\"authResponse\": {\"accessToken\": \""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 745
    invoke-virtual {v6}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\"expiresIn\": \""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\"session_key\": true,"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\"sig\": \"...\","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\"userID\": \""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-object v9, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "}"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "}"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 758
    .end local v2    # "expiresIn":J
    .end local v4    # "expiresTimeInterval":J
    .end local v7    # "today":Ljava/util/Date;
    .local v1, "response":Ljava/lang/String;
    :goto_0
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 763
    :goto_1
    return-object v8

    .line 753
    .end local v1    # "response":Ljava/lang/String;
    :cond_1
    const-string v1, "{\"status\": \"unknown\"}"

    .restart local v1    # "response":Ljava/lang/String;
    goto :goto_0

    .line 759
    :catch_0
    move-exception v0

    .line 761
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 763
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1
.end method

.method public initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 8
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    const/4 v7, 0x0

    .line 77
    new-instance v3, Lcom/facebook/UiLifecycleHelper;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v3, v4, v7}, Lcom/facebook/UiLifecycleHelper;-><init>(Landroid/app/Activity;Lcom/facebook/Session$StatusCallback;)V

    iput-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    .line 80
    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/AppEventsLogger;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->logger:Lcom/facebook/AppEventsLogger;

    .line 82
    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "fb_app_id"

    const-string v5, "string"

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 83
    .local v0, "appResId":I
    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->applicationId:Ljava/lang/String;

    .line 86
    invoke-interface {p1, p0}, Lorg/apache/cordova/CordovaInterface;->setActivityResultCallback(Lorg/apache/cordova/CordovaPlugin;)V

    .line 89
    new-instance v3, Lcom/facebook/Session$Builder;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->applicationId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v2

    .line 90
    .local v2, "session":Lcom/facebook/Session;
    invoke-virtual {v2}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v3

    sget-object v4, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;

    if-ne v3, v4, :cond_0

    .line 91
    invoke-static {v2}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V

    .line 93
    new-instance v1, Lcom/facebook/Session$OpenRequest;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    .line 95
    .local v1, "openRequest":Lcom/facebook/Session$OpenRequest;
    new-instance v3, Lorg/apache/cordova/facebook/ConnectPlugin$2;

    invoke-direct {v3, p0}, Lorg/apache/cordova/facebook/ConnectPlugin$2;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V

    invoke-virtual {v1, v3}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;

    .line 101
    invoke-virtual {v2, v1}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V

    .line 105
    .end local v1    # "openRequest":Lcom/facebook/Session$OpenRequest;
    :cond_0
    invoke-direct {p0, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->checkActiveSession(Lcom/facebook/Session;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 107
    invoke-virtual {v2}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v3

    invoke-direct {p0, v3, v7}, Lorg/apache/cordova/facebook/ConnectPlugin;->onSessionStateChange(Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    .line 109
    :cond_1
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaPlugin;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 110
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "intent"    # Landroid/content/Intent;

    .prologue
    .line 136
    invoke-super {p0, p1, p2, p3}, Lorg/apache/cordova/CordovaPlugin;->onActivityResult(IILandroid/content/Intent;)V

    .line 137
    const-string v1, "ConnectPlugin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activity result in plugin: requestCode("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "), resultCode("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    iget-boolean v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z

    if-eqz v1, :cond_1

    .line 139
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    new-instance v2, Lorg/apache/cordova/facebook/ConnectPlugin$3;

    invoke-direct {v2, p0}, Lorg/apache/cordova/facebook/ConnectPlugin$3;-><init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V

    invoke-virtual {v1, p1, p2, p3, v2}, Lcom/facebook/UiLifecycleHelper;->onActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)V

    .line 158
    :cond_0
    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z

    .line 159
    return-void

    .line 153
    :cond_1
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 154
    .local v0, "session":Lcom/facebook/Session;
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;

    if-eqz v1, :cond_0

    .line 155
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 130
    invoke-super {p0}, Lorg/apache/cordova/CordovaPlugin;->onDestroy()V

    .line 131
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    invoke-virtual {v0}, Lcom/facebook/UiLifecycleHelper;->onDestroy()V

    .line 132
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    invoke-virtual {v0}, Lcom/facebook/UiLifecycleHelper;->onPause()V

    .line 126
    return-void
.end method

.method public onResume(Z)V
    .locals 1
    .param p1, "multitasking"    # Z

    .prologue
    .line 114
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaPlugin;->onResume(Z)V

    .line 115
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    invoke-virtual {v0}, Lcom/facebook/UiLifecycleHelper;->onResume()V

    .line 117
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/AppEventsLogger;->activateApp(Landroid/content/Context;)V

    .line 118
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 121
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    invoke-virtual {v0, p1}, Lcom/facebook/UiLifecycleHelper;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 122
    return-void
.end method

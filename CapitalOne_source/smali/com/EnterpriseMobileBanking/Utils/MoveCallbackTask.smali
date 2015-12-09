.class public Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;
.super Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.source "MoveCallbackTask.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "MoveCBT"

.field private static final actions:[Ljava/lang/String;

.field private static lastMovement:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 12
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "moveInnerWebView"

    aput-object v1, v0, v2

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;->actions:[Ljava/lang/String;

    .line 16
    sput v2, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;->lastMovement:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>()V

    .line 23
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 0
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 28
    return-void
.end method

.method public static getLastMovement()I
    .locals 1

    .prologue
    .line 36
    sget v0, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;->lastMovement:I

    return v0
.end method

.method public static load()V
    .locals 2

    .prologue
    .line 31
    const-string v0, "MoveCBT"

    const-string v1, "Loading"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;->actions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V

    .line 33
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 3
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 49
    const-string v0, "MoveCBT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Create: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;

    invoke-direct {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    return-object v0
.end method

.method public execute(Landroid/webkit/WebView;)V
    .locals 0
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 41
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 42
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 43
    return-void
.end method

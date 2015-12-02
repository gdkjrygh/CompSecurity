.class public Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;
.super Landroid/app/IntentService;
.source "FbPushDataHandlerService.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/fbpushdata/a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private d:Lcom/facebook/analytics/cn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;

    sput-object v0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 39
    const-string v0, "FbPushDataHandlerService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 40
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/push/g;)V
    .locals 3

    .prologue
    .line 43
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 44
    const-string v1, "message_content"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    const-string v1, "push_source"

    invoke-virtual {p2}, Lcom/facebook/push/g;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 47
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 51
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 53
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 54
    const-class v0, Lcom/facebook/push/fbpushdata/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->b:Ljava/util/Set;

    .line 55
    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 56
    const-class v0, Lcom/facebook/analytics/cn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cn;

    iput-object v0, p0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->d:Lcom/facebook/analytics/cn;

    .line 57
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 6

    .prologue
    .line 63
    const-string v0, "message_content"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    const-string v1, "push_source"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/push/g;->valueOf(Ljava/lang/String;)Lcom/facebook/push/g;

    move-result-object v1

    .line 65
    sget-object v2, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->a:Ljava/lang/Class;

    const-string v3, "Received FbPushData msg from %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :try_start_0
    iget-object v2, p0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 70
    iget-object v0, p0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/fbpushdata/a;

    .line 71
    invoke-interface {v0, v2, v1}, Lcom/facebook/push/fbpushdata/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/push/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    iget-object v1, p0, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->d:Lcom/facebook/analytics/cn;

    const-string v2, ""

    const-string v3, ""

    sget-object v4, Lcom/facebook/push/h;->C2DM:Lcom/facebook/push/h;

    invoke-virtual {v4}, Lcom/facebook/push/h;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "invalid_json"

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    sget-object v1, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->a:Ljava/lang/Class;

    const-string v2, "Invalid JSON"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    :cond_0
    return-void
.end method

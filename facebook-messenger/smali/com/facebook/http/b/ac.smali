.class Lcom/facebook/http/b/ac;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lorg/apache/http/conn/ClientConnectionManager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/facebook/http/b/ac;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 239
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ac;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/apache/http/conn/ClientConnectionManager;
    .locals 10

    .prologue
    .line 243
    const-class v0, Lorg/apache/http/params/HttpParams;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/http/params/HttpParams;

    .line 244
    new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 245
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v4

    const/16 v5, 0x50

    invoke-direct {v0, v1, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v3, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 246
    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v4, "https"

    const-class v0, Lorg/apache/http/conn/scheme/SocketFactory;

    const-class v5, Lcom/facebook/http/annotations/SslSocketFactory;

    invoke-virtual {p0, v0, v5}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/conn/scheme/SocketFactory;

    const/16 v5, 0x1bb

    invoke-direct {v1, v4, v0, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v3, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 249
    new-instance v0, Lcom/facebook/http/b/g;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v4, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v4}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/time/a;

    const-class v5, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v5}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/executors/a;

    const-class v6, Landroid/os/PowerManager;

    invoke-virtual {p0, v6}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/PowerManager;

    const-class v7, Lcom/facebook/common/hardware/n;

    invoke-virtual {p0, v7}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/hardware/n;

    const-class v8, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v9, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v9, Lcom/facebook/analytics/e/i;

    invoke-virtual {p0, v9}, Lcom/facebook/http/b/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/analytics/e/i;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/http/b/g;-><init>(Landroid/content/Context;Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;Lcom/facebook/common/time/a;Lcom/facebook/common/executors/a;Landroid/os/PowerManager;Lcom/facebook/common/hardware/n;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/analytics/e/i;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 239
    invoke-virtual {p0}, Lcom/facebook/http/b/ac;->a()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    return-object v0
.end method

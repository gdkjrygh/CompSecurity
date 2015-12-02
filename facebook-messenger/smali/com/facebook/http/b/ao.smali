.class Lcom/facebook/http/b/ao;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lorg/apache/http/conn/scheme/SocketFactory;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 388
    iput-object p1, p0, Lcom/facebook/http/b/ao;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 388
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ao;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/apache/http/conn/scheme/SocketFactory;
    .locals 5

    .prologue
    .line 392
    const-class v0, Ljava/lang/String;

    const-class v1, Lcom/facebook/http/annotations/UserAgentString;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/http/b/ao;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 394
    const-class v1, Lcom/facebook/http/c/e;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/ao;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/c/e;

    .line 395
    invoke-virtual {p0}, Lcom/facebook/http/b/ao;->e()Lcom/facebook/inject/ab;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    invoke-interface {v2, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    .line 396
    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/http/annotations/IsSslPersistentCacheEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/http/b/ao;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    .line 398
    invoke-interface {v1}, Lcom/facebook/http/c/e;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 399
    invoke-static {}, Lcom/facebook/http/b/ay;->a()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v0

    .line 405
    :goto_0
    return-object v0

    .line 400
    :cond_0
    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 401
    invoke-static {v2, v0}, Lcom/facebook/http/b/w;->a(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v0

    goto :goto_0

    .line 403
    :cond_1
    invoke-static {v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 388
    invoke-virtual {p0}, Lcom/facebook/http/b/ao;->a()Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v0

    return-object v0
.end method

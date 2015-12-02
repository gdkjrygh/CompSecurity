.class public Lcom/facebook/http/c/g;
.super Ljava/lang/Object;
.source "NetworkConfigUpdater.java"


# instance fields
.field private final a:Lcom/facebook/http/b/m;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lorg/apache/http/conn/scheme/SocketFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/http/c/e;


# direct methods
.method public constructor <init>(Lcom/facebook/http/b/m;Ljavax/inject/a;Lcom/facebook/http/c/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/b/m;",
            "Ljavax/inject/a",
            "<",
            "Lorg/apache/http/conn/scheme/SocketFactory;",
            ">;",
            "Lcom/facebook/http/c/e;",
            ")V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/http/c/g;->a:Lcom/facebook/http/b/m;

    .line 26
    iput-object p2, p0, Lcom/facebook/http/c/g;->b:Ljavax/inject/a;

    .line 27
    iput-object p3, p0, Lcom/facebook/http/c/g;->c:Lcom/facebook/http/c/e;

    .line 28
    iget-object v0, p0, Lcom/facebook/http/c/g;->c:Lcom/facebook/http/c/e;

    new-instance v1, Lcom/facebook/http/c/h;

    invoke-direct {v1, p0}, Lcom/facebook/http/c/h;-><init>(Lcom/facebook/http/c/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/http/c/e;->a(Lcom/facebook/http/c/f;)V

    .line 34
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/http/c/g;->a:Lcom/facebook/http/b/m;

    invoke-interface {v0}, Lcom/facebook/http/b/m;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;

    move-result-object v1

    .line 39
    new-instance v2, Lorg/apache/http/conn/scheme/Scheme;

    const-string v3, "https"

    iget-object v0, p0, Lcom/facebook/http/c/g;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/conn/scheme/SocketFactory;

    const/16 v4, 0x1bb

    invoke-direct {v2, v3, v0, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 42
    iget-object v0, p0, Lcom/facebook/http/c/g;->a:Lcom/facebook/http/b/m;

    invoke-interface {v0}, Lcom/facebook/http/b/m;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    .line 43
    const-string v1, "http.route.default-proxy"

    iget-object v2, p0, Lcom/facebook/http/c/g;->c:Lcom/facebook/http/c/e;

    invoke-interface {v2}, Lcom/facebook/http/c/e;->a()Lorg/apache/http/HttpHost;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 44
    return-void
.end method

.method static synthetic a(Lcom/facebook/http/c/g;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/http/c/g;->a()V

    return-void
.end method

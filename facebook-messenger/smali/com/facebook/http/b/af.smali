.class Lcom/facebook/http/b/af;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/b/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/facebook/http/b/af;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 180
    invoke-direct {p0, p1}, Lcom/facebook/http/b/af;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/b/m;
    .locals 8

    .prologue
    .line 183
    new-instance v0, Lcom/facebook/http/b/o;

    const-class v1, Lorg/apache/http/conn/ClientConnectionManager;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/http/conn/ClientConnectionManager;

    const-class v2, Lorg/apache/http/params/HttpParams;

    invoke-virtual {p0, v2}, Lcom/facebook/http/b/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/http/params/HttpParams;

    const-class v3, Lcom/facebook/http/b/l;

    invoke-virtual {p0, v3}, Lcom/facebook/http/b/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/http/b/l;

    const-class v4, Lcom/facebook/http/b/aq;

    invoke-virtual {p0, v4}, Lcom/facebook/http/b/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/http/client/HttpRequestRetryHandler;

    const-class v5, Lcom/facebook/http/b/t;

    invoke-virtual {p0, v5}, Lcom/facebook/http/b/af;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v5

    const-class v6, Lcom/facebook/http/b/au;

    invoke-virtual {p0, v6}, Lcom/facebook/http/b/af;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v6

    const-class v7, Lcom/facebook/analytics/e/i;

    invoke-virtual {p0, v7}, Lcom/facebook/http/b/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/analytics/e/i;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/http/b/o;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;Lcom/facebook/http/b/l;Lorg/apache/http/client/HttpRequestRetryHandler;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/analytics/e/i;)V

    .line 192
    const-class v1, Lcom/facebook/http/b/u;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/af;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v1

    .line 193
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/b/u;

    .line 194
    invoke-interface {v0, v1}, Lcom/facebook/http/b/u;->a(Lcom/facebook/http/b/m;)Lcom/facebook/http/b/m;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 197
    :cond_0
    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/facebook/http/b/af;->a()Lcom/facebook/http/b/m;

    move-result-object v0

    return-object v0
.end method

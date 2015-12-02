.class public Lcom/facebook/k/b;
.super Ljava/lang/Object;
.source "NetworkActivityFbHttpClientObserver.java"

# interfaces
.implements Lcom/facebook/http/b/t;


# instance fields
.field private final a:Lcom/facebook/k/a;


# direct methods
.method public constructor <init>(Lcom/facebook/k/a;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/k/b;->a:Lcom/facebook/k/a;

    .line 24
    return-void
.end method

.method static synthetic a(Lcom/facebook/k/b;)Lcom/facebook/k/a;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/facebook/k/b;->a:Lcom/facebook/k/a;

    return-object v0
.end method


# virtual methods
.method public a(Lorg/apache/http/protocol/HttpRequestInterceptorList;Lorg/apache/http/protocol/HttpResponseInterceptorList;)V
    .locals 2

    .prologue
    .line 31
    new-instance v0, Lcom/facebook/k/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/k/d;-><init>(Lcom/facebook/k/b;Lcom/facebook/k/c;)V

    invoke-interface {p1, v0}, Lorg/apache/http/protocol/HttpRequestInterceptorList;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 32
    return-void
.end method

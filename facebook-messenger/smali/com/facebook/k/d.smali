.class final Lcom/facebook/k/d;
.super Ljava/lang/Object;
.source "NetworkActivityFbHttpClientObserver.java"

# interfaces
.implements Lorg/apache/http/HttpRequestInterceptor;


# instance fields
.field final synthetic a:Lcom/facebook/k/b;


# direct methods
.method private constructor <init>(Lcom/facebook/k/b;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/facebook/k/d;->a:Lcom/facebook/k/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/k/b;Lcom/facebook/k/c;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/k/d;-><init>(Lcom/facebook/k/b;)V

    return-void
.end method


# virtual methods
.method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/k/d;->a:Lcom/facebook/k/b;

    invoke-static {v0}, Lcom/facebook/k/b;->a(Lcom/facebook/k/b;)Lcom/facebook/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/k/a;->a()V

    .line 41
    return-void
.end method

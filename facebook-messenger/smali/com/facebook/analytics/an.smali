.class public Lcom/facebook/analytics/an;
.super Ljava/lang/Object;
.source "AnalyticsFbHttpClientObserver.java"

# interfaces
.implements Lcom/facebook/http/b/t;


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
.field private final b:Lcom/facebook/analytics/ck;

.field private final c:Lcom/facebook/analytics/i/d;

.field private final d:Lcom/facebook/http/b/au;

.field private final e:Lcom/facebook/http/b/ar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/analytics/an;

    sput-object v0, Lcom/facebook/analytics/an;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/ck;Lcom/facebook/analytics/i/d;Lcom/facebook/http/b/au;Lcom/facebook/http/b/ar;)V
    .locals 0
    .param p1    # Lcom/facebook/analytics/ck;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/analytics/an;->b:Lcom/facebook/analytics/ck;

    .line 44
    iput-object p2, p0, Lcom/facebook/analytics/an;->c:Lcom/facebook/analytics/i/d;

    .line 45
    iput-object p3, p0, Lcom/facebook/analytics/an;->d:Lcom/facebook/http/b/au;

    .line 46
    iput-object p4, p0, Lcom/facebook/analytics/an;->e:Lcom/facebook/http/b/ar;

    .line 47
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/i/d;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/analytics/an;->c:Lcom/facebook/analytics/i/d;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/ar;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/analytics/an;->e:Lcom/facebook/http/b/ar;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/ck;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/analytics/an;->b:Lcom/facebook/analytics/ck;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/au;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/analytics/an;->d:Lcom/facebook/http/b/au;

    return-object v0
.end method


# virtual methods
.method public a(Lorg/apache/http/protocol/HttpRequestInterceptorList;Lorg/apache/http/protocol/HttpResponseInterceptorList;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 52
    iget-object v0, p0, Lcom/facebook/analytics/an;->b:Lcom/facebook/analytics/ck;

    if-nez v0, :cond_0

    .line 62
    :goto_0
    return-void

    .line 58
    :cond_0
    new-instance v0, Lcom/facebook/analytics/ap;

    invoke-direct {v0, p0, v1}, Lcom/facebook/analytics/ap;-><init>(Lcom/facebook/analytics/an;Lcom/facebook/analytics/ao;)V

    invoke-interface {p1, v0}, Lorg/apache/http/protocol/HttpRequestInterceptorList;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 61
    new-instance v0, Lcom/facebook/analytics/aq;

    invoke-direct {v0, p0, v1}, Lcom/facebook/analytics/aq;-><init>(Lcom/facebook/analytics/an;Lcom/facebook/analytics/ao;)V

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lorg/apache/http/protocol/HttpResponseInterceptorList;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;I)V

    goto :goto_0
.end method

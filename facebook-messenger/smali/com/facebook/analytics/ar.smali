.class final Lcom/facebook/analytics/ar;
.super Lorg/apache/http/entity/HttpEntityWrapper;
.source "AnalyticsFbHttpClientObserver.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/an;

.field private final b:Ljava/net/URI;

.field private final c:Ljava/lang/String;

.field private final d:Lorg/apache/http/protocol/HttpContext;

.field private final e:Z

.field private f:J


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/an;Lorg/apache/http/HttpEntity;Ljava/net/URI;Ljava/lang/String;Lorg/apache/http/protocol/HttpContext;Z)V
    .locals 2

    .prologue
    .line 110
    iput-object p1, p0, Lcom/facebook/analytics/ar;->a:Lcom/facebook/analytics/an;

    .line 111
    invoke-direct {p0, p2}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V

    .line 103
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/ar;->f:J

    .line 112
    iput-object p3, p0, Lcom/facebook/analytics/ar;->b:Ljava/net/URI;

    .line 113
    iput-object p4, p0, Lcom/facebook/analytics/ar;->c:Ljava/lang/String;

    .line 114
    iput-object p5, p0, Lcom/facebook/analytics/ar;->d:Lorg/apache/http/protocol/HttpContext;

    .line 115
    iput-boolean p6, p0, Lcom/facebook/analytics/ar;->e:Z

    .line 116
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/ar;J)J
    .locals 0

    .prologue
    .line 98
    iput-wide p1, p0, Lcom/facebook/analytics/ar;->f:J

    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/analytics/ar;)Lorg/apache/http/protocol/HttpContext;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/analytics/ar;->d:Lorg/apache/http/protocol/HttpContext;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/analytics/ar;)J
    .locals 2

    .prologue
    .line 98
    iget-wide v0, p0, Lcom/facebook/analytics/ar;->f:J

    return-wide v0
.end method

.method static synthetic c(Lcom/facebook/analytics/ar;)Ljava/net/URI;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/analytics/ar;->b:Ljava/net/URI;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/analytics/ar;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/analytics/ar;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getContent()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/analytics/ar;->wrappedEntity:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    .line 125
    iget-boolean v0, p0, Lcom/facebook/analytics/ar;->e:Z

    if-eqz v0, :cond_0

    .line 126
    new-instance v0, Lcom/facebook/analytics/as;

    invoke-direct {v0, p0, v1}, Lcom/facebook/analytics/as;-><init>(Lcom/facebook/analytics/ar;Ljava/io/InputStream;)V

    .line 128
    :goto_0
    new-instance v1, Lcom/facebook/analytics/at;

    invoke-direct {v1, p0, v0}, Lcom/facebook/analytics/at;-><init>(Lcom/facebook/analytics/ar;Ljava/io/InputStream;)V

    return-object v1

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.class public Lcom/facebook/http/protocol/l;
.super Ljava/lang/Object;
.source "ApiMethodRunnerParams.java"


# instance fields
.field private a:Lcom/facebook/http/protocol/h;

.field private b:Lorg/apache/http/params/HttpParams;

.field private c:Lcom/facebook/http/protocol/m;

.field private d:Lcom/facebook/http/protocol/ah;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    sget-object v0, Lcom/facebook/http/protocol/m;->DEFAULT:Lcom/facebook/http/protocol/m;

    iput-object v0, p0, Lcom/facebook/http/protocol/l;->c:Lcom/facebook/http/protocol/m;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/h;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/http/protocol/l;->a:Lcom/facebook/http/protocol/h;

    return-object v0
.end method

.method public a(Lcom/facebook/http/protocol/h;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/http/protocol/l;->a:Lcom/facebook/http/protocol/h;

    .line 64
    return-void
.end method

.method public a(Lcom/facebook/http/protocol/m;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/http/protocol/l;->c:Lcom/facebook/http/protocol/m;

    .line 94
    return-void
.end method

.method public b()Lorg/apache/http/params/HttpParams;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/http/protocol/l;->b:Lorg/apache/http/params/HttpParams;

    return-object v0
.end method

.method public c()Lcom/facebook/http/protocol/m;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/http/protocol/l;->c:Lcom/facebook/http/protocol/m;

    return-object v0
.end method

.method public d()Lcom/facebook/http/protocol/ah;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/http/protocol/l;->d:Lcom/facebook/http/protocol/ah;

    return-object v0
.end method

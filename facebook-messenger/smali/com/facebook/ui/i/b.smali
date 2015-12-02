.class public Lcom/facebook/ui/i/b;
.super Ljava/lang/Object;
.source "ToastLogger.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/av;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/ui/i/b;->a:Lcom/facebook/analytics/av;

    .line 18
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 22
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "error"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 23
    const-string v1, "message"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 24
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 25
    if-eqz p3, :cond_0

    .line 26
    invoke-virtual {v0, p3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 28
    :cond_0
    if-eqz p2, :cond_1

    .line 29
    invoke-virtual {v0, p2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 31
    :cond_1
    if-eqz p4, :cond_2

    .line 32
    invoke-virtual {v0, p4}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 34
    :cond_2
    iget-object v1, p0, Lcom/facebook/ui/i/b;->a:Lcom/facebook/analytics/av;

    if-eqz v1, :cond_3

    .line 35
    iget-object v1, p0, Lcom/facebook/ui/i/b;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 37
    :cond_3
    return-void
.end method

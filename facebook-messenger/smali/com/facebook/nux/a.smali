.class public Lcom/facebook/nux/a;
.super Lcom/facebook/inject/b;
.source "NuxModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 116
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 32
    const-class v0, Lcom/facebook/nux/status/a;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/nux/d;

    invoke-direct {v1, v2}, Lcom/facebook/nux/d;-><init>(Lcom/facebook/nux/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 34
    const-class v0, Lcom/facebook/nux/status/f;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/nux/f;

    invoke-direct {v1, v2}, Lcom/facebook/nux/f;-><init>(Lcom/facebook/nux/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 36
    const-class v0, Lcom/facebook/nux/status/j;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/nux/g;

    invoke-direct {v1, v2}, Lcom/facebook/nux/g;-><init>(Lcom/facebook/nux/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 40
    const-class v0, Lcom/facebook/nux/service/a;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/nux/e;

    invoke-direct {v1, v2}, Lcom/facebook/nux/e;-><init>(Lcom/facebook/nux/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 43
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/nux/service/NuxQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/nux/c;

    invoke-direct {v1, v2}, Lcom/facebook/nux/c;-><init>(Lcom/facebook/nux/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 49
    const-class v0, Lcom/facebook/auth/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/nux/status/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 51
    const-class v0, Lcom/facebook/config/background/k;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/nux/status/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 55
    const-class v0, Lcom/facebook/nux/status/e;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 56
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 60
    invoke-super {p0, p1}, Lcom/facebook/inject/b;->a(Lcom/facebook/inject/t;)V

    .line 62
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 63
    sget-object v1, Lcom/facebook/nux/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/nux/service/NuxQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 64
    sget-object v1, Lcom/facebook/nux/service/a;->b:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/nux/service/NuxQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 65
    return-void
.end method

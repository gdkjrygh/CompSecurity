.class public Lcom/facebook/abtest/qe/service/module/a;
.super Lcom/facebook/inject/c;
.source "QuickExperimentServiceModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 159
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 41
    const-class v0, Lcom/facebook/backgroundtasks/f;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 43
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/user/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/i;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 45
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/full/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/g;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 48
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/service/module/QuickExperimentQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/c;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/c;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 52
    const-class v0, Lcom/facebook/abtest/qe/service/c;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/e;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 54
    const-class v0, Lcom/facebook/abtest/qe/service/b;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/d;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 56
    const-class v0, Lcom/facebook/abtest/qe/service/g;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/f;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 59
    const-class v0, Lcom/facebook/abtest/qe/service/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/module/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/service/module/h;-><init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 63
    const-class v0, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/service/a/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 65
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 69
    invoke-super {p0, p1}, Lcom/facebook/inject/c;->a(Lcom/facebook/inject/t;)V

    .line 71
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 72
    sget-object v1, Lcom/facebook/abtest/qe/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/abtest/qe/service/module/QuickExperimentQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 73
    return-void
.end method

.class public Lcom/facebook/config/background/b;
.super Lcom/facebook/inject/c;
.source "ConfigBackgroundModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 74
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 26
    const-class v0, Lcom/facebook/backgroundtasks/f;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 28
    const-class v0, Lcom/facebook/config/background/i;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/background/d;

    invoke-direct {v1, v3}, Lcom/facebook/config/background/d;-><init>(Lcom/facebook/config/background/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 31
    const-class v0, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/config/background/i;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 34
    const-class v0, Ljava/lang/Long;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/config/background/ConfigRefreshInterval;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-wide/32 v1, 0x36ee80

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 38
    const-class v0, Lcom/facebook/config/background/g;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/background/e;

    invoke-direct {v1, v3}, Lcom/facebook/config/background/e;-><init>(Lcom/facebook/config/background/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 40
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/config/background/ConfigBackgroundQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/config/background/g;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 45
    const-class v0, Lcom/facebook/config/background/k;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 46
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 50
    invoke-super {p0, p1}, Lcom/facebook/inject/c;->a(Lcom/facebook/inject/t;)V

    .line 52
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 53
    sget-object v1, Lcom/facebook/config/background/f;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/config/background/ConfigBackgroundQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 57
    return-void
.end method

.class public Lcom/facebook/cache/b;
.super Lcom/facebook/inject/b;
.source "CacheModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 91
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 22
    const-class v0, Lcom/facebook/analytics/f;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->e(Ljava/lang/Class;)V

    .line 23
    const-class v0, Lcom/facebook/e/h;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 24
    const-class v0, Lcom/facebook/common/e/d;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 25
    const-class v0, Lcom/facebook/cache/j;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/cache/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/cache/d;-><init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 28
    const-class v0, Lcom/facebook/cache/v;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/cache/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/cache/h;-><init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 31
    const-class v0, Lcom/facebook/cache/q;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/cache/g;

    invoke-direct {v1, v2}, Lcom/facebook/cache/g;-><init>(Lcom/facebook/cache/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 34
    const-class v0, Lcom/facebook/cache/k;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/cache/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/cache/e;-><init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 37
    const-class v0, Lcom/facebook/cache/s;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/cache/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/cache/f;-><init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 40
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/b;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/cache/IsMemoryCacheManagerTrimmingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 43
    return-void
.end method

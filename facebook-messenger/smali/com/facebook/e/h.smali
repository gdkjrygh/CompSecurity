.class public Lcom/facebook/e/h;
.super Lcom/facebook/inject/b;
.source "DeviceModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 149
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 38
    const-class v0, Lcom/facebook/e/r;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/n;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 40
    const-class v0, Lcom/facebook/e/c;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/m;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 43
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/e/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/e/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 46
    const-class v0, Lcom/facebook/e/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/p;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 50
    const-class v0, Lcom/facebook/e/a/h;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/q;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 53
    const-class v0, Lcom/facebook/e/a/g;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/l;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 57
    const-class v0, Lcom/facebook/e/b;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/j;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 61
    const-class v0, Lcom/facebook/e/s;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/e/o;-><init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 65
    const-class v0, Lcom/facebook/base/activity/c;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/e/k;

    invoke-direct {v1, v2}, Lcom/facebook/e/k;-><init>(Lcom/facebook/e/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 68
    const-class v0, Lcom/facebook/base/activity/g;

    invoke-virtual {p0, v0}, Lcom/facebook/e/h;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/base/activity/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 70
    return-void
.end method

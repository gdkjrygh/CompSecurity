.class public Lcom/facebook/bugreporter/o;
.super Lcom/facebook/inject/c;
.source "BugReporterModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 134
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 33
    new-instance v0, Lcom/facebook/bugreporter/activity/tasklist/j;

    invoke-direct {v0}, Lcom/facebook/bugreporter/activity/tasklist/j;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 35
    const-class v0, Lcom/facebook/bugreporter/f;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/r;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/r;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 37
    const-class v0, Lcom/facebook/bugreporter/d;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/q;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 39
    const-class v0, Lcom/facebook/bugreporter/g;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/t;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/t;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 42
    const-class v0, Lcom/facebook/bugreporter/m;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/s;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/s;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 45
    const-class v0, Lcom/facebook/bugreporter/ab;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/w;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 48
    const-class v0, Lcom/facebook/bugreporter/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/v;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 50
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/bugreporter/annotations/IsRageShakeAvailable;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 53
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/bugreporter/annotations/IsOldVersionOfTheApp;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 56
    const-class v0, Lcom/facebook/bugreporter/z;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/u;-><init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 59
    const-class v0, Lcom/facebook/bugreporter/c;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/o;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 60
    return-void
.end method

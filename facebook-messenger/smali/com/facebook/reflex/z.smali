.class public Lcom/facebook/reflex/z;
.super Lcom/facebook/inject/b;
.source "ReflexModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 59
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 20
    const-class v0, Lcom/facebook/breakpad/b;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/z;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 21
    const-class v0, Lcom/facebook/analytics/periodicreporters/l;

    const-class v1, Lcom/facebook/analytics/periodicreporters/ClientPeriodicReporters;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/z;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/reflex/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/reflex/a/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 25
    const-class v0, Lcom/facebook/reflex/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/z;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/reflex/ac;

    invoke-direct {v1, v2}, Lcom/facebook/reflex/ac;-><init>(Lcom/facebook/reflex/aa;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 29
    const-class v0, Lcom/facebook/reflex/Transaction;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/z;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/reflex/ad;

    invoke-direct {v1, p0, v2}, Lcom/facebook/reflex/ad;-><init>(Lcom/facebook/reflex/z;Lcom/facebook/reflex/aa;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 33
    const-class v0, Lcom/facebook/reflex/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/z;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/reflex/ab;

    invoke-direct {v1, p0, v2}, Lcom/facebook/reflex/ab;-><init>(Lcom/facebook/reflex/z;Lcom/facebook/reflex/aa;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 36
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 1

    .prologue
    .line 40
    invoke-super {p0, p1}, Lcom/facebook/inject/b;->a(Lcom/facebook/inject/t;)V

    .line 41
    const-class v0, Lcom/facebook/breakpad/BreakpadManager;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/breakpad/BreakpadManager;

    invoke-virtual {v0}, Lcom/facebook/breakpad/BreakpadManager;->a()V

    .line 42
    return-void
.end method

.class public Lcom/facebook/debug/f/h;
.super Lcom/facebook/inject/b;
.source "UiThreadWatchdogModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 30
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 22
    const-class v0, Lcom/facebook/debug/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/f/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/f/j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/debug/f/j;-><init>(Lcom/facebook/debug/f/h;Lcom/facebook/debug/f/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 26
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/debug/f/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/debug/f/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 28
    return-void
.end method

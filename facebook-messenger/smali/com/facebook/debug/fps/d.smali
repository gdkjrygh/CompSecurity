.class public Lcom/facebook/debug/fps/d;
.super Lcom/facebook/inject/b;
.source "FPSModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 43
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 23
    const-class v0, Lcom/facebook/debug/fps/a;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/fps/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/debug/fps/g;-><init>(Lcom/facebook/debug/fps/d;Lcom/facebook/debug/fps/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 26
    const-class v0, Lcom/facebook/debug/fps/b;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/fps/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/debug/fps/f;-><init>(Lcom/facebook/debug/fps/d;Lcom/facebook/debug/fps/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 28
    new-instance v0, Lcom/facebook/debug/fps/e;

    invoke-direct {v0, p0}, Lcom/facebook/debug/fps/e;-><init>(Lcom/facebook/debug/fps/d;)V

    invoke-static {v0}, Lcom/google/inject/a;->a(Lcom/google/inject/f;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/d;->b(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/debug/fps/k;

    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 30
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/debug/fps/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 31
    return-void
.end method

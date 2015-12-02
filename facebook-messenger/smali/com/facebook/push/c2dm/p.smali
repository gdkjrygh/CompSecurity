.class Lcom/facebook/push/c2dm/p;
.super Ljava/lang/Object;
.source "C2DMRegistrar.java"

# interfaces
.implements Lcom/facebook/c/b;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 381
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 384
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 385
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 386
    const-class v1, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    .line 387
    invoke-virtual {v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a()V

    .line 388
    return-void
.end method

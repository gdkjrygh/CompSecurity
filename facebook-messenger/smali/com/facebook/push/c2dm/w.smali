.class Lcom/facebook/push/c2dm/w;
.super Ljava/lang/Object;
.source "FacebookPushServerRegistrar.java"

# interfaces
.implements Lcom/facebook/c/b;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 314
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 3

    .prologue
    .line 317
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 318
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 319
    const-class v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    .line 320
    const-class v2, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    .line 322
    iget-object v0, v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->a:Lcom/facebook/push/c2dm/v;

    invoke-virtual {v1, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    .line 325
    return-void
.end method

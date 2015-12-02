.class Lcom/facebook/base/broadcast/f;
.super Ljava/lang/Object;
.source "BaseFbBroadcastManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:Lcom/facebook/c/c;

.field final synthetic d:Lcom/facebook/base/broadcast/e;


# direct methods
.method constructor <init>(Lcom/facebook/base/broadcast/e;Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/base/broadcast/f;->d:Lcom/facebook/base/broadcast/e;

    iput-object p2, p0, Lcom/facebook/base/broadcast/f;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/base/broadcast/f;->b:Landroid/content/Intent;

    iput-object p4, p0, Lcom/facebook/base/broadcast/f;->c:Lcom/facebook/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/base/broadcast/f;->d:Lcom/facebook/base/broadcast/e;

    invoke-static {v0}, Lcom/facebook/base/broadcast/e;->a(Lcom/facebook/base/broadcast/e;)Lcom/facebook/c/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/base/broadcast/f;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/base/broadcast/f;->b:Landroid/content/Intent;

    iget-object v3, p0, Lcom/facebook/base/broadcast/f;->c:Lcom/facebook/c/c;

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/c/b;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V

    .line 124
    return-void
.end method

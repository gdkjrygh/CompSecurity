.class Lcom/facebook/base/broadcast/h;
.super Lcom/facebook/c/k;
.source "BaseFbBroadcastManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/base/broadcast/b;

.field final synthetic b:Lcom/facebook/base/broadcast/g;


# direct methods
.method constructor <init>(Lcom/facebook/base/broadcast/g;Ljava/util/Map;Lcom/facebook/base/broadcast/b;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/base/broadcast/h;->b:Lcom/facebook/base/broadcast/g;

    iput-object p3, p0, Lcom/facebook/base/broadcast/h;->a:Lcom/facebook/base/broadcast/b;

    invoke-direct {p0, p2}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/base/broadcast/h;->b:Lcom/facebook/base/broadcast/g;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/g;->a()Z

    move-result v0

    return v0
.end method

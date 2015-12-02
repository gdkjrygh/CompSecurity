.class Lcom/facebook/l/d;
.super Ljava/lang/Object;
.source "MusicPresenceHandler.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/l/c;


# direct methods
.method constructor <init>(Lcom/facebook/l/c;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/facebook/l/d;->a:Lcom/facebook/l/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 4

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/l/d;->a:Lcom/facebook/l/c;

    invoke-static {v0}, Lcom/facebook/l/c;->b(Lcom/facebook/l/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/l/e;

    invoke-direct {v1, p0}, Lcom/facebook/l/e;-><init>(Lcom/facebook/l/d;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 149
    return-void
.end method

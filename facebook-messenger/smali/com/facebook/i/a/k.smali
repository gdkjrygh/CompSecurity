.class Lcom/facebook/i/a/k;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field final synthetic a:Lcom/facebook/i/a/a;

.field final synthetic b:Lcom/facebook/i/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V
    .locals 0

    .prologue
    .line 411
    iput-object p1, p0, Lcom/facebook/i/a/k;->b:Lcom/facebook/i/a/d;

    iput-object p2, p0, Lcom/facebook/i/a/k;->a:Lcom/facebook/i/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .prologue
    .line 414
    iget-object v0, p0, Lcom/facebook/i/a/k;->b:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->b(Lcom/facebook/i/a/d;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/i/a/l;

    invoke-direct {v1, p0}, Lcom/facebook/i/a/l;-><init>(Lcom/facebook/i/a/k;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 420
    return-void
.end method

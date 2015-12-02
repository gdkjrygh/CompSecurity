.class Lcom/facebook/orca/d/f;
.super Ljava/lang/Object;
.source "AudioClipPlayer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/orca/d/f;->a:Lcom/facebook/orca/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/orca/d/f;->a:Lcom/facebook/orca/d/e;

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_POSITION_UPDATED:Lcom/facebook/orca/d/k;

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/facebook/orca/d/k;)V

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/d/f;->a:Lcom/facebook/orca/d/e;

    invoke-static {v0}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x19

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 69
    return-void
.end method

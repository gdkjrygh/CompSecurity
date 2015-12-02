.class Lcom/facebook/orca/d/j;
.super Ljava/lang/Object;
.source "AudioClipPlayer.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_STARTED:Lcom/facebook/orca/d/k;

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/facebook/orca/d/k;)V

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    invoke-static {v0}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    invoke-static {v1}, Lcom/facebook/orca/d/e;->d(Lcom/facebook/orca/d/e;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    invoke-static {v0}, Lcom/facebook/orca/d/e;->b(Lcom/facebook/orca/d/e;)V

    .line 136
    iget-object v0, p0, Lcom/facebook/orca/d/j;->a:Lcom/facebook/orca/d/e;

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_ERROR:Lcom/facebook/orca/d/k;

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/facebook/orca/d/k;)V

    .line 137
    return-void
.end method

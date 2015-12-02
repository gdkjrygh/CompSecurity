.class Lcom/facebook/orca/d/g;
.super Ljava/lang/Object;
.source "AudioClipPlayer.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/orca/d/g;->a:Lcom/facebook/orca/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/orca/d/g;->a:Lcom/facebook/orca/d/e;

    invoke-static {v0}, Lcom/facebook/orca/d/e;->b(Lcom/facebook/orca/d/e;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/d/g;->a:Lcom/facebook/orca/d/e;

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_COMPLETED:Lcom/facebook/orca/d/k;

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/facebook/orca/d/k;)V

    .line 107
    return-void
.end method

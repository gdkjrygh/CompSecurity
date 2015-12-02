.class Lcom/facebook/orca/d/h;
.super Ljava/lang/Object;
.source "AudioClipPlayer.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/orca/d/h;->a:Lcom/facebook/orca/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/d/h;->a:Lcom/facebook/orca/d/e;

    invoke-static {v0}, Lcom/facebook/orca/d/e;->b(Lcom/facebook/orca/d/e;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/d/h;->a:Lcom/facebook/orca/d/e;

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_ERROR:Lcom/facebook/orca/d/k;

    invoke-static {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/e;Lcom/facebook/orca/d/k;)V

    .line 114
    const/4 v0, 0x1

    return v0
.end method

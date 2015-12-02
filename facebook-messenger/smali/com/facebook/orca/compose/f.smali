.class Lcom/facebook/orca/compose/f;
.super Ljava/lang/Object;
.source "AudioComposerView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/e;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lcom/facebook/orca/compose/f;->a:Lcom/facebook/orca/compose/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 441
    iget-object v0, p0, Lcom/facebook/orca/compose/f;->a:Lcom/facebook/orca/compose/e;

    iget-object v0, v0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    iget-object v1, p0, Lcom/facebook/orca/compose/f;->a:Lcom/facebook/orca/compose/e;

    iget-object v1, v1, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1}, Lcom/facebook/orca/compose/AudioComposerView;->d(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/af;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/d/af;->c()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->a(Lcom/facebook/orca/compose/AudioComposerView;I)V

    .line 442
    iget-object v0, p0, Lcom/facebook/orca/compose/f;->a:Lcom/facebook/orca/compose/e;

    iget-object v0, v0, Lcom/facebook/orca/compose/e;->a:Landroid/os/Handler;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 443
    return-void
.end method

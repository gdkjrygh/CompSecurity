.class Lcom/facebook/orca/compose/b;
.super Ljava/lang/Object;
.source "AudioComposerView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/AudioComposerView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/orca/compose/b;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/compose/b;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->c(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/compose/b;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->c(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->d()V

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/b;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->d(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/compose/b;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->d(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->a()V

    goto :goto_0
.end method

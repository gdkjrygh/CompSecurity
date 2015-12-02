.class Lcom/facebook/orca/compose/d;
.super Ljava/lang/Object;
.source "AudioComposerView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/AudioComposerView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/facebook/orca/compose/d;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/orca/compose/d;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->d(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 211
    iget-object v0, p0, Lcom/facebook/orca/compose/d;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->i(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/compose/d;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->i(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/compose/g;->a()V

    .line 214
    :cond_0
    return-void
.end method

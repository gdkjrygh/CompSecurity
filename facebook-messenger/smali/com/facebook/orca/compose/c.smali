.class Lcom/facebook/orca/compose/c;
.super Ljava/lang/Object;
.source "AudioComposerView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/AudioComposerView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 180
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 201
    const/4 v0, 0x0

    :cond_0
    :goto_0
    return v0

    .line 187
    :pswitch_0
    iget-object v1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1}, Lcom/facebook/orca/compose/AudioComposerView;->f(Lcom/facebook/orca/compose/AudioComposerView;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1}, Lcom/facebook/orca/compose/AudioComposerView;->d(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/af;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/d/af;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 188
    iget-object v1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1}, Lcom/facebook/orca/compose/AudioComposerView;->g(Lcom/facebook/orca/compose/AudioComposerView;)V

    goto :goto_0

    .line 192
    :pswitch_1
    iget-object v1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1, p2}, Lcom/facebook/orca/compose/AudioComposerView;->a(Lcom/facebook/orca/compose/AudioComposerView;Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 195
    :pswitch_2
    iget-object v1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1, p2}, Lcom/facebook/orca/compose/AudioComposerView;->b(Lcom/facebook/orca/compose/AudioComposerView;Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 198
    :pswitch_3
    iget-object v1, p0, Lcom/facebook/orca/compose/c;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1}, Lcom/facebook/orca/compose/AudioComposerView;->h(Lcom/facebook/orca/compose/AudioComposerView;)V

    goto :goto_0

    .line 180
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.class Lcom/facebook/orca/d/o;
.super Ljava/lang/Object;
.source "AudioClipPlayerQueue.java"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/m;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/m;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 1

    .prologue
    .line 40
    packed-switch p1, :pswitch_data_0

    .line 58
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 43
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->d()V

    goto :goto_0

    .line 48
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->e()V

    goto :goto_0

    .line 53
    :pswitch_3
    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/facebook/orca/d/o;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->c()V

    goto :goto_0

    .line 40
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.class Lcom/facebook/orca/d/ap;
.super Ljava/lang/Object;
.source "AudioRecorder.java"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/af;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/af;)V
    .locals 0

    .prologue
    .line 397
    iput-object p1, p0, Lcom/facebook/orca/d/ap;->a:Lcom/facebook/orca/d/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/af;Lcom/facebook/orca/d/ag;)V
    .locals 0

    .prologue
    .line 397
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/ap;-><init>(Lcom/facebook/orca/d/af;)V

    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lcom/facebook/orca/d/ap;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->a(Lcom/facebook/orca/d/af;)Lcom/facebook/common/executors/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 402
    packed-switch p1, :pswitch_data_0

    .line 413
    :goto_0
    :pswitch_0
    return-void

    .line 410
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/d/ap;->a:Lcom/facebook/orca/d/af;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/d/af;->a(Lcom/facebook/orca/d/af;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 402
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

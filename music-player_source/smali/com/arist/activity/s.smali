.class final Lcom/arist/activity/s;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    const/4 v2, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "text"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_0

    iget-object v1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    sget-object v2, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v2

    invoke-static {v1, v2}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;I)V

    :cond_0
    iget-object v1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    iget-object v2, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v2}, Lcom/arist/activity/MainActivity;->b(Lcom/arist/activity/MainActivity;)I

    move-result v2

    mul-int/lit16 v3, v0, 0xc8

    add-int/2addr v2, v3

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v3

    if-le v2, v3, :cond_1

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v0

    :goto_1
    invoke-static {v1, v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;I)V

    iget-object v0, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->c(Lcom/arist/activity/MainActivity;)Lcom/arist/model/skin/ColorProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->b(Lcom/arist/activity/MainActivity;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v4

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v2}, Lcom/arist/activity/MainActivity;->b(Lcom/arist/activity/MainActivity;)I

    move-result v2

    mul-int/lit16 v0, v0, 0xc8

    add-int/2addr v0, v2

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "text"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_2

    iget-object v1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    sget-object v2, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v2

    invoke-static {v1, v2}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;I)V

    :cond_2
    iget-object v1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    iget-object v2, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v2}, Lcom/arist/activity/MainActivity;->b(Lcom/arist/activity/MainActivity;)I

    move-result v2

    mul-int/lit16 v3, v0, 0xc8

    sub-int/2addr v2, v3

    if-gez v2, :cond_3

    const/4 v0, 0x0

    :goto_2
    invoke-static {v1, v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;I)V

    iget-object v0, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->c(Lcom/arist/activity/MainActivity;)Lcom/arist/model/skin/ColorProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->b(Lcom/arist/activity/MainActivity;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v4

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    goto/16 :goto_0

    :cond_3
    iget-object v2, p0, Lcom/arist/activity/s;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v2}, Lcom/arist/activity/MainActivity;->b(Lcom/arist/activity/MainActivity;)I

    move-result v2

    mul-int/lit16 v0, v0, 0xc8

    sub-int v0, v2, v0

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

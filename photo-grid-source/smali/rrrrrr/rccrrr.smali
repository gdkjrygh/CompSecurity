.class public Lrrrrrr/rccrrr;
.super Landroid/os/Handler;


# static fields
.field public static b04270427Ч042704270427:I = 0x10

.field public static b0427Ч0427042704270427:I = 0x1

.field public static bЧЧ0427042704270427:I


# instance fields
.field public final synthetic b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;


# direct methods
.method private constructor <init>(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V
    .locals 0

    :goto_0
    goto/32 :goto_0
.end method

.method public synthetic constructor <init>(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;Lrrrrrr/rrcrrr;)V
    .locals 0

    invoke-direct {p0, p1}, Lrrrrrr/rccrrr;-><init>(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V

    return-void
.end method

.method public static b0446ццццц()I
    .locals 1

    const/16 v0, 0x55

    return v0
.end method

.method public static bЧ04270427042704270427()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411Б04110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411ББ04110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b04110411Б04110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;I)I

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bББ041104110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;I)I

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411Б041104110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;I)I

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411041104110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    const-string v2, "playback_timecode"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "playback_uptime"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b04110411041104110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;IJ)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБББББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v1, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411БББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v2}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b04110411БББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/utils/FileManager;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->getHapticFileReaderInstance(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411ББББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    :cond_1
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБББББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bББ0411ББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v1, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБББББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    move-result-object v1

    invoke-interface {v1}, Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;->getBlockSizeMS()I

    move-result v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411Б0411ББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;I)I

    :cond_2
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБББББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБББББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;->setBytesAvailable(I)V

    goto/16 :goto_0

    :pswitch_4
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ04110411ББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V

    :goto_1
    goto/32 :goto_1

    :pswitch_5
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b041104110411ББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V

    goto/16 :goto_0

    :pswitch_6
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0, p1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБББ0411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;Landroid/os/Message;)V

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lrrrrrr/rccrrr;->b04440444фф04440444:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411ББ0411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

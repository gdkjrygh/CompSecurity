.class Lcom/hmobile/biblekjv/MainBookActivity$3;
.super Landroid/telephony/PhoneStateListener;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MainBookActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 1645
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 1
    .param p1, "state"    # I
    .param p2, "incomingNumber"    # Ljava/lang/String;

    .prologue
    .line 1648
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1651
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-boolean v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    if-eqz v0, :cond_0

    .line 1652
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_0

    .line 1653
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    .line 1654
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    .line 1668
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    .line 1669
    return-void

    .line 1659
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 1661
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-boolean v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    if-eqz v0, :cond_0

    .line 1662
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    .line 1663
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$3;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    goto :goto_0
.end method

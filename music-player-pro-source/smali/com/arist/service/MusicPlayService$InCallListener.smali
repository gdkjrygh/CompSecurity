.class Lcom/arist/service/MusicPlayService$InCallListener;
.super Landroid/telephony/PhoneStateListener;
.source "MusicPlayService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/service/MusicPlayService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InCallListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/service/MusicPlayService;


# direct methods
.method private constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/arist/service/MusicPlayService$InCallListener;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/service/MusicPlayService;Lcom/arist/service/MusicPlayService$InCallListener;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/arist/service/MusicPlayService$InCallListener;-><init>(Lcom/arist/service/MusicPlayService;)V

    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 1
    .param p1, "state"    # I
    .param p2, "incomingNumber"    # Ljava/lang/String;

    .prologue
    .line 71
    packed-switch p1, :pswitch_data_0

    .line 81
    :cond_0
    :goto_0
    return-void

    .line 75
    :pswitch_0
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MyApplication;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 77
    const/4 v0, 0x3

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    goto :goto_0

    .line 71
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

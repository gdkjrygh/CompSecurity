.class Lcom/hmobile/biblekjv/CallStateListener;
.super Landroid/telephony/PhoneStateListener;
.source "CallStateListener.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 2
    .param p1, "state"    # I
    .param p2, "incomingNumber"    # Ljava/lang/String;

    .prologue
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 18
    :goto_0
    return-void

    .line 14
    :pswitch_0
    invoke-static {}, Lcom/hmobile/common/NotificationCenter;->Instance()Lcom/hmobile/common/NotificationCenter;

    move-result-object v0

    .line 15
    const-string v1, "stoptts"

    .line 14
    invoke-virtual {v0, v1}, Lcom/hmobile/common/NotificationCenter;->postNotification(Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

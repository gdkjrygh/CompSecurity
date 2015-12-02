.class public Lcom/facebook/common/hardware/z;
.super Ljava/lang/Object;
.source "TelephonyManagerUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method

.method public static a(Landroid/telephony/TelephonyManager;)I
    .locals 1

    .prologue
    .line 24
    :try_start_0
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneType()I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 26
    :goto_0
    return v0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    packed-switch p0, :pswitch_data_0

    .line 68
    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    .line 37
    :pswitch_0
    const-string v0, "1xRTT"

    goto :goto_0

    .line 39
    :pswitch_1
    const-string v0, "CDMA"

    goto :goto_0

    .line 41
    :pswitch_2
    const-string v0, "EDGE"

    goto :goto_0

    .line 43
    :pswitch_3
    const-string v0, "EHRPD"

    goto :goto_0

    .line 45
    :pswitch_4
    const-string v0, "EVDO_0"

    goto :goto_0

    .line 47
    :pswitch_5
    const-string v0, "EVDO_A"

    goto :goto_0

    .line 49
    :pswitch_6
    const-string v0, "EVDO_B"

    goto :goto_0

    .line 51
    :pswitch_7
    const-string v0, "GPRS"

    goto :goto_0

    .line 53
    :pswitch_8
    const-string v0, "HSDPA"

    goto :goto_0

    .line 55
    :pswitch_9
    const-string v0, "HSPA"

    goto :goto_0

    .line 57
    :pswitch_a
    const-string v0, "HSPAP"

    goto :goto_0

    .line 59
    :pswitch_b
    const-string v0, "HSUPA"

    goto :goto_0

    .line 61
    :pswitch_c
    const-string v0, "IDEN"

    goto :goto_0

    .line 63
    :pswitch_d
    const-string v0, "LTE"

    goto :goto_0

    .line 65
    :pswitch_e
    const-string v0, "UMTS"

    goto :goto_0

    .line 35
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_2
        :pswitch_e
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_8
        :pswitch_b
        :pswitch_9
        :pswitch_c
        :pswitch_6
        :pswitch_d
        :pswitch_3
        :pswitch_a
    .end packed-switch
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    packed-switch p0, :pswitch_data_0

    .line 83
    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    .line 75
    :pswitch_0
    const-string v0, "CDMA"

    goto :goto_0

    .line 77
    :pswitch_1
    const-string v0, "GSM"

    goto :goto_0

    .line 79
    :pswitch_2
    const-string v0, "SIP"

    goto :goto_0

    .line 81
    :pswitch_3
    const-string v0, "NONE"

    goto :goto_0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static b(Landroid/telephony/TelephonyManager;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    invoke-static {p0}, Lcom/facebook/common/hardware/z;->a(Landroid/telephony/TelephonyManager;)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/common/hardware/z;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

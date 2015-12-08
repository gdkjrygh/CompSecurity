.class public synthetic Lrrrrrr/crccrr;
.super Ljava/lang/Object;


# static fields
.field public static b041704170417ЗЗЗ:I = 0x1

.field public static final synthetic b042504250425ХХ0425:[I

.field public static bЗ04170417ЗЗЗ:I = 0x58

.field public static bЗЗЗ0417ЗЗ:I = 0x2


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->values()[Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    :try_start_0
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_0
    :try_start_1
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    :goto_1
    :try_start_2
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_2
    :try_start_3
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    sget v0, Lrrrrrr/crccrr;->bЗ04170417ЗЗЗ:I

    sget v1, Lrrrrrr/crccrr;->b041704170417ЗЗЗ:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/crccrr;->bЗЗЗ0417ЗЗ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x39

    sput v0, Lrrrrrr/crccrr;->bЗ04170417ЗЗЗ:I

    const/16 v0, 0x1a

    sput v0, Lrrrrrr/crccrr;->b041704170417ЗЗЗ:I

    :goto_3
    :pswitch_0
    :try_start_4
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0

    :goto_4
    :try_start_5
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_5
    :try_start_6
    sget-object v0, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_2

    :goto_6
    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

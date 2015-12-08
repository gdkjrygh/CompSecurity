.class public Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "HapticContentSDKFactory"

.field public static b04460446044604460446ц:I = 0x13

.field public static b0446цццц0446:I = 0x2

.field public static bццццц0446:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->b04460446044604460446ц:I

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->bццццц0446:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->b0446цццц0446:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->bц0446ццц0446()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->b04460446044604460446ц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->bц0446ццц0446()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->bццццц0446:I

    :pswitch_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static GetNewSDKInstance(ILandroid/content/Context;)Lcom/immersion/hapticmediasdk/HapticContentSDK;
    .locals 6

    const/4 v0, 0x0

    invoke-static {}, Lcom/immersion/content/EndpointWarp;->loadSharedLibrary()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :pswitch_0
    new-instance v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;

    invoke-direct {v1, p1}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bБ04110411Б04110411()I

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "HapticContentSDKFactory"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget v4, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->b04460446044604460446ц:I

    sget v5, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->bццццц0446:I

    add-int/2addr v5, v4

    mul-int/2addr v4, v5

    sget v5, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->b0446цццц0446:I

    rem-int/2addr v4, v5

    packed-switch v4, :pswitch_data_0

    const/16 v4, 0x2a

    sput v4, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->b04460446044604460446ц:I

    const/16 v4, 0x5c

    sput v4, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->bццццц0446:I

    :pswitch_1
    const-string v4, "Failed to create Haptic Content SDK instance. error="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const-string v1, "HapticContentSDKFactory"

    const-string v2, "Failed to create a Haptic Content SDK instance. invalid context: null"

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    packed-switch p0, :pswitch_data_1

    const-string v1, "HapticContentSDKFactory"

    const-string v2, "Failed to create a Haptic Content SDK instance. Invalid mode"

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v0, "HapticContentSDKFactory"

    const-string v2, "Haptic Content SDK instance was created successfully"

    invoke-static {v0, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static bц0446ццц0446()I
    .locals 1

    const/16 v0, 0x60

    return v0
.end method

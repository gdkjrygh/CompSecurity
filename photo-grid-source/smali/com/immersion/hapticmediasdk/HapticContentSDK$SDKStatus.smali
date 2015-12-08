.class public final enum Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
.super Ljava/lang/Enum;


# static fields
.field public static final enum DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static final enum STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field private static final synthetic a:[Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field public static b04170417ЗЗЗЗ:I = 0x0

.field public static b0417ЗЗЗЗЗ:I = 0x2

.field public static b044Aъ044A044A044A044A:I = 0x6

.field public static bъ044A044A044A044A044A:I = 0x1


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "NOT_INITIALIZED"

    invoke-direct {v0, v1, v3}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "INITIALIZED"

    invoke-direct {v0, v1, v4}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "PLAYING"

    invoke-direct {v0, v1, v5}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "STOPPED"

    invoke-direct {v0, v1, v6}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "STOPPED_DUE_TO_ERROR"

    invoke-direct {v0, v1, v7}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "PAUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "PAUSED_DUE_TO_TIMEOUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const-string v1, "PAUSED_DUE_TO_BUFFERING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    new-instance v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗ0417ЗЗЗЗ()I

    move-result v1

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bъ044A044A044A044A044A:I

    add-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗ0417ЗЗЗЗ()I

    move-result v2

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b0417ЗЗЗЗЗ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b04170417ЗЗЗЗ:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗ0417ЗЗЗЗ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗ0417ЗЗЗЗ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b04170417ЗЗЗЗ:I

    :cond_0
    const-string v1, "DISPOSED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const/16 v0, 0x9

    new-array v0, v0, [Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v1, v0, v6

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    aput-object v2, v0, v1

    sput-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->a:[Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static b0417З0417ЗЗЗ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bЗ0417ЗЗЗЗ()I
    .locals 1

    const/16 v0, 0x25

    return v0
.end method

.method public static bЗЗ0417ЗЗЗ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    .locals 3

    :try_start_0
    const-class v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗЗ0417ЗЗЗ()I

    move-result v2

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b0417ЗЗЗЗЗ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b04170417ЗЗЗЗ:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x16

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    const/4 v1, 0x7

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b04170417ЗЗЗЗ:I

    :cond_0
    :try_start_2
    check-cast v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public static valueOfCaseInsensitive(Ljava/lang/String;)Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    .locals 5

    :try_start_0
    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->values()[Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v2

    array-length v3, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    sget v4, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bъ044A044A044A044A044A:I

    add-int/2addr v1, v4

    sget v4, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    mul-int/2addr v1, v4

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b0417З0417ЗЗЗ()I

    move-result v4

    rem-int/2addr v1, v4

    sget v4, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b04170417ЗЗЗЗ:I

    if-eq v1, v4, :cond_0

    const/16 v1, 0x37

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗ0417ЗЗЗЗ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b04170417ЗЗЗЗ:I

    :cond_0
    :try_start_1
    aget-object v1, v2, v0

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v4

    if-eqz v4, :cond_1

    move-object v0, v1

    :goto_1
    return-object v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    throw v0
.end method

.method public static values()[Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bъ044A044A044A044A044A:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b0417ЗЗЗЗЗ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bЗ0417ЗЗЗЗ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->b044Aъ044A044A044A044A:I

    const/16 v0, 0x48

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->bъ044A044A044A044A044A:I

    :pswitch_0
    :try_start_0
    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->a:[Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, [Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

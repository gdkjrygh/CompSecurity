.class public Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;
.super Ljava/lang/Object;


# static fields
.field public static b0415Е0415ЕЕ0415:I = 0x1

.field public static bЕ04150415ЕЕ0415:I = 0x2

.field public static bЕЕ0415ЕЕ0415:I = 0x58

.field public static bЕЕЕ0415Е0415:I


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b0415Е0415ЕЕ0415:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕ04150415ЕЕ0415:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b041504150415ЕЕ0415()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b041504150415ЕЕ0415()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b0415Е0415ЕЕ0415:I

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->a:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static b041504150415ЕЕ0415()I
    .locals 1

    const/16 v0, 0x35

    return v0
.end method


# virtual methods
.method public declared-synchronized areHapticsEnabled()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->a:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    sget v2, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b0415Е0415ЕЕ0415:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕ04150415ЕЕ0415:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕЕ0415Е0415:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x58

    sput v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    const/16 v1, 0x58

    sput v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕЕ0415Е0415:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    monitor-exit p0

    return v0

    :catch_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized mute()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b0415Е0415ЕЕ0415:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕ04150415ЕЕ0415:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕЕ0415Е0415:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b041504150415ЕЕ0415()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕ0415ЕЕ0415:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->b041504150415ЕЕ0415()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->bЕЕЕ0415Е0415:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->a:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized unmute()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

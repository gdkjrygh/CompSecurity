.class public Lcom/immersion/hapticmediasdk/utils/Profiler;
.super Ljava/lang/Object;


# static fields
.field public static b044A044A044A044Aъ044A:I = 0x0

.field public static b044A044Aъ044Aъ044A:I = 0x1

.field public static bъ044Aъ044Aъ044A:I = 0x59

.field public static bъъ044A044Aъ044A:I = 0x2


# instance fields
.field public mStartTime:J

.field public mStartTimeII:J


# direct methods
.method public constructor <init>()V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    sget v1, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044Aъ044Aъ044A:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъъ044A044Aъ044A:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xa

    sput v0, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    const/16 v0, 0x57

    sput v0, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044Aъ044Aъ044A:I

    :pswitch_0
    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static bъъъъ044A044A()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method


# virtual methods
.method public getDuration()J
    .locals 4

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/immersion/hapticmediasdk/utils/Profiler;->mStartTime:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v0, v2

    sget v2, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    sget v3, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044Aъ044Aъ044A:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъъ044A044Aъ044A:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъъъъ044A044A()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    const/16 v2, 0x45

    sput v2, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044A044A044Aъ044A:I

    :pswitch_0
    return-wide v0

    :catch_0
    move-exception v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getDurationII()J
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sget v2, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    sget v3, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044Aъ044Aъ044A:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъъ044A044Aъ044A:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    const/16 v2, 0x48

    sput v2, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    const/16 v2, 0xb

    sput v2, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044A044A044Aъ044A:I

    :pswitch_0
    iget-wide v2, p0, Lcom/immersion/hapticmediasdk/utils/Profiler;->mStartTimeII:J

    sub-long/2addr v0, v2

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public startTiming()V
    .locals 0

    :goto_0
    goto/32 :goto_0
.end method

.method public startTimingII()V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    sget v1, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044Aъ044Aъ044A:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъъ044A044Aъ044A:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044A044A044Aъ044A:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x51

    sput v0, Lcom/immersion/hapticmediasdk/utils/Profiler;->bъ044Aъ044Aъ044A:I

    const/16 v0, 0x1f

    sput v0, Lcom/immersion/hapticmediasdk/utils/Profiler;->b044A044A044A044Aъ044A:I

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/immersion/hapticmediasdk/utils/Profiler;->mStartTimeII:J

    return-void
.end method

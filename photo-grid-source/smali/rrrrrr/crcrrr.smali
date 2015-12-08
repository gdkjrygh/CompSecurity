.class public Lrrrrrr/crcrrr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static b042704270427ЧЧЧ:I = 0x2

.field public static b04270427ЧЧЧЧ:I = 0x0

.field public static bЧ0427ЧЧЧЧ:I = 0x30

.field public static bЧЧ0427ЧЧЧ:I = 0x1


# instance fields
.field public final synthetic b04440444ф0444фф:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;


# direct methods
.method public constructor <init>(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V
    .locals 2

    iput-object p1, p0, Lrrrrrr/crcrrr;->b04440444ф0444фф:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    sget v0, Lrrrrrr/crcrrr;->bЧ0427ЧЧЧЧ:I

    sget v1, Lrrrrrr/crcrrr;->bЧЧ0427ЧЧЧ:I

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/crcrrr;->bЧ0427ЧЧЧЧ:I

    mul-int/2addr v0, v1

    invoke-static {}, Lrrrrrr/crcrrr;->b0427Ч0427ЧЧЧ()I

    move-result v1

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/crcrrr;->b04270427ЧЧЧЧ:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lrrrrrr/crcrrr;->bЧ04270427ЧЧЧ()I

    move-result v0

    sput v0, Lrrrrrr/crcrrr;->bЧ0427ЧЧЧЧ:I

    invoke-static {}, Lrrrrrr/crcrrr;->bЧ04270427ЧЧЧ()I

    move-result v0

    sput v0, Lrrrrrr/crcrrr;->b04270427ЧЧЧЧ:I

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b0427Ч0427ЧЧЧ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bЧ04270427ЧЧЧ()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lrrrrrr/crcrrr;->b04440444ф0444фф:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    sget v1, Lrrrrrr/crcrrr;->bЧ0427ЧЧЧЧ:I

    sget v2, Lrrrrrr/crcrrr;->bЧЧ0427ЧЧЧ:I

    add-int/2addr v1, v2

    sget v2, Lrrrrrr/crcrrr;->bЧ0427ЧЧЧЧ:I

    mul-int/2addr v1, v2

    sget v2, Lrrrrrr/crcrrr;->b042704270427ЧЧЧ:I

    rem-int/2addr v1, v2

    sget v2, Lrrrrrr/crcrrr;->b04270427ЧЧЧЧ:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lrrrrrr/crcrrr;->bЧ04270427ЧЧЧ()I

    move-result v1

    sput v1, Lrrrrrr/crcrrr;->bЧ0427ЧЧЧЧ:I

    const/16 v1, 0x28

    sput v1, Lrrrrrr/crcrrr;->b04270427ЧЧЧЧ:I

    :cond_0
    :try_start_1
    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411Б0411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

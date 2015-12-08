.class public Lcom/google/android/gms/internal/es;
.super Lcom/google/android/gms/internal/em;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/es$1;,
        Lcom/google/android/gms/internal/es$a;
    }
.end annotation


# static fields
.field private static final NAMESPACE:Ljava/lang/String;

.field private static final zG:J

.field private static final zH:J

.field private static final zI:J

.field private static final zJ:J


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private zK:J

.field private zL:Lcom/google/android/gms/cast/MediaStatus;

.field private final zM:Lcom/google/android/gms/internal/ev;

.field private final zN:Lcom/google/android/gms/internal/ev;

.field private final zO:Lcom/google/android/gms/internal/ev;

.field private final zP:Lcom/google/android/gms/internal/ev;

.field private final zQ:Lcom/google/android/gms/internal/ev;

.field private final zR:Lcom/google/android/gms/internal/ev;

.field private final zS:Lcom/google/android/gms/internal/ev;

.field private final zT:Lcom/google/android/gms/internal/ev;

.field private final zU:Ljava/lang/Runnable;

.field private zV:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/16 v2, 0x18

    const-string v0, "com.google.cast.media"

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/es;->NAMESPACE:Ljava/lang/String;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/es;->zG:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/es;->zH:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/es;->zI:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/es;->zJ:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/es;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/es;->NAMESPACE:Ljava/lang/String;

    const-string v1, "MediaControlChannel"

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/em;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/es$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/es$a;-><init>(Lcom/google/android/gms/internal/es;Lcom/google/android/gms/internal/es$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zU:Ljava/lang/Runnable;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zH:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zG:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zG:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zG:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zI:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zG:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zG:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/ev;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zG:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ev;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    invoke-direct {p0}, Lcom/google/android/gms/internal/es;->dS()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method private a(JLorg/json/JSONObject;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ev;->n(J)Z

    move-result v3

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ev;->dU()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ev;->n(J)Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ev;->dU()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/ev;->n(J)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ev;->dU()Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/ev;->n(J)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_1
    :goto_1
    if-eqz v0, :cond_a

    const/4 v0, 0x2

    :goto_2
    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x1

    :cond_2
    if-nez v3, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    if-nez v1, :cond_9

    :cond_3
    new-instance v0, Lcom/google/android/gms/cast/MediaStatus;

    invoke-direct {v0, p3}, Lcom/google/android/gms/cast/MediaStatus;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/es;->zK:J

    const/4 v0, 0x7

    :goto_3
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/internal/es;->zK:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->onStatusUpdated()V

    :cond_4
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/internal/es;->zK:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->onStatusUpdated()V

    :cond_5
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->onMetadataUpdated()V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    return-void

    :cond_7
    move v0, v2

    goto/16 :goto_0

    :cond_8
    move v1, v2

    goto :goto_1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v1, p3, v0}, Lcom/google/android/gms/cast/MediaStatus;->a(Lorg/json/JSONObject;I)I

    move-result v0

    goto :goto_3

    :cond_a
    move v0, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/android/gms/internal/es;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/es;->zV:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/es;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/es;->w(Z)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method private dS()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/es;->w(Z)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/es;->zK:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ev;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ev;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ev;->clear()V

    return-void
.end method

.method static synthetic e(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/es;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method private w(Z)V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/es;->zV:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/es;->zV:Z

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zU:Ljava/lang/Runnable;

    sget-wide v2, Lcom/google/android/gms/internal/es;->zJ:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/es;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zU:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0
.end method


# virtual methods
.method public final U(Ljava/lang/String;)V
    .locals 9

    const/4 v8, 0x2

    const/4 v7, 0x0

    const/4 v6, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->yY:Lcom/google/android/gms/internal/er;

    const-string v1, "message received: %s"

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/er;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "requestId"

    const-wide/16 v4, -0x1

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    const-string v4, "MEDIA_STATUS"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "status"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v2, v3, v0}, Lcom/google/android/gms/internal/es;->a(JLorg/json/JSONObject;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->onStatusUpdated()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->onMetadataUpdated()V

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ev;->c(JI)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->yY:Lcom/google/android/gms/internal/er;

    const-string v2, "Message is malformed (%s); ignoring: %s"

    new-array v3, v8, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v7

    aput-object p1, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/er;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :try_start_1
    const-string v4, "INVALID_PLAYER_STATE"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->yY:Lcom/google/android/gms/internal/er;

    const-string v4, "received unexpected error: Invalid Player State."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/er;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    goto :goto_0

    :cond_3
    const-string v4, "LOAD_FAILED"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    goto/16 :goto_0

    :cond_4
    const-string v4, "LOAD_CANCELLED"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x2

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    goto/16 :goto_0

    :cond_5
    const-string v4, "INVALID_REQUEST"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->yY:Lcom/google/android/gms/internal/er;

    const-string v4, "received unexpected error: Invalid Request."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/er;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ev;->b(JILorg/json/JSONObject;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/eu;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "GET_STATUS"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    if-eqz v1, :cond_0

    const-string v1, "mediaSessionId"

    iget-object v4, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v4}, Lcom/google/android/gms/cast/MediaStatus;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/eu;DLorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Volume cannot be "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "SET_VOLUME"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "level"

    invoke-virtual {v1, v4, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v4, "volume"

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p4, :cond_2

    const-string v1, "customData"

    invoke-virtual {v0, v1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/eu;JILorg/json/JSONObject;)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    const/4 v6, 0x1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "SEEK"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "currentTime"

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/eo;->m(J)D

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    if-ne p4, v6, :cond_2

    const-string v1, "resumeState"

    const-string v4, "PLAYBACK_START"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    :goto_0
    if-eqz p5, :cond_1

    const-string v1, "customData"

    invoke-virtual {v0, v1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :cond_2
    const/4 v1, 0x2

    if-ne p4, v1, :cond_0

    :try_start_1
    const-string v1, "resumeState"

    const-string v4, "PLAYBACK_PAUSE"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/eu;Lcom/google/android/gms/cast/MediaInfo;ZJLorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "LOAD"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "media"

    invoke-virtual {p2}, Lcom/google/android/gms/cast/MediaInfo;->dB()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "autoplay"

    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "currentTime"

    invoke-static {p4, p5}, Lcom/google/android/gms/internal/eo;->m(J)D

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    if-eqz p6, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/eu;Lorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "PAUSE"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/eu;ZLorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "SET_VOLUME"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "muted"

    invoke-virtual {v1, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v4, "volume"

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p3, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(JI)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zM:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zN:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zQ:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zR:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zS:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zT:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ev;->c(JI)Z

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/eu;Lorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zP:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "STOP"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/internal/eu;Lorg/json/JSONObject;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dE()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->zO:Lcom/google/android/gms/internal/ev;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ev;->a(JLcom/google/android/gms/internal/eu;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/es;->w(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "PLAY"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->dC()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/es;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public dC()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No current media session"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->dC()J

    move-result-wide v0

    return-wide v0
.end method

.method public dF()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/es;->dS()V

    return-void
.end method

.method public getApproximateStreamPosition()J
    .locals 12

    const-wide/16 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v8

    if-nez v8, :cond_1

    :cond_0
    :goto_0
    return-wide v2

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/es;->zK:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlaybackRate()D

    move-result-wide v10

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getStreamPosition()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlayerState()I

    move-result v0

    const-wide/16 v6, 0x0

    cmpl-double v1, v10, v6

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    :cond_2
    move-wide v2, v4

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v6, p0, Lcom/google/android/gms/internal/es;->zK:J

    sub-long/2addr v0, v6

    cmp-long v6, v0, v2

    if-gez v6, :cond_7

    move-wide v6, v2

    :goto_1
    cmp-long v0, v6, v2

    if-nez v0, :cond_4

    move-wide v2, v4

    goto :goto_0

    :cond_4
    invoke-virtual {v8}, Lcom/google/android/gms/cast/MediaInfo;->getStreamDuration()J

    move-result-wide v0

    long-to-double v6, v6

    mul-double/2addr v6, v10

    double-to-long v6, v6

    add-long/2addr v4, v6

    cmp-long v6, v4, v0

    if-lez v6, :cond_5

    :goto_2
    move-wide v2, v0

    goto :goto_0

    :cond_5
    cmp-long v0, v4, v2

    if-gez v0, :cond_6

    move-wide v0, v2

    goto :goto_2

    :cond_6
    move-wide v0, v4

    goto :goto_2

    :cond_7
    move-wide v6, v0

    goto :goto_1
.end method

.method public getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    goto :goto_0
.end method

.method public getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->zL:Lcom/google/android/gms/cast/MediaStatus;

    return-object v0
.end method

.method public getStreamDuration()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/es;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->getStreamDuration()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method protected onMetadataUpdated()V
    .locals 0

    return-void
.end method

.method protected onStatusUpdated()V
    .locals 0

    return-void
.end method

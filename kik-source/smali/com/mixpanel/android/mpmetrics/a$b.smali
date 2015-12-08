.class final Lcom/mixpanel/android/mpmetrics/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/a$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/a;

.field private final b:Ljava/lang/Object;

.field private c:Landroid/os/Handler;

.field private d:J

.field private e:J

.field private f:J

.field private g:Lcom/mixpanel/android/mpmetrics/ak;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/a;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 195
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 568
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->b:Ljava/lang/Object;

    .line 570
    iput-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b;->d:J

    .line 571
    iput-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b;->e:J

    .line 572
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->f:J

    .line 196
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "com.mixpanel.android.AnalyticsWorker"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Lcom/mixpanel/android/mpmetrics/a$b$a;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/mixpanel/android/mpmetrics/a$b$a;-><init>(Lcom/mixpanel/android/mpmetrics/a$b;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b;->c:Landroid/os/Handler;

    .line 197
    return-void
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/a$b;Lcom/mixpanel/android/mpmetrics/ak;)Lcom/mixpanel/android/mpmetrics/ak;
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/a$b;->g:Lcom/mixpanel/android/mpmetrics/ak;

    return-object p1
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/a$b;)V
    .locals 10

    .prologue
    .line 194
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b;->d:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iget-wide v4, p0, Lcom/mixpanel/android/mpmetrics/a$b;->f:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    iget-wide v4, p0, Lcom/mixpanel/android/mpmetrics/a$b;->f:J

    sub-long v4, v0, v4

    iget-wide v6, p0, Lcom/mixpanel/android/mpmetrics/a$b;->e:J

    iget-wide v8, p0, Lcom/mixpanel/android/mpmetrics/a$b;->d:J

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    div-long/2addr v4, v2

    iput-wide v4, p0, Lcom/mixpanel/android/mpmetrics/a$b;->e:J

    iget-wide v4, p0, Lcom/mixpanel/android/mpmetrics/a$b;->e:J

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Average send frequency approximately "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " seconds."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    :cond_0
    iput-wide v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->f:J

    iput-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b;->d:J

    return-void
.end method

.method static synthetic b(Lcom/mixpanel/android/mpmetrics/a$b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/mixpanel/android/mpmetrics/a$b;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 194
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->c:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->g:Lcom/mixpanel/android/mpmetrics/ak;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 206
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 207
    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Dead mixpanel worker dropping a message: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 213
    :goto_0
    monitor-exit v1

    return-void

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b;->c:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 213
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.class public Lcom/google/android/gms/internal/fb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fb$a;
    }
.end annotation


# instance fields
.field private final li:I

.field private final lj:I

.field protected final mo:Lcom/google/android/gms/internal/gu;

.field private final tr:Landroid/os/Handler;

.field private final ts:J

.field private tt:J

.field private tu:Lcom/google/android/gms/internal/gv$a;

.field protected tv:Z

.field protected tw:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gv$a;Lcom/google/android/gms/internal/gu;II)V
    .locals 10

    const-wide/16 v6, 0xc8

    const-wide/16 v8, 0x32

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/fb;-><init>(Lcom/google/android/gms/internal/gv$a;Lcom/google/android/gms/internal/gu;IIJJ)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/gv$a;Lcom/google/android/gms/internal/gu;IIJJ)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p5, p0, Lcom/google/android/gms/internal/fb;->ts:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/fb;->tt:J

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fb;->tr:Landroid/os/Handler;

    iput-object p2, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    iput-object p1, p0, Lcom/google/android/gms/internal/fb;->tu:Lcom/google/android/gms/internal/gv$a;

    iput-boolean v2, p0, Lcom/google/android/gms/internal/fb;->tv:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/fb;->tw:Z

    iput p4, p0, Lcom/google/android/gms/internal/fb;->lj:I

    iput p3, p0, Lcom/google/android/gms/internal/fb;->li:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/fb;->li:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/fb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/fb;->lj:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/fb;)J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/fb;->tt:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/fb;->tt:J

    return-wide v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/fb;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/fb;->tt:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/fb;)Lcom/google/android/gms/internal/gv$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->tu:Lcom/google/android/gms/internal/gv$a;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/fb;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/fb;->ts:J

    return-wide v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/fb;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->tr:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/fj;Lcom/google/android/gms/internal/gz;)V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/gu;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v1, p1, Lcom/google/android/gms/internal/fj;->sg:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v5

    :goto_0
    iget-object v2, p1, Lcom/google/android/gms/internal/fj;->tU:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/gu;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/internal/fj;->sg:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/gi;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/fj;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/gz;

    iget-object v1, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v2, p1, Lcom/google/android/gms/internal/fj;->ud:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/gz;-><init>(Lcom/google/android/gms/internal/fb;Lcom/google/android/gms/internal/gu;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/fb;->a(Lcom/google/android/gms/internal/fj;Lcom/google/android/gms/internal/gz;)V

    return-void
.end method

.method public cF()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->tr:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/google/android/gms/internal/fb;->ts:J

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public declared-synchronized cG()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/fb;->tv:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized cH()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/fb;->tv:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public cI()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/fb;->tw:Z

    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fb;->cH()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fb;->tu:Lcom/google/android/gms/internal/gv$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/gv$a;->a(Lcom/google/android/gms/internal/gu;)V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/fb$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/fb;->mo:Lcom/google/android/gms/internal/gu;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/fb$a;-><init>(Lcom/google/android/gms/internal/fb;Landroid/webkit/WebView;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fb$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

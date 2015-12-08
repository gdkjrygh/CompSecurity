.class final Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;
.super Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;


# direct methods
.method public constructor <init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/util/concurrent/Callable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 11

    .prologue
    .line 320
    iput-object p1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->c:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    .line 321
    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;-><init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/util/concurrent/Callable;JJLjava/util/concurrent/TimeUnit;B)V

    .line 322
    return-void
.end method


# virtual methods
.method protected final runAndReset()Z
    .locals 4

    .prologue
    .line 327
    invoke-super {p0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->runAndReset()Z

    move-result v0

    .line 328
    invoke-virtual {p0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 329
    iget-object v1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->c:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->f(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->e()J

    move-result-wide v2

    invoke-static {v1, p0, v2, v3}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;J)Ljava/util/concurrent/ScheduledFuture;

    .line 331
    :cond_0
    return v0
.end method

.class final Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "SourceFile"

# interfaces
.implements Lkik/android/sdkutils/concurrent/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;


# direct methods
.method public constructor <init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    .line 108
    iput-object p1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    .line 109
    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v1, p0

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 110
    return-void
.end method

.method static synthetic a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    .prologue
    .line 105
    invoke-direct {p0, p1, p2, p3}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    return-object v0
.end method

.method private a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 6

    .prologue
    .line 152
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p2

    .line 153
    iget-object v2, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v2}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {p1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    iget-object v2, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v2}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Landroid/app/AlarmManager;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {p1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->c()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 155
    return-object p1
.end method


# virtual methods
.method public final schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    .prologue
    .line 115
    new-instance v1, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;

    iget-object v2, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    new-instance v3, Lkik/android/sdkutils/concurrent/b;

    invoke-direct {v3, p1}, Lkik/android/sdkutils/concurrent/b;-><init>(Ljava/lang/Runnable;)V

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;-><init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)V

    .line 116
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->c(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 118
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Landroid/app/AlarmManager;

    move-result-object v0

    const/4 v4, 0x2

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->d(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v4, v2, v3, v5}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 119
    return-object v1
.end method

.method public final schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    .prologue
    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scheduling with delay "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    new-instance v1, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;

    iget-object v2, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;-><init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)V

    .line 127
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->c(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 128
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Landroid/app/AlarmManager;

    move-result-object v0

    const/4 v4, 0x2

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->d(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v4, v2, v3, v5}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 130
    return-object v1
.end method

.method public final scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10

    .prologue
    .line 136
    new-instance v1, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;

    iget-object v2, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    new-instance v3, Lkik/android/sdkutils/concurrent/b;

    invoke-direct {v3, p1}, Lkik/android/sdkutils/concurrent/b;-><init>(Ljava/lang/Runnable;)V

    const/4 v9, 0x0

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v9}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;-><init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/util/concurrent/Callable;JJLjava/util/concurrent/TimeUnit;B)V

    .line 137
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->c(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)J

    move-result-wide v4

    add-long/2addr v4, v2

    .line 138
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Landroid/app/AlarmManager;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->e(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)J

    move-result-wide v6

    invoke-static {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->d(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Landroid/app/PendingIntent;

    move-result-object v8

    invoke-virtual/range {v2 .. v8}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    .line 140
    return-object v1
.end method

.method public final scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10

    .prologue
    .line 146
    new-instance v1, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;

    iget-object v2, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    new-instance v3, Lkik/android/sdkutils/concurrent/b;

    invoke-direct {v3, p1}, Lkik/android/sdkutils/concurrent/b;-><init>(Ljava/lang/Runnable;)V

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;-><init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/util/concurrent/Callable;JJLjava/util/concurrent/TimeUnit;)V

    .line 147
    invoke-virtual {v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;->d()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    return-object v0
.end method

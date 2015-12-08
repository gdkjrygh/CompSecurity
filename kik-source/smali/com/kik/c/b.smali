.class public final Lcom/kik/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/c/b$c;,
        Lcom/kik/c/b$a;,
        Lcom/kik/c/b$b;
    }
.end annotation


# static fields
.field private static f:Lorg/c/b;


# instance fields
.field a:Lcom/c/a/h/a/a;

.field b:Ljava/util/concurrent/atomic/AtomicLong;

.field c:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile d:J

.field private volatile e:J

.field private final g:Lcom/kik/c/d;

.field private final h:Ljava/io/File;

.field private final i:Ljava/text/SimpleDateFormat;

.field private final j:Ljava/lang/String;

.field private k:Ljava/io/File;

.field private l:I

.field private final m:Ljava/util/concurrent/ExecutorService;

.field private final n:Ljava/util/concurrent/ScheduledExecutorService;

.field private o:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    const-string v0, "Augmentum"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/c/b;->f:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/c/d;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 79
    const-string v0, "https://clientmetrics-augmentum.kik.com/clientmetrics/augmentum/v1/data?flattened=true"

    invoke-direct {p0, p1, p2, v0}, Lcom/kik/c/b;-><init>(Lcom/kik/c/d;Ljava/io/File;Ljava/lang/String;)V

    .line 80
    return-void
.end method

.method private constructor <init>(Lcom/kik/c/d;Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const-wide/16 v0, 0x4e20

    iput-wide v0, p0, Lcom/kik/c/b;->d:J

    .line 53
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcom/kik/c/b;->e:J

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/c/b;->k:Ljava/io/File;

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/c/b;->l:I

    .line 65
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/c/b;->m:Ljava/util/concurrent/ExecutorService;

    .line 66
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/c/b;->n:Ljava/util/concurrent/ScheduledExecutorService;

    .line 69
    invoke-static {}, Lcom/c/a/h/a/a;->a()Lcom/c/a/h/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/c/b;->a:Lcom/c/a/h/a/a;

    .line 70
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/kik/c/b;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 72
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/kik/c/b;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 84
    iput-object p1, p0, Lcom/kik/c/b;->g:Lcom/kik/c/d;

    .line 85
    iput-object p2, p0, Lcom/kik/c/b;->h:Ljava/io/File;

    .line 86
    iput-object p3, p0, Lcom/kik/c/b;->j:Ljava/lang/String;

    .line 88
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kik/c/b;->i:Ljava/text/SimpleDateFormat;

    .line 89
    new-instance v0, Ljava/util/GregorianCalendar;

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 91
    new-instance v1, Ljava/util/Date;

    const-wide/high16 v2, -0x8000000000000000L

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/util/GregorianCalendar;->setGregorianChange(Ljava/util/Date;)V

    .line 92
    iget-object v1, p0, Lcom/kik/c/b;->i:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->setCalendar(Ljava/util/Calendar;)V

    .line 93
    return-void
.end method

.method static synthetic a(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/c/b;->n:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/c/b;Lorg/json/JSONObject;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    const/4 v3, 0x0

    .line 42
    iget-object v1, p0, Lcom/kik/c/b;->h:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/kik/c/b;->h:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v0, Lcom/kik/c/b;->f:Lorg/c/b;

    const-string v1, "Could not create metrics directory"

    invoke-interface {v0, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v4, p0, Lcom/kik/c/b;->n:Ljava/util/concurrent/ScheduledExecutorService;

    monitor-enter v4

    :try_start_0
    iget-object v1, p0, Lcom/kik/c/b;->k:Ljava/io/File;

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/kik/c/b;->l:I

    const/16 v5, 0x32

    if-lt v1, v5, :cond_3

    :cond_2
    new-instance v1, Ljava/io/File;

    iget-object v5, p0, Lcom/kik/c/b;->h:Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/kik/c/b;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".met"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/c/b;->k:Ljava/io/File;

    const/4 v1, 0x0

    iput v1, p0, Lcom/kik/c/b;->l:I

    :cond_3
    iget v1, p0, Lcom/kik/c/b;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/kik/c/b;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v5, p0, Lcom/kik/c/b;->k:Ljava/io/File;

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "\n"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "UTF-8"

    invoke-static {v5}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    iget-wide v0, p0, Lcom/kik/c/b;->e:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/kik/c/b;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-lez v6, :cond_4

    sub-long v6, v4, v2

    cmp-long v6, v6, v0

    if-lez v6, :cond_4

    sub-long v0, v4, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    :cond_4
    iget-object v2, p0, Lcom/kik/c/b;->n:Ljava/util/concurrent/ScheduledExecutorService;

    monitor-enter v2

    :try_start_5
    iget-object v3, p0, Lcom/kik/c/b;->o:Ljava/util/concurrent/ScheduledFuture;

    if-nez v3, :cond_5

    iget-object v3, p0, Lcom/kik/c/b;->n:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Lcom/kik/c/b$a;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/kik/c/b$a;-><init>(Lcom/kik/c/b;B)V

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v3, v4, v0, v1, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/c/b;->o:Ljava/util/concurrent/ScheduledFuture;

    :cond_5
    monitor-exit v2

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :catch_0
    move-exception v1

    :try_start_6
    sget-object v2, Lcom/kik/c/b;->f:Lorg/c/b;

    const-string v3, "Failed to close file"

    invoke-interface {v2, v3, v1}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0

    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_7
    sget-object v2, Lcom/kik/c/b;->f:Lorg/c/b;

    const-string v5, "Failed to write to metrics log"

    invoke-interface {v2, v5, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/c/b;->k:Ljava/io/File;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-eqz v1, :cond_6

    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_6
    move v0, v3

    goto :goto_1

    :catch_2
    move-exception v0

    :try_start_9
    sget-object v1, Lcom/kik/c/b;->f:Lorg/c/b;

    const-string v2, "Failed to close file"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    move v0, v3

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_7

    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :cond_7
    :goto_4
    :try_start_b
    throw v0

    :catch_3
    move-exception v1

    sget-object v2, Lcom/kik/c/b;->f:Lorg/c/b;

    const-string v3, "Failed to close file"

    invoke-interface {v2, v3, v1}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2
.end method

.method static synthetic b(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/c/b;->o:Ljava/util/concurrent/ScheduledFuture;

    return-object v0
.end method

.method static synthetic b()Lorg/c/b;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/kik/c/b;->f:Lorg/c/b;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/c/b;->o:Ljava/util/concurrent/ScheduledFuture;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/c/b;)Ljava/io/File;
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/c/b;->k:Ljava/io/File;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/c/b;)Ljava/io/File;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/c/b;->h:Ljava/io/File;

    return-object v0
.end method

.method static synthetic f(Lcom/kik/c/b;)J
    .locals 2

    .prologue
    .line 42
    iget-wide v0, p0, Lcom/kik/c/b;->d:J

    return-wide v0
.end method

.method static synthetic g(Lcom/kik/c/b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/c/b;->j:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 274
    iget-object v0, p0, Lcom/kik/c/b;->n:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/kik/c/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/kik/c/b$a;-><init>(Lcom/kik/c/b;B)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 275
    return-void
.end method

.method public final a(Lcom/kik/android/a$f;Lorg/json/JSONObject;)V
    .locals 8

    .prologue
    .line 116
    invoke-virtual {p1}, Lcom/kik/android/a$f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/android/a$f;->f()Lorg/json/JSONObject;

    move-result-object v1

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "event:origin"

    const-string v4, "mobile"

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "event:name"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "instanceId"

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "timestamp"

    iget-object v3, p0, Lcom/kik/c/b;->i:Ljava/text/SimpleDateFormat;

    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkik/a/h/j;->a()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_0

    const-string v0, "commonData:Server Time"

    iget-object v3, p0, Lcom/kik/c/b;->i:Ljava/text/SimpleDateFormat;

    new-instance v4, Ljava/util/Date;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v0, p0, Lcom/kik/c/b;->g:Lcom/kik/c/d;

    invoke-interface {v0}, Lcom/kik/c/d;->d()Lkik/a/d/j;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v3, "userJid"

    invoke-virtual {v0}, Lkik/a/d/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v0, "deviceId"

    iget-object v3, p0, Lcom/kik/c/b;->g:Lcom/kik/c/d;

    invoke-interface {v3}, Lcom/kik/c/d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "clientVersion"

    iget-object v3, p0, Lcom/kik/c/b;->g:Lcom/kik/c/d;

    invoke-interface {v3}, Lcom/kik/c/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "devicePrefix"

    const-string v3, "CAN"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "commonData:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/kik/c/b;->f:Lorg/c/b;

    const-string v2, "Error constructing augmentum event: {}"

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/c/b;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    :goto_1
    return-void

    .line 116
    :cond_2
    :try_start_1
    const-string v0, "commonData:Android Id"

    iget-object v3, p0, Lcom/kik/c/b;->g:Lcom/kik/c/d;

    invoke-interface {v3}, Lcom/kik/c/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "eventData:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/kik/c/b;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/c/c;

    invoke-direct {v1, p0, v2}, Lcom/kik/c/c;-><init>(Lcom/kik/c/b;Lorg/json/JSONObject;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

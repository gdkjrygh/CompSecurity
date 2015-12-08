.class final Lcom/b/a/c/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field static final a:Ljava/io/FilenameFilter;

.field static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Ljava/io/FilenameFilter;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final i:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final j:Ljava/io/File;

.field private final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final l:Landroid/content/BroadcastReceiver;

.field private final m:Landroid/content/BroadcastReceiver;

.field private final n:Lcom/b/a/c/u;

.field private final o:La/a/a/a/a/b/x;

.field private p:Z

.field private final q:Lcom/b/a/c/h;

.field private final r:Lcom/b/a/c/aw;

.field private final s:Lcom/b/a/c/bu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 122
    new-instance v0, Lcom/b/a/c/ab;

    invoke-direct {v0}, Lcom/b/a/c/ab;-><init>()V

    sput-object v0, Lcom/b/a/c/aa;->a:Ljava/io/FilenameFilter;

    .line 130
    new-instance v0, Lcom/b/a/c/ah;

    invoke-direct {v0}, Lcom/b/a/c/ah;-><init>()V

    sput-object v0, Lcom/b/a/c/aa;->b:Ljava/util/Comparator;

    .line 137
    new-instance v0, Lcom/b/a/c/ai;

    invoke-direct {v0}, Lcom/b/a/c/ai;-><init>()V

    sput-object v0, Lcom/b/a/c/aa;->c:Ljava/util/Comparator;

    .line 147
    new-instance v0, Lcom/b/a/c/aj;

    invoke-direct {v0}, Lcom/b/a/c/aj;-><init>()V

    sput-object v0, Lcom/b/a/c/aa;->d:Ljava/io/FilenameFilter;

    .line 154
    const-string v0, "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/b/a/c/aa;->e:Ljava/util/regex/Pattern;

    .line 157
    const-string v0, "X-CRASHLYTICS-SEND-FLAGS"

    const-string v1, "1"

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/b/a/c/aa;->f:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/b/a/c/u;La/a/a/a/a/b/x;Lcom/b/a/c/bu;Lcom/b/a/c/h;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/b/a/c/aa;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 185
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/b/a/c/aa;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 217
    iput-object p1, p0, Lcom/b/a/c/aa;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 218
    iput-object p2, p0, Lcom/b/a/c/aa;->n:Lcom/b/a/c/u;

    .line 219
    iput-object p3, p0, Lcom/b/a/c/aa;->o:La/a/a/a/a/b/x;

    .line 220
    iput-object p5, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    .line 221
    iput-object p4, p0, Lcom/b/a/c/aa;->s:Lcom/b/a/c/bu;

    .line 222
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 224
    invoke-virtual {p5}, Lcom/b/a/c/h;->q()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    .line 225
    new-instance v0, Lcom/b/a/c/aw;

    invoke-virtual {p5}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    invoke-direct {v0, v1, v2}, Lcom/b/a/c/aw;-><init>(Landroid/content/Context;Ljava/io/File;)V

    iput-object v0, p0, Lcom/b/a/c/aa;->r:Lcom/b/a/c/aw;

    .line 1319
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1320
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v1}, Lcom/b/a/c/h;->q()Ljava/io/File;

    move-result-object v1

    const-string v2, "crash_marker"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1323
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1324
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 229
    :cond_0
    new-instance v0, Lcom/b/a/c/ak;

    invoke-direct {v0, p0}, Lcom/b/a/c/ak;-><init>(Lcom/b/a/c/aa;)V

    iput-object v0, p0, Lcom/b/a/c/aa;->m:Landroid/content/BroadcastReceiver;

    .line 236
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.ACTION_POWER_CONNECTED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 238
    new-instance v1, Lcom/b/a/c/al;

    invoke-direct {v1, p0}, Lcom/b/a/c/al;-><init>(Lcom/b/a/c/aa;)V

    iput-object v1, p0, Lcom/b/a/c/aa;->l:Landroid/content/BroadcastReceiver;

    .line 245
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.ACTION_POWER_DISCONNECTED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 248
    invoke-virtual {p5}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v2

    .line 249
    iget-object v3, p0, Lcom/b/a/c/aa;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 250
    iget-object v0, p0, Lcom/b/a/c/aa;->l:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 251
    iget-object v0, p0, Lcom/b/a/c/aa;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 252
    return-void
.end method

.method private static a(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 549
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x23

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/b/a/c/aa;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic a(Lcom/b/a/c/aa;Lcom/b/a/c/a/a/d;)V
    .locals 8

    .prologue
    const/4 v3, 0x1

    const/4 v0, 0x0

    .line 9421
    .line 9533
    :try_start_0
    invoke-direct {p0}, Lcom/b/a/c/aa;->h()[Ljava/io/File;

    move-result-object v1

    .line 9534
    sget-object v2, Lcom/b/a/c/aa;->b:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 9535
    array-length v2, v1

    if-le v2, v3, :cond_0

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/b/a/c/aa;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .line 9426
    :goto_0
    if-eqz v2, :cond_1

    .line 9429
    invoke-static {v2}, Lcom/b/a/c/h;->a(Ljava/lang/String;)V

    .line 9431
    new-instance v1, Lcom/b/a/c/d;

    iget-object v3, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "SessionCrash"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9432
    :try_start_1
    invoke-static {v1}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 9434
    :try_start_2
    new-instance v3, Lcom/b/a/c/ay;

    iget-object v4, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    invoke-direct {v3, v4}, Lcom/b/a/c/ay;-><init>(Ljava/io/File;)V

    invoke-virtual {v3, v2}, Lcom/b/a/c/ay;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 9436
    new-instance v4, Lcom/b/a/c/aw;

    iget-object v5, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v5}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v5

    iget-object v6, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    invoke-direct {v4, v5, v6, v2}, Lcom/b/a/c/aw;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 9439
    invoke-static {p1, v4, v3, v0}, Lcom/b/a/c/az;->a(Lcom/b/a/c/a/a/d;Lcom/b/a/c/aw;Ljava/util/Map;Lcom/b/a/c/f;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 9450
    :goto_1
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v0, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 9451
    const-string v0, "Failed to close fatal exception file output stream."

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 9452
    :goto_2
    return-void

    :cond_0
    move-object v2, v0

    .line 9535
    goto :goto_0

    .line 9442
    :cond_1
    :try_start_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Tried to write a native crash while no session was open."

    const/4 v4, 0x0

    invoke-interface {v1, v2, v3, v4}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v0

    goto :goto_1

    .line 9445
    :catch_0
    move-exception v1

    move-object v2, v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    .line 9446
    :goto_3
    :try_start_4
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "CrashlyticsCore"

    const-string v5, "An error occurred in the native crash logger"

    invoke-interface {v3, v4, v5, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9448
    invoke-static {v0, v2}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 9450
    const-string v0, "Failed to flush to session begin file."

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 9451
    const-string v0, "Failed to close fatal exception file output stream."

    invoke-static {v2, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_2

    .line 9450
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    :goto_4
    const-string v3, "Failed to flush to session begin file."

    invoke-static {v1, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 9451
    const-string v1, "Failed to close fatal exception file output stream."

    invoke-static {v2, v1}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    .line 9450
    :catchall_1
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_4

    :catchall_2
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_4

    .line 9445
    :catch_1
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_3

    :catch_2
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_3
.end method

.method static synthetic a(Lcom/b/a/c/aa;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 56
    .line 8384
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    const-string v3, "crash_marker"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 8522
    invoke-direct {p0}, Lcom/b/a/c/aa;->h()[Ljava/io/File;

    move-result-object v0

    .line 8523
    sget-object v2, Lcom/b/a/c/aa;->b:Ljava/util/Comparator;

    invoke-static {v0, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 8524
    array-length v2, v0

    if-lez v2, :cond_1

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/b/a/c/aa;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    .line 8388
    :goto_0
    if-eqz v0, :cond_2

    .line 8391
    invoke-static {v0}, Lcom/b/a/c/h;->a(Ljava/lang/String;)V

    .line 8393
    new-instance v6, Lcom/b/a/c/d;

    iget-object v2, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "SessionCrash"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v2, v0}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8394
    :try_start_1
    invoke-static {v6}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;

    move-result-object v1

    .line 8395
    const-string v5, "crash"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v6

    .line 8405
    :goto_1
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v1, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 8406
    const-string v1, "Failed to close fatal exception file output stream."

    invoke-static {v0, v1}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 8613
    :goto_2
    invoke-direct {p0, v7}, Lcom/b/a/c/aa;->a(Z)V

    .line 8301
    invoke-direct {p0}, Lcom/b/a/c/aa;->g()V

    .line 8747
    iget-object v0, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    sget-object v1, Lcom/b/a/c/aa;->a:Ljava/io/FilenameFilter;

    const/4 v2, 0x4

    sget-object v3, Lcom/b/a/c/aa;->c:Ljava/util/Comparator;

    invoke-static {v0, v1, v2, v3}, Lcom/b/a/c/bx;->a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)V

    .line 8305
    iget-object v0, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v0}, Lcom/b/a/c/h;->r()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8306
    invoke-direct {p0}, Lcom/b/a/c/aa;->i()V

    .line 56
    :cond_0
    return-void

    :cond_1
    move-object v0, v1

    .line 8524
    goto :goto_0

    .line 8397
    :cond_2
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const-string v2, "CrashlyticsCore"

    const-string v3, "Tried to write a fatal exception while no session was open."

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v4}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v0, v1

    goto :goto_1

    .line 8400
    :catch_0
    move-exception v0

    move-object v6, v1

    .line 8401
    :goto_3
    :try_start_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "CrashlyticsCore"

    const-string v4, "An error occurred in the fatal exception logger"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8403
    invoke-static {v0, v6}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 8405
    const-string v0, "Failed to flush to session begin file."

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 8406
    const-string v0, "Failed to close fatal exception file output stream."

    invoke-static {v6, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_2

    .line 8405
    :catchall_0
    move-exception v0

    move-object v6, v1

    :goto_4
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v1, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 8406
    const-string v1, "Failed to close fatal exception file output stream."

    invoke-static {v6, v1}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    .line 8405
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 8400
    :catch_1
    move-exception v0

    goto :goto_3
.end method

.method private static a(Lcom/b/a/c/f;Ljava/io/File;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 1229
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1231
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    .line 1232
    long-to-int v0, v0

    new-array v3, v0, [B

    .line 1237
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1239
    const/4 v0, 0x0

    .line 1242
    :goto_0
    :try_start_1
    array-length v2, v3

    if-ge v0, v2, :cond_0

    array-length v2, v3

    sub-int/2addr v2, v0

    invoke-virtual {v1, v3, v0, v2}, Ljava/io/FileInputStream;->read([BII)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v2

    if-ltz v2, :cond_0

    .line 1244
    add-int/2addr v0, v2

    goto :goto_0

    .line 1247
    :cond_0
    const-string v0, "Failed to close file input stream."

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 1250
    invoke-virtual {p0, v3}, Lcom/b/a/c/f;->a([B)V

    .line 1255
    :goto_1
    return-void

    .line 1247
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    const-string v2, "Failed to close file input stream."

    invoke-static {v1, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    .line 1252
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const-string v1, "CrashlyticsCore"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Tried to include a file that doesn\'t exist: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3, v2}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 1247
    :catchall_1
    move-exception v0

    goto :goto_2
.end method

.method private a(Lcom/b/a/c/f;Ljava/lang/String;)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v1, 0x0

    .line 1206
    new-array v2, v8, [Ljava/lang/String;

    const-string v0, "SessionUser"

    aput-object v0, v2, v1

    const/4 v0, 0x1

    const-string v3, "SessionApp"

    aput-object v3, v2, v0

    const/4 v0, 0x2

    const-string v3, "SessionOS"

    aput-object v3, v2, v0

    const/4 v0, 0x3

    const-string v3, "SessionDevice"

    aput-object v3, v2, v0

    move v0, v1

    .line 1210
    :goto_0
    if-ge v0, v8, :cond_1

    aget-object v3, v2, v0

    .line 1211
    new-instance v4, Lcom/b/a/c/ao;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/b/a/c/ao;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v4}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    .line 1214
    array-length v5, v4

    if-nez v5, :cond_0

    .line 1215
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v4

    const-string v5, "CrashlyticsCore"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Can\'t find "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " data for session ID "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v4, v5, v3, v6}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1210
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1218
    :cond_0
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Collecting "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " data for session ID "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1220
    aget-object v3, v4, v1

    invoke-static {p1, v3}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;Ljava/io/File;)V

    goto :goto_1

    .line 1223
    :cond_1
    return-void
.end method

.method private a(Lcom/b/a/c/f;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 23

    .prologue
    .line 992
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v7

    .line 993
    invoke-virtual/range {p2 .. p2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long v4, v2, v4

    .line 994
    invoke-static {v7}, La/a/a/a/a/b/l;->c(Landroid/content/Context;)F

    move-result v10

    .line 995
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/b/a/c/aa;->p:Z

    invoke-static {v7, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Z)I

    move-result v11

    .line 996
    invoke-static {v7}, La/a/a/a/a/b/l;->d(Landroid/content/Context;)Z

    move-result v12

    .line 997
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v13, v2, Landroid/content/res/Configuration;->orientation:I

    .line 998
    invoke-static {}, La/a/a/a/a/b/l;->b()J

    move-result-wide v2

    invoke-static {v7}, La/a/a/a/a/b/l;->b(Landroid/content/Context;)J

    move-result-wide v8

    sub-long v14, v2, v8

    .line 1000
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/a/a/a/a/b/l;->b(Ljava/lang/String;)J

    move-result-wide v16

    .line 1003
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, La/a/a/a/a/b/l;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v18

    .line 1005
    new-instance v19, Ljava/util/LinkedList;

    invoke-direct/range {v19 .. v19}, Ljava/util/LinkedList;-><init>()V

    .line 1006
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v20

    .line 1010
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v3

    .line 1011
    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v2

    new-array v9, v2, [Ljava/lang/Thread;

    .line 1012
    const/4 v2, 0x0

    .line 1013
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v6, v2

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1014
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    aput-object v3, v9, v6

    .line 1015
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1016
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    .line 1017
    goto :goto_0

    .line 1025
    :cond_0
    const-string v2, "com.crashlytics.CollectCustomKeys"

    const/4 v3, 0x1

    invoke-static {v7, v2, v3}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1027
    new-instance v22, Ljava/util/TreeMap;

    invoke-direct/range {v22 .. v22}, Ljava/util/TreeMap;-><init>()V

    .line 1038
    :goto_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->s:Lcom/b/a/c/bu;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/b/a/c/aa;->r:Lcom/b/a/c/aw;

    move-object/from16 v21, v0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    invoke-virtual/range {v2 .. v22}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Thread;FIZIJJLandroid/app/ActivityManager$RunningAppProcessInfo;Ljava/util/List;[Ljava/lang/StackTraceElement;Lcom/b/a/c/aw;Ljava/util/Map;)V

    .line 1042
    return-void

    .line 1029
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->g()Ljava/util/Map;

    move-result-object v2

    .line 1030
    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    const/4 v6, 0x1

    if-le v3, v6, :cond_2

    .line 1034
    new-instance v22, Ljava/util/TreeMap;

    move-object/from16 v0, v22

    invoke-direct {v0, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_2
    move-object/from16 v22, v2

    goto :goto_1
.end method

.method private static a(Lcom/b/a/c/f;[Ljava/io/File;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 1190
    sget-object v1, La/a/a/a/a/b/l;->a:Ljava/util/Comparator;

    invoke-static {p1, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 1192
    array-length v2, p1

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v0, p1, v1

    .line 1194
    :try_start_0
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Found Non Fatal for session ID %s in %s "

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p2, v5, v6

    const/4 v6, 0x1

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1197
    invoke-static {p0, v0}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1192
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1198
    :catch_0
    move-exception v0

    .line 1199
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "CrashlyticsCore"

    const-string v5, "Error writting non-fatal to session."

    invoke-interface {v3, v4, v5, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 1203
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 687
    .line 6696
    new-instance v0, Lcom/b/a/c/ap;

    invoke-direct {v0, p1}, Lcom/b/a/c/ap;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 687
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 688
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 687
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 690
    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 18

    .prologue
    .line 620
    if-eqz p1, :cond_0

    const/4 v2, 0x1

    .line 622
    :goto_0
    add-int/lit8 v3, v2, 0x8

    .line 3752
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 3754
    invoke-direct/range {p0 .. p0}, Lcom/b/a/c/aa;->h()[Ljava/io/File;

    move-result-object v5

    .line 3755
    sget-object v6, Lcom/b/a/c/aa;->b:Ljava/util/Comparator;

    invoke-static {v5, v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 3756
    array-length v6, v5

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 3758
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v6, :cond_1

    .line 3759
    aget-object v7, v5, v3

    invoke-static {v7}, Lcom/b/a/c/aa;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v7

    .line 3760
    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3758
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 620
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 3763
    :cond_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/b/a/c/aa;->r:Lcom/b/a/c/aw;

    invoke-virtual {v3, v4}, Lcom/b/a/c/aw;->a(Ljava/util/Set;)V

    .line 3765
    new-instance v3, Lcom/b/a/c/an;

    const/4 v5, 0x0

    invoke-direct {v3, v5}, Lcom/b/a/c/an;-><init>(B)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v5

    .line 3767
    array-length v6, v5

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v6, :cond_3

    aget-object v7, v5, v3

    .line 3768
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    .line 3769
    sget-object v9, Lcom/b/a/c/aa;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v9, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    .line 3771
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 3772
    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    .line 3774
    invoke-interface {v4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 3775
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 3777
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 3767
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 625
    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/b/a/c/aa;->h()[Ljava/io/File;

    move-result-object v9

    .line 626
    sget-object v3, Lcom/b/a/c/aa;->b:Ljava/util/Comparator;

    invoke-static {v9, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 628
    array-length v3, v9

    if-le v3, v2, :cond_10

    .line 629
    aget-object v3, v9, v2

    invoke-static {v3}, Lcom/b/a/c/aa;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    .line 3951
    const/4 v5, 0x0

    .line 3952
    const/4 v3, 0x0

    .line 3954
    :try_start_0
    new-instance v4, Lcom/b/a/c/d;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v10, "SessionUser"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v7, v8}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 3955
    :try_start_1
    invoke-static {v4}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;

    move-result-object v3

    .line 4311
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    .line 3981
    if-eqz v5, :cond_8

    new-instance v5, Lcom/b/a/c/bw;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v6}, Lcom/b/a/c/h;->m()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v7}, Lcom/b/a/c/h;->o()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v8}, Lcom/b/a/c/h;->n()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v6, v7, v8}, Lcom/b/a/c/bw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v5

    .line 5038
    :goto_3
    iget-object v5, v6, Lcom/b/a/c/bw;->b:Ljava/lang/String;

    if-nez v5, :cond_9

    iget-object v5, v6, Lcom/b/a/c/bw;->c:Ljava/lang/String;

    if-nez v5, :cond_9

    iget-object v5, v6, Lcom/b/a/c/bw;->d:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_9

    const/4 v5, 0x1

    .line 3960
    :goto_4
    if-eqz v5, :cond_a

    .line 3970
    const-string v5, "Failed to flush session user file."

    invoke-static {v3, v5}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 3971
    const-string v3, "Failed to close session user file."

    invoke-static {v4, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 636
    :goto_5
    invoke-static {}, Lcom/b/a/c/h;->s()La/a/a/a/a/g/p;

    move-result-object v3

    .line 638
    if-eqz v3, :cond_e

    .line 639
    iget v10, v3, La/a/a/a/a/g/p;->c:I

    .line 641
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 643
    :goto_6
    array-length v3, v9

    if-ge v2, v3, :cond_f

    .line 644
    aget-object v11, v9, v2

    .line 645
    invoke-static {v11}, Lcom/b/a/c/aa;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v12

    .line 648
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 5105
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 5107
    new-instance v3, Lcom/b/a/c/ao;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "SessionCrash"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/b/a/c/ao;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v13

    .line 5109
    if-eqz v13, :cond_b

    array-length v3, v13

    if-lez v3, :cond_b

    const/4 v3, 0x1

    .line 5110
    :goto_7
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Session %s has fatal exception: %s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v12, v6, v7

    const/4 v7, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 5113
    new-instance v4, Lcom/b/a/c/ao;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "SessionEvent"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/b/a/c/ao;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v8

    .line 5115
    if-eqz v8, :cond_c

    array-length v4, v8

    if-lez v4, :cond_c

    const/4 v4, 0x1

    .line 5116
    :goto_8
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Session %s has non-fatal exceptions: %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v12, v7, v14

    const/4 v14, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v15, v7, v14

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 5119
    if-nez v3, :cond_4

    if-eqz v4, :cond_d

    .line 5120
    :cond_4
    const/4 v7, 0x0

    .line 5121
    const/4 v5, 0x0

    .line 5125
    :try_start_2
    new-instance v6, Lcom/b/a/c/d;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    invoke-direct {v6, v14, v12}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 5126
    :try_start_3
    invoke-static {v6}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v5

    .line 5128
    :try_start_4
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 5130
    invoke-static {v5, v11}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;Ljava/io/File;)V

    .line 5132
    const/4 v7, 0x4

    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    const-wide/16 v16, 0x3e8

    div-long v14, v14, v16

    invoke-virtual {v5, v7, v14, v15}, Lcom/b/a/c/f;->a(IJ)V

    .line 5133
    const/4 v7, 0x5

    invoke-virtual {v5, v7, v3}, Lcom/b/a/c/f;->a(IZ)V

    .line 5135
    move-object/from16 v0, p0

    invoke-direct {v0, v5, v12}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;Ljava/lang/String;)V

    .line 5137
    if-eqz v4, :cond_5

    .line 5138
    array-length v4, v8

    if-le v4, v10, :cond_11

    .line 5139
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "Trimming down to %d logged exceptions."

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v8, v11

    invoke-static {v4, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 5732
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v7, Lcom/b/a/c/ao;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v11, "SessionEvent"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/b/a/c/ao;-><init>(Ljava/lang/String;)V

    sget-object v8, Lcom/b/a/c/aa;->c:Ljava/util/Comparator;

    invoke-static {v4, v7, v10, v8}, Lcom/b/a/c/bx;->a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)V

    .line 5143
    new-instance v4, Lcom/b/a/c/ao;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "SessionEvent"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v7}, Lcom/b/a/c/ao;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    .line 5147
    :goto_9
    invoke-static {v5, v4, v12}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;[Ljava/io/File;Ljava/lang/String;)V

    .line 5150
    :cond_5
    if-eqz v3, :cond_6

    .line 5151
    const/4 v3, 0x0

    aget-object v3, v13, v3

    invoke-static {v5, v3}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/f;Ljava/io/File;)V

    .line 5154
    :cond_6
    const/16 v3, 0xb

    const/4 v4, 0x1

    invoke-virtual {v5, v3, v4}, Lcom/b/a/c/f;->a(II)V

    .line 5156
    const/16 v3, 0xc

    const/4 v4, 0x3

    invoke-virtual {v5, v3, v4}, Lcom/b/a/c/f;->b(II)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 5166
    const-string v3, "Error flushing session file stream"

    invoke-static {v5, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 5175
    const-string v3, "Failed to close CLS file"

    invoke-static {v6, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 5183
    :cond_7
    :goto_a
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 5185
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/b/a/c/aa;->a(Ljava/lang/String;)V

    .line 643
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_6

    .line 3981
    :cond_8
    :try_start_5
    new-instance v5, Lcom/b/a/c/ay;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    invoke-direct {v5, v7}, Lcom/b/a/c/ay;-><init>(Ljava/io/File;)V

    invoke-virtual {v5, v6}, Lcom/b/a/c/ay;->a(Ljava/lang/String;)Lcom/b/a/c/bw;

    move-result-object v5

    move-object v6, v5

    goto/16 :goto_3

    .line 5038
    :cond_9
    const/4 v5, 0x0

    goto/16 :goto_4

    .line 3964
    :cond_a
    iget-object v5, v6, Lcom/b/a/c/bw;->b:Ljava/lang/String;

    iget-object v7, v6, Lcom/b/a/c/bw;->c:Ljava/lang/String;

    iget-object v6, v6, Lcom/b/a/c/bw;->d:Ljava/lang/String;

    invoke-static {v3, v5, v7, v6}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 3970
    const-string v5, "Failed to flush session user file."

    invoke-static {v3, v5}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 3971
    const-string v3, "Failed to close session user file."

    invoke-static {v4, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto/16 :goto_5

    .line 3966
    :catch_0
    move-exception v2

    move-object v4, v5

    .line 3967
    :goto_b
    :try_start_6
    invoke-static {v2, v4}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    .line 3968
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 3970
    :catchall_0
    move-exception v2

    :goto_c
    const-string v5, "Failed to flush session user file."

    invoke-static {v3, v5}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 3971
    const-string v3, "Failed to close session user file."

    invoke-static {v4, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 5109
    :cond_b
    const/4 v3, 0x0

    goto/16 :goto_7

    .line 5115
    :cond_c
    const/4 v4, 0x0

    goto/16 :goto_8

    .line 5157
    :catch_1
    move-exception v3

    move-object v4, v5

    move-object v5, v7

    .line 5158
    :goto_d
    :try_start_7
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v6

    const-string v7, "CrashlyticsCore"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v11, "Failed to write session file for session ID: "

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8, v3}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5160
    invoke-static {v3, v5}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 5166
    const-string v3, "Error flushing session file stream"

    invoke-static {v4, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 6673
    if-eqz v5, :cond_7

    .line 6675
    :try_start_8
    invoke-virtual {v5}, Lcom/b/a/c/d;->a()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_a

    .line 6676
    :catch_2
    move-exception v3

    .line 6677
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v4

    const-string v5, "CrashlyticsCore"

    const-string v6, "Error closing session file stream in the presence of an exception"

    invoke-interface {v4, v5, v6, v3}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_a

    .line 5166
    :catchall_1
    move-exception v2

    move-object v6, v7

    :goto_e
    const-string v3, "Error flushing session file stream"

    invoke-static {v5, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 5175
    const-string v3, "Failed to close CLS file"

    invoke-static {v6, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 5179
    :cond_d
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto/16 :goto_a

    .line 654
    :cond_e
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 660
    :cond_f
    :goto_f
    return-void

    .line 658
    :cond_10
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_f

    .line 5166
    :catchall_2
    move-exception v2

    goto :goto_e

    :catchall_3
    move-exception v2

    move-object v6, v5

    move-object v5, v4

    goto :goto_e

    .line 5157
    :catch_3
    move-exception v3

    move-object v4, v5

    move-object v5, v6

    goto :goto_d

    :catch_4
    move-exception v3

    move-object v4, v5

    move-object v5, v6

    goto :goto_d

    .line 3970
    :catchall_4
    move-exception v2

    move-object v4, v5

    goto :goto_c

    .line 3966
    :catch_5
    move-exception v2

    goto :goto_b

    :cond_11
    move-object v4, v8

    goto/16 :goto_9
.end method

.method static synthetic a(Lcom/b/a/c/aa;Z)Z
    .locals 0

    .prologue
    .line 56
    iput-boolean p1, p0, Lcom/b/a/c/aa;->p:Z

    return p1
.end method

.method static synthetic a(Lcom/b/a/c/aa;Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 1

    .prologue
    .line 715
    iget-object v0, p0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    invoke-virtual {v0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    .line 6719
    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/io/File;

    :cond_0
    return-object v0
.end method

.method static synthetic b(Lcom/b/a/c/aa;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/b/a/c/aa;->g()V

    return-void
.end method

.method static synthetic c(Lcom/b/a/c/aa;)Lcom/b/a/c/h;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    return-object v0
.end method

.method static synthetic d(Lcom/b/a/c/aa;)V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/b/a/c/aa;->a(Z)V

    return-void
.end method

.method static synthetic e()Ljava/util/regex/Pattern;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/b/a/c/aa;->e:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method static synthetic f()Ljava/util/Map;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/b/a/c/aa;->f:Ljava/util/Map;

    return-object v0
.end method

.method private g()V
    .locals 19

    .prologue
    .line 599
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 600
    new-instance v3, Lcom/b/a/c/c;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/b/a/c/aa;->o:La/a/a/a/a/b/x;

    invoke-direct {v3, v4}, Lcom/b/a/c/c;-><init>(La/a/a/a/a/b/x;)V

    invoke-virtual {v3}, Lcom/b/a/c/c;->toString()Ljava/lang/String;

    move-result-object v18

    .line 602
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1848
    const/4 v5, 0x0

    .line 1849
    const/4 v3, 0x0

    .line 1851
    :try_start_0
    new-instance v4, Lcom/b/a/c/d;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "BeginSession"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v6, v7}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 1852
    :try_start_1
    invoke-static {v4}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;

    move-result-object v3

    .line 1854
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Crashlytics Android SDK/%s"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    .line 2399
    const-string v9, "2.3.5.79"

    .line 1854
    aput-object v9, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1856
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    .line 1858
    move-object/from16 v0, v18

    invoke-static {v3, v0, v5, v6, v7}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1863
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v3, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 1864
    const-string v2, "Failed to close begin session file."

    invoke-static {v4, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2869
    const/4 v4, 0x0

    .line 2870
    const/4 v3, 0x0

    .line 2872
    :try_start_2
    new-instance v9, Lcom/b/a/c/d;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "SessionApp"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v9, v2, v5}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 2873
    :try_start_3
    invoke-static {v9}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;

    move-result-object v3

    .line 2875
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->h()Ljava/lang/String;

    move-result-object v4

    .line 2876
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->k()Ljava/lang/String;

    move-result-object v5

    .line 2877
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->j()Ljava/lang/String;

    move-result-object v6

    .line 2878
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->o:La/a/a/a/a/b/x;

    invoke-virtual {v2}, La/a/a/a/a/b/x;->b()Ljava/lang/String;

    move-result-object v7

    .line 2879
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/a/a/a/a/b/r;->a(Ljava/lang/String;)La/a/a/a/a/b/r;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/a/a/b/r;->a()I

    move-result v8

    .line 2882
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->s:Lcom/b/a/c/bu;

    invoke-virtual/range {v2 .. v8}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 2889
    const-string v2, "Failed to flush to session app file."

    invoke-static {v3, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 2890
    const-string v2, "Failed to close session app file."

    invoke-static {v9, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2895
    const/4 v5, 0x0

    .line 2896
    const/4 v3, 0x0

    .line 2899
    :try_start_4
    new-instance v4, Lcom/b/a/c/d;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "SessionOS"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v2, v6}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 2901
    :try_start_5
    invoke-static {v4}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;

    move-result-object v3

    .line 2903
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, La/a/a/a/a/b/l;->g(Landroid/content/Context;)Z

    move-result v2

    .line 2905
    invoke-static {v3, v2}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 2910
    const-string v2, "Failed to flush to session OS file."

    invoke-static {v3, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 2911
    const-string v2, "Failed to close session OS file."

    invoke-static {v4, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2917
    const/4 v4, 0x0

    .line 2918
    const/4 v3, 0x0

    .line 2920
    :try_start_6
    new-instance v17, Lcom/b/a/c/d;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->j:Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "SessionDevice"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-direct {v0, v2, v5}, Lcom/b/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 2921
    :try_start_7
    invoke-static/range {v17 .. v17}, Lcom/b/a/c/f;->a(Ljava/io/OutputStream;)Lcom/b/a/c/f;

    move-result-object v3

    .line 2923
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v2

    .line 2924
    new-instance v6, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 2926
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/b/a/c/aa;->o:La/a/a/a/a/b/x;

    invoke-virtual {v4}, La/a/a/a/a/b/x;->f()Ljava/lang/String;

    move-result-object v4

    .line 2927
    invoke-static {}, La/a/a/a/a/b/l;->a()I

    move-result v5

    .line 2928
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    .line 2929
    invoke-static {}, La/a/a/a/a/b/l;->b()J

    move-result-wide v8

    .line 2930
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockCount()I

    move-result v10

    int-to-long v10, v10

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSize()I

    move-result v6

    int-to-long v12, v6

    mul-long/2addr v10, v12

    .line 2931
    invoke-static {v2}, La/a/a/a/a/b/l;->f(Landroid/content/Context;)Z

    move-result v12

    .line 2933
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/b/a/c/aa;->o:La/a/a/a/a/b/x;

    invoke-virtual {v6}, La/a/a/a/a/b/x;->g()Ljava/util/Map;

    move-result-object v13

    .line 2935
    invoke-static {v2}, La/a/a/a/a/b/l;->h(Landroid/content/Context;)I

    move-result v14

    .line 2937
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v16, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v3 .. v16}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Ljava/lang/String;ILjava/lang/String;IJJZLjava/util/Map;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 2945
    const-string v2, "Failed to flush session device info."

    invoke-static {v3, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 2946
    const-string v2, "Failed to close session device file."

    move-object/from16 v0, v17

    invoke-static {v0, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 609
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/b/a/c/aa;->r:Lcom/b/a/c/aw;

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lcom/b/a/c/aw;->a(Ljava/lang/String;)V

    .line 610
    return-void

    .line 1859
    :catch_0
    move-exception v2

    move-object v4, v5

    .line 1860
    :goto_0
    :try_start_8
    invoke-static {v2, v4}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    .line 1861
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1863
    :catchall_0
    move-exception v2

    :goto_1
    const-string v5, "Failed to flush to session begin file."

    invoke-static {v3, v5}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 1864
    const-string v3, "Failed to close begin session file."

    invoke-static {v4, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 2885
    :catch_1
    move-exception v2

    .line 2886
    :goto_2
    :try_start_9
    invoke-static {v2, v4}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    .line 2887
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 2889
    :catchall_1
    move-exception v2

    move-object v9, v4

    :goto_3
    const-string v4, "Failed to flush to session app file."

    invoke-static {v3, v4}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 2890
    const-string v3, "Failed to close session app file."

    invoke-static {v9, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 2906
    :catch_2
    move-exception v2

    move-object v4, v5

    .line 2907
    :goto_4
    :try_start_a
    invoke-static {v2, v4}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    .line 2908
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 2910
    :catchall_2
    move-exception v2

    move-object v5, v4

    :goto_5
    const-string v4, "Failed to flush to session OS file."

    invoke-static {v3, v4}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 2911
    const-string v3, "Failed to close session OS file."

    invoke-static {v5, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 2941
    :catch_3
    move-exception v2

    .line 2942
    :goto_6
    :try_start_b
    invoke-static {v2, v4}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    .line 2943
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 2945
    :catchall_3
    move-exception v2

    move-object/from16 v17, v4

    :goto_7
    const-string v4, "Failed to flush session device info."

    invoke-static {v3, v4}, La/a/a/a/a/b/l;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 2946
    const-string v3, "Failed to close session device file."

    move-object/from16 v0, v17

    invoke-static {v0, v3}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 2945
    :catchall_4
    move-exception v2

    move-object/from16 v17, v4

    goto :goto_7

    :catchall_5
    move-exception v2

    goto :goto_7

    .line 2941
    :catch_4
    move-exception v2

    move-object/from16 v4, v17

    goto :goto_6

    .line 2910
    :catchall_6
    move-exception v2

    goto :goto_5

    .line 2906
    :catch_5
    move-exception v2

    goto :goto_4

    .line 2889
    :catchall_7
    move-exception v2

    move-object v9, v4

    goto :goto_3

    :catchall_8
    move-exception v2

    goto :goto_3

    .line 2885
    :catch_6
    move-exception v2

    move-object v4, v9

    goto :goto_2

    .line 1863
    :catchall_9
    move-exception v2

    move-object v4, v5

    goto :goto_1

    .line 1859
    :catch_7
    move-exception v2

    goto :goto_0
.end method

.method private h()[Ljava/io/File;
    .locals 2

    .prologue
    .line 704
    new-instance v0, Lcom/b/a/c/ao;

    const-string v1, "BeginSession"

    invoke-direct {v0, v1}, Lcom/b/a/c/ao;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private i()V
    .locals 6

    .prologue
    .line 1266
    .line 7700
    sget-object v0, Lcom/b/a/c/aa;->a:Ljava/io/FilenameFilter;

    invoke-direct {p0, v0}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 1266
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 1270
    iget-object v4, p0, Lcom/b/a/c/aa;->n:Lcom/b/a/c/u;

    new-instance v5, Lcom/b/a/c/ag;

    invoke-direct {v5, p0, v3}, Lcom/b/a/c/ag;-><init>(Lcom/b/a/c/aa;Ljava/io/File;)V

    invoke-virtual {v4, v5}, Lcom/b/a/c/u;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 1266
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1291
    :cond_0
    return-void
.end method


# virtual methods
.method final a([Ljava/io/File;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 801
    .line 6832
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v0}, Lcom/b/a/c/h;->q()Ljava/io/File;

    move-result-object v0

    const-string v3, "invalidClsFiles"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6834
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6837
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6838
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    .line 6839
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 6838
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6843
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 806
    :cond_1
    array-length v3, p1

    move v2, v1

    :goto_1
    if-ge v2, v3, :cond_3

    aget-object v0, p1, v2

    .line 807
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Found invalid session part file: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 809
    invoke-static {v0}, Lcom/b/a/c/aa;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    .line 810
    new-instance v4, Lcom/b/a/c/af;

    invoke-direct {v4, p0, v0}, Lcom/b/a/c/af;-><init>(Lcom/b/a/c/aa;Ljava/lang/String;)V

    .line 817
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 819
    invoke-direct {p0, v4}, Lcom/b/a/c/aa;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    array-length v5, v4

    move v0, v1

    :goto_2
    if-ge v0, v5, :cond_2

    aget-object v6, v4, v0

    .line 820
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Deleting session file: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 821
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 819
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 806
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 824
    :cond_3
    return-void
.end method

.method final a()Z
    .locals 1

    .prologue
    .line 311
    iget-object v0, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method final b()V
    .locals 2

    .prologue
    .line 503
    iget-object v0, p0, Lcom/b/a/c/aa;->n:Lcom/b/a/c/u;

    new-instance v1, Lcom/b/a/c/ac;

    invoke-direct {v1, p0}, Lcom/b/a/c/ac;-><init>(Lcom/b/a/c/aa;)V

    invoke-virtual {v0, v1}, Lcom/b/a/c/u;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 510
    return-void
.end method

.method final c()Z
    .locals 2

    .prologue
    .line 572
    iget-object v0, p0, Lcom/b/a/c/aa;->n:Lcom/b/a/c/u;

    new-instance v1, Lcom/b/a/c/ad;

    invoke-direct {v1, p0}, Lcom/b/a/c/ad;-><init>(Lcom/b/a/c/aa;)V

    invoke-virtual {v0, v1}, Lcom/b/a/c/u;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method final d()V
    .locals 2

    .prologue
    .line 786
    iget-object v0, p0, Lcom/b/a/c/aa;->n:Lcom/b/a/c/u;

    new-instance v1, Lcom/b/a/c/ae;

    invoke-direct {v1, p0}, Lcom/b/a/c/ae;-><init>(Lcom/b/a/c/aa;)V

    invoke-virtual {v0, v1}, Lcom/b/a/c/u;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 793
    return-void
.end method

.method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 260
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    :try_start_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Crashlytics is handling uncaught exception \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" from thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    iget-object v0, p0, Lcom/b/a/c/aa;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 267
    iget-object v0, p0, Lcom/b/a/c/aa;->q:Lcom/b/a/c/h;

    invoke-virtual {v0}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v0

    .line 268
    iget-object v1, p0, Lcom/b/a/c/aa;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 269
    iget-object v1, p0, Lcom/b/a/c/aa;->l:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 274
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 275
    iget-object v1, p0, Lcom/b/a/c/aa;->n:Lcom/b/a/c/u;

    new-instance v2, Lcom/b/a/c/am;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/b/a/c/am;-><init>(Lcom/b/a/c/aa;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/b/a/c/u;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 286
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 289
    iget-object v0, p0, Lcom/b/a/c/aa;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 290
    iget-object v0, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 291
    :goto_0
    monitor-exit p0

    return-void

    .line 282
    :catch_0
    move-exception v0

    .line 283
    :try_start_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "An error occurred in the uncaught exception handler"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 286
    :try_start_4
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 289
    iget-object v0, p0, Lcom/b/a/c/aa;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 290
    iget-object v0, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 260
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 286
    :catchall_1
    move-exception v0

    :try_start_5
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 289
    iget-object v1, p0, Lcom/b/a/c/aa;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v1, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 290
    iget-object v1, p0, Lcom/b/a/c/aa;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

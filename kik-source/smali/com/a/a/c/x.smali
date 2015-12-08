.class final Lcom/a/a/c/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/x$a;,
        Lcom/a/a/c/x$c;,
        Lcom/a/a/c/x$b;
    }
.end annotation


# static fields
.field static final a:Ljava/io/FilenameFilter;

.field static final b:Ljava/util/Comparator;

.field static final c:Ljava/util/Comparator;

.field static final d:Ljava/io/FilenameFilter;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/Map;


# instance fields
.field private final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final i:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final j:Ljava/io/File;

.field private final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final l:Landroid/content/BroadcastReceiver;

.field private final m:Landroid/content/BroadcastReceiver;

.field private final n:Lcom/a/a/c/r;

.field private final o:Lb/a/a/a/a/b/t;

.field private p:Z

.field private final q:Lcom/a/a/c/g;

.field private final r:Lcom/a/a/c/ar;

.field private final s:Lcom/a/a/c/ay;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 122
    new-instance v0, Lcom/a/a/c/y;

    invoke-direct {v0}, Lcom/a/a/c/y;-><init>()V

    sput-object v0, Lcom/a/a/c/x;->a:Ljava/io/FilenameFilter;

    .line 130
    new-instance v0, Lcom/a/a/c/ae;

    invoke-direct {v0}, Lcom/a/a/c/ae;-><init>()V

    sput-object v0, Lcom/a/a/c/x;->b:Ljava/util/Comparator;

    .line 137
    new-instance v0, Lcom/a/a/c/af;

    invoke-direct {v0}, Lcom/a/a/c/af;-><init>()V

    sput-object v0, Lcom/a/a/c/x;->c:Ljava/util/Comparator;

    .line 147
    new-instance v0, Lcom/a/a/c/ag;

    invoke-direct {v0}, Lcom/a/a/c/ag;-><init>()V

    sput-object v0, Lcom/a/a/c/x;->d:Ljava/io/FilenameFilter;

    .line 154
    const-string v0, "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/a/a/c/x;->e:Ljava/util/regex/Pattern;

    .line 157
    const-string v0, "X-CRASHLYTICS-SEND-FLAGS"

    const-string v1, "1"

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/a/a/c/x;->f:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/a/a/c/r;Lb/a/a/a/a/b/t;Lcom/a/a/c/ay;Lcom/a/a/c/g;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/a/a/c/x;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 185
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/a/a/c/x;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 217
    iput-object p1, p0, Lcom/a/a/c/x;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 218
    iput-object p2, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    .line 219
    iput-object p3, p0, Lcom/a/a/c/x;->o:Lb/a/a/a/a/b/t;

    .line 220
    iput-object p5, p0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    .line 221
    iput-object p4, p0, Lcom/a/a/c/x;->s:Lcom/a/a/c/ay;

    .line 222
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 223
    invoke-virtual {p5}, Lcom/a/a/c/g;->q()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    .line 224
    new-instance v0, Lcom/a/a/c/ar;

    invoke-virtual {p5}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    invoke-direct {v0, v1, v2}, Lcom/a/a/c/ar;-><init>(Landroid/content/Context;Ljava/io/File;)V

    iput-object v0, p0, Lcom/a/a/c/x;->r:Lcom/a/a/c/ar;

    .line 226
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v1}, Lcom/a/a/c/g;->q()Ljava/io/File;

    move-result-object v1

    const-string v2, "crash_marker"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 228
    :cond_0
    new-instance v0, Lcom/a/a/c/ah;

    invoke-direct {v0, p0}, Lcom/a/a/c/ah;-><init>(Lcom/a/a/c/x;)V

    iput-object v0, p0, Lcom/a/a/c/x;->m:Landroid/content/BroadcastReceiver;

    .line 235
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.ACTION_POWER_CONNECTED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 237
    new-instance v1, Lcom/a/a/c/ai;

    invoke-direct {v1, p0}, Lcom/a/a/c/ai;-><init>(Lcom/a/a/c/x;)V

    iput-object v1, p0, Lcom/a/a/c/x;->l:Landroid/content/BroadcastReceiver;

    .line 244
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.ACTION_POWER_DISCONNECTED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 247
    invoke-virtual {p5}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v2

    .line 248
    iget-object v3, p0, Lcom/a/a/c/x;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 249
    iget-object v0, p0, Lcom/a/a/c/x;->l:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 250
    iget-object v0, p0, Lcom/a/a/c/x;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 251
    return-void
.end method

.method private static a(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 494
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x23

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/a/a/c/x;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private static a(Lcom/a/a/c/f;Ljava/io/File;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 1150
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1152
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    .line 1153
    long-to-int v0, v0

    new-array v3, v0, [B

    .line 1158
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1160
    const/4 v0, 0x0

    .line 1161
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

    .line 1165
    add-int/2addr v0, v2

    goto :goto_0

    .line 1168
    :cond_0
    const-string v0, "Failed to close file input stream."

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 1171
    invoke-virtual {p0, v3}, Lcom/a/a/c/f;->a([B)V

    .line 1176
    :goto_1
    return-void

    .line 1168
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    const-string v2, "Failed to close file input stream."

    invoke-static {v1, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    .line 1173
    :cond_1
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Tried to include a file that doesn\'t exist: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3, v2}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 1168
    :catchall_1
    move-exception v0

    goto :goto_2
.end method

.method private a(Lcom/a/a/c/f;Ljava/lang/String;)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v1, 0x0

    .line 1127
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

    .line 1131
    :goto_0
    if-ge v0, v8, :cond_1

    aget-object v3, v2, v0

    .line 1132
    new-instance v4, Lcom/a/a/c/x$b;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v4}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    .line 1135
    array-length v5, v4

    if-nez v5, :cond_0

    .line 1136
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v4

    const-string v5, "Fabric"

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

    invoke-interface {v4, v5, v3, v6}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1131
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1139
    :cond_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Collecting "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " data for session ID "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1141
    aget-object v3, v4, v1

    invoke-static {p1, v3}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/io/File;)V

    goto :goto_1

    .line 1144
    :cond_1
    return-void
.end method

.method private a(Lcom/a/a/c/f;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Z)V
    .locals 23

    .prologue
    .line 913
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v7

    .line 914
    invoke-virtual/range {p2 .. p2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long v4, v2, v4

    .line 915
    invoke-static {v7}, Lb/a/a/a/a/b/j;->c(Landroid/content/Context;)F

    move-result v10

    .line 916
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/a/a/c/x;->p:Z

    invoke-static {v7, v2}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Z)I

    move-result v11

    .line 917
    invoke-static {v7}, Lb/a/a/a/a/b/j;->d(Landroid/content/Context;)Z

    move-result v12

    .line 918
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v13, v2, Landroid/content/res/Configuration;->orientation:I

    .line 919
    invoke-static {}, Lb/a/a/a/a/b/j;->b()J

    move-result-wide v2

    invoke-static {v7}, Lb/a/a/a/a/b/j;->b(Landroid/content/Context;)J

    move-result-wide v8

    sub-long v14, v2, v8

    .line 921
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb/a/a/a/a/b/j;->b(Ljava/lang/String;)J

    move-result-wide v16

    .line 924
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lb/a/a/a/a/b/j;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v18

    .line 926
    new-instance v19, Ljava/util/LinkedList;

    invoke-direct/range {v19 .. v19}, Ljava/util/LinkedList;-><init>()V

    .line 927
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v20

    .line 930
    if-eqz p6, :cond_0

    .line 931
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v3

    .line 932
    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v2

    new-array v9, v2, [Ljava/lang/Thread;

    .line 933
    const/4 v2, 0x0

    .line 934
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v6, v2

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 935
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    aput-object v3, v9, v6

    .line 936
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 937
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    .line 938
    goto :goto_0

    .line 942
    :cond_0
    const/4 v2, 0x0

    new-array v9, v2, [Ljava/lang/Thread;

    .line 946
    :cond_1
    const-string v2, "com.crashlytics.CollectCustomKeys"

    const/4 v3, 0x1

    invoke-static {v7, v2, v3}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_2

    .line 948
    new-instance v22, Ljava/util/TreeMap;

    invoke-direct/range {v22 .. v22}, Ljava/util/TreeMap;-><init>()V

    .line 959
    :goto_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->s:Lcom/a/a/c/ay;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/a/a/c/x;->r:Lcom/a/a/c/ar;

    move-object/from16 v21, v0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    invoke-virtual/range {v2 .. v22}, Lcom/a/a/c/ay;->a(Lcom/a/a/c/f;JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Thread;FIZIJJLandroid/app/ActivityManager$RunningAppProcessInfo;Ljava/util/List;[Ljava/lang/StackTraceElement;Lcom/a/a/c/ar;Ljava/util/Map;)V

    .line 963
    return-void

    .line 950
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->g()Ljava/util/Map;

    move-result-object v2

    .line 951
    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    const/4 v6, 0x1

    if-le v3, v6, :cond_3

    .line 955
    new-instance v22, Ljava/util/TreeMap;

    move-object/from16 v0, v22

    invoke-direct {v0, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    move-object/from16 v22, v2

    goto :goto_1
.end method

.method private static a(Lcom/a/a/c/f;[Ljava/io/File;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 1111
    sget-object v1, Lb/a/a/a/a/b/j;->a:Ljava/util/Comparator;

    invoke-static {p1, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 1113
    array-length v2, p1

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v0, p1, v1

    .line 1115
    :try_start_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

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

    .line 1118
    invoke-static {p0, v0}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1113
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1119
    :catch_0
    move-exception v0

    .line 1120
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Error writting non-fatal to session."

    invoke-interface {v3, v4, v5, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 1124
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/a/a/c/x;Lcom/a/a/c/a/a/d;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 56
    :try_start_0
    invoke-direct {p0}, Lcom/a/a/c/x;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/a/a/c/g;->d(Ljava/lang/String;)V

    new-instance v1, Lcom/a/a/c/d;

    iget-object v3, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "SessionCrash"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v1}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    :try_start_2
    invoke-static {p1, v0}, Lcom/a/a/c/at;->a(Lcom/a/a/c/a/a/d;Lcom/a/a/c/f;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_0
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v0, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v0, "Failed to close fatal exception file output stream."

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Tried to write a native crash while no session was open."

    const/4 v4, 0x0

    invoke-interface {v1, v2, v3, v4}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v2, v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    :goto_2
    :try_start_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "An error occurred in the native crash logger"

    invoke-interface {v3, v4, v5, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v2}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const-string v0, "Failed to flush to session begin file."

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v0, "Failed to close fatal exception file output stream."

    invoke-static {v2, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    :goto_3
    const-string v3, "Failed to flush to session begin file."

    invoke-static {v1, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v1, "Failed to close fatal exception file output stream."

    invoke-static {v2, v1}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v2

    move-object v6, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    :catchall_2
    move-exception v2

    move-object v6, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    :catchall_3
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v2

    move-object v6, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2

    :catch_2
    move-exception v2

    move-object v6, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2
.end method

.method static synthetic a(Lcom/a/a/c/x;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 56
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    const-string v3, "crash_marker"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    invoke-direct {p0}, Lcom/a/a/c/x;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/a/a/c/g;->d(Ljava/lang/String;)V

    new-instance v7, Lcom/a/a/c/d;

    iget-object v2, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "SessionCrash"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v2, v0}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v7}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v1

    const-string v5, "crash"

    const/4 v6, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v7

    :goto_0
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v1, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v1, "Failed to close fatal exception file output stream."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0}, Lcom/a/a/c/x;->j()V

    invoke-direct {p0}, Lcom/a/a/c/x;->i()V

    iget-object v0, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    sget-object v1, Lcom/a/a/c/x;->a:Ljava/io/FilenameFilter;

    const/4 v2, 0x4

    sget-object v3, Lcom/a/a/c/x;->c:Ljava/util/Comparator;

    invoke-static {v0, v1, v2, v3}, Lcom/a/a/c/ba;->a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)V

    iget-object v0, p0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v0}, Lcom/a/a/c/g;->r()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/a/a/c/x;->l()V

    :cond_0
    return-void

    :cond_1
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v2, "Fabric"

    const-string v3, "Tried to write a fatal exception while no session was open."

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v4}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v7, v1

    :goto_2
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "An error occurred in the fatal exception logger"

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v7}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v0, "Failed to flush to session begin file."

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v0, "Failed to close fatal exception file output stream."

    invoke-static {v7, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v7, v1

    :goto_3
    const-string v2, "Failed to flush to session begin file."

    invoke-static {v1, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v1, "Failed to close fatal exception file output stream."

    invoke-static {v7, v1}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 620
    new-instance v0, Lcom/a/a/c/x$c;

    invoke-direct {v0, p1}, Lcom/a/a/c/x$c;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 621
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 620
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 623
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    .line 665
    iget-object v0, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v1, Lcom/a/a/c/x$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "SessionEvent"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/a/a/c/x;->c:Ljava/util/Comparator;

    invoke-static {v0, v1, p2, v2}, Lcom/a/a/c/ba;->a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)V

    .line 667
    return-void
.end method

.method static synthetic a(Lcom/a/a/c/x;Z)Z
    .locals 0

    .prologue
    .line 56
    iput-boolean p1, p0, Lcom/a/a/c/x;->p:Z

    return p1
.end method

.method static synthetic a(Lcom/a/a/c/x;Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 1

    .prologue
    .line 648
    iget-object v0, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    invoke-virtual {v0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/io/File;

    :cond_0
    return-object v0
.end method

.method static synthetic b(Lcom/a/a/c/x;)Lcom/a/a/c/ar;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/a/a/c/x;->r:Lcom/a/a/c/ar;

    return-object v0
.end method

.method static synthetic b(Lcom/a/a/c/x;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Lcom/a/a/c/x;->h()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-static {v8}, Lcom/a/a/c/g;->c(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Crashlytics is logging non-fatal exception \""

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\" from thread "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/a/a/c/x;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    invoke-static {v0}, Lb/a/a/a/a/b/j;->a(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "SessionEvent"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Lcom/a/a/c/d;

    iget-object v2, p0, Lcom/a/a/c/x;->j:Ljava/io/File;

    invoke-direct {v7, v2, v0}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v7}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v1

    const-string v5, "error"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, "Failed to flush to non-fatal file."

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v0, "Failed to close non-fatal file output stream."

    invoke-static {v7, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    :goto_0
    const/16 v0, 0x40

    :try_start_2
    invoke-direct {p0, v8, v0}, Lcom/a/a/c/x;->a(Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    return-void

    :catch_0
    move-exception v0

    move-object v2, v1

    :goto_2
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "An error occurred in the non-fatal exception logger"

    invoke-interface {v3, v4, v5, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v2}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v0, "Failed to flush to non-fatal file."

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v0, "Failed to close non-fatal file output stream."

    invoke-static {v2, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_3
    const-string v3, "Failed to flush to non-fatal file."

    invoke-static {v1, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v1, "Failed to close non-fatal file output stream."

    invoke-static {v2, v1}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "An error occurred when trimming non-fatal files."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v2, "Fabric"

    const-string v3, "Tried to write a non-fatal exception while no session was open."

    invoke-interface {v0, v2, v3, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v7

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v2, v7

    goto :goto_2
.end method

.method static synthetic c(Lcom/a/a/c/x;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/a/a/c/x;->i()V

    return-void
.end method

.method static synthetic d(Lcom/a/a/c/x;)Lcom/a/a/c/g;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    return-object v0
.end method

.method static synthetic e(Lcom/a/a/c/x;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/a/a/c/x;->j()V

    return-void
.end method

.method static synthetic f()Ljava/util/regex/Pattern;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/a/a/c/x;->e:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method static synthetic g()Ljava/util/Map;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/a/a/c/x;->f:Ljava/util/Map;

    return-object v0
.end method

.method private h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 477
    new-instance v0, Lcom/a/a/c/x$b;

    const-string v1, "BeginSession"

    invoke-direct {v0, v1}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    .line 479
    sget-object v1, Lcom/a/a/c/x;->b:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 480
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/a/a/c/x;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i()V
    .locals 18

    .prologue
    .line 543
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 544
    new-instance v3, Lcom/a/a/c/c;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/a/a/c/x;->o:Lb/a/a/a/a/b/t;

    invoke-direct {v3, v4}, Lcom/a/a/c/c;-><init>(Lb/a/a/a/a/b/t;)V

    invoke-virtual {v3}, Lcom/a/a/c/c;->toString()Ljava/lang/String;

    move-result-object v10

    .line 546
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 549
    const/4 v5, 0x0

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Lcom/a/a/c/d;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "BeginSession"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v6, v7}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    :try_start_1
    invoke-static {v4}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Crashlytics Android SDK/%s"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const-string v9, "2.3.2.56"

    aput-object v9, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-static {v3, v10, v5, v6, v7}, Lcom/a/a/c/ay;->a(Lcom/a/a/c/f;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "Failed to flush to session begin file."

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close begin session file."

    invoke-static {v4, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 550
    const/4 v4, 0x0

    const/4 v3, 0x0

    :try_start_2
    new-instance v9, Lcom/a/a/c/d;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "SessionApp"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v9, v2, v5}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    :try_start_3
    invoke-static {v9}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->h()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->k()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->j()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->o:Lb/a/a/a/a/b/t;

    invoke-virtual {v2}, Lb/a/a/a/a/b/t;->b()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb/a/a/a/a/b/n;->a(Ljava/lang/String;)Lb/a/a/a/a/b/n;

    move-result-object v2

    invoke-virtual {v2}, Lb/a/a/a/a/b/n;->a()I

    move-result v8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->s:Lcom/a/a/c/ay;

    invoke-virtual/range {v2 .. v8}, Lcom/a/a/c/ay;->a(Lcom/a/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    const-string v2, "Failed to flush to session app file."

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close session app file."

    invoke-static {v9, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 551
    const/4 v5, 0x0

    const/4 v3, 0x0

    :try_start_4
    new-instance v4, Lcom/a/a/c/d;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "SessionOS"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v2, v6}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    :try_start_5
    invoke-static {v4}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lb/a/a/a/a/b/j;->h(Landroid/content/Context;)Z

    move-result v2

    invoke-static {v3, v2}, Lcom/a/a/c/ay;->a(Lcom/a/a/c/f;Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const-string v2, "Failed to flush to session OS file."

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close session OS file."

    invoke-static {v4, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 552
    const/4 v4, 0x0

    const/4 v3, 0x0

    :try_start_6
    new-instance v17, Lcom/a/a/c/d;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "SessionDevice"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-direct {v0, v2, v5}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-static/range {v17 .. v17}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v2

    new-instance v6, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/a/a/c/x;->o:Lb/a/a/a/a/b/t;

    invoke-virtual {v4}, Lb/a/a/a/a/b/t;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lb/a/a/a/a/b/j;->a()I

    move-result v5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static {}, Lb/a/a/a/a/b/j;->b()J

    move-result-wide v8

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockCount()I

    move-result v10

    int-to-long v10, v10

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSize()I

    move-result v6

    int-to-long v12, v6

    mul-long/2addr v10, v12

    invoke-static {v2}, Lb/a/a/a/a/b/j;->g(Landroid/content/Context;)Z

    move-result v12

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/a/a/c/x;->o:Lb/a/a/a/a/b/t;

    invoke-virtual {v6}, Lb/a/a/a/a/b/t;->g()Ljava/util/Map;

    move-result-object v13

    invoke-static {v2}, Lb/a/a/a/a/b/j;->i(Landroid/content/Context;)I

    move-result v14

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v16, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v3 .. v16}, Lcom/a/a/c/ay;->a(Lcom/a/a/c/f;Ljava/lang/String;ILjava/lang/String;IJJZLjava/util/Map;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    const-string v2, "Failed to flush session device info."

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close session device file."

    move-object/from16 v0, v17

    invoke-static {v0, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    return-void

    .line 549
    :catch_0
    move-exception v2

    move-object v4, v5

    :goto_0
    :try_start_8
    invoke-static {v2, v4}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catchall_0
    move-exception v2

    :goto_1
    const-string v5, "Failed to flush to session begin file."

    invoke-static {v3, v5}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v3, "Failed to close begin session file."

    invoke-static {v4, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 550
    :catch_1
    move-exception v2

    :goto_2
    :try_start_9
    invoke-static {v2, v4}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception v2

    move-object v9, v4

    :goto_3
    const-string v4, "Failed to flush to session app file."

    invoke-static {v3, v4}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v3, "Failed to close session app file."

    invoke-static {v9, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 551
    :catch_2
    move-exception v2

    move-object v4, v5

    :goto_4
    :try_start_a
    invoke-static {v2, v4}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v2

    move-object v5, v4

    :goto_5
    const-string v4, "Failed to flush to session OS file."

    invoke-static {v3, v4}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v3, "Failed to close session OS file."

    invoke-static {v5, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 552
    :catch_3
    move-exception v2

    :goto_6
    :try_start_b
    invoke-static {v2, v4}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception v2

    move-object/from16 v17, v4

    :goto_7
    const-string v4, "Failed to flush session device info."

    invoke-static {v3, v4}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v3, "Failed to close session device file."

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    :catchall_4
    move-exception v2

    move-object/from16 v17, v4

    goto :goto_7

    :catchall_5
    move-exception v2

    goto :goto_7

    :catch_4
    move-exception v2

    move-object/from16 v4, v17

    goto :goto_6

    .line 551
    :catchall_6
    move-exception v2

    goto :goto_5

    :catch_5
    move-exception v2

    goto :goto_4

    .line 550
    :catchall_7
    move-exception v2

    move-object v9, v4

    goto :goto_3

    :catchall_8
    move-exception v2

    goto :goto_3

    :catch_6
    move-exception v2

    move-object v4, v9

    goto :goto_2

    .line 549
    :catchall_9
    move-exception v2

    move-object v4, v5

    goto :goto_1

    :catch_7
    move-exception v2

    goto :goto_0
.end method

.method private j()V
    .locals 20

    .prologue
    .line 559
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-direct/range {p0 .. p0}, Lcom/a/a/c/x;->k()[Ljava/io/File;

    move-result-object v4

    sget-object v2, Lcom/a/a/c/x;->b:Ljava/util/Comparator;

    invoke-static {v4, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/16 v2, 0x8

    array-length v5, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v5, :cond_0

    aget-object v6, v4, v2

    invoke-static {v6}, Lcom/a/a/c/x;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/a/a/c/x$a;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lcom/a/a/c/x$a;-><init>(B)V

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    array-length v5, v4

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v5, :cond_2

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/a/a/c/x;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 561
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/a/a/c/x;->h()Ljava/lang/String;

    move-result-object v2

    .line 563
    if-eqz v2, :cond_d

    .line 566
    const/4 v5, 0x0

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Lcom/a/a/c/d;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/a/a/c/x;->j:Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, "SessionUser"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v6, v2}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-static {v4}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->m()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v5}, Lcom/a/a/c/g;->o()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v6}, Lcom/a/a/c/g;->n()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v6

    if-nez v2, :cond_7

    if-nez v5, :cond_7

    if-nez v6, :cond_7

    const-string v2, "Failed to flush session user file."

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close session user file."

    invoke-static {v4, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 568
    :goto_2
    invoke-static {}, Lcom/a/a/c/g;->s()Lb/a/a/a/a/g/p;

    move-result-object v2

    .line 570
    if-eqz v2, :cond_b

    .line 571
    iget v9, v2, Lb/a/a/a/a/g/p;->c:I

    .line 573
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 574
    invoke-direct/range {p0 .. p0}, Lcom/a/a/c/x;->k()[Ljava/io/File;

    move-result-object v10

    .line 576
    if-eqz v10, :cond_c

    array-length v2, v10

    if-lez v2, :cond_c

    .line 577
    array-length v11, v10

    const/4 v2, 0x0

    move v7, v2

    :goto_3
    if-ge v7, v11, :cond_c

    aget-object v12, v10, v7

    .line 578
    invoke-static {v12}, Lcom/a/a/c/x;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v13

    .line 580
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 582
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v2, Lcom/a/a/c/x$b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "SessionCrash"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v14

    if-eqz v14, :cond_8

    array-length v2, v14

    if-lez v2, :cond_8

    const/4 v2, 0x1

    :goto_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Session %s has fatal exception: %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v13, v5, v6

    const/4 v6, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    new-instance v3, Lcom/a/a/c/x$b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "SessionEvent"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v8

    if-eqz v8, :cond_9

    array-length v3, v8

    if-lez v3, :cond_9

    const/4 v3, 0x1

    :goto_5
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Session %s has non-fatal exceptions: %s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v13, v6, v15

    const/4 v15, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    aput-object v16, v6, v15

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    if-nez v2, :cond_3

    if-eqz v3, :cond_a

    :cond_3
    const/4 v6, 0x0

    const/4 v4, 0x0

    :try_start_2
    new-instance v5, Lcom/a/a/c/d;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/a/a/c/x;->j:Ljava/io/File;

    invoke-direct {v5, v15, v13}, Lcom/a/a/c/d;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v5}, Lcom/a/a/c/f;->a(Ljava/io/OutputStream;)Lcom/a/a/c/f;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v4

    :try_start_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    invoke-static {v4, v12}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/io/File;)V

    const/4 v6, 0x4

    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v16

    const-wide/16 v18, 0x3e8

    div-long v16, v16, v18

    move-wide/from16 v0, v16

    invoke-virtual {v4, v6, v0, v1}, Lcom/a/a/c/f;->a(IJ)V

    const/4 v6, 0x5

    invoke-virtual {v4, v6, v2}, Lcom/a/a/c/f;->a(IZ)V

    move-object/from16 v0, p0

    invoke-direct {v0, v4, v13}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/lang/String;)V

    if-eqz v3, :cond_4

    array-length v3, v8

    if-le v3, v9, :cond_e

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Trimming down to %d logged exceptions."

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v12, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v8, v12

    invoke-static {v3, v6, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v13, v9}, Lcom/a/a/c/x;->a(Ljava/lang/String;I)V

    new-instance v3, Lcom/a/a/c/x$b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, "SessionEvent"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v3

    :goto_6
    invoke-static {v4, v3, v13}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;[Ljava/io/File;Ljava/lang/String;)V

    :cond_4
    if-eqz v2, :cond_5

    const/4 v2, 0x0

    aget-object v2, v14, v2

    invoke-static {v4, v2}, Lcom/a/a/c/x;->a(Lcom/a/a/c/f;Ljava/io/File;)V

    :cond_5
    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-virtual {v4, v2, v3}, Lcom/a/a/c/f;->a(II)V

    const/16 v2, 0xc

    const/4 v3, 0x3

    invoke-virtual {v4, v2, v3}, Lcom/a/a/c/f;->b(II)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const-string v2, "Error flushing session file stream"

    invoke-static {v4, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close CLS file"

    invoke-static {v5, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    :cond_6
    :goto_7
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/a/a/c/x;->a(Ljava/lang/String;)V

    .line 577
    add-int/lit8 v2, v7, 0x1

    move v7, v2

    goto/16 :goto_3

    .line 566
    :cond_7
    :try_start_5
    invoke-static {v3, v2, v5, v6}, Lcom/a/a/c/ay;->a(Lcom/a/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v2, "Failed to flush session user file."

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v2, "Failed to close session user file."

    invoke-static {v4, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto/16 :goto_2

    :catch_0
    move-exception v2

    move-object v4, v5

    :goto_8
    :try_start_6
    invoke-static {v2, v4}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception v2

    :goto_9
    const-string v5, "Failed to flush session user file."

    invoke-static {v3, v5}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v3, "Failed to close session user file."

    invoke-static {v4, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    .line 582
    :cond_8
    const/4 v2, 0x0

    goto/16 :goto_4

    :cond_9
    const/4 v3, 0x0

    goto/16 :goto_5

    :catch_1
    move-exception v2

    move-object v3, v4

    move-object v4, v6

    :goto_a
    :try_start_7
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v5

    const-string v6, "Fabric"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v12, "Failed to write session file for session ID: "

    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v6, v8, v2}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2, v4}, Lcom/a/a/c/aq;->a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    const-string v2, "Error flushing session file stream"

    invoke-static {v3, v2}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    if-eqz v4, :cond_6

    :try_start_8
    invoke-virtual {v4}, Lcom/a/a/c/d;->a()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_7

    :catch_2
    move-exception v2

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Error closing session file stream in the presence of an exception"

    invoke-interface {v3, v4, v5, v2}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :catchall_1
    move-exception v2

    move-object v5, v6

    :goto_b
    const-string v3, "Error flushing session file stream"

    invoke-static {v4, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    const-string v3, "Failed to close CLS file"

    invoke-static {v5, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v2

    :cond_a
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    goto :goto_7

    .line 587
    :cond_b
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 593
    :cond_c
    :goto_c
    return-void

    .line 591
    :cond_d
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    goto :goto_c

    .line 582
    :catchall_2
    move-exception v2

    goto :goto_b

    :catchall_3
    move-exception v2

    move-object v5, v4

    move-object v4, v3

    goto :goto_b

    :catch_3
    move-exception v2

    move-object v3, v4

    move-object v4, v5

    goto :goto_a

    :catch_4
    move-exception v2

    move-object v3, v4

    move-object v4, v5

    goto :goto_a

    .line 566
    :catchall_4
    move-exception v2

    move-object v4, v5

    goto :goto_9

    :catch_5
    move-exception v2

    goto :goto_8

    :cond_e
    move-object v3, v8

    goto/16 :goto_6
.end method

.method private k()[Ljava/io/File;
    .locals 2

    .prologue
    .line 637
    new-instance v0, Lcom/a/a/c/x$b;

    const-string v1, "BeginSession"

    invoke-direct {v0, v1}, Lcom/a/a/c/x$b;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private l()V
    .locals 6

    .prologue
    .line 1187
    sget-object v0, Lcom/a/a/c/x;->a:Ljava/io/FilenameFilter;

    invoke-direct {p0, v0}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 1191
    iget-object v4, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v5, Lcom/a/a/c/ad;

    invoke-direct {v5, p0, v3}, Lcom/a/a/c/ad;-><init>(Lcom/a/a/c/x;Ljava/io/File;)V

    invoke-virtual {v4, v5}, Lcom/a/a/c/r;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 1187
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1212
    :cond_0
    return-void
.end method


# virtual methods
.method final a(JLjava/lang/String;)V
    .locals 3

    .prologue
    .line 345
    iget-object v0, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/ak;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/a/a/c/ak;-><init>(Lcom/a/a/c/x;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 354
    return-void
.end method

.method final a(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 362
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 364
    iget-object v1, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v2, Lcom/a/a/c/al;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/a/a/c/al;-><init>(Lcom/a/a/c/x;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/a/a/c/r;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 372
    return-void
.end method

.method final a([Ljava/io/File;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 735
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v0}, Lcom/a/a/c/g;->q()Ljava/io/File;

    move-result-object v0

    const-string v3, "invalidClsFiles"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 740
    :cond_1
    array-length v3, p1

    move v2, v1

    :goto_1
    if-ge v2, v3, :cond_3

    aget-object v0, p1, v2

    .line 741
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Found invalid session part file: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 743
    invoke-static {v0}, Lcom/a/a/c/x;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    .line 744
    new-instance v4, Lcom/a/a/c/ac;

    invoke-direct {v4, p0, v0}, Lcom/a/a/c/ac;-><init>(Lcom/a/a/c/x;Ljava/lang/String;)V

    .line 751
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 753
    invoke-direct {p0, v4}, Lcom/a/a/c/x;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    array-length v5, v4

    move v0, v1

    :goto_2
    if-ge v0, v5, :cond_2

    aget-object v6, v4, v0

    .line 754
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Deleting session file: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 755
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 753
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 740
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 758
    :cond_3
    return-void
.end method

.method final a()Z
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method final b()V
    .locals 2

    .prologue
    .line 456
    iget-object v0, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/z;

    invoke-direct {v1, p0}, Lcom/a/a/c/z;-><init>(Lcom/a/a/c/x;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 465
    return-void
.end method

.method final c()Z
    .locals 1

    .prologue
    .line 499
    invoke-direct {p0}, Lcom/a/a/c/x;->k()[Ljava/io/File;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()Z
    .locals 2

    .prologue
    .line 517
    iget-object v0, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/aa;

    invoke-direct {v1, p0}, Lcom/a/a/c/aa;-><init>(Lcom/a/a/c/x;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method final e()V
    .locals 2

    .prologue
    .line 720
    iget-object v0, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/ab;

    invoke-direct {v1, p0}, Lcom/a/a/c/ab;-><init>(Lcom/a/a/c/x;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 727
    return-void
.end method

.method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 259
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    :try_start_1
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

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

    .line 264
    iget-object v0, p0, Lcom/a/a/c/x;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 266
    iget-object v0, p0, Lcom/a/a/c/x;->q:Lcom/a/a/c/g;

    invoke-virtual {v0}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v0

    .line 267
    iget-object v1, p0, Lcom/a/a/c/x;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 268
    iget-object v1, p0, Lcom/a/a/c/x;->l:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 273
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 274
    iget-object v1, p0, Lcom/a/a/c/x;->n:Lcom/a/a/c/r;

    new-instance v2, Lcom/a/a/c/aj;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/a/a/c/aj;-><init>(Lcom/a/a/c/x;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/a/a/c/r;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 285
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 288
    iget-object v0, p0, Lcom/a/a/c/x;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 289
    iget-object v0, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 290
    :goto_0
    monitor-exit p0

    return-void

    .line 281
    :catch_0
    move-exception v0

    .line 282
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "An error occurred in the uncaught exception handler"

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 285
    :try_start_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 288
    iget-object v0, p0, Lcom/a/a/c/x;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 289
    iget-object v0, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 259
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 285
    :catchall_1
    move-exception v0

    :try_start_5
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 288
    iget-object v1, p0, Lcom/a/a/c/x;->i:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v1, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 289
    iget-object v1, p0, Lcom/a/a/c/x;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

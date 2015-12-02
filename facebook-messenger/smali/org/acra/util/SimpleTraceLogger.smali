.class public Lorg/acra/util/SimpleTraceLogger;
.super Ljava/lang/Object;
.source "SimpleTraceLogger.java"


# static fields
.field public static NO_LIMIT:I = 0x0

.field public static final TAG:Ljava/lang/String; = "SimpleTraceLogger"


# instance fields
.field private mTrace:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lorg/acra/util/SimpleTraceLogger$TraceLogLine;",
            ">;"
        }
    .end annotation
.end field

.field protected final mTraceCountLimit:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    sput v0, Lorg/acra/util/SimpleTraceLogger;->NO_LIMIT:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Lorg/acra/util/SimpleTraceLogger;->mTraceCountLimit:I

    .line 44
    invoke-virtual {p0}, Lorg/acra/util/SimpleTraceLogger;->clear()V

    .line 45
    return-void
.end method


# virtual methods
.method public append(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 63
    monitor-enter p0

    .line 64
    :try_start_0
    iget v0, p0, Lorg/acra/util/SimpleTraceLogger;->mTraceCountLimit:I

    sget v1, Lorg/acra/util/SimpleTraceLogger;->NO_LIMIT:I

    if-le v0, v1, :cond_0

    .line 65
    iget-object v0, p0, Lorg/acra/util/SimpleTraceLogger;->mTrace:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    iget v1, p0, Lorg/acra/util/SimpleTraceLogger;->mTraceCountLimit:I

    if-ne v0, v1, :cond_0

    .line 66
    iget-object v0, p0, Lorg/acra/util/SimpleTraceLogger;->mTrace:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 70
    :cond_0
    iget-object v0, p0, Lorg/acra/util/SimpleTraceLogger;->mTrace:Ljava/util/Queue;

    new-instance v1, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;-><init>(Ljava/lang/String;J)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 71
    monitor-exit p0

    .line 72
    return-void

    .line 71
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public varargs append(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 54
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/acra/util/SimpleTraceLogger;->append(Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method public declared-synchronized clear()V
    .locals 1

    .prologue
    .line 91
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/acra/util/SimpleTraceLogger;->mTrace:Ljava/util/Queue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    monitor-exit p0

    return-void

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 80
    monitor-enter p0

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    iget-object v0, p0, Lorg/acra/util/SimpleTraceLogger;->mTrace:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;

    .line 82
    invoke-virtual {v0}, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 84
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0
.end method

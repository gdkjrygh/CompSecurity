.class public final Lcom/squareup/okhttp/internal/spdy/SpdyStream;
.super Ljava/lang/Object;
.source "SpdyStream.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;,
        Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final WINDOW_UPDATE_THRESHOLD:I = 0x8000


# instance fields
.field private final connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

.field private errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field private final id:I

.field private final in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

.field private final out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

.field private final priority:I

.field private readTimeoutMillis:J

.field private final requestHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private responseHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private writeWindowSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(ILcom/squareup/okhttp/internal/spdy/SpdyConnection;ZZILjava/util/List;Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 3
    .param p1, "id"    # I
    .param p2, "connection"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .param p3, "outFinished"    # Z
    .param p4, "inFinished"    # Z
    .param p5, "priority"    # I
    .param p7, "settings"    # Lcom/squareup/okhttp/internal/spdy/Settings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/squareup/okhttp/internal/spdy/SpdyConnection;",
            "ZZI",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/squareup/okhttp/internal/spdy/Settings;",
            ")V"
        }
    .end annotation

    .prologue
    .local p6, "requestHeaders":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v2, 0x0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    .line 56
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    invoke-direct {v0, p0, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;-><init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;Lcom/squareup/okhttp/internal/spdy/SpdyStream$1;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    .line 57
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    invoke-direct {v0, p0, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;-><init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;Lcom/squareup/okhttp/internal/spdy/SpdyStream$1;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    .line 64
    iput-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 68
    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "connection == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_0
    if-nez p6, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "requestHeaders == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_1
    iput p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    .line 71
    iput-object p2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    .line 72
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    # setter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->finished:Z
    invoke-static {v0, p4}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$202(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;Z)Z

    .line 73
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # setter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z
    invoke-static {v0, p3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$302(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;Z)Z

    .line 74
    iput p5, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->priority:I

    .line 75
    iput-object p6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->requestHeaders:Ljava/util/List;

    .line 77
    invoke-direct {p0, p7}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->setSettings(Lcom/squareup/okhttp/internal/spdy/Settings;)V

    .line 78
    return-void
.end method

.method static synthetic access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->cancelStreamIfNecessary()V

    return-void
.end method

.method static synthetic access$1200(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .prologue
    .line 31
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->writeWindowSize:I

    return v0
.end method

.method static synthetic access$700(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .prologue
    .line 31
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    return v0
.end method

.method static synthetic access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    return-object v0
.end method

.method static synthetic access$900(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)J
    .locals 2
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .prologue
    .line 31
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    return-wide v0
.end method

.method private cancelStreamIfNecessary()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 548
    sget-boolean v2, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 551
    :cond_0
    monitor-enter p0

    .line 552
    :try_start_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->finished:Z
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$200(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->closed:Z
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$400(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$300(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    const/4 v0, 0x1

    .line 553
    .local v0, "cancel":Z
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->isOpen()Z

    move-result v1

    .line 554
    .local v1, "open":Z
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 555
    if-eqz v0, :cond_4

    .line 560
    sget-object v2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-virtual {p0, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->close(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 564
    :cond_2
    :goto_1
    return-void

    .line 552
    .end local v0    # "cancel":Z
    .end local v1    # "open":Z
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 554
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2

    .line 561
    .restart local v0    # "cancel":Z
    .restart local v1    # "open":Z
    :cond_4
    if-nez v1, :cond_2

    .line 562
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->removeStream(I)Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    goto :goto_1
.end method

.method private closeInternal(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)Z
    .locals 2
    .param p1, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .prologue
    const/4 v0, 0x0

    .line 240
    sget-boolean v1, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 241
    :cond_0
    monitor-enter p0

    .line 242
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    if-eqz v1, :cond_1

    .line 243
    monitor-exit p0

    .line 252
    :goto_0
    return v0

    .line 245
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->finished:Z
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$200(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$300(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 246
    monitor-exit p0

    goto :goto_0

    .line 250
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 248
    :cond_2
    :try_start_1
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 250
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->removeStream(I)Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .line 252
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private setSettings(Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 2
    .param p1, "settings"    # Lcom/squareup/okhttp/internal/spdy/Settings;

    .prologue
    const/high16 v0, 0x10000

    .line 314
    sget-boolean v1, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 315
    :cond_0
    if-eqz p1, :cond_1

    .line 316
    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/internal/spdy/Settings;->getInitialWindowSize(I)I

    move-result v0

    :cond_1
    iput v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->writeWindowSize:I

    .line 318
    return-void
.end method


# virtual methods
.method public close(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 2
    .param p1, "rstStatusCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 221
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->closeInternal(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    :goto_0
    return-void

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v0, v1, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeSynReset(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    goto :goto_0
.end method

.method public closeLater(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 2
    .param p1, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .prologue
    .line 232
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->closeInternal(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 236
    :goto_0
    return-void

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v0, v1, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeSynResetLater(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    goto :goto_0
.end method

.method public getConnection()Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    return-object v0
.end method

.method public declared-synchronized getErrorCode()Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 1

    .prologue
    .line 153
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 2

    .prologue
    .line 208
    monitor-enter p0

    .line 209
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->isLocallyInitiated()Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reply before requesting the output stream"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    return-object v0
.end method

.method getPriority()I
    .locals 1

    .prologue
    .line 332
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->priority:I

    return v0
.end method

.method public getReadTimeoutMillis()J
    .locals 2

    .prologue
    .line 193
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    return-wide v0
.end method

.method public getRequestHeaders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 111
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->requestHeaders:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized getResponseHeaders()Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v12, 0x0

    .line 119
    monitor-enter p0

    const-wide/16 v2, 0x0

    .line 120
    .local v2, "remaining":J
    const-wide/16 v4, 0x0

    .line 121
    .local v4, "start":J
    :try_start_0
    iget-wide v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    cmp-long v6, v6, v12

    if-eqz v6, :cond_0

    .line 122
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    const-wide/32 v8, 0xf4240

    div-long v4, v6, v8

    .line 123
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :cond_0
    :goto_0
    :try_start_1
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    if-nez v6, :cond_3

    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    if-nez v6, :cond_3

    .line 127
    iget-wide v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    cmp-long v6, v6, v12

    if-nez v6, :cond_1

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 141
    :catch_0
    move-exception v0

    .line 142
    .local v0, "e":Ljava/lang/InterruptedException;
    :try_start_2
    new-instance v1, Ljava/io/InterruptedIOException;

    invoke-direct {v1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 143
    .local v1, "rethrow":Ljava/io/InterruptedIOException;
    invoke-virtual {v1, v0}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 144
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    .end local v0    # "e":Ljava/lang/InterruptedException;
    .end local v1    # "rethrow":Ljava/io/InterruptedIOException;
    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6

    .line 129
    :cond_1
    cmp-long v6, v2, v12

    if-lez v6, :cond_2

    .line 130
    :try_start_3
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 131
    iget-wide v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    add-long/2addr v6, v4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    const-wide/32 v10, 0xf4240

    div-long/2addr v8, v10

    sub-long v2, v6, v8

    goto :goto_0

    .line 133
    :cond_2
    new-instance v6, Ljava/net/SocketTimeoutException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Read response header timeout. readTimeoutMillis: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-wide v8, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 137
    :cond_3
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    if-eqz v6, :cond_4

    .line 138
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object v6

    .line 140
    :cond_4
    :try_start_4
    new-instance v6, Ljava/io/IOException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "stream was reset: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public isLocallyInitiated()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 102
    iget v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    rem-int/lit8 v3, v3, 0x2

    if-ne v3, v1, :cond_0

    move v0, v1

    .line 103
    .local v0, "streamIsClient":Z
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget-boolean v3, v3, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->client:Z

    if-ne v3, v0, :cond_1

    :goto_1
    return v1

    .end local v0    # "streamIsClient":Z
    :cond_0
    move v0, v2

    .line 102
    goto :goto_0

    .restart local v0    # "streamIsClient":Z
    :cond_1
    move v1, v2

    .line 103
    goto :goto_1
.end method

.method public declared-synchronized isOpen()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 91
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 97
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 94
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->finished:Z
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$200(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->closed:Z
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$400(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$300(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    .line 97
    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method receiveData(Ljava/io/InputStream;I)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 287
    sget-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 288
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->receive(Ljava/io/InputStream;I)V

    .line 289
    return-void
.end method

.method receiveFin()V
    .locals 3

    .prologue
    .line 292
    sget-boolean v1, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 294
    :cond_0
    monitor-enter p0

    .line 295
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->in:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;

    const/4 v2, 0x1

    # setter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->finished:Z
    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;->access$202(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;Z)Z

    .line 296
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->isOpen()Z

    move-result v0

    .line 297
    .local v0, "open":Z
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 298
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    if-nez v0, :cond_1

    .line 300
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->removeStream(I)Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .line 302
    :cond_1
    return-void

    .line 298
    .end local v0    # "open":Z
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method receiveHeaders(Ljava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V
    .locals 5
    .param p2, "headersMode"    # Lcom/squareup/okhttp/internal/spdy/HeadersMode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/squareup/okhttp/internal/spdy/HeadersMode;",
            ")V"
        }
    .end annotation

    .prologue
    .line 256
    .local p1, "headers":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-boolean v3, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v3, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 257
    :cond_0
    const/4 v0, 0x0

    .line 258
    .local v0, "errorCode":Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    const/4 v2, 0x1

    .line 259
    .local v2, "open":Z
    monitor-enter p0

    .line 260
    :try_start_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    if-nez v3, :cond_3

    .line 261
    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->failIfHeadersAbsent()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 262
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->PROTOCOL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 278
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    if-eqz v0, :cond_5

    .line 280
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->closeLater(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 284
    :cond_1
    :goto_1
    return-void

    .line 264
    :cond_2
    :try_start_1
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    .line 265
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->isOpen()Z

    move-result v2

    .line 266
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    .line 278
    :catchall_0
    move-exception v3

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v3

    .line 269
    :cond_3
    :try_start_2
    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->failIfHeadersPresent()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 270
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_IN_USE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    goto :goto_0

    .line 272
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 273
    .local v1, "newHeaders":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 274
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 275
    iput-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 281
    .end local v1    # "newHeaders":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_5
    if-nez v2, :cond_1

    .line 282
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->removeStream(I)Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    goto :goto_1
.end method

.method declared-synchronized receiveRstStream(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 1
    .param p1, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .prologue
    .line 305
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    if-nez v0, :cond_0

    .line 306
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 307
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    :cond_0
    monitor-exit p0

    return-void

    .line 305
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method receiveSettings(Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 1
    .param p1, "settings"    # Lcom/squareup/okhttp/internal/spdy/Settings;

    .prologue
    .line 321
    sget-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 322
    :cond_0
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->setSettings(Lcom/squareup/okhttp/internal/spdy/Settings;)V

    .line 323
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 324
    return-void
.end method

.method declared-synchronized receiveWindowUpdate(I)V
    .locals 2
    .param p1, "deltaWindowSize"    # I

    .prologue
    .line 327
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$600(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)I

    move-result v1

    sub-int/2addr v1, p1

    # setter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I
    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$602(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;I)I

    .line 328
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 329
    monitor-exit p0

    return-void

    .line 327
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public reply(Ljava/util/List;Z)V
    .locals 3
    .param p2, "out"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 163
    .local p1, "responseHeaders":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-boolean v1, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 164
    :cond_0
    const/4 v0, 0x0

    .line 165
    .local v0, "outFinished":Z
    monitor-enter p0

    .line 166
    if-nez p1, :cond_1

    .line 167
    :try_start_0
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "responseHeaders == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 180
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 169
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->isLocallyInitiated()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 170
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "cannot reply to a locally initiated stream"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 172
    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 173
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "reply already sent"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 175
    :cond_3
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->responseHeaders:Ljava/util/List;

    .line 176
    if-nez p2, :cond_4

    .line 177
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    const/4 v2, 0x1

    # setter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z
    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->access$302(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;Z)Z

    .line 178
    const/4 v0, 0x1

    .line 180
    :cond_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I

    invoke-virtual {v1, v2, v0, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeSynReply(IZLjava/util/List;)V

    .line 182
    return-void
.end method

.method public setReadTimeout(J)V
    .locals 1
    .param p1, "readTimeoutMillis"    # J

    .prologue
    .line 189
    iput-wide p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeoutMillis:J

    .line 190
    return-void
.end method

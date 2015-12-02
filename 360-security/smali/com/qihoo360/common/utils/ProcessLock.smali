.class public Lcom/qihoo360/common/utils/ProcessLock;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private e:Ljava/io/File;

.field private f:Ljava/io/RandomAccessFile;

.field private g:Ljava/nio/channels/FileLock;

.field private h:Ljava/nio/channels/FileChannel;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/qihoo360/common/utils/ProcessLock;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/common/utils/ProcessLock;->a:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z

    .line 32
    iput-object p1, p0, Lcom/qihoo360/common/utils/ProcessLock;->b:Landroid/content/Context;

    .line 33
    iput-boolean p3, p0, Lcom/qihoo360/common/utils/ProcessLock;->c:Z

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, ".lock"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->d:Ljava/lang/String;

    .line 35
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 140
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    if-eqz v0, :cond_0

    .line 142
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 148
    :goto_0
    iput-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->f:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_1

    .line 153
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->f:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 159
    :goto_1
    iput-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->f:Ljava/io/RandomAccessFile;

    .line 162
    :cond_1
    iput-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;

    .line 163
    return-void

    .line 154
    :catch_0
    move-exception v0

    goto :goto_1

    .line 143
    :catch_1
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized freeLock()V
    .locals 1

    .prologue
    .line 114
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z

    if-eqz v0, :cond_1

    .line 115
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->c:Z

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->g:Ljava/nio/channels/FileLock;

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->g:Ljava/nio/channels/FileLock;

    .line 131
    invoke-direct {p0}, Lcom/qihoo360/common/utils/ProcessLock;->a()V

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    :cond_1
    monitor-exit p0

    return-void

    .line 114
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 123
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public declared-synchronized getInternalLockByte()B
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 171
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z

    if-eqz v1, :cond_0

    .line 172
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 174
    :try_start_1
    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 175
    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v0}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :goto_0
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    .line 183
    :cond_0
    monitor-exit p0

    return v0

    .line 171
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 176
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public declared-synchronized setInternalLockByte(B)V
    .locals 4

    .prologue
    .line 191
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z

    if-eqz v0, :cond_0

    .line 192
    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 194
    :try_start_1
    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 195
    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v0}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 191
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 196
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->d:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized tryLock(IIZ)Z
    .locals 3

    .prologue
    .line 46
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z

    if-eqz v0, :cond_0

    .line 47
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    :goto_0
    monitor-exit p0

    return v0

    .line 49
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :try_start_2
    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;

    const-string/jumbo v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->f:Ljava/io/RandomAccessFile;
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    :try_start_3
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->f:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    if-eqz p3, :cond_5

    .line 63
    :try_start_4
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->g:Ljava/nio/channels/FileLock;

    .line 64
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 96
    :goto_1
    :try_start_5
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z

    if-nez v0, :cond_1

    .line 98
    invoke-direct {p0}, Lcom/qihoo360/common/utils/ProcessLock;->a()V

    .line 99
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->c:Z

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->e:Ljava/io/File;

    .line 104
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    .line 52
    :catch_0
    move-exception v0

    .line 57
    const/4 v0, 0x0

    goto :goto_0

    .line 74
    :cond_2
    :try_start_6
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->h:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->g:Ljava/nio/channels/FileLock;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 80
    :goto_2
    :try_start_7
    iget-object v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->g:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_3

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/common/utils/ProcessLock;->i:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 86
    :cond_3
    if-lez p2, :cond_4

    .line 87
    int-to-long v0, p2

    :try_start_8
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 91
    :cond_4
    :goto_3
    add-int/lit8 p1, p1, -0x1

    .line 72
    :cond_5
    if-gtz p1, :cond_2

    goto :goto_1

    .line 89
    :catch_1
    move-exception v0

    goto :goto_3

    .line 75
    :catch_2
    move-exception v0

    goto :goto_2

    .line 65
    :catch_3
    move-exception v0

    goto :goto_1
.end method

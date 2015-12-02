.class public final Lcom/qihoo/security/e/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final d:Ljava/lang/String;

.field private static f:Lcom/qihoo/security/e/a;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/io/File;

.field private final c:Landroid/os/Handler;

.field private e:Landroid/os/Looper;

.field private final g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 123
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 124
    const-string/jumbo v0, "DIAGNOSTIC"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    .line 123
    :goto_0
    sput-object v0, Lcom/qihoo/security/e/a;->d:Ljava/lang/String;

    .line 142
    return-void

    .line 125
    :cond_0
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private constructor <init>(Ljava/io/File;)V
    .locals 2

    .prologue
    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/e/a;->a:Ljava/util/ArrayList;

    .line 143
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/e/a;->g:Ljava/lang/Object;

    .line 128
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/qihoo/security/e/a;->d:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    .line 129
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "DIAGNOSTIC"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 131
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/e/a;->e:Landroid/os/Looper;

    .line 132
    new-instance v0, Lcom/qihoo/security/e/a$1;

    iget-object v1, p0, Lcom/qihoo/security/e/a;->e:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/e/a$1;-><init>(Lcom/qihoo/security/e/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/e/a;->c:Landroid/os/Handler;

    .line 140
    return-void
.end method

.method public static final declared-synchronized a(Landroid/content/Context;)Lcom/qihoo/security/e/a;
    .locals 3

    .prologue
    .line 180
    const-class v1, Lcom/qihoo/security/e/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/e/a;->f:Lcom/qihoo/security/e/a;

    if-nez v0, :cond_0

    .line 181
    new-instance v0, Lcom/qihoo/security/e/a;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/e/a;-><init>(Ljava/io/File;)V

    sput-object v0, Lcom/qihoo/security/e/a;->f:Lcom/qihoo/security/e/a;

    .line 183
    :cond_0
    sget-object v0, Lcom/qihoo/security/e/a;->f:Lcom/qihoo/security/e/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 180
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private final a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 172
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 177
    :goto_0
    return-void

    .line 174
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/e/a;->c()V

    goto :goto_0

    .line 172
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/e/a;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 171
    invoke-direct {p0, p1}, Lcom/qihoo/security/e/a;->a(Landroid/os/Message;)V

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 74
    .line 79
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    .line 80
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 79
    invoke-direct {v4, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 81
    :try_start_1
    new-instance v3, Ljava/io/PrintWriter;

    invoke-direct {v3, p2}, Ljava/io/PrintWriter;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 82
    :try_start_2
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, p3}, Ljava/io/PrintWriter;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 84
    :goto_0
    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 85
    if-eqz v2, :cond_5

    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr p4, v0

    .line 88
    if-ltz p4, :cond_4

    move-object v0, v3

    .line 89
    :goto_1
    invoke-virtual {v0, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    move-object v2, v3

    move-object v3, v4

    .line 96
    :goto_2
    if-eqz v3, :cond_0

    .line 97
    :try_start_4
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 99
    :cond_0
    if-eqz v2, :cond_1

    .line 100
    invoke-virtual {v2}, Ljava/io/PrintWriter;->close()V

    .line 102
    :cond_1
    if-eqz v1, :cond_2

    .line 103
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 105
    :cond_2
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 107
    :catch_0
    move-exception v0

    .line 108
    const-string/jumbo v1, "DIAGNOSTIC"

    const-string/jumbo v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 110
    :cond_3
    :goto_3
    return-void

    :cond_4
    move-object v0, v1

    .line 88
    goto :goto_1

    .line 96
    :cond_5
    if-eqz v4, :cond_6

    .line 97
    :try_start_5
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 99
    :cond_6
    if-eqz v3, :cond_7

    .line 100
    invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V

    .line 102
    :cond_7
    if-eqz v1, :cond_3

    .line 103
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_3

    .line 95
    :catchall_1
    move-exception v0

    move-object v1, v2

    move-object v3, v2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v3, v4

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    goto :goto_2
.end method

.method private final b()V
    .locals 4

    .prologue
    .line 113
    iget-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0x8000

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 116
    :cond_0
    return-void
.end method

.method private final c()V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 146
    new-array v0, v3, [Ljava/lang/String;

    .line 147
    iget-object v1, p0, Lcom/qihoo/security/e/a;->a:Ljava/util/ArrayList;

    monitor-enter v1

    .line 148
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/e/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 149
    iget-object v2, p0, Lcom/qihoo/security/e/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 147
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    iget-object v4, p0, Lcom/qihoo/security/e/a;->g:Ljava/lang/Object;

    monitor-enter v4

    .line 153
    const/4 v2, 0x0

    .line 155
    :try_start_1
    invoke-direct {p0}, Lcom/qihoo/security/e/a;->b()V

    .line 156
    new-instance v1, Ljava/io/PrintWriter;

    new-instance v5, Ljava/io/FileOutputStream;

    iget-object v6, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    const/4 v7, 0x1

    invoke-direct {v5, v6, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-direct {v1, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    :try_start_2
    array-length v5, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move v2, v3

    :goto_0
    if-lt v2, v5, :cond_1

    .line 161
    if-eqz v1, :cond_0

    .line 162
    :try_start_3
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 151
    :cond_0
    :goto_1
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 169
    return-void

    .line 147
    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    .line 157
    :cond_1
    :try_start_6
    aget-object v3, v0, v2

    .line 158
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 157
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 160
    :catchall_1
    move-exception v0

    move-object v1, v2

    .line 161
    :goto_2
    if-eqz v1, :cond_2

    .line 162
    :try_start_7
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 164
    :cond_2
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 165
    :catch_0
    move-exception v0

    goto :goto_1

    .line 151
    :catchall_2
    move-exception v0

    :try_start_8
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    .line 160
    :catchall_3
    move-exception v0

    goto :goto_2
.end method


# virtual methods
.method public final a()Landroid/os/Looper;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/qihoo/security/e/a;->e:Landroid/os/Looper;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 56
    iget-object v1, p0, Lcom/qihoo/security/e/a;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v3, "/diag.txt"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v4, ".tail"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 62
    const/16 v4, 0x400

    invoke-direct {p0, v0, v2, v3, v4}, Lcom/qihoo/security/e/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 65
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 67
    iget-object v2, p0, Lcom/qihoo/security/e/a;->b:Ljava/io/File;

    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 56
    :cond_0
    monitor-exit v1

    .line 71
    return-void

    .line 56
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(ILjava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 37
    iget-object v0, p0, Lcom/qihoo/security/e/a;->c:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 38
    const-string/jumbo v0, "[%d]%s"

    new-array v1, v4, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/qihoo/security/e/a;->a:Ljava/util/ArrayList;

    monitor-enter v1

    .line 40
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/e/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/e/a;->c:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    move-result v0

    return v0

    .line 39
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

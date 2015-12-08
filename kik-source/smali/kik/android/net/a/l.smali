.class public final Lkik/android/net/a/l;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field private static final l:Lorg/c/b;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ljava/util/List;

.field private volatile c:I

.field private d:Ljava/net/Socket;

.field private e:Ljava/io/OutputStream;

.field private f:Ljava/io/InputStream;

.field private volatile g:I

.field private volatile h:Ljava/lang/String;

.field private volatile i:Ljava/io/IOException;

.field private volatile j:Ljava/lang/String;

.field private k:Ljava/util/HashMap;

.field private final m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const-string v0, "ManualHttpUpload"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/a/l;->l:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/net/a/l;->b:Ljava/util/List;

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/net/a/l;->c:I

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/net/a/l;->g:I

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/net/a/l;->k:Ljava/util/HashMap;

    .line 172
    new-instance v0, Lkik/android/net/a/m;

    invoke-direct {v0, p0}, Lkik/android/net/a/m;-><init>(Lkik/android/net/a/l;)V

    iput-object v0, p0, Lkik/android/net/a/l;->m:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lkik/android/net/a/l;I)I
    .locals 0

    .prologue
    .line 42
    iput p1, p0, Lkik/android/net/a/l;->g:I

    return p1
.end method

.method static synthetic a(Lkik/android/net/a/l;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    return-object p1
.end method

.method static synthetic a(Lkik/android/net/a/l;Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    return-object p1
.end method

.method static synthetic a(Lkik/android/net/a/l;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lkik/android/net/a/l;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lkik/android/net/a/l;)Ljava/net/Socket;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    return-object v0
.end method

.method static synthetic a(Lkik/android/net/a/l;Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lkik/android/net/a/l;->k:Ljava/util/HashMap;

    return-object p1
.end method

.method static synthetic b(Lkik/android/net/a/l;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    return-object v0
.end method

.method static synthetic b(Lkik/android/net/a/l;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lkik/android/net/a/l;->j:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lkik/android/net/a/l;)I
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lkik/android/net/a/l;->c:I

    return v0
.end method

.method static synthetic d(Lkik/android/net/a/l;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 374
    iget-object v1, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 375
    :try_start_0
    iget v0, p0, Lkik/android/net/a/l;->c:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    .line 376
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 385
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 378
    :cond_0
    :try_start_1
    iget v0, p0, Lkik/android/net/a/l;->g:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v0, p0, Lkik/android/net/a/l;->g:I

    const/16 v2, 0xc8

    if-eq v0, v2, :cond_1

    .line 379
    new-instance v0, Lorg/apache/http/client/HttpResponseException;

    iget v2, p0, Lkik/android/net/a/l;->g:I

    iget-object v3, p0, Lkik/android/net/a/l;->h:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 381
    :cond_1
    iget-object v0, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    if-eqz v0, :cond_2

    .line 382
    iget-object v0, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    .line 383
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException from read thread: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 385
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 324
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 325
    iget-object v1, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lkik/android/net/a/l;->c:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException from read thread: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lkik/android/net/a/l;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v4, :cond_3

    :try_start_2
    iget-object v0, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    iget v0, p0, Lkik/android/net/a/l;->c:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_2
    iget-object v0, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException from read thread: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lkik/android/net/a/l;->i:Ljava/io/IOException;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v0, p0, Lkik/android/net/a/l;->g:I

    if-ne v0, v4, :cond_4

    new-instance v0, Lorg/apache/http/NoHttpResponseException;

    const-string v2, "Timed out while waiting for response"

    invoke-direct {v0, v2}, Lorg/apache/http/NoHttpResponseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 326
    iget v0, p0, Lkik/android/net/a/l;->g:I

    return v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 69
    iget-object v0, p0, Lkik/android/net/a/l;->b:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lkik/android/net/a/l;)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 90
    iget v0, p0, Lkik/android/net/a/l;->c:I

    if-eq v0, v1, :cond_0

    .line 91
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "only open me once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 97
    const-string v3, "https"

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 98
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v5

    .line 99
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 100
    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 101
    if-gez v0, :cond_e

    .line 102
    if-eqz v4, :cond_3

    const/16 v0, 0x1bb

    :goto_0
    move v3, v0

    .line 107
    :goto_1
    if-eqz p3, :cond_a

    .line 108
    iget v0, p3, Lkik/android/net/a/l;->c:I

    if-eq v0, v8, :cond_4

    move v0, v2

    :goto_2
    if-eqz v0, :cond_9

    .line 109
    iget-object v0, p3, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    iput-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    .line 111
    iget-object v0, p3, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    iput-object v0, p0, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    .line 112
    iget-object v0, p3, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    iput-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    .line 113
    const/4 v0, 0x0

    iput-object v0, p3, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    .line 114
    const/4 v0, 0x0

    iput-object v0, p3, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    .line 115
    const/4 v0, 0x0

    iput-object v0, p3, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    .line 116
    const/4 v0, 0x3

    iput v0, p3, Lkik/android/net/a/l;->c:I

    move v0, v1

    .line 124
    :goto_3
    if-nez v0, :cond_1

    .line 125
    if-eqz v4, :cond_b

    .line 126
    invoke-static {}, Ljavax/net/ssl/SSLSocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    invoke-virtual {v0, v5, v3}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    .line 131
    :goto_4
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    const/16 v1, 0x3a98

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 132
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setKeepAlive(Z)V

    .line 133
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTrafficClass(I)V

    .line 135
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    .line 141
    new-instance v0, Lkik/a/f/m;

    iget-object v1, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    const-wide/16 v2, 0x4e20

    new-instance v4, Lkik/android/net/e;

    iget-object v7, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    invoke-direct {v4, v7}, Lkik/android/net/e;-><init>(Ljava/net/Socket;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lkik/a/f/m;-><init>(Ljava/io/OutputStream;JLkik/a/f/p;)V

    iput-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    .line 144
    :cond_1
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    invoke-direct {v0, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " HTTP/1.1\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Host: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 148
    const-string v0, "Connection: Keep-Alive\r\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lkik/android/net/a/l;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 150
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\r\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    .line 169
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 165
    :try_start_1
    iget v2, p0, Lkik/android/net/a/l;->c:I

    if-eq v2, v8, :cond_2

    .line 166
    const/4 v2, 0x3

    iput v2, p0, Lkik/android/net/a/l;->c:I

    .line 168
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    throw v0

    .line 102
    :cond_3
    const/16 v0, 0x50

    goto/16 :goto_0

    .line 108
    :cond_4
    :try_start_2
    iget-object v0, p3, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    if-eqz v0, :cond_5

    iget-object v0, p3, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isConnected()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    move v0, v2

    goto/16 :goto_2

    :cond_6
    iget-object v0, p3, Lkik/android/net/a/l;->k:Ljava/util/HashMap;

    if-nez v0, :cond_7

    move v0, v2

    goto/16 :goto_2

    :cond_7
    iget-object v0, p3, Lkik/android/net/a/l;->k:Ljava/util/HashMap;

    const-string v7, "connection"

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v7, "keep-alive"

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    move v0, v2

    goto/16 :goto_2

    :cond_8
    move v0, v1

    goto/16 :goto_2

    .line 120
    :cond_9
    invoke-virtual {p3}, Lkik/android/net/a/l;->c()V

    :cond_a
    move v0, v2

    goto/16 :goto_3

    .line 129
    :cond_b
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v5, v3}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    goto/16 :goto_4

    .line 153
    :cond_c
    const-string v0, "\r\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v1}, Ljava/io/Writer;->flush()V

    .line 157
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lkik/android/net/a/l;->m:Ljava/lang/Runnable;

    const-string v2, "ManualHttp-read"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 159
    iget-object v1, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    const/4 v0, 0x2

    :try_start_3
    iput v0, p0, Lkik/android/net/a/l;->c:I

    .line 161
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    iget-object v1, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 165
    :try_start_4
    iget v0, p0, Lkik/android/net/a/l;->c:I

    if-eq v0, v8, :cond_d

    .line 166
    const/4 v0, 0x3

    iput v0, p0, Lkik/android/net/a/l;->c:I

    .line 168
    :cond_d
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    .line 161
    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 168
    :catchall_2
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0

    :catchall_3
    move-exception v0

    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v0

    :cond_e
    move v3, v0

    goto/16 :goto_1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lkik/android/net/a/l;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 447
    :try_start_0
    invoke-virtual {p0}, Lkik/android/net/a/l;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 453
    :goto_0
    return-void

    .line 449
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public final close()V
    .locals 2

    .prologue
    .line 415
    iget-object v1, p0, Lkik/android/net/a/l;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 416
    const/4 v0, 0x3

    :try_start_0
    iput v0, p0, Lkik/android/net/a/l;->c:I

    .line 417
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 418
    iget-object v0, p0, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 420
    :try_start_1
    iget-object v0, p0, Lkik/android/net/a/l;->f:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 426
    :cond_0
    :goto_0
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 428
    :try_start_2
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 434
    :cond_1
    :goto_1
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    if-eqz v0, :cond_2

    .line 436
    :try_start_3
    iget-object v0, p0, Lkik/android/net/a/l;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 442
    :cond_2
    :goto_2
    return-void

    .line 417
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lkik/android/net/a/l;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 405
    invoke-direct {p0}, Lkik/android/net/a/l;->e()V

    .line 406
    invoke-super {p0}, Ljava/io/OutputStream;->flush()V

    .line 407
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 410
    :cond_0
    return-void
.end method

.method public final write(I)V
    .locals 1

    .prologue
    .line 391
    invoke-direct {p0}, Lkik/android/net/a/l;->e()V

    .line 392
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 393
    return-void
.end method

.method public final write([BII)V
    .locals 1

    .prologue
    .line 398
    invoke-direct {p0}, Lkik/android/net/a/l;->e()V

    .line 399
    iget-object v0, p0, Lkik/android/net/a/l;->e:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 400
    return-void
.end method

.class public final Lkik/android/net/communicator/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/net/communicator/j$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/net/communicator/k$a;
    }
.end annotation


# static fields
.field private static final n:Lorg/c/b;

.field private static o:Landroid/net/SSLCertificateSocketFactory;

.field private static p:Ljavax/net/ssl/HostnameVerifier;


# instance fields
.field protected a:Lkik/a/f/o;

.field protected b:Lkik/a/f/n;

.field protected c:Ljava/io/InputStream;

.field protected d:Lkik/android/net/b;

.field private volatile e:J

.field private f:Ljava/net/Socket;

.field private g:Lkik/android/net/a;

.field private h:Lkik/android/net/communicator/j;

.field private i:Lcom/kik/android/b/a;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Lcom/kik/android/a;

.field private q:Lkik/android/net/communicator/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 91
    const-string v0, "KikNetSock"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/communicator/k;->n:Lorg/c/b;

    .line 97
    const/16 v0, 0x2710

    invoke-static {v0}, Landroid/net/SSLCertificateSocketFactory;->getDefault(I)Ljavax/net/SocketFactory;

    move-result-object v0

    check-cast v0, Landroid/net/SSLCertificateSocketFactory;

    sput-object v0, Lkik/android/net/communicator/k;->o:Landroid/net/SSLCertificateSocketFactory;

    .line 98
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    sput-object v0, Lkik/android/net/communicator/k;->p:Ljavax/net/ssl/HostnameVerifier;

    .line 99
    return-void
.end method

.method public constructor <init>(Lkik/android/net/communicator/j;Lcom/kik/android/b/a;Ljava/lang/String;Ljava/lang/String;Lcom/kik/android/a;)V
    .locals 3

    .prologue
    const/16 v2, 0x10

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/net/communicator/k;->e:J

    .line 123
    iput-object p1, p0, Lkik/android/net/communicator/k;->h:Lkik/android/net/communicator/j;

    .line 124
    iput-object p2, p0, Lkik/android/net/communicator/k;->i:Lcom/kik/android/b/a;

    .line 125
    iput-object p4, p0, Lkik/android/net/communicator/k;->k:Ljava/lang/String;

    .line 126
    iput-object p5, p0, Lkik/android/net/communicator/k;->m:Lcom/kik/android/a;

    .line 128
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_0

    .line 129
    const/4 v0, 0x0

    invoke-virtual {p3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    .line 131
    :cond_0
    new-instance v0, Lkik/android/net/communicator/k$a;

    invoke-direct {v0, p0}, Lkik/android/net/communicator/k$a;-><init>(Lkik/android/net/communicator/k;)V

    iput-object v0, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    .line 133
    iput-object p3, p0, Lkik/android/net/communicator/k;->j:Ljava/lang/String;

    .line 134
    return-void
.end method

.method private a(Ljava/lang/String;IZ)V
    .locals 6

    .prologue
    const/16 v5, 0x2710

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connecting using TLS to: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 155
    sget-object v0, Lkik/android/net/communicator/k;->o:Landroid/net/SSLCertificateSocketFactory;

    invoke-virtual {v0}, Landroid/net/SSLCertificateSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 156
    new-instance v1, Ljava/net/InetSocketAddress;

    invoke-direct {v1, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1, v5}, Ljavax/net/ssl/SSLSocket;->connect(Ljava/net/SocketAddress;I)V

    .line 158
    iput-object v0, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    .line 159
    iget-object v1, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/net/Socket;->setKeepAlive(Z)V

    .line 160
    iget-object v1, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    invoke-virtual {v1, v5}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 163
    :try_start_0
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->startHandshake()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    if-eqz p3, :cond_1

    .line 175
    sget-object v1, Lkik/android/net/communicator/k;->p:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 177
    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot verify hostname: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 165
    :catch_0
    move-exception v1

    .line 166
    invoke-virtual {v1}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/security/NoSuchAlgorithmException;

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {v1}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/security/NoSuchAlgorithmException;

    invoke-static {v0}, Lcom/kik/m/g;->a(Ljava/security/NoSuchAlgorithmException;)V

    .line 171
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Digest error during TLS handshake: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 182
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Connecting using TLS took "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    return-void
.end method

.method private a(Lkik/a/f/g/c;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 297
    :goto_0
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "k"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    invoke-virtual {v0}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 300
    :cond_0
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "ok"

    invoke-virtual {v0, v5, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 302
    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 303
    invoke-virtual {p0}, Lkik/android/net/communicator/k;->a()V

    .line 304
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    invoke-virtual {v0}, Lkik/a/f/n;->next()I

    .line 305
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "noauth"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    new-instance v0, Lkik/a/f/a;

    const-string v1, "Authorization failed. Check credentials."

    invoke-direct {v0, v1}, Lkik/a/f/a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 308
    :cond_1
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "redir"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 309
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "host"

    invoke-virtual {v0, v5, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v2, "port"

    invoke-virtual {v1, v5, v2}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 311
    iget-object v2, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v3, "ttl"

    invoke-virtual {v2, v5, v3}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 314
    iget-object v3, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v4, "tls"

    invoke-virtual {v3, v5, v4}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 316
    const-string v4, "0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 317
    sget-object p1, Lkik/a/f/g/c;->a:Lkik/a/f/g/c;

    .line 326
    :cond_2
    :goto_1
    new-instance v3, Lkik/a/f/f;

    invoke-direct {v3, v0, v1, v2, p1}, Lkik/a/f/f;-><init>(Ljava/lang/String;IILkik/a/f/g/c;)V

    throw v3

    .line 319
    :cond_3
    const-string v4, "1"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 320
    sget-object p1, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    goto :goto_1

    .line 322
    :cond_4
    const-string v4, "2"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 323
    sget-object p1, Lkik/a/f/g/c;->c:Lkik/a/f/g/c;

    goto :goto_1

    .line 328
    :cond_5
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "wait"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 329
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "t"

    invoke-virtual {v0, v5, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 330
    new-instance v1, Lkik/a/f/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Server reqested a backoff of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " s"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lkik/a/f/b;-><init>(Ljava/lang/String;I)V

    throw v1

    .line 332
    :cond_6
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "badhost"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 333
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Bad Host Request"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 335
    :cond_7
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "badver"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 336
    new-instance v0, Lkik/a/f/d;

    const-string v1, "Server rejects current application version"

    invoke-direct {v0, v1}, Lkik/a/f/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 338
    :cond_8
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "badts"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 339
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "ts"

    invoke-virtual {v0, v5, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 342
    invoke-static {v0, v1}, Lkik/a/h/j;->a(J)V

    .line 344
    new-instance v2, Lkik/a/f/c;

    const-string v3, "Bad timestamp"

    invoke-direct {v2, v3, v0, v1}, Lkik/a/f/c;-><init>(Ljava/lang/String;J)V

    throw v2

    .line 348
    :cond_9
    iget-object v0, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    const-string v1, "ts"

    invoke-virtual {v0, v5, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 349
    if-eqz v0, :cond_a

    .line 350
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkik/a/h/j;->a(J)V

    .line 353
    :cond_a
    invoke-virtual {p0}, Lkik/android/net/communicator/k;->a()V

    .line 354
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 374
    if-eqz p1, :cond_0

    .line 375
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/net/communicator/k;->e:J

    .line 378
    :cond_0
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    if-eqz v0, :cond_2

    .line 379
    iget-object v0, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    if-eqz v0, :cond_1

    .line 380
    iget-object v0, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    invoke-virtual {v0}, Lkik/a/f/o;->c()V

    .line 382
    :cond_1
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    invoke-virtual {v0}, Lkik/android/net/b;->flush()V

    .line 383
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    invoke-virtual {v0}, Lkik/android/net/b;->a()V

    .line 386
    :cond_2
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 630
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lkik/android/net/communicator/k;->k:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const-string v2, "HmacSHA1"

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 632
    const-string v1, "HmacSHA1"

    invoke-static {v1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 633
    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 635
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v0

    .line 636
    invoke-static {v0}, Lkik/android/util/cq;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 642
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :goto_1
    const-string v0, "deadbeef101"

    goto :goto_0

    .line 641
    :catch_1
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 390
    iget-object v0, p0, Lkik/android/net/communicator/k;->g:Lkik/android/net/a;

    if-eqz v0, :cond_0

    .line 391
    iget-object v0, p0, Lkik/android/net/communicator/k;->g:Lkik/android/net/a;

    invoke-virtual {v0}, Lkik/android/net/a;->a()V

    .line 393
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 601
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/net/b;->write([B)V

    .line 602
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/net/communicator/k;->a(Z)V

    .line 603
    return-void
.end method

.method public final a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkik/a/f/g/c;I)V
    .locals 13

    .prologue
    .line 483
    if-eqz p3, :cond_2

    const/4 v2, 0x1

    .line 484
    :goto_0
    :try_start_0
    sget-object v3, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    move-object/from16 v0, p9

    if-ne v0, v3, :cond_3

    .line 488
    const/4 v3, 0x1

    invoke-direct {p0, p1, p2, v3}, Lkik/android/net/communicator/k;->a(Ljava/lang/String;IZ)V

    .line 498
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p6

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p7

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    invoke-static {v6, v7}, Lkik/a/h/j;->c(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lkik/android/net/communicator/k;->l:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    const-string v12, "unknown"

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_0

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v6, 0x2

    if-ge v4, v6, :cond_1

    :cond_0
    const-string v12, "unknown"

    :cond_1
    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "@"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p5

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lkik/android/net/communicator/k;->l:Ljava/lang/String;

    invoke-direct {p0, v3}, Lkik/android/net/communicator/k;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v11, p0, Lkik/android/net/communicator/k;->j:Ljava/lang/String;

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v6, p4

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-static/range {v2 .. v12}, Lkik/a/f/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    iget-object v2, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    iget-object v2, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v9

    sget-object v2, Lkik/a/f/g/c;->c:Lkik/a/f/g/c;

    move-object/from16 v0, p9

    if-eq v0, v2, :cond_6

    new-instance v2, Lkik/android/net/b;

    new-instance v4, Lkik/a/f/m;

    const-wide/16 v6, 0x7530

    new-instance v5, Lkik/android/net/e;

    iget-object v10, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    invoke-direct {v5, v10}, Lkik/android/net/e;-><init>(Ljava/net/Socket;)V

    invoke-direct {v4, v9, v6, v7, v5}, Lkik/a/f/m;-><init>(Ljava/io/OutputStream;JLkik/a/f/p;)V

    const-string v5, "KIK_XML_SND"

    invoke-direct {v2, v4, v5}, Lkik/android/net/b;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    iput-object v2, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    iput-object v8, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    iget-object v2, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    invoke-virtual {v2, v3}, Lkik/android/net/b;->write([B)V

    :goto_3
    new-instance v2, Lkik/android/net/a;

    new-instance v3, Ljava/io/InputStreamReader;

    iget-object v4, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    const-string v5, "UTF-8"

    invoke-direct {v3, v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const-string v4, "KIK_XML_RCV"

    iget-object v5, p0, Lkik/android/net/communicator/k;->i:Lcom/kik/android/b/a;

    invoke-direct {v2, v3, v4, v5}, Lkik/android/net/a;-><init>(Ljava/io/Reader;Ljava/lang/String;Lcom/kik/android/b/a;)V

    iput-object v2, p0, Lkik/android/net/communicator/k;->g:Lkik/android/net/a;

    new-instance v2, Lkik/a/f/n;

    invoke-direct {v2}, Lkik/a/f/n;-><init>()V

    iput-object v2, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    iget-object v2, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    iget-object v3, p0, Lkik/android/net/communicator/k;->g:Lkik/android/net/a;

    invoke-virtual {v2, v3}, Lkik/a/f/n;->setInput(Ljava/io/Reader;)V

    new-instance v2, Lkik/a/f/o;

    invoke-direct {v2}, Lkik/a/f/o;-><init>()V

    iput-object v2, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    iget-object v2, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    iget-object v3, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    const-string v4, "UTF-8"

    invoke-virtual {v2, v3, v4}, Lkik/a/f/o;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lkik/android/net/communicator/k;->a(Z)V

    .line 499
    move-object/from16 v0, p9

    invoke-direct {p0, v0}, Lkik/android/net/communicator/k;->a(Lkik/a/f/g/c;)V

    .line 501
    iget-object v2, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 503
    iget-object v2, p0, Lkik/android/net/communicator/k;->h:Lkik/android/net/communicator/j;

    iget-object v3, p0, Lkik/android/net/communicator/k;->b:Lkik/a/f/n;

    invoke-virtual {v2, v3, p0}, Lkik/android/net/communicator/j;->a(Lkik/a/f/n;Lkik/android/net/communicator/j$a;)V

    new-instance v2, Ljava/lang/Thread;

    iget-object v3, p0, Lkik/android/net/communicator/k;->h:Lkik/android/net/communicator/j;

    const-string v4, "XmppInputThread"

    invoke-direct {v2, v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 505
    return-void

    .line 483
    :cond_2
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 490
    :cond_3
    sget-object v3, Lkik/a/f/g/c;->d:Lkik/a/f/g/c;

    move-object/from16 v0, p9

    if-ne v0, v3, :cond_4

    .line 492
    const/4 v3, 0x0

    invoke-direct {p0, p1, p2, v3}, Lkik/android/net/communicator/k;->a(Ljava/lang/String;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    .line 509
    :catchall_0
    move-exception v2

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Lkik/android/net/communicator/k;->a(Z)V

    .line 511
    invoke-virtual {p0}, Lkik/android/net/communicator/k;->a()V

    .line 512
    invoke-virtual {p0}, Lkik/android/net/communicator/k;->b()V

    throw v2

    .line 495
    :cond_4
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Connecting plain to: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v3, Ljava/net/Socket;

    invoke-direct {v3}, Ljava/net/Socket;-><init>()V

    iput-object v3, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    iget-object v3, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    new-instance v6, Ljava/net/InetSocketAddress;

    invoke-direct {v6, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    const/16 v7, 0x2710

    invoke-virtual {v3, v6, v7}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object v3, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Ljava/net/Socket;->setKeepAlive(Z)V

    iget-object v3, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    const/16 v6, 0x2710

    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "Connecting took "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long v4, v6, v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "ms"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 498
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lkik/android/net/communicator/k;->l:Ljava/lang/String;

    invoke-direct {p0, v2}, Lkik/android/net/communicator/k;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v11, p0, Lkik/android/net/communicator/k;->j:Ljava/lang/String;

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-static/range {v4 .. v12}, Lkik/a/f/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_2

    :cond_6
    const/16 v2, 0x20

    new-array v4, v2, [B

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v2, v4}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v2, 0x10

    new-array v5, v2, [B

    const/16 v2, 0x10

    new-array v2, v2, [B

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v10, 0x10

    invoke-static {v4, v6, v5, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/16 v10, 0x10

    invoke-static {v4, v6, v2, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v10, Lorg/bouncycastle/crypto/engines/RC4Engine;

    invoke-direct {v10}, Lorg/bouncycastle/crypto/engines/RC4Engine;-><init>()V

    const/4 v6, 0x1

    new-instance v7, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v7, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-virtual {v10, v6, v7}, Lorg/bouncycastle/crypto/engines/RC4Engine;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    new-instance v2, Lorg/bouncycastle/crypto/engines/RC4Engine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/RC4Engine;-><init>()V

    const/4 v6, 0x1

    new-instance v7, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v7, v5}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-virtual {v2, v6, v7}, Lorg/bouncycastle/crypto/engines/RC4Engine;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    new-instance v5, Ljava/math/BigInteger;

    const-string v6, "90174020997965854385364363362105278416879782413898203701760313296520319228892196826551938811559509433087843974940422570732771275448938469288703504602713408350493732529791404358536477358798134202720065748820825607255064945625287044798157488670202656474077596117373942197956421964804224281020753664425450091601"

    const/16 v7, 0xa

    invoke-direct {v5, v6, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    new-instance v6, Ljava/math/BigInteger;

    const-string v7, "65537"

    const/16 v11, 0xa

    invoke-direct {v6, v7, v11}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    new-instance v7, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v5, v6}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;-><init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v5, Lorg/bouncycastle/crypto/engines/RSAEngine;

    invoke-direct {v5}, Lorg/bouncycastle/crypto/engines/RSAEngine;-><init>()V

    new-instance v6, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    invoke-direct {v6, v5}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    const/4 v5, 0x1

    invoke-virtual {v6, v5, v7}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x0

    const/16 v7, 0x20

    :try_start_2
    invoke-virtual {v6, v4, v5, v7}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;->processBlock([BII)[B
    :try_end_2
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v7

    :try_start_3
    array-length v4, v7

    add-int/lit8 v4, v4, 0x3

    array-length v5, v3

    add-int/2addr v4, v5

    new-array v6, v4, [B

    const/4 v4, 0x0

    const/16 v5, 0x11

    aput-byte v5, v6, v4

    const/4 v4, 0x1

    const/16 v5, 0x2a

    aput-byte v5, v6, v4

    const/4 v4, 0x2

    const/4 v5, 0x1

    aput-byte v5, v6, v4

    const/4 v4, 0x0

    const/4 v5, 0x3

    array-length v11, v7

    invoke-static {v7, v4, v6, v5, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v4, 0x0

    array-length v5, v3

    array-length v7, v7

    add-int/lit8 v7, v7, 0x3

    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/crypto/engines/RC4Engine;->processBytes([BII[BI)V

    invoke-virtual {v9, v6}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v9}, Ljava/io/OutputStream;->flush()V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "KIK_XML_SND: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Lkik/a/f/g/b;

    invoke-direct {v3, v9, v2}, Lkik/a/f/g/b;-><init>(Ljava/io/OutputStream;Lorg/bouncycastle/crypto/StreamCipher;)V

    new-instance v2, Lkik/a/f/m;

    const-wide/16 v4, 0x7530

    new-instance v6, Lkik/android/net/e;

    iget-object v7, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    invoke-direct {v6, v7}, Lkik/android/net/e;-><init>(Ljava/net/Socket;)V

    invoke-direct {v2, v3, v4, v5, v6}, Lkik/a/f/m;-><init>(Ljava/io/OutputStream;JLkik/a/f/p;)V

    new-instance v3, Lkik/android/net/b;

    const-string v4, "KIK_XML_SND"

    invoke-direct {v3, v2, v4}, Lkik/android/net/b;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    iput-object v3, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    new-instance v2, Lkik/a/f/g/a;

    invoke-direct {v2, v10, v8}, Lkik/a/f/g/a;-><init>(Lorg/bouncycastle/crypto/StreamCipher;Ljava/io/InputStream;)V

    iput-object v2, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    goto/16 :goto_3

    :catch_0
    move-exception v2

    new-instance v2, Ljava/io/IOException;

    const-string v3, "wtf"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method

.method public final a(Lkik/a/f/f/ac;)V
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 535
    iget-object v0, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    if-eqz v0, :cond_4

    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Net Debug--> Sending stanza: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    instance-of v0, p1, Lkik/a/f/f/v;

    if-eqz v0, :cond_3

    .line 539
    check-cast p1, Lkik/a/f/f/v;

    .line 540
    new-instance v0, Lkik/a/f/o;

    invoke-direct {v0}, Lkik/a/f/o;-><init>()V

    .line 542
    iget-object v3, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    const-string v4, "UTF-8"

    invoke-virtual {v0, v3, v4}, Lkik/a/f/o;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 544
    iget-object v3, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    invoke-virtual {v3}, Lkik/android/net/communicator/k$a;->reset()V

    .line 548
    :try_start_0
    invoke-virtual {p1, v0}, Lkik/a/f/f/v;->a(Lkik/a/f/o;)V
    :try_end_0
    .catch Lkik/a/f/g; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    move v0, v1

    .line 565
    :goto_0
    invoke-virtual {p1}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v4

    .line 566
    if-eqz v4, :cond_1

    invoke-static {v4}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 567
    iget-object v5, p0, Lkik/android/net/communicator/k;->m:Lcom/kik/android/a;

    const-string v6, "Message Stanza Sent"

    invoke-virtual {v5, v6}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v6, "Is Encryption Failure"

    invoke-virtual {v5, v6, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v6, "Is Encrypted"

    invoke-virtual {v4}, Lkik/a/d/s;->o()[B

    move-result-object v7

    if-eqz v7, :cond_2

    if-nez v0, :cond_2

    move v0, v2

    :goto_1
    invoke-virtual {v5, v6, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    .line 571
    invoke-virtual {p1}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v5

    invoke-virtual {v5}, Lkik/a/d/s;->o()[B

    move-result-object v5

    if-eqz v5, :cond_0

    .line 572
    const-string v5, "Encryption Time"

    invoke-virtual {v4}, Lkik/a/d/s;->p()J

    move-result-wide v6

    long-to-double v6, v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v6, v8

    invoke-virtual {v0, v5, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    .line 574
    :cond_0
    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 577
    :cond_1
    invoke-virtual {v3}, Lkik/a/f/o;->c()V

    .line 579
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    iget-object v3, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    invoke-virtual {v3}, Lkik/android/net/communicator/k$a;->a()[B

    move-result-object v3

    iget-object v4, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    invoke-virtual {v4}, Lkik/android/net/communicator/k$a;->b()I

    move-result v4

    invoke-virtual {v0, v3, v1, v4}, Lkik/android/net/b;->write([BII)V

    .line 582
    iget-object v0, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    invoke-virtual {v0}, Lkik/android/net/communicator/k$a;->reset()V

    .line 584
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    invoke-virtual {v0}, Lkik/android/net/b;->flush()V

    .line 592
    :goto_2
    invoke-direct {p0, v2}, Lkik/android/net/communicator/k;->a(Z)V

    return-void

    .line 550
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 554
    new-instance v0, Lkik/a/f/o;

    invoke-direct {v0}, Lkik/a/f/o;-><init>()V

    .line 555
    iget-object v3, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    const-string v4, "UTF-8"

    invoke-virtual {v0, v3, v4}, Lkik/a/f/o;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 558
    iget-object v3, p0, Lkik/android/net/communicator/k;->q:Lkik/android/net/communicator/k$a;

    invoke-virtual {v3}, Lkik/android/net/communicator/k$a;->reset()V

    .line 560
    invoke-virtual {p1}, Lkik/a/f/f/v;->d()V

    .line 561
    invoke-virtual {p1, v0}, Lkik/a/f/f/v;->a(Lkik/a/f/o;)V

    move-object v3, v0

    move v0, v2

    .line 562
    goto/16 :goto_0

    :cond_2
    move v0, v1

    .line 567
    goto :goto_1

    .line 587
    :cond_3
    iget-object v0, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    invoke-interface {p1, v0}, Lkik/a/f/f/ac;->a(Lkik/a/f/o;)V

    .line 589
    iget-object v0, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    invoke-virtual {v0}, Lkik/a/f/o;->c()V

    goto :goto_2

    .line 595
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No output stream available to send message to."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 3

    .prologue
    .line 522
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/k;->h:Lkik/android/net/communicator/j;

    invoke-virtual {v0}, Lkik/android/net/communicator/j;->b()V

    .line 523
    iget-object v0, p0, Lkik/android/net/communicator/k;->a:Lkik/a/f/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    const-string v0, "</k>"

    invoke-virtual {p0, v0}, Lkik/android/net/communicator/k;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/net/communicator/k;->a(Z)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_1

    :try_start_3
    iget-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    invoke-virtual {v0}, Lkik/android/net/b;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v0, 0x0

    :try_start_4
    iput-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    :cond_1
    :goto_1
    iget-object v0, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_2

    :try_start_5
    iget-object v0, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v0, 0x0

    :try_start_6
    iput-object v0, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    :cond_2
    :goto_2
    iget-object v0, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v0, :cond_3

    :try_start_7
    iget-object v0, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    const/4 v0, 0x0

    :try_start_8
    iput-object v0, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 525
    :cond_3
    :goto_3
    monitor-exit p0

    return-void

    .line 523
    :catch_0
    move-exception v0

    :try_start_9
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error while trying to send closing stream tag: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_0

    .line 522
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 523
    :catch_1
    move-exception v0

    :try_start_a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Net Error: Failed to clean up output stream: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    const/4 v0, 0x0

    :try_start_b
    iput-object v0, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    goto :goto_1

    :catchall_1
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/net/communicator/k;->d:Lkik/android/net/b;

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :catch_2
    move-exception v0

    :try_start_c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Net Error: Failed to clean up input stream: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    const/4 v0, 0x0

    :try_start_d
    iput-object v0, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    goto :goto_2

    :catchall_2
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/net/communicator/k;->c:Ljava/io/InputStream;

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :catch_3
    move-exception v0

    :try_start_e
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Net Error: Failed to clean up connection: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    const/4 v0, 0x0

    :try_start_f
    iput-object v0, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    goto :goto_3

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/net/communicator/k;->f:Ljava/net/Socket;

    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 607
    iget-object v0, p0, Lkik/android/net/communicator/k;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final d()J
    .locals 2

    .prologue
    .line 615
    iget-object v0, p0, Lkik/android/net/communicator/k;->g:Lkik/android/net/a;

    .line 616
    if-eqz v0, :cond_0

    .line 617
    invoke-virtual {v0}, Lkik/android/net/a;->b()J

    move-result-wide v0

    .line 619
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 624
    iget-wide v0, p0, Lkik/android/net/communicator/k;->e:J

    return-wide v0
.end method

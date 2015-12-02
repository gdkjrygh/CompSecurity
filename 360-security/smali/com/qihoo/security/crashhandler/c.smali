.class public Lcom/qihoo/security/crashhandler/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/g/a$a;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private e:Lorg/apache/http/client/HttpClient;

.field private f:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/qihoo/security/crashhandler/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/crashhandler/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const-string/jumbo v0, "http://%s/%s/%s"

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->b:Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->e:Lorg/apache/http/client/HttpClient;

    .line 56
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    new-instance v1, Lcom/qihoo/security/d/a;

    iget-object v2, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/qihoo/security/d/a;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/g/a;->a(Landroid/content/Context;Lcom/qihoo/security/d/a;)Lorg/apache/http/HttpHost;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/HttpHost;)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->e:Lorg/apache/http/client/HttpClient;

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    const-string/jumbo v1, "dump"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 61
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->makeSurePathExists(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "dump.cache"

    invoke-static {v1, v2}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/crashhandler/c;->c:Ljava/lang/String;

    .line 63
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "f2u.tmp"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->d:Ljava/lang/String;

    .line 68
    :goto_0
    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    const-string/jumbo v1, "dump.cache"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->c:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    const-string/jumbo v1, "dump.cache"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method private a()Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 135
    new-instance v0, Lcom/qihoo/security/d/a;

    iget-object v1, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/d/a;-><init>(Landroid/content/Context;)V

    .line 136
    iget-object v1, p0, Lcom/qihoo/security/crashhandler/c;->b:Ljava/lang/String;

    new-array v2, v8, [Ljava/lang/Object;

    const-string/jumbo v3, "crash"

    const-string/jumbo v4, "host"

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/security/d/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    const-string/jumbo v3, "crash"

    const-string/jumbo v4, "pam1"

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/security/d/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    const-string/jumbo v3, "crash"

    const-string/jumbo v4, "pam2"

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/security/d/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/c;->b:Ljava/lang/String;

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/crashhandler/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "?k3=%s&k2=%s&k1=%s&k5=%s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string/jumbo v3, "andr_ms_400"

    aput-object v3, v2, v5

    const-string/jumbo v3, "Android"

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/qihoo/security/crashhandler/c;->f:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/b/o;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo360/common/utils/Utils;->getMD5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    const-string/jumbo v3, "1.0.8.3742"

    aput-object v3, v2, v8

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/io/File;)I
    .locals 5

    .prologue
    .line 78
    const/4 v2, 0x0

    .line 79
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/qihoo/security/crashhandler/c;->d:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 86
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 91
    const/high16 v0, 0x200000

    const/high16 v1, 0x500000

    invoke-static {p1, v3, v0, v1}, Lcom/qihoo360/common/utils/ZipUtil;->ZipDirGzip(Ljava/io/File;Ljava/io/File;II)Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    move-result-object v0

    .line 93
    sget-object v1, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_NotFound:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    if-eq v0, v1, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->exists()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 94
    :cond_0
    const/16 v0, -0x7d0

    .line 120
    if-eqz v2, :cond_1

    .line 122
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 126
    :cond_1
    :goto_0
    return v0

    .line 97
    :cond_2
    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lcom/qihoo/security/crashhandler/c;->c:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    :try_start_3
    invoke-static {v3}, Lcom/qihoo360/common/utils/FileUtil;->readFileByte(Ljava/io/File;)[B

    move-result-object v0

    .line 99
    iget-object v2, p0, Lcom/qihoo/security/crashhandler/c;->e:Lorg/apache/http/client/HttpClient;

    invoke-direct {p0}, Lcom/qihoo/security/crashhandler/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v0, v1, p0}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;[BLjava/io/OutputStream;Lcom/qihoo/security/g/a$a;)I

    move-result v0

    .line 101
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 103
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 108
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/crashhandler/c;->c:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    if-eqz v1, :cond_1

    .line 122
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    .line 123
    :catch_0
    move-exception v1

    goto :goto_0

    .line 115
    :catch_1
    move-exception v0

    move-object v0, v2

    .line 120
    :goto_1
    if-eqz v0, :cond_3

    .line 122
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 126
    :cond_3
    :goto_2
    const/16 v0, -0x63

    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_4

    .line 122
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 124
    :cond_4
    :goto_4
    throw v0

    .line 123
    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_4

    .line 120
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 115
    :catch_5
    move-exception v0

    move-object v0, v1

    goto :goto_1
.end method

.method public a(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 166
    return-void
.end method

.method public a(JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 160
    return-void
.end method

.method public a(Lorg/apache/http/HttpEntityEnclosingRequest;)V
    .locals 0

    .prologue
    .line 147
    return-void
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 0

    .prologue
    .line 154
    return-void
.end method

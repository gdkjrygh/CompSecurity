.class Lcom/kik/d/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/io/File;

.field private final c:Lorg/c/b;

.field private volatile d:I

.field private volatile e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const-class v0, Lcom/kik/d/e;

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/Class;)Lorg/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/e;->c:Lorg/c/b;

    .line 22
    iput v1, p0, Lcom/kik/d/e;->d:I

    .line 23
    iput v1, p0, Lcom/kik/d/e;->e:I

    .line 28
    iput-object p1, p0, Lcom/kik/d/e;->a:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/kik/d/e;->b:Ljava/io/File;

    .line 30
    return-void
.end method

.method private a(Ljava/io/File;)I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 48
    const/4 v1, -0x1

    .line 52
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :try_start_1
    new-instance v0, Ljava/net/URL;

    iget-object v4, p0, Lcom/kik/d/e;->a:Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    :try_start_2
    const-string v3, "POST"

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 56
    const-string v3, "Content-Type"

    const-string v4, "application/x-protobuf"

    invoke-virtual {v0, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 59
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 60
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    .line 62
    invoke-static {v2, v3}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 63
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v1

    .line 70
    invoke-static {v2}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;)V

    .line 71
    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 75
    :cond_0
    const/16 v0, 0xc8

    if-ne v1, v0, :cond_1

    .line 76
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_5

    .line 78
    iget-object v0, p0, Lcom/kik/d/e;->c:Lorg/c/b;

    const-string v2, "Failed to delete uploadedfile"

    invoke-interface {v0, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    move v0, v1

    .line 91
    :goto_0
    return v0

    .line 81
    :cond_1
    const/16 v0, 0x190

    if-lt v1, v0, :cond_2

    const/16 v0, 0x1f4

    if-ge v1, v0, :cond_2

    .line 82
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_5

    .line 84
    iget-object v0, p0, Lcom/kik/d/e;->c:Lorg/c/b;

    const-string v2, "Failed to delete uploaded file"

    invoke-interface {v0, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/kik/d/e;->c:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Upload failed with code: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    move v0, v1

    .line 90
    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    move-object v0, v3

    :goto_1
    invoke-static {v0}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;)V

    .line 71
    if-eqz v3, :cond_3

    .line 72
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 75
    :cond_3
    iget-object v0, p0, Lcom/kik/d/e;->c:Lorg/c/b;

    const-string v2, "Upload failed with code: -1"

    invoke-interface {v0, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    move v0, v1

    .line 90
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_2
    invoke-static {v2}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;)V

    .line 71
    if-eqz v3, :cond_4

    .line 72
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 75
    :cond_4
    iget-object v1, p0, Lcom/kik/d/e;->c:Lorg/c/b;

    const-string v2, "Upload failed with code: -1"

    invoke-interface {v1, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    throw v0

    .line 70
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    goto :goto_2

    .line 67
    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_1

    :catch_2
    move-exception v3

    move-object v3, v0

    move-object v0, v2

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 35
    iget-object v0, p0, Lcom/kik/d/e;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 36
    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/kik/d/e;->b:Ljava/io/File;

    invoke-direct {v4, v5, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v4}, Lcom/kik/d/e;->a(Ljava/io/File;)I

    move-result v3

    .line 37
    const/16 v4, 0xc8

    if-ne v3, v4, :cond_0

    .line 38
    iget v3, p0, Lcom/kik/d/e;->d:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/kik/d/e;->d:I

    .line 35
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 41
    :cond_0
    iget v3, p0, Lcom/kik/d/e;->e:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/kik/d/e;->e:I

    goto :goto_1

    .line 44
    :cond_1
    return-void
.end method

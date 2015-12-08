.class public final Lb/a/a/a/a/e/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/e/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a/a/a/a/e/b$1;
    }
.end annotation


# instance fields
.field private final a:Lb/a/a/a/o;

.field private b:Lb/a/a/a/a/e/h;

.field private c:Ljavax/net/ssl/SSLSocketFactory;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 49
    new-instance v0, Lb/a/a/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/a/a/a/c;-><init>(B)V

    invoke-direct {p0, v0}, Lb/a/a/a/a/e/b;-><init>(Lb/a/a/a/o;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Lb/a/a/a/o;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lb/a/a/a/a/e/b;->a:Lb/a/a/a/o;

    .line 54
    return-void
.end method

.method private declared-synchronized a()V
    .locals 1

    .prologue
    .line 70
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lb/a/a/a/a/e/b;->d:Z

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/a/a/a/e/b;->c:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit p0

    return-void

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized b()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .prologue
    .line 122
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/e/b;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lb/a/a/a/a/e/b;->d:Z

    if-nez v0, :cond_0

    .line 123
    invoke-direct {p0}, Lb/a/a/a/a/e/b;->c()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a/e/b;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 125
    :cond_0
    iget-object v0, p0, Lb/a/a/a/a/e/b;->c:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 122
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized c()Ljavax/net/ssl/SSLSocketFactory;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 129
    monitor-enter p0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lb/a/a/a/a/e/b;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :try_start_1
    iget-object v1, p0, Lb/a/a/a/a/e/b;->b:Lb/a/a/a/a/e/h;

    const-string v2, "TLS"

    invoke-static {v2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v2

    new-instance v3, Lb/a/a/a/a/e/j;

    invoke-interface {v1}, Lb/a/a/a/a/e/h;->a()Ljava/io/InputStream;

    move-result-object v4

    invoke-interface {v1}, Lb/a/a/a/a/e/h;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lb/a/a/a/a/e/j;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    new-instance v4, Lb/a/a/a/a/e/i;

    invoke-direct {v4, v3, v1}, Lb/a/a/a/a/e/i;-><init>(Lb/a/a/a/a/e/j;Lb/a/a/a/a/e/h;)V

    const/4 v1, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 139
    :goto_0
    monitor-exit p0

    return-object v0

    .line 136
    :catch_0
    move-exception v1

    .line 137
    :try_start_2
    iget-object v2, p0, Lb/a/a/a/a/e/b;->a:Lb/a/a/a/o;

    const-string v3, "Fabric"

    const-string v4, "Exception while validating pinned certs"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 129
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/Map;)Lb/a/a/a/a/e/d;
    .locals 3

    .prologue
    .line 83
    sget-object v0, Lb/a/a/a/a/e/b$1;->a:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 101
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported HTTP method!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :pswitch_0
    invoke-static {p2, p3}, Lb/a/a/a/a/e/d;->a(Ljava/lang/CharSequence;Ljava/util/Map;)Lb/a/a/a/a/e/d;

    move-result-object v0

    move-object v1, v0

    .line 105
    :goto_0
    if-eqz p2, :cond_1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "https"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/a/a/a/a/e/b;->b:Lb/a/a/a/a/e/h;

    if-eqz v0, :cond_0

    .line 106
    invoke-direct {p0}, Lb/a/a/a/a/e/b;->b()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    .line 108
    if-eqz v2, :cond_0

    .line 109
    invoke-virtual {v1}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 114
    :cond_0
    return-object v1

    .line 89
    :pswitch_1
    invoke-static {p2, p3}, Lb/a/a/a/a/e/d;->b(Ljava/lang/CharSequence;Ljava/util/Map;)Lb/a/a/a/a/e/d;

    move-result-object v0

    move-object v1, v0

    .line 90
    goto :goto_0

    .line 93
    :pswitch_2
    invoke-static {p2}, Lb/a/a/a/a/e/d;->a(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    move-object v1, v0

    .line 94
    goto :goto_0

    .line 97
    :pswitch_3
    invoke-static {p2}, Lb/a/a/a/a/e/d;->b(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    move-object v1, v0

    .line 98
    goto :goto_0

    .line 105
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 83
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final a(Lb/a/a/a/a/e/h;)V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lb/a/a/a/a/e/b;->b:Lb/a/a/a/a/e/h;

    if-eq v0, p1, :cond_0

    .line 64
    iput-object p1, p0, Lb/a/a/a/a/e/b;->b:Lb/a/a/a/a/e/h;

    .line 65
    invoke-direct {p0}, Lb/a/a/a/a/e/b;->a()V

    .line 67
    :cond_0
    return-void
.end method

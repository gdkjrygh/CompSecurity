.class Lcom/google/android/gms/tagmanager/aj;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/google/android/gms/tagmanager/aj;


# instance fields
.field private volatile b:I

.field private volatile c:Ljava/lang/String;

.field private volatile d:Ljava/lang/String;

.field private volatile e:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1000
    sget v0, Lcom/google/android/gms/tagmanager/ak;->a:I

    iput v0, p0, Lcom/google/android/gms/tagmanager/aj;->b:I

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->d:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->c:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->e:Ljava/lang/String;

    .line 0
    return-void
.end method

.method static a()Lcom/google/android/gms/tagmanager/aj;
    .locals 2

    const-class v1, Lcom/google/android/gms/tagmanager/aj;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/tagmanager/aj;->a:Lcom/google/android/gms/tagmanager/aj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/aj;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/aj;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/aj;->a:Lcom/google/android/gms/tagmanager/aj;

    :cond_0
    sget-object v0, Lcom/google/android/gms/tagmanager/aj;->a:Lcom/google/android/gms/tagmanager/aj;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "&"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method


# virtual methods
.method final declared-synchronized a(Landroid/net/Uri;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 0
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    :try_start_1
    const-string v3, "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lcom/google/android/gms/tagmanager/y;->a()V

    const-string v1, ".*?&gtm_debug=x$"

    invoke-virtual {v2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget v1, Lcom/google/android/gms/tagmanager/ak;->c:I

    iput v1, p0, Lcom/google/android/gms/tagmanager/aj;->b:I

    .line 2000
    :goto_0
    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    const-string v2, "&gtm_debug=x"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 0
    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->e:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/tagmanager/aj;->b:I

    sget v2, Lcom/google/android/gms/tagmanager/ak;->b:I

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/google/android/gms/tagmanager/aj;->b:I

    sget v2, Lcom/google/android/gms/tagmanager/ak;->c:I

    if-ne v1, v2, :cond_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "/r?"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/aj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->d:Ljava/lang/String;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/aj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->c:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    return v0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_1

    :cond_2
    :try_start_2
    sget v1, Lcom/google/android/gms/tagmanager/ak;->b:I

    iput v1, p0, Lcom/google/android/gms/tagmanager/aj;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    :try_start_3
    const-string v3, "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/aj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/aj;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exit preview mode for container: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/aj;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/gms/tagmanager/y;->a()V

    sget v1, Lcom/google/android/gms/tagmanager/ak;->a:I

    iput v1, p0, Lcom/google/android/gms/tagmanager/aj;->b:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/aj;->d:Ljava/lang/String;

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Invalid preview uri: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/y;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v0, v1

    goto :goto_1
.end method

.method final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/tagmanager/aj;->b:I

    return v0
.end method

.method final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/aj;->d:Ljava/lang/String;

    return-object v0
.end method

.method final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/aj;->c:Ljava/lang/String;

    return-object v0
.end method

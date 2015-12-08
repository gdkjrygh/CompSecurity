.class final Lcom/google/android/gms/internal/yj;
.super Ljava/lang/Object;


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/be;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/yj;->b:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/internal/be;->a:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/yj;->a:J

    iget-object v0, p2, Lcom/google/android/gms/internal/be;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/yj;->c:Ljava/lang/String;

    iget-wide v0, p2, Lcom/google/android/gms/internal/be;->c:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/yj;->d:J

    iget-wide v0, p2, Lcom/google/android/gms/internal/be;->d:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/yj;->e:J

    iget-wide v0, p2, Lcom/google/android/gms/internal/be;->e:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/yj;->f:J

    iget-wide v0, p2, Lcom/google/android/gms/internal/be;->f:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/yj;->g:J

    iget-object v0, p2, Lcom/google/android/gms/internal/be;->g:Ljava/util/Map;

    iput-object v0, p0, Lcom/google/android/gms/internal/yj;->h:Ljava/util/Map;

    return-void
.end method

.method public static a(Ljava/io/InputStream;)Lcom/google/android/gms/internal/yj;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/yj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/yj;-><init>()V

    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/InputStream;)I

    move-result v1

    const v2, 0x20150306

    if-eq v1, v2, :cond_0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/yj;->b:Ljava/lang/String;

    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/yj;->c:Ljava/lang/String;

    iget-object v1, v0, Lcom/google/android/gms/internal/yj;->c:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/yj;->c:Ljava/lang/String;

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/yj;->d:J

    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/yj;->e:J

    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/yj;->f:J

    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/yj;->g:J

    invoke-static {p0}, Lcom/google/android/gms/internal/yi;->d(Ljava/io/InputStream;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/yj;->h:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 0
    const v0, 0x20150306

    :try_start_0
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yj;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yj;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/yj;->d:J

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;J)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/yj;->e:J

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;J)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/yj;->f:J

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;J)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/yj;->g:J

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yj;->h:Ljava/util/Map;

    .line 1000
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 0
    :catch_0
    move-exception v0

    const-string v1, "%s"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/xv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v3

    :goto_2
    return v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/yj;->c:Ljava/lang/String;

    goto :goto_0

    .line 1000
    :cond_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/yi;->a(Ljava/io/OutputStream;I)V

    .line 0
    :cond_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v2

    goto :goto_2
.end method

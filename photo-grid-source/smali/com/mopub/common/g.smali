.class final Lcom/mopub/common/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/common/DiskLruCache;

.field private final b:Ljava/lang/String;

.field private final c:[J

.field private d:Z

.field private e:Lcom/mopub/common/DiskLruCache$Editor;

.field private f:J


# direct methods
.method private constructor <init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 892
    iput-object p1, p0, Lcom/mopub/common/g;->a:Lcom/mopub/common/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 893
    iput-object p2, p0, Lcom/mopub/common/g;->b:Ljava/lang/String;

    .line 894
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache;->f(Lcom/mopub/common/DiskLruCache;)I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/mopub/common/g;->c:[J

    .line 895
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 877
    invoke-direct {p0, p1, p2}, Lcom/mopub/common/g;-><init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/mopub/common/g;J)J
    .locals 1

    .prologue
    .line 877
    iput-wide p1, p0, Lcom/mopub/common/g;->f:J

    return-wide p1
.end method

.method static synthetic a(Lcom/mopub/common/g;Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/DiskLruCache$Editor;
    .locals 0

    .prologue
    .line 877
    iput-object p1, p0, Lcom/mopub/common/g;->e:Lcom/mopub/common/DiskLruCache$Editor;

    return-object p1
.end method

.method private static a([Ljava/lang/String;)Ljava/io/IOException;
    .locals 3

    .prologue
    .line 921
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected journal line: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic a(Lcom/mopub/common/g;[Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1907
    array-length v0, p1

    iget-object v1, p0, Lcom/mopub/common/g;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v1}, Lcom/mopub/common/DiskLruCache;->f(Lcom/mopub/common/DiskLruCache;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1908
    invoke-static {p1}, Lcom/mopub/common/g;->a([Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1912
    :cond_0
    const/4 v0, 0x0

    :goto_0
    :try_start_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 1913
    iget-object v1, p0, Lcom/mopub/common/g;->c:[J

    aget-object v2, p1, v0

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    aput-wide v2, v1, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1912
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1916
    :catch_0
    move-exception v0

    invoke-static {p1}, Lcom/mopub/common/g;->a([Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1917
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/mopub/common/g;)Z
    .locals 1

    .prologue
    .line 877
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/common/g;->d:Z

    return v0
.end method

.method static synthetic b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Lcom/mopub/common/g;->e:Lcom/mopub/common/DiskLruCache$Editor;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/common/g;)[J
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Lcom/mopub/common/g;->c:[J

    return-object v0
.end method

.method static synthetic d(Lcom/mopub/common/g;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Lcom/mopub/common/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/mopub/common/g;)Z
    .locals 1

    .prologue
    .line 877
    iget-boolean v0, p0, Lcom/mopub/common/g;->d:Z

    return v0
.end method

.method static synthetic f(Lcom/mopub/common/g;)J
    .locals 2

    .prologue
    .line 877
    iget-wide v0, p0, Lcom/mopub/common/g;->f:J

    return-wide v0
.end method


# virtual methods
.method public final getCleanFile(I)Ljava/io/File;
    .locals 4

    .prologue
    .line 925
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/mopub/common/g;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v1}, Lcom/mopub/common/DiskLruCache;->g(Lcom/mopub/common/DiskLruCache;)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/mopub/common/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDirtyFile(I)Ljava/io/File;
    .locals 4

    .prologue
    .line 929
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/mopub/common/g;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v1}, Lcom/mopub/common/DiskLruCache;->g(Lcom/mopub/common/DiskLruCache;)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/mopub/common/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".tmp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getLengths()Ljava/lang/String;
    .locals 7

    .prologue
    .line 898
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 899
    iget-object v2, p0, Lcom/mopub/common/g;->c:[J

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-wide v4, v2, v0

    .line 900
    const/16 v6, 0x20

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 899
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 902
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

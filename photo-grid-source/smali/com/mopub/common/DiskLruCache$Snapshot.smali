.class public final Lcom/mopub/common/DiskLruCache$Snapshot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field final synthetic a:Lcom/mopub/common/DiskLruCache;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:[Ljava/io/InputStream;

.field private final e:[J


# direct methods
.method private constructor <init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[J)V
    .locals 1

    .prologue
    .line 677
    iput-object p1, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->a:Lcom/mopub/common/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 678
    iput-object p2, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->b:Ljava/lang/String;

    .line 679
    iput-wide p3, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->c:J

    .line 680
    iput-object p5, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->d:[Ljava/io/InputStream;

    .line 681
    iput-object p6, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->e:[J

    .line 682
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[JB)V
    .locals 1

    .prologue
    .line 671
    invoke-direct/range {p0 .. p6}, Lcom/mopub/common/DiskLruCache$Snapshot;-><init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[J)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .prologue
    .line 709
    iget-object v1, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->d:[Ljava/io/InputStream;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 710
    invoke-static {v3}, Lcom/mopub/common/DiskLruCacheUtil;->a(Ljava/io/Closeable;)V

    .line 709
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 712
    :cond_0
    return-void
.end method

.method public final edit()Lcom/mopub/common/DiskLruCache$Editor;
    .locals 4

    .prologue
    .line 690
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->a:Lcom/mopub/common/DiskLruCache;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/mopub/common/DiskLruCache;->a(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;J)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method public final getInputStream(I)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 695
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->d:[Ljava/io/InputStream;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final getLength(I)J
    .locals 2

    .prologue
    .line 705
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache$Snapshot;->e:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 700
    invoke-virtual {p0, p1}, Lcom/mopub/common/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

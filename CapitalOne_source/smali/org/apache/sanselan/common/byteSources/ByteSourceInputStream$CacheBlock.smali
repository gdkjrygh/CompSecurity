.class Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
.super Ljava/lang/Object;


# instance fields
.field public final a:[B

.field final synthetic b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

.field private c:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

.field private d:Z


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;[B)V
    .locals 1

    iput-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->c:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->d:Z

    iput-object p2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    return-void
.end method


# virtual methods
.method public final a()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->c:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->c:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    :goto_0
    return-object v0

    :cond_0
    iget-boolean v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->d:Z

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-static {v0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->a(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->c:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->c:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    goto :goto_0
.end method

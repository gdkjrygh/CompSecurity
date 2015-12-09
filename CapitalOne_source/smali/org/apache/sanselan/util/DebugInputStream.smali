.class public Lorg/apache/sanselan/util/DebugInputStream;
.super Ljava/io/InputStream;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private b:J


# virtual methods
.method public available()I
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public read()I
    .locals 6

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iget-wide v2, p0, Lorg/apache/sanselan/util/DebugInputStream;->b:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lorg/apache/sanselan/util/DebugInputStream;->b:J

    return v0
.end method

.method public skip(J)J
    .locals 5

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    iget-wide v2, p0, Lorg/apache/sanselan/util/DebugInputStream;->b:J

    add-long/2addr v2, p1

    iput-wide v2, p0, Lorg/apache/sanselan/util/DebugInputStream;->b:J

    return-wide v0
.end method

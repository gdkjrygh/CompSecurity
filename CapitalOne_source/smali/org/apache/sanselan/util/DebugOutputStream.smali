.class public Lorg/apache/sanselan/util/DebugOutputStream;
.super Ljava/io/OutputStream;


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private b:J


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public write(I)V
    .locals 4

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget-wide v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->b:J

    return-void
.end method

.method public write([B)V
    .locals 4

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-wide v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->b:J

    array-length v2, p1

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->b:J

    return-void
.end method

.method public write([BII)V
    .locals 4

    iget-object v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-wide v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->b:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/sanselan/util/DebugOutputStream;->b:J

    return-void
.end method

.class public Lorg/apache/sanselan/common/BinaryInputStream;
.super Ljava/io/InputStream;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private final a:Ljava/io/InputStream;


# virtual methods
.method public read()I
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method

.class public Lorg/apache/sanselan/common/BinaryOutputStream;
.super Ljava/io/OutputStream;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field protected a:Z

.field private b:I

.field private final c:Ljava/io/OutputStream;

.field private d:I


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->a:Z

    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->b:I

    const/16 v0, 0x4d

    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->d:I

    iput p2, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->d:I

    iput-object p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->c:Ljava/io/OutputStream;

    return-void
.end method

.method private final a(II)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, p2, [B

    iget v2, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->d:I

    const/16 v3, 0x4d

    if-ne v2, v3, :cond_2

    :goto_0
    if-lt v0, p2, :cond_0

    :goto_1
    invoke-virtual {p0, v1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write([B)V

    return-void

    :cond_0
    sub-int v2, p2, v0

    add-int/lit8 v2, v2, -0x1

    mul-int/lit8 v2, v2, 0x8

    shr-int v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v0, 0x8

    shr-int v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    :cond_2
    if-lt v0, p2, :cond_1

    goto :goto_1
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(II)V

    return-void
.end method

.method public final a([B)V
    .locals 3

    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->c:Ljava/io/OutputStream;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->b:I

    array-length v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->b:I

    return-void
.end method

.method public final b(I)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(II)V

    return-void
.end method

.method public write(I)V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->c:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->b:I

    return-void
.end method

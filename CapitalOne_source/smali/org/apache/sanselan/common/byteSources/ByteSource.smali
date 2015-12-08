.class public abstract Lorg/apache/sanselan/common/byteSources/ByteSource;
.super Lorg/apache/sanselan/common/BinaryFileFunctions;


# instance fields
.field protected final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSource;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/io/InputStream;
.end method

.method public abstract b(II)[B
.end method

.method public abstract c()J
.end method

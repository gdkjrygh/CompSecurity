.class public Lorg/apache/http/entity/mime/a/b;
.super Lorg/apache/http/entity/mime/a/a;
.source "360Security"


# instance fields
.field private final a:[B

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 60
    invoke-direct {p0, p2}, Lorg/apache/http/entity/mime/a/a;-><init>(Ljava/lang/String;)V

    .line 61
    if-nez p1, :cond_0

    .line 62
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "byte[] may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_0
    iput-object p1, p0, Lorg/apache/http/entity/mime/a/b;->a:[B

    .line 65
    iput-object p3, p0, Lorg/apache/http/entity/mime/a/b;->b:Ljava/lang/String;

    .line 66
    return-void
.end method


# virtual methods
.method public a(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lorg/apache/http/entity/mime/a/b;->a:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 84
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lorg/apache/http/entity/mime/a/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    const-string/jumbo v0, "binary"

    return-object v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lorg/apache/http/entity/mime/a/b;->a:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

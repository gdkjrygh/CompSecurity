.class Lcom/qihoo360/common/unzip/a$a$1;
.super Ljava/util/zip/InflaterInputStream;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/common/unzip/a$a;->b()Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/common/unzip/a$a;

.field private final synthetic b:Ljava/util/zip/Inflater;


# direct methods
.method constructor <init>(Lcom/qihoo360/common/unzip/a$a;Ljava/io/InputStream;Ljava/util/zip/Inflater;Ljava/util/zip/Inflater;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/common/unzip/a$a$1;->a:Lcom/qihoo360/common/unzip/a$a;

    iput-object p4, p0, Lcom/qihoo360/common/unzip/a$a$1;->b:Ljava/util/zip/Inflater;

    .line 447
    invoke-direct {p0, p2, p3}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 450
    invoke-super {p0}, Ljava/util/zip/InflaterInputStream;->close()V

    .line 451
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$1;->b:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 452
    return-void
.end method

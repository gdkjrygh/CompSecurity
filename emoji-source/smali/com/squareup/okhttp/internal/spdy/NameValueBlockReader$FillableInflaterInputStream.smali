.class Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;
.super Ljava/util/zip/InflaterInputStream;
.source "NameValueBlockReader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FillableInflaterInputStream"
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    .locals 0
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "inf"    # Ljava/util/zip/Inflater;

    .prologue
    .line 82
    invoke-direct {p0, p1, p2}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    .line 83
    return-void
.end method


# virtual methods
.method public fill()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 86
    invoke-super {p0}, Ljava/util/zip/InflaterInputStream;->fill()V

    .line 87
    return-void
.end method

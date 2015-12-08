.class Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;
.super Ljava/io/BufferedInputStream;
.source "SourceFile"


# instance fields
.field connection:Ljava/net/HttpURLConnection;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V
    .locals 1

    .prologue
    .line 122
    const/16 v0, 0x2000

    invoke-direct {p0, p1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 123
    iput-object p2, p0, Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;->connection:Ljava/net/HttpURLConnection;

    .line 124
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 128
    invoke-super {p0}, Ljava/io/BufferedInputStream;->close()V

    .line 129
    iget-object v0, p0, Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;->connection:Ljava/net/HttpURLConnection;

    invoke-static {v0}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    .line 130
    return-void
.end method

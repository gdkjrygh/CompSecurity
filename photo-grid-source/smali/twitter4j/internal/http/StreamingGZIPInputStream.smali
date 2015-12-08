.class final Ltwitter4j/internal/http/StreamingGZIPInputStream;
.super Ljava/util/zip/GZIPInputStream;
.source "SourceFile"


# instance fields
.field private final wrapped:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 29
    iput-object p1, p0, Ltwitter4j/internal/http/StreamingGZIPInputStream;->wrapped:Ljava/io/InputStream;

    .line 30
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Ltwitter4j/internal/http/StreamingGZIPInputStream;->wrapped:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

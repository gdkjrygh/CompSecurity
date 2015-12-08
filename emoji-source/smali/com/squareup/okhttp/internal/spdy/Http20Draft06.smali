.class final Lcom/squareup/okhttp/internal/spdy/Http20Draft06;
.super Ljava/lang/Object;
.source "Http20Draft06.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/Variant;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;,
        Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;
    }
.end annotation


# static fields
.field private static final CONNECTION_HEADER:[B

.field static final FLAG_END_FLOW_CONTROL:I = 0x1

.field static final FLAG_END_HEADERS:I = 0x4

.field static final FLAG_END_STREAM:I = 0x1

.field static final FLAG_PONG:I = 0x1

.field static final FLAG_PRIORITY:I = 0x8

.field static final TYPE_CONTINUATION:I = 0xa

.field static final TYPE_DATA:I = 0x0

.field static final TYPE_GOAWAY:I = 0x7

.field static final TYPE_HEADERS:I = 0x1

.field static final TYPE_PING:I = 0x6

.field static final TYPE_PRIORITY:I = 0x2

.field static final TYPE_PUSH_PROMISE:I = 0x5

.field static final TYPE_RST_STREAM:I = 0x3

.field static final TYPE_SETTINGS:I = 0x4

.field static final TYPE_WINDOW_UPDATE:I = 0x9


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 37
    :try_start_0
    const-string v1, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    const-string v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->CONNECTION_HEADER:[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 274
    return-void
.end method

.method static synthetic access$000()[B
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->CONNECTION_HEADER:[B

    return-object v0
.end method


# virtual methods
.method public newReader(Ljava/io/InputStream;Z)Lcom/squareup/okhttp/internal/spdy/FrameReader;
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "client"    # Z

    .prologue
    .line 62
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;

    invoke-direct {v0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;-><init>(Ljava/io/InputStream;Z)V

    return-object v0
.end method

.method public newWriter(Ljava/io/OutputStream;Z)Lcom/squareup/okhttp/internal/spdy/FrameWriter;
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "client"    # Z

    .prologue
    .line 66
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;

    invoke-direct {v0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;-><init>(Ljava/io/OutputStream;Z)V

    return-object v0
.end method

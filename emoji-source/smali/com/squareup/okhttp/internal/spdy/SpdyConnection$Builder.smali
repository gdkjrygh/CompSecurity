.class public Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
.super Ljava/lang/Object;
.source "SpdyConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private client:Z

.field private handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

.field private hostName:Ljava/lang/String;

.field private in:Ljava/io/InputStream;

.field private out:Ljava/io/OutputStream;

.field private variant:Lcom/squareup/okhttp/internal/spdy/Variant;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "hostName"    # Ljava/lang/String;
    .param p2, "client"    # Z
    .param p3, "in"    # Ljava/io/InputStream;
    .param p4, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 402
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 378
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;->REFUSE_INCOMING_STREAMS:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    .line 379
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Variant;->SPDY3:Lcom/squareup/okhttp/internal/spdy/Variant;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->variant:Lcom/squareup/okhttp/internal/spdy/Variant;

    .line 403
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->hostName:Ljava/lang/String;

    .line 404
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->client:Z

    .line 405
    iput-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->in:Ljava/io/InputStream;

    .line 406
    iput-object p4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->out:Ljava/io/OutputStream;

    .line 407
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/net/Socket;)V
    .locals 2
    .param p1, "hostName"    # Ljava/lang/String;
    .param p2, "client"    # Z
    .param p3, "socket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 395
    invoke-virtual {p3}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {p3}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;-><init>(Ljava/lang/String;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    .line 396
    return-void
.end method

.method public constructor <init>(ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "client"    # Z
    .param p2, "in"    # Ljava/io/InputStream;
    .param p3, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 387
    const-string v0, ""

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;-><init>(Ljava/lang/String;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    .line 388
    return-void
.end method

.method public constructor <init>(ZLjava/net/Socket;)V
    .locals 3
    .param p1, "client"    # Z
    .param p2, "socket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 383
    const-string v0, ""

    invoke-virtual {p2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {p2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;-><init>(Ljava/lang/String;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    .line 384
    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Lcom/squareup/okhttp/internal/spdy/Variant;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    .prologue
    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->variant:Lcom/squareup/okhttp/internal/spdy/Variant;

    return-object v0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Z
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    .prologue
    .line 374
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->client:Z

    return v0
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    .prologue
    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    return-object v0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Ljava/io/InputStream;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    .prologue
    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->in:Ljava/io/InputStream;

    return-object v0
.end method

.method static synthetic access$400(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Ljava/io/OutputStream;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    .prologue
    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->out:Ljava/io/OutputStream;

    return-object v0
.end method

.method static synthetic access$500(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    .prologue
    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->hostName:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .locals 2

    .prologue
    .line 425
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;-><init>(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;Lcom/squareup/okhttp/internal/spdy/SpdyConnection$1;)V

    return-object v0
.end method

.method public handler(Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
    .locals 0
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    .prologue
    .line 410
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    .line 411
    return-object p0
.end method

.method public http20Draft06()Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
    .locals 1

    .prologue
    .line 420
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Variant;->HTTP_20_DRAFT_06:Lcom/squareup/okhttp/internal/spdy/Variant;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->variant:Lcom/squareup/okhttp/internal/spdy/Variant;

    .line 421
    return-object p0
.end method

.method public spdy3()Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
    .locals 1

    .prologue
    .line 415
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Variant;->SPDY3:Lcom/squareup/okhttp/internal/spdy/Variant;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->variant:Lcom/squareup/okhttp/internal/spdy/Variant;

    .line 416
    return-object p0
.end method

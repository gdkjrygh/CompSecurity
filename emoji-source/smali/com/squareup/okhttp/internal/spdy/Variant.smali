.class interface abstract Lcom/squareup/okhttp/internal/spdy/Variant;
.super Ljava/lang/Object;
.source "Variant.java"


# static fields
.field public static final HTTP_20_DRAFT_06:Lcom/squareup/okhttp/internal/spdy/Variant;

.field public static final SPDY3:Lcom/squareup/okhttp/internal/spdy/Variant;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Spdy3;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/spdy/Spdy3;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Variant;->SPDY3:Lcom/squareup/okhttp/internal/spdy/Variant;

    .line 24
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Variant;->HTTP_20_DRAFT_06:Lcom/squareup/okhttp/internal/spdy/Variant;

    return-void
.end method


# virtual methods
.method public abstract newReader(Ljava/io/InputStream;Z)Lcom/squareup/okhttp/internal/spdy/FrameReader;
.end method

.method public abstract newWriter(Ljava/io/OutputStream;Z)Lcom/squareup/okhttp/internal/spdy/FrameWriter;
.end method

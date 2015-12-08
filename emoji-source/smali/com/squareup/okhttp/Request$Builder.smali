.class public Lcom/squareup/okhttp/Request$Builder;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private body:Lcom/squareup/okhttp/Request$Body;

.field private headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

.field private method:Ljava/lang/String;

.field private tag:Ljava/lang/Object;

.field private url:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    const-string v0, "GET"

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    .line 195
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    .line 200
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 201
    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 1
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    const-string v0, "GET"

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    .line 195
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    .line 204
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;

    .line 205
    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/Request$Builder;)Ljava/net/URL;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Request$Builder;

    .prologue
    .line 192
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->url:Ljava/net/URL;

    return-object v0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Request$Builder;

    .prologue
    .line 192
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Request$Builder;

    .prologue
    .line 192
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    return-object v0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request$Body;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Request$Builder;

    .prologue
    .line 192
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->body:Lcom/squareup/okhttp/Request$Body;

    return-object v0
.end method

.method static synthetic access$400(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Request$Builder;

    .prologue
    .line 192
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->tag:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 236
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    return-object p0
.end method

.method public build()Lcom/squareup/okhttp/Request;
    .locals 2

    .prologue
    .line 281
    new-instance v0, Lcom/squareup/okhttp/Request;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/Request;-><init>(Lcom/squareup/okhttp/Request$Builder;Lcom/squareup/okhttp/Request$1;)V

    return-object v0
.end method

.method public get()Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    .prologue
    .line 246
    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public head()Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    .prologue
    .line 250
    const-string v0, "HEAD"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 227
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    return-object p0
.end method

.method public method(Ljava/lang/String;Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;
    .locals 2
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "body"    # Lcom/squareup/okhttp/Request$Body;

    .prologue
    .line 262
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 263
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "method == null || method.length() == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_1
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    .line 266
    iput-object p2, p0, Lcom/squareup/okhttp/Request$Builder;->body:Lcom/squareup/okhttp/Request$Body;

    .line 267
    return-object p0
.end method

.method public post(Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1
    .param p1, "body"    # Lcom/squareup/okhttp/Request$Body;

    .prologue
    .line 254
    const-string v0, "POST"

    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public put(Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1
    .param p1, "body"    # Lcom/squareup/okhttp/Request$Body;

    .prologue
    .line 258
    const-string v0, "PUT"

    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/Request$Body;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method rawHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1
    .param p1, "rawHeaders"    # Lcom/squareup/okhttp/internal/http/RawHeaders;

    .prologue
    .line 241
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    .line 242
    return-object p0
.end method

.method public tag(Ljava/lang/Object;)Lcom/squareup/okhttp/Request$Builder;
    .locals 0
    .param p1, "tag"    # Ljava/lang/Object;

    .prologue
    .line 276
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->tag:Ljava/lang/Object;

    .line 277
    return-object p0
.end method

.method public url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 209
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/squareup/okhttp/Request$Builder;->url:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    return-object p0

    .line 211
    :catch_0
    move-exception v0

    .line 212
    .local v0, "e":Ljava/net/MalformedURLException;
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Malformed URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;
    .locals 2
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    .line 217
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_0
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->url:Ljava/net/URL;

    .line 219
    return-object p0
.end method

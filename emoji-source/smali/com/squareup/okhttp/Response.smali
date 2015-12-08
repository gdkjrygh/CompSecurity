.class final Lcom/squareup/okhttp/Response;
.super Ljava/lang/Object;
.source "Response.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/Response$Builder;,
        Lcom/squareup/okhttp/Response$Receiver;,
        Lcom/squareup/okhttp/Response$Body;
    }
.end annotation


# instance fields
.field private final body:Lcom/squareup/okhttp/Response$Body;

.field private final code:I

.field private final headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

.field private final redirectedBy:Lcom/squareup/okhttp/Response;

.field private final request:Lcom/squareup/okhttp/Request;


# direct methods
.method private constructor <init>(Lcom/squareup/okhttp/Response$Builder;)V
    .locals 2
    .param p1, "builder"    # Lcom/squareup/okhttp/Response$Builder;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    # getter for: Lcom/squareup/okhttp/Response$Builder;->request:Lcom/squareup/okhttp/Request;
    invoke-static {p1}, Lcom/squareup/okhttp/Response$Builder;->access$000(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Response;->request:Lcom/squareup/okhttp/Request;

    .line 48
    # getter for: Lcom/squareup/okhttp/Response$Builder;->code:I
    invoke-static {p1}, Lcom/squareup/okhttp/Response$Builder;->access$100(Lcom/squareup/okhttp/Response$Builder;)I

    move-result v0

    iput v0, p0, Lcom/squareup/okhttp/Response;->code:I

    .line 49
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    # getter for: Lcom/squareup/okhttp/Response$Builder;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;
    invoke-static {p1}, Lcom/squareup/okhttp/Response$Builder;->access$200(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    iput-object v0, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    .line 50
    # getter for: Lcom/squareup/okhttp/Response$Builder;->body:Lcom/squareup/okhttp/Response$Body;
    invoke-static {p1}, Lcom/squareup/okhttp/Response$Builder;->access$300(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Body;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Response;->body:Lcom/squareup/okhttp/Response$Body;

    .line 51
    # getter for: Lcom/squareup/okhttp/Response$Builder;->redirectedBy:Lcom/squareup/okhttp/Response;
    invoke-static {p1}, Lcom/squareup/okhttp/Response$Builder;->access$400(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Response;->redirectedBy:Lcom/squareup/okhttp/Response;

    .line 52
    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/Response$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/squareup/okhttp/Response$Builder;
    .param p2, "x1"    # Lcom/squareup/okhttp/Response$1;

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/Response;-><init>(Lcom/squareup/okhttp/Response$Builder;)V

    return-void
.end method


# virtual methods
.method public body()Lcom/squareup/okhttp/Response$Body;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->body:Lcom/squareup/okhttp/Response$Body;

    return-object v0
.end method

.method public code()I
    .locals 1

    .prologue
    .line 71
    iget v0, p0, Lcom/squareup/okhttp/Response;->code:I

    return v0
.end method

.method public header(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 75
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/String;

    .prologue
    .line 79
    iget-object v1, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v1, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    .local v0, "result":Ljava/lang/String;
    if-eqz v0, :cond_0

    .end local v0    # "result":Ljava/lang/String;
    :goto_0
    return-object v0

    .restart local v0    # "result":Ljava/lang/String;
    :cond_0
    move-object v0, p2

    goto :goto_0
.end method

.method public headerCount()I
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->length()I

    move-result v0

    return v0
.end method

.method public headerName(I)Ljava/lang/String;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 96
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public headerNames()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 88
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->names()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public headerValue(I)Ljava/lang/String;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 104
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getValue(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public headers(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 84
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->values(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method rawHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 2

    .prologue
    .line 100
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    iget-object v1, p0, Lcom/squareup/okhttp/Response;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    return-object v0
.end method

.method public redirectedBy()Lcom/squareup/okhttp/Response;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->redirectedBy:Lcom/squareup/okhttp/Response;

    return-object v0
.end method

.method public request()Lcom/squareup/okhttp/Request;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/squareup/okhttp/Response;->request:Lcom/squareup/okhttp/Request;

    return-object v0
.end method

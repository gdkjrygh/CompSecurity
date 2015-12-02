.class Lcom/facebook/http/a/a/a/e;
.super Ljava/io/OutputStream;
.source "HttpMultipart.java"


# instance fields
.field a:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 264
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/a/a/a/d;)V
    .locals 0

    .prologue
    .line 262
    invoke-direct {p0}, Lcom/facebook/http/a/a/a/e;-><init>()V

    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 1

    .prologue
    .line 278
    iget v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    .line 279
    return-void
.end method

.method public write([B)V
    .locals 2

    .prologue
    .line 273
    iget v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    array-length v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    .line 274
    return-void
.end method

.method public write([BII)V
    .locals 1

    .prologue
    .line 268
    iget v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/facebook/http/a/a/a/e;->a:I

    .line 269
    return-void
.end method

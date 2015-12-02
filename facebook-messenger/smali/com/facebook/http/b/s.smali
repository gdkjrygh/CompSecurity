.class Lcom/facebook/http/b/s;
.super Ljava/lang/Object;
.source "FbHttpClientImpl.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method static synthetic a(Lcom/facebook/http/b/s;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 284
    invoke-direct {p0, p1}, Lcom/facebook/http/b/s;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 305
    iget v0, p0, Lcom/facebook/http/b/s;->b:I

    iget-object v1, p0, Lcom/facebook/http/b/s;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 306
    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 298
    iget-object v0, p0, Lcom/facebook/http/b/s;->a:Ljava/lang/String;

    iget v1, p0, Lcom/facebook/http/b/s;->b:I

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/http/b/s;)Z
    .locals 1

    .prologue
    .line 284
    invoke-direct {p0}, Lcom/facebook/http/b/s;->a()Z

    move-result v0

    return v0
.end method

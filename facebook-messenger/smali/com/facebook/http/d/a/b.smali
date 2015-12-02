.class public Lcom/facebook/http/d/a/b;
.super Lcom/facebook/http/a/a/a/i;
.source "MultipartEntityWithProgressListener.java"


# instance fields
.field a:Lcom/facebook/http/d/a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/http/a/a/a/i;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/d/a/b;->a:Lcom/facebook/http/d/a/a;

    .line 30
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/http/d/a/a;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/http/d/a/b;->a:Lcom/facebook/http/d/a/a;

    .line 42
    return-void
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/http/d/a/b;->a:Lcom/facebook/http/d/a/a;

    if-eqz v0, :cond_0

    .line 35
    new-instance v0, Lcom/facebook/http/d/a/c;

    iget-object v1, p0, Lcom/facebook/http/d/a/b;->a:Lcom/facebook/http/d/a/a;

    invoke-direct {v0, p1, v1}, Lcom/facebook/http/d/a/c;-><init>(Ljava/io/OutputStream;Lcom/facebook/http/d/a/a;)V

    move-object p1, v0

    .line 37
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/http/a/a/a/i;->writeTo(Ljava/io/OutputStream;)V

    .line 38
    return-void
.end method

.class public Lcom/facebook/ui/images/cache/g;
.super Ljava/lang/Object;
.source "ImageCacheKey.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Lcom/facebook/ui/images/cache/f;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput v0, p0, Lcom/facebook/ui/images/cache/g;->a:I

    .line 107
    iput v0, p0, Lcom/facebook/ui/images/cache/g;->b:I

    .line 108
    sget-object v0, Lcom/facebook/ui/images/cache/e;->a:Lcom/facebook/ui/images/cache/f;

    iput-object v0, p0, Lcom/facebook/ui/images/cache/g;->c:Lcom/facebook/ui/images/cache/f;

    .line 112
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 115
    iget v0, p0, Lcom/facebook/ui/images/cache/g;->a:I

    return v0
.end method

.method public a(II)Lcom/facebook/ui/images/cache/g;
    .locals 0

    .prologue
    .line 135
    iput p1, p0, Lcom/facebook/ui/images/cache/g;->a:I

    .line 136
    iput p2, p0, Lcom/facebook/ui/images/cache/g;->b:I

    .line 137
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/cache/f;)Lcom/facebook/ui/images/cache/g;
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/ui/images/cache/g;->c:Lcom/facebook/ui/images/cache/f;

    .line 142
    return-object p0
.end method

.method public a(Z)Lcom/facebook/ui/images/cache/g;
    .locals 2

    .prologue
    const/4 v1, -0x1

    const/4 v0, -0x2

    .line 127
    if-eqz p1, :cond_0

    .line 128
    invoke-virtual {p0, v0, v0}, Lcom/facebook/ui/images/cache/g;->a(II)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    .line 130
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, v1, v1}, Lcom/facebook/ui/images/cache/g;->a(II)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    goto :goto_0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 119
    iget v0, p0, Lcom/facebook/ui/images/cache/g;->b:I

    return v0
.end method

.method public c()Lcom/facebook/ui/images/cache/f;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/ui/images/cache/g;->c:Lcom/facebook/ui/images/cache/f;

    return-object v0
.end method

.method public d()Lcom/facebook/ui/images/cache/e;
    .locals 1

    .prologue
    .line 146
    new-instance v0, Lcom/facebook/ui/images/cache/e;

    invoke-direct {v0, p0}, Lcom/facebook/ui/images/cache/e;-><init>(Lcom/facebook/ui/images/cache/g;)V

    return-object v0
.end method

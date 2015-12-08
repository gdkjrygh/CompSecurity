.class public final Lcom/roidapp/cloudlib/sns/g/f;
.super Lcom/roidapp/cloudlib/sns/g/d;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/cloudlib/sns/b/c;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:I

.field g:I

.field h:I

.field final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/roidapp/cloudlib/sns/g/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/high16 v1, -0x80000000

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/g/d;-><init>()V

    .line 14
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->b:Ljava/lang/String;

    .line 15
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->c:Ljava/lang/String;

    .line 16
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->d:Ljava/lang/String;

    .line 17
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->e:Ljava/lang/String;

    .line 18
    iput v1, p0, Lcom/roidapp/cloudlib/sns/g/f;->f:I

    .line 19
    iput v1, p0, Lcom/roidapp/cloudlib/sns/g/f;->g:I

    .line 20
    iput v1, p0, Lcom/roidapp/cloudlib/sns/g/f;->h:I

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->i:Ljava/util/Map;

    return-void
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/f;I)I
    .locals 1

    .prologue
    .line 28
    if-eqz p0, :cond_0

    iget v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->f:I

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/g/d;->a(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;
    .locals 1

    .prologue
    .line 24
    if-eqz p0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->a:Lcom/roidapp/cloudlib/sns/b/c;

    .line 1018
    if-nez v0, :cond_0

    move-object v0, p1

    .line 24
    :cond_0
    check-cast v0, Lcom/roidapp/cloudlib/sns/b/c;

    :goto_0
    return-object v0

    :cond_1
    move-object v0, p1

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    if-eqz p0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->e:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    if-eqz p0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/roidapp/cloudlib/sns/g/f;->b:Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;
    .locals 2

    .prologue
    .line 32
    if-eqz p0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->i:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/g/a;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    if-eqz p0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/roidapp/cloudlib/sns/g/f;->d:Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public static c(Lcom/roidapp/cloudlib/sns/g/f;I)I
    .locals 1

    .prologue
    .line 36
    if-eqz p0, :cond_0

    iget v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->g:I

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/g/d;->a(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public static d(Lcom/roidapp/cloudlib/sns/g/f;I)I
    .locals 1

    .prologue
    .line 40
    if-eqz p0, :cond_0

    iget v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->h:I

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/g/d;->a(II)I

    move-result p1

    :cond_0
    return p1
.end method

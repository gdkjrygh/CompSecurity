.class public final Lcom/roidapp/videolib/core/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/a/a/a;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/16 v1, 0x280

    const/16 v0, 0x1e0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object v2, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    .line 12
    iput v0, p0, Lcom/roidapp/videolib/core/g;->b:I

    .line 13
    iput v0, p0, Lcom/roidapp/videolib/core/g;->c:I

    .line 14
    iput-object v2, p0, Lcom/roidapp/videolib/core/g;->d:Ljava/lang/String;

    .line 17
    iput-object p1, p0, Lcom/roidapp/videolib/core/g;->d:Ljava/lang/String;

    .line 18
    iput v1, p0, Lcom/roidapp/videolib/core/g;->b:I

    .line 19
    iput v1, p0, Lcom/roidapp/videolib/core/g;->c:I

    .line 21
    iput-object p1, p0, Lcom/roidapp/videolib/core/g;->d:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 26
    const/16 v0, 0x9

    .line 56
    :cond_0
    :goto_0
    return v0

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    if-eqz v0, :cond_2

    .line 30
    const/4 v0, 0x1

    goto :goto_0

    .line 33
    :cond_2
    new-instance v0, Lcom/a/a/a;

    invoke-direct {v0}, Lcom/a/a/a;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    .line 35
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->a()I

    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    iget v1, p0, Lcom/roidapp/videolib/core/g;->b:I

    iget v2, p0, Lcom/roidapp/videolib/core/g;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a;->a(II)I

    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    iget-object v1, p0, Lcom/roidapp/videolib/core/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/a/a/a;->a(Ljava/lang/String;)I

    move-result v0

    .line 50
    if-eqz v0, :cond_0

    goto :goto_0
.end method

.method public final a([B)I
    .locals 3

    .prologue
    .line 71
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    if-nez v0, :cond_0

    .line 72
    const/16 v0, 0x9

    .line 75
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    iget v1, p0, Lcom/roidapp/videolib/core/g;->b:I

    iget v2, p0, Lcom/roidapp/videolib/core/g;->c:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/a/a/a;->a([BII)I

    move-result v0

    goto :goto_0
.end method

.method public final b()Lcom/a/a/a;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    return-object v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/a/a/a;->b(Z)V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/g;->a:Lcom/a/a/a;

    .line 68
    :cond_0
    return-void
.end method

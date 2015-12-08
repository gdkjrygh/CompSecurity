.class public final Lcom/roidapp/cloudlib/sns/g/a;
.super Lcom/roidapp/cloudlib/sns/g/d;
.source "SourceFile"


# instance fields
.field a:Z

.field b:Lcom/roidapp/cloudlib/sns/b/g;

.field c:I

.field d:I

.field e:Lcom/roidapp/cloudlib/sns/b/a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/high16 v0, -0x80000000

    .line 9
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/g/d;-><init>()V

    .line 12
    iput v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->c:I

    .line 13
    iput v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->e:Lcom/roidapp/cloudlib/sns/b/a/a;

    return-void
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/a;I)I
    .locals 1

    .prologue
    .line 23
    if-eqz p0, :cond_0

    iget v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->c:I

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/g/d;->a(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/a;Lcom/roidapp/cloudlib/sns/b/a/a;)Lcom/roidapp/cloudlib/sns/b/a/a;
    .locals 1

    .prologue
    .line 31
    if-eqz p0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->e:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 2018
    if-nez v0, :cond_0

    move-object v0, p1

    .line 31
    :cond_0
    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/a;

    :goto_0
    return-object v0

    :cond_1
    move-object v0, p1

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/a;Lcom/roidapp/cloudlib/sns/b/g;)Lcom/roidapp/cloudlib/sns/b/g;
    .locals 1

    .prologue
    .line 19
    if-eqz p0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->b:Lcom/roidapp/cloudlib/sns/b/g;

    .line 1018
    if-nez v0, :cond_0

    move-object v0, p1

    .line 19
    :cond_0
    check-cast v0, Lcom/roidapp/cloudlib/sns/b/g;

    :goto_0
    return-object v0

    :cond_1
    move-object v0, p1

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/g/a;)Z
    .locals 1

    .prologue
    .line 35
    if-eqz p0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/g/a;I)I
    .locals 1

    .prologue
    .line 27
    if-eqz p0, :cond_0

    iget v0, p0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/g/d;->a(II)I

    move-result p1

    :cond_0
    return p1
.end method

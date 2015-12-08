.class public final Lcom/roidapp/imagelib/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->a:I

    .line 28
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->b:I

    .line 29
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->c:I

    .line 30
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->d:I

    .line 31
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->e:I

    .line 32
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->f:I

    .line 36
    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->a:I

    .line 28
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->b:I

    .line 29
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->c:I

    .line 30
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->d:I

    .line 31
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->e:I

    .line 32
    iput v0, p0, Lcom/roidapp/imagelib/b/b;->f:I

    .line 47
    iput p1, p0, Lcom/roidapp/imagelib/b/b;->a:I

    .line 48
    iput p2, p0, Lcom/roidapp/imagelib/b/b;->b:I

    .line 49
    iput p3, p0, Lcom/roidapp/imagelib/b/b;->c:I

    .line 50
    iput p4, p0, Lcom/roidapp/imagelib/b/b;->d:I

    .line 51
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 77
    add-int/lit16 v0, p1, -0x96

    iput v0, p0, Lcom/roidapp/imagelib/b/b;->a:I

    .line 78
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lcom/roidapp/imagelib/b/b;->a:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/b/b;->b:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/b/b;->c:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/b/b;->d:I

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Lcom/roidapp/imagelib/b/b;
    .locals 2

    .prologue
    .line 55
    const/4 v1, 0x0

    .line 57
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/b/b;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :goto_0
    iget v1, p0, Lcom/roidapp/imagelib/b/b;->a:I

    iput v1, v0, Lcom/roidapp/imagelib/b/b;->a:I

    .line 63
    iget v1, p0, Lcom/roidapp/imagelib/b/b;->b:I

    iput v1, v0, Lcom/roidapp/imagelib/b/b;->b:I

    .line 64
    iget v1, p0, Lcom/roidapp/imagelib/b/b;->c:I

    iput v1, v0, Lcom/roidapp/imagelib/b/b;->c:I

    .line 65
    iget v1, p0, Lcom/roidapp/imagelib/b/b;->d:I

    iput v1, v0, Lcom/roidapp/imagelib/b/b;->d:I

    .line 66
    return-object v0

    .line 59
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->printStackTrace()V

    move-object v0, v1

    goto :goto_0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 88
    add-int/lit8 v0, p1, -0x64

    iput v0, p0, Lcom/roidapp/imagelib/b/b;->b:I

    .line 89
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 81
    iget v0, p0, Lcom/roidapp/imagelib/b/b;->a:I

    add-int/lit16 v0, v0, 0x96

    return v0
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 99
    add-int/lit8 v0, p1, -0x64

    iput v0, p0, Lcom/roidapp/imagelib/b/b;->c:I

    .line 100
    return-void
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/roidapp/imagelib/b/b;->b()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/roidapp/imagelib/b/b;->d:I

    add-int/lit16 v0, v0, 0xb4

    return v0
.end method

.method public final d(I)V
    .locals 1

    .prologue
    .line 110
    add-int/lit16 v0, p1, -0xb4

    iput v0, p0, Lcom/roidapp/imagelib/b/b;->d:I

    .line 111
    return-void
.end method

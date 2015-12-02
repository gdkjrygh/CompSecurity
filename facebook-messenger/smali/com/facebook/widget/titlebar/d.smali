.class public Lcom/facebook/widget/titlebar/d;
.super Ljava/lang/Object;
.source "TitleBarButtonSpec.java"


# instance fields
.field private final a:I

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Ljava/lang/String;

.field private final g:I

.field private final h:Ljava/lang/String;

.field private final i:I

.field private final j:Ljava/lang/String;

.field private k:Z


# direct methods
.method public constructor <init>(Lcom/facebook/widget/titlebar/e;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/titlebar/d;->a:I

    .line 26
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/titlebar/d;->b:Landroid/graphics/drawable/Drawable;

    .line 27
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->c:Z

    .line 28
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->d:Z

    .line 29
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->e:Z

    .line 30
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/titlebar/d;->f:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->g()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/titlebar/d;->g:I

    .line 32
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/titlebar/d;->h:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->i()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/titlebar/d;->i:I

    .line 34
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/e;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/titlebar/d;->j:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public static newBuilder()Lcom/facebook/widget/titlebar/e;
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lcom/facebook/widget/titlebar/e;

    invoke-direct {v0}, Lcom/facebook/widget/titlebar/e;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lcom/facebook/widget/titlebar/d;->a:I

    return v0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/facebook/widget/titlebar/d;->k:Z

    .line 63
    return-void
.end method

.method public b()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/widget/titlebar/d;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 50
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->c:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 58
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->k:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 66
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/d;->e:Z

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/widget/titlebar/d;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/widget/titlebar/d;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/facebook/widget/titlebar/d;->i:I

    return v0
.end method

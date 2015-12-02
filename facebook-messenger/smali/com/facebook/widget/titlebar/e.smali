.class public Lcom/facebook/widget/titlebar/e;
.super Ljava/lang/Object;
.source "TitleBarButtonSpecBuilder.java"


# instance fields
.field private a:I

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/titlebar/e;->i:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/facebook/widget/titlebar/e;->a:I

    return v0
.end method

.method public a(I)Lcom/facebook/widget/titlebar/e;
    .locals 0

    .prologue
    .line 28
    iput p1, p0, Lcom/facebook/widget/titlebar/e;->a:I

    .line 29
    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/widget/titlebar/e;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/widget/titlebar/e;->b:Landroid/graphics/drawable/Drawable;

    .line 38
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/widget/titlebar/e;->f:Ljava/lang/String;

    .line 74
    return-object p0
.end method

.method public b()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/widget/titlebar/e;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public b(I)Lcom/facebook/widget/titlebar/e;
    .locals 0

    .prologue
    .line 100
    iput p1, p0, Lcom/facebook/widget/titlebar/e;->h:I

    .line 101
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/widget/titlebar/e;->g:Ljava/lang/String;

    .line 92
    return-object p0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 42
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/e;->c:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/e;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/facebook/widget/titlebar/e;->e:Z

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/widget/titlebar/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 78
    iget v0, p0, Lcom/facebook/widget/titlebar/e;->i:I

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/widget/titlebar/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 96
    iget v0, p0, Lcom/facebook/widget/titlebar/e;->h:I

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/widget/titlebar/e;->j:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lcom/facebook/widget/titlebar/d;
    .locals 1

    .prologue
    .line 114
    new-instance v0, Lcom/facebook/widget/titlebar/d;

    invoke-direct {v0, p0}, Lcom/facebook/widget/titlebar/d;-><init>(Lcom/facebook/widget/titlebar/e;)V

    return-object v0
.end method

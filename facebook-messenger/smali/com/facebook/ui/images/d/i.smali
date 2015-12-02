.class public Lcom/facebook/ui/images/d/i;
.super Ljava/lang/Object;
.source "GraphicOpConstraintsBuilder.java"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Lcom/facebook/ui/images/d/b;

.field private f:Lcom/facebook/ui/images/d/f;

.field private g:Z

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/16 v0, 0x3c

    iput v0, p0, Lcom/facebook/ui/images/d/i;->a:I

    .line 11
    const/16 v0, 0x28

    iput v0, p0, Lcom/facebook/ui/images/d/i;->b:I

    .line 12
    const/16 v0, 0x78

    iput v0, p0, Lcom/facebook/ui/images/d/i;->c:I

    .line 13
    const/16 v0, 0x50

    iput v0, p0, Lcom/facebook/ui/images/d/i;->d:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/facebook/ui/images/d/i;->a:I

    return v0
.end method

.method public a(I)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 25
    iput p1, p0, Lcom/facebook/ui/images/d/i;->a:I

    .line 26
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/ui/images/d/i;->e:Lcom/facebook/ui/images/d/b;

    .line 63
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/d/f;)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/ui/images/d/i;->f:Lcom/facebook/ui/images/d/f;

    .line 73
    return-object p0
.end method

.method public a(Z)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 91
    iput-boolean p1, p0, Lcom/facebook/ui/images/d/i;->h:Z

    .line 92
    return-object p0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/facebook/ui/images/d/i;->b:I

    return v0
.end method

.method public b(I)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/facebook/ui/images/d/i;->b:I

    .line 35
    return-object p0
.end method

.method public b(Z)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 100
    iput-boolean p1, p0, Lcom/facebook/ui/images/d/i;->i:Z

    .line 101
    return-object p0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/facebook/ui/images/d/i;->c:I

    return v0
.end method

.method public c(I)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 43
    iput p1, p0, Lcom/facebook/ui/images/d/i;->c:I

    .line 44
    return-object p0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/facebook/ui/images/d/i;->d:I

    return v0
.end method

.method public d(I)Lcom/facebook/ui/images/d/i;
    .locals 0

    .prologue
    .line 52
    iput p1, p0, Lcom/facebook/ui/images/d/i;->d:I

    .line 53
    return-object p0
.end method

.method public e()Lcom/facebook/ui/images/d/b;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/ui/images/d/i;->e:Lcom/facebook/ui/images/d/b;

    return-object v0
.end method

.method public f()Lcom/facebook/ui/images/d/f;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/ui/images/d/i;->f:Lcom/facebook/ui/images/d/f;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/i;->g:Z

    return v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 86
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/i;->h:Z

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 96
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/i;->i:Z

    return v0
.end method

.method public j()Lcom/facebook/ui/images/d/h;
    .locals 1

    .prologue
    .line 105
    new-instance v0, Lcom/facebook/ui/images/d/h;

    invoke-direct {v0, p0}, Lcom/facebook/ui/images/d/h;-><init>(Lcom/facebook/ui/images/d/i;)V

    return-object v0
.end method

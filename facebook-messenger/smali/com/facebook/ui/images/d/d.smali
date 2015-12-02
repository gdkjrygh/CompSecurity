.class public Lcom/facebook/ui/images/d/d;
.super Ljava/lang/Object;
.source "CropRegionConstraintsBuilder.java"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:I

.field private e:I

.field private f:Lcom/facebook/ui/images/d/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/16 v2, 0x3c

    const v1, 0x3e19999a    # 0.15f

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/facebook/ui/images/d/d;->a:F

    .line 11
    iput v1, p0, Lcom/facebook/ui/images/d/d;->b:F

    .line 12
    iput v1, p0, Lcom/facebook/ui/images/d/d;->c:F

    .line 13
    iput v2, p0, Lcom/facebook/ui/images/d/d;->d:I

    .line 14
    iput v2, p0, Lcom/facebook/ui/images/d/d;->e:I

    .line 15
    sget-object v0, Lcom/facebook/ui/images/d/c;->DEFAULT:Lcom/facebook/ui/images/d/c;

    iput-object v0, p0, Lcom/facebook/ui/images/d/d;->f:Lcom/facebook/ui/images/d/c;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .prologue
    .line 18
    iget v0, p0, Lcom/facebook/ui/images/d/d;->a:F

    return v0
.end method

.method public a(F)Lcom/facebook/ui/images/d/d;
    .locals 0

    .prologue
    .line 22
    iput p1, p0, Lcom/facebook/ui/images/d/d;->a:F

    .line 23
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/d/c;)Lcom/facebook/ui/images/d/d;
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/facebook/ui/images/d/d;->f:Lcom/facebook/ui/images/d/c;

    .line 50
    return-object p0
.end method

.method public b()F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/facebook/ui/images/d/d;->b:F

    return v0
.end method

.method public b(F)Lcom/facebook/ui/images/d/d;
    .locals 0

    .prologue
    .line 31
    iput p1, p0, Lcom/facebook/ui/images/d/d;->b:F

    .line 32
    return-object p0
.end method

.method public c()F
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/ui/images/d/d;->c:F

    return v0
.end method

.method public c(F)Lcom/facebook/ui/images/d/d;
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lcom/facebook/ui/images/d/d;->c:F

    .line 41
    return-object p0
.end method

.method public d()Lcom/facebook/ui/images/d/c;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/ui/images/d/d;->f:Lcom/facebook/ui/images/d/c;

    return-object v0
.end method

.method public e()Lcom/facebook/ui/images/d/b;
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/ui/images/d/b;

    invoke-direct {v0, p0}, Lcom/facebook/ui/images/d/b;-><init>(Lcom/facebook/ui/images/d/d;)V

    return-object v0
.end method

.class public Lcom/facebook/ads/g;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/graphics/Typeface;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const v1, -0xbd8719

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/facebook/ads/g;->a:Landroid/graphics/Typeface;

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/ads/g;->b:I

    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/facebook/ads/g;->c:I

    const v0, -0xb1a99b

    iput v0, p0, Lcom/facebook/ads/g;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/ads/g;->e:I

    iput v1, p0, Lcom/facebook/ads/g;->f:I

    iput v1, p0, Lcom/facebook/ads/g;->g:I

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/g;->a:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public a(I)Lcom/facebook/ads/g;
    .locals 0

    iput p1, p0, Lcom/facebook/ads/g;->e:I

    return-object p0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/g;->b:I

    return v0
.end method

.method public b(I)Lcom/facebook/ads/g;
    .locals 0

    iput p1, p0, Lcom/facebook/ads/g;->f:I

    return-object p0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/g;->c:I

    return v0
.end method

.method public c(I)Lcom/facebook/ads/g;
    .locals 0

    iput p1, p0, Lcom/facebook/ads/g;->g:I

    return-object p0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/g;->d:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/g;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/g;->f:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/g;->g:I

    return v0
.end method

.method public h()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public i()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.class final Lcom/qihoo/security/v7/MaterialMenuDrawable$a;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v7/MaterialMenuDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

.field private b:I


# direct methods
.method private constructor <init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;)V
    .locals 0

    .prologue
    .line 873
    iput-object p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 874
    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Lcom/qihoo/security/v7/MaterialMenuDrawable$1;)V
    .locals 0

    .prologue
    .line 870
    invoke-direct {p0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v7/MaterialMenuDrawable$a;I)I
    .locals 0

    .prologue
    .line 870
    iput p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->b:I

    return p1
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    .prologue
    .line 888
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->b:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 15

    .prologue
    .line 878
    new-instance v1, Lcom/qihoo/security/v7/MaterialMenuDrawable;

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    move-result-object v3

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->m()J

    move-result-wide v4

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->m()J

    move-result-wide v6

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f(Lcom/qihoo/security/v7/MaterialMenuDrawable;)I

    move-result v8

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g(Lcom/qihoo/security/v7/MaterialMenuDrawable;)I

    move-result v9

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F

    move-result v10

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F

    move-result v11

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->j(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F

    move-result v12

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->k(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F

    move-result v13

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v14}, Lcom/qihoo/security/v7/MaterialMenuDrawable;-><init>(ILcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;JJIIFFFFLcom/qihoo/security/v7/MaterialMenuDrawable$1;)V

    .line 881
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 882
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Z)V

    .line 883
    return-object v1

    .line 881
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v0

    goto :goto_0
.end method

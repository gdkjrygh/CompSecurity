.class Lcom/qihoo/security/widget/shadow/d$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/shadow/d;->b(Lcom/qihoo/security/widget/shadow/ZDepth;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/shadow/d;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/shadow/d;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 7

    .prologue
    .line 255
    const-string/jumbo v0, "alphaTopShadow"

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/a/o;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 256
    const-string/jumbo v0, "alphaBottomShadow"

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/a/o;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 257
    const-string/jumbo v0, "offsetTopShadow"

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/a/o;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 258
    const-string/jumbo v0, "offsetBottomShadow"

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/a/o;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 259
    const-string/jumbo v0, "blurTopShadow"

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/a/o;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    .line 260
    const-string/jumbo v0, "blurBottomShadow"

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/a/o;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 262
    iget-object v6, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v6, v6, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v1, v6, Lcom/qihoo/security/widget/shadow/e;->a:I

    .line 263
    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v1, v1, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v2, v1, Lcom/qihoo/security/widget/shadow/e;->b:I

    .line 264
    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v1, v1, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v3, v1, Lcom/qihoo/security/widget/shadow/e;->c:F

    .line 265
    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v1, v1, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v4, v1, Lcom/qihoo/security/widget/shadow/e;->d:F

    .line 266
    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v1, v1, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v5, v1, Lcom/qihoo/security/widget/shadow/e;->e:F

    .line 267
    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v1, v1, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v0, v1, Lcom/qihoo/security/widget/shadow/e;->f:F

    .line 269
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v0, v0, Lcom/qihoo/security/widget/shadow/d;->a:Lcom/qihoo/security/widget/shadow/a;

    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-object v1, v1, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget-object v2, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v2, v2, Lcom/qihoo/security/widget/shadow/d;->c:I

    iget-object v3, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v3, v3, Lcom/qihoo/security/widget/shadow/d;->d:I

    iget-object v4, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v4}, Lcom/qihoo/security/widget/shadow/d;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v5, v5, Lcom/qihoo/security/widget/shadow/d;->e:I

    sub-int/2addr v4, v5

    iget-object v5, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v5}, Lcom/qihoo/security/widget/shadow/d;->getHeight()I

    move-result v5

    iget-object v6, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v6, v6, Lcom/qihoo/security/widget/shadow/d;->f:I

    sub-int/2addr v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/widget/shadow/a;->a(Lcom/qihoo/security/widget/shadow/e;IIII)V

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/d$1;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/shadow/d;->invalidate()V

    .line 273
    return-void
.end method

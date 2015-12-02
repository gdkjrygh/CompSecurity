.class public Lcom/qihoo/security/widget/shadow/e;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:I

.field public b:I

.field public c:F

.field public d:F

.field public e:F

.field public f:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/qihoo/security/widget/shadow/ZDepth;)V
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p2}, Lcom/qihoo/security/widget/shadow/ZDepth;->getAlphaTopShadow()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/e;->a:I

    .line 19
    invoke-virtual {p2}, Lcom/qihoo/security/widget/shadow/ZDepth;->getAlphaBottomShadow()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/e;->b:I

    .line 20
    invoke-virtual {p2, p1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getOffsetYTopShadowPx(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/e;->c:F

    .line 21
    invoke-virtual {p2, p1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getOffsetYBottomShadowPx(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/e;->d:F

    .line 22
    invoke-virtual {p2, p1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getBlurTopShadowPx(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/e;->e:F

    .line 23
    invoke-virtual {p2, p1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getBlurBottomShadowPx(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/e;->f:F

    .line 24
    return-void
.end method

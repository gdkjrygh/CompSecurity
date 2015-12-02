.class public Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;
.super Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;
.source "360Security"


# instance fields
.field b:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:J

.field private h:Lcom/qihoo/security/widget/ImageView/a;

.field private i:I

.field private j:F

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    iput-boolean v2, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->b:Z

    .line 20
    const-wide/16 v0, 0xdac

    iput-wide v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->g:J

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    .line 22
    iput v2, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->i:I

    .line 39
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;I)I
    .locals 0

    .prologue
    .line 13
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->i:I

    return p1
.end method


# virtual methods
.method public a(J)V
    .locals 5

    .prologue
    .line 94
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Lcom/qihoo/security/widget/ImageView/a;

    invoke-direct {v0}, Lcom/qihoo/security/widget/ImageView/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    iget v1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->d:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/a;->b(I)V

    .line 98
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    iget v1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->e:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/a;->c(I)V

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    iget v1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->f:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/a;->a(I)V

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    iget v1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->j:F

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/a;->a(F)V

    .line 101
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v0

    .line 102
    iget-wide v2, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->g:J

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 103
    invoke-virtual {v0, p1, p2}, Lcom/nineoldandroids/a/o;->a(J)V

    .line 104
    new-instance v1, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$1;-><init>(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 113
    new-instance v1, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;-><init>(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 130
    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 131
    return-void

    .line 101
    nop

    :array_0
    .array-data 4
        0x0
        0xff
        0x32
        0xff
        0x32
        0x0
    .end array-data
.end method

.method public b(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 33
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;->b(Ljava/lang/String;I)V

    .line 34
    iput-object p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->k:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 79
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;->draw(Landroid/graphics/Canvas;)V

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    if-eqz v0, :cond_1

    .line 81
    iget-boolean v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->l:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/ImageView/a;->a()Landroid/graphics/Canvas;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/ImageView/a;->a()Landroid/graphics/Canvas;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;->draw(Landroid/graphics/Canvas;)V

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    iget v1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->i:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/a;->setLevel(I)Z

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/ImageView/a;->draw(Landroid/graphics/Canvas;)V

    .line 91
    :cond_1
    :goto_0
    return-void

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->h:Lcom/qihoo/security/widget/ImageView/a;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/ImageView/a;->c()V

    goto :goto_0
.end method

.method public getBlurWidth()F
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->j:F

    return v0
.end method

.method public getShadowColor()I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->f:I

    return v0
.end method

.method public getShadowHeight()I
    .locals 1

    .prologue
    .line 58
    iget v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->e:I

    return v0
.end method

.method public getShadowWidth()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->d:I

    return v0
.end method

.method public setAnimateTime(J)V
    .locals 1

    .prologue
    .line 74
    iput-wide p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->g:J

    .line 75
    return-void
.end method

.method public setBlurWidth(F)V
    .locals 0

    .prologue
    .line 46
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->j:F

    .line 47
    return-void
.end method

.method public setFlashPkg(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->l:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public setShadowColor(I)V
    .locals 0

    .prologue
    .line 70
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->f:I

    .line 71
    return-void
.end method

.method public setShadowHeight(I)V
    .locals 0

    .prologue
    .line 62
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->e:I

    .line 63
    return-void
.end method

.method public setShadowWidth(I)V
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->d:I

    .line 55
    return-void
.end method

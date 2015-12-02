.class public Lcom/qihoo/security/dialog/h;
.super Landroid/app/Dialog;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/e;


# instance fields
.field public a:Lcom/qihoo/security/locale/d;

.field private b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:[Landroid/widget/ImageView;

.field private j:Lcom/qihoo/security/dialog/e;

.field private k:Landroid/content/Context;

.field private l:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 34
    const v0, 0x7f0d00f5

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 28
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->a:Lcom/qihoo/security/locale/d;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->j:Lcom/qihoo/security/dialog/e;

    .line 35
    iput-object p1, p0, Lcom/qihoo/security/dialog/h;->k:Landroid/content/Context;

    .line 36
    invoke-virtual {p0, p1}, Lcom/qihoo/security/dialog/h;->a(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/dialog/h;)[Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->i:[Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->i:[Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->i:[Landroid/widget/ImageView;

    array-length v0, v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    .line 152
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->i:[Landroid/widget/ImageView;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Lcom/qihoo/security/dialog/h$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/dialog/h$1;-><init>(Lcom/qihoo/security/dialog/h;)V

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/dialog/h;->a(Landroid/widget/ImageView;Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 47
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03006b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b0100

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/e;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->j:Lcom/qihoo/security/dialog/e;

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b015c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b015d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b015e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->d:Landroid/widget/ImageView;

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b015f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->e:Landroid/widget/ImageView;

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b0160

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->f:Landroid/widget/ImageView;

    .line 54
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b0161

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->g:Landroid/widget/ImageView;

    .line 55
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    const v1, 0x7f0b0162

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->h:Landroid/widget/ImageView;

    .line 56
    const/4 v0, 0x5

    new-array v0, v0, [Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/dialog/h;->d:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/dialog/h;->e:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/dialog/h;->f:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/qihoo/security/dialog/h;->g:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/qihoo/security/dialog/h;->h:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    .line 57
    iput-object v0, p0, Lcom/qihoo/security/dialog/h;->i:[Landroid/widget/ImageView;

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/h;->setContentView(Landroid/view/View;)V

    .line 59
    return-void
.end method

.method public a(Landroid/widget/ImageView;Landroid/view/animation/Animation$AnimationListener;)V
    .locals 9

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    const/4 v5, 0x1

    .line 155
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v3, v1

    move v4, v2

    move v7, v5

    move v8, v6

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 157
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 158
    invoke-virtual {v0, v5}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 159
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 160
    invoke-virtual {v0, p2}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 161
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 162
    invoke-virtual {v0}, Landroid/view/animation/ScaleAnimation;->start()V

    .line 163
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 169
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 175
    :cond_0
    return-void
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->j:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0}, Lcom/qihoo/security/dialog/e;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 4

    .prologue
    .line 63
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 65
    iget-object v1, p0, Lcom/qihoo/security/dialog/h;->k:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/dialog/h;->k:Landroid/content/Context;

    const/high16 v3, 0x42700000    # 60.0f

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 66
    iget-object v1, p0, Lcom/qihoo/security/dialog/h;->l:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    return-void
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->j:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 185
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->j:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonText([I)V

    .line 180
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/qihoo/security/dialog/h;->j:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonText([Ljava/lang/CharSequence;)V

    .line 191
    return-void
.end method

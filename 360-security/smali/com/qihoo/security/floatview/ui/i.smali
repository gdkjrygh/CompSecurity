.class public Lcom/qihoo/security/floatview/ui/i;
.super Landroid/widget/LinearLayout;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final d:Landroid/view/View;

.field private final e:Landroid/view/View;

.field private final f:Landroid/widget/ImageView;

.field private final g:Landroid/widget/ImageView;

.field private final h:I

.field private final i:I

.field private final j:Landroid/view/animation/Animation;

.field private k:Landroid/view/animation/Animation;

.field private l:I

.field private final m:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/floatview/ui/i;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    .prologue
    .line 39
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->k:Landroid/view/animation/Animation;

    .line 206
    new-instance v0, Lcom/qihoo/security/floatview/ui/i$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/ui/i$1;-><init>(Lcom/qihoo/security/floatview/ui/i;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->m:Landroid/os/Handler;

    .line 43
    const v0, 0x7f030050

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 44
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->setGravity(I)V

    .line 45
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->setOrientation(I)V

    .line 47
    const v0, 0x7f0b0114

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    .line 48
    const v0, 0x7f0b0115

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 49
    const v0, 0x7f0b0116

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 50
    const v0, 0x7f0b0117

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    .line 51
    const v0, 0x7f0b0113

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    .line 52
    const v0, 0x7f0b0118

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->g:Landroid/widget/ImageView;

    .line 53
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/i;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080033

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/i;->h:I

    .line 54
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/i;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080032

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/i;->i:I

    .line 55
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->j:Landroid/view/animation/Animation;

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->j:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->j:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 58
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->k:Landroid/view/animation/Animation;

    .line 59
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->k:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->k:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 66
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->j:Landroid/view/animation/Animation;

    invoke-virtual {v0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 68
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/i;->b()V

    .line 69
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/i;->a()V

    .line 70
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/i;->k:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/i;->j:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 77
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 127
    int-to-float v0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->a(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/i;->h:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 129
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/i;->h:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    const v1, 0x7f020082

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    const v1, 0x7f020080

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 139
    :goto_0
    return-void

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/i;->i:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/i;->i:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    const v1, 0x7f020081

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    const v1, 0x7f02007f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 86
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 95
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->g:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 147
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 153
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->setMemoryAlpha(F)V

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 155
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 158
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->g:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 160
    return-void
.end method

.method public g()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 220
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/i;->setMemoryAlpha(F)V

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->m:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 222
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->m:Landroid/os/Handler;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 223
    return-void
.end method

.method public getWidthOnSide()I
    .locals 1

    .prologue
    .line 183
    iget v0, p0, Lcom/qihoo/security/floatview/ui/i;->l:I

    return v0
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->f:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 194
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 199
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 188
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 174
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V

    .line 176
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/i;->l:I

    .line 179
    :cond_0
    return-void
.end method

.method public setFocus(Z)V
    .locals 0

    .prologue
    .line 168
    return-void
.end method

.method public setMemoryAlpha(F)V
    .locals 1

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/i;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 231
    invoke-static {p0, p1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 233
    :cond_0
    return-void
.end method

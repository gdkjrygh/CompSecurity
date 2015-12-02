.class public Lcom/qihoo/security/alasticbutton/ElasticImageButton;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;
    }
.end annotation


# static fields
.field static final a:Landroid/view/animation/LinearInterpolator;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:J

.field private final d:J

.field private e:Landroid/view/LayoutInflater;

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/widget/FrameLayout;

.field private i:Landroid/view/animation/ScaleAnimation;

.field private j:Landroid/view/animation/ScaleAnimation;

.field private k:Z

.field private l:J

.field private m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a:Landroid/view/animation/LinearInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 101
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    iput-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->c:J

    .line 25
    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->d:J

    .line 32
    iput-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->l:J

    .line 102
    iput-object p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b:Landroid/content/Context;

    .line 103
    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->d()V

    .line 104
    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->c()V

    .line 105
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 108
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    iput-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->c:J

    .line 25
    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->d:J

    .line 32
    iput-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->l:J

    .line 109
    iput-object p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b:Landroid/content/Context;

    .line 110
    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->d()V

    .line 111
    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->c()V

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 115
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    iput-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->c:J

    .line 25
    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->d:J

    .line 32
    iput-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->l:J

    .line 116
    iput-object p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b:Landroid/content/Context;

    .line 117
    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->d()V

    .line 118
    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->c()V

    .line 119
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/alasticbutton/ElasticImageButton;)Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/alasticbutton/ElasticImageButton;Z)Z
    .locals 0

    .prologue
    .line 21
    iput-boolean p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    return p1
.end method

.method private c()V
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->e:Landroid/view/LayoutInflater;

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->e:Landroid/view/LayoutInflater;

    const v1, 0x7f03006a

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    const v1, 0x7f0b015b

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->f:Landroid/view/View;

    .line 125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    .line 126
    return-void
.end method

.method private d()V
    .locals 9

    .prologue
    .line 129
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

    iput-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->i:Landroid/view/animation/ScaleAnimation;

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->i:Landroid/view/animation/ScaleAnimation;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->i:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, p0}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 133
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

    iput-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->j:Landroid/view/animation/ScaleAnimation;

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->j:Landroid/view/animation/ScaleAnimation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->j:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, p0}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 137
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    .line 94
    return-void
.end method

.method public a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 224
    if-eqz p1, :cond_1

    .line 225
    iget-boolean v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    if-nez v0, :cond_0

    .line 233
    :goto_0
    return-void

    .line 228
    :cond_0
    iput-boolean v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    .line 229
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->i:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public b()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    const-wide/16 v6, 0x0

    const/4 v5, 0x2

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->l:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x5dc

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 218
    :cond_0
    :goto_0
    return-void

    .line 152
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->l:J

    .line 153
    iget-boolean v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    if-eqz v0, :cond_0

    .line 156
    iput-boolean v8, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    .line 157
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    if-eqz v0, :cond_2

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    invoke-interface {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;->a()V

    .line 162
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->f:Landroid/view/View;

    const-string/jumbo v1, "scaleX"

    new-array v2, v5, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 163
    invoke-virtual {v0, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 164
    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->f:Landroid/view/View;

    const-string/jumbo v2, "scaleY"

    new-array v3, v5, [F

    fill-array-data v3, :array_1

    invoke-static {v1, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 165
    invoke-virtual {v1, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 166
    new-instance v2, Lcom/nineoldandroids/a/c;

    invoke-direct {v2}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 167
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/c;->a(Landroid/view/animation/Interpolator;)V

    .line 168
    new-array v3, v5, [Lcom/nineoldandroids/a/a;

    aput-object v0, v3, v8

    aput-object v1, v3, v9

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/c;->a([Lcom/nineoldandroids/a/a;)V

    .line 181
    const/4 v0, 0x0

    .line 182
    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    if-eqz v1, :cond_3

    .line 185
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    const-string/jumbo v1, "scaleX"

    new-array v3, v5, [F

    fill-array-data v3, :array_2

    invoke-static {v0, v1, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 186
    invoke-virtual {v1, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 187
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    const-string/jumbo v3, "scaleY"

    new-array v4, v5, [F

    fill-array-data v4, :array_3

    invoke-static {v0, v3, v4}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v3

    .line 188
    invoke-virtual {v3, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 189
    new-instance v0, Lcom/nineoldandroids/a/c;

    invoke-direct {v0}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 190
    new-instance v4, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v4}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v4}, Lcom/nineoldandroids/a/c;->a(Landroid/view/animation/Interpolator;)V

    .line 191
    new-array v4, v5, [Lcom/nineoldandroids/a/a;

    aput-object v1, v4, v8

    aput-object v3, v4, v9

    invoke-virtual {v0, v4}, Lcom/nineoldandroids/a/c;->a([Lcom/nineoldandroids/a/a;)V

    .line 194
    :cond_3
    new-instance v1, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;-><init>(Lcom/qihoo/security/alasticbutton/ElasticImageButton;)V

    invoke-virtual {v2, v1}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 213
    invoke-virtual {v2}, Lcom/nineoldandroids/a/c;->a()V

    .line 215
    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    goto/16 :goto_0

    .line 162
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 164
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 185
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 187
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b(Z)V
    .locals 2

    .prologue
    .line 294
    if-eqz p1, :cond_1

    .line 295
    iget-boolean v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    if-nez v0, :cond_0

    .line 305
    :goto_0
    return-void

    .line 298
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    .line 300
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->j:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 302
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 303
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->clearAnimation()V

    goto :goto_0
.end method

.method public getTopView()Landroid/view/View;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    return-object v0
.end method

.method public invalidate()V
    .locals 0

    .prologue
    .line 141
    invoke-super {p0}, Landroid/widget/FrameLayout;->invalidate()V

    .line 142
    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 258
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->i:Landroid/view/animation/ScaleAnimation;

    if-ne p1, v0, :cond_2

    .line 259
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    invoke-interface {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;->d()V

    .line 263
    :cond_0
    iput-boolean v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    .line 291
    :cond_1
    :goto_0
    return-void

    .line 281
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->j:Landroid/view/animation/ScaleAnimation;

    if-ne p1, v0, :cond_1

    .line 282
    invoke-static {v1}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 283
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    if-eqz v0, :cond_3

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    invoke-interface {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;->f()V

    .line 286
    :cond_3
    iput-boolean v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->k:Z

    .line 288
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 289
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->clearAnimation()V

    goto :goto_0
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 254
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 237
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->i:Landroid/view/animation/ScaleAnimation;

    if-ne p1, v0, :cond_2

    .line 238
    const/4 v0, 0x2

    invoke-static {v0, p0}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    invoke-interface {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;->c()V

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 250
    :cond_1
    :goto_0
    return-void

    .line 243
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->j:Landroid/view/animation/ScaleAnimation;

    if-ne p1, v0, :cond_1

    .line 244
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    if-eqz v0, :cond_1

    .line 246
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    invoke-interface {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;->e()V

    goto :goto_0
.end method

.method public setButtonAnimatorListener(Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->m:Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    .line 39
    return-void
.end method

.method public setTopView(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 77
    iput-object p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    .line 78
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 80
    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 81
    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 83
    return-void
.end method

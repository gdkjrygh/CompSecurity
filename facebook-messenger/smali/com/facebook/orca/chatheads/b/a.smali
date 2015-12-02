.class public Lcom/facebook/orca/chatheads/b/a;
.super Lcom/facebook/widget/d;
.source "ChatHeadNuxBubbleView.java"


# static fields
.field private static final a:Lcom/facebook/n/g;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I


# instance fields
.field private final f:Landroid/widget/TextView;

.field private final g:Landroid/view/View;

.field private final h:Landroid/os/Handler;

.field private final i:Lcom/facebook/n/j;

.field private j:Lcom/facebook/orca/chatheads/b/e;

.field private k:Z

.field private l:Lcom/facebook/n/c;

.field private m:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/facebook/orca/chatheads/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 38
    const-wide v0, 0x4062c00000000000L    # 150.0

    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/b/a;->a:Lcom/facebook/n/g;

    .line 44
    sget v0, Lcom/facebook/h;->orca_chat_head_nux_bubble_left:I

    sput v0, Lcom/facebook/orca/chatheads/b/a;->b:I

    .line 45
    sget v0, Lcom/facebook/h;->orca_chat_head_nux_bubble_right:I

    sput v0, Lcom/facebook/orca/chatheads/b/a;->c:I

    .line 46
    sget v0, Lcom/facebook/h;->orca_chat_head_nux_bubble_bottom:I

    sput v0, Lcom/facebook/orca/chatheads/b/a;->d:I

    .line 47
    sget v0, Lcom/facebook/h;->orca_chat_head_nux_bubble:I

    sput v0, Lcom/facebook/orca/chatheads/b/a;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const-wide v3, 0x3f747ae140000000L    # 0.004999999888241291

    const/4 v2, 0x0

    .line 66
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 55
    iput-boolean v5, p0, Lcom/facebook/orca/chatheads/b/a;->k:Z

    .line 67
    sget v0, Lcom/facebook/k;->chat_head_nux_bubble:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/a;->setContentView(I)V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/a;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/n/j;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->i:Lcom/facebook/n/j;

    .line 70
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/a;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->h:Landroid/os/Handler;

    .line 71
    sget v0, Lcom/facebook/i;->chat_head_text_bubble_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/a;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    .line 72
    sget v0, Lcom/facebook/i;->chat_head_text_bubble_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/a;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->f:Landroid/widget/TextView;

    .line 73
    sget-object v0, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/a;->setOrigin(Lcom/facebook/orca/chatheads/b/e;)V

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/a;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    invoke-static {v0, v2}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    invoke-static {v0, v2}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 78
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    invoke-static {v0, v2}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->i:Lcom/facebook/n/j;

    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/chatheads/b/a;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/b/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/b/c;-><init>(Lcom/facebook/orca/chatheads/b/a;Lcom/facebook/orca/chatheads/b/b;)V

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->l:Lcom/facebook/n/c;

    .line 86
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/b/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/b/a;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/a;->m:Lcom/google/common/d/a/ab;

    return-object p1
.end method

.method private a(F)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->l:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    .line 148
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 153
    :goto_0
    return-object v0

    .line 151
    :cond_0
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->m:Lcom/google/common/d/a/ab;

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->l:Lcom/facebook/n/c;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->m:Lcom/google/common/d/a/ab;

    goto :goto_0
.end method

.method static synthetic a(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 24
    invoke-static {p0, p1}, Lcom/facebook/orca/chatheads/b/a;->b(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/b/a;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->m:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private static b(Landroid/view/View;Z)V
    .locals 2

    .prologue
    .line 228
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 229
    invoke-virtual {p0, p1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 231
    :cond_0
    return-void
.end method

.method private getAtRestFuture()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->m:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->m:Lcom/google/common/d/a/ab;

    .line 218
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 157
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/b/a;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 143
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/b/a;->k:Z

    .line 144
    return-void
.end method

.method public b()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 161
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/b/a;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public getOrigin()Lcom/facebook/orca/chatheads/b/e;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    .line 170
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/widget/d;->onSizeChanged(IIII)V

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->RIGHT:Lcom/facebook/orca/chatheads/b/e;

    if-ne v0, v1, :cond_2

    .line 173
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    int-to-float v1, p1

    invoke-static {v0, v1}, Lcom/a/c/a;->b(Landroid/view/View;F)V

    .line 174
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    div-int/lit8 v1, p2, 0x2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->c(Landroid/view/View;F)V

    .line 183
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->n:Lcom/facebook/orca/chatheads/b/d;

    if-eqz v0, :cond_1

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->n:Lcom/facebook/orca/chatheads/b/d;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/orca/chatheads/b/d;->a(IIII)V

    .line 186
    :cond_1
    return-void

    .line 175
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    if-ne v0, v1, :cond_3

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/a/c/a;->b(Landroid/view/View;F)V

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    div-int/lit8 v1, p2, 0x2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->c(Landroid/view/View;F)V

    goto :goto_0

    .line 178
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->BOTTOM:Lcom/facebook/orca/chatheads/b/e;

    if-ne v0, v1, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    div-int/lit8 v1, p1, 0x2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->b(Landroid/view/View;F)V

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    int-to-float v1, p2

    invoke-static {v0, v1}, Lcom/a/c/a;->c(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public setContentGravitiy(I)V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 90
    return-void
.end method

.method public setOnSizeChangedListener(Lcom/facebook/orca/chatheads/b/d;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/a;->n:Lcom/facebook/orca/chatheads/b/d;

    .line 166
    return-void
.end method

.method public setOrigin(Lcom/facebook/orca/chatheads/b/e;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 97
    const/4 v1, 0x0

    .line 99
    iget-object v2, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    if-eq v2, p1, :cond_0

    .line 100
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    .line 102
    iget-boolean v2, p0, Lcom/facebook/orca/chatheads/b/a;->k:Z

    if-eqz v2, :cond_2

    .line 103
    sget-object v2, Lcom/facebook/orca/chatheads/b/b;->a:[I

    iget-object v3, p0, Lcom/facebook/orca/chatheads/b/a;->j:Lcom/facebook/orca/chatheads/b/e;

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/b/e;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    :goto_0
    move v0, v1

    :goto_1
    move v1, v0

    .line 125
    :cond_0
    :goto_2
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/a;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 126
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    const v3, 0x3f59999a    # 0.85f

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 128
    if-eqz v1, :cond_1

    .line 129
    sget v1, Lcom/facebook/g;->chat_head_width:I

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sub-int/2addr v0, v1

    sget v1, Lcom/facebook/g;->chat_head_dock_overshoot_x:I

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 133
    :cond_1
    sget v1, Lcom/facebook/g;->chat_head_nux_bubble_max_width:I

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 134
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 135
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/a;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 136
    return-void

    .line 106
    :pswitch_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    sget v2, Lcom/facebook/orca/chatheads/b/a;->b:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 110
    :pswitch_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    sget v2, Lcom/facebook/orca/chatheads/b/a;->c:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 113
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    sget v2, Lcom/facebook/orca/chatheads/b/a;->d:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/a;->g:Landroid/view/View;

    sget v2, Lcom/facebook/orca/chatheads/b/a;->e:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 103
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

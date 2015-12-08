.class public final Lcom/roidapp/photogrid/common/be;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/ViewGroup;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/view/animation/AlphaAnimation;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:J

.field private g:J


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;IZZJ)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-boolean v4, p0, Lcom/roidapp/photogrid/common/be;->e:Z

    .line 41
    iput-wide p7, p0, Lcom/roidapp/photogrid/common/be;->g:J

    .line 44
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 71
    :goto_0
    :pswitch_0
    instance-of v0, p1, Lcom/roidapp/photogrid/release/ImageEditor;

    if-eqz v0, :cond_0

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/be;->e:Z

    .line 73
    const-string v0, "ImageEditor"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    .line 75
    :cond_0
    iput-object p2, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 80
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->c:Landroid/view/animation/AlphaAnimation;

    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    .line 189
    :goto_1
    return-void

    .line 46
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 49
    :pswitch_2
    const-string v0, "GridActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 52
    :pswitch_3
    const-string v0, "GridActivity/Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 55
    :pswitch_4
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 58
    :pswitch_5
    const-string v0, "WideHighActivity/Wide"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 61
    :pswitch_6
    const-string v0, "WideHighActivity/High"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 64
    :pswitch_7
    const-string v0, "Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 67
    :pswitch_8
    const-string v0, "Video"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    goto :goto_0

    .line 86
    :cond_1
    if-eqz p5, :cond_2

    .line 87
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03012e

    invoke-virtual {v0, v1, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    .line 91
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    .line 96
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 99
    const v0, 0x7f0d01b7

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/be;->b:Landroid/widget/TextView;

    .line 100
    const v0, 0x7f0d04cb

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 103
    if-eqz p5, :cond_4

    .line 104
    const v1, 0x7f0d04d0

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 105
    if-eqz p6, :cond_3

    .line 106
    new-instance v2, Lcom/roidapp/photogrid/common/bf;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/photogrid/common/bf;-><init>(Lcom/roidapp/photogrid/common/be;Landroid/app/Activity;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    :goto_3
    new-instance v1, Lcom/roidapp/photogrid/common/bg;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/common/bg;-><init>(Lcom/roidapp/photogrid/common/be;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 89
    :cond_2
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03012d

    invoke-virtual {v0, v1, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    goto :goto_2

    .line 119
    :cond_3
    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 120
    const v1, 0x7f0d04cf

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 121
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 122
    const v3, 0x7f0d04d1

    invoke-virtual {v2, v4, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 123
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 148
    :cond_4
    const v1, 0x7f0d04ca

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 150
    new-instance v2, Lcom/roidapp/photogrid/common/bh;

    invoke-direct {v2, p0, p3, p1}, Lcom/roidapp/photogrid/common/bh;-><init>(Lcom/roidapp/photogrid/common/be;Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    new-instance v1, Lcom/roidapp/photogrid/common/bi;

    invoke-direct {v1, p0, p1, p3, p4}, Lcom/roidapp/photogrid/common/bi;-><init>(Lcom/roidapp/photogrid/common/be;Landroid/app/Activity;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 44
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_2
        :pswitch_8
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/be;J)J
    .locals 1

    .prologue
    .line 29
    iput-wide p1, p0, Lcom/roidapp/photogrid/common/be;->f:J

    return-wide p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/be;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/common/be;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .prologue
    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 250
    :goto_0
    return-void

    .line 218
    :cond_0
    if-eqz p1, :cond_2

    .line 219
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    .line 220
    if-eqz v0, :cond_1

    .line 221
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->c:Landroid/view/animation/AlphaAnimation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->c:Landroid/view/animation/AlphaAnimation;

    iget-wide v2, p0, Lcom/roidapp/photogrid/common/be;->g:J

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    .line 228
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->c:Landroid/view/animation/AlphaAnimation;

    new-instance v1, Lcom/roidapp/photogrid/common/bj;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/bj;-><init>(Lcom/roidapp/photogrid/common/be;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 248
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/be;->c:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/common/be;)J
    .locals 2

    .prologue
    .line 29
    iget-wide v0, p0, Lcom/roidapp/photogrid/common/be;->f:J

    return-wide v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/common/be;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/common/be;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/be;->e:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/common/be;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 209
    :goto_0
    return-void

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/common/be;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 208
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/common/be;->a(Z)V

    goto :goto_0
.end method

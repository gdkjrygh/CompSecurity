.class public final Lcom/mobvista/sdk/m/b/a;
.super Landroid/app/Dialog;
.source "360Security"


# instance fields
.field private a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/ImageView;

.field private e:Lcom/mobvista/sdk/m/a/d/a/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 1

    .prologue
    .line 30
    const v0, 0x1030005

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    move-object v0, p1

    .line 31
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/a;->setOwnerActivity(Landroid/app/Activity;)V

    .line 33
    iput-object p2, p0, Lcom/mobvista/sdk/m/b/a;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 34
    iput-object p1, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    .line 35
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/b/a;->e:Lcom/mobvista/sdk/m/a/d/a/k;

    .line 36
    return-void
.end method

.method private a()Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, -0x2

    const/4 v5, -0x1

    .line 69
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/a;->b:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_1

    .line 70
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/b/a;->b:Landroid/widget/RelativeLayout;

    .line 71
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 72
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    const/high16 v2, 0x41700000    # 15.0f

    invoke-static {v1, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 73
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 74
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->e:Lcom/mobvista/sdk/m/a/d/a/k;

    const-string/jumbo v2, "bg_loading_camera.jpg"

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 76
    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->e:Lcom/mobvista/sdk/m/a/d/a/k;

    const-string/jumbo v3, "img_camera_title.png"

    invoke-virtual {v2, v3}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    const/high16 v3, 0x430c0000    # 140.0f

    invoke-static {v2, v3}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v2

    .line 78
    iget-object v3, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    const/high16 v4, 0x41fc0000    # 31.5f

    invoke-static {v3, v4}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v3

    .line 79
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v4, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 80
    invoke-virtual {v0, v1, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    new-instance v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    .line 82
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/j;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setId(I)V

    .line 83
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 84
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    if-eqz v1, :cond_0

    .line 85
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/mobvista/sdk/m/b/c;

    invoke-direct {v3, p0}, Lcom/mobvista/sdk/m/b/c;-><init>(Lcom/mobvista/sdk/m/b/a;)V

    invoke-virtual {v1, v2, v3}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 102
    :cond_0
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    const/high16 v2, 0x42800000    # 64.0f

    invoke-static {v1, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 103
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 104
    const/16 v1, 0xd

    invoke-virtual {v2, v1, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 105
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/mobvista/sdk/m/b/a;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 108
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 109
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 111
    const-string/jumbo v2, "Relax while loading...."

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 114
    const/4 v3, 0x3

    iget-object v4, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getId()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 115
    const/16 v3, 0xe

    invoke-virtual {v2, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 116
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/a;->b:Landroid/widget/RelativeLayout;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/a;->b:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/b/a;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 3

    .prologue
    .line 39
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 40
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 41
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/a;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 42
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/mobvista/sdk/m/b/b;

    invoke-direct {v2, p0}, Lcom/mobvista/sdk/m/b/b;-><init>(Lcom/mobvista/sdk/m/b/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 60
    :cond_0
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 64
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 65
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/a;->a()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/a;->setContentView(Landroid/view/View;)V

    .line 66
    return-void
.end method

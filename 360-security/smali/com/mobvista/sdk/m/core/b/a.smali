.class public final Lcom/mobvista/sdk/m/core/b/a;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# instance fields
.field private a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

.field private b:Ljava/util/List;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 33
    check-cast p1, Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    iput-object p1, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    .line 34
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/b/a;->b:Ljava/util/List;

    .line 35
    iput-boolean p3, p0, Lcom/mobvista/sdk/m/core/b/a;->c:Z

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/b/a;)Lcom/mobvista/sdk/m/core/AdMobvistaAct;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    return-object v0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 40
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/b/a;->c:Z

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x6

    .line 43
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/b/a;->c:Z

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/a;->b:Ljava/util/List;

    add-int/lit8 v1, p1, 0x6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 51
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/b/a;->c:Z

    if-eqz v0, :cond_0

    .line 57
    add-int/lit8 v0, p1, 0x6

    int-to-long v0, v0

    .line 59
    :goto_0
    return-wide v0

    :cond_0
    int-to-long v0, p1

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .prologue
    .line 65
    if-nez p2, :cond_1

    .line 67
    new-instance v0, Lcom/mobvista/sdk/m/core/b/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mobvista/sdk/m/core/b/d;-><init>(Lcom/mobvista/sdk/m/core/b/a;B)V

    .line 68
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 69
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 70
    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 71
    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 72
    new-instance p2, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {p2, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 73
    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 74
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 75
    invoke-virtual {p2, v1, v1, v1, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 76
    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 77
    invoke-static {}, Lcom/mobvista/sdk/m/a/f/j;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setId(I)V

    .line 78
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    const/high16 v4, 0x42800000    # 64.0f

    invoke-static {v3, v4}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v3

    .line 79
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 80
    const/16 v5, 0xf

    const/4 v6, -0x1

    invoke-virtual {v4, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 82
    const/16 v5, 0x9

    const/4 v6, -0x1

    invoke-virtual {v4, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 84
    invoke-virtual {p2, v2, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    iget-object v4, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-static {v4, v5}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v4

    .line 87
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 88
    const v6, -0x7c9e58

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 89
    int-to-float v4, v4

    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 90
    new-instance v4, Landroid/widget/TextView;

    iget-object v6, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v4, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 91
    const/4 v6, -0x1

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 92
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    const-string/jumbo v5, "INSTALL"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    invoke-static {}, Lcom/mobvista/sdk/m/a/f/j;->a()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setId(I)V

    .line 95
    iget-object v5, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    const/high16 v6, 0x40400000    # 3.0f

    invoke-static {v5, v6}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v5

    .line 96
    iget-object v6, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    const/high16 v7, 0x41200000    # 10.0f

    invoke-static {v6, v7}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v6

    .line 97
    invoke-virtual {v4, v6, v5, v6, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 98
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v6, -0x2

    const/4 v7, -0x2

    invoke-direct {v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 100
    const/16 v6, 0xb

    const/4 v7, -0x1

    invoke-virtual {v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 102
    const/16 v6, 0xf

    const/4 v7, -0x1

    invoke-virtual {v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 104
    invoke-virtual {p2, v4, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    new-instance v5, Landroid/widget/LinearLayout;

    iget-object v6, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 107
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 108
    new-instance v6, Landroid/widget/TextView;

    iget-object v7, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 109
    const/high16 v7, -0x1000000

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    const/high16 v7, 0x41800000    # 16.0f

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 111
    invoke-virtual {v6}, Landroid/widget/TextView;->setSingleLine()V

    .line 112
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 114
    new-instance v7, Landroid/widget/TextView;

    iget-object v8, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 115
    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 116
    const v8, -0x666667

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    const/high16 v8, 0x41400000    # 12.0f

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 118
    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 119
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 121
    new-instance v8, Landroid/widget/TextView;

    iget-object v9, p0, Lcom/mobvista/sdk/m/core/b/a;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v8, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 122
    const v9, -0x666667

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    const/high16 v9, 0x41400000    # 12.0f

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 124
    invoke-virtual {v8}, Landroid/widget/TextView;->setSingleLine()V

    .line 125
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    const/4 v11, -0x2

    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 128
    const/16 v10, 0x50

    iput v10, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 129
    invoke-virtual {v5, v8, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v9, v10, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 132
    const/4 v3, 0x0

    const/4 v10, 0x0

    invoke-virtual {v9, v1, v3, v1, v10}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 133
    const/4 v1, 0x1

    invoke-virtual {v2}, Landroid/widget/ImageView;->getId()I

    move-result v3

    invoke-virtual {v9, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 134
    const/4 v1, 0x0

    invoke-virtual {v4}, Landroid/widget/TextView;->getId()I

    move-result v3

    invoke-virtual {v9, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 135
    const/16 v1, 0xf

    invoke-virtual {v2}, Landroid/widget/ImageView;->getId()I

    move-result v3

    invoke-virtual {v9, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 136
    invoke-virtual {p2, v5, v9}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    iput-object v2, v0, Lcom/mobvista/sdk/m/core/b/d;->d:Landroid/widget/ImageView;

    .line 140
    iput-object v6, v0, Lcom/mobvista/sdk/m/core/b/d;->a:Landroid/widget/TextView;

    .line 141
    iput-object v7, v0, Lcom/mobvista/sdk/m/core/b/d;->b:Landroid/widget/TextView;

    .line 142
    iput-object v8, v0, Lcom/mobvista/sdk/m/core/b/d;->c:Landroid/widget/TextView;

    .line 143
    iput-object v4, v0, Lcom/mobvista/sdk/m/core/b/d;->e:Landroid/widget/TextView;

    .line 144
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v1, v0

    .line 150
    :goto_0
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/b/a;->c:Z

    if-eqz v0, :cond_0

    .line 151
    add-int/lit8 p1, p1, 0x6

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 154
    iget-object v2, v1, Lcom/mobvista/sdk/m/core/b/d;->d:Landroid/widget/ImageView;

    .line 155
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 156
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 157
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v3

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/mobvista/sdk/m/core/b/b;

    invoke-direct {v5, p0, v2}, Lcom/mobvista/sdk/m/core/b/b;-><init>(Lcom/mobvista/sdk/m/core/b/a;Landroid/widget/ImageView;)V

    invoke-virtual {v3, v4, v5}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 172
    iget-object v2, v1, Lcom/mobvista/sdk/m/core/b/d;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getAppName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v2, v1, Lcom/mobvista/sdk/m/core/b/d;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getAppDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    iget-object v1, v1, Lcom/mobvista/sdk/m/core/b/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getSize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    new-instance v1, Lcom/mobvista/sdk/m/core/b/c;

    invoke-direct {v1, p0, v0}, Lcom/mobvista/sdk/m/core/b/c;-><init>(Lcom/mobvista/sdk/m/core/b/a;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    return-object p2

    .line 146
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/b/d;

    move-object v1, v0

    goto :goto_0
.end method

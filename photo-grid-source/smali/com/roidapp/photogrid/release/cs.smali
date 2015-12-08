.class public final Lcom/roidapp/photogrid/release/cs;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:I

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/view/View;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/HorizontalScrollView;

.field private l:F

.field private m:I

.field private n:I

.field private o:Lcom/roidapp/photogrid/release/if;

.field private p:Landroid/widget/ImageView;

.field private q:Ljava/lang/String;

.field private r:[Ljava/lang/String;

.field private s:[Ljava/lang/String;

.field private t:[Ljava/lang/String;

.field private u:[Ljava/lang/String;

.field private v:[Ljava/lang/String;

.field private w:[Ljava/lang/String;

.field private x:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 50
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 55
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    .line 58
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 71
    const v0, -0x41666666    # -0.3f

    iput v0, p0, Lcom/roidapp/photogrid/release/cs;->l:F

    .line 74
    iput v3, p0, Lcom/roidapp/photogrid/release/cs;->n:I

    .line 1671
    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "switch"

    aput-object v1, v0, v4

    const-string v1, "layout"

    aput-object v1, v0, v3

    const-string v1, "crop"

    aput-object v1, v0, v5

    const-string v1, "edit"

    aput-object v1, v0, v6

    const-string v1, "retouch"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "blur"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "background"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "text"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "sticker"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "border"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "draw"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "add"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->r:[Ljava/lang/String;

    .line 1672
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "layout"

    aput-object v1, v0, v4

    const-string v1, "crop"

    aput-object v1, v0, v3

    const-string v1, "edit"

    aput-object v1, v0, v5

    const-string v1, "retouch"

    aput-object v1, v0, v6

    const-string v1, "blur"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "background"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "text"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "sticker"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "border"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "draw"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->s:[Ljava/lang/String;

    .line 1673
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "switch"

    aput-object v1, v0, v4

    const-string v1, "layout"

    aput-object v1, v0, v3

    const-string v1, "crop"

    aput-object v1, v0, v5

    const-string v1, "edit"

    aput-object v1, v0, v6

    const-string v1, "retouch"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "blur"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "background"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "text"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "sticker"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "border"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "draw"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->t:[Ljava/lang/String;

    .line 1674
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "edit"

    aput-object v1, v0, v4

    const-string v1, "text"

    aput-object v1, v0, v3

    const-string v1, "size"

    aput-object v1, v0, v5

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->u:[Ljava/lang/String;

    .line 1676
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "layout"

    aput-object v1, v0, v4

    const-string v1, "background"

    aput-object v1, v0, v3

    const-string v1, "edit"

    aput-object v1, v0, v5

    const-string v1, "border"

    aput-object v1, v0, v6

    const-string v1, "text"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "sticker"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "draw"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "add"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->v:[Ljava/lang/String;

    .line 1677
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "background"

    aput-object v1, v0, v4

    const-string v1, "edit"

    aput-object v1, v0, v3

    const-string v1, "ratio"

    aput-object v1, v0, v5

    const-string v1, "border_on"

    aput-object v1, v0, v6

    const-string v1, "text"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "sticker"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "draw"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "add"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->w:[Ljava/lang/String;

    .line 1678
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "layout"

    aput-object v1, v0, v4

    const-string v1, "background"

    aput-object v1, v0, v3

    const-string v1, "edit"

    aput-object v1, v0, v5

    const-string v1, "border"

    aput-object v1, v0, v6

    const-string v1, "text"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "sticker"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "draw"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "add"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->x:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cs;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->k:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method private a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V
    .locals 12

    .prologue
    .line 92
    const/4 v3, 0x0

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09004f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 94
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900cb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 95
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 96
    array-length v2, p2

    mul-int/2addr v2, v0

    if-le v2, v1, :cond_5

    move v2, v0

    .line 97
    :goto_0
    array-length v6, p2

    const/4 v0, 0x0

    move v4, v0

    :goto_1
    if-ge v4, v6, :cond_2f

    aget-object v7, p2, v4

    .line 106
    const v0, 0x7f030008

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const/4 v8, 0x0

    invoke-virtual {p1, v0, v1, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v8

    .line 107
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v2, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    const v0, 0x7f0d005a

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 109
    const v1, 0x7f0d005c

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 110
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    const-string v9, "edit"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 112
    if-eqz p3, :cond_7

    .line 113
    const/4 v1, 0x1

    .line 118
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v9, 0x7f02038e

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 119
    sget v9, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v10, 0x1

    if-ne v9, v10, :cond_0

    iget v9, p0, Lcom/roidapp/photogrid/release/cs;->m:I

    if-eqz v9, :cond_1

    :cond_0
    const/4 v9, 0x4

    sget v10, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v9, v10, :cond_6

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lcom/roidapp/photogrid/release/ih;->b(I)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 121
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00c0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    if-eqz v3, :cond_2

    .line 123
    const/16 v9, 0x32

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 124
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v3, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 133
    :cond_2
    :goto_2
    const v3, 0x7f07015f

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 152
    :goto_3
    const v3, 0x7f0200b3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 153
    const-string v3, "edit"

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    move v3, v1

    .line 387
    :cond_3
    :goto_4
    const-string v0, "retouch"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/c;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 388
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 97
    :cond_4
    :goto_5
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto/16 :goto_1

    .line 96
    :cond_5
    array-length v0, p2

    div-int v0, v1, v0

    move v2, v0

    goto/16 :goto_0

    .line 127
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00bf

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 128
    if-eqz v3, :cond_2

    .line 129
    const/16 v9, 0xff

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 130
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v3, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 134
    :cond_7
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    array-length v1, v1

    const/4 v9, 0x1

    if-eq v1, v9, :cond_30

    .line 135
    const/4 v1, 0x1

    .line 136
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v9, 0x7f020379

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 137
    sget v9, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v10, 0x1

    if-ne v9, v10, :cond_9

    iget v9, p0, Lcom/roidapp/photogrid/release/cs;->m:I

    if-nez v9, :cond_9

    .line 138
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00c0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    if-eqz v3, :cond_8

    .line 140
    const/16 v9, 0x32

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 141
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v3, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 150
    :cond_8
    :goto_6
    const v3, 0x7f070115

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_3

    .line 144
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00bf

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 145
    if-eqz v3, :cond_8

    .line 146
    const/16 v9, 0xff

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 147
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v3, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_6

    .line 154
    :cond_a
    const-string v9, "background"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    .line 159
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020361

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 160
    const/4 v9, 0x4

    sget v10, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v9, v10, :cond_c

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v9

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/ih;->f()Z

    move-result v9

    if-nez v9, :cond_c

    .line 161
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00c0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 162
    if-eqz v1, :cond_b

    .line 163
    const/16 v9, 0x32

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 164
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 173
    :cond_b
    :goto_7
    const v1, 0x7f070033

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 174
    const-string v1, "background"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 167
    :cond_c
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00bf

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    if-eqz v1, :cond_b

    .line 169
    const/16 v9, 0xff

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 170
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_7

    .line 175
    :cond_d
    const-string v9, "ratio"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 184
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f0203dc

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 185
    const/4 v1, 0x1

    .line 186
    sget v10, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v11, 0x4

    if-ne v10, v11, :cond_10

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v10

    invoke-virtual {v10}, Lcom/roidapp/photogrid/release/ih;->g()Z

    move-result v10

    if-nez v10, :cond_10

    .line 187
    const/4 v1, 0x0

    .line 192
    :cond_e
    :goto_8
    if-nez v1, :cond_11

    .line 193
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v10, 0x7f0c00c0

    invoke-virtual {v1, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 194
    if-eqz v9, :cond_f

    .line 195
    const/16 v1, 0x32

    invoke-virtual {v9, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 196
    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 206
    :cond_f
    :goto_9
    const v1, 0x7f07025d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 207
    const-string v1, "ratio"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 188
    :cond_10
    sget v10, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v11, 0x9

    if-ne v10, v11, :cond_e

    .line 189
    const/4 v1, 0x0

    goto :goto_8

    .line 199
    :cond_11
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v10, 0x7f0c00bf

    invoke-virtual {v1, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 200
    if-eqz v9, :cond_f

    .line 201
    const/16 v1, 0xff

    invoke-virtual {v9, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 202
    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_9

    .line 208
    :cond_12
    const-string v9, "layout"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_17

    .line 209
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f0203a1

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 210
    const/4 v9, 0x4

    sget v10, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v9, v10, :cond_16

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v9

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v9

    if-nez v9, :cond_16

    .line 211
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00c0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 212
    if-eqz v1, :cond_13

    .line 213
    const/16 v9, 0x32

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 214
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 225
    :cond_13
    :goto_a
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v1

    const-string v9, "other"

    const-string v10, "templateLayout"

    invoke-virtual {v1, v9, v10}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/cs;->q:Ljava/lang/String;

    .line 226
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->q:Ljava/lang/String;

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->q:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v9

    invoke-static {v9}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v9

    const-string v10, "current_template_active_icon_url"

    const-string v11, ""

    invoke-interface {v9, v10, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 227
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 228
    const-string v9, "current_template_active_icon_url"

    iget-object v10, p0, Lcom/roidapp/photogrid/release/cs;->q:Ljava/lang/String;

    invoke-interface {v1, v9, v10}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 229
    const-string v9, "new_feature_template_entry"

    const/4 v10, 0x1

    invoke-interface {v1, v9, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 230
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 233
    :cond_14
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v9, 0x4

    if-eq v1, v9, :cond_15

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v9, "new_feature_template_entry"

    const/4 v10, 0x1

    invoke-interface {v1, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 236
    const v1, 0x7f0d005b

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/cs;->j:Landroid/widget/ImageView;

    .line 237
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->j:Landroid/widget/ImageView;

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 240
    :cond_15
    const v1, 0x7f07019c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 241
    const-string v1, "layout"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 217
    :cond_16
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00bf

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 218
    if-eqz v1, :cond_13

    .line 219
    const/16 v9, 0xff

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 220
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_a

    .line 242
    :cond_17
    const-string v9, "border"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1b

    .line 244
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v9, 0x4

    if-ne v1, v9, :cond_19

    .line 245
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020367

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 250
    :goto_b
    const/4 v9, 0x4

    sget v10, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v9, v10, :cond_1a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v9

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v9

    if-nez v9, :cond_1a

    .line 251
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00c0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 252
    if-eqz v1, :cond_18

    .line 253
    const/16 v9, 0x32

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 254
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 264
    :cond_18
    :goto_c
    const v1, 0x7f070041

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 265
    const-string v1, "border"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 247
    :cond_19
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020366

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_b

    .line 257
    :cond_1a
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00bf

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 258
    if-eqz v1, :cond_18

    .line 259
    const/16 v9, 0xff

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 260
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_c

    .line 266
    :cond_1b
    const-string v9, "border_on"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1f

    .line 267
    const/4 v1, 0x0

    const v9, 0x7f020397

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 269
    const-string v1, "border_on"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 271
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 272
    if-eqz v1, :cond_1d

    array-length v1, v1

    if-nez v1, :cond_1d

    .line 273
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v1

    if-nez v1, :cond_1c

    .line 274
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020397

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 275
    const v9, 0x7f070041

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(I)V

    .line 282
    :goto_d
    const/16 v9, 0x32

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 283
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 284
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f0c00c0

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 278
    :cond_1c
    const v1, 0x7f0701ed

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 279
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020398

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_d

    .line 287
    :cond_1d
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v1

    if-nez v1, :cond_1e

    .line 288
    const v1, 0x7f070041

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 289
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020397

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 296
    :goto_e
    const/16 v9, 0xff

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 297
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_4

    .line 292
    :cond_1e
    const v1, 0x7f0701ed

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 293
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f020398

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_e

    .line 300
    :cond_1f
    const-string v9, "draw"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_20

    .line 301
    const/4 v1, 0x0

    const v9, 0x7f02037f

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 302
    const v1, 0x7f070139

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 303
    const-string v1, "draw"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 304
    const v1, 0x7f0200b3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_4

    .line 305
    :cond_20
    const-string v9, "text"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_22

    .line 306
    const/4 v1, 0x0

    const v9, 0x7f020394

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 307
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v9, 0x8

    if-ne v1, v9, :cond_21

    const v1, 0x7f07037b

    :goto_f
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 308
    const-string v1, "text"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 307
    :cond_21
    const v1, 0x7f0702e5

    goto :goto_f

    .line 309
    :cond_22
    const-string v9, "switch"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_24

    .line 310
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 321
    :goto_10
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v9, "new_feature_original"

    const/4 v10, 0x1

    invoke-interface {v1, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 322
    const v1, 0x7f0d005b

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/cs;->i:Landroid/widget/ImageView;

    .line 323
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->i:Landroid/widget/ImageView;

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 326
    :cond_23
    const v1, 0x7f0200b3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 327
    const-string v1, "switch"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 313
    :pswitch_1
    const/4 v1, 0x0

    const v9, 0x7f0203ad

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 314
    const v1, 0x7f070162

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_10

    .line 317
    :pswitch_2
    const/4 v1, 0x0

    const v9, 0x7f0203cc

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 318
    const v1, 0x7f070165

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_10

    .line 328
    :cond_24
    const-string v9, "sticker"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_26

    .line 329
    iget-object v9, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v9, v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->y:Z

    if-eqz v9, :cond_25

    .line 330
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 331
    const v9, 0x7f020392

    invoke-static {v1, v9}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 333
    :cond_25
    const/4 v1, 0x0

    const v9, 0x7f0203fa

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 334
    const v1, 0x7f0702d0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 335
    const-string v1, "sticker"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 347
    :cond_26
    const-string v1, "add"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_28

    .line 348
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v9, 0x7f0204e6

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 349
    iget-boolean v9, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    if-eqz v9, :cond_27

    .line 350
    const/16 v9, 0xff

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 351
    iget-object v9, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00bf

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 356
    :goto_11
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v1, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 357
    const v1, 0x7f07003d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 358
    const v1, 0x7f0200b3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 359
    const-string v1, "add"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 353
    :cond_27
    const/16 v9, 0x32

    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 354
    iget-object v9, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0c00c0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_11

    .line 360
    :cond_28
    const-string v1, "crop"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 361
    const/4 v1, 0x0

    const v9, 0x7f020379

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 362
    const v1, 0x7f070115

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 363
    const-string v1, "crop"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 365
    :cond_29
    const-string v1, "retouch"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/gl/c;->b()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/roidapp/baselib/gl/c;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 368
    const/4 v1, 0x0

    const v9, 0x7f0203e0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 369
    const v1, 0x7f07026a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 370
    const-string v1, "retouch"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 371
    :cond_2a
    const-string v1, "size"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 372
    const/4 v1, 0x0

    const v9, 0x7f02035b

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 373
    const v1, 0x7f07037c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 374
    const-string v1, "size"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 375
    :cond_2b
    const-string v1, "blur"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 376
    const/4 v1, 0x0

    const v9, 0x7f020364

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v9, v10, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 377
    const v1, 0x7f070040

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 378
    const-string v1, "blur"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 379
    const v0, 0x7f0d005b

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->p:Landroid/widget/ImageView;

    .line 380
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "new_feature_blur"

    const/4 v9, 0x1

    invoke-interface {v0, v1, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_4

    .line 383
    :cond_2c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_4

    .line 389
    :cond_2d
    const-string v0, "edit"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2e

    if-eqz v3, :cond_2e

    .line 390
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_5

    .line 391
    :cond_2e
    const-string v0, "retouch"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "edit"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 392
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_5

    .line 396
    :cond_2f
    return-void

    :cond_30
    move v1, v3

    goto/16 :goto_3

    .line 310
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/cs;)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 12450
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    iget v2, p0, Lcom/roidapp/photogrid/release/cs;->l:F

    move v3, v1

    move v5, v1

    move v6, v4

    move v7, v1

    move v8, v4

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 12451
    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 12452
    new-instance v1, Lcom/roidapp/photogrid/release/cx;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/cx;-><init>(Lcom/roidapp/photogrid/release/cs;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 12474
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 50
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/cs;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/cs;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method private d()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3f4ccccd    # 0.8f

    const/4 v9, 0x1

    .line 1304
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/banner/Blur"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1307
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v3, "blur"

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v7

    .line 1308
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentBlur"

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1309
    new-instance v8, Lcom/roidapp/photogrid/release/cg;

    invoke-direct {v8}, Lcom/roidapp/photogrid/release/cg;-><init>()V

    .line 1310
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->A:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "new_feature_blur"

    invoke-interface {v0, v3, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1311
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "new_feature_blur"

    invoke-interface {v0, v3, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1312
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->p:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11287
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 12195
    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 11287
    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    .line 11288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    if-eqz v0, :cond_1

    .line 11289
    iput v9, p0, Lcom/roidapp/photogrid/release/cs;->n:I

    .line 11290
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/if;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v5, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/if;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v6, v3

    move v3, v1

    move v4, v2

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 11291
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 11293
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/if;->startAnimation(Landroid/view/animation/Animation;)V

    .line 11294
    invoke-virtual {v0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1315
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 1316
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v1

    invoke-virtual {v0, v1, v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 1317
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f0d03ec

    const-string v2, "FragmentBlur"

    invoke-virtual {v0, v1, v8, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 1318
    if-eqz v7, :cond_2

    .line 1319
    const v0, 0x7f0c000a

    invoke-virtual {v7, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1325
    :cond_2
    :goto_0
    return-void

    .line 1321
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentBlur"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 1322
    if-eqz v7, :cond_2

    .line 1323
    const v0, 0x7f0200b3

    invoke-virtual {v7, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 610
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->A:Z

    if-eqz v0, :cond_0

    .line 611
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/cs;->d()V

    .line 612
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->A:Z

    .line 614
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 844
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "switch"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 845
    if-eqz v0, :cond_0

    .line 846
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 860
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 849
    :pswitch_1
    const-string v1, "Original"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    .line 850
    const v1, 0x7f0203ad

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 851
    const v1, 0x7f070162

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 854
    :pswitch_2
    const-string v1, "Instagram"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    .line 855
    const v1, 0x7f0203cc

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 856
    const v1, 0x7f070165

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 846
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final c()Z
    .locals 6

    .prologue
    const v5, 0x7f0d03ec

    const/4 v0, 0x0

    const v4, 0x7f0200b3

    const/4 v1, 0x1

    .line 869
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 870
    const-string v3, "FragmentBgListSub"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "FragmentBgColor"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 874
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aw()I

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cs;->h:Landroid/view/View;

    if-eqz v2, :cond_2

    const-string v2, "background"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cs;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 877
    new-instance v0, Lcom/roidapp/photogrid/release/ck;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ck;-><init>()V

    .line 878
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentBorder"

    invoke-virtual {v2, v5, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    :goto_0
    move v0, v1

    .line 949
    :cond_1
    :goto_1
    return v0

    .line 880
    :cond_2
    new-instance v2, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 881
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-eq v3, v4, :cond_3

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v3, v1, :cond_4

    .line 882
    :cond_3
    invoke-virtual {v2, v0, v0, v0}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 884
    :cond_4
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v3, :cond_5

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x5

    if-ne v3, v4, :cond_6

    .line 885
    :cond_5
    invoke-virtual {v2, v1, v0, v0}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 887
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentBgList"

    invoke-virtual {v0, v5, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 891
    :cond_7
    const-string v3, "ProportionFragment"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 892
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v1, :cond_9

    .line 893
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "ProportionFragment"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 894
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "ratio"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 895
    if-eqz v0, :cond_8

    .line 896
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_8
    :goto_2
    move v0, v1

    .line 902
    goto :goto_1

    .line 899
    :cond_9
    new-instance v0, Lcom/roidapp/photogrid/release/fb;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/fb;-><init>()V

    .line 900
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentLayout"

    invoke-virtual {v2, v5, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_2

    .line 903
    :cond_a
    const-string v3, "FragmentBgList"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_c

    .line 904
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBgList"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "background"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 906
    if-eqz v0, :cond_b

    .line 907
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_b
    move v0, v1

    .line 909
    goto :goto_1

    .line 910
    :cond_c
    const-string v3, "FragmentLayout"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 911
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentLayout"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 912
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "layout"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 913
    if-eqz v0, :cond_d

    .line 914
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_d
    move v0, v1

    .line 916
    goto/16 :goto_1

    .line 917
    :cond_e
    const-string v3, "FragmentBorder"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 918
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBorder"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 919
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "border"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 920
    if-eqz v0, :cond_f

    .line 921
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_f
    move v0, v1

    .line 925
    goto/16 :goto_1

    .line 926
    :cond_10
    const-string v3, "FragmentAdjustTextSize"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_12

    .line 927
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentAdjustTextSize"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 928
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "size"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 929
    if-eqz v0, :cond_11

    .line 930
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_11
    move v0, v1

    .line 932
    goto/16 :goto_1

    .line 933
    :cond_12
    sget-object v3, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_14

    .line 934
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    sget-object v2, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 935
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "edit"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 936
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    sget-object v3, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 937
    if-eqz v0, :cond_13

    .line 938
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_13
    move v0, v1

    .line 940
    goto/16 :goto_1

    .line 941
    :cond_14
    const-string v3, "FragmentBlur"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 942
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBlur"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 943
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v2, "blur"

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 944
    if-eqz v0, :cond_15

    .line 945
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_15
    move v0, v1

    .line 947
    goto/16 :goto_1
.end method

.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 7

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    const v1, 0x3f4ccccd    # 0.8f

    .line 1687
    iget v0, p0, Lcom/roidapp/photogrid/release/cs;->n:I

    packed-switch v0, :pswitch_data_0

    .line 1697
    :goto_0
    return-void

    .line 1689
    :pswitch_0
    iget v0, p0, Lcom/roidapp/photogrid/release/cs;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/cs;->n:I

    .line 1690
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/if;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v5, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/if;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v6, v3

    move v3, v1

    move v4, v2

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 1691
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1693
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->o:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/if;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1694
    invoke-virtual {v0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    .line 1687
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1702
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1683
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 81
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 82
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 83
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 10

    .prologue
    const/4 v9, 0x5

    const v8, 0x7f0c000a

    const/4 v2, 0x1

    const v7, 0x7f0200b3

    const/4 v3, 0x0

    .line 621
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 841
    :cond_0
    :goto_0
    return-void

    .line 625
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 628
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cs;->h:Landroid/view/View;

    .line 630
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ratio"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 6197
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1d

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->g()Z

    move-result v0

    if-nez v0, :cond_1d

    .line 6198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Ratio"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 6200
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070202

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 640
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "layout"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 642
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_22

    .line 643
    const-string v0, "Layout"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 6230
    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/LayoutMain"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 6232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "layout"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 6233
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-ne v1, v4, :cond_23

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v1

    if-nez v1, :cond_23

    .line 6234
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070201

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 659
    :cond_4
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "background"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 660
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_27

    .line 661
    const-string v0, "Background"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 6260
    :cond_5
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Background"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 6262
    const/4 v0, 0x4

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v1, :cond_28

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->f()Z

    move-result v0

    if-nez v0, :cond_28

    .line 6263
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 676
    :cond_6
    :goto_5
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "edit"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 6331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "edit"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 6332
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2c

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    sget-object v4, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 6333
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    sget-object v4, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6334
    if-eqz v0, :cond_7

    .line 6335
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 687
    :cond_7
    :goto_6
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "border"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_41

    .line 689
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_3e

    .line 690
    const-string v0, "Border"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 7129
    :cond_8
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Border"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 7131
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3f

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-nez v0, :cond_3f

    .line 7132
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701fe

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 706
    :cond_9
    :goto_8
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "border_on"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 707
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Border_switch"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "border_on"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 710
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 711
    if-eqz v1, :cond_42

    array-length v1, v1

    if-nez v1, :cond_42

    .line 712
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07020e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 727
    :cond_a
    :goto_9
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "draw"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 8159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Draw"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 8161
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_45

    .line 8162
    const-string v0, "Draw"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 8166
    :cond_b
    :goto_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "draw"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 8167
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentDoodle"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_46

    .line 8168
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 8169
    new-instance v1, Lcom/roidapp/photogrid/release/cy;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/cy;-><init>()V

    .line 8170
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v5, 0x7f0d028d

    const-string v6, "FragmentDoodle"

    invoke-virtual {v4, v5, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 8171
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/az;->a(Z)V

    .line 8172
    if-eqz v0, :cond_c

    .line 8174
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 8183
    :cond_c
    :goto_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentDoodleTop"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_47

    .line 8184
    new-instance v0, Lcom/roidapp/photogrid/release/da;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/da;-><init>()V

    .line 8185
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0d03ed

    const-string v5, "FragmentDoodleTop"

    invoke-virtual {v1, v4, v0, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 730
    :cond_d
    :goto_c
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "add"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 9100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/AddImg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 9102
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_48

    .line 9103
    const-string v0, "AddImage"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 9107
    :cond_e
    :goto_d
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    if-eqz v0, :cond_49

    .line 9108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 9608
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_f

    .line 9611
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.GET_CONTENT"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9612
    const-string v4, "image/*"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 9615
    const v4, 0xaa01

    :try_start_0
    invoke-virtual {v0, v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9109
    :cond_f
    :goto_e
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v9, :cond_10

    .line 761
    :cond_10
    :goto_f
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "switch"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 762
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/SingleSwitch"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 764
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->i:Landroid/widget/ImageView;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_11

    .line 765
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 766
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "new_feature_original"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 768
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(ZI)V

    .line 769
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->b()V

    .line 772
    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "text"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_50

    .line 773
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "text"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 774
    if-eqz v0, :cond_13

    .line 775
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 10026
    :cond_13
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4d

    .line 10027
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 10028
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_14

    .line 10029
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-object v1, v0

    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v4, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 10030
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->C()V

    .line 784
    :cond_14
    :goto_10
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "sticker"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_52

    .line 785
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "sticker"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 786
    if-eqz v0, :cond_15

    .line 787
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 10072
    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Sticker"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 10074
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_51

    .line 10075
    const-string v0, "Sticker"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 10079
    :cond_16
    :goto_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(I)V

    .line 796
    :cond_17
    :goto_12
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "crop"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_53

    .line 797
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "crop"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 798
    if-eqz v0, :cond_18

    .line 799
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 10090
    :cond_18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Crop"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 10092
    const-string v0, "Crop"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    .line 10093
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    .line 808
    :cond_19
    :goto_13
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "retouch"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_54

    .line 810
    const-string v0, "Retouch"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    .line 811
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "retouch"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 812
    if-eqz v0, :cond_1a

    .line 813
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 814
    :cond_1a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(II)V

    .line 821
    :cond_1b
    :goto_14
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "size"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_57

    .line 10426
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "size"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 10427
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1c

    .line 10428
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentAdjustTextSize"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_55

    .line 10429
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentAdjustTextSize"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 10430
    if-eqz v1, :cond_1c

    .line 10431
    invoke-virtual {v1, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 831
    :cond_1c
    :goto_15
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "blur"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_58

    .line 832
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/cs;->d()V

    .line 833
    const-string v0, "Blur"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 6201
    :cond_1d
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1e

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1f

    .line 6202
    :cond_1e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Ratio"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 6204
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070203

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 6206
    :cond_1f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Ratio"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 6209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "ratio"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 6210
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "ProportionFragment"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_20

    .line 6211
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6212
    new-instance v1, Lcom/roidapp/photogrid/release/fi;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/fi;-><init>()V

    .line 6214
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v5, 0x7f0d03ec

    const-string v6, "ProportionFragment"

    invoke-virtual {v4, v5, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 6215
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_1

    .line 6217
    :cond_20
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "ProportionFragment"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6218
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_1

    .line 633
    :cond_21
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "ratio"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 634
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "ProportionFragment"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 635
    if-eqz v0, :cond_2

    .line 636
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_1

    .line 644
    :cond_22
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_3

    .line 645
    const-string v0, "Layout"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_2

    .line 6236
    :cond_23
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentLayout"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_25

    .line 6237
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6238
    new-instance v1, Lcom/roidapp/photogrid/release/fb;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/fb;-><init>()V

    .line 6239
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->j:Landroid/widget/ImageView;

    if-eqz v4, :cond_24

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->j:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getVisibility()I

    move-result v4

    if-nez v4, :cond_24

    .line 6240
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->j:Landroid/widget/ImageView;

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6241
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cs;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-static {v4}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v5, "new_feature_template_entry"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 6242
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/fb;->b()V

    .line 6244
    :cond_24
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/fb;->a(Ljava/lang/String;)V

    .line 6245
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v5, 0x7f0d03ec

    const-string v6, "FragmentLayout"

    invoke-virtual {v4, v5, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 6246
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_3

    .line 6248
    :cond_25
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentLayout"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6249
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_3

    .line 649
    :cond_26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "layout"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 650
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentLayout"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 651
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBorder"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 652
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "ProportionFragment"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 653
    if-eqz v0, :cond_4

    .line 654
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_3

    .line 662
    :cond_27
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_5

    .line 663
    const-string v0, "Background"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_4

    .line 6265
    :cond_28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "background"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 6266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgList"

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 6267
    new-instance v4, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v4}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 6273
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v2, :cond_29

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x4

    if-eq v0, v5, :cond_29

    move v0, v2

    .line 6274
    :goto_16
    invoke-virtual {v4, v0, v3, v3}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 6275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v5, 0x7f0d03ec

    const-string v6, "FragmentBgList"

    invoke-virtual {v0, v5, v4, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 6276
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_5

    :cond_29
    move v0, v3

    .line 6273
    goto :goto_16

    .line 6278
    :cond_2a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgList"

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6279
    invoke-virtual {v1, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_5

    .line 667
    :cond_2b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "background"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 668
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgList"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 669
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgListSub"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 670
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgColor"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 671
    if-eqz v0, :cond_6

    .line 672
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_5

    .line 6339
    :cond_2c
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    if-eqz v1, :cond_30

    .line 6340
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v1, :cond_2f

    .line 6341
    const-string v1, "Filter"

    sget v4, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v4}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 6345
    :cond_2d
    :goto_17
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "/banner/Filter"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 6356
    :goto_18
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v1, v9, :cond_2e

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v1, :cond_34

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/cs;->d:Z

    if-eqz v1, :cond_34

    .line 6357
    :cond_2e
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 6358
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    if-eqz v0, :cond_33

    .line 6359
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_6

    .line 6342
    :cond_2f
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v9, :cond_2d

    .line 6343
    const-string v1, "Filter"

    sget v4, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v4}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_17

    .line 6348
    :cond_30
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v1, :cond_32

    .line 6349
    const-string v1, "Crop"

    sget v4, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v4}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 6353
    :cond_31
    :goto_19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "/banner/Crop"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    goto :goto_18

    .line 6350
    :cond_32
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v9, :cond_31

    .line 6351
    const-string v1, "Crop"

    sget v4, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v4}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_19

    .line 6361
    :cond_33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_6

    .line 6364
    :cond_34
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-ne v1, v4, :cond_35

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->b(I)Z

    move-result v1

    if-eqz v1, :cond_35

    .line 6365
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 6366
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070200

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 6368
    :cond_35
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 6369
    if-eqz v1, :cond_3c

    array-length v4, v1

    if-lez v4, :cond_3c

    .line 6370
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 6371
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cs;->d:Z

    if-eqz v0, :cond_37

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x8

    if-eq v0, v4, :cond_37

    .line 6372
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    if-eqz v0, :cond_36

    .line 6373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_6

    .line 6375
    :cond_36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v3, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_6

    .line 6378
    :cond_37
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v0

    if-nez v0, :cond_3b

    .line 6379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_7

    .line 6380
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 6381
    const-string v0, "globalGroupInfo"

    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 6383
    const-string v0, "globalFilterInfo"

    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/imagelib/filter/aa;->c()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 6385
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->e()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    .line 6386
    if-eqz v0, :cond_38

    .line 6387
    const-string v5, "global_image_property_contast"

    iget v6, v0, Lcom/roidapp/imagelib/b/b;->b:I

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6389
    const-string v5, "global_image_property_hue"

    iget v6, v0, Lcom/roidapp/imagelib/b/b;->d:I

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6391
    const-string v5, "global_image_property_lightness"

    iget v6, v0, Lcom/roidapp/imagelib/b/b;->a:I

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6393
    const-string v5, "global_image_property_saturation"

    iget v0, v0, Lcom/roidapp/imagelib/b/b;->c:I

    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6396
    :cond_38
    const-string v5, "current_mode_moview"

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v6, 0x8

    if-ne v0, v6, :cond_39

    move v0, v2

    :goto_1a
    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 6397
    const-string v0, "current_image_path"

    aget-object v1, v1, v3

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6398
    new-instance v0, Lcom/roidapp/imagelib/filter/s;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/s;-><init>()V

    .line 6399
    invoke-virtual {v0, v4}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 6400
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x8

    if-ne v1, v4, :cond_3a

    .line 6401
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0d03ec

    sget-object v5, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v1, v4, v0, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_39
    move v0, v3

    .line 6396
    goto :goto_1a

    .line 6403
    :cond_3a
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0d028d

    sget-object v5, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v1, v4, v0, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 6407
    :cond_3b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_7

    .line 6408
    new-instance v0, Lcom/roidapp/photogrid/release/dj;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/dj;-><init>()V

    .line 6409
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dj;->a()V

    .line 6410
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0d028d

    const-string v5, "FragmentEditTip"

    invoke-virtual {v1, v4, v0, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 6415
    :cond_3c
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 6416
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701e9

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 679
    :cond_3d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    sget-object v1, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 680
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "edit"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 681
    if-eqz v0, :cond_7

    .line 682
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_6

    .line 691
    :cond_3e
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_8

    .line 692
    const-string v0, "Border"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_7

    .line 7134
    :cond_3f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "border"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 7135
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBorder"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_40

    .line 7136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "/banner/LayoutMain/Border"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 7139
    new-instance v1, Lcom/roidapp/photogrid/release/ck;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/ck;-><init>()V

    .line 7140
    iget-object v4, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v5, 0x7f0d03ec

    const-string v6, "FragmentBorder"

    invoke-virtual {v4, v5, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 7141
    if-eqz v0, :cond_9

    .line 7142
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_8

    .line 7145
    :cond_40
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBorder"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 7146
    if-eqz v0, :cond_9

    .line 7147
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_8

    .line 696
    :cond_41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "border"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 697
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgList"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 698
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgListSub"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 699
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBgColor"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 700
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentBorder"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 701
    if-eqz v0, :cond_9

    .line 702
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_8

    .line 714
    :cond_42
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v1

    if-eqz v1, :cond_43

    .line 715
    const v1, 0x7f020397

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 716
    const v1, 0x7f070041

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 721
    :goto_1b
    invoke-virtual {v0}, Landroid/widget/TextView;->invalidate()V

    .line 722
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 8103
    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v1, v1, Lcom/roidapp/photogrid/release/mq;

    if-eqz v1, :cond_a

    .line 8104
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v1

    .line 8105
    if-nez v1, :cond_44

    move v1, v2

    .line 8106
    :goto_1c
    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/mq;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mq;->c(Z)V

    .line 8107
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->n(Z)V

    goto/16 :goto_9

    .line 718
    :cond_43
    const v1, 0x7f020398

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 719
    const v1, 0x7f0701ed

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1b

    :cond_44
    move v1, v3

    .line 8105
    goto :goto_1c

    .line 8163
    :cond_45
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_b

    .line 8164
    const-string v0, "Draw"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_a

    .line 8177
    :cond_46
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentDoodle"

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 8178
    if-eqz v0, :cond_c

    .line 8179
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_b

    .line 8188
    :cond_47
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentDoodleTop"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    goto/16 :goto_c

    .line 9104
    :cond_48
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_e

    .line 9105
    const-string v0, "AddImage"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_d

    .line 9616
    :catch_0
    move-exception v1

    .line 9617
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0701ef

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 9618
    invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto/16 :goto_e

    .line 9114
    :cond_49
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-nez v0, :cond_4a

    .line 9115
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07004a

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 9116
    :cond_4a
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v0, :cond_4b

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v2, :cond_4b

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4c

    .line 9117
    :cond_4b
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701f7

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v4, v2, [Ljava/lang/Object;

    iget v5, p0, Lcom/roidapp/photogrid/release/cs;->f:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 9118
    :cond_4c
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_10

    .line 9119
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701f7

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/cs;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 10034
    :cond_4d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Text"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 10036
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_4f

    .line 10037
    const-string v0, "Text"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 10041
    :cond_4e
    :goto_1d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 10043
    new-instance v0, Lcom/roidapp/photogrid/release/ra;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;)V

    .line 10044
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 10045
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 10046
    iget v1, v0, Lcom/roidapp/photogrid/release/ra;->c:I

    iget v4, v0, Lcom/roidapp/photogrid/release/ra;->d:I

    invoke-virtual {v0, v1, v4}, Lcom/roidapp/photogrid/release/ra;->b(II)V

    .line 10047
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 10048
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->l()V

    .line 10050
    iget v1, v0, Lcom/roidapp/photogrid/release/ra;->c:I

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v1, v4

    .line 10051
    iget v4, v0, Lcom/roidapp/photogrid/release/ra;->d:I

    div-int/lit8 v4, v4, 0x2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    div-int/lit8 v4, v4, 0x2

    .line 10052
    int-to-float v1, v1

    int-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 10053
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v1

    int-to-float v1, v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->at:F

    .line 10054
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    .line 10055
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 10056
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 10057
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->C()V

    .line 10058
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v0

    .line 10059
    if-eqz v0, :cond_14

    .line 10060
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->setVisibility(I)V

    goto/16 :goto_10

    .line 10038
    :cond_4f
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_4e

    .line 10039
    const-string v0, "Text"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_1d

    .line 778
    :cond_50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "text"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 779
    if-eqz v0, :cond_14

    .line 780
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_10

    .line 10076
    :cond_51
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_16

    .line 10077
    const-string v0, "Sticker"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v1, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto/16 :goto_11

    .line 790
    :cond_52
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "sticker"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 791
    if-eqz v0, :cond_17

    .line 792
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_12

    .line 802
    :cond_53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "crop"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 803
    if-eqz v0, :cond_19

    .line 804
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_13

    .line 816
    :cond_54
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "retouch"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 817
    if-eqz v0, :cond_1b

    .line 818
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_14

    .line 10435
    :cond_55
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 10436
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->A()Z

    move-result v0

    if-eqz v0, :cond_56

    .line 10437
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f0703b6

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    goto/16 :goto_15

    .line 10440
    :cond_56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    new-instance v3, Lcom/roidapp/photogrid/release/br;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/br;-><init>()V

    const-string v4, "FragmentAdjustTextSize"

    invoke-virtual {v0, v2, v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 10441
    if-eqz v1, :cond_1c

    .line 10442
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_15

    .line 823
    :cond_57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentAdjustTextSize"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 824
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentAdjustTextSize"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 825
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "size"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 826
    if-eqz v0, :cond_1c

    .line 827
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_15

    .line 835
    :cond_58
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    const-string v1, "blur"

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 836
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBlur"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 837
    if-eqz v0, :cond_0

    .line 838
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/16 v5, 0xf

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 412
    const v0, 0x7f0300ac

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 413
    const v0, 0x7f0d028e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->k:Landroid/widget/HorizontalScrollView;

    .line 414
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->k:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v4, Lcom/roidapp/photogrid/release/ct;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/ct;-><init>(Lcom/roidapp/photogrid/release/cs;)V

    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 426
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->k:Landroid/widget/HorizontalScrollView;

    new-instance v4, Lcom/roidapp/photogrid/release/cu;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/cu;-><init>(Lcom/roidapp/photogrid/release/cs;)V

    invoke-virtual {v0, v4}, Landroid/widget/HorizontalScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 467
    :goto_0
    const v0, 0x7f0d028d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    if-eqz v0, :cond_1

    .line 479
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 480
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->a(I)V

    .line 482
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x9

    if-ne v0, v4, :cond_0

    .line 483
    const v0, -0x42333333    # -0.1f

    iput v0, p0, Lcom/roidapp/photogrid/release/cs;->l:F

    .line 485
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v4, Lcom/roidapp/photogrid/release/cw;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/cw;-><init>(Lcom/roidapp/photogrid/release/cs;)V

    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 495
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 6094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 495
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    .line 496
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 498
    if-nez v4, :cond_2

    .line 499
    const-string v0, "120"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cs;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 500
    const/4 v1, 0x0

    .line 606
    :goto_1
    return-object v1

    .line 462
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 463
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 464
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 465
    const v0, 0x7f0300ab

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 502
    :cond_2
    array-length v0, v4

    if-ne v0, v2, :cond_4

    move v0, v2

    :goto_2
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/cs;->d:Z

    .line 503
    array-length v0, v4

    iput v0, p0, Lcom/roidapp/photogrid/release/cs;->m:I

    .line 507
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/cs;->f:I

    .line 514
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 516
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    .line 517
    array-length v0, v4

    if-lt v0, v5, :cond_3

    .line 518
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 520
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->v:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    goto :goto_1

    :cond_4
    move v0, v3

    .line 502
    goto :goto_2

    .line 523
    :pswitch_2
    array-length v0, v4

    iget v2, p0, Lcom/roidapp/photogrid/release/cs;->f:I

    if-lt v0, v2, :cond_5

    .line 524
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 526
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->w:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    .line 527
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto :goto_1

    .line 530
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    .line 541
    :goto_3
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->r:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    goto :goto_1

    .line 532
    :pswitch_5
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto :goto_3

    .line 535
    :pswitch_6
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto :goto_3

    .line 538
    :pswitch_7
    const-string v0, "GridActivity/Single/Shape"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto :goto_3

    .line 544
    :pswitch_8
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    .line 545
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 546
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->s:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 549
    :pswitch_9
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    .line 550
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 551
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->t:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 554
    :pswitch_a
    array-length v0, v4

    iget v2, p0, Lcom/roidapp/photogrid/release/cs;->f:I

    if-lt v0, v2, :cond_6

    .line 555
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 557
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->u:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    .line 558
    const-string v0, "GridActivity/Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 561
    :pswitch_b
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-nez v0, :cond_8

    .line 562
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    .line 566
    :cond_7
    :goto_4
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    .line 567
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cs;->x:[Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/cs;->c:Z

    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/photogrid/release/cs;->a(Landroid/view/LayoutInflater;[Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 563
    :cond_8
    array-length v0, v4

    if-lt v0, v5, :cond_7

    .line 564
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/cs;->e:Z

    goto :goto_4

    .line 570
    :pswitch_c
    const-string v0, "HighActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 573
    :pswitch_d
    const-string v0, "WideActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cs;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 514
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 530
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_7
    .end packed-switch
.end method

.class public final Lcom/roidapp/photogrid/release/da;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentDoodleTop"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentDoodle"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 144
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 145
    iget-object v1, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d028d

    const-string v3, "FragmentBottomMain"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 9

    .prologue
    const v8, 0x7f0c00c0

    const v7, 0x7f0c00bf

    const/16 v6, 0xff

    const/16 v5, 0x32

    const/4 v4, 0x0

    .line 78
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/da;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 79
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/da;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020411

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 80
    if-eqz p1, :cond_0

    .line 81
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 82
    iget-object v2, p0, Lcom/roidapp/photogrid/release/da;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/da;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/da;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v4, v0, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 88
    if-eqz p2, :cond_1

    .line 89
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/da;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 96
    return-void

    .line 84
    :cond_0
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 85
    iget-object v2, p0, Lcom/roidapp/photogrid/release/da;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/da;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v1, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/da;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 26
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 27
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 28
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v3

    .line 106
    if-nez v3, :cond_1

    .line 136
    :cond_0
    :goto_0
    return-void

    .line 109
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 111
    :pswitch_0
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/az;->a:Z

    if-eqz v0, :cond_0

    .line 114
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/da;->a()V

    .line 115
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/az;->a(Z)V

    .line 116
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->g()V

    goto :goto_0

    .line 119
    :pswitch_1
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/az;->a:Z

    if-eqz v0, :cond_0

    .line 122
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/da;->a()V

    .line 123
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/az;->a(Z)V

    .line 124
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->h()V

    goto :goto_0

    .line 127
    :pswitch_2
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->c()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_3

    :goto_2
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/da;->a(ZZ)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    .line 131
    :pswitch_3
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->e()V

    .line 132
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_3
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/az;->c()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_5

    :goto_4
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/da;->a(ZZ)V

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_3

    :cond_5
    move v1, v2

    goto :goto_4

    .line 109
    :pswitch_data_0
    .packed-switch 0x7f0d02a1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 33
    const v0, 0x7f0300af

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1098
    const v0, 0x7f0d02a1

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->a:Landroid/widget/TextView;

    .line 1099
    const v0, 0x7f0d02a4

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->b:Landroid/widget/TextView;

    .line 1100
    const v0, 0x7f0d02a3

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->c:Landroid/widget/TextView;

    .line 1101
    const v0, 0x7f0d02a2

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->d:Landroid/widget/TextView;

    .line 2039
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2040
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2041
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2042
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2044
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 2068
    :pswitch_0
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    .line 2071
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/da;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v4

    .line 2072
    if-eqz v4, :cond_0

    .line 2073
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/az;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/az;->c()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_3

    :goto_2
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/da;->a(ZZ)V

    .line 36
    :cond_0
    return-object v3

    .line 2046
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    .line 2049
    :pswitch_2
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    .line 2052
    :pswitch_3
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    .line 2055
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 2056
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    .line 2058
    :cond_1
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    .line 2062
    :pswitch_5
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    .line 2065
    :pswitch_6
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/da;->f:Ljava/lang/String;

    goto :goto_0

    :cond_2
    move v0, v2

    .line 2073
    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    .line 2044
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

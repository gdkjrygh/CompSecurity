.class public final Lcom/roidapp/photogrid/release/ia;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:[Ljava/lang/String;

.field private c:I

.field private d:[I

.field private e:Z

.field private f:Lcom/roidapp/photogrid/release/kp;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;[ILcom/roidapp/photogrid/release/kp;)V
    .locals 3

    .prologue
    .line 66
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ia;->e:Z

    .line 67
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    .line 69
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ia;->b:[Ljava/lang/String;

    .line 71
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ia;->d:[I

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900e3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v0, v2

    sub-float v0, v1, v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ia;->c:I

    .line 74
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ia;->f:Lcom/roidapp/photogrid/release/kp;

    .line 75
    return-void
.end method


# virtual methods
.method public final a([I)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ia;->d:[I

    .line 94
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->b:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 90
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 96
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ia;->e:Z

    if-eqz v0, :cond_0

    .line 97
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 98
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    :goto_0
    return-object v1

    .line 102
    :cond_0
    if-nez p2, :cond_1

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0300ce

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 109
    :goto_1
    if-nez v0, :cond_3

    .line 110
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 111
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 113
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300ce

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    :try_end_1
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 125
    :goto_2
    new-instance v2, Lcom/roidapp/photogrid/release/ib;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ib;-><init>(Lcom/roidapp/photogrid/release/ia;)V

    .line 126
    const v0, 0x7f0d0175

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/GridImageView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    .line 127
    const v0, 0x7f0d0366

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/ib;->c:Landroid/widget/ImageView;

    .line 128
    const v0, 0x7f0d0367

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    .line 129
    iget-object v0, v2, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/GridImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 130
    iget v3, p0, Lcom/roidapp/photogrid/release/ia;->c:I

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 131
    iget v3, p0, Lcom/roidapp/photogrid/release/ia;->c:I

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 132
    iget-object v3, v2, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/GridImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    iget-object v0, v2, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    iget v3, p0, Lcom/roidapp/photogrid/release/ia;->c:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ia;->c:I

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/photogrid/release/GridImageView;->a(II)V

    .line 134
    iget-object v0, v2, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/GridImageView;->a(I)V

    .line 135
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v2

    .line 151
    :goto_3
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ia;->d:[I

    aget v2, v2, p1

    iput v2, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    .line 152
    iget v2, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    if-nez v2, :cond_2

    .line 153
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 158
    :goto_4
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->c:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 167
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ia;->b:[Ljava/lang/String;

    aget-object v3, v3, p1

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/GridImageView;->setTag(Ljava/lang/Object;)V

    .line 195
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ia;->f:Lcom/roidapp/photogrid/release/kp;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ia;->b:[Ljava/lang/String;

    aget-object v3, v3, p1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, v3, v0, v5, v5}, Lcom/roidapp/photogrid/release/kp;->b(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    goto/16 :goto_0

    .line 106
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    move-object v0, v1

    .line 107
    goto/16 :goto_1

    .line 115
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ia;->e:Z

    .line 118
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    .line 120
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 121
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 137
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ib;

    move-object v1, p2

    goto :goto_3

    .line 155
    :cond_2
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 156
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    iget v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_3
    move-object v1, v0

    goto/16 :goto_2
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 226
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ia;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ia;->b:[Ljava/lang/String;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ia;->d:[I

    aget v3, v3, v1

    invoke-virtual {v0, v2, v1, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;II)V

    .line 229
    return-void
.end method

.class public abstract Lcom/roidapp/cloudlib/template/a/e;
.super Landroid/support/v7/widget/al;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/ads/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/al",
        "<",
        "Lcom/roidapp/cloudlib/template/a/f;",
        ">;",
        "Lcom/roidapp/cloudlib/ads/i;"
    }
.end annotation


# instance fields
.field protected final a:Landroid/content/Context;

.field protected final b:Lcom/roidapp/cloudlib/template/c/f;

.field protected c:Ljava/lang/String;

.field protected d:Lcom/roidapp/cloudlib/template/b;

.field protected e:Lcom/roidapp/cloudlib/template/a;

.field protected f:[Landroid/graphics/drawable/Drawable;

.field protected g:[Landroid/graphics/drawable/Drawable;

.field private h:[I

.field private i:I

.field private final j:I

.field private final k:I

.field private final l:Landroid/graphics/Rect;

.field private final m:Landroid/graphics/Rect;

.field private final n:Landroid/view/View$OnClickListener;

.field private final o:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private p:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/roidapp/cloudlib/ads/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 73
    invoke-direct {p0}, Landroid/support/v7/widget/al;-><init>()V

    .line 61
    iput v3, p0, Lcom/roidapp/cloudlib/template/a/e;->i:I

    .line 64
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->l:Landroid/graphics/Rect;

    .line 65
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->m:Landroid/graphics/Rect;

    .line 67
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->o:Landroid/support/v4/util/LongSparseArray;

    .line 74
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/a/e;->b:Lcom/roidapp/cloudlib/template/c/f;

    .line 75
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/c/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lcom/roidapp/cloudlib/template/a/e;->n:Landroid/view/View$OnClickListener;

    .line 77
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/c/f;->d()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/template/a/e;->j:I

    .line 78
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x42580000    # 54.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/template/a/e;->k:I

    .line 80
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->d:Lcom/roidapp/cloudlib/template/b;

    .line 81
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->e:Lcom/roidapp/cloudlib/template/a;

    .line 82
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    .line 84
    instance-of v0, p0, Lcom/roidapp/cloudlib/template/a/c;

    if-nez v0, :cond_0

    .line 85
    new-array v0, v5, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->r:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v0, v3

    .line 87
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->q:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v0, v4

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, v3

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aget-object v1, v1, v3

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, v4

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "ad"

    const-string v2, "templateAdPos"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/a/a;->d(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->h:[I

    .line 93
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->h:[I

    if-nez v0, :cond_0

    .line 94
    new-array v0, v5, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->h:[I

    .line 98
    :cond_0
    new-array v0, v5, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    .line 99
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->s:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v0, v3

    .line 100
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->n:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v0, v4

    .line 102
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->o:Landroid/support/v4/util/LongSparseArray;

    const-wide/32 v2, 0x77fda40a

    sget v1, Lcom/roidapp/cloudlib/aq;->Y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->o:Landroid/support/v4/util/LongSparseArray;

    const-wide/32 v2, 0x77fda407

    sget v1, Lcom/roidapp/cloudlib/aq;->Z:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->o:Landroid/support/v4/util/LongSparseArray;

    const-wide/32 v2, 0x77fda406

    sget v1, Lcom/roidapp/cloudlib/aq;->aa:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 105
    return-void

    .line 94
    :array_0
    .array-data 4
        0x4
        0x9
    .end array-data
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 303
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    const/4 v0, 0x1

    .line 306
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/ads/j;)I
    .locals 5

    .prologue
    const/4 v2, -0x1

    .line 246
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/roidapp/cloudlib/template/a/e;->i:I

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->h:[I

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 247
    iget v0, p0, Lcom/roidapp/cloudlib/template/a/e;->i:I

    if-lez v0, :cond_2

    .line 249
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v0, p0, Lcom/roidapp/cloudlib/template/a/e;->i:I

    if-ge v1, v0, :cond_2

    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->h:[I

    aget v0, v0, v1

    .line 251
    iget-object v3, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ads/j;

    .line 252
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/j;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/ads/j;->a()Ljava/lang/Object;

    move-result-object v4

    if-eq v3, v4, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/j;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/ads/j;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v2

    .line 263
    :goto_1
    return v0

    .line 249
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 258
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->h:[I

    iget v1, p0, Lcom/roidapp/cloudlib/template/a/e;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/roidapp/cloudlib/template/a/e;->i:I

    aget v0, v0, v1

    .line 259
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 260
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a/e;->c()V

    goto :goto_1

    :cond_3
    move v0, v2

    .line 263
    goto :goto_1
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 4

    .prologue
    .line 48
    .line 2109
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 2110
    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2111
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 2113
    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->a()V

    .line 2114
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2115
    new-instance v0, Lcom/roidapp/cloudlib/template/a/f;

    invoke-direct {v0, v1, p2}, Lcom/roidapp/cloudlib/template/a/f;-><init>(Landroid/view/View;I)V

    :goto_0
    return-object v0

    .line 2118
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/template/a/f;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/as;->Z:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lcom/roidapp/cloudlib/template/a/f;-><init>(Landroid/view/View;I)V

    goto :goto_0
.end method

.method public final synthetic a(Landroid/support/v7/widget/bi;I)V
    .locals 10

    .prologue
    .line 48
    check-cast p1, Lcom/roidapp/cloudlib/template/a/f;

    .line 1125
    iget v0, p1, Lcom/roidapp/cloudlib/template/a/f;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 1241
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ads/j;

    move-object v1, v0

    .line 1127
    :goto_0
    if-nez v1, :cond_0

    .line 1128
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1131
    :cond_0
    instance-of v0, p0, Lcom/roidapp/cloudlib/template/a/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/ads/j;->a(Ljava/lang/String;)V

    .line 1135
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1136
    if-nez v2, :cond_4

    .line 1137
    const/4 v2, 0x0

    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/roidapp/cloudlib/template/a/e;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/cloudlib/ads/j;->a(Landroid/view/View;Landroid/view/ViewGroup;Lcom/bumptech/glide/p;)Landroid/view/View;

    move-result-object v1

    .line 1138
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1143
    :cond_2
    :goto_1
    return-void

    .line 1241
    :cond_3
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_0

    .line 1141
    :cond_4
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/roidapp/cloudlib/template/a/e;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/cloudlib/ads/j;->a(Landroid/view/View;Landroid/view/ViewGroup;Lcom/bumptech/glide/p;)Landroid/view/View;

    goto :goto_1

    .line 1145
    :cond_5
    invoke-virtual {p0, p2}, Lcom/roidapp/cloudlib/template/a/e;->e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v2

    .line 1146
    if-eqz v2, :cond_2

    .line 1147
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v4

    .line 1149
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->u:Landroid/view/View;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->n:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1150
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->n:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1151
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->n:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1152
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->u:Landroid/view/View;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1153
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1154
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1157
    iget v1, p0, Lcom/roidapp/cloudlib/template/a/e;->j:I

    .line 1158
    int-to-float v0, v1

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->l()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v0, v3

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->k()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 1159
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 1160
    iput v1, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1161
    iput v3, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1164
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->l:Landroid/graphics/Rect;

    const/4 v7, 0x0

    iput v7, v0, Landroid/graphics/Rect;->left:I

    .line 1165
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->l:Landroid/graphics/Rect;

    div-int/lit8 v7, v1, 0x2

    iput v7, v0, Landroid/graphics/Rect;->right:I

    .line 1166
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->l:Landroid/graphics/Rect;

    const/4 v7, 0x0

    iput v7, v0, Landroid/graphics/Rect;->top:I

    .line 1167
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->l:Landroid/graphics/Rect;

    iget v7, p0, Lcom/roidapp/cloudlib/template/a/e;->k:I

    iput v7, v0, Landroid/graphics/Rect;->bottom:I

    .line 1168
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1169
    new-instance v7, Landroid/view/TouchDelegate;

    iget-object v8, p0, Lcom/roidapp/cloudlib/template/a/e;->l:Landroid/graphics/Rect;

    iget-object v9, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    invoke-direct {v7, v8, v9}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    invoke-virtual {v0, v7}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 1171
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->m:Landroid/graphics/Rect;

    div-int/lit8 v7, v1, 0x2

    iput v7, v0, Landroid/graphics/Rect;->left:I

    .line 1172
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->m:Landroid/graphics/Rect;

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 1173
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->m:Landroid/graphics/Rect;

    const/4 v7, 0x0

    iput v7, v0, Landroid/graphics/Rect;->top:I

    .line 1174
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->m:Landroid/graphics/Rect;

    iget v7, p0, Lcom/roidapp/cloudlib/template/a/e;->k:I

    iput v7, v0, Landroid/graphics/Rect;->bottom:I

    .line 1175
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1176
    new-instance v7, Landroid/view/TouchDelegate;

    iget-object v8, p0, Lcom/roidapp/cloudlib/template/a/e;->m:Landroid/graphics/Rect;

    iget-object v9, p1, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    invoke-direct {v7, v8, v9}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    invoke-virtual {v0, v7}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 1178
    invoke-static {v4, v5}, Lcom/roidapp/cloudlib/template/j;->a(J)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1179
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v7

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->o:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v4, v5}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v7, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/Integer;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v1, v3}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1195
    :goto_2
    instance-of v0, p0, Lcom/roidapp/cloudlib/template/a/c;

    if-nez v0, :cond_9

    .line 1196
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 1197
    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1198
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v1, v4, v6

    if-eqz v1, :cond_7

    .line 1199
    :cond_6
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    .line 1201
    :cond_7
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->d()I

    move-result v1

    .line 1202
    iget-object v3, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(Landroid/widget/ProgressBar;)V

    .line 1203
    if-eqz v1, :cond_8

    const/16 v3, 0x64

    if-ne v1, v3, :cond_b

    .line 1204
    :cond_8
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1218
    :cond_9
    :goto_3
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->n()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->o()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1219
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1223
    :goto_4
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->l:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1225
    invoke-virtual {p0, p1, v2}, Lcom/roidapp/cloudlib/template/a/e;->a(Lcom/roidapp/cloudlib/template/a/f;Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto/16 :goto_1

    .line 1186
    :cond_a
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    sget-object v7, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v7}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v1, v3}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_2

    .line 1205
    :cond_b
    const/4 v3, 0x1

    if-ne v1, v3, :cond_c

    .line 1206
    iget-object v3, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1207
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->n:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1208
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->n:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1209
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_3

    .line 1211
    :cond_c
    iget-object v3, p1, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1212
    iget-object v3, p1, Lcom/roidapp/cloudlib/template/a/f;->n:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "%"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1213
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->n:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1214
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_3

    .line 1221
    :cond_d
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->r:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_4
.end method

.method abstract a(Lcom/roidapp/cloudlib/template/a/f;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 298
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/a/e;->c:Ljava/lang/String;

    .line 299
    return-void
.end method

.method public abstract a(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract d()V
.end method

.method public abstract e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
.end method

.method public e()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 283
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    aput-object v2, v1, v4

    aput-object v2, v0, v3

    .line 285
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->f:[Landroid/graphics/drawable/Drawable;

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 288
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    aput-object v2, v1, v4

    aput-object v2, v0, v3

    .line 289
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->g:[Landroid/graphics/drawable/Drawable;

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    if-eqz v0, :cond_2

    .line 292
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 293
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    .line 295
    :cond_2
    return-void
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(I)I
    .locals 3

    .prologue
    .line 272
    .line 273
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    .line 274
    const/4 v0, 0x0

    move v1, p1

    :goto_0
    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 275
    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/e;->p:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    if-le p1, v2, :cond_0

    .line 276
    add-int/lit8 v1, v1, -0x1

    .line 274
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v1, p1

    .line 279
    :cond_2
    return v1
.end method

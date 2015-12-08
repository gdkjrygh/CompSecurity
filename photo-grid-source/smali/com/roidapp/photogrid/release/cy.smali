.class public final Lcom/roidapp/photogrid/release/cy;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Ljava/lang/Integer;

.field private e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private f:I

.field private g:[Landroid/widget/CheckedTextView;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Landroid/widget/RelativeLayout;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/RelativeLayout;

.field private n:I

.field private o:Landroid/widget/HorizontalScrollView;

.field private p:Ljava/lang/String;

.field private q:Z

.field private r:Landroid/widget/HorizontalScrollView;

.field private s:I

.field private t:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 33
    const v0, -0x5ffd7

    iput v0, p0, Lcom/roidapp/photogrid/release/cy;->f:I

    .line 36
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/cy;->q:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cy;I)I
    .locals 0

    .prologue
    .line 28
    iput p1, p0, Lcom/roidapp/photogrid/release/cy;->f:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cy;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cy;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cy;->d:Ljava/lang/Integer;

    return-object p1
.end method

.method private a(I)V
    .locals 11
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    const/4 v10, 0x1

    const/4 v1, 0x0

    .line 205
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cy;->g:[Landroid/widget/CheckedTextView;

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 206
    new-instance v5, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 208
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 209
    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 210
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 212
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 213
    invoke-virtual {v7, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 214
    const v8, -0x9c938a

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 216
    new-array v8, v10, [I

    const v9, 0x10100a0

    aput v9, v8, v1

    invoke-virtual {v5, v8, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 217
    new-array v8, v10, [I

    const v9, 0x10100a7

    aput v9, v8, v1

    invoke-virtual {v5, v8, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 218
    new-array v6, v1, [I

    invoke-virtual {v5, v6, v7}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 220
    invoke-static {}, Lcom/roidapp/baselib/c/n;->g()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 221
    invoke-virtual {v4, v5}, Landroid/widget/CheckedTextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 205
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 224
    :cond_0
    invoke-virtual {v4, v5}, Landroid/widget/CheckedTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 227
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->r:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 231
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cy;->g:[Landroid/widget/CheckedTextView;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 232
    if-ne v0, p1, :cond_0

    .line 233
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cy;->g:[Landroid/widget/CheckedTextView;

    aget-object v2, v2, v0

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 234
    add-int/lit8 v2, p1, 0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    .line 231
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 237
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cy;->g:[Landroid/widget/CheckedTextView;

    aget-object v2, v2, v0

    invoke-virtual {v2, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    goto :goto_1

    .line 239
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/cy;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/cy;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/cy;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/photogrid/release/cy;->t:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/cy;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/cy;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/photogrid/release/cy;->s:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/cy;)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/cy;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 186
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 4

    .prologue
    const v3, 0x7f02037b

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 188
    if-eqz p1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1, v3, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00bf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 197
    :goto_0
    return-void

    .line 192
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 193
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 194
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 46
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 47
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 48
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 11

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x1

    const/high16 v8, 0x40c00000    # 6.0f

    const/16 v7, 0x8

    const/4 v6, 0x0

    .line 251
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->e:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v0

    .line 252
    if-nez v0, :cond_1

    .line 374
    :cond_0
    :goto_0
    return-void

    .line 256
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 258
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->a:Landroid/widget/TextView;

    const v2, 0x7f020389

    invoke-virtual {v1, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 259
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->b:Landroid/widget/TextView;

    const v2, 0x7f0203d0

    invoke-virtual {v1, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 260
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->b:Landroid/widget/TextView;

    const v2, 0x7f07022a

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 261
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 262
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_4

    .line 263
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    const v2, 0x7f02037b

    invoke-virtual {v1, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 270
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 271
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 272
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 273
    iput-boolean v9, p0, Lcom/roidapp/photogrid/release/cy;->q:Z

    .line 275
    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    if-eq v1, v9, :cond_2

    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 276
    :cond_2
    iput v10, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    .line 277
    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/az;->a(F)V

    .line 279
    :cond_3
    const/4 v1, -0x1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->a(I)V

    .line 280
    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 281
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->a()V

    .line 282
    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/az;->a(I)V

    .line 283
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->invalidate()V

    goto :goto_0

    .line 265
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02037b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 266
    const/16 v2, 0xa5

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 267
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v1, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 288
    :pswitch_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->a:Landroid/widget/TextView;

    const v2, 0x7f020388

    invoke-virtual {v1, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 289
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->b:Landroid/widget/TextView;

    const v2, 0x7f0203ce

    invoke-virtual {v1, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 290
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->b:Landroid/widget/TextView;

    const v2, 0x7f07010d

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 291
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 292
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 293
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 294
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 295
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/cy;->q:Z

    .line 296
    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_5

    .line 297
    iput v10, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    .line 298
    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/az;->a(F)V

    .line 300
    :cond_5
    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->f:I

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->a(I)V

    .line 301
    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 302
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getVisibility()I

    move-result v1

    if-ne v1, v7, :cond_7

    .line 303
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1, v6}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 308
    :cond_6
    :goto_2
    iget v1, p0, Lcom/roidapp/photogrid/release/cy;->f:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(I)V

    .line 309
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->invalidate()V

    goto/16 :goto_0

    .line 305
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_6

    .line 306
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1, v7}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    goto :goto_2

    .line 312
    :pswitch_3
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 314
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->i()V

    .line 316
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->invalidate()V

    goto/16 :goto_0

    .line 326
    :pswitch_4
    invoke-direct {p0, v6}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 327
    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(F)V

    goto/16 :goto_0

    .line 335
    :pswitch_5
    invoke-direct {p0, v9}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 336
    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(F)V

    goto/16 :goto_0

    .line 344
    :pswitch_6
    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 345
    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/az;->a(F)V

    goto/16 :goto_0

    .line 353
    :pswitch_7
    invoke-direct {p0, v10}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 354
    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(F)V

    goto/16 :goto_0

    .line 362
    :pswitch_8
    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 363
    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(F)V

    goto/16 :goto_0

    .line 366
    :pswitch_9
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/cy;->q:Z

    if-eqz v1, :cond_0

    .line 368
    const/4 v1, 0x5

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 369
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(F)V

    goto/16 :goto_0

    .line 256
    :pswitch_data_0
    .packed-switch 0x7f0d0292
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .prologue
    .line 51
    const v0, 0x7f0300ae

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 52
    const v0, 0x7f0d0290

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->r:Landroid/widget/HorizontalScrollView;

    .line 53
    const v0, 0x7f0d0291

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 54
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900d1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/cy;->s:I

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cy;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/cy;->t:I

    .line 56
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v0

    iget-object v8, v0, Lcom/roidapp/baselib/c/p;->i:[I

    .line 57
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    array-length v0, v8

    if-ge v6, v0, :cond_1

    .line 58
    aget v5, v8, v6

    .line 59
    add-int/lit16 v4, v6, 0x2710

    .line 60
    const v0, 0x7f030129

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 61
    const v0, 0x7f0d0494

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 63
    const v1, 0x7f0d0493

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 64
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 65
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    iget v10, p0, Lcom/roidapp/photogrid/release/cy;->s:I

    div-int/lit8 v10, v10, 0x2

    iget v11, p0, Lcom/roidapp/photogrid/release/cy;->s:I

    invoke-direct {v9, v10, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    iget v10, p0, Lcom/roidapp/photogrid/release/cy;->s:I

    div-int/lit8 v10, v10, 0x2

    iget v11, p0, Lcom/roidapp/photogrid/release/cy;->s:I

    invoke-direct {v9, v10, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 69
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x3

    if-ne v6, v0, :cond_0

    .line 71
    const v0, 0x7f0d0493

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 72
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->d:Ljava/lang/Integer;

    .line 74
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/release/cz;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/cz;-><init>(Lcom/roidapp/photogrid/release/cy;Landroid/view/ViewGroup;Landroid/view/View;II)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 1121
    :cond_1
    const v0, 0x7f0d0293

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->b:Landroid/widget/TextView;

    .line 1122
    const v0, 0x7f0d0292

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->a:Landroid/widget/TextView;

    .line 1123
    const v0, 0x7f0d02a0

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    .line 1125
    const v0, 0x7f0d0295

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    .line 1126
    const v1, 0x7f0d0297

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckedTextView;

    .line 1127
    const v2, 0x7f0d0299

    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckedTextView;

    .line 1128
    const v3, 0x7f0d029b

    invoke-virtual {v7, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckedTextView;

    .line 1129
    const v4, 0x7f0d029d

    invoke-virtual {v7, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/CheckedTextView;

    .line 1130
    const v5, 0x7f0d029f

    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/CheckedTextView;

    .line 1131
    const/4 v6, 0x6

    new-array v6, v6, [Landroid/widget/CheckedTextView;

    const/4 v8, 0x0

    aput-object v0, v6, v8

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    aput-object v4, v6, v0

    const/4 v0, 0x5

    aput-object v5, v6, v0

    iput-object v6, p0, Lcom/roidapp/photogrid/release/cy;->g:[Landroid/widget/CheckedTextView;

    .line 1133
    const v0, 0x7f0d0294

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->h:Landroid/widget/RelativeLayout;

    .line 1134
    const v0, 0x7f0d0296

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->i:Landroid/widget/RelativeLayout;

    .line 1135
    const v0, 0x7f0d0298

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->j:Landroid/widget/RelativeLayout;

    .line 1136
    const v0, 0x7f0d029a

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->k:Landroid/widget/RelativeLayout;

    .line 1137
    const v0, 0x7f0d029c

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->l:Landroid/widget/RelativeLayout;

    .line 1138
    const v0, 0x7f0d029e

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->m:Landroid/widget/RelativeLayout;

    .line 1139
    const v0, 0x7f0d0290

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->o:Landroid/widget/HorizontalScrollView;

    .line 1143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cy;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1152
    iget v0, p0, Lcom/roidapp/photogrid/release/cy;->f:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/cy;->a(I)V

    .line 1153
    iget v0, p0, Lcom/roidapp/photogrid/release/cy;->n:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/cy;->b(I)V

    .line 1154
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 1178
    :pswitch_0
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    .line 117
    :goto_1
    return-object v7

    .line 1156
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1159
    :pswitch_2
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1162
    :pswitch_3
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1165
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1166
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1168
    :cond_2
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1172
    :pswitch_5
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1175
    :pswitch_6
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cy;->p:Ljava/lang/String;

    goto :goto_1

    .line 1154
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

.class public Lcom/facebook/widget/images/UrlImage;
.super Lcom/facebook/widget/f;
.source "UrlImage.java"

# interfaces
.implements Lcom/facebook/widget/p;


# static fields
.field public static final a:Lcom/facebook/ui/images/b/m;

.field private static b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final c:[Landroid/widget/ImageView$ScaleType;

.field private static final d:[Lcom/facebook/widget/images/j;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:Z

.field private G:Lcom/facebook/ui/images/d/h;

.field private H:Z

.field private I:Landroid/graphics/Bitmap;

.field private final e:Lcom/facebook/ui/images/b/h;

.field private final f:Lcom/facebook/ui/images/b/c;

.field private g:Landroid/view/LayoutInflater;

.field private final h:Lcom/facebook/common/v/j;

.field private final i:Lcom/facebook/ui/images/cache/a;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/ProgressBar;

.field private l:Landroid/view/animation/Animation;

.field private m:Landroid/widget/ProgressBar;

.field private n:Landroid/view/View;

.field private final o:Lcom/facebook/widget/images/i;

.field private final p:Lcom/facebook/widget/images/i;

.field private q:Lcom/facebook/widget/images/h;

.field private r:Z

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/b/w;",
            ">;"
        }
    .end annotation
.end field

.field private t:Lcom/facebook/widget/images/k;

.field private u:Z

.field private v:Lcom/facebook/widget/images/j;

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 62
    const-class v0, Lcom/facebook/widget/images/UrlImage;

    sput-object v0, Lcom/facebook/widget/images/UrlImage;->b:Ljava/lang/Class;

    .line 64
    const/4 v0, 0x0

    sput-object v0, Lcom/facebook/widget/images/UrlImage;->a:Lcom/facebook/ui/images/b/m;

    .line 72
    const/16 v0, 0x8

    new-array v0, v0, [Landroid/widget/ImageView$ScaleType;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    aput-object v1, v0, v3

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    aput-object v1, v0, v4

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_START:Landroid/widget/ImageView$ScaleType;

    aput-object v1, v0, v5

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    aput-object v1, v0, v6

    const/4 v1, 0x4

    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/widget/images/UrlImage;->c:[Landroid/widget/ImageView$ScaleType;

    .line 83
    new-array v0, v6, [Lcom/facebook/widget/images/j;

    sget-object v1, Lcom/facebook/widget/images/j;->NONE:Lcom/facebook/widget/images/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/images/j;->LOW_RES:Lcom/facebook/widget/images/j;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/widget/images/j;->FULL_RES:Lcom/facebook/widget/images/j;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/widget/images/UrlImage;->d:[Lcom/facebook/widget/images/j;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 171
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/widget/images/UrlImage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 172
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 175
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/images/UrlImage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 176
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v6, -0x1

    const/4 v5, 0x0

    .line 179
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 131
    new-instance v0, Lcom/facebook/widget/images/i;

    invoke-direct {v0, v1}, Lcom/facebook/widget/images/i;-><init>(Lcom/facebook/widget/images/f;)V

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    .line 134
    new-instance v0, Lcom/facebook/widget/images/i;

    invoke-direct {v0, v1}, Lcom/facebook/widget/images/i;-><init>(Lcom/facebook/widget/images/f;)V

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    .line 142
    sget-object v0, Lcom/facebook/widget/images/j;->NONE:Lcom/facebook/widget/images/j;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->v:Lcom/facebook/widget/images/j;

    .line 153
    iput-boolean v5, p0, Lcom/facebook/widget/images/UrlImage;->F:Z

    .line 158
    iput-boolean v5, p0, Lcom/facebook/widget/images/UrlImage;->H:Z

    .line 180
    invoke-virtual {p0}, Lcom/facebook/widget/images/UrlImage;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 181
    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    .line 182
    const-class v0, Lcom/facebook/ui/images/b/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/h;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->e:Lcom/facebook/ui/images/b/h;

    .line 183
    const-class v0, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/cache/a;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->i:Lcom/facebook/ui/images/cache/a;

    .line 184
    const-class v0, Lcom/facebook/ui/images/b/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/c;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->f:Lcom/facebook/ui/images/b/c;

    .line 186
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    iput-object v2, v0, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    .line 187
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    iput-object v2, v0, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    .line 189
    sget-object v0, Lcom/facebook/q;->UrlImage:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 190
    sget v0, Lcom/facebook/q;->UrlImage_loadResolutionDuringScroll:I

    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 192
    if-ltz v0, :cond_0

    .line 193
    sget-object v3, Lcom/facebook/widget/images/UrlImage;->d:[Lcom/facebook/widget/images/j;

    aget-object v0, v3, v0

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->v:Lcom/facebook/widget/images/j;

    .line 196
    :cond_0
    sget v0, Lcom/facebook/q;->UrlImage_shouldCacheOriginal:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->C:Z

    .line 198
    sget v0, Lcom/facebook/q;->UrlImage_shouldShowLoadingAnimation:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->D:Z

    .line 200
    sget v0, Lcom/facebook/b;->fade_in_thumbnail:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->l:Landroid/view/animation/Animation;

    .line 204
    sget v0, Lcom/facebook/q;->UrlImage_isShownInGallery:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->x:Z

    .line 205
    sget v0, Lcom/facebook/q;->UrlImage_useZoomableImageView:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->y:Z

    .line 207
    sget v0, Lcom/facebook/q;->UrlImage_useQuickContactBadge:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->z:Z

    .line 209
    sget v0, Lcom/facebook/q;->UrlImage_isUsedWithUploadProgress:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->A:Z

    .line 211
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->x:Z

    if-eqz v0, :cond_4

    .line 212
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    sget v3, Lcom/facebook/k;->orca_url_image_gallery:I

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 222
    :goto_0
    sget v0, Lcom/facebook/i;->url_image_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    .line 223
    sget v0, Lcom/facebook/i;->url_image_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    .line 224
    sget v0, Lcom/facebook/i;->url_image_upload_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->m:Landroid/widget/ProgressBar;

    .line 225
    sget v0, Lcom/facebook/i;->url_image_upload_cover:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->n:Landroid/view/View;

    .line 227
    sget v0, Lcom/facebook/q;->UrlImage_url:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 228
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 229
    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    iput-object v0, v3, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    .line 234
    :cond_1
    sget v0, Lcom/facebook/q;->UrlImage_scaleType:I

    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 235
    if-ltz v0, :cond_2

    .line 236
    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    sget-object v4, Lcom/facebook/widget/images/UrlImage;->c:[Landroid/widget/ImageView$ScaleType;

    aget-object v0, v4, v0

    iput-object v0, v3, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    .line 238
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    sget v3, Lcom/facebook/q;->UrlImage_adjustViewBounds:I

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v0, Lcom/facebook/widget/images/i;->j:Z

    .line 241
    sget v0, Lcom/facebook/q;->UrlImage_placeHolderScaleType:I

    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 243
    if-ltz v0, :cond_3

    .line 244
    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    sget-object v4, Lcom/facebook/widget/images/UrlImage;->c:[Landroid/widget/ImageView$ScaleType;

    aget-object v0, v4, v0

    iput-object v0, v3, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    .line 246
    :cond_3
    sget v0, Lcom/facebook/q;->UrlImage_showProgressBar:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->r:Z

    .line 247
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    sget v3, Lcom/facebook/q;->UrlImage_placeholderSrc:I

    sget v4, Lcom/facebook/h;->orca_photo_downloading:I

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    .line 250
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    .line 251
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v3, v3, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 252
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v3, v3, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 256
    sget v0, Lcom/facebook/q;->UrlImage_retainImageDuringUpdate:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->B:Z

    .line 259
    sget v0, Lcom/facebook/q;->UrlImage_shouldRetryFetch:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setShouldRetryFetch(Z)V

    .line 262
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 264
    const-class v0, Lcom/facebook/common/v/f;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/f;

    .line 266
    new-instance v1, Lcom/facebook/widget/images/f;

    invoke-direct {v1, p0}, Lcom/facebook/widget/images/f;-><init>(Lcom/facebook/widget/images/UrlImage;)V

    iput-object v1, p0, Lcom/facebook/widget/images/UrlImage;->h:Lcom/facebook/common/v/j;

    .line 272
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->h:Lcom/facebook/common/v/j;

    invoke-virtual {v0, v1}, Lcom/facebook/common/v/f;->a(Lcom/facebook/common/v/j;)V

    .line 273
    return-void

    .line 213
    :cond_4
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->y:Z

    if-eqz v0, :cond_5

    .line 214
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    sget v3, Lcom/facebook/k;->orca_url_zoomable_image:I

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto/16 :goto_0

    .line 215
    :cond_5
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->z:Z

    if-eqz v0, :cond_6

    .line 216
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    sget v3, Lcom/facebook/k;->orca_url_quick_contact_badge:I

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto/16 :goto_0

    .line 217
    :cond_6
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->A:Z

    if-eqz v0, :cond_7

    .line 218
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    sget v3, Lcom/facebook/k;->orca_url_image_upload_progress:I

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto/16 :goto_0

    .line 220
    :cond_7
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    sget v3, Lcom/facebook/k;->orca_url_image:I

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/widget/images/UrlImage;)Ljava/util/List;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    return-object v0
.end method

.method private a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 912
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    instance-of v0, v0, Lcom/facebook/widget/images/ImageViewTouchBase;

    if-eqz v0, :cond_0

    .line 913
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    check-cast v0, Lcom/facebook/widget/images/ImageViewTouchBase;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/images/ImageViewTouchBase;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 917
    :goto_0
    return-void

    .line 915
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/widget/images/UrlImage;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/widget/images/UrlImage;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/images/UrlImage;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/widget/images/UrlImage;->b(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/facebook/widget/images/i;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 873
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v1, p1, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 874
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v1, p1, Lcom/facebook/widget/images/i;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 875
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-boolean v1, p1, Lcom/facebook/widget/images/i;->j:Z

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 877
    iget-object v0, p1, Lcom/facebook/widget/images/i;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/facebook/widget/images/i;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 878
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v1, p1, Lcom/facebook/widget/images/i;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 882
    :goto_0
    iget-object v0, p1, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 883
    iget-object v0, p1, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->a(Landroid/graphics/drawable/Drawable;)V

    .line 892
    :goto_1
    iget-object v0, p1, Lcom/facebook/widget/images/i;->i:Lcom/facebook/ui/images/d/h;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->G:Lcom/facebook/ui/images/d/h;

    .line 893
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->g()V

    .line 894
    return-void

    .line 880
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 884
    :cond_1
    iget-object v0, p1, Lcom/facebook/widget/images/i;->e:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 885
    iget-object v0, p1, Lcom/facebook/widget/images/i;->e:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->a(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 886
    :cond_2
    iget-object v0, p1, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v2, :cond_3

    .line 887
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v1, p1, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 889
    :cond_3
    invoke-direct {p0, v3}, Lcom/facebook/widget/images/UrlImage;->a(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 780
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    .line 787
    :goto_0
    return-void

    .line 785
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    .line 786
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setMode(Lcom/facebook/widget/images/h;)V

    goto :goto_0
.end method

.method private a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/b/m;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 706
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v1

    .line 708
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v2

    .line 710
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/m;

    .line 711
    new-instance v4, Lcom/facebook/ui/images/b/w;

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v5

    iget-object v6, p0, Lcom/facebook/widget/images/UrlImage;->e:Lcom/facebook/ui/images/b/h;

    iget-object v7, p0, Lcom/facebook/widget/images/UrlImage;->f:Lcom/facebook/ui/images/b/c;

    invoke-direct {v4, v5, v6, v7, v0}, Lcom/facebook/ui/images/b/w;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/c;Lcom/facebook/ui/images/b/m;)V

    .line 713
    invoke-virtual {p0}, Lcom/facebook/widget/images/UrlImage;->getShouldRetryFetch()Z

    move-result v0

    invoke-virtual {v4, v0}, Lcom/facebook/ui/images/b/w;->a(Z)V

    .line 714
    invoke-virtual {v4}, Lcom/facebook/ui/images/b/w;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 715
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 716
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 720
    :cond_0
    iput-object v1, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    .line 722
    invoke-static {v2}, Lcom/google/common/d/a/i;->a(Ljava/lang/Iterable;)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v2, Lcom/facebook/widget/images/g;

    invoke-direct {v2, p0, v1}, Lcom/facebook/widget/images/g;-><init>(Lcom/facebook/widget/images/UrlImage;Ljava/util/List;)V

    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->f:Lcom/facebook/ui/images/b/c;

    invoke-static {v0, v2, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 735
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 750
    iput-object v2, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    .line 752
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/r;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 753
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-lez v0, :cond_2

    .line 756
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/facebook/widget/images/UrlImage;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 766
    :goto_0
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object v0, v1, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    .line 767
    if-eqz v0, :cond_1

    .line 768
    sget-object v1, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    invoke-direct {p0, v1}, Lcom/facebook/widget/images/UrlImage;->setMode(Lcom/facebook/widget/images/h;)V

    .line 769
    iget-boolean v1, p0, Lcom/facebook/widget/images/UrlImage;->C:Z

    if-eqz v1, :cond_0

    .line 770
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->e()V

    .line 773
    :cond_0
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->t:Lcom/facebook/widget/images/k;

    if-eqz v1, :cond_1

    .line 774
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->t:Lcom/facebook/widget/images/k;

    invoke-interface {v1, v0}, Lcom/facebook/widget/images/k;->a(Landroid/graphics/drawable/Drawable;)V

    .line 777
    :cond_1
    return-void

    .line 757
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    if-eqz v0, :cond_4

    .line 759
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 760
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 761
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/r;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {v2, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 760
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 763
    :cond_3
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/ab;->b()Lcom/facebook/ui/images/base/a;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/facebook/ui/images/base/a;->a(Ljava/util/List;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v0, v2

    goto :goto_0
.end method

.method private b()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 308
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v1, v1, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/facebook/widget/images/UrlImage;->w:Z

    if-eqz v1, :cond_1

    .line 313
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v2, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-eq v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 611
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 614
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/w;

    .line 615
    invoke-virtual {v0}, Lcom/facebook/ui/images/b/w;->c()V

    goto :goto_0

    .line 617
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->s:Ljava/util/List;

    .line 619
    :cond_1
    return-void
.end method

.method private d()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 626
    iput-boolean v1, p0, Lcom/facebook/widget/images/UrlImage;->w:Z

    .line 627
    iput-boolean v1, p0, Lcom/facebook/widget/images/UrlImage;->H:Z

    .line 629
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->c()V

    .line 632
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iput-object v7, v0, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    .line 633
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    if-eqz v0, :cond_0

    .line 634
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    .line 635
    if-eqz v0, :cond_0

    .line 636
    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->i:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v3, v0}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 637
    if-eqz v0, :cond_0

    .line 638
    iget-object v3, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/facebook/widget/images/UrlImage;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object v4, v3, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    .line 644
    :cond_0
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->getImagesToDownload()Ljava/util/List;

    move-result-object v3

    .line 645
    iput-object v7, p0, Lcom/facebook/widget/images/UrlImage;->I:Landroid/graphics/Bitmap;

    .line 646
    if-eqz v3, :cond_4

    .line 648
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 649
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/m;

    .line 650
    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v6

    .line 651
    if-eqz v6, :cond_1

    .line 652
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->i:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0, v6}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 653
    if-eqz v0, :cond_2

    .line 654
    invoke-static {v6}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/facebook/ui/images/b/t;->a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v6, Lcom/facebook/ui/images/b/v;->MEMORY_CACHE:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v6}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 660
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->C:Z

    if-eqz v0, :cond_1

    .line 661
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->e()V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 669
    :goto_1
    if-eqz v0, :cond_4

    .line 670
    iput-boolean v2, p0, Lcom/facebook/widget/images/UrlImage;->H:Z

    .line 671
    invoke-direct {p0, v4}, Lcom/facebook/widget/images/UrlImage;->b(Ljava/util/List;)V

    .line 703
    :cond_3
    :goto_2
    return-void

    .line 676
    :cond_4
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object v7, v0, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    .line 677
    if-eqz v3, :cond_a

    .line 679
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->u:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->v:Lcom/facebook/widget/images/j;

    sget-object v4, Lcom/facebook/widget/images/j;->FULL_RES:Lcom/facebook/widget/images/j;

    if-eq v0, v4, :cond_7

    .line 680
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->r:Z

    if-eqz v0, :cond_5

    sget-object v0, Lcom/facebook/widget/images/h;->PROGRESS_BAR:Lcom/facebook/widget/images/h;

    :goto_3
    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setLoadingMode(Lcom/facebook/widget/images/h;)V

    .line 681
    iput-boolean v2, p0, Lcom/facebook/widget/images/UrlImage;->w:Z

    .line 682
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->v:Lcom/facebook/widget/images/j;

    sget-object v1, Lcom/facebook/widget/images/j;->NONE:Lcom/facebook/widget/images/j;

    if-eq v0, v1, :cond_3

    .line 686
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 687
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/m;

    .line 688
    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->k()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 680
    :cond_5
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    goto :goto_3

    .line 690
    :cond_6
    invoke-direct {p0, v1}, Lcom/facebook/widget/images/UrlImage;->a(Ljava/util/List;)V

    goto :goto_2

    .line 692
    :cond_7
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->w:Z

    if-nez v0, :cond_8

    .line 695
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->r:Z

    if-eqz v0, :cond_9

    sget-object v0, Lcom/facebook/widget/images/h;->PROGRESS_BAR:Lcom/facebook/widget/images/h;

    :goto_5
    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setLoadingMode(Lcom/facebook/widget/images/h;)V

    .line 697
    :cond_8
    iput-boolean v1, p0, Lcom/facebook/widget/images/UrlImage;->w:Z

    .line 698
    invoke-direct {p0, v3}, Lcom/facebook/widget/images/UrlImage;->a(Ljava/util/List;)V

    goto :goto_2

    .line 695
    :cond_9
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    goto :goto_5

    .line 701
    :cond_a
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setMode(Lcom/facebook/widget/images/h;)V

    goto :goto_2

    :cond_b
    move v0, v2

    goto :goto_1
.end method

.method private e()V
    .locals 2

    .prologue
    .line 740
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    if-eqz v0, :cond_0

    .line 741
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    .line 742
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->i:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 743
    if-eqz v0, :cond_0

    .line 744
    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->I:Landroid/graphics/Bitmap;

    .line 747
    :cond_0
    return-void
.end method

.method private f()V
    .locals 3

    .prologue
    .line 865
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    if-nez v0, :cond_0

    .line 866
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->g:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_url_image_progress_bar:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    .line 868
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->addView(Landroid/view/View;)V

    .line 870
    :cond_0
    return-void
.end method

.method private g()V
    .locals 6

    .prologue
    .line 897
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->G:Lcom/facebook/ui/images/d/h;

    if-eqz v0, :cond_0

    .line 898
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 899
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 900
    if-eqz v0, :cond_0

    .line 901
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/facebook/widget/images/UrlImage;->G:Lcom/facebook/ui/images/d/h;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/images/UrlImage;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/widget/images/UrlImage;->getHeight()I

    move-result v5

    invoke-virtual {v2, v3, v0, v4, v5}, Lcom/facebook/ui/images/d/h;->a(IIII)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 909
    :cond_0
    return-void
.end method

.method private getImagesToDownload()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/b/m;",
            ">;"
        }
    .end annotation

    .prologue
    .line 790
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    if-eqz v0, :cond_0

    .line 791
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    .line 795
    :goto_0
    return-object v0

    .line 792
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    if-eqz v0, :cond_1

    .line 793
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/ab;->a()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 795
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private setLoadingMode(Lcom/facebook/widget/images/h;)V
    .locals 2

    .prologue
    .line 855
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->B:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-eq p1, v0, :cond_0

    .line 862
    :goto_0
    return-void

    .line 861
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/widget/images/UrlImage;->setMode(Lcom/facebook/widget/images/h;)V

    goto :goto_0
.end method

.method private setMode(Lcom/facebook/widget/images/h;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 800
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->x:Z

    if-eqz v0, :cond_4

    .line 801
    sget-object v0, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne p1, v0, :cond_1

    .line 802
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 804
    :cond_1
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne p1, v0, :cond_3

    .line 805
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/i;)V

    .line 843
    :cond_2
    :goto_0
    iput-object p1, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    .line 844
    return-void

    .line 806
    :cond_3
    sget-object v0, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-ne p1, v0, :cond_2

    .line 807
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/i;)V

    .line 808
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 809
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->D:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->H:Z

    if-nez v0, :cond_2

    .line 812
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->l:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 817
    :cond_4
    sget-object v0, Lcom/facebook/widget/images/h;->PROGRESS_BAR:Lcom/facebook/widget/images/h;

    if-ne p1, v0, :cond_5

    .line 818
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 819
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->f()V

    .line 820
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 821
    :cond_5
    sget-object v0, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne p1, v0, :cond_7

    .line 822
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 823
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_6

    .line 824
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 826
    :cond_6
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/i;)V

    goto :goto_0

    .line 827
    :cond_7
    sget-object v0, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-ne p1, v0, :cond_2

    .line 828
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    invoke-direct {p0, v0}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/i;)V

    .line 829
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 830
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->D:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->H:Z

    if-nez v0, :cond_8

    .line 835
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->l:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 837
    :cond_8
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 838
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    .line 839
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/net/Uri;Lcom/facebook/ui/images/base/b;)V
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 351
    if-nez p1, :cond_0

    .line 352
    const/4 v0, 0x0

    check-cast v0, Lcom/facebook/ui/images/b/m;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 360
    :goto_0
    return-void

    .line 354
    :cond_0
    invoke-static {p1}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 577
    iput-boolean p1, p0, Lcom/facebook/widget/images/UrlImage;->u:Z

    .line 578
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->w:Z

    if-eqz v0, :cond_0

    .line 579
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->d()V

    .line 581
    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 939
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->F:Z

    return v0
.end method

.method public getAdjustViewBounds()Z
    .locals 1

    .prologue
    .line 470
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-boolean v0, v0, Lcom/facebook/widget/images/i;->j:Z

    return v0
.end method

.method public getImageDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 523
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->c:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getImageParams()Lcom/facebook/ui/images/b/m;
    .locals 1

    .prologue
    .line 327
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    return-object v0
.end method

.method public getImageView()Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 920
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getMultiFetchImageParams()Lcom/facebook/ui/images/b/ab;
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    return-object v0
.end method

.method public getOriginalImageBitmap()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->I:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    .line 163
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->i:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/facebook/widget/images/UrlImage;->I:Landroid/graphics/Bitmap;

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->I:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getPlaceHolderBackgroundResourceId()I
    .locals 1

    .prologue
    .line 539
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->f:Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getPlaceHolderDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 514
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getPlaceHolderResourceId()I
    .locals 1

    .prologue
    .line 492
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getPlaceHolderScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .prologue
    .line 544
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public getPlaceholderImageParams()Lcom/facebook/ui/images/b/m;
    .locals 1

    .prologue
    .line 409
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    return-object v0
.end method

.method public getRetainImageDuringUpdate()Z
    .locals 1

    .prologue
    .line 563
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->B:Z

    return v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .prologue
    .line 433
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public getShouldRetryFetch()Z
    .locals 1

    .prologue
    .line 607
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->E:Z

    return v0
.end method

.method public getShowProgressBar()Z
    .locals 1

    .prologue
    .line 555
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->r:Z

    return v0
.end method

.method public getUploadProgressBar()Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 947
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->m:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public getUploadProgressCoverView()Landroid/view/View;
    .locals 1

    .prologue
    .line 951
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->n:Landroid/view/View;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 277
    invoke-super {p0}, Lcom/facebook/widget/f;->onAttachedToWindow()V

    .line 278
    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->x:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/widget/images/UrlImage;->y:Z

    if-nez v0, :cond_0

    .line 279
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->d()V

    .line 281
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setHasBeenAttached(Z)V

    .line 282
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 286
    invoke-super {p0}, Lcom/facebook/widget/f;->onDetachedFromWindow()V

    .line 287
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setHasBeenAttached(Z)V

    .line 288
    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 1

    .prologue
    .line 292
    invoke-super {p0}, Lcom/facebook/widget/f;->onFinishTemporaryDetach()V

    .line 298
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 299
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->d()V

    .line 301
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .prologue
    .line 572
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/f;->onLayout(ZIIII)V

    .line 573
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->g()V

    .line 574
    return-void
.end method

.method public setAdjustViewBounds(Z)V
    .locals 2

    .prologue
    .line 457
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-boolean p1, v0, Lcom/facebook/widget/images/i;->j:Z

    .line 458
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 459
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 461
    :cond_0
    return-void
.end method

.method public setHasBeenAttached(Z)V
    .locals 0

    .prologue
    .line 934
    iput-boolean p1, p0, Lcom/facebook/widget/images/UrlImage;->F:Z

    .line 935
    return-void
.end method

.method public setImageMatrix(Landroid/graphics/Matrix;)V
    .locals 2

    .prologue
    .line 444
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object p1, v0, Lcom/facebook/widget/images/i;->h:Landroid/graphics/Matrix;

    .line 445
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 446
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 448
    :cond_0
    return-void
.end method

.method public setImageParams(Landroid/net/Uri;)V
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 336
    if-nez p1, :cond_0

    .line 337
    check-cast v0, Lcom/facebook/ui/images/b/m;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 341
    :goto_0
    return-void

    .line 339
    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/images/UrlImage;->a(Landroid/net/Uri;Lcom/facebook/ui/images/base/b;)V

    goto :goto_0
.end method

.method public setImageParams(Lcom/facebook/ui/images/b/m;)V
    .locals 2
    .param p1    # Lcom/facebook/ui/images/b/m;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object v0, v1, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    .line 370
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v1, v1, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-static {p1, v1}, Lcom/facebook/ui/images/b/m;->a(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/images/b/m;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 371
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object p1, v1, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    .line 372
    iget-object v1, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->c()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    :cond_0
    iput-object v0, v1, Lcom/facebook/widget/images/i;->i:Lcom/facebook/ui/images/d/h;

    .line 373
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->d()V

    .line 375
    :cond_1
    return-void
.end method

.method public setLoadResolutionDuringScroll(Lcom/facebook/widget/images/j;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/facebook/widget/images/UrlImage;->v:Lcom/facebook/widget/images/j;

    .line 318
    return-void
.end method

.method public setMultiFetchImageParams(Lcom/facebook/ui/images/b/ab;)V
    .locals 2
    .param p1    # Lcom/facebook/ui/images/b/ab;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    .line 394
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object v1, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    .line 395
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object v1, v0, Lcom/facebook/widget/images/i;->i:Lcom/facebook/ui/images/d/h;

    .line 396
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    invoke-static {p1, v0}, Lcom/facebook/ui/images/b/ab;->a(Lcom/facebook/ui/images/b/ab;Lcom/facebook/ui/images/b/ab;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 397
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object p1, v0, Lcom/facebook/widget/images/i;->b:Lcom/facebook/ui/images/b/ab;

    .line 398
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->d()V

    .line 400
    :cond_0
    return-void
.end method

.method public setOnImageDownloadListener(Lcom/facebook/widget/images/k;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lcom/facebook/widget/images/UrlImage;->t:Lcom/facebook/widget/images/k;

    .line 430
    return-void
.end method

.method public setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 501
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    .line 502
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iput-object p1, v0, Lcom/facebook/widget/images/i;->e:Landroid/graphics/drawable/Drawable;

    .line 503
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 504
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 506
    :cond_0
    return-void
.end method

.method public setPlaceHolderResourceId(I)V
    .locals 2

    .prologue
    .line 479
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/widget/images/i;->d:Ljava/lang/Integer;

    .line 480
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/facebook/widget/images/i;->e:Landroid/graphics/drawable/Drawable;

    .line 481
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 482
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 484
    :cond_0
    return-void
.end method

.method public setPlaceHolderScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    .prologue
    .line 548
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iput-object p1, v0, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    .line 549
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 550
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 552
    :cond_0
    return-void
.end method

.method public setPlaceholderBackgroundResourceId(I)V
    .locals 2

    .prologue
    .line 532
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/widget/images/i;->f:Ljava/lang/Integer;

    .line 533
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->PLACEHOLDER:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 534
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 536
    :cond_0
    return-void
.end method

.method public setPlaceholderImageParams(Lcom/facebook/ui/images/b/m;)V
    .locals 1

    .prologue
    .line 422
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iget-object v0, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-static {p1, v0}, Lcom/facebook/ui/images/b/m;->a(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/images/b/m;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 423
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->o:Lcom/facebook/widget/images/i;

    iput-object p1, v0, Lcom/facebook/widget/images/i;->a:Lcom/facebook/ui/images/b/m;

    .line 424
    invoke-direct {p0}, Lcom/facebook/widget/images/UrlImage;->d()V

    .line 426
    :cond_0
    return-void
.end method

.method public setRetainImageDuringUpdate(Z)V
    .locals 0

    .prologue
    .line 567
    iput-boolean p1, p0, Lcom/facebook/widget/images/UrlImage;->B:Z

    .line 568
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    .prologue
    .line 437
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->p:Lcom/facebook/widget/images/i;

    iput-object p1, v0, Lcom/facebook/widget/images/i;->g:Landroid/widget/ImageView$ScaleType;

    .line 438
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->q:Lcom/facebook/widget/images/h;

    sget-object v1, Lcom/facebook/widget/images/h;->LOADED_IMAGE:Lcom/facebook/widget/images/h;

    if-ne v0, v1, :cond_0

    .line 439
    iget-object v0, p0, Lcom/facebook/widget/images/UrlImage;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 441
    :cond_0
    return-void
.end method

.method public setShouldCacheOriginal(Z)V
    .locals 0

    .prologue
    .line 584
    iput-boolean p1, p0, Lcom/facebook/widget/images/UrlImage;->C:Z

    .line 585
    return-void
.end method

.method public setShouldRetryFetch(Z)V
    .locals 0

    .prologue
    .line 600
    iput-boolean p1, p0, Lcom/facebook/widget/images/UrlImage;->E:Z

    .line 601
    return-void
.end method

.method public setShowProgressBar(Z)V
    .locals 0

    .prologue
    .line 559
    iput-boolean p1, p0, Lcom/facebook/widget/images/UrlImage;->r:Z

    .line 560
    return-void
.end method

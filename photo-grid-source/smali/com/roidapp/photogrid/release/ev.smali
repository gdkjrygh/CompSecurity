.class public final Lcom/roidapp/photogrid/release/ev;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/widget/SeekBar;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Lcom/roidapp/photogrid/release/ng;

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:F

.field private m:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    const/16 v0, 0x12c

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    .line 48
    const/16 v0, 0x1388

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->k:I

    .line 49
    const v0, 0x45992000    # 4900.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->l:F

    .line 309
    new-instance v0, Lcom/roidapp/photogrid/release/ey;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ey;-><init>(Lcom/roidapp/photogrid/release/ev;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ev;I)I
    .locals 0

    .prologue
    .line 33
    iput p1, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ev;)Lcom/roidapp/photogrid/release/ng;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    return-object v0
.end method

.method private a(ILandroid/widget/TextView;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 74
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ev;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 76
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 77
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ev;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    if-eqz v0, :cond_0

    .line 79
    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 80
    invoke-virtual {p2, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 83
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ev;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00bf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 84
    if-eqz v0, :cond_0

    .line 85
    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 86
    invoke-virtual {p2, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private a()Z
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 68
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ev;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    return v0
.end method

.method private b()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 204
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v4}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 206
    new-instance v0, Ljava/math/BigDecimal;

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-double v2, v1

    invoke-direct {v0, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 207
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->c:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {v0, v4, v3}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "s"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->h(I)V

    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x64

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ev;->l:F

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 210
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ev;I)V
    .locals 2

    .prologue
    .line 33
    .line 2251
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    if-le v0, v1, :cond_0

    .line 2252
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    .line 2256
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->b()V

    .line 33
    return-void

    .line 2254
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ev;)F
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->l:F

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ev;I)V
    .locals 2

    .prologue
    .line 33
    .line 2260
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->k:I

    if-ge v0, v1, :cond_0

    .line 2261
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    .line 2265
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->b()V

    .line 33
    return-void

    .line 2263
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->k:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ev;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ev;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ev;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->c:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 52
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    .line 54
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 55
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const v2, 0x7f070205

    .line 215
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 248
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 232
    :pswitch_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ev;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 238
    :pswitch_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 239
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ev;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 242
    :cond_1
    const v0, 0x466a6000    # 15000.0f

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    .line 243
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->b()V

    goto :goto_0

    .line 215
    :pswitch_data_0
    .packed-switch 0x7f0d032e
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    const v8, 0x7f0d0330

    const/16 v7, 0x14

    const v6, 0x3e4ccccd    # 0.2f

    const/16 v3, 0x12c

    const/4 v5, 0x1

    .line 60
    const v0, 0x7f0300c7

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 1112
    const v0, 0x7f0d032f

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->c:Landroid/widget/TextView;

    .line 1113
    const v0, 0x7f0d0331

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    .line 1114
    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->d:Landroid/widget/TextView;

    .line 1115
    const v0, 0x7f0d0332

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->e:Landroid/widget/TextView;

    .line 1116
    const v0, 0x7f0d032e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->f:Landroid/widget/LinearLayout;

    .line 1119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1122
    new-instance v0, Lcom/roidapp/photogrid/release/ew;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ew;-><init>(Lcom/roidapp/photogrid/release/ev;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1137
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ev;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 1138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1139
    :cond_1
    const-string v0, "151"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 62
    :goto_0
    return-object v2

    .line 1142
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    .line 1143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    if-nez v0, :cond_3

    .line 1144
    const-string v0, "152"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 1150
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    .line 1151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1152
    const/16 v0, 0xbb8

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    div-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    .line 1153
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    if-ge v0, v3, :cond_4

    .line 1154
    iput v3, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    .line 1160
    :cond_4
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    if-ne v0, v5, :cond_7

    .line 1161
    const/16 v0, 0x3a98

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->k:I

    .line 1165
    :cond_5
    :goto_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->k:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->l:F

    .line 1167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->g:Lcom/roidapp/photogrid/release/ng;

    iget v0, v0, Lcom/roidapp/photogrid/release/ng;->T:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    .line 1168
    new-instance v3, Ljava/math/BigDecimal;

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    const-wide/high16 v0, 0x402e000000000000L    # 15.0

    :goto_3
    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 1170
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->c:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x4

    invoke-virtual {v3, v5, v4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "s"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1174
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getMax()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    :goto_4
    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    new-instance v1, Lcom/roidapp/photogrid/release/ex;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ex;-><init>(Lcom/roidapp/photogrid/release/ev;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 2093
    const v1, 0x7f02038c

    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v1, v0}, Lcom/roidapp/photogrid/release/ev;->a(ILandroid/widget/TextView;)V

    .line 2094
    const v1, 0x7f0203f9

    const v0, 0x7f0d0332

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v1, v0}, Lcom/roidapp/photogrid/release/ev;->a(ILandroid/widget/TextView;)V

    .line 2095
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2096
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_a

    .line 2097
    invoke-static {}, Lcom/roidapp/photogrid/common/bl;->a()Lcom/roidapp/photogrid/common/bl;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;F)V

    .line 2098
    invoke-static {}, Lcom/roidapp/photogrid/common/bl;->a()Lcom/roidapp/photogrid/common/bl;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->f:Landroid/widget/LinearLayout;

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;F)V

    .line 2103
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 1157
    :cond_6
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    const/16 v1, 0x96

    if-le v0, v1, :cond_4

    .line 1158
    iput v3, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    goto/16 :goto_1

    .line 1162
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 1163
    const/16 v0, 0x1d4c

    iput v0, p0, Lcom/roidapp/photogrid/release/ev;->k:I

    goto/16 :goto_2

    .line 1168
    :cond_8
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ev;->h:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    goto/16 :goto_3

    .line 1174
    :cond_9
    iget v0, p0, Lcom/roidapp/photogrid/release/ev;->i:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ev;->j:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    iget v3, p0, Lcom/roidapp/photogrid/release/ev;->l:F

    div-float/2addr v0, v3

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_4

    .line 2100
    :cond_a
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ev;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200e5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2101
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ev;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020094

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_5

    .line 2107
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ev;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, v5}, Landroid/widget/SeekBar;->setEnabled(Z)V

    goto/16 :goto_0
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const v4, 0x7f0c0026

    const v2, 0x7f0c0007

    const/16 v3, 0x14

    const/4 v0, 0x1

    .line 270
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ev;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 271
    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ev;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v2, 0x7f070205

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ev;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 306
    :goto_0
    return v0

    .line 274
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 306
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 276
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    packed-switch v1, :pswitch_data_1

    .line 294
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    packed-switch v1, :pswitch_data_2

    :pswitch_2
    goto :goto_1

    .line 296
    :pswitch_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 297
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->m:Landroid/os/Handler;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 278
    :pswitch_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 279
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 280
    iput v0, v1, Landroid/os/Message;->what:I

    .line 281
    iput v3, v1, Landroid/os/Message;->arg1:I

    .line 282
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ev;->m:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 285
    :pswitch_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 286
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 287
    const/4 v2, 0x2

    iput v2, v1, Landroid/os/Message;->what:I

    .line 288
    iput v3, v1, Landroid/os/Message;->arg1:I

    .line 289
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ev;->m:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 300
    :pswitch_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 301
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ev;->m:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 274
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 276
    :pswitch_data_1
    .packed-switch 0x7f0d0330
        :pswitch_4
        :pswitch_1
        :pswitch_5
    .end packed-switch

    .line 294
    :pswitch_data_2
    .packed-switch 0x7f0d0330
        :pswitch_3
        :pswitch_2
        :pswitch_6
    .end packed-switch
.end method

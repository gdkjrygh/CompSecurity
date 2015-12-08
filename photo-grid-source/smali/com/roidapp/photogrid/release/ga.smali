.class public final Lcom/roidapp/photogrid/release/ga;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private a:Z

.field private b:Landroid/widget/EditText;

.field private c:Lcom/roidapp/photogrid/release/ra;

.field private d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private e:Landroid/view/inputmethod/InputMethodManager;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:I

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Landroid/widget/AbsListView;)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 39
    .line 2211
    if-eqz p0, :cond_0

    invoke-virtual {p0, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    .line 2212
    :cond_0
    :goto_0
    return v0

    .line 2213
    :cond_1
    invoke-virtual {p0, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2214
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ga;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    return-object v0
.end method

.method public static a(Lcom/roidapp/photogrid/release/ra;)Lcom/roidapp/photogrid/release/ga;
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/roidapp/photogrid/release/ga;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ga;-><init>()V

    .line 55
    iput-object p0, v0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    .line 56
    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ga;I)Z
    .locals 1

    .prologue
    .line 2207
    iget v0, p0, Lcom/roidapp/photogrid/release/ga;->j:I

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 39
    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ga;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/ga;->i:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ga;I)I
    .locals 0

    .prologue
    .line 39
    iput p1, p0, Lcom/roidapp/photogrid/release/ga;->i:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ga;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/ga;->h:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ga;I)I
    .locals 0

    .prologue
    .line 39
    iput p1, p0, Lcom/roidapp/photogrid/release/ga;->j:I

    return p1
.end method

.method private c()V
    .locals 3

    .prologue
    .line 244
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_1

    .line 247
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 248
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ga;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ga;->c()V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ga;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/ga;->j:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ga;)Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/ga;)V
    .locals 3

    .prologue
    .line 39
    .line 2237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 2239
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_1

    .line 2240
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 39
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 221
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 10

    .prologue
    const/high16 v2, 0x3fc00000    # 1.5f

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    .line 225
    new-instance v9, Landroid/view/animation/AnimationSet;

    invoke-direct {v9, v5}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 226
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v3, v1

    move v4, v2

    move v7, v5

    move v8, v6

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 228
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 229
    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 230
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v9, v1}, Landroid/view/animation/AnimationSet;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 231
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 234
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 61
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 62
    check-cast p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object p1, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 63
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ga;->a:Z

    .line 64
    return-void

    .line 63
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 315
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 348
    :cond_0
    :goto_0
    return-void

    .line 319
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 325
    :sswitch_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ga;->a:Z

    if-eqz v0, :cond_2

    .line 326
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/String;)V

    .line 327
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ga;->c()V

    .line 328
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 321
    :sswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 331
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v0

    .line 333
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/String;)V

    .line 334
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v1

    .line 335
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    new-instance v3, Landroid/graphics/PointF;

    const/4 v4, 0x0

    aget v4, v0, v4

    const/4 v5, 0x1

    aget v5, v0, v5

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v4, Landroid/graphics/PointF;

    const/4 v5, 0x0

    aget v5, v1, v5

    const/4 v6, 0x1

    aget v1, v1, v6

    invoke-direct {v4, v5, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 336
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/roidapp/photogrid/release/ra;->ak:Z

    .line 337
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ga;->c()V

    .line 338
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 340
    :catch_0
    move-exception v1

    .line 1251
    new-instance v1, Lcom/roidapp/photogrid/release/af;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/af;-><init>()V

    .line 1252
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    const-string v3, "oomFragment"

    invoke-virtual {v2, v1, v3}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 341
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v1

    .line 342
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    new-instance v3, Landroid/graphics/PointF;

    aget v4, v0, v7

    aget v0, v0, v8

    invoke-direct {v3, v4, v0}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v0, Landroid/graphics/PointF;

    aget v4, v1, v7

    aget v1, v1, v8

    invoke-direct {v0, v4, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/ra;->ak:Z

    goto/16 :goto_0

    .line 319
    :sswitch_data_0
    .sparse-switch
        0x7f0d002c -> :sswitch_0
        0x7f0d026a -> :sswitch_1
    .end sparse-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v2, 0x0

    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    if-nez v0, :cond_0

    .line 69
    const/4 v0, 0x0

    .line 73
    :goto_0
    return-object v0

    .line 71
    :cond_0
    const v0, 0x7f0300be

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1077
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v3, "input_method"

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    .line 1078
    const v0, 0x7f0d030e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    .line 1079
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ra;->r()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1081
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v3, 0x2

    aget-object v0, v0, v3

    check-cast v0, Landroid/graphics/drawable/LevelListDrawable;

    .line 1082
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    new-instance v4, Lcom/roidapp/photogrid/release/gb;

    invoke-direct {v4, p0, v0}, Lcom/roidapp/photogrid/release/gb;-><init>(Lcom/roidapp/photogrid/release/ga;Landroid/graphics/drawable/LevelListDrawable;)V

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->length()I

    move-result v3

    invoke-static {v0, v3}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 1125
    const v0, 0x7f0d030d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ga;->f:Landroid/widget/ImageView;

    .line 1126
    const v0, 0x7f0d030f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ga;->g:Landroid/widget/ImageView;

    .line 1127
    const v0, 0x7f0d026a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1128
    const v0, 0x7f0d002c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1130
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ga;->a:Z

    if-eqz v0, :cond_3

    .line 1131
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 1132
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v10, v0, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ga;->h:I

    .line 1133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f09009d

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    iput v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1134
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f080003

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    .line 1135
    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 1136
    array-length v6, v4

    move v0, v2

    .line 1137
    :goto_1
    if-ge v0, v6, :cond_2

    .line 1138
    sub-int v7, v6, v0

    invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    .line 1139
    add-int/2addr v7, v0

    .line 1140
    if-eq v0, v7, :cond_1

    .line 1141
    aget-object v8, v4, v0

    .line 1142
    aget-object v9, v4, v7

    aput-object v9, v4, v0

    .line 1143
    aput-object v8, v4, v7

    .line 1137
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1147
    :cond_2
    new-instance v5, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 1148
    new-array v0, v10, [I

    const v6, 0x10100a7

    aput v6, v0, v2

    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    const v7, -0xc2c2c3

    invoke-direct {v6, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v5, v0, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1149
    new-array v0, v2, [I

    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v6, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v5, v0, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1150
    const v0, 0x7f0d030c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 1151
    new-instance v6, Landroid/widget/ListView;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v6, v7}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 1152
    const/high16 v7, 0x2000000

    invoke-virtual {v6, v7}, Landroid/widget/ListView;->setScrollBarStyle(I)V

    .line 1153
    invoke-virtual {v6, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1154
    invoke-virtual {v6, v5}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 1155
    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setDrawSelectorOnTop(Z)V

    .line 1156
    const v5, -0xb2b2b3

    invoke-virtual {v6, v5}, Landroid/widget/ListView;->setBackgroundColor(I)V

    .line 1157
    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 1158
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v5, -0x1

    const/4 v7, -0x2

    invoke-direct {v2, v5, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1159
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const v5, -0x868687

    invoke-direct {v2, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 1160
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v10, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 1161
    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ga;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const v5, 0x7f0300e8

    const v7, 0x7f0d03ae

    invoke-direct {v2, v3, v5, v7, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1162
    new-instance v2, Lcom/roidapp/photogrid/release/gc;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gc;-><init>(Lcom/roidapp/photogrid/release/ga;)V

    invoke-virtual {v6, v2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1190
    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :goto_2
    move-object v0, v1

    .line 73
    goto/16 :goto_0

    .line 1193
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/release/gd;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gd;-><init>(Lcom/roidapp/photogrid/release/ga;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_2
.end method

.method public final onDestroyView()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 257
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ga;->c()V

    .line 260
    iput-object v5, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    .line 262
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ra;->ak:Z

    if-eqz v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v0

    .line 265
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ra;->L:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/String;)V

    .line 266
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v1

    .line 267
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    new-instance v3, Landroid/graphics/PointF;

    aget v4, v0, v6

    aget v0, v0, v7

    invoke-direct {v3, v4, v0}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v0, Landroid/graphics/PointF;

    aget v4, v1, v6

    aget v1, v1, v7

    invoke-direct {v0, v4, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 269
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->D()V

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 272
    if-eqz v0, :cond_2

    .line 273
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->A()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ga;->a:Z

    if-nez v1, :cond_7

    .line 274
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 281
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v0

    .line 282
    if-eqz v0, :cond_3

    .line 283
    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/az;->setVisibility(I)V

    .line 287
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ga;->a:Z

    if-eqz v0, :cond_4

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 291
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ra;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_5

    .line 292
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ga;->a:Z

    if-nez v0, :cond_5

    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H()V

    .line 296
    :cond_5
    iput-object v5, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    .line 298
    :cond_6
    iput-object v5, p0, Lcom/roidapp/photogrid/release/ga;->e:Landroid/view/inputmethod/InputMethodManager;

    .line 299
    iput-object v5, p0, Lcom/roidapp/photogrid/release/ga;->c:Lcom/roidapp/photogrid/release/ra;

    .line 300
    iput-object v5, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    .line 301
    iput-object v5, p0, Lcom/roidapp/photogrid/release/ga;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 302
    return-void

    .line 277
    :cond_7
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 306
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 307
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    if-eqz v1, :cond_0

    .line 308
    invoke-virtual {v0, p3}, Landroid/widget/BaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 309
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ga;->b:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 311
    :cond_0
    return-void
.end method

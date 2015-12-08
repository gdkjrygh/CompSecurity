.class public final Lkik/android/widget/dl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/dl$c;,
        Lkik/android/widget/dl$b;,
        Lkik/android/widget/dl$a;
    }
.end annotation


# static fields
.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I

.field private static final h:I

.field private static final i:I

.field private static final j:I

.field private static final k:I


# instance fields
.field private A:Landroid/view/View;

.field private B:Lkik/android/widget/dk;

.field private C:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private D:Landroid/widget/AdapterView$OnItemClickListener;

.field private E:Landroid/widget/AdapterView$OnItemLongClickListener;

.field private F:Landroid/view/View$OnClickListener;

.field private G:Landroid/view/View$OnClickListener;

.field a:[I

.field protected b:Lcom/kik/android/a;

.field protected c:Lcom/kik/android/c/f;

.field private l:Z

.field private m:Z

.field private n:Landroid/content/Context;

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:Landroid/view/LayoutInflater;

.field private t:Landroid/os/Message;

.field private u:Lkik/android/widget/dl$c;

.field private v:Landroid/widget/PopupWindow;

.field private w:Lkik/android/widget/dl$a;

.field private x:Lkik/android/util/ad;

.field private y:Landroid/view/View;

.field private z:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v2, 0xa

    const/16 v1, 0x8

    .line 45
    const/16 v0, 0x9

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->d:I

    .line 46
    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    sput v0, Lkik/android/widget/dl;->e:I

    .line 48
    const/16 v0, 0x10

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->f:I

    .line 49
    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->g:I

    .line 50
    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->h:I

    .line 52
    const/16 v0, 0xf

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->i:I

    .line 54
    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->j:I

    .line 55
    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dl;->k:I

    return-void
.end method

.method public constructor <init>(Lkik/android/util/ad;Landroid/content/Context;Landroid/view/View;Landroid/view/View;Lcom/kik/android/a;Lcom/kik/android/c/f;)V
    .locals 1

    .prologue
    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lkik/android/widget/dl;->a:[I

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/dl;->m:Z

    .line 79
    new-instance v0, Lkik/android/widget/dm;

    invoke-direct {v0, p0}, Lkik/android/widget/dm;-><init>(Lkik/android/widget/dl;)V

    iput-object v0, p0, Lkik/android/widget/dl;->C:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 91
    new-instance v0, Lkik/android/widget/dn;

    invoke-direct {v0, p0}, Lkik/android/widget/dn;-><init>(Lkik/android/widget/dl;)V

    iput-object v0, p0, Lkik/android/widget/dl;->D:Landroid/widget/AdapterView$OnItemClickListener;

    .line 99
    new-instance v0, Lkik/android/widget/do;

    invoke-direct {v0, p0}, Lkik/android/widget/do;-><init>(Lkik/android/widget/dl;)V

    iput-object v0, p0, Lkik/android/widget/dl;->E:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 108
    new-instance v0, Lkik/android/widget/dp;

    invoke-direct {v0, p0}, Lkik/android/widget/dp;-><init>(Lkik/android/widget/dl;)V

    iput-object v0, p0, Lkik/android/widget/dl;->F:Landroid/view/View$OnClickListener;

    .line 116
    new-instance v0, Lkik/android/widget/dq;

    invoke-direct {v0, p0}, Lkik/android/widget/dq;-><init>(Lkik/android/widget/dl;)V

    iput-object v0, p0, Lkik/android/widget/dl;->G:Landroid/view/View$OnClickListener;

    .line 310
    iput-object p1, p0, Lkik/android/widget/dl;->x:Lkik/android/util/ad;

    .line 311
    iput-object p2, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    .line 312
    iput-object p3, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    .line 313
    iput-object p4, p0, Lkik/android/widget/dl;->A:Landroid/view/View;

    .line 315
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/dl;->l:Z

    .line 316
    iget-object v0, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/dl;->s:Landroid/view/LayoutInflater;

    .line 317
    iget-object v0, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lkik/android/widget/dl;->p:I

    .line 318
    invoke-virtual {p1}, Lkik/android/util/ad;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/dl;->t:Landroid/os/Message;

    .line 319
    iget-object v0, p0, Lkik/android/widget/dl;->t:Landroid/os/Message;

    invoke-virtual {v0, p1}, Landroid/os/Message;->setTarget(Landroid/os/Handler;)V

    .line 320
    iput-object p5, p0, Lkik/android/widget/dl;->b:Lcom/kik/android/a;

    .line 321
    iput-object p6, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    .line 322
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/View;)V
    .locals 5

    .prologue
    const/high16 v3, -0x80000000

    const/high16 v4, 0x40000000    # 2.0f

    .line 338
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 363
    :cond_0
    :goto_0
    return-void

    .line 343
    :cond_1
    invoke-direct {p0}, Lkik/android/widget/dl;->e()I

    move-result v0

    .line 345
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->measure(II)V

    .line 348
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 349
    invoke-virtual {p2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 350
    const/4 v2, 0x0

    aget v1, v1, v2

    .line 352
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    .line 354
    if-eqz p1, :cond_0

    .line 355
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v4

    .line 356
    sub-int/2addr v0, v1

    invoke-direct {p0}, Lkik/android/widget/dl;->g()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    sub-float/2addr v0, v2

    sub-float/2addr v0, v3

    float-to-int v1, v0

    .line 357
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 360
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 361
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method private a(Landroid/view/View;Z)V
    .locals 5

    .prologue
    .line 206
    if-nez p1, :cond_1

    .line 238
    :cond_0
    :goto_0
    return-void

    .line 209
    :cond_1
    const v0, 0x7f0e01e0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 210
    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/kik/cache/SmileyImageView;

    if-eqz v1, :cond_2

    .line 211
    check-cast v0, Lcom/kik/cache/SmileyImageView;

    invoke-virtual {v0}, Lcom/kik/cache/SmileyImageView;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 216
    const/4 v1, 0x0

    .line 217
    instance-of v2, v0, Lkik/android/widget/dl$b;

    if-eqz v2, :cond_5

    .line 218
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lkik/android/widget/dl$b;

    if-eqz v2, :cond_4

    check-cast v0, Lkik/android/widget/dl$b;

    iget-object v0, v0, Lkik/android/widget/dl$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/widget/dl;->b:Lcom/kik/android/a;

    const-string v3, "Smiley Store Opened"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Smiley Category"

    invoke-virtual {v2, v3, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    if-eqz v0, :cond_3

    const-string v3, "launch_card"

    invoke-static {v0}, Lcom/kik/android/c/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lkik/android/widget/dl;->t:Landroid/os/Message;

    invoke-virtual {v0, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lkik/android/widget/dl;->k()V

    :cond_4
    move-object v0, v1

    .line 236
    :goto_1
    iget-object v1, p0, Lkik/android/widget/dl;->t:Landroid/os/Message;

    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 237
    invoke-direct {p0}, Lkik/android/widget/dl;->k()V

    goto :goto_0

    .line 220
    :cond_5
    instance-of v1, v0, Lcom/kik/android/c/e;

    if-eqz v1, :cond_7

    .line 221
    check-cast v0, Lcom/kik/android/c/e;

    .line 223
    iget-object v1, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v1, v0}, Lcom/kik/android/c/f;->a(Lcom/kik/android/c/e;)V

    .line 225
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    if-eqz v0, :cond_6

    const-string v2, "smiley_key"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    :cond_6
    iget-object v2, p0, Lkik/android/widget/dl;->b:Lcom/kik/android/a;

    const-string v3, "Smiley Clicked"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Smiley"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Alternate Smiley Tray"

    invoke-virtual {v2, v3, p2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Smiley Identifier"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    move-object v0, v1

    .line 231
    goto :goto_1

    .line 233
    :cond_7
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "https://my.kik.com/"

    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v0, "https://kik-shop-dev.herokuapp.com"

    :cond_8
    const-string v2, "launch_card"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lkik/android/widget/dl;->b:Lcom/kik/android/a;

    const-string v2, "Smiley Store Opened"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/widget/dl;Landroid/view/View;)V
    .locals 13

    .prologue
    .line 42
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/kik/android/c/e;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    iget-object v1, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v1, v0}, Lcom/kik/android/c/f;->b(Lcom/kik/android/c/e;)V

    iget-object v1, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v1}, Lcom/kik/android/c/f;->b()V

    if-eqz v0, :cond_0

    if-nez p1, :cond_5

    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    const v1, 0x7f0e01e1

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v1, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-virtual {v1}, Lkik/android/widget/dk;->c()V

    :cond_2
    if-eqz p1, :cond_4

    iget-object v1, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-virtual {v1, v0}, Lkik/android/widget/dk;->a(Lcom/kik/android/c/e;)V

    :cond_3
    const v0, 0x7f0200ad

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lkik/android/widget/dl;->s:Landroid/view/LayoutInflater;

    const v2, 0x7f030018

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    iget-object v1, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v1, v4}, Lcom/kik/android/c/f;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    const v1, 0x7f0e0096

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x1

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v3, v2

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kik/android/c/e;

    new-instance v8, Lcom/kik/cache/SmileyImageView;

    iget-object v9, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-direct {v8, v9}, Lcom/kik/cache/SmileyImageView;-><init>(Landroid/content/Context;)V

    const v9, 0x7f0202a7

    invoke-virtual {v8, v9}, Lcom/kik/cache/SmileyImageView;->e(I)V

    iget-object v9, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0202a0

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/kik/cache/SmileyImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    iget v10, p0, Lkik/android/widget/dl;->r:I

    iget v11, p0, Lkik/android/widget/dl;->q:I

    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v9}, Lcom/kik/cache/SmileyImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v9, Lkik/android/widget/dl;->g:I

    div-int/lit8 v9, v9, 0x2

    sget v10, Lkik/android/widget/dl;->g:I

    div-int/lit8 v10, v10, 0x2

    sget v11, Lkik/android/widget/dl;->g:I

    div-int/lit8 v11, v11, 0x2

    sget v12, Lkik/android/widget/dl;->g:I

    div-int/lit8 v12, v12, 0x2

    invoke-virtual {v8, v9, v10, v11, v12}, Lcom/kik/cache/SmileyImageView;->setPadding(IIII)V

    sget-object v9, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v8, v9}, Lcom/kik/cache/SmileyImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-static {}, Lcom/kik/android/c/f;->e()Lcom/kik/cache/ad;

    move-result-object v9

    invoke-virtual {v8, v2, v9}, Lcom/kik/cache/SmileyImageView;->a(Lcom/kik/android/c/e;Lcom/kik/cache/ad;)V

    iget-object v9, p0, Lkik/android/widget/dl;->G:Landroid/view/View$OnClickListener;

    invoke-virtual {v8, v9}, Lcom/kik/cache/SmileyImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v3, :cond_6

    invoke-virtual {v8}, Lcom/kik/cache/SmileyImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/16 v10, 0x8

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    add-int/2addr v9, v10

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v11, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v3, v9, v10, v11, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v8, v3}, Lcom/kik/cache/SmileyImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v3, 0x0

    :cond_6
    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v2}, Lcom/kik/cache/SmileyImageView;->setTag(Ljava/lang/Object;)V

    const v9, 0x7f0e01e0

    invoke-virtual {v8, v9}, Lcom/kik/cache/SmileyImageView;->setId(I)V

    if-eqz v2, :cond_7

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "AUTOMATION_SMILEY_TRAY_ALTERNATE_SMILEY_"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/kik/cache/SmileyImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_8
    new-instance v3, Landroid/widget/ImageView;

    iget-object v2, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-direct {v3, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v7, 0x7f0202a0

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget v7, p0, Lkik/android/widget/dl;->r:I

    iget v8, p0, Lkik/android/widget/dl;->q:I

    invoke-direct {v2, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const v2, 0x7f02020b

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v2, Lkik/android/widget/dl$b;

    invoke-direct {v2, v4}, Lkik/android/widget/dl$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    iget-object v2, p0, Lkik/android/widget/dl;->G:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v2, "AUTOMATION_SMILEY_TRAY_ALTERNATE_STORE"

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/16 v10, 0x8

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    add-int/2addr v9, v10

    iget v10, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v2, v7, v8, v9, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lkik/android/widget/dl$a;

    invoke-direct {v1, p0, v6}, Lkik/android/widget/dl$a;-><init>(Lkik/android/widget/dl;Landroid/view/View;)V

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v1, v2}, Lkik/android/widget/dl$a;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v6}, Lkik/android/widget/dl$a;->setContentView(Landroid/view/View;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/widget/dl$a;->setOutsideTouchable(Z)V

    invoke-virtual {v1, v5}, Lkik/android/widget/dl$a;->a(Ljava/util/List;)V

    iget-object v2, p0, Lkik/android/widget/dl;->b:Lcom/kik/android/a;

    const-string v3, "Smiley Alternate Tray Opened"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Smiley Category"

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    iget-object v2, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    invoke-virtual {v2}, Lkik/android/widget/dl$a;->dismiss()V

    :cond_9
    iput-object v1, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    iget-object v1, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    new-instance v2, Lkik/android/widget/dr;

    invoke-direct {v2, p0, p1}, Lkik/android/widget/dr;-><init>(Lkik/android/widget/dl;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Lkik/android/widget/dl$a;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v1, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    iget-object v2, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    invoke-virtual {v1, p1, v2}, Lkik/android/widget/dl$a;->a(Landroid/view/View;Landroid/view/View;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lkik/android/widget/dl;Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lkik/android/widget/dl;->a(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/dl;)[I
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lkik/android/widget/dl;->j()[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/widget/dl;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 42
    if-eqz p1, :cond_1

    iget-object v0, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/dk;->a(Lcom/kik/android/c/e;)V

    :cond_0
    const v0, 0x7f0202a0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_1
    return-void
.end method

.method static synthetic b(Lkik/android/widget/dl;)Z
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/dl;->l:Z

    return v0
.end method

.method private e()I
    .locals 2

    .prologue
    .line 327
    iget-object v0, p0, Lkik/android/widget/dl;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lkik/android/widget/dl;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lkik/android/widget/dl;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 328
    return v0
.end method

.method private f()I
    .locals 1

    .prologue
    .line 459
    iget-boolean v0, p0, Lkik/android/widget/dl;->m:Z

    if-eqz v0, :cond_0

    sget v0, Lkik/android/widget/dl;->j:I

    :goto_0
    return v0

    :cond_0
    sget v0, Lkik/android/widget/dl;->f:I

    goto :goto_0
.end method

.method private g()I
    .locals 1

    .prologue
    .line 464
    iget-boolean v0, p0, Lkik/android/widget/dl;->m:Z

    if-eqz v0, :cond_0

    sget v0, Lkik/android/widget/dl;->k:I

    :goto_0
    return v0

    :cond_0
    sget v0, Lkik/android/widget/dl;->i:I

    goto :goto_0
.end method

.method private h()I
    .locals 2

    .prologue
    .line 587
    invoke-direct {p0}, Lkik/android/widget/dl;->e()I

    move-result v0

    invoke-direct {p0}, Lkik/android/widget/dl;->g()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 588
    invoke-direct {p0}, Lkik/android/widget/dl;->f()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iget v1, p0, Lkik/android/widget/dl;->r:I

    div-int/2addr v0, v1

    return v0
.end method

.method private i()Z
    .locals 4

    .prologue
    .line 593
    invoke-direct {p0}, Lkik/android/widget/dl;->h()I

    move-result v0

    .line 594
    iget v1, p0, Lkik/android/widget/dl;->o:I

    int-to-double v2, v1

    int-to-double v0, v0

    div-double v0, v2, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j()[I
    .locals 2

    .prologue
    .line 653
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 654
    iget-object v1, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 655
    iget-object v1, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 657
    :cond_0
    return-object v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 786
    iget-object v0, p0, Lkik/android/widget/dl;->x:Lkik/android/util/ad;

    iget-object v1, p0, Lkik/android/widget/dl;->t:Landroid/os/Message;

    invoke-virtual {v0, v1}, Lkik/android/util/ad;->sendMessage(Landroid/os/Message;)Z

    .line 787
    iget-object v0, p0, Lkik/android/widget/dl;->x:Lkik/android/util/ad;

    invoke-virtual {v0}, Lkik/android/util/ad;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/dl;->t:Landroid/os/Message;

    .line 788
    invoke-virtual {p0}, Lkik/android/widget/dl;->d()V

    .line 789
    return-void
.end method


# virtual methods
.method public final a(Lkik/android/widget/dl$c;)V
    .locals 0

    .prologue
    .line 756
    iput-object p1, p0, Lkik/android/widget/dl;->u:Lkik/android/widget/dl$c;

    .line 757
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 662
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 12

    .prologue
    .line 715
    iget-boolean v0, p0, Lkik/android/widget/dl;->l:Z

    if-eqz v0, :cond_15

    .line 716
    iget-object v0, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 717
    iget-object v0, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 718
    iget-object v1, p0, Lkik/android/widget/dl;->C:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 721
    :cond_0
    iget-object v0, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lkik/android/widget/dl;->p:I

    .line 722
    iget v0, p0, Lkik/android/widget/dl;->p:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    .line 723
    iget-object v0, p0, Lkik/android/widget/dl;->s:Landroid/view/LayoutInflater;

    const v1, 0x7f030096

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    new-instance v5, Lkik/android/widget/ds;

    invoke-direct {v5, p0, v4}, Lkik/android/widget/ds;-><init>(Lkik/android/widget/dl;Landroid/view/View;)V

    const v0, 0x7f0e01dd

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iget-object v0, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->d()Ljava/util/List;

    move-result-object v7

    iget-object v0, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02027f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    sget v1, Lkik/android/widget/dl;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lkik/android/widget/dl;->r:I

    iget-object v0, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02027f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    sget v1, Lkik/android/widget/dl;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lkik/android/widget/dl;->q:I

    const/16 v0, 0x14

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/widget/dl;->o:I

    const v0, 0x7f0e0096

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    iget v1, p0, Lkik/android/widget/dl;->o:I

    add-int/lit8 v1, v1, -0x1

    if-ge v3, v1, :cond_4

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_4

    iget-object v1, p0, Lkik/android/widget/dl;->s:Landroid/view/LayoutInflater;

    const v2, 0x7f030099

    const/4 v8, 0x0

    invoke-virtual {v1, v2, v0, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v8

    const v1, 0x7f0e01e0

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kik/cache/SmileyImageView;

    const v2, 0x7f0202a7

    invoke-virtual {v1, v2}, Lcom/kik/cache/SmileyImageView;->e(I)V

    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Lcom/kik/cache/SmileyImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    sget v2, Lkik/android/widget/dl;->g:I

    div-int/lit8 v2, v2, 0x2

    sget v9, Lkik/android/widget/dl;->g:I

    div-int/lit8 v9, v9, 0x2

    sget v10, Lkik/android/widget/dl;->g:I

    div-int/lit8 v10, v10, 0x2

    sget v11, Lkik/android/widget/dl;->g:I

    div-int/lit8 v11, v11, 0x2

    invoke-virtual {v1, v2, v9, v10, v11}, Lcom/kik/cache/SmileyImageView;->setPadding(IIII)V

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0202a0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lkik/android/widget/dl;->r:I

    iget v9, p0, Lkik/android/widget/dl;->q:I

    invoke-direct {v1, v2, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x7f0e01e0

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kik/cache/SmileyImageView;

    const v2, 0x7f0e01e1

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kik/android/c/f$b;

    invoke-virtual {v2}, Lcom/kik/android/c/f$b;->b()Lcom/kik/android/c/e;

    move-result-object v10

    invoke-static {}, Lcom/kik/android/c/f;->e()Lcom/kik/cache/ad;

    move-result-object v11

    invoke-virtual {v1, v10, v11}, Lcom/kik/cache/SmileyImageView;->a(Lcom/kik/android/c/e;Lcom/kik/cache/ad;)V

    const v11, 0x7f0e01e0

    invoke-virtual {v1, v11}, Lcom/kik/cache/SmileyImageView;->setId(I)V

    invoke-virtual {v8, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/kik/android/c/f$b;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0202b0

    invoke-virtual {v9, v1}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_1
    invoke-virtual {v8, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v1, p0, Lkik/android/widget/dl;->F:Landroid/view/View$OnClickListener;

    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v10, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AUTOMATION_SMILEY_TRAY_SMILEY_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/kik/android/c/f$b;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0202b1

    invoke-virtual {v9, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x4

    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_4
    if-eqz v6, :cond_5

    invoke-virtual {p0}, Lkik/android/widget/dl;->a()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    new-instance v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lkik/android/widget/dl;->n:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0202a0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget v3, p0, Lkik/android/widget/dl;->r:I

    iget v5, p0, Lkik/android/widget/dl;->q:I

    invoke-direct {v2, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const v2, 0x7f02020b

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget v2, p0, Lkik/android/widget/dl;->o:I

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    iget-object v2, p0, Lkik/android/widget/dl;->F:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v2, "AUTOMATION_SMILEY_TRAY_STORE"

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    const v0, 0x7f0e01de

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lkik/android/widget/dl;->a(Landroid/view/View;Landroid/view/View;)V

    iput-object v4, p0, Lkik/android/widget/dl;->z:Landroid/view/View;

    .line 728
    :goto_3
    invoke-direct {p0}, Lkik/android/widget/dl;->j()[I

    move-result-object v2

    invoke-direct {p0}, Lkik/android/widget/dl;->e()I

    move-result v0

    invoke-direct {p0}, Lkik/android/widget/dl;->g()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int v3, v0, v1

    invoke-direct {p0}, Lkik/android/widget/dl;->h()I

    move-result v4

    iget-object v0, p0, Lkik/android/widget/dl;->z:Landroid/view/View;

    const v1, 0x7f0e01dd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iget v0, p0, Lkik/android/widget/dl;->p:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_e

    sget v0, Lkik/android/widget/dl;->h:I

    move v1, v0

    :goto_4
    mul-int/lit8 v0, v1, 0x2

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v6, -0x80000000

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    const/high16 v7, -0x80000000

    invoke-static {v6, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v5, v0, v6}, Landroid/view/View;->measure(II)V

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v1, v0

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Lkik/android/widget/dl;->p:I

    const/4 v5, 0x2

    if-ne v1, v5, :cond_f

    iget v1, p0, Lkik/android/widget/dl;->q:I

    add-int/2addr v0, v1

    sget v1, Lkik/android/widget/dl;->d:I

    add-int/2addr v0, v1

    :goto_5
    const/4 v1, 0x4

    new-array v4, v1, [I

    const/4 v1, 0x0

    aput v3, v4, v1

    const/4 v1, 0x1

    aput v0, v4, v1

    const/4 v1, 0x2

    invoke-direct {p0}, Lkik/android/widget/dl;->g()I

    move-result v3

    iget-object v5, p0, Lkik/android/widget/dl;->A:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    add-int/2addr v3, v5

    aput v3, v4, v1

    const/4 v1, 0x3

    const/4 v3, 0x1

    aget v2, v2, v3

    sub-int v0, v2, v0

    sget v2, Lkik/android/widget/dl;->e:I

    sub-int/2addr v0, v2

    aput v0, v4, v1

    .line 729
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lkik/android/widget/dl;->z:Landroid/view/View;

    const/4 v2, -0x2

    const/4 v3, -0x2

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    .line 730
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 731
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lkik/android/widget/dl;->z:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 732
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    aget v1, v4, v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 733
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v4, v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 734
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    new-instance v1, Lkik/android/widget/dt;

    invoke-direct {v1, p0}, Lkik/android/widget/dt;-><init>(Lkik/android/widget/dl;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 741
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 742
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 743
    iget-object v1, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_11

    .line 744
    :cond_7
    :goto_6
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x2

    aget v3, v4, v3

    const/4 v5, 0x3

    aget v4, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 745
    invoke-direct {p0}, Lkik/android/widget/dl;->j()[I

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/dl;->a:[I

    const/4 v2, 0x0

    const/4 v3, 0x0

    aget v3, v0, v3

    aput v3, v1, v2

    iget-object v1, p0, Lkik/android/widget/dl;->a:[I

    const/4 v2, 0x1

    const/4 v3, 0x1

    aget v0, v0, v3

    aput v0, v1, v2

    .line 746
    iget-object v0, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->i()V

    .line 747
    const/4 v0, 0x1

    .line 750
    :goto_7
    return v0

    .line 723
    :cond_8
    const/16 v1, 0x8

    goto/16 :goto_2

    .line 726
    :cond_9
    iget-object v0, p0, Lkik/android/widget/dl;->s:Landroid/view/LayoutInflater;

    const v1, 0x7f030097

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0e01dd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {p0}, Lkik/android/widget/dl;->a()Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    const v0, 0x7f0e01df

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    new-instance v2, Lkik/android/widget/dk;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lkik/android/widget/dl;->c:Lcom/kik/android/c/f;

    invoke-direct {v2, v3, v4}, Lkik/android/widget/dk;-><init>(Landroid/content/Context;Lcom/kik/android/c/f;)V

    iput-object v2, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    iget-object v2, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-virtual {v2}, Lkik/android/widget/dk;->a()I

    move-result v2

    iput v2, p0, Lkik/android/widget/dl;->r:I

    iget-object v2, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-virtual {v2}, Lkik/android/widget/dk;->b()I

    move-result v2

    iput v2, p0, Lkik/android/widget/dl;->q:I

    iget-object v2, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-virtual {v2}, Lkik/android/widget/dk;->getCount()I

    move-result v2

    iput v2, p0, Lkik/android/widget/dl;->o:I

    invoke-direct {p0}, Lkik/android/widget/dl;->i()Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, 0x1

    iput-boolean v2, p0, Lkik/android/widget/dl;->m:Z

    :cond_b
    invoke-direct {p0}, Lkik/android/widget/dl;->i()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-direct {p0}, Lkik/android/widget/dl;->h()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Lkik/android/widget/dk;->a(I)V

    :cond_c
    iget v2, p0, Lkik/android/widget/dl;->r:I

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setColumnWidth(I)V

    iget-object v2, p0, Lkik/android/widget/dl;->B:Lkik/android/widget/dk;

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v2, p0, Lkik/android/widget/dl;->D:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v2, p0, Lkik/android/widget/dl;->E:Landroid/widget/AdapterView$OnItemLongClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    const v0, 0x7f0e01de

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    invoke-direct {p0, v0, v2}, Lkik/android/widget/dl;->a(Landroid/view/View;Landroid/view/View;)V

    iput-object v1, p0, Lkik/android/widget/dl;->z:Landroid/view/View;

    goto/16 :goto_3

    :cond_d
    const/16 v0, 0x8

    goto :goto_8

    .line 728
    :cond_e
    invoke-direct {p0}, Lkik/android/widget/dl;->f()I

    move-result v0

    move v1, v0

    goto/16 :goto_4

    :cond_f
    iget v1, p0, Lkik/android/widget/dl;->o:I

    int-to-double v6, v1

    int-to-double v4, v4

    div-double v4, v6, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v1, v4

    const/4 v4, 0x3

    if-le v1, v4, :cond_10

    const/4 v1, 0x3

    :cond_10
    iget v4, p0, Lkik/android/widget/dl;->q:I

    mul-int/2addr v1, v4

    add-int/2addr v0, v1

    sget v1, Lkik/android/widget/dl;->d:I

    add-int/2addr v0, v1

    goto/16 :goto_5

    .line 743
    :cond_11
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0e01dd

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/4 v0, 0x0

    iget v2, p0, Lkik/android/widget/dl;->p:I

    const/4 v5, 0x2

    if-ne v2, v5, :cond_13

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0e0096

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v1, Lkik/android/widget/dl;->h:I

    :goto_9
    if-eqz v3, :cond_12

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_12

    const/4 v0, 0x1

    :cond_12
    if-eqz v2, :cond_7

    if-eqz v0, :cond_14

    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v2, v1, v0, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    goto/16 :goto_6

    :cond_13
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0e01df

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0}, Lkik/android/widget/dl;->f()I

    move-result v1

    goto :goto_9

    :cond_14
    move v0, v1

    goto :goto_a

    .line 750
    :cond_15
    const/4 v0, 0x0

    goto/16 :goto_7
.end method

.method public final d()V
    .locals 4

    .prologue
    .line 761
    iget-object v0, p0, Lkik/android/widget/dl;->u:Lkik/android/widget/dl$c;

    if-eqz v0, :cond_0

    .line 762
    iget-object v0, p0, Lkik/android/widget/dl;->u:Lkik/android/widget/dl$c;

    invoke-virtual {v0}, Lkik/android/widget/dl$c;->a()V

    .line 764
    :cond_0
    iget-object v0, p0, Lkik/android/widget/dl;->v:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 765
    iget-object v0, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    if-eqz v0, :cond_1

    .line 766
    iget-object v0, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    invoke-virtual {v0}, Lkik/android/widget/dl$a;->dismiss()V

    .line 768
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/dl;->l:Z

    .line 769
    iget-object v0, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 770
    iget-object v0, p0, Lkik/android/widget/dl;->y:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 771
    iget-object v1, p0, Lkik/android/widget/dl;->C:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 773
    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 774
    new-instance v1, Lkik/android/widget/du;

    invoke-direct {v1, p0}, Lkik/android/widget/du;-><init>(Lkik/android/widget/dl;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 781
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 794
    if-nez p2, :cond_1

    .line 812
    :cond_0
    :goto_0
    return v2

    .line 797
    :cond_1
    iget-object v0, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    if-eqz v0, :cond_0

    .line 798
    iget-object v0, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    invoke-virtual {v0}, Lkik/android/widget/dl$a;->a()V

    .line 799
    iget-object v0, p0, Lkik/android/widget/dl;->w:Lkik/android/widget/dl$a;

    invoke-virtual {v0, p2}, Lkik/android/widget/dl$a;->a(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v0

    .line 800
    if-eqz v0, :cond_0

    .line 803
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 808
    :pswitch_0
    invoke-direct {p0, v0, v3}, Lkik/android/widget/dl;->a(Landroid/view/View;Z)V

    goto :goto_0

    .line 805
    :pswitch_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    .line 803
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

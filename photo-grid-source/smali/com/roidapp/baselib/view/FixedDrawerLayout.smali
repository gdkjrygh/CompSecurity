.class public Lcom/roidapp/baselib/view/FixedDrawerLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field private static final a:[I


# instance fields
.field private final b:Lcom/roidapp/baselib/view/i;

.field private c:I

.field private d:I

.field private e:F

.field private f:Landroid/graphics/Paint;

.field private final g:Landroid/support/v4/widget/ViewDragHelper;

.field private final h:Landroid/support/v4/widget/ViewDragHelper;

.field private final i:Lcom/roidapp/baselib/view/l;

.field private final j:Lcom/roidapp/baselib/view/l;

.field private k:I

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:Z

.field private q:Z

.field private r:Lcom/roidapp/baselib/view/j;

.field private s:F

.field private t:F

.field private u:Landroid/graphics/drawable/Drawable;

.field private v:Landroid/graphics/drawable/Drawable;

.field private w:Ljava/lang/CharSequence;

.field private x:Ljava/lang/CharSequence;

.field private y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 159
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100b3

    aput v2, v0, v1

    sput-object v0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 256
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 257
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 260
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 261
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    .line 264
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 163
    new-instance v0, Lcom/roidapp/baselib/view/i;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/i;-><init>(Lcom/roidapp/baselib/view/FixedDrawerLayout;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b:Lcom/roidapp/baselib/view/i;

    .line 168
    const/high16 v0, -0x67000000

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d:I

    .line 170
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f:Landroid/graphics/Paint;

    .line 178
    iput-boolean v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->m:Z

    .line 266
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 267
    const/high16 v1, 0x42800000    # 64.0f

    mul-float/2addr v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c:I

    .line 268
    const/high16 v1, 0x43c80000    # 400.0f

    mul-float/2addr v0, v1

    .line 270
    new-instance v1, Lcom/roidapp/baselib/view/l;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lcom/roidapp/baselib/view/l;-><init>(Lcom/roidapp/baselib/view/FixedDrawerLayout;I)V

    iput-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i:Lcom/roidapp/baselib/view/l;

    .line 271
    new-instance v1, Lcom/roidapp/baselib/view/l;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lcom/roidapp/baselib/view/l;-><init>(Lcom/roidapp/baselib/view/FixedDrawerLayout;I)V

    iput-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->j:Lcom/roidapp/baselib/view/l;

    .line 273
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i:Lcom/roidapp/baselib/view/l;

    invoke-static {p0, v4, v1}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    .line 274
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1, v3}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V

    .line 275
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V

    .line 276
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i:Lcom/roidapp/baselib/view/l;

    iget-object v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/l;->a(Landroid/support/v4/widget/ViewDragHelper;)V

    .line 278
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->j:Lcom/roidapp/baselib/view/l;

    invoke-static {p0, v4, v1}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    .line 279
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V

    .line 280
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->j:Lcom/roidapp/baselib/view/l;

    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/l;->a(Landroid/support/v4/widget/ViewDragHelper;)V

    .line 284
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->setFocusableInTouchMode(Z)V

    .line 286
    invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 289
    new-instance v0, Lcom/roidapp/baselib/view/h;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/h;-><init>(Lcom/roidapp/baselib/view/FixedDrawerLayout;)V

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 290
    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewGroupCompat;->setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V

    .line 291
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/view/FixedDrawerLayout;)Landroid/view/View;
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private a(II)V
    .locals 3

    .prologue
    const/4 v2, 0x3

    .line 388
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v0

    invoke-static {p2, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v1

    .line 390
    if-ne v1, v2, :cond_3

    .line 391
    iput p1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->n:I

    .line 395
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 397
    if-ne v1, v2, :cond_4

    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    .line 398
    :goto_1
    invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 400
    :cond_1
    packed-switch p1, :pswitch_data_0

    .line 415
    :cond_2
    :goto_2
    return-void

    .line 392
    :cond_3
    const/4 v0, 0x5

    if-ne v1, v0, :cond_0

    .line 393
    iput p1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->o:I

    goto :goto_0

    .line 397
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    goto :goto_1

    .line 402
    :pswitch_0
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 403
    if-eqz v0, :cond_2

    .line 404
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto :goto_2

    .line 408
    :pswitch_1
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 409
    if-eqz v0, :cond_2

    .line 410
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_2

    .line 400
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Z)V
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 1104
    .line 1105
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v4

    move v2, v3

    move v1, v3

    .line 1106
    :goto_0
    if-ge v2, v4, :cond_3

    .line 1107
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1108
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1110
    invoke-static {v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_1

    if-eqz p1, :cond_0

    iget-boolean v6, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->c:Z

    if-eqz v6, :cond_1

    .line 1114
    :cond_0
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v6

    .line 1116
    const/4 v7, 0x3

    invoke-virtual {p0, v5, v7}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 1117
    iget-object v7, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    neg-int v6, v6

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v7, v5, v6, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    move-result v5

    or-int/2addr v1, v5

    .line 1124
    :goto_1
    iput-boolean v3, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->c:Z

    .line 1106
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 1120
    :cond_2
    iget-object v6, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v7

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v6, v5, v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    move-result v5

    or-int/2addr v1, v5

    goto :goto_1

    .line 1127
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i:Lcom/roidapp/baselib/view/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/l;->a()V

    .line 1128
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->j:Lcom/roidapp/baselib/view/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/l;->a()V

    .line 1130
    if-eqz v1, :cond_4

    .line 1131
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->invalidate()V

    .line 1133
    :cond_4
    return-void
.end method

.method static b(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 626
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    return v0
.end method

.method static synthetic c()[I
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a:[I

    return-object v0
.end method

.method private d()Landroid/view/View;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 1320
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v4

    move v3, v2

    .line 1321
    :goto_0
    if-ge v3, v4, :cond_3

    .line 1322
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1323
    invoke-static {v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3258
    invoke-static {v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3259
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "View "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a drawer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3261
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    const/4 v5, 0x0

    cmpl-float v0, v0, v5

    if-lez v0, :cond_1

    const/4 v0, 0x1

    .line 1323
    :goto_1
    if-eqz v0, :cond_2

    move-object v0, v1

    .line 1327
    :goto_2
    return-object v0

    :cond_1
    move v0, v2

    .line 3261
    goto :goto_1

    .line 1321
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 1327
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method static d(Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 975
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 976
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v0

    .line 978
    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static g(Landroid/view/View;)Z
    .locals 3

    .prologue
    .line 1226
    invoke-static {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1227
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a drawer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1229
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget-boolean v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    return v0
.end method

.method static synthetic h(Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 85
    .line 4432
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 85
    goto :goto_0
.end method

.method private static i(Landroid/view/View;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 968
    if-nez p0, :cond_0

    move v0, v1

    .line 971
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 472
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c(Landroid/view/View;)I

    move-result v0

    .line 473
    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 474
    iget v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->n:I

    .line 478
    :goto_0
    return v0

    .line 475
    :cond_0
    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 476
    iget v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->o:I

    goto :goto_0

    .line 478
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(I)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 511
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v0

    .line 513
    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 514
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->w:Ljava/lang/CharSequence;

    .line 518
    :goto_0
    return-object v0

    .line 515
    :cond_0
    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 516
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->x:Ljava/lang/CharSequence;

    goto :goto_0

    .line 518
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 1332
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    if-nez v0, :cond_1

    .line 1333
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 1334
    const/4 v4, 0x3

    move-wide v2, v0

    move v6, v5

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 1336
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v1

    .line 1337
    :goto_0
    if-ge v7, v1, :cond_0

    .line 1338
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1337
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1340
    :cond_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 1341
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    .line 1343
    :cond_1
    return-void
.end method

.method final a(ILandroid/view/View;)V
    .locals 8

    .prologue
    const/16 v7, 0x20

    const/4 v6, 0x4

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 526
    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I

    move-result v1

    .line 527
    iget-object v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I

    move-result v4

    .line 530
    if-eq v1, v3, :cond_0

    if-ne v4, v3, :cond_5

    :cond_0
    move v1, v3

    .line 538
    :goto_0
    if-eqz p2, :cond_3

    if-nez p1, :cond_3

    .line 539
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 540
    iget v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-nez v4, :cond_8

    .line 1557
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1558
    iget-boolean v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    if-eqz v4, :cond_3

    .line 1559
    iput-boolean v2, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    .line 1560
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    if-eqz v0, :cond_1

    .line 1561
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    invoke-interface {v0}, Lcom/roidapp/baselib/view/j;->b()V

    .line 1566
    :cond_1
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1567
    if-eqz v0, :cond_2

    .line 1568
    invoke-static {v0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 1571
    :cond_2
    invoke-static {p2, v6}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 1577
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1578
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 1579
    if-eqz v0, :cond_3

    .line 1580
    invoke-virtual {v0, v7}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 547
    :cond_3
    :goto_1
    iget v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->k:I

    if-eq v1, v0, :cond_4

    .line 548
    iput v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->k:I

    .line 550
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    if-eqz v0, :cond_4

    .line 551
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    invoke-interface {v0, v1}, Lcom/roidapp/baselib/view/j;->a(I)V

    .line 554
    :cond_4
    return-void

    .line 532
    :cond_5
    if-eq v1, v0, :cond_6

    if-ne v4, v0, :cond_7

    :cond_6
    move v1, v0

    .line 533
    goto :goto_0

    :cond_7
    move v1, v2

    .line 535
    goto :goto_0

    .line 542
    :cond_8
    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v4

    if-nez v0, :cond_3

    .line 1587
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1588
    iget-boolean v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    if-nez v4, :cond_3

    .line 1589
    iput-boolean v3, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    .line 1590
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    if-eqz v0, :cond_9

    .line 1591
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    invoke-interface {v0}, Lcom/roidapp/baselib/view/j;->a()V

    .line 1596
    :cond_9
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1597
    if-eqz v0, :cond_a

    .line 1598
    invoke-static {v0, v6}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 1601
    :cond_a
    invoke-static {p2, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 1604
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->sendAccessibilityEvent(I)V

    .line 1605
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    goto :goto_1
.end method

.method final a(Landroid/view/View;F)V
    .locals 2

    .prologue
    .line 616
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 617
    iget v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    cmpl-float v1, p2, v1

    if-nez v1, :cond_1

    .line 623
    :cond_0
    :goto_0
    return-void

    .line 621
    :cond_1
    iput p2, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    .line 1610
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    if-eqz v0, :cond_0

    .line 1611
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    invoke-interface {v0, p2}, Lcom/roidapp/baselib/view/j;->a(F)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/baselib/view/j;)V
    .locals 0

    .prologue
    .line 347
    iput-object p1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->r:Lcom/roidapp/baselib/view/j;

    .line 348
    return-void
.end method

.method final a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 639
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c(Landroid/view/View;)I

    move-result v0

    .line 640
    and-int/2addr v0, p2

    if-ne v0, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 1412
    if-gtz p2, :cond_0

    if-gez p2, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 1413
    :cond_0
    const/4 v0, 0x4

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 1417
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b:Lcom/roidapp/baselib/view/i;

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 1423
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1424
    return-void

    .line 1420
    :cond_1
    const/4 v0, 0x1

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    goto :goto_0
.end method

.method final b(I)Landroid/view/View;
    .locals 5

    .prologue
    .line 673
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v0

    and-int/lit8 v2, v0, 0x7

    .line 675
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v3

    .line 676
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    .line 677
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 678
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c(Landroid/view/View;)I

    move-result v4

    .line 679
    and-int/lit8 v4, v4, 0x7

    if-ne v4, v2, :cond_0

    .line 683
    :goto_1
    return-object v0

    .line 676
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 683
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1443
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->y:Z

    .line 1444
    return-void
.end method

.method final c(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 634
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 635
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v0

    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 1307
    instance-of v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeScroll()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 883
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v3

    .line 884
    const/4 v1, 0x0

    .line 885
    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 886
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    .line 887
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 885
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 889
    :cond_0
    iput v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e:F

    .line 892
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1, v4}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v1

    or-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 893
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 895
    :cond_1
    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 11

    .prologue
    .line 907
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getHeight()I

    move-result v4

    .line 908
    invoke-static {p2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i(Landroid/view/View;)Z

    move-result v5

    .line 909
    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v2

    .line 911
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    .line 912
    if-eqz v5, :cond_6

    .line 913
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v7

    .line 914
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v7, :cond_5

    .line 915
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 916
    if-eq v8, p2, :cond_4

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_4

    .line 1898
    invoke-virtual {v8}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1899
    if-eqz v0, :cond_2

    .line 1900
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    const/4 v9, -0x1

    if-ne v0, v9, :cond_1

    const/4 v0, 0x1

    .line 916
    :goto_1
    if-eqz v0, :cond_4

    invoke-static {v8}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lt v0, v4, :cond_4

    .line 922
    const/4 v0, 0x3

    invoke-virtual {p0, v8, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 923
    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    move-result v0

    .line 924
    if-le v0, v1, :cond_a

    :goto_2
    move v1, v0

    move v0, v2

    .line 914
    :cond_0
    :goto_3
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_0

    .line 1900
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 1902
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 926
    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 927
    if-lt v0, v2, :cond_0

    :cond_4
    move v0, v2

    goto :goto_3

    .line 930
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getHeight()I

    move-result v3

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    :cond_6
    move v0, v2

    .line 932
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v7

    .line 933
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 935
    iget v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_8

    if-eqz v5, :cond_8

    .line 936
    iget v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d:I

    const/high16 v3, -0x1000000

    and-int/2addr v2, v3

    ushr-int/lit8 v2, v2, 0x18

    .line 937
    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 938
    shl-int/lit8 v2, v2, 0x18

    iget v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d:I

    const v4, 0xffffff

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    .line 939
    iget-object v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 941
    int-to-float v1, v1

    const/4 v2, 0x0

    int-to-float v3, v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getHeight()I

    move-result v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 964
    :cond_7
    :goto_4
    return v7

    .line 942
    :cond_8
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->u:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    const/4 v0, 0x3

    invoke-virtual {p0, p2, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 943
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->u:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 944
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    .line 945
    iget-object v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I

    move-result v2

    .line 946
    const/4 v3, 0x0

    int-to-float v4, v1

    int-to-float v2, v2

    div-float v2, v4, v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 948
    iget-object v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->u:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v4

    add-int/2addr v0, v1

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v3, v1, v4, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 950
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->u:Landroid/graphics/drawable/Drawable;

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 951
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->u:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_4

    .line 952
    :cond_9
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->v:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    const/4 v0, 0x5

    invoke-virtual {p0, p2, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 953
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 954
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 955
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v2

    sub-int/2addr v2, v1

    .line 956
    iget-object v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v3}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I

    move-result v3

    .line 957
    const/4 v4, 0x0

    int-to-float v2, v2

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 959
    iget-object v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->v:Landroid/graphics/drawable/Drawable;

    sub-int v0, v1, v0

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v3, v0, v4, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 961
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->v:Landroid/graphics/drawable/Drawable;

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 962
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_4

    :cond_a
    move v0, v1

    goto/16 :goto_2
.end method

.method public final e(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 1141
    invoke-static {p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1142
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a sliding drawer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1145
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->m:Z

    if-eqz v0, :cond_1

    .line 1146
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1147
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    .line 1148
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    .line 1157
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->invalidate()V

    .line 1158
    return-void

    .line 1150
    :cond_1
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1151
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    goto :goto_0

    .line 1153
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    goto :goto_0
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 1181
    invoke-static {p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1182
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a sliding drawer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1185
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->m:Z

    if-eqz v0, :cond_1

    .line 1186
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1187
    const/4 v1, 0x0

    iput v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    .line 1188
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    .line 1197
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->invalidate()V

    .line 1198
    return-void

    .line 1190
    :cond_1
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1191
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    goto :goto_0

    .line 1194
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    goto :goto_0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 1293
    new-instance v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    invoke-direct {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;-><init>()V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 1312
    new-instance v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 1298
    instance-of v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    check-cast p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;-><init>(Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;)V

    :goto_0
    return-object v0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 710
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 711
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->m:Z

    .line 712
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 704
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 705
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->m:Z

    .line 706
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 983
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 986
    iget-object v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v3, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v3

    iget-object v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v4, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    or-int/2addr v3, v4

    .line 991
    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    move v0, v2

    .line 1023
    :goto_1
    if-nez v3, :cond_1

    if-nez v0, :cond_1

    .line 2281
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v4

    move v3, v2

    .line 2282
    :goto_2
    if-ge v3, v4, :cond_4

    .line 2283
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 2284
    iget-boolean v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->c:Z

    if-eqz v0, :cond_3

    move v0, v1

    .line 1023
    :goto_3
    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    if-eqz v0, :cond_2

    :cond_1
    move v2, v1

    :cond_2
    return v2

    .line 993
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 994
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 995
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->s:F

    .line 996
    iput v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->t:F

    .line 997
    iget v5, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-lez v5, :cond_5

    iget-object v5, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    float-to-int v0, v0

    float-to-int v4, v4

    invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    .line 1001
    :goto_4
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->p:Z

    .line 1002
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    goto :goto_1

    .line 1008
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1009
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i:Lcom/roidapp/baselib/view/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/l;->a()V

    .line 1010
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->j:Lcom/roidapp/baselib/view/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/l;->a()V

    move v0, v2

    goto :goto_1

    .line 1017
    :pswitch_2
    invoke-direct {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Z)V

    .line 1018
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->p:Z

    .line 1019
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    goto :goto_0

    .line 2282
    :cond_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    :cond_4
    move v0, v2

    .line 2288
    goto :goto_3

    :cond_5
    move v0, v2

    goto :goto_4

    .line 991
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1347
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 3316
    invoke-direct {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    move v1, v0

    .line 1347
    :goto_0
    if-eqz v1, :cond_1

    .line 1348
    invoke-static {p2}, Landroid/support/v4/view/KeyEventCompat;->startTracking(Landroid/view/KeyEvent;)V

    .line 1351
    :goto_1
    return v0

    .line 3316
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 1351
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1356
    const/4 v1, 0x4

    if-ne p1, v1, :cond_2

    .line 1357
    invoke-direct {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d()Landroid/view/View;

    move-result-object v1

    .line 1358
    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;)I

    move-result v2

    if-nez v2, :cond_0

    .line 4100
    invoke-direct {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Z)V

    .line 1361
    :cond_0
    if-eqz v1, :cond_1

    const/4 v0, 0x1

    .line 1363
    :cond_1
    :goto_0
    return v0

    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 14

    .prologue
    .line 792
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->l:Z

    .line 793
    sub-int v6, p4, p2

    .line 794
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v7

    .line 795
    const/4 v0, 0x0

    move v5, v0

    :goto_0
    if-ge v5, v7, :cond_8

    .line 796
    invoke-virtual {p0, v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 798
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 802
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 804
    invoke-static {v8}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 805
    iget v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->leftMargin:I

    iget v2, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    iget v3, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v3, v4

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v0, v4

    invoke-virtual {v8, v1, v2, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 795
    :cond_0
    :goto_1
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_0

    .line 809
    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 810
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    .line 814
    const/4 v1, 0x3

    invoke-virtual {p0, v8, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 815
    neg-int v1, v9

    int-to-float v2, v9

    iget v3, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    add-int/2addr v2, v1

    .line 816
    add-int v1, v9, v2

    int-to-float v1, v1

    int-to-float v3, v9

    div-float/2addr v1, v3

    .line 822
    :goto_2
    iget v3, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    .line 824
    :goto_3
    iget v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    and-int/lit8 v4, v4, 0x70

    .line 826
    sparse-switch v4, :sswitch_data_0

    .line 829
    iget v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    add-int/2addr v9, v2

    iget v11, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    add-int/2addr v10, v11

    invoke-virtual {v8, v2, v4, v9, v10}, Landroid/view/View;->layout(IIII)V

    .line 860
    :goto_4
    if-eqz v3, :cond_2

    .line 861
    invoke-virtual {p0, v8, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;F)V

    .line 864
    :cond_2
    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    const/4 v0, 0x0

    .line 865
    :goto_5
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 866
    invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 818
    :cond_3
    int-to-float v1, v9

    iget v2, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->b:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    sub-int v2, v6, v1

    .line 819
    sub-int v1, v6, v2

    int-to-float v1, v1

    int-to-float v3, v9

    div-float/2addr v1, v3

    goto :goto_2

    .line 822
    :cond_4
    const/4 v3, 0x0

    goto :goto_3

    .line 835
    :sswitch_0
    sub-int v4, p5, p3

    .line 836
    iget v10, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->bottomMargin:I

    sub-int v10, v4, v10

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    sub-int/2addr v10, v11

    add-int/2addr v9, v2

    iget v11, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v4, v11

    invoke-virtual {v8, v2, v10, v9, v4}, Landroid/view/View;->layout(IIII)V

    goto :goto_4

    .line 844
    :sswitch_1
    sub-int v11, p5, p3

    .line 845
    sub-int v4, v11, v10

    div-int/lit8 v4, v4, 0x2

    .line 849
    iget v12, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    if-ge v4, v12, :cond_6

    .line 850
    iget v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    .line 854
    :cond_5
    :goto_6
    add-int/2addr v9, v2

    add-int/2addr v10, v4

    invoke-virtual {v8, v2, v4, v9, v10}, Landroid/view/View;->layout(IIII)V

    goto :goto_4

    .line 851
    :cond_6
    add-int v12, v4, v10

    iget v13, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->bottomMargin:I

    sub-int v13, v11, v13

    if-le v12, v13, :cond_5

    .line 852
    iget v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->bottomMargin:I

    sub-int v4, v11, v4

    sub-int/2addr v4, v10

    goto :goto_6

    .line 864
    :cond_7
    const/4 v0, 0x4

    goto :goto_5

    .line 870
    :cond_8
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->l:Z

    .line 871
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->m:Z

    .line 872
    return-void

    .line 826
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x50 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 10

    .prologue
    const/16 v1, 0x12c

    const/high16 v6, -0x80000000

    const/high16 v9, 0x40000000    # 2.0f

    .line 716
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 717
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 718
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 719
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 721
    if-ne v3, v9, :cond_0

    if-eq v4, v9, :cond_a

    .line 722
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 727
    if-eq v3, v6, :cond_1

    .line 729
    if-nez v3, :cond_1

    move v2, v1

    .line 733
    :cond_1
    if-eq v4, v6, :cond_a

    .line 736
    if-nez v4, :cond_a

    .line 746
    :goto_0
    invoke-virtual {p0, v2, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->setMeasuredDimension(II)V

    .line 750
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v4

    .line 751
    const/4 v0, 0x0

    move v3, v0

    :goto_1
    if-ge v3, v4, :cond_9

    .line 752
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 754
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v6, 0x8

    if-eq v0, v6, :cond_2

    .line 758
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 760
    invoke-static {v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 762
    iget v6, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->leftMargin:I

    sub-int v6, v2, v6

    iget v7, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->rightMargin:I

    sub-int/2addr v6, v7

    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 764
    iget v7, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    sub-int v7, v1, v7

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->bottomMargin:I

    sub-int v0, v7, v0

    invoke-static {v0, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 766
    invoke-virtual {v5, v6, v0}, Landroid/view/View;->measure(II)V

    .line 751
    :cond_2
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 741
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DrawerLayout must be measured with MeasureSpec.EXACTLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 767
    :cond_4
    invoke-static {v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 768
    invoke-virtual {p0, v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c(Landroid/view/View;)I

    move-result v6

    and-int/lit8 v6, v6, 0x7

    .line 770
    and-int/lit8 v7, v6, 0x0

    if-eqz v7, :cond_7

    .line 771
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "Child drawer has absolute gravity "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1693
    and-int/lit8 v0, v6, 0x3

    const/4 v3, 0x3

    if-ne v0, v3, :cond_5

    .line 1694
    const-string v0, "LEFT"

    .line 771
    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " but this DrawerLayout already has a drawer view along that edge"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1696
    :cond_5
    and-int/lit8 v0, v6, 0x5

    const/4 v3, 0x5

    if-ne v0, v3, :cond_6

    .line 1697
    const-string v0, "RIGHT"

    goto :goto_3

    .line 1699
    :cond_6
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 775
    :cond_7
    iget v6, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c:I

    iget v7, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->leftMargin:I

    add-int/2addr v6, v7

    iget v7, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->rightMargin:I

    add-int/2addr v6, v7

    iget v7, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->width:I

    invoke-static {p1, v6, v7}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildMeasureSpec(III)I

    move-result v6

    .line 778
    iget v7, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->topMargin:I

    iget v8, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v7, v8

    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->height:I

    invoke-static {p2, v7, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildMeasureSpec(III)I

    move-result v0

    .line 781
    invoke-virtual {v5, v6, v0}, Landroid/view/View;->measure(II)V

    goto :goto_2

    .line 783
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Child "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 788
    :cond_9
    return-void

    :cond_a
    move v1, v0

    goto/16 :goto_0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .prologue
    .line 1368
    check-cast p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;

    .line 1369
    invoke-virtual {p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1371
    iget v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    if-eqz v0, :cond_0

    .line 1372
    iget v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1373
    if-eqz v0, :cond_0

    .line 1374
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    .line 1378
    :cond_0
    iget v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->b:I

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(II)V

    .line 1379
    iget v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->c:I

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(II)V

    .line 1380
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .prologue
    .line 1384
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1386
    new-instance v2, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;

    invoke-direct {v2, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1388
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v3

    .line 1389
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 1390
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1391
    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1395
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1396
    iget-boolean v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    if-eqz v4, :cond_1

    .line 1397
    iget v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    iput v0, v2, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    .line 1403
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->n:I

    iput v0, v2, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->b:I

    .line 1404
    iget v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->o:I

    iput v0, v2, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->c:I

    .line 1406
    return-object v2

    .line 1389
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1029
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->y:Z

    if-eqz v0, :cond_0

    .line 1080
    :goto_0
    return v2

    .line 1033
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    .line 1034
    iget-object v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    .line 1036
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 1039
    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    :goto_1
    :pswitch_0
    move v2, v1

    .line 1080
    goto :goto_0

    .line 1041
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1042
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 1043
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->s:F

    .line 1044
    iput v3, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->t:F

    .line 1045
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->p:Z

    .line 1046
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    goto :goto_1

    .line 1051
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1052
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 1054
    iget-object v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    float-to-int v5, v0

    float-to-int v6, v3

    invoke-virtual {v4, v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v4

    .line 1055
    if-eqz v4, :cond_4

    invoke-static {v4}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->i(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1056
    iget v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->s:F

    sub-float/2addr v0, v4

    .line 1057
    iget v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->t:F

    sub-float/2addr v3, v4

    .line 1058
    iget-object v4, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I

    move-result v4

    .line 1059
    mul-float/2addr v0, v0

    mul-float/2addr v3, v3

    add-float/2addr v0, v3

    mul-int v3, v4, v4

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_4

    .line 2644
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildCount()I

    move-result v5

    move v4, v2

    .line 2645
    :goto_2
    if-ge v4, v5, :cond_2

    .line 2646
    invoke-virtual {p0, v4}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2647
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    iget-boolean v0, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->d:Z

    if-eqz v0, :cond_1

    move-object v0, v3

    .line 1062
    :goto_3
    if-eqz v0, :cond_4

    .line 1063
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;)I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    move v0, v1

    .line 1067
    :goto_4
    invoke-direct {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Z)V

    .line 1068
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->p:Z

    goto :goto_1

    .line 2645
    :cond_1
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_2

    .line 2651
    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    move v0, v2

    .line 1063
    goto :goto_4

    .line 1073
    :pswitch_3
    invoke-direct {p0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Z)V

    .line 1074
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->p:Z

    .line 1075
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->q:Z

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_4

    .line 1039
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    .prologue
    .line 1088
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 1090
    iput-boolean p1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->p:Z

    .line 1091
    if-eqz p1, :cond_0

    .line 1092
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Z)V

    .line 1094
    :cond_0
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 876
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout;->l:Z

    if-nez v0, :cond_0

    .line 877
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 879
    :cond_0
    return-void
.end method

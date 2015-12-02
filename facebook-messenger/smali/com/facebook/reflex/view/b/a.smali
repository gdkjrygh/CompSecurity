.class public Lcom/facebook/reflex/view/b/a;
.super Ljava/lang/Object;
.source "ContainerDelegate.java"


# static fields
.field private static final i:[Lcom/facebook/reflex/view/b/g;


# instance fields
.field protected final a:Lcom/facebook/reflex/view/b/i;

.field protected final b:Lcom/facebook/reflex/view/b/h;

.field protected final c:Landroid/view/ViewGroup;

.field protected final d:Lcom/facebook/reflex/Container;

.field protected final e:Lcom/facebook/reflex/view/b/m;

.field protected final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/reflex/Widget;",
            ">;"
        }
    .end annotation
.end field

.field protected g:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/reflex/view/b/g;",
            ">;"
        }
    .end annotation
.end field

.field protected h:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 57
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/reflex/view/b/g;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/reflex/view/b/g;->Taps:Lcom/facebook/reflex/view/b/g;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/reflex/view/b/g;->HorizontalPans:Lcom/facebook/reflex/view/b/g;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/reflex/view/b/g;->VerticalPans:Lcom/facebook/reflex/view/b/g;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/reflex/view/b/g;->UnconstrainedPans:Lcom/facebook/reflex/view/b/g;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/facebook/reflex/view/b/g;->GenericTouches:Lcom/facebook/reflex/view/b/g;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/reflex/view/b/a;->i:[Lcom/facebook/reflex/view/b/g;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/reflex/view/b/i;Lcom/facebook/reflex/view/b/h;)V
    .locals 2
    .param p2    # Lcom/facebook/reflex/view/b/h;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/a;->f:Ljava/util/ArrayList;

    .line 74
    const-class v0, Lcom/facebook/reflex/view/b/g;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/b/a;->g:Ljava/util/EnumSet;

    .line 76
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    .line 79
    iput-object p1, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    .line 80
    iput-object p2, p0, Lcom/facebook/reflex/view/b/a;->b:Lcom/facebook/reflex/view/b/h;

    .line 81
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/i;->b()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    .line 83
    new-instance v0, Lcom/facebook/reflex/view/b/b;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-direct {v0, p0, v1}, Lcom/facebook/reflex/view/b/b;-><init>(Lcom/facebook/reflex/view/b/a;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/a;->e:Lcom/facebook/reflex/view/b/m;

    .line 95
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    .line 100
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    .line 101
    return-void
.end method

.method private a(Landroid/view/View;II)V
    .locals 3

    .prologue
    .line 328
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 340
    :cond_0
    :goto_0
    return-void

    .line 332
    :cond_1
    instance-of v0, p1, Lcom/facebook/reflex/view/b/r;

    if-eqz v0, :cond_2

    move-object v0, p1

    .line 333
    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 334
    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    .line 335
    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    add-int/2addr v1, p2

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    add-int/2addr v2, p3

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Widget;->b(FF)V

    goto :goto_0

    .line 337
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 338
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    add-int/2addr v2, p3

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/reflex/view/b/a;->a(Landroid/view/ViewGroup;II)V

    goto :goto_0
.end method

.method private a(Landroid/view/ViewGroup;II)V
    .locals 3

    .prologue
    .line 321
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 322
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 323
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2, p2, p3}, Lcom/facebook/reflex/view/b/a;->a(Landroid/view/View;II)V

    .line 322
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 325
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/b/a;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/b/a;->b(Landroid/view/MotionEvent;)V

    return-void
.end method

.method private a(Lcom/facebook/reflex/y;)V
    .locals 2

    .prologue
    .line 212
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    new-instance v1, Lcom/facebook/reflex/view/b/e;

    invoke-direct {v1, p0}, Lcom/facebook/reflex/view/b/e;-><init>(Lcom/facebook/reflex/view/b/a;)V

    invoke-virtual {v0, v1, p1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/x;Lcom/facebook/reflex/y;)V

    .line 220
    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 2

    .prologue
    .line 343
    invoke-static {}, Lcom/facebook/reflex/view/b/k;->a()Lcom/facebook/reflex/view/b/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/reflex/view/b/k;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 344
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->b:Lcom/facebook/reflex/view/b/h;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/b/h;->a(Landroid/view/MotionEvent;)Z

    .line 345
    return-void
.end method

.method private k()Z
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->e:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/m;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->e:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/d;)V

    .line 284
    const/4 v0, 0x1

    .line 287
    :goto_0
    return v0

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/d;)V

    .line 287
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 293
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-direct {p0, v0, v1, v1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/view/ViewGroup;II)V

    .line 296
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Ljava/util/ArrayList;)V

    .line 297
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 298
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/reflex/Container;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    return-object v0
.end method

.method public a(F)V
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/Container;->b(F)V

    .line 349
    return-void
.end method

.method public a(II)V
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/Container;->a(II)V

    .line 307
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->e:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/b/m;->a(II)V

    .line 308
    return-void
.end method

.method public a(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 268
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/b/i;->a(Landroid/graphics/Canvas;)V

    .line 273
    :goto_0
    return-void

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/b/i;->a(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public a(Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 104
    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/facebook/q;->ContainerView:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 107
    sget v1, Lcom/facebook/q;->ContainerView_dispatchAndroidTouchEvents:I

    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/facebook/reflex/view/b/a;->a(Z)V

    .line 109
    sget v1, Lcom/facebook/q;->ContainerView_compatibilityDrawMode:I

    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/facebook/reflex/view/b/a;->b(Z)V

    .line 112
    sget v1, Lcom/facebook/q;->ContainerView_reflexAndroidTouchMode:I

    const/4 v3, -0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 114
    if-ltz v1, :cond_1

    .line 115
    const-class v3, Lcom/facebook/reflex/view/b/g;

    invoke-static {v3}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v3

    .line 116
    :goto_0
    const/16 v4, 0x20

    if-ge v0, v4, :cond_0

    .line 117
    if-nez v1, :cond_2

    .line 125
    :cond_0
    invoke-virtual {p0, v3}, Lcom/facebook/reflex/view/b/a;->a(Ljava/util/EnumSet;)V

    .line 127
    :cond_1
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 128
    return-void

    .line 120
    :cond_2
    and-int/lit8 v4, v1, 0x1

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    .line 121
    sget-object v4, Lcom/facebook/reflex/view/b/a;->i:[Lcom/facebook/reflex/view/b/g;

    aget-object v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/util/EnumSet;->add(Ljava/lang/Object;)Z

    .line 123
    :cond_3
    shr-int/lit8 v1, v1, 0x1

    .line 116
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public a(Ljava/util/EnumSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/reflex/view/b/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 160
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->g:Ljava/util/EnumSet;

    invoke-virtual {p1, v0}, Ljava/util/EnumSet;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->g:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/EnumSet;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 209
    :cond_0
    return-void

    .line 164
    :cond_1
    sget-object v0, Lcom/facebook/reflex/view/b/g;->HorizontalPans:Lcom/facebook/reflex/view/b/g;

    invoke-virtual {p1, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 165
    sget-object v1, Lcom/facebook/reflex/view/b/g;->VerticalPans:Lcom/facebook/reflex/view/b/g;

    invoke-virtual {p1, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    .line 166
    sget-object v2, Lcom/facebook/reflex/view/b/g;->UnconstrainedPans:Lcom/facebook/reflex/view/b/g;

    invoke-virtual {p1, v2}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    .line 170
    if-eqz v0, :cond_2

    if-nez v1, :cond_4

    if-nez v2, :cond_4

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_4

    :cond_3
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 173
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/b/a;->g:Ljava/util/EnumSet;

    .line 175
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, v3}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/ak;)V

    .line 176
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, v3}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/x;)V

    .line 177
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, v3}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/q;)V

    .line 178
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->g:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/EnumSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/g;

    .line 179
    sget-object v2, Lcom/facebook/reflex/view/b/f;->a:[I

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/g;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 181
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    new-instance v2, Lcom/facebook/reflex/view/b/c;

    invoke-direct {v2, p0}, Lcom/facebook/reflex/view/b/c;-><init>(Lcom/facebook/reflex/view/b/a;)V

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/ak;)V

    goto :goto_1

    .line 170
    :cond_4
    const/4 v0, 0x0

    goto :goto_0

    .line 191
    :pswitch_1
    sget-object v0, Lcom/facebook/reflex/y;->PanHorizontal:Lcom/facebook/reflex/y;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/b/a;->a(Lcom/facebook/reflex/y;)V

    goto :goto_1

    .line 194
    :pswitch_2
    sget-object v0, Lcom/facebook/reflex/y;->PanVertical:Lcom/facebook/reflex/y;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/b/a;->a(Lcom/facebook/reflex/y;)V

    goto :goto_1

    .line 197
    :pswitch_3
    sget-object v0, Lcom/facebook/reflex/y;->PanUnconstrained:Lcom/facebook/reflex/y;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/b/a;->a(Lcom/facebook/reflex/y;)V

    goto :goto_1

    .line 200
    :pswitch_4
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    new-instance v2, Lcom/facebook/reflex/view/b/d;

    invoke-direct {v2, p0}, Lcom/facebook/reflex/view/b/d;-><init>(Lcom/facebook/reflex/view/b/a;)V

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/q;)V

    goto :goto_1

    .line 179
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public a(Z)V
    .locals 4

    .prologue
    .line 143
    if-eqz p1, :cond_0

    .line 144
    iget-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    .line 148
    :goto_0
    return-void

    .line 146
    :cond_0
    iget-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    const-wide/16 v2, -0x5

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    goto :goto_0
.end method

.method public a(IIII)Z
    .locals 2

    .prologue
    .line 244
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/i;->c()Lcom/facebook/reflex/view/b/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 248
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public a(Landroid/graphics/Rect;)Z
    .locals 2

    .prologue
    .line 236
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/i;->c()Lcom/facebook/reflex/view/b/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 240
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 151
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->b:Lcom/facebook/reflex/view/b/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->b:Lcom/facebook/reflex/view/b/h;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/b/h;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a([ILandroid/graphics/Rect;)Z
    .locals 2

    .prologue
    .line 260
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/i;->c()Lcom/facebook/reflex/view/b/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 264
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public b()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->e:Lcom/facebook/reflex/view/b/m;

    return-object v0
.end method

.method public b(F)V
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/Container;->c(F)V

    .line 353
    return-void
.end method

.method public b(Z)V
    .locals 4

    .prologue
    .line 223
    if-eqz p1, :cond_0

    .line 224
    iget-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    .line 228
    :goto_0
    invoke-direct {p0}, Lcom/facebook/reflex/view/b/a;->k()Z

    .line 229
    return-void

    .line 226
    :cond_0
    iget-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    const-wide/16 v2, -0x2

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    goto :goto_0
.end method

.method public c()Z
    .locals 4

    .prologue
    .line 139
    iget-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    const-wide/16 v2, 0x4

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 4

    .prologue
    .line 232
    iget-wide v0, p0, Lcom/facebook/reflex/view/b/a;->h:J

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 2

    .prologue
    .line 252
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/i;->c()Lcom/facebook/reflex/view/b/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 256
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 276
    invoke-direct {p0}, Lcom/facebook/reflex/view/b/a;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->e:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/m;->f()V

    .line 279
    :cond_0
    return-void
.end method

.method public g()V
    .locals 0

    .prologue
    .line 301
    invoke-direct {p0}, Lcom/facebook/reflex/view/b/a;->l()V

    .line 302
    invoke-direct {p0}, Lcom/facebook/reflex/view/b/a;->k()Z

    .line 303
    return-void
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 311
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()F
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0}, Lcom/facebook/reflex/Container;->j()F

    move-result v0

    return v0
.end method

.method public j()F
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/facebook/reflex/view/b/a;->d:Lcom/facebook/reflex/Container;

    invoke-virtual {v0}, Lcom/facebook/reflex/Container;->k()F

    move-result v0

    return v0
.end method

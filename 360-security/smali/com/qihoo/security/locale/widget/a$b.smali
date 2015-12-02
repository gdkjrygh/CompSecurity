.class Lcom/qihoo/security/locale/widget/a$b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/widget/a;

.field private b:Landroid/view/Menu;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:I

.field private k:I

.field private l:Ljava/lang/CharSequence;

.field private m:Ljava/lang/CharSequence;

.field private n:I

.field private o:C

.field private p:C

.field private q:I

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:I

.field private v:I

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Landroid/support/v4/view/d;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/locale/widget/a;Landroid/view/Menu;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 283
    iput-object p2, p0, Lcom/qihoo/security/locale/widget/a$b;->b:Landroid/view/Menu;

    .line 285
    invoke-virtual {p0}, Lcom/qihoo/security/locale/widget/a$b;->a()V

    .line 286
    return-void
.end method

.method private a(Ljava/lang/String;)C
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 393
    if-nez p1, :cond_0

    .line 396
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/locale/widget/a$b;)Landroid/support/v4/view/d;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->z:Landroid/support/v4/view/d;

    return-object v0
.end method

.method private a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 467
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/locale/widget/a;->a(Lcom/qihoo/security/locale/widget/a;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 468
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 469
    invoke-virtual {v0, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 474
    :goto_0
    return-object v0

    .line 470
    :catch_0
    move-exception v0

    .line 474
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/view/MenuItem;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 401
    iget-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->r:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v3, p0, Lcom/qihoo/security/locale/widget/a$b;->s:Z

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v3, p0, Lcom/qihoo/security/locale/widget/a$b;->t:Z

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v3

    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->q:I

    if-lt v0, v1, :cond_1

    move v0, v1

    :goto_0
    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/locale/widget/a$b;->m:Ljava/lang/CharSequence;

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v3, p0, Lcom/qihoo/security/locale/widget/a$b;->n:I

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-char v3, p0, Lcom/qihoo/security/locale/widget/a$b;->o:C

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    move-result-object v0

    iget-char v3, p0, Lcom/qihoo/security/locale/widget/a$b;->p:C

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setNumericShortcut(C)Landroid/view/MenuItem;

    .line 405
    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->u:I

    if-ltz v0, :cond_0

    .line 406
    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->u:I

    invoke-static {p1, v0}, Landroid/support/v4/view/j;->a(Landroid/view/MenuItem;I)V

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->y:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 410
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/locale/widget/a;->a(Lcom/qihoo/security/locale/widget/a;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 411
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v0, v2

    .line 401
    goto :goto_0

    .line 414
    :cond_2
    new-instance v0, Lcom/qihoo/security/locale/widget/a$a;

    iget-object v3, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v3}, Lcom/qihoo/security/locale/widget/a;->c(Lcom/qihoo/security/locale/widget/a;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/locale/widget/a$b;->y:Ljava/lang/String;

    invoke-direct {v0, v3, v4}, Lcom/qihoo/security/locale/widget/a$a;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 418
    :cond_3
    instance-of v0, p1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 419
    :cond_4
    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->q:I

    const/4 v3, 0x2

    if-lt v0, v3, :cond_5

    .line 420
    instance-of v0, p1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v0, :cond_8

    move-object v0, p1

    .line 421
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setExclusiveCheckable(Z)V

    .line 428
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->w:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 429
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->w:Ljava/lang/String;

    invoke-static {}, Lcom/qihoo/security/locale/widget/a;->b()[Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v3}, Lcom/qihoo/security/locale/widget/a;->d(Lcom/qihoo/security/locale/widget/a;)[Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v0, v2, v3}, Lcom/qihoo/security/locale/widget/a$b;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 431
    invoke-static {p1, v0}, Landroid/support/v4/view/j;->a(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;

    .line 434
    :goto_2
    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->v:I

    if-lez v0, :cond_6

    .line 435
    if-nez v1, :cond_6

    .line 436
    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->v:I

    invoke-static {p1, v0}, Landroid/support/v4/view/j;->b(Landroid/view/MenuItem;I)Landroid/view/MenuItem;

    .line 443
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->z:Landroid/support/v4/view/d;

    if-eqz v0, :cond_7

    .line 444
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->z:Landroid/support/v4/view/d;

    invoke-static {p1, v0}, Landroid/support/v4/view/j;->a(Landroid/view/MenuItem;Landroid/support/v4/view/d;)Landroid/view/MenuItem;

    .line 446
    :cond_7
    return-void

    .line 422
    :cond_8
    instance-of v0, p1, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    if-eqz v0, :cond_5

    move-object v0, p1

    .line 423
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->setExclusiveCheckable(Z)V

    goto :goto_1

    :cond_9
    move v1, v2

    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 289
    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->c:I

    .line 290
    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->d:I

    .line 291
    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->e:I

    .line 292
    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->f:I

    .line 293
    iput-boolean v1, p0, Lcom/qihoo/security/locale/widget/a$b;->g:Z

    .line 294
    iput-boolean v1, p0, Lcom/qihoo/security/locale/widget/a$b;->h:Z

    .line 295
    return-void
.end method

.method public a(Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 301
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/locale/widget/a;->a(Lcom/qihoo/security/locale/widget/a;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroid/support/v7/a/a$j;->MenuGroup:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 303
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/locale/widget/a$b;->c:I

    .line 304
    const/4 v1, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/locale/widget/a$b;->d:I

    .line 305
    const/4 v1, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/locale/widget/a$b;->e:I

    .line 306
    const/4 v1, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/locale/widget/a$b;->f:I

    .line 307
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/locale/widget/a$b;->g:Z

    .line 308
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/locale/widget/a$b;->h:Z

    .line 310
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 311
    return-void
.end method

.method public b()V
    .locals 5

    .prologue
    .line 449
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->i:Z

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->b:Landroid/view/Menu;

    iget v1, p0, Lcom/qihoo/security/locale/widget/a$b;->c:I

    iget v2, p0, Lcom/qihoo/security/locale/widget/a$b;->j:I

    iget v3, p0, Lcom/qihoo/security/locale/widget/a$b;->k:I

    iget-object v4, p0, Lcom/qihoo/security/locale/widget/a$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/locale/widget/a$b;->a(Landroid/view/MenuItem;)V

    .line 451
    return-void
.end method

.method public b(Landroid/util/AttributeSet;)V
    .locals 9

    .prologue
    const/16 v8, 0xb

    const/4 v7, 0x7

    const/4 v1, 0x1

    const/16 v6, 0x8

    const/4 v2, 0x0

    .line 317
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/locale/widget/a;->a(Lcom/qihoo/security/locale/widget/a;)Landroid/content/Context;

    move-result-object v0

    sget-object v3, Landroid/support/v7/a/a$j;->MenuItem:[I

    invoke-virtual {v0, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 320
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->j:I

    .line 321
    const/4 v0, 0x5

    iget v4, p0, Lcom/qihoo/security/locale/widget/a$b;->d:I

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 322
    const/4 v4, 0x6

    iget v5, p0, Lcom/qihoo/security/locale/widget/a$b;->e:I

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 323
    const/high16 v5, -0x10000

    and-int/2addr v0, v5

    const v5, 0xffff

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->k:I

    .line 325
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->m:Ljava/lang/CharSequence;

    .line 330
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 331
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 332
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 333
    invoke-virtual {v3, v7, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 334
    if-nez v0, :cond_0

    .line 335
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->l:Ljava/lang/CharSequence;

    .line 343
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 344
    invoke-virtual {v3, v6, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 345
    if-nez v0, :cond_2

    .line 346
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->m:Ljava/lang/CharSequence;

    .line 354
    :goto_1
    invoke-virtual {v3, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->n:I

    .line 355
    const/16 v0, 0x9

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/locale/widget/a$b;->a(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, Lcom/qihoo/security/locale/widget/a$b;->o:C

    .line 356
    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/locale/widget/a$b;->a(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, Lcom/qihoo/security/locale/widget/a$b;->p:C

    .line 357
    invoke-virtual {v3, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 359
    invoke-virtual {v3, v8, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_2
    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->q:I

    .line 366
    :goto_3
    const/4 v0, 0x3

    invoke-virtual {v3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->r:Z

    .line 367
    const/4 v0, 0x4

    iget-boolean v4, p0, Lcom/qihoo/security/locale/widget/a$b;->g:Z

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->s:Z

    .line 368
    iget-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->h:Z

    invoke-virtual {v3, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->t:Z

    .line 369
    const/16 v0, 0xd

    const/4 v4, -0x1

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->u:I

    .line 370
    const/16 v0, 0xc

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->y:Ljava/lang/String;

    .line 371
    const/16 v0, 0xe

    invoke-virtual {v3, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->v:I

    .line 372
    const/16 v0, 0xf

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->w:Ljava/lang/String;

    .line 373
    const/16 v0, 0x10

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->x:Ljava/lang/String;

    .line 375
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->x:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 376
    :goto_4
    if-eqz v1, :cond_7

    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->v:I

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->w:Ljava/lang/String;

    if-nez v0, :cond_7

    .line 377
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->x:Ljava/lang/String;

    invoke-static {}, Lcom/qihoo/security/locale/widget/a;->a()[Ljava/lang/Class;

    move-result-object v1

    iget-object v4, p0, Lcom/qihoo/security/locale/widget/a$b;->a:Lcom/qihoo/security/locale/widget/a;

    invoke-static {v4}, Lcom/qihoo/security/locale/widget/a;->b(Lcom/qihoo/security/locale/widget/a;)[Ljava/lang/Object;

    move-result-object v4

    invoke-direct {p0, v0, v1, v4}, Lcom/qihoo/security/locale/widget/a$b;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/d;

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->z:Landroid/support/v4/view/d;

    .line 387
    :goto_5
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 389
    iput-boolean v2, p0, Lcom/qihoo/security/locale/widget/a$b;->i:Z

    .line 390
    return-void

    .line 337
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->l:Ljava/lang/CharSequence;

    goto/16 :goto_0

    .line 340
    :cond_1
    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->l:Ljava/lang/CharSequence;

    goto/16 :goto_0

    .line 348
    :cond_2
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->m:Ljava/lang/CharSequence;

    goto/16 :goto_1

    .line 351
    :cond_3
    iput-object v4, p0, Lcom/qihoo/security/locale/widget/a$b;->m:Ljava/lang/CharSequence;

    goto/16 :goto_1

    :cond_4
    move v0, v2

    .line 359
    goto/16 :goto_2

    .line 364
    :cond_5
    iget v0, p0, Lcom/qihoo/security/locale/widget/a$b;->f:I

    iput v0, p0, Lcom/qihoo/security/locale/widget/a$b;->q:I

    goto/16 :goto_3

    :cond_6
    move v1, v2

    .line 375
    goto :goto_4

    .line 380
    :cond_7
    if-eqz v1, :cond_8

    .line 384
    :cond_8
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->z:Landroid/support/v4/view/d;

    goto :goto_5
.end method

.method public c()Landroid/view/SubMenu;
    .locals 5

    .prologue
    .line 454
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->i:Z

    .line 455
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/a$b;->b:Landroid/view/Menu;

    iget v1, p0, Lcom/qihoo/security/locale/widget/a$b;->c:I

    iget v2, p0, Lcom/qihoo/security/locale/widget/a$b;->j:I

    iget v3, p0, Lcom/qihoo/security/locale/widget/a$b;->k:I

    iget-object v4, p0, Lcom/qihoo/security/locale/widget/a$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    .line 456
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/qihoo/security/locale/widget/a$b;->a(Landroid/view/MenuItem;)V

    .line 457
    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 461
    iget-boolean v0, p0, Lcom/qihoo/security/locale/widget/a$b;->i:Z

    return v0
.end method

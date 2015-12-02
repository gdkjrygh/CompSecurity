.class Lcom/actionbarsherlock/internal/view/menu/g;
.super Landroid/widget/BaseAdapter;
.source "MenuPopupHelper.java"


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/view/menu/d;

.field private b:Lcom/actionbarsherlock/internal/view/menu/a;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/actionbarsherlock/internal/view/menu/d;Lcom/actionbarsherlock/internal/view/menu/a;)V
    .locals 2

    .prologue
    .line 314
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 312
    const/4 v0, -0x1

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->c:I

    .line 315
    iput-object p2, p0, Lcom/actionbarsherlock/internal/view/menu/g;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    .line 316
    new-instance v0, Lcom/actionbarsherlock/internal/view/menu/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/actionbarsherlock/internal/view/menu/f;-><init>(Lcom/actionbarsherlock/internal/view/menu/d;Lcom/actionbarsherlock/internal/view/menu/e;)V

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/g;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 317
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/g;->a()V

    .line 318
    return-void
.end method

.method static synthetic a(Lcom/actionbarsherlock/internal/view/menu/g;)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/actionbarsherlock/internal/view/menu/c;
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->a(Lcom/actionbarsherlock/internal/view/menu/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->l()Ljava/util/ArrayList;

    move-result-object v0

    .line 332
    :goto_0
    iget v1, p0, Lcom/actionbarsherlock/internal/view/menu/g;->c:I

    if-ltz v1, :cond_0

    iget v1, p0, Lcom/actionbarsherlock/internal/view/menu/g;->c:I

    if-lt p1, v1, :cond_0

    .line 333
    add-int/lit8 p1, p1, 0x1

    .line 335
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    return-object v0

    .line 330
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->k()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0
.end method

.method a()V
    .locals 5

    .prologue
    .line 358
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->c(Lcom/actionbarsherlock/internal/view/menu/d;)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->p()Lcom/actionbarsherlock/internal/view/menu/c;

    move-result-object v2

    .line 359
    if-eqz v2, :cond_1

    .line 360
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->c(Lcom/actionbarsherlock/internal/view/menu/d;)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->l()Ljava/util/ArrayList;

    move-result-object v3

    .line 361
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 362
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    .line 363
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 364
    if-ne v0, v2, :cond_0

    .line 365
    iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/g;->c:I

    .line 371
    :goto_1
    return-void

    .line 362
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 370
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->c:I

    goto :goto_1
.end method

.method public getCount()I
    .locals 2

    .prologue
    .line 321
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->a(Lcom/actionbarsherlock/internal/view/menu/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->l()Ljava/util/ArrayList;

    move-result-object v0

    .line 323
    :goto_0
    iget v1, p0, Lcom/actionbarsherlock/internal/view/menu/g;->c:I

    if-gez v1, :cond_1

    .line 324
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 326
    :goto_1
    return v0

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->k()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    .line 326
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_1
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 310
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/g;->a(I)Lcom/actionbarsherlock/internal/view/menu/c;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 341
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 345
    if-nez p2, :cond_1

    .line 346
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->b(Lcom/actionbarsherlock/internal/view/menu/d;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/actionbarsherlock/internal/view/menu/d;->a:I

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    :goto_0
    move-object v0, v1

    .line 349
    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/k;

    .line 350
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/g;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    iget-boolean v2, v2, Lcom/actionbarsherlock/internal/view/menu/d;->b:Z

    if-eqz v2, :cond_0

    move-object v2, v1

    .line 351
    check-cast v2, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setForceShowIcon(Z)V

    .line 353
    :cond_0
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/g;->a(I)Lcom/actionbarsherlock/internal/view/menu/c;

    move-result-object v2

    invoke-interface {v0, v2, v4}, Lcom/actionbarsherlock/internal/view/menu/k;->a(Lcom/actionbarsherlock/internal/view/menu/c;I)V

    .line 354
    return-object v1

    :cond_1
    move-object v1, p2

    goto :goto_0
.end method

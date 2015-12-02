.class public Lcom/facebook/widget/d/c;
.super Ljava/lang/Object;
.source "QuickActionPopMenu.java"


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/widget/PopupWindow;

.field private final c:Lcom/facebook/widget/d/a;

.field private d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/widget/d/b;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/analytics/av;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/ListView;

.field private h:I

.field private i:I

.field private j:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/facebook/widget/d/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x2

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput v0, p0, Lcom/facebook/widget/d/c;->h:I

    .line 50
    iput v0, p0, Lcom/facebook/widget/d/c;->i:I

    .line 51
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/facebook/widget/d/c;->j:Landroid/graphics/Point;

    .line 94
    iput-object p1, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    .line 95
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    .line 96
    iput-object p2, p0, Lcom/facebook/widget/d/c;->c:Lcom/facebook/widget/d/a;

    .line 97
    iget-object v0, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/widget/d/c;->e:Lcom/facebook/analytics/av;

    .line 102
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/facebook/widget/d/d;

    invoke-direct {v1, p0}, Lcom/facebook/widget/d/d;-><init>(Lcom/facebook/widget/d/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 113
    invoke-direct {p0}, Lcom/facebook/widget/d/c;->c()V

    .line 114
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/d/c;)Landroid/widget/PopupWindow;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 255
    iput-object p1, p0, Lcom/facebook/widget/d/c;->f:Landroid/view/View;

    .line 256
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 257
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/d/c;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/widget/d/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 149
    if-nez p1, :cond_0

    .line 158
    :goto_0
    return-void

    .line 153
    :cond_0
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "quick_action_item"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 157
    iget-object v1, p0, Lcom/facebook/widget/d/c;->e:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/widget/d/c;)Lcom/facebook/widget/d/a;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/widget/d/c;->c:Lcom/facebook/widget/d/a;

    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 168
    sget v1, Lcom/facebook/k;->orca_quick_action_menu_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/d/c;->f:Landroid/view/View;

    .line 169
    iget-object v0, p0, Lcom/facebook/widget/d/c;->f:Landroid/view/View;

    sget v1, Lcom/facebook/i;->listview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    .line 171
    iget-object v0, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/widget/d/e;

    invoke-direct {v1, p0}, Lcom/facebook/widget/d/e;-><init>(Lcom/facebook/widget/d/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 185
    iget-object v0, p0, Lcom/facebook/widget/d/c;->f:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/facebook/widget/d/c;->a(Landroid/view/View;)V

    .line 186
    return-void
.end method

.method private d()I
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 193
    iget-object v0, p0, Lcom/facebook/widget/d/c;->d:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/d/c;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v0, v2

    .line 217
    :goto_0
    return v0

    .line 198
    :cond_1
    const/4 v1, 0x0

    .line 199
    iget-object v0, p0, Lcom/facebook/widget/d/c;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/d/b;

    .line 200
    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/facebook/widget/d/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1}, Lcom/facebook/widget/d/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-le v4, v5, :cond_4

    :cond_2
    :goto_2
    move-object v1, v0

    .line 201
    goto :goto_1

    .line 205
    :cond_3
    iget-object v0, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    .line 208
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 209
    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 210
    iget-object v1, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    new-instance v4, Lcom/facebook/widget/d/f;

    iget-object v5, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v4, p0, v5, v0}, Lcom/facebook/widget/d/f;-><init>(Lcom/facebook/widget/d/c;Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v1, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 211
    iget-object v0, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    const/16 v2, 0x3e8

    const/high16 v4, -0x80000000

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->measure(II)V

    .line 213
    iget-object v0, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getMeasuredWidth()I

    move-result v0

    .line 215
    iget-object v1, p0, Lcom/facebook/widget/d/c;->g:Landroid/widget/ListView;

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_2
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v5, -0x3

    const/4 v4, 0x1

    const/4 v3, -0x2

    .line 221
    iget-object v0, p0, Lcom/facebook/widget/d/c;->c:Lcom/facebook/widget/d/a;

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/facebook/widget/d/c;->c:Lcom/facebook/widget/d/a;

    invoke-interface {v0, p0}, Lcom/facebook/widget/d/a;->a(Lcom/facebook/widget/d/c;)V

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/d/c;->d:Lcom/google/common/a/es;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/widget/d/c;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 252
    :cond_1
    :goto_0
    return-void

    .line 229
    :cond_2
    iget v0, p0, Lcom/facebook/widget/d/c;->h:I

    .line 230
    iget v1, p0, Lcom/facebook/widget/d/c;->h:I

    if-ne v1, v3, :cond_4

    .line 231
    invoke-direct {p0}, Lcom/facebook/widget/d/c;->d()I

    move-result v0

    .line 237
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    .line 238
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 239
    iget-object v1, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 241
    iget v0, p0, Lcom/facebook/widget/d/c;->i:I

    if-ne v0, v3, :cond_5

    .line 242
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 249
    :goto_2
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 250
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 251
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    goto :goto_0

    .line 232
    :cond_4
    iget v1, p0, Lcom/facebook/widget/d/c;->h:I

    if-ne v1, v5, :cond_3

    .line 233
    iget-object v0, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    goto :goto_1

    .line 243
    :cond_5
    iget v0, p0, Lcom/facebook/widget/d/c;->i:I

    if-ne v0, v5, :cond_6

    .line 244
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_2

    .line 246
    :cond_6
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    iget v1, p0, Lcom/facebook/widget/d/c;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 263
    invoke-direct {p0}, Lcom/facebook/widget/d/c;->e()V

    .line 265
    iget-object v0, p0, Lcom/facebook/widget/d/c;->d:Lcom/google/common/a/es;

    if-nez v0, :cond_0

    .line 276
    :goto_0
    return-void

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 272
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/facebook/widget/d/c;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/facebook/widget/d/c;->j:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/facebook/widget/d/c;->j:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    iget-object v4, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 121
    iput p1, p0, Lcom/facebook/widget/d/c;->h:I

    .line 122
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/facebook/widget/d/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 280
    return-void
.end method

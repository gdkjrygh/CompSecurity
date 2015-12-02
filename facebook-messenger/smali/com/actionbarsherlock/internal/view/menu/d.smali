.class public Lcom/actionbarsherlock/internal/view/menu/d;
.super Ljava/lang/Object;
.source "MenuPopupHelper.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Lcom/actionbarsherlock/internal/view/b;
.implements Lcom/actionbarsherlock/internal/view/menu/h;


# static fields
.field static final a:I


# instance fields
.field b:Z

.field private c:Landroid/content/Context;

.field private d:Landroid/view/LayoutInflater;

.field private e:Lcom/actionbarsherlock/internal/a/a;

.field private f:Lcom/actionbarsherlock/internal/view/menu/a;

.field private g:I

.field private h:Landroid/view/View;

.field private i:Z

.field private j:Landroid/view/ViewTreeObserver;

.field private k:Lcom/actionbarsherlock/internal/view/menu/g;

.field private l:Lcom/actionbarsherlock/internal/view/menu/i;

.field private m:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    sget v0, Lcom/facebook/k;->abs__popup_menu_item_layout:I

    sput v0, Lcom/actionbarsherlock/internal/view/menu/d;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/actionbarsherlock/internal/view/menu/d;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Landroid/view/View;Z)V

    .line 79
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Landroid/view/View;Z)V
    .locals 3

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->c:Landroid/content/Context;

    .line 84
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->d:Landroid/view/LayoutInflater;

    .line 85
    iput-object p2, p0, Lcom/actionbarsherlock/internal/view/menu/d;->f:Lcom/actionbarsherlock/internal/view/menu/a;

    .line 86
    iput-boolean p4, p0, Lcom/actionbarsherlock/internal/view/menu/d;->i:Z

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    sget v2, Lcom/facebook/g;->abs__config_prefDialogWidth:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->g:I

    .line 92
    iput-object p3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->h:Landroid/view/View;

    .line 94
    invoke-virtual {p2, p0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/h;)V

    .line 95
    return-void
.end method

.method private a(Landroid/widget/ListAdapter;)I
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 175
    .line 178
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 180
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 182
    invoke-interface {p1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v8

    move v4, v0

    move v1, v0

    move-object v3, v2

    move v5, v0

    .line 183
    :goto_0
    if-ge v4, v8, :cond_1

    .line 184
    invoke-interface {p1, v4}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v0

    .line 185
    if-eq v0, v1, :cond_2

    move-object v1, v2

    .line 189
    :goto_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->m:Landroid/view/ViewGroup;

    if-nez v3, :cond_0

    .line 190
    new-instance v3, Landroid/widget/FrameLayout;

    iget-object v9, p0, Lcom/actionbarsherlock/internal/view/menu/d;->c:Landroid/content/Context;

    invoke-direct {v3, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->m:Landroid/view/ViewGroup;

    .line 192
    :cond_0
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->m:Landroid/view/ViewGroup;

    invoke-interface {p1, v4, v1, v3}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 193
    invoke-virtual {v3, v6, v7}, Landroid/view/View;->measure(II)V

    .line 194
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 183
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    move v1, v0

    goto :goto_0

    .line 196
    :cond_1
    return v5

    :cond_2
    move v0, v1

    move-object v1, v3

    goto :goto_1
.end method

.method static synthetic a(Lcom/actionbarsherlock/internal/view/menu/d;)Z
    .locals 1

    .prologue
    .line 49
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->i:Z

    return v0
.end method

.method static synthetic b(Lcom/actionbarsherlock/internal/view/menu/d;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->d:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic c(Lcom/actionbarsherlock/internal/view/menu/d;)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->f:Lcom/actionbarsherlock/internal/view/menu/a;

    return-object v0
.end method

.method static synthetic d(Lcom/actionbarsherlock/internal/view/menu/d;)Lcom/actionbarsherlock/internal/view/menu/g;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 106
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;)V
    .locals 0

    .prologue
    .line 228
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 214
    return-void
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/a;Z)V
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->f:Lcom/actionbarsherlock/internal/view/menu/a;

    if-eq p1, v0, :cond_1

    .line 281
    :cond_0
    :goto_0
    return-void

    .line 277
    :cond_1
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->c()V

    .line 278
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->l:Lcom/actionbarsherlock/internal/view/menu/i;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->l:Lcom/actionbarsherlock/internal/view/menu/i;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/i;->a(Lcom/actionbarsherlock/internal/view/menu/a;Z)V

    goto :goto_0
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/i;)V
    .locals 0

    .prologue
    .line 242
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->l:Lcom/actionbarsherlock/internal/view/menu/i;

    .line 243
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 102
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->b:Z

    .line 103
    return-void
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/internal/view/menu/c;)Z
    .locals 1

    .prologue
    .line 293
    const/4 v0, 0x0

    return v0
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/l;)Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 247
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/l;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 248
    new-instance v3, Lcom/actionbarsherlock/internal/view/menu/d;

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/d;->h:Landroid/view/View;

    invoke-direct {v3, v0, p1, v4, v2}, Lcom/actionbarsherlock/internal/view/menu/d;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Landroid/view/View;Z)V

    .line 249
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->l:Lcom/actionbarsherlock/internal/view/menu/i;

    invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/view/menu/d;->a(Lcom/actionbarsherlock/internal/view/menu/i;)V

    .line 252
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/l;->c()I

    move-result v4

    move v0, v2

    .line 253
    :goto_0
    if-ge v0, v4, :cond_3

    .line 254
    invoke-virtual {p1, v0}, Lcom/actionbarsherlock/internal/view/menu/l;->h(I)Lcom/actionbarsherlock/a/b;

    move-result-object v5

    .line 255
    invoke-interface {v5}, Lcom/actionbarsherlock/a/b;->u()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Lcom/actionbarsherlock/a/b;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_1

    move v0, v1

    .line 260
    :goto_1
    invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/view/menu/d;->a(Z)V

    .line 262
    invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/d;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 263
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->l:Lcom/actionbarsherlock/internal/view/menu/i;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->l:Lcom/actionbarsherlock/internal/view/menu/i;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/i;->a(Lcom/actionbarsherlock/internal/view/menu/a;)Z

    .line 269
    :cond_0
    :goto_2
    return v1

    .line 253
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v1, v2

    .line 269
    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 219
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 222
    :cond_1
    check-cast p1, Lcom/actionbarsherlock/internal/view/a;

    invoke-interface {p1, p0}, Lcom/actionbarsherlock/internal/view/a;->b(Lcom/actionbarsherlock/internal/view/b;)V

    .line 223
    return-void
.end method

.method public b(Z)V
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/g;->notifyDataSetChanged()V

    .line 238
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 112
    new-instance v1, Lcom/actionbarsherlock/internal/a/a;

    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->c:Landroid/content/Context;

    const/4 v4, 0x0

    sget v5, Lcom/facebook/d;->popupMenuStyle:I

    invoke-direct {v1, v3, v4, v5}, Lcom/actionbarsherlock/internal/a/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    .line 113
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v1, p0}, Lcom/actionbarsherlock/internal/a/a;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 114
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v1, p0}, Lcom/actionbarsherlock/internal/a/a;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 116
    new-instance v1, Lcom/actionbarsherlock/internal/view/menu/g;

    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->f:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-direct {v1, p0, v3}, Lcom/actionbarsherlock/internal/view/menu/g;-><init>(Lcom/actionbarsherlock/internal/view/menu/d;Lcom/actionbarsherlock/internal/view/menu/a;)V

    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    .line 117
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    invoke-virtual {v1, v3}, Lcom/actionbarsherlock/internal/a/a;->a(Landroid/widget/ListAdapter;)V

    .line 118
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/a/a;->a(Z)V

    .line 120
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->h:Landroid/view/View;

    .line 121
    if-eqz v1, :cond_2

    .line 122
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    if-nez v3, :cond_0

    move v0, v2

    .line 123
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    iput-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    .line 124
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    move-object v0, v1

    .line 125
    check-cast v0, Lcom/actionbarsherlock/internal/view/a;

    invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/a;->a(Lcom/actionbarsherlock/internal/view/b;)V

    .line 126
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/a/a;->a(Landroid/view/View;)V

    .line 131
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    invoke-direct {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/d;->a(Landroid/widget/ListAdapter;)I

    move-result v1

    iget v3, p0, Lcom/actionbarsherlock/internal/view/menu/d;->g:I

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/a/a;->a(I)V

    .line 132
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/a/a;->b(I)V

    .line 133
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->a()V

    .line 134
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->e()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 135
    :goto_0
    return v2

    :cond_2
    move v2, v0

    .line 128
    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->b()V

    .line 142
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onDismiss()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 145
    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    .line 146
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->f:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->h()V

    .line 147
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 148
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 150
    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/d;->j:Landroid/view/ViewTreeObserver;

    .line 152
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->h:Landroid/view/View;

    check-cast v0, Lcom/actionbarsherlock/internal/view/a;

    invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/a;->b(Lcom/actionbarsherlock/internal/view/b;)V

    .line 153
    return-void
.end method

.method public onGlobalLayout()V
    .locals 1

    .prologue
    .line 201
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->h:Landroid/view/View;

    .line 203
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 204
    :cond_0
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->c()V

    .line 210
    :cond_1
    :goto_0
    return-void

    .line 205
    :cond_2
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->e:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->a()V

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
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
    .line 161
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/d;->k:Lcom/actionbarsherlock/internal/view/menu/g;

    .line 162
    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/g;->a(Lcom/actionbarsherlock/internal/view/menu/g;)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v1

    invoke-virtual {v0, p3}, Lcom/actionbarsherlock/internal/view/menu/g;->a(I)Lcom/actionbarsherlock/internal/view/menu/c;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/a/b;I)Z

    .line 163
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 166
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/16 v1, 0x52

    if-ne p2, v1, :cond_0

    .line 167
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/d;->c()V

    .line 170
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

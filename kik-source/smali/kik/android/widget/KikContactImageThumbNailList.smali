.class public Lkik/android/widget/KikContactImageThumbNailList;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/HashMap;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/Space;

.field private f:Ljava/util/HashMap;

.field private g:Lcom/kik/g/k;

.field private h:Lcom/kik/g/k;

.field private i:Lcom/kik/cache/ad;

.field private j:Lcom/kik/android/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/KikContactImageThumbNailList;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 73
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->a:Ljava/util/HashMap;

    .line 34
    iput v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->b:I

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->f:Ljava/util/HashMap;

    .line 41
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->g:Lcom/kik/g/k;

    .line 42
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->h:Lcom/kik/g/k;

    .line 75
    sget-object v0, Lkik/android/ag$b;->m:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 76
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->b:I

    .line 77
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    iput-object p1, p0, Lkik/android/widget/KikContactImageThumbNailList;->c:Landroid/content/Context;

    .line 79
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    .line 80
    new-instance v0, Landroid/widget/Space;

    invoke-direct {v0, p1, v3}, Landroid/widget/Space;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->e:Landroid/widget/Space;

    .line 82
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/16 v1, 0x8

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 83
    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->e:Landroid/widget/Space;

    invoke-virtual {v1, v0}, Landroid/widget/Space;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 86
    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 87
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 88
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lkik/android/widget/KikContactImageThumbNailList;->addView(Landroid/view/View;)V

    .line 89
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->e:Landroid/widget/Space;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 90
    const v0, 0x7f03006d

    iput v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->b:I

    .line 91
    return-void
.end method

.method static synthetic a(Lkik/android/widget/KikContactImageThumbNailList;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->g:Lcom/kik/g/k;

    return-object v0
.end method

.method private a(Landroid/view/View;Lkik/a/d/k;Lkik/a/e/r;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 95
    const v0, 0x7f0e0165

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    .line 96
    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020305

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 97
    iget-object v2, p0, Lkik/android/widget/KikContactImageThumbNailList;->i:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/widget/KikContactImageThumbNailList;->j:Lcom/kik/android/a;

    move-object v1, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 99
    const v0, 0x7f0e0166

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 100
    invoke-virtual {p2}, Lkik/a/d/k;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 101
    return-void

    .line 100
    :cond_0
    const/16 v3, 0x8

    goto :goto_0
.end method

.method private a(Lkik/a/d/k;ILkik/a/e/r;)V
    .locals 4

    .prologue
    .line 116
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 118
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->b:I

    iget-object v2, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 120
    invoke-direct {p0, v2, p1, p3}, Lkik/android/widget/KikContactImageThumbNailList;->a(Landroid/view/View;Lkik/a/d/k;Lkik/a/e/r;)V

    .line 121
    invoke-virtual {v2, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 124
    if-ltz p2, :cond_0

    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-le p2, v0, :cond_1

    .line 125
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 131
    :goto_0
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 133
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 134
    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 135
    invoke-direct {p0, v1, v0, p3}, Lkik/android/widget/KikContactImageThumbNailList;->a(Landroid/view/View;Lkik/a/d/k;Lkik/a/e/r;)V

    goto :goto_1

    .line 128
    :cond_1
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    goto :goto_0

    .line 139
    :cond_2
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    new-instance v0, Lkik/android/widget/bz;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/bz;-><init>(Lkik/android/widget/KikContactImageThumbNailList;Lkik/a/d/k;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    new-instance v0, Lkik/android/widget/ca;

    invoke-direct {v0, p0}, Lkik/android/widget/ca;-><init>(Lkik/android/widget/KikContactImageThumbNailList;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p0, v0, v2, v3}, Lkik/android/widget/KikContactImageThumbNailList;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 158
    :cond_3
    return-void
.end method

.method static synthetic b(Lkik/android/widget/KikContactImageThumbNailList;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->h:Lcom/kik/g/k;

    return-object v0
.end method


# virtual methods
.method public final a(Lkik/a/d/k;)Lcom/kik/g/aq;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 221
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 222
    new-instance v1, Lcom/kik/g/aq;

    invoke-direct {v1}, Lcom/kik/g/aq;-><init>()V

    .line 223
    if-eqz v0, :cond_0

    .line 224
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    iget-object v2, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 227
    invoke-virtual {v1}, Lcom/kik/g/aq;->a()V

    .line 232
    :goto_0
    return-object v1

    .line 230
    :cond_0
    invoke-virtual {v1, v2}, Lcom/kik/g/aq;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lkik/android/widget/KikContactImageThumbNailList;->j:Lcom/kik/android/a;

    .line 59
    return-void
.end method

.method public final a(Lcom/kik/cache/ad;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lkik/android/widget/KikContactImageThumbNailList;->i:Lcom/kik/cache/ad;

    .line 54
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 177
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 178
    if-eqz v0, :cond_0

    .line 179
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 182
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lkik/a/d/k;Lkik/a/e/r;)V
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 168
    if-eqz v0, :cond_0

    .line 169
    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result v1

    .line 170
    iget-object v2, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 171
    invoke-direct {p0, p2, v1, p3}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lkik/a/d/k;ILkik/a/e/r;)V

    .line 173
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lkik/a/e/r;)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 186
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->b:I

    iget-object v2, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 190
    const v0, 0x7f0e0165

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iget-object v1, p0, Lkik/android/widget/KikContactImageThumbNailList;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020305

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->a(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/widget/KikContactImageThumbNailList;->i:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/widget/KikContactImageThumbNailList;->j:Lcom/kik/android/a;

    move-object v4, p2

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    const v0, 0x7f0e0166

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 194
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    new-instance v0, Lkik/android/widget/cb;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/cb;-><init>(Lkik/android/widget/KikContactImageThumbNailList;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    new-instance v0, Lkik/android/widget/cc;

    invoke-direct {v0, p0}, Lkik/android/widget/cc;-><init>(Lkik/android/widget/KikContactImageThumbNailList;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p0, v0, v2, v3}, Lkik/android/widget/KikContactImageThumbNailList;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 212
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/k;Lkik/a/e/r;)V
    .locals 1

    .prologue
    .line 162
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0, p2}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lkik/a/d/k;ILkik/a/e/r;)V

    .line 163
    return-void
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lkik/android/widget/KikContactImageThumbNailList;->h:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

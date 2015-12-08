.class public Lkik/android/widget/ContentLinkView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field _contentLinkButtonImg:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ee
    .end annotation
.end field

.field _contentLinkCenterLayout:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00eb
    .end annotation
.end field

.field _contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ec
    .end annotation
.end field

.field _contentLinkText:Lkik/android/widget/RobotoTextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ed
    .end annotation
.end field

.field private a:Landroid/view/View;

.field private b:Lcom/kik/f/a/a/a;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lkik/android/b/g;

.field private h:Lcom/kik/android/a;

.field private i:I

.field private final j:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/ContentLinkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 120
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 124
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/ContentLinkView;->f:Z

    .line 52
    sget v0, Lcom/kik/ui/fragment/FragmentBase$a$a;->a:I

    iput v0, p0, Lkik/android/widget/ContentLinkView;->i:I

    .line 54
    new-instance v0, Lkik/android/widget/q;

    invoke-direct {v0, p0}, Lkik/android/widget/q;-><init>(Lkik/android/widget/ContentLinkView;)V

    iput-object v0, p0, Lkik/android/widget/ContentLinkView;->j:Landroid/view/View$OnClickListener;

    .line 125
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03003b

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ContentLinkView;->a:Landroid/view/View;

    .line 126
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->a:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 127
    return-void
.end method

.method static synthetic a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    return-object v0
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "card://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cards://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

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

.method static synthetic a(Lkik/android/widget/ContentLinkView;Z)Z
    .locals 0

    .prologue
    .line 36
    iput-boolean p1, p0, Lkik/android/widget/ContentLinkView;->d:Z

    return p1
.end method

.method static synthetic b(Lkik/android/widget/ContentLinkView;)I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lkik/android/widget/ContentLinkView;->i:I

    return v0
.end method

.method private b()Z
    .locals 2

    .prologue
    .line 194
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/widget/ContentLinkView;Z)Z
    .locals 0

    .prologue
    .line 36
    iput-boolean p1, p0, Lkik/android/widget/ContentLinkView;->e:Z

    return p1
.end method

.method private c()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 199
    const-string v0, "image"

    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0201a7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 206
    :goto_0
    return-object v0

    .line 202
    :cond_0
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "market://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 203
    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020209

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 206
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0202f7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/widget/ContentLinkView;)Lkik/android/b/g;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->g:Lkik/android/b/g;

    return-object v0
.end method

.method static synthetic c(Lkik/android/widget/ContentLinkView;Z)Z
    .locals 0

    .prologue
    .line 36
    iput-boolean p1, p0, Lkik/android/widget/ContentLinkView;->f:Z

    return p1
.end method

.method static synthetic d(Lkik/android/widget/ContentLinkView;)Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->h:Lcom/kik/android/a;

    return-object v0
.end method

.method static synthetic e(Lkik/android/widget/ContentLinkView;)Z
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lkik/android/widget/ContentLinkView;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lkik/android/widget/ContentLinkView;)Z
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lkik/android/widget/ContentLinkView;->b()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 136
    iput p1, p0, Lkik/android/widget/ContentLinkView;->i:I

    .line 137
    return-void
.end method

.method public final a(II)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x12c

    const/high16 v3, 0x7f0d0000

    const/4 v2, 0x0

    .line 227
    sparse-switch p2, :sswitch_data_0

    .line 236
    :goto_0
    if-nez p1, :cond_2

    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->c:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->d:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->f:Z

    if-nez v0, :cond_1

    new-instance v0, Lcom/kik/android/a/b;

    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-direct {v0, p0, v2, v1}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;II)V

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a/b;->setDuration(J)V

    new-instance v1, Lkik/android/widget/t;

    invoke-direct {v1, p0}, Lkik/android/widget/t;-><init>(Lkik/android/widget/ContentLinkView;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/b;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/ContentLinkView;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 237
    :cond_1
    :goto_1
    return-void

    .line 229
    :sswitch_0
    iput-boolean v2, p0, Lkik/android/widget/ContentLinkView;->c:Z

    goto :goto_0

    .line 233
    :sswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/ContentLinkView;->c:Z

    goto :goto_0

    .line 236
    :cond_2
    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->f:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->e:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->d:Z

    if-nez v0, :cond_1

    :cond_3
    iget-boolean v0, p0, Lkik/android/widget/ContentLinkView;->d:Z

    if-nez v0, :cond_1

    new-instance v0, Lcom/kik/android/a/b;

    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-direct {v0, p0, v1, v2}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;II)V

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a/b;->setDuration(J)V

    new-instance v1, Lkik/android/widget/s;

    invoke-direct {v1, p0}, Lkik/android/widget/s;-><init>(Lkik/android/widget/ContentLinkView;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/b;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/ContentLinkView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    .line 227
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lkik/android/widget/ContentLinkView;->h:Lcom/kik/android/a;

    .line 142
    return-void
.end method

.method public final a(Lcom/kik/f/a/a/a;Lcom/kik/cache/ad;)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 148
    iput-object p1, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    .line 149
    invoke-virtual {p1}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v0

    .line 151
    invoke-virtual {p1}, Lcom/kik/f/a/a/a;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    invoke-virtual {v2}, Lkik/android/widget/SquareNetworkedImageView;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    invoke-virtual {v3}, Lkik/android/widget/SquareNetworkedImageView;->getMeasuredHeight()I

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v1

    .line 153
    iget-object v2, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    invoke-virtual {v2, v6}, Lkik/android/widget/SquareNetworkedImageView;->setVisibility(I)V

    .line 154
    iget-object v2, p0, Lkik/android/widget/ContentLinkView;->_contentLinkCenterLayout:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lkik/android/widget/ContentLinkView;->j:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    iget-object v2, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    invoke-direct {p0}, Lkik/android/widget/ContentLinkView;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/android/widget/SquareNetworkedImageView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 159
    if-eqz v1, :cond_0

    .line 160
    iget-object v2, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    invoke-direct {p0}, Lkik/android/widget/ContentLinkView;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/android/widget/SquareNetworkedImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 161
    iget-object v2, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    invoke-virtual {v2, v1, p2}, Lkik/android/widget/SquareNetworkedImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;)V

    .line 164
    :cond_0
    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    invoke-virtual {v1, v6}, Lkik/android/widget/RobotoTextView;->setVisibility(I)V

    .line 165
    invoke-virtual {p1}, Lcom/kik/f/a/a/a;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 166
    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    invoke-virtual {p1}, Lcom/kik/f/a/a/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/widget/RobotoTextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    :goto_0
    const-string v1, "image"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lkik/android/widget/ContentLinkView;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lkik/android/widget/ContentLinkView;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 179
    :cond_1
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->_contentLinkButtonImg:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0201f5

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 185
    :goto_1
    return-void

    .line 168
    :cond_2
    const-string v1, "image"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 169
    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090325

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/widget/RobotoTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 171
    :cond_3
    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->b:Lcom/kik/f/a/a/a;

    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "market://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4

    .line 172
    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0902c6

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/kik/f/a/a/a;->h()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/widget/RobotoTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 175
    :cond_4
    iget-object v1, p0, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0902e8

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/kik/f/a/a/a;->h()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/widget/RobotoTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 182
    :cond_5
    iget-object v0, p0, Lkik/android/widget/ContentLinkView;->_contentLinkButtonImg:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lkik/android/widget/ContentLinkView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02000a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1
.end method

.method public final a(Lkik/android/b/g;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lkik/android/widget/ContentLinkView;->g:Lkik/android/b/g;

    .line 132
    return-void
.end method

.class public final Lcom/roidapp/cloudlib/sns/basepost/w;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/support/v4/app/Fragment;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/roidapp/cloudlib/sns/basepost/at;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Ljava/util/regex/Pattern;

.field private g:Landroid/text/TextPaint;

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I


# direct methods
.method public constructor <init>(Landroid/support/v4/app/Fragment;Ljava/util/List;Lcom/roidapp/cloudlib/sns/basepost/at;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/Fragment;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a;",
            ">;",
            "Lcom/roidapp/cloudlib/sns/basepost/at;",
            ")V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 46
    const-string v0, "[#|@]\\w+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->f:Ljava/util/regex/Pattern;

    .line 53
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->a:Landroid/support/v4/app/Fragment;

    .line 54
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    .line 56
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    .line 58
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ao;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->m:I

    .line 59
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/w;)Lcom/roidapp/cloudlib/sns/basepost/at;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    return-object v0
.end method

.method private a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)V
    .locals 6

    .prologue
    const/16 v5, 0x21

    .line 264
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 265
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 266
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    .line 267
    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 268
    new-instance v2, Lcom/roidapp/cloudlib/sns/basepost/x;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->k:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->l:I

    invoke-direct {v2, p0, v1, v3, v4}, Lcom/roidapp/cloudlib/sns/basepost/x;-><init>(Lcom/roidapp/cloudlib/sns/basepost/w;Ljava/lang/String;II)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    add-int/lit8 v1, v1, 0x0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/lit8 v3, v3, 0x0

    invoke-virtual {p1, v2, v1, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 276
    :cond_0
    new-instance v2, Lcom/roidapp/cloudlib/sns/basepost/y;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->i:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->j:I

    invoke-direct {v2, p0, v3, v4, v1}, Lcom/roidapp/cloudlib/sns/basepost/y;-><init>(Lcom/roidapp/cloudlib/sns/basepost/w;IILjava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    add-int/lit8 v1, v1, 0x0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/lit8 v3, v3, 0x0

    invoke-virtual {p1, v2, v1, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 287
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/basepost/w;)Ljava/util/List;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/basepost/w;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a(J)V
    .locals 5

    .prologue
    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 91
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/a;->b:J

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    iget v2, v0, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    sget v3, Lcom/roidapp/cloudlib/sns/b/b;->b:I

    if-ne v2, v3, :cond_0

    .line 92
    sget v1, Lcom/roidapp/cloudlib/sns/b/b;->c:I

    iput v1, v0, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    .line 96
    :cond_1
    return-void
.end method

.method public final a(JLcom/roidapp/cloudlib/sns/b/a;)V
    .locals 7

    .prologue
    .line 75
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 76
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 78
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/a;->b:J

    cmp-long v3, v4, p1

    if-nez v3, :cond_1

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    sget v3, Lcom/roidapp/cloudlib/sns/b/b;->b:I

    if-ne v0, v3, :cond_1

    .line 79
    sget v0, Lcom/roidapp/cloudlib/sns/b/b;->a:I

    iput v0, p3, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    .line 80
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0, v1, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 86
    :cond_0
    return-void

    .line 76
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/a;)V
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 71
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 64
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    .line 66
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/w;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 122
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .prologue
    .line 128
    if-nez p2, :cond_2

    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->r:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 130
    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/ac;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/basepost/ac;-><init>()V

    .line 131
    sget v0, Lcom/roidapp/cloudlib/ar;->ae:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->a:Lcom/roidapp/baselib/view/RoundImageView;

    .line 132
    sget v0, Lcom/roidapp/cloudlib/ar;->af:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->b:Landroid/widget/TextView;

    .line 133
    sget v0, Lcom/roidapp/cloudlib/ar;->ad:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    .line 134
    sget v0, Lcom/roidapp/cloudlib/ar;->P:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->d:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 135
    sget v0, Lcom/roidapp/cloudlib/ar;->ac:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->e:Landroid/widget/ProgressBar;

    .line 137
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->a:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/view/RoundImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->g:Landroid/text/TextPaint;

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->g:Landroid/text/TextPaint;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->g:Landroid/text/TextPaint;

    const-string v2, "#384238"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 145
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->g:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/cloudlib/ap;->i:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 146
    const-string v0, "#00ca72"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->i:I

    .line 147
    const-string v0, "#00844a"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->j:I

    .line 148
    const-string v0, "#1de9b6"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->k:I

    .line 149
    const-string v0, "#19cea1"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->l:I

    .line 152
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42900000    # 72.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->h:I

    .line 154
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v9, v1

    .line 158
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/w;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int v1, v0, p1

    .line 159
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/roidapp/cloudlib/sns/b/a;

    .line 160
    iget-object v0, v8, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 161
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->a:Landroid/support/v4/app/Fragment;

    if-eqz v2, :cond_0

    .line 162
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->a:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/b;->a()Lcom/bumptech/glide/a;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v2

    new-instance v3, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v4, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->a:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v3, v4}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 169
    :cond_0
    iget-object v2, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->a:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/view/RoundImageView;->setTag(Ljava/lang/Object;)V

    .line 170
    iget-object v2, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 171
    iget-object v2, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->b:Landroid/widget/TextView;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 172
    iget-object v1, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->b:Landroid/widget/TextView;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    iget-object v10, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->d:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iget-object v0, v8, Lcom/roidapp/cloudlib/sns/b/a;->c:Ljava/lang/String;

    .line 1250
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1251
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1252
    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)V

    .line 1253
    new-instance v0, Landroid/text/StaticLayout;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->g:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->h:I

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1255
    invoke-virtual {v10, v0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a(Landroid/text/Layout;)V

    .line 177
    :goto_1
    iget v0, v8, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    .line 178
    if-nez v0, :cond_1

    .line 180
    sget v0, Lcom/roidapp/cloudlib/sns/b/b;->a:I

    iput v0, v8, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    .line 182
    :cond_1
    sget-object v1, Lcom/roidapp/cloudlib/sns/basepost/ab;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 204
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    iget-wide v2, v8, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    invoke-interface {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/at;->b(J)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 205
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->m:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 210
    :goto_3
    return-object p2

    .line 156
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/ac;

    move-object v9, v0

    goto/16 :goto_0

    .line 1257
    :cond_3
    invoke-virtual {v10}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a()V

    goto :goto_1

    .line 184
    :pswitch_0
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->e:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 185
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 186
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/h;->a()Lcom/roidapp/cloudlib/sns/h;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    iget-wide v4, v8, Lcom/roidapp/cloudlib/sns/b/a;->b:J

    invoke-virtual {v1, v2, v4, v5}, Lcom/roidapp/cloudlib/sns/h;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 189
    :pswitch_1
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->e:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 190
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 191
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 194
    :pswitch_2
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->e:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->e:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_4

    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x1080041

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->e:Landroid/graphics/drawable/Drawable;

    .line 198
    :cond_4
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->e:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 199
    iget-object v0, v9, Lcom/roidapp/cloudlib/sns/basepost/ac;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 207
    :cond_5
    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_3

    .line 182
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 10

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const-wide/16 v8, 0x1

    .line 216
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 217
    sget v1, Lcom/roidapp/cloudlib/ar;->af:I

    if-ne v0, v1, :cond_1

    .line 218
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 219
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    iget-object v6, v0, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 220
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToPersonalCenter/FromCommentUserName/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToPersonalCenter/FromCommentUserName/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    invoke-interface {v0, v6, v7}, Lcom/roidapp/cloudlib/sns/basepost/at;->a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V

    .line 248
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 225
    :cond_1
    sget v1, Lcom/roidapp/cloudlib/ar;->ae:I

    if-ne v0, v1, :cond_2

    .line 226
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 227
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    iget-object v6, v0, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 228
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToPersonalCenter/FromCommentUserAvatar/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToPersonalCenter/FromCommentUserAvatar/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->d:Lcom/roidapp/cloudlib/sns/basepost/at;

    invoke-interface {v0, v6, v7}, Lcom/roidapp/cloudlib/sns/basepost/at;->a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V

    goto :goto_0

    .line 233
    :cond_2
    sget v1, Lcom/roidapp/cloudlib/ar;->ad:I

    if-ne v0, v1, :cond_0

    .line 234
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 235
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 236
    iget v2, v0, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    .line 237
    sget-object v3, Lcom/roidapp/cloudlib/sns/basepost/ab;->a:[I

    add-int/lit8 v2, v2, -0x1

    aget v2, v3, v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 243
    :pswitch_1
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/a;->b:J

    .line 1290
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/w;->b:Landroid/content/Context;

    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v4, Lcom/roidapp/cloudlib/at;->o:I

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v4, Lcom/roidapp/cloudlib/at;->p:I

    new-instance v5, Lcom/roidapp/cloudlib/sns/basepost/aa;

    invoke-direct {v5, p0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/aa;-><init>(Lcom/roidapp/cloudlib/sns/basepost/w;IJ)V

    invoke-virtual {v0, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v4, Lcom/roidapp/cloudlib/at;->v:I

    new-instance v5, Lcom/roidapp/cloudlib/sns/basepost/z;

    invoke-direct {v5, p0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/z;-><init>(Lcom/roidapp/cloudlib/sns/basepost/w;IJ)V

    invoke-virtual {v0, v4, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1315
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1316
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1317
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 237
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

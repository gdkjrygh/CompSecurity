.class final Lcom/mopub/mobileads/an;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private final c:Lcom/mopub/volley/toolbox/ImageLoader;

.field private final d:I

.field private final e:I

.field private final f:I


# direct methods
.method private constructor <init>(Lcom/mopub/mobileads/ap;)V
    .locals 9

    .prologue
    const/16 v8, 0xf

    const/high16 v2, 0x40a00000    # 5.0f

    const/4 v7, 0x0

    const/4 v6, -0x2

    .line 123
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->a(Lcom/mopub/mobileads/ap;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 125
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p1}, Lcom/mopub/mobileads/ap;->b(Lcom/mopub/mobileads/ap;)F

    move-result v1

    invoke-direct {v0, v7, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 126
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->c(Lcom/mopub/mobileads/ap;)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 127
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/an;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    invoke-virtual {p0}, Lcom/mopub/mobileads/an;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/an;->d:I

    .line 130
    invoke-virtual {p0}, Lcom/mopub/mobileads/an;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/an;->e:I

    .line 131
    const/high16 v0, 0x42140000    # 37.0f

    invoke-virtual {p0}, Lcom/mopub/mobileads/an;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/an;->f:I

    .line 133
    invoke-virtual {p0}, Lcom/mopub/mobileads/an;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/network/Networking;->getImageLoader(Landroid/content/Context;)Lcom/mopub/volley/toolbox/ImageLoader;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/an;->c:Lcom/mopub/volley/toolbox/ImageLoader;

    .line 135
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->d(Lcom/mopub/mobileads/ap;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/an;->setVisibility(I)V

    .line 137
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->e(Lcom/mopub/mobileads/ap;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->f(Lcom/mopub/mobileads/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 139
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/mopub/mobileads/an;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    .line 140
    iget-object v0, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    invoke-static {}, Lcom/mopub/common/util/Utils;->generateUniqueId()J

    move-result-wide v2

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    .line 142
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/mopub/mobileads/an;->f:I

    iget v2, p0, Lcom/mopub/mobileads/an;->f:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 146
    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 147
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->g(Lcom/mopub/mobileads/ap;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 149
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    iget v2, p0, Lcom/mopub/mobileads/an;->e:I

    iget v3, p0, Lcom/mopub/mobileads/an;->e:I

    iget v4, p0, Lcom/mopub/mobileads/an;->e:I

    iget v5, p0, Lcom/mopub/mobileads/an;->e:I

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 151
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    const/high16 v2, -0x1000000

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 152
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 153
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    invoke-static {p1}, Lcom/mopub/mobileads/ap;->f(Lcom/mopub/mobileads/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 154
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Lcom/mopub/mobileads/an;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    :cond_0
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->h(Lcom/mopub/mobileads/ap;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/mopub/mobileads/an;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    .line 160
    iget-object v0, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 161
    iget-object v0, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 162
    iget-object v0, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    invoke-static {p1}, Lcom/mopub/mobileads/ap;->i(Lcom/mopub/mobileads/ap;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 165
    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 167
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    if-eqz v1, :cond_3

    .line 168
    iget-object v1, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getId()I

    move-result v1

    invoke-virtual {v0, v7, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 173
    :goto_0
    iget-object v1, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    iget v2, p0, Lcom/mopub/mobileads/an;->d:I

    iget v3, p0, Lcom/mopub/mobileads/an;->d:I

    iget v4, p0, Lcom/mopub/mobileads/an;->d:I

    iget v5, p0, Lcom/mopub/mobileads/an;->d:I

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 175
    iget-object v1, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    invoke-virtual {p0, v1, v0}, Lcom/mopub/mobileads/an;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    :cond_1
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->k(Lcom/mopub/mobileads/ap;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 179
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->k(Lcom/mopub/mobileads/ap;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/an;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 181
    :cond_2
    return-void

    .line 170
    :cond_3
    invoke-static {p1}, Lcom/mopub/mobileads/ap;->j(Lcom/mopub/mobileads/ap;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/mopub/mobileads/ap;B)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/an;-><init>(Lcom/mopub/mobileads/ap;)V

    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/an;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/mopub/mobileads/an;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    :cond_0
    return-void
.end method

.method final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 191
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/an;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/resource/TextDrawable;

    .line 192
    invoke-interface {v0, p1}, Lcom/mopub/mobileads/resource/TextDrawable;->updateText(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    :goto_0
    return-void

    .line 194
    :catch_0
    move-exception v0

    const-string v0, "Unable to update ToolbarWidget text."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method final c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 199
    iget-object v0, p0, Lcom/mopub/mobileads/an;->c:Lcom/mopub/volley/toolbox/ImageLoader;

    new-instance v1, Lcom/mopub/mobileads/ao;

    invoke-direct {v1, p0, p1}, Lcom/mopub/mobileads/ao;-><init>(Lcom/mopub/mobileads/an;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lcom/mopub/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    .line 216
    return-void
.end method

.class final Lcom/mopub/mobileads/aq;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private final a:Lcom/mopub/mobileads/an;

.field private final b:Lcom/mopub/mobileads/an;

.field private final c:Lcom/mopub/mobileads/an;

.field private final d:Lcom/mopub/mobileads/an;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/16 v4, 0x15

    const/high16 v3, 0x3f800000    # 1.0f

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-static {}, Lcom/mopub/common/util/Utils;->generateUniqueId()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->setId(I)V

    .line 37
    new-instance v0, Lcom/mopub/mobileads/ar;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/ar;-><init>(Lcom/mopub/mobileads/aq;)V

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 44
    const/high16 v0, 0x42300000    # 44.0f

    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    .line 45
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 48
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/aq;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->setBackgroundColor(I)V

    .line 51
    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xb4

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1135
    new-instance v0, Lcom/mopub/mobileads/ap;

    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mobileads/ap;-><init>(Landroid/content/Context;)V

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->a(F)Lcom/mopub/mobileads/ap;

    move-result-object v0

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->a(I)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/ap;->a()Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/ap;->b()Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/ap;->c()Lcom/mopub/mobileads/an;

    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/mopub/mobileads/aq;->a:Lcom/mopub/mobileads/an;

    .line 1144
    new-instance v0, Lcom/mopub/mobileads/ap;

    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mobileads/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Lcom/mopub/mobileads/ap;->a(F)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/mopub/mobileads/ap;->a(I)Lcom/mopub/mobileads/ap;

    move-result-object v0

    const-string v1, "Learn More"

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->a(Ljava/lang/String;)Lcom/mopub/mobileads/ap;

    move-result-object v0

    new-instance v1, Lcom/mopub/mobileads/resource/LearnMoreDrawable;

    invoke-direct {v1}, Lcom/mopub/mobileads/resource/LearnMoreDrawable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->a(Landroid/graphics/drawable/Drawable;)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/mopub/mobileads/ap;->b(I)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/ap;->c()Lcom/mopub/mobileads/an;

    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/mopub/mobileads/aq;->b:Lcom/mopub/mobileads/an;

    .line 1154
    new-instance v0, Lcom/mopub/mobileads/resource/CountdownDrawable;

    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mobileads/resource/CountdownDrawable;-><init>(Landroid/content/Context;)V

    .line 1156
    new-instance v1, Lcom/mopub/mobileads/ap;

    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/mopub/mobileads/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v3}, Lcom/mopub/mobileads/ap;->a(F)Lcom/mopub/mobileads/ap;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/mopub/mobileads/ap;->a(I)Lcom/mopub/mobileads/ap;

    move-result-object v1

    const-string v2, "Skip in"

    invoke-virtual {v1, v2}, Lcom/mopub/mobileads/ap;->a(Ljava/lang/String;)Lcom/mopub/mobileads/ap;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mopub/mobileads/ap;->a(Landroid/graphics/drawable/Drawable;)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/mopub/mobileads/ap;->b(I)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/ap;->c()Lcom/mopub/mobileads/an;

    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/mopub/mobileads/aq;->c:Lcom/mopub/mobileads/an;

    .line 1166
    new-instance v0, Lcom/mopub/mobileads/ap;

    invoke-virtual {p0}, Lcom/mopub/mobileads/aq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mobileads/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Lcom/mopub/mobileads/ap;->a(F)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/mopub/mobileads/ap;->a(I)Lcom/mopub/mobileads/ap;

    move-result-object v0

    const-string v1, "Close"

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->a(Ljava/lang/String;)Lcom/mopub/mobileads/ap;

    move-result-object v0

    new-instance v1, Lcom/mopub/mobileads/resource/CloseButtonDrawable;

    invoke-direct {v1}, Lcom/mopub/mobileads/resource/CloseButtonDrawable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->a(Landroid/graphics/drawable/Drawable;)Lcom/mopub/mobileads/ap;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ap;->b(I)Lcom/mopub/mobileads/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/ap;->c()Lcom/mopub/mobileads/an;

    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    .line 58
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->a:Lcom/mopub/mobileads/an;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->addView(Landroid/view/View;)V

    .line 59
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->b:Lcom/mopub/mobileads/an;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->addView(Landroid/view/View;)V

    .line 60
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->c:Lcom/mopub/mobileads/an;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->addView(Landroid/view/View;)V

    .line 61
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/aq;->addView(Landroid/view/View;)V

    .line 62
    return-void
.end method

.method private static a(J)J
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 74
    long-to-float v0, p0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 121
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->c:Lcom/mopub/mobileads/an;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/an;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->b:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, v2}, Lcom/mopub/mobileads/an;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, v2}, Lcom/mopub/mobileads/an;->setVisibility(I)V

    .line 124
    return-void
.end method

.method final a(I)V
    .locals 8
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 79
    const/16 v0, 0xc8

    if-lt p1, v0, :cond_2

    .line 80
    iget-object v1, p0, Lcom/mopub/mobileads/aq;->a:Lcom/mopub/mobileads/an;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "Ends in "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-long v4, p1

    .line 2088
    invoke-static {v4, v5}, Lcom/mopub/mobileads/aq;->a(J)J

    move-result-wide v4

    .line 2090
    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    .line 2091
    const-string v0, "1 second"

    .line 80
    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/mopub/mobileads/an;->a(Ljava/lang/String;)V

    .line 84
    :cond_0
    :goto_1
    return-void

    .line 2093
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " seconds"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 81
    :cond_2
    if-ltz p1, :cond_0

    .line 82
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->a:Lcom/mopub/mobileads/an;

    const-string v1, "Thanks for watching"

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/an;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method final a(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/an;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 128
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->b:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/an;->a(Ljava/lang/String;)V

    .line 109
    return-void
.end method

.method final b(I)V
    .locals 4

    .prologue
    .line 98
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/aq;->c:Lcom/mopub/mobileads/an;

    invoke-virtual {v0}, Lcom/mopub/mobileads/an;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 99
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/an;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->c:Lcom/mopub/mobileads/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/an;->setVisibility(I)V

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->c:Lcom/mopub/mobileads/an;

    int-to-long v2, p1

    invoke-static {v2, v3}, Lcom/mopub/mobileads/aq;->a(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/an;->b(Ljava/lang/String;)V

    .line 105
    return-void
.end method

.method final b(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->b:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/an;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 132
    return-void
.end method

.method final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/an;->a(Ljava/lang/String;)V

    .line 113
    return-void
.end method

.method final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/mopub/mobileads/aq;->d:Lcom/mopub/mobileads/an;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/an;->c(Ljava/lang/String;)V

    .line 117
    return-void
.end method

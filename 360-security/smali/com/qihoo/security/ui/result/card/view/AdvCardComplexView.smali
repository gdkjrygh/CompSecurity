.class public Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;
.super Lcom/qihoo/security/ui/result/card/view/AvdCardView;
.source "360Security"


# instance fields
.field private final d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final e:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final f:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final g:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

.field private final i:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

.field private final j:Landroid/widget/RatingBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/result/card/view/AvdCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->c:Landroid/content/Context;

    const v1, 0x7f030032

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 39
    const v0, 0x7f0b00a9

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 40
    const v0, 0x7f0b0084

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->b:Landroid/view/View;

    .line 41
    const v0, 0x7f0b0046

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->i:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    .line 42
    const v0, 0x7f0b00ae

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 43
    const v0, 0x7f0b00ac

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 44
    const v0, 0x7f0b00ab

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    .line 45
    const v0, 0x7f0b00ad

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->j:Landroid/widget/RatingBar;

    .line 46
    const v0, 0x7f0b00b0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 47
    const v0, 0x7f0b00af

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 48
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    return-void
.end method


# virtual methods
.method public getAssertRemoteImageViews()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->i:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    return-object v0
.end method

.method public setADcontent(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 2

    .prologue
    .line 53
    if-nez p1, :cond_0

    .line 64
    :goto_0
    return-void

    .line 56
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a:Lcom/qihoo/security/ui/result/AdvData;

    .line 57
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a()V

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->setTitleText(Landroid/widget/TextView;)V

    .line 59
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->creatives:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->i:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->setDescriptionText(Landroid/widget/TextView;)V

    .line 62
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->j:Landroid/widget/RatingBar;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a(Landroid/widget/RatingBar;)V

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->a(Landroid/widget/TextView;Landroid/widget/TextView;)V

    goto :goto_0
.end method

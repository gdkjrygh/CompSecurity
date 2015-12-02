.class public Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;
.super Lcom/qihoo/security/ui/result/card/view/AvdCardView;
.source "360Security"


# instance fields
.field private final d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final e:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final f:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final g:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

.field private final i:Landroid/widget/RatingBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/result/card/view/AvdCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->c:Landroid/content/Context;

    const v1, 0x7f03002e

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 33
    const v0, 0x7f0b007e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 34
    const v0, 0x7f0b0084

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->b:Landroid/view/View;

    .line 35
    const v0, 0x7f0b007f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    .line 36
    const v0, 0x7f0b0080

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 37
    const v0, 0x7f0b0081

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 38
    const v0, 0x7f0b0082

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->i:Landroid/widget/RatingBar;

    .line 39
    const v0, 0x7f0b0083

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 40
    const v0, 0x7f0b009a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 41
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
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
    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    return-object v0
.end method

.method public setADcontent(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 2

    .prologue
    .line 46
    if-nez p1, :cond_0

    .line 56
    :goto_0
    return-void

    .line 49
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->a:Lcom/qihoo/security/ui/result/AdvData;

    .line 50
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->a()V

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->h:Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->setTitleText(Landroid/widget/TextView;)V

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->setDescriptionText(Landroid/widget/TextView;)V

    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->i:Landroid/widget/RatingBar;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->a(Landroid/widget/RatingBar;)V

    .line 55
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->a(Landroid/widget/TextView;Landroid/widget/TextView;)V

    goto :goto_0
.end method

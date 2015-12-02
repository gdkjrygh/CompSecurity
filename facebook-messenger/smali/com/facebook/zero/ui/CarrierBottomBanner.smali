.class public Lcom/facebook/zero/ui/CarrierBottomBanner;
.super Lcom/facebook/widget/f;
.source "CarrierBottomBanner.java"


# instance fields
.field private a:Lcom/facebook/zero/ui/c;

.field private final b:Landroid/content/res/Resources;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/widget/TextView;

.field private final e:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/zero/ui/CarrierBottomBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/zero/ui/CarrierBottomBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 58
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 61
    const-class v1, Landroid/content/res/Resources;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->b:Landroid/content/res/Resources;

    .line 63
    sget v0, Lcom/facebook/k;->carrier_bottom_banner:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/ui/CarrierBottomBanner;->setContentView(I)V

    .line 65
    sget v0, Lcom/facebook/i;->carrier_bottom_banner_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/ui/CarrierBottomBanner;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->c:Landroid/widget/TextView;

    .line 66
    sget v0, Lcom/facebook/i;->carrier_bottom_banner_content:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/ui/CarrierBottomBanner;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->d:Landroid/widget/TextView;

    .line 67
    sget v0, Lcom/facebook/i;->carrier_bottom_banner_close:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/ui/CarrierBottomBanner;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->e:Landroid/widget/Button;

    .line 68
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->e:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/zero/ui/a;

    invoke-direct {v1, p0}, Lcom/facebook/zero/ui/a;-><init>(Lcom/facebook/zero/ui/CarrierBottomBanner;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    return-void
.end method

.method static synthetic a(Lcom/facebook/zero/ui/CarrierBottomBanner;)Lcom/facebook/zero/ui/c;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->a:Lcom/facebook/zero/ui/c;

    return-object v0
.end method


# virtual methods
.method public setBottomBannerData(Lcom/facebook/zero/ui/CarrierBottomBannerData;)V
    .locals 6

    .prologue
    const/16 v5, 0x21

    .line 84
    invoke-virtual {p1}, Lcom/facebook/zero/ui/CarrierBottomBannerData;->getActionUrl()Ljava/lang/String;

    move-result-object v0

    .line 85
    new-instance v1, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 86
    new-instance v2, Lcom/facebook/zero/ui/b;

    invoke-direct {v2, p0, v0}, Lcom/facebook/zero/ui/b;-><init>(Lcom/facebook/zero/ui/CarrierBottomBanner;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 95
    new-instance v0, Lcom/facebook/common/w/o;

    iget-object v2, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v2}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 96
    sget v2, Lcom/facebook/o;->zero_bottom_banner_content:I

    invoke-virtual {v0, v2}, Lcom/facebook/common/w/o;->a(I)Lcom/facebook/common/w/o;

    .line 97
    const-string v2, "[[content]]"

    invoke-virtual {p1}, Lcom/facebook/zero/ui/CarrierBottomBannerData;->getContent()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 102
    const-string v2, "[[cta]]"

    invoke-virtual {p1}, Lcom/facebook/zero/ui/CarrierBottomBannerData;->getActionTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v1, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 108
    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/zero/ui/CarrierBottomBannerData;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->d:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 111
    return-void
.end method

.method public setListener(Lcom/facebook/zero/ui/c;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/zero/ui/CarrierBottomBanner;->a:Lcom/facebook/zero/ui/c;

    .line 80
    return-void
.end method

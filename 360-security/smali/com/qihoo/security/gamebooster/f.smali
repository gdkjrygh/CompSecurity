.class public Lcom/qihoo/security/gamebooster/f;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    .line 35
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/f;->b:Landroid/view/LayoutInflater;

    .line 36
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/f;->a:Ljava/util/List;

    .line 37
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 85
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    .line 88
    if-eqz p1, :cond_0

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-le v0, v1, :cond_0

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 93
    :cond_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V

    .line 94
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Show:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    .line 95
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 51
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    .line 56
    if-nez p2, :cond_0

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030068

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/f;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 61
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 62
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/f;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    :cond_1
    if-eqz v0, :cond_2

    .line 65
    const v1, 0x7f0b014d

    invoke-static {p2, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 66
    const v2, 0x7f0b014e

    invoke-static {p2, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 67
    const v3, 0x7f0b014a

    invoke-static {p2, v3}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 68
    iget-object v4, v0, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->des:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    const v2, 0x7f02015d

    invoke-virtual {v3, v1, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    .line 71
    iget v1, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-nez v1, :cond_2

    .line 72
    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    .line 73
    invoke-virtual {v0, p2}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;)V

    .line 78
    :cond_2
    return-object p2
.end method

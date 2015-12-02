.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 0

    .prologue
    .line 729
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;)V
    .locals 0

    .prologue
    .line 729
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    return-void
.end method

.method private a(Landroid/view/View;)Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;
    .locals 5

    .prologue
    const v4, 0x7f0b0136

    const v3, 0x7f0b0084

    const v2, 0x7f0b0049

    .line 803
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;)V

    .line 804
    iput-object p1, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    .line 805
    const v0, 0x7f0b0109

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 806
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    .line 807
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;)Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    .line 808
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 810
    const v0, 0x7f0b010a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 811
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    .line 812
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;)Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    .line 813
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->e(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 815
    const v0, 0x7f0b010b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->f(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 816
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    .line 817
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;)Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    .line 818
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->g(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 820
    const v0, 0x7f0b010c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->h(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 821
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    .line 822
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;)Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    .line 823
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->i(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 825
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 826
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 827
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 828
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 830
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 831
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 832
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 833
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 834
    return-object v1
.end method

.method private a(ILandroid/view/View;)V
    .locals 2

    .prologue
    .line 839
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    move-result-object v1

    .line 840
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    .line 841
    invoke-virtual {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V

    .line 843
    return-void
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;
    .locals 1

    .prologue
    .line 852
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 857
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 729
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 847
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .prologue
    .line 862
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f0b0141

    const v5, 0x7f0b0140

    const v4, 0x7f0b0084

    const v3, 0x7f0b0075

    const/4 v0, 0x0

    .line 733
    if-nez p2, :cond_0

    .line 734
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->getItemViewType(I)I

    move-result v1

    .line 737
    packed-switch v1, :pswitch_data_0

    move-object v1, v0

    .line 796
    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 798
    :goto_1
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(ILandroid/view/View;)V

    .line 799
    return-object v1

    .line 741
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f03004b

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 742
    invoke-direct {p0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(Landroid/view/View;)Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    move-result-object v0

    goto :goto_0

    .line 745
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f03004c

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 746
    invoke-direct {p0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(Landroid/view/View;)Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    move-result-object v0

    goto :goto_0

    .line 750
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f03005c

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 751
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-direct {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;)V

    .line 752
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 753
    const v0, 0x7f0b0142

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 754
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 755
    const v0, 0x7f0b00ad

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/RatingBar;)Landroid/widget/RatingBar;

    .line 756
    const v0, 0x7f0b0143

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 757
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 758
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    .line 759
    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object v0, v1

    move-object v1, v2

    .line 760
    goto/16 :goto_0

    .line 762
    :pswitch_3
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f03005d

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 763
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-direct {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;)V

    .line 764
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 765
    const v0, 0x7f0b0142

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 766
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 767
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/view/View;)Landroid/view/View;

    .line 768
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    .line 769
    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object v0, v1

    move-object v1, v2

    .line 770
    goto/16 :goto_0

    .line 772
    :pswitch_4
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f030061

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 773
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-direct {v2, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;)V

    move-object v0, v1

    .line 774
    check-cast v0, Landroid/widget/TextView;

    invoke-static {v2, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;Landroid/widget/TextView;)Landroid/widget/TextView;

    move-object v0, v2

    .line 775
    goto/16 :goto_0

    .line 777
    :pswitch_5
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f03005e

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    goto/16 :goto_0

    .line 780
    :pswitch_6
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f030060

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    goto/16 :goto_0

    .line 783
    :pswitch_7
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f03005f

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    goto/16 :goto_0

    .line 787
    :pswitch_8
    new-instance v1, Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 788
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    goto/16 :goto_0

    :cond_0
    move-object v1, p2

    goto/16 :goto_1

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 867
    const/16 v0, 0xc

    return v0
.end method

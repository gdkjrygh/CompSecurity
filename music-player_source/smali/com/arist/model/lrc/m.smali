.class final Lcom/arist/model/lrc/m;
.super Landroid/widget/BaseAdapter;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/i;

.field private b:Ljava/util/List;

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/arist/model/lrc/i;Landroid/view/LayoutInflater;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/m;->a:Lcom/arist/model/lrc/i;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p3, p0, Lcom/arist/model/lrc/m;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/arist/model/lrc/m;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/m;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/m;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/lrc/m;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/arist/model/lrc/m;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/arist/model/lrc/m;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f030013

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/arist/model/lrc/n;

    invoke-direct {v1, p0}, Lcom/arist/model/lrc/n;-><init>(Lcom/arist/model/lrc/m;)V

    const v0, 0x7f060065

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/arist/model/lrc/n;->a:Landroid/widget/TextView;

    const v0, 0x7f060066

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/arist/model/lrc/n;->b:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/arist/model/lrc/m;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/arist/model/lrc/n;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lcom/arist/model/lrc/n;->b:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/arist/model/lrc/m;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/model/lrc/n;

    goto :goto_0
.end method

.class final Lcom/arist/activity/j;
.super Landroid/widget/BaseAdapter;


# instance fields
.field final synthetic a:Lcom/arist/activity/LrcBrowseActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/LrcBrowseActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/j;->a:Lcom/arist/activity/LrcBrowseActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/j;->a:Lcom/arist/activity/LrcBrowseActivity;

    invoke-static {v0}, Lcom/arist/activity/LrcBrowseActivity;->a(Lcom/arist/activity/LrcBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/j;->a:Lcom/arist/activity/LrcBrowseActivity;

    invoke-static {v0}, Lcom/arist/activity/LrcBrowseActivity;->a(Lcom/arist/activity/LrcBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/arist/activity/j;->a(I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/arist/activity/j;->a:Lcom/arist/activity/LrcBrowseActivity;

    invoke-virtual {v0}, Lcom/arist/activity/LrcBrowseActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030025

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/arist/activity/k;

    invoke-direct {v1, p0}, Lcom/arist/activity/k;-><init>(Lcom/arist/activity/j;)V

    const v0, 0x7f06008c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/arist/activity/k;->a:Landroid/widget/ImageView;

    const v0, 0x7f06008d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/arist/activity/k;->b:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/arist/activity/j;->a(I)Ljava/io/File;

    move-result-object v2

    iget-object v3, v0, Lcom/arist/activity/k;->a:Landroid/widget/ImageView;

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f020093

    :goto_1
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, v0, Lcom/arist/activity/k;->b:Landroid/widget/TextView;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/activity/k;

    goto :goto_0

    :cond_1
    const v1, 0x7f020057

    goto :goto_1
.end method

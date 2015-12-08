.class final Lcom/arist/activity/c;
.super Landroid/widget/BaseAdapter;


# instance fields
.field public a:I

.field final synthetic b:Lcom/arist/activity/AddToListActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/AddToListActivity;)V
    .locals 1

    iput-object p1, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/arist/activity/c;->a:I

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/c;)Lcom/arist/activity/AddToListActivity;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    return-object v0
.end method

.method private a(I)Lcom/arist/b/b;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->a(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    return-object v0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->a(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->a(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;

    move-result-object v0

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

    invoke-direct {p0, p1}, Lcom/arist/activity/c;->a(I)Lcom/arist/b/b;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    const/4 v4, 0x0

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-virtual {v0}, Lcom/arist/activity/AddToListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030027

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/arist/activity/e;

    invoke-direct {v1, p0}, Lcom/arist/activity/e;-><init>(Lcom/arist/activity/c;)V

    const v0, 0x7f060086

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorImageView;

    iput-object v0, v1, Lcom/arist/activity/e;->a:Lcom/arist/model/skin/ColorImageView;

    const v0, 0x7f060092

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorCheckBox;

    iput-object v0, v1, Lcom/arist/activity/e;->b:Lcom/arist/model/skin/ColorCheckBox;

    const v0, 0x7f060093

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/arist/activity/e;->c:Landroid/widget/TextView;

    const v0, 0x7f060094

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/arist/activity/e;->d:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    invoke-direct {p0, p1}, Lcom/arist/activity/c;->a(I)Lcom/arist/b/b;

    move-result-object v1

    iget-object v2, v0, Lcom/arist/activity/e;->a:Lcom/arist/model/skin/ColorImageView;

    invoke-static {v1, v2}, Lcom/arist/c/a/a;->a(Lcom/arist/b/b;Lcom/arist/model/skin/ColorImageView;)V

    iget-object v2, v0, Lcom/arist/activity/e;->c:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Lcom/arist/activity/e;->d:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Lcom/arist/activity/e;->b:Lcom/arist/model/skin/ColorCheckBox;

    invoke-virtual {v2, v4}, Lcom/arist/model/skin/ColorCheckBox;->a(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v2, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-static {v2}, Lcom/arist/activity/AddToListActivity;->b(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/arist/activity/e;->b:Lcom/arist/model/skin/ColorCheckBox;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/arist/model/skin/ColorCheckBox;->setEnabled(Z)V

    iget-object v1, v0, Lcom/arist/activity/e;->b:Lcom/arist/model/skin/ColorCheckBox;

    iget-object v2, p0, Lcom/arist/activity/c;->b:Lcom/arist/activity/AddToListActivity;

    invoke-static {v2}, Lcom/arist/activity/AddToListActivity;->c(Lcom/arist/activity/AddToListActivity;)[Z

    move-result-object v2

    aget-boolean v2, v2, p1

    invoke-virtual {v1, v2}, Lcom/arist/model/skin/ColorCheckBox;->a(Z)V

    iget-object v0, v0, Lcom/arist/activity/e;->b:Lcom/arist/model/skin/ColorCheckBox;

    new-instance v1, Lcom/arist/activity/d;

    invoke-direct {v1, p0, p1}, Lcom/arist/activity/d;-><init>(Lcom/arist/activity/c;I)V

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorCheckBox;->a(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :goto_1
    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/activity/e;

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lcom/arist/activity/e;->b:Lcom/arist/model/skin/ColorCheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorCheckBox;->setEnabled(Z)V

    goto :goto_1
.end method

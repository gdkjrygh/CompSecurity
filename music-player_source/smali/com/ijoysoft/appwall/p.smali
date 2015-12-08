.class public final Lcom/ijoysoft/appwall/p;
.super Landroid/widget/BaseAdapter;


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:Landroid/view/LayoutInflater;

.field private c:Lcom/ijoysoft/appwall/d;

.field private d:Landroid/content/SharedPreferences;

.field private e:Lcom/ijoysoft/appwall/g;

.field private f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/GridView;)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ijoysoft/appwall/p;->b(Ljava/util/ArrayList;)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/ijoysoft/appwall/p;->b:Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/ijoysoft/appwall/p;->f:Landroid/content/Context;

    new-instance v0, Lcom/ijoysoft/appwall/q;

    invoke-direct {v0, p0, p2}, Lcom/ijoysoft/appwall/q;-><init>(Lcom/ijoysoft/appwall/p;Landroid/widget/GridView;)V

    iput-object v0, p0, Lcom/ijoysoft/appwall/p;->e:Lcom/ijoysoft/appwall/g;

    new-instance v0, Lcom/ijoysoft/appwall/d;

    invoke-direct {v0}, Lcom/ijoysoft/appwall/d;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/p;->c:Lcom/ijoysoft/appwall/d;

    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/ijoysoft/appwall/p;->a:Ljava/util/ArrayList;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/p;->a:Ljava/util/ArrayList;

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ijoysoft/appwall/p;->b(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Lcom/ijoysoft/appwall/p;->notifyDataSetChanged()V

    return-void
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

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

    iget-object v0, p0, Lcom/ijoysoft/appwall/p;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/ijoysoft/appwall/ac;->c:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/ijoysoft/appwall/r;

    invoke-direct {v1, p0, v4}, Lcom/ijoysoft/appwall/r;-><init>(Lcom/ijoysoft/appwall/p;B)V

    sget v0, Lcom/ijoysoft/appwall/ab;->e:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lcom/ijoysoft/appwall/r;->a(Lcom/ijoysoft/appwall/r;Landroid/widget/ImageView;)V

    sget v0, Lcom/ijoysoft/appwall/ab;->k:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/ijoysoft/appwall/r;->a(Lcom/ijoysoft/appwall/r;Landroid/widget/TextView;)V

    sget v0, Lcom/ijoysoft/appwall/ab;->j:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/ijoysoft/appwall/r;->b(Lcom/ijoysoft/appwall/r;Landroid/widget/TextView;)V

    sget v0, Lcom/ijoysoft/appwall/ab;->g:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lcom/ijoysoft/appwall/r;->b(Lcom/ijoysoft/appwall/r;Landroid/widget/ImageView;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/ijoysoft/appwall/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->a(Lcom/ijoysoft/appwall/r;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->b(Lcom/ijoysoft/appwall/r;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->c(Lcom/ijoysoft/appwall/r;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/ijoysoft/appwall/p;->f:Landroid/content/Context;

    const-string v3, "settings"

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/ijoysoft/appwall/p;->d:Landroid/content/SharedPreferences;

    iget-object v2, p0, Lcom/ijoysoft/appwall/p;->d:Landroid/content/SharedPreferences;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->d(Lcom/ijoysoft/appwall/r;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    iget-object v2, p0, Lcom/ijoysoft/appwall/p;->c:Lcom/ijoysoft/appwall/d;

    iget-object v3, p0, Lcom/ijoysoft/appwall/p;->e:Lcom/ijoysoft/appwall/g;

    invoke-virtual {v2, v0, v3}, Lcom/ijoysoft/appwall/d;->a(Lcom/ijoysoft/appwall/o;Lcom/ijoysoft/appwall/g;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->c(Lcom/ijoysoft/appwall/r;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/ijoysoft/appwall/aa;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_2
    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/r;

    move-object v1, v0

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->d(Lcom/ijoysoft/appwall/r;)Landroid/widget/ImageView;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lcom/ijoysoft/appwall/r;->c(Lcom/ijoysoft/appwall/r;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2
.end method

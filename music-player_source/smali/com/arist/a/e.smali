.class public final Lcom/arist/a/e;
.super Landroid/widget/BaseAdapter;


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:Landroid/view/LayoutInflater;

.field private c:Landroid/content/Context;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    sget v0, Lcom/arist/activity/MyApplication;->f:I

    iput v0, p0, Lcom/arist/a/e;->d:I

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/a/e;->b:Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/arist/a/e;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/arist/a/e;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/arist/a/e;->c:Landroid/content/Context;

    return-object v0
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/arist/a/e;->d:I

    return v0
.end method

.method public final a(I)V
    .locals 1

    iput p1, p0, Lcom/arist/a/e;->d:I

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    sget-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/arist/a/e;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/arist/a/e;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/arist/a/e;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/arist/a/e;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/arist/a/e;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Lcom/arist/b/c;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    return-void
.end method

.method public final b(I)Lcom/arist/b/c;
    .locals 1

    iget-object v0, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/arist/a/e;->b(I)Lcom/arist/b/c;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    iget-object v0, p0, Lcom/arist/a/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->d()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const/16 v3, 0x8

    const/4 v8, 0x3

    const/4 v2, 0x0

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/arist/a/e;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f03001e

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/arist/a/g;

    invoke-direct {v1}, Lcom/arist/a/g;-><init>()V

    const v0, 0x7f060088

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/arist/a/g;->a(Lcom/arist/a/g;Landroid/widget/TextView;)V

    const v0, 0x7f060089

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/arist/a/g;->b(Lcom/arist/a/g;Landroid/widget/TextView;)V

    const v0, 0x7f060086

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lcom/arist/a/g;->a(Lcom/arist/a/g;Landroid/widget/ImageView;)V

    const v0, 0x7f060087

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/arist/a/g;->a(Lcom/arist/a/g;Landroid/view/View;)V

    const v0, 0x7f060085

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/arist/a/g;->b(Lcom/arist/a/g;Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lcom/arist/a/g;->a(Lcom/arist/a/g;)Landroid/view/View;

    move-result-object v4

    iget v1, p0, Lcom/arist/a/e;->d:I

    if-ne v8, v1, :cond_1

    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    move v1, v2

    :goto_2
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, p1}, Lcom/arist/a/e;->b(I)Lcom/arist/b/c;

    move-result-object v4

    invoke-static {v0}, Lcom/arist/a/g;->b(Lcom/arist/a/g;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v4}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lcom/arist/a/g;->c(Lcom/arist/a/g;)Landroid/widget/TextView;

    move-result-object v5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, " "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v6, p0, Lcom/arist/a/e;->c:Landroid/content/Context;

    const v7, 0x7f090056

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v4}, Lcom/arist/b/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "  -  "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/arist/b/c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lcom/arist/a/g;->d(Lcom/arist/a/g;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v4}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/arist/a/g;->d(Lcom/arist/a/g;)Landroid/widget/ImageView;

    move-result-object v5

    iget v1, p0, Lcom/arist/a/e;->d:I

    packed-switch v1, :pswitch_data_0

    const v1, 0x7f020095

    :goto_4
    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v4}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lcom/arist/b/c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0xc3

    const/16 v4, 0xd4

    const/16 v5, 0xde

    invoke-static {v1, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_5
    invoke-static {v0}, Lcom/arist/a/g;->e(Lcom/arist/a/g;)Landroid/view/View;

    move-result-object v1

    iget v4, p0, Lcom/arist/a/e;->d:I

    if-eq v4, v8, :cond_5

    :goto_6
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0}, Lcom/arist/a/g;->e(Lcom/arist/a/g;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arist/a/f;

    invoke-direct {v1, p0, p1}, Lcom/arist/a/f;-><init>(Lcom/arist/a/e;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/a/g;

    goto/16 :goto_0

    :cond_1
    move v1, v2

    goto/16 :goto_1

    :cond_2
    move v1, v3

    goto/16 :goto_2

    :cond_3
    const-string v1, ""

    goto :goto_3

    :pswitch_0
    const v1, 0x7f020091

    goto :goto_4

    :pswitch_1
    const v1, 0x7f020092

    goto :goto_4

    :pswitch_2
    const v1, 0x7f020093

    goto :goto_4

    :pswitch_3
    const v1, 0x7f020094

    goto :goto_4

    :cond_4
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_5

    :cond_5
    move v2, v3

    goto :goto_6

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

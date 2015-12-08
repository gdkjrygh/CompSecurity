.class public final Lcom/arist/a/a;
.super Landroid/widget/BaseAdapter;

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Ljava/util/ArrayList;

.field private c:Lcom/arist/activity/MainActivity;

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Lcom/arist/activity/MainActivity;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, Lcom/arist/a/a;->c:Lcom/arist/activity/MainActivity;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/a/a;->a:Landroid/view/LayoutInflater;

    iput-object p2, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p1, v0}, Lcom/arist/c/g;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/arist/a/a;->g:I

    return-void
.end method

.method static synthetic a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;
    .locals 1

    iget-object v0, p0, Lcom/arist/a/a;->c:Lcom/arist/activity/MainActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/arist/a/a;I)V
    .locals 0

    iput p1, p0, Lcom/arist/a/a;->f:I

    return-void
.end method

.method static synthetic b(Lcom/arist/a/a;)I
    .locals 1

    iget v0, p0, Lcom/arist/a/a;->d:I

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/arist/a/a;->d:I

    return v0
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/arist/a/a;->d:I

    return-void
.end method

.method public final a(II)V
    .locals 1

    iput p1, p0, Lcom/arist/a/a;->d:I

    iput p2, p0, Lcom/arist/a/a;->e:I

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/a/a;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/a/a;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/a/a;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/a/a;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/a/a;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method public final a(Landroid/view/View;Lcom/arist/b/b;)V
    .locals 13

    iget v0, p0, Lcom/arist/a/a;->d:I

    if-nez v0, :cond_2

    iget v0, p0, Lcom/arist/a/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    move v7, v0

    :goto_0
    iget v0, p0, Lcom/arist/a/a;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    move v8, v0

    :goto_1
    iget-object v0, p0, Lcom/arist/a/a;->a:Landroid/view/LayoutInflater;

    const v1, 0x7f030042

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v1, 0x7f0600f1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0600f3

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0600f5

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0600f6

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0600f2

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f0600f4

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    new-instance v9, Landroid/widget/PopupWindow;

    const/4 v10, -0x2

    const/4 v11, -0x2

    const/4 v12, 0x1

    invoke-direct {v9, v0, v10, v11, v12}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    new-instance v10, Landroid/graphics/drawable/ColorDrawable;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    new-instance v10, Lcom/arist/a/c;

    invoke-direct {v10, p0, v9, p2}, Lcom/arist/a/c;-><init>(Lcom/arist/a/a;Landroid/widget/PopupWindow;Lcom/arist/b/b;)V

    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v5, 0x1

    aget v1, v1, v5

    const/16 v5, 0x35

    iget v11, p0, Lcom/arist/a/a;->g:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v12

    sub-int/2addr v1, v12

    invoke-virtual {v9, v0, v5, v11, v1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    if-nez v8, :cond_0

    if-eqz v7, :cond_1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    move v7, v0

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x0

    move v8, v0

    goto/16 :goto_1
.end method

.method public final a(Lcom/arist/b/b;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    return-void
.end method

.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/arist/a/a;->e:I

    return v0
.end method

.method public final b(I)V
    .locals 3

    const-string v0, "MainAc"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "-secondPosition-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput p1, p0, Lcom/arist/a/a;->e:I

    return-void
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/arist/a/a;->f:I

    return v0
.end method

.method public final c(I)Lcom/arist/b/b;
    .locals 1

    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/arist/a/a;->c(I)Lcom/arist/b/b;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->c()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/arist/a/a;->a:Landroid/view/LayoutInflater;

    const v1, 0x7f030021

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/arist/a/d;

    invoke-direct {v1}, Lcom/arist/a/d;-><init>()V

    const v0, 0x7f060088

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/arist/a/d;->a(Lcom/arist/a/d;Landroid/widget/TextView;)V

    const v0, 0x7f060089

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1, v0}, Lcom/arist/a/d;->b(Lcom/arist/a/d;Landroid/widget/TextView;)V

    const v0, 0x7f06008b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorImageView;

    invoke-static {v1, v0}, Lcom/arist/a/d;->a(Lcom/arist/a/d;Lcom/arist/model/skin/ColorImageView;)V

    const v0, 0x7f060087

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/arist/a/d;->a(Lcom/arist/a/d;Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/arist/a/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-static {v1}, Lcom/arist/a/d;->a(Lcom/arist/a/d;)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/arist/a/b;

    invoke-direct {v3, p0, p1, v0}, Lcom/arist/a/b;-><init>(Lcom/arist/a/a;ILcom/arist/b/b;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/arist/b/b;->c()I

    move-result v2

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/b/b;->c()I

    move-result v3

    if-ne v2, v3, :cond_1

    const v2, -0x3c2b22

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_1
    invoke-static {v1}, Lcom/arist/a/d;->b(Lcom/arist/a/d;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lcom/arist/a/d;->c(Lcom/arist/a/d;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/arist/b/b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lcom/arist/a/d;->d(Lcom/arist/a/d;)Lcom/arist/model/skin/ColorImageView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/c/a/a;->a(Lcom/arist/b/b;Lcom/arist/model/skin/ColorImageView;)V

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/a/d;

    move-object v1, v0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1
.end method

.method public final notifyDataSetChanged()V
    .locals 2

    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v1, p0, Lcom/arist/a/a;->c:Lcom/arist/activity/MainActivity;

    invoke-virtual {p0}, Lcom/arist/a/a;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/arist/activity/MainActivity;->a(Z)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 2

    iput p3, p0, Lcom/arist/a/a;->f:I

    const v0, 0x7f060087

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p3}, Lcom/arist/a/a;->c(I)Lcom/arist/b/b;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/arist/a/a;->a(Landroid/view/View;Lcom/arist/b/b;)V

    const/4 v0, 0x1

    return v0
.end method

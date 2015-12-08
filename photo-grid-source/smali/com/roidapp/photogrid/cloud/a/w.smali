.class abstract Lcom/roidapp/photogrid/cloud/a/w;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:I

.field protected c:Ljava/lang/String;

.field protected g:I

.field protected h:I

.field protected i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 26
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .prologue
    const/16 v11, 0x8

    const/4 v10, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    .line 30
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->f:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move-object v0, v5

    .line 59
    :goto_0
    return-object v0

    .line 32
    :cond_1
    if-eqz p2, :cond_c

    .line 33
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/a/w;

    if-nez v0, :cond_c

    move-object v6, v5

    .line 39
    :goto_1
    if-eqz v6, :cond_2

    .line 40
    :goto_2
    if-nez v6, :cond_3

    move-object v0, v5

    .line 41
    goto :goto_0

    .line 39
    :cond_2
    const v0, 0x7f030014

    invoke-virtual {p1, v0, p3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    goto :goto_2

    .line 42
    :cond_3
    const v0, 0x7f0d0080

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 43
    const v1, 0x7f0d007f

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 44
    const v2, 0x7f0d0081

    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 45
    const v3, 0x7f0d0082

    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 46
    const v4, 0x7f0d0083

    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 47
    const v4, 0x7f0d0084

    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 48
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/a/w;->d()I

    move-result v8

    if-ne v8, v10, :cond_9

    .line 49
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 50
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1063
    :goto_3
    if-eqz v6, :cond_8

    .line 1065
    iget v7, p0, Lcom/roidapp/photogrid/cloud/a/w;->a:I

    invoke-static {v0, v7}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1066
    if-eqz v1, :cond_4

    .line 1067
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->c:Ljava/lang/String;

    if-nez v0, :cond_a

    .line 1068
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->b:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1072
    :cond_4
    :goto_4
    if-eqz v2, :cond_5

    .line 1073
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->g:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1074
    :cond_5
    if-eqz v3, :cond_6

    .line 1075
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->h:I

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1076
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1078
    :cond_6
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 1079
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->i:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1080
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1082
    :cond_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/a/w;->d()I

    move-result v0

    if-ne v0, v10, :cond_b

    .line 1083
    const v0, 0x7f0200a8

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1084
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/view/View;->setClickable(Z)V

    .line 1085
    invoke-virtual {v6, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    :cond_8
    :goto_5
    invoke-virtual {v6, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v6

    .line 59
    goto/16 :goto_0

    .line 52
    :cond_9
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 53
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 1070
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/w;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 1087
    :cond_b
    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_c
    move-object v6, p2

    goto/16 :goto_1
.end method

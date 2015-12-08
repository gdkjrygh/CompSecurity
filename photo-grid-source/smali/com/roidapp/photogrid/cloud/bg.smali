.class final Lcom/roidapp/photogrid/cloud/bg;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/bf;

.field private b:Lcom/roidapp/photogrid/cloud/p;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/bf;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 1

    .prologue
    .line 113
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bg;->a:Lcom/roidapp/photogrid/cloud/bf;

    .line 114
    const v0, 0xbcd1

    invoke-direct {p0, p2, v0, p3}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 116
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/bf;->a(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->b:Lcom/roidapp/photogrid/cloud/p;

    .line 117
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 121
    if-nez p1, :cond_1

    .line 157
    :cond_0
    :goto_0
    return-object v0

    .line 123
    :cond_1
    if-eqz p2, :cond_4

    .line 124
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/roidapp/photogrid/cloud/bg;

    if-nez v1, :cond_4

    move-object v3, v0

    .line 130
    :goto_1
    if-eqz v3, :cond_3

    .line 131
    :goto_2
    if-eqz v3, :cond_0

    .line 134
    if-eqz v3, :cond_2

    .line 135
    const v0, 0x7f0d00a4

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 136
    const v1, 0x7f0d00a5

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 137
    const v2, 0x7f0d00a6

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 139
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    .line 140
    const v4, 0x7f020165

    invoke-static {v0, v5, v4, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 141
    const v4, 0x7f020180

    invoke-static {v2, v5, v4, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 143
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/bg;->a:Lcom/roidapp/photogrid/cloud/bf;

    invoke-static {v4}, Lcom/roidapp/photogrid/cloud/bf;->b(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->a:Lcom/roidapp/photogrid/cloud/bf;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/bf;->b(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->b:Lcom/roidapp/photogrid/cloud/p;

    if-eqz v0, :cond_2

    .line 147
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->b:Lcom/roidapp/photogrid/cloud/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->b:Lcom/roidapp/photogrid/cloud/p;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/p;->b:I

    invoke-static {v1, v5, v0, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 149
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->b:Lcom/roidapp/photogrid/cloud/p;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/p;->a:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setId(I)V

    .line 150
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bg;->a:Lcom/roidapp/photogrid/cloud/bf;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/bf;->b(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    :cond_2
    invoke-virtual {v3, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v3

    .line 157
    goto :goto_0

    .line 130
    :cond_3
    const v1, 0x7f03001f

    invoke-virtual {p1, v1, p3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, p2

    goto :goto_1
.end method

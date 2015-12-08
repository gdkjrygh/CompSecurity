.class public final Lcom/roidapp/photogrid/release/la;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public a:Landroid/widget/ListView;

.field private b:Landroid/content/Context;

.field private c:[Ljava/lang/String;

.field private d:[Ljava/lang/Integer;

.field private e:[Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:I

.field private i:Lcom/roidapp/photogrid/release/kp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;Lcom/roidapp/photogrid/release/kp;)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 33
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/la;->f:I

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/la;->g:Z

    .line 44
    iput-object p1, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lcom/roidapp/photogrid/release/la;->a:Landroid/widget/ListView;

    .line 46
    iput-object p3, p0, Lcom/roidapp/photogrid/release/la;->c:[Ljava/lang/String;

    .line 47
    iput-object p4, p0, Lcom/roidapp/photogrid/release/la;->d:[Ljava/lang/Integer;

    .line 48
    iput-object p5, p0, Lcom/roidapp/photogrid/release/la;->e:[Ljava/lang/String;

    .line 49
    iput-object p6, p0, Lcom/roidapp/photogrid/release/la;->i:Lcom/roidapp/photogrid/release/kp;

    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->c:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/roidapp/photogrid/release/la;->h:I

    .line 53
    return-void
.end method


# virtual methods
.method protected final a(IZ)V
    .locals 0

    .prologue
    .line 225
    iput p1, p0, Lcom/roidapp/photogrid/release/la;->f:I

    .line 226
    if-eqz p2, :cond_0

    .line 227
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/la;->notifyDataSetChanged()V

    .line 229
    :cond_0
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 99
    iget v0, p0, Lcom/roidapp/photogrid/release/la;->h:I

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 104
    iput p1, p0, Lcom/roidapp/photogrid/release/la;->f:I

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->c:[Ljava/lang/String;

    add-int/lit8 v1, p1, -0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 111
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 116
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/la;->g:Z

    if-eqz v0, :cond_0

    .line 117
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 118
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    :goto_0
    return-object v1

    .line 122
    :cond_0
    if-nez p2, :cond_1

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300d5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 129
    :goto_1
    if-nez v0, :cond_5

    .line 130
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 131
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 133
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300d5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_1
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 145
    :goto_2
    new-instance v2, Lcom/roidapp/photogrid/release/lb;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lb;-><init>()V

    .line 146
    const v0, 0x7f0d0382

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/lb;->a:Landroid/widget/TextView;

    .line 147
    const v0, 0x7f0d0381

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/lb;->b:Landroid/widget/TextView;

    .line 148
    const v0, 0x7f0d0380

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/GridImageView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    .line 149
    const v0, 0x7f0d0383

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/lb;->e:Landroid/widget/TextView;

    .line 151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f090156

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 152
    iget-object v3, v2, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v3, v0, v0}, Lcom/roidapp/photogrid/release/GridImageView;->a(II)V

    .line 153
    iget-object v0, v2, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/GridImageView;->a(I)V

    .line 154
    const v0, 0x7f0d037f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/roidapp/photogrid/release/lb;->d:Landroid/view/View;

    .line 155
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v2

    .line 161
    :goto_3
    iget v2, p0, Lcom/roidapp/photogrid/release/la;->f:I

    if-ne p1, v2, :cond_2

    .line 162
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->d:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 172
    :goto_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/la;->getCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne p1, v2, :cond_3

    .line 173
    iget-object v0, v0, Lcom/roidapp/photogrid/release/lb;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 126
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 127
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 135
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 136
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/la;->g:Z

    .line 137
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    .line 139
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/la;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 140
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 157
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lb;

    move-object v1, p2

    goto :goto_3

    .line 164
    :cond_2
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->d:Landroid/view/View;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 175
    :cond_3
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 177
    packed-switch p1, :pswitch_data_0

    .line 191
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->a:Landroid/widget/TextView;

    add-int/lit8 v3, p1, -0x2

    .line 1210
    iget-object v4, p0, Lcom/roidapp/photogrid/release/la;->c:[Ljava/lang/String;

    aget-object v3, v4, v3

    .line 1212
    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    .line 1213
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 191
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    iget-object v2, p0, Lcom/roidapp/photogrid/release/la;->e:[Ljava/lang/String;

    add-int/lit8 v3, p1, -0x2

    aget-object v2, v2, v3

    .line 193
    iget-object v3, v0, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/GridImageView;->setTag(Ljava/lang/Object;)V

    .line 194
    if-eqz v2, :cond_4

    .line 195
    iget-object v3, p0, Lcom/roidapp/photogrid/release/la;->i:Lcom/roidapp/photogrid/release/kp;

    iget-object v4, v0, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v3, v2, v4, v5, v5}, Lcom/roidapp/photogrid/release/kp;->a(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    .line 199
    :cond_4
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 200
    iget-object v0, v0, Lcom/roidapp/photogrid/release/lb;->b:Landroid/widget/TextView;

    add-int/lit8 v2, p1, -0x2

    .line 1221
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/photogrid/release/la;->d:[Ljava/lang/Integer;

    aget-object v2, v4, v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 200
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 179
    :pswitch_0
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->a:Landroid/widget/TextView;

    const v3, 0x7f070105

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 180
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    iget-object v2, p0, Lcom/roidapp/photogrid/release/la;->i:Lcom/roidapp/photogrid/release/kp;

    const-string v3, "2130838565"

    iget-object v0, v0, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, v3, v0, v5, v4}, Lcom/roidapp/photogrid/release/kp;->a(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    goto/16 :goto_0

    .line 185
    :pswitch_1
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->a:Landroid/widget/TextView;

    const v3, 0x7f0702eb

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 186
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lb;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    iget-object v2, p0, Lcom/roidapp/photogrid/release/la;->i:Lcom/roidapp/photogrid/release/kp;

    const-string v3, "2130838566"

    iget-object v0, v0, Lcom/roidapp/photogrid/release/lb;->c:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, v3, v0, v5, v4}, Lcom/roidapp/photogrid/release/kp;->a(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    goto/16 :goto_0

    :cond_5
    move-object v1, v0

    goto/16 :goto_2

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

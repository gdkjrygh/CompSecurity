.class public final Lcom/roidapp/photogrid/video/g;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:I

.field private d:Lcom/roidapp/photogrid/video/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/video/f;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 20
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 16
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/g;->b:Z

    .line 17
    iput v0, p0, Lcom/roidapp/photogrid/video/g;->c:I

    .line 21
    iput-object p1, p0, Lcom/roidapp/photogrid/video/g;->a:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/roidapp/photogrid/video/g;->d:Lcom/roidapp/photogrid/video/f;

    .line 23
    return-void
.end method


# virtual methods
.method protected final a(I)V
    .locals 0

    .prologue
    .line 107
    iput p1, p0, Lcom/roidapp/photogrid/video/g;->c:I

    .line 109
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/g;->notifyDataSetChanged()V

    .line 111
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/video/g;->d:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->a()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    iput p1, p0, Lcom/roidapp/photogrid/video/g;->c:I

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/video/g;->d:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0, p1}, Lcom/roidapp/photogrid/video/f;->a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 42
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 49
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/g;->b:Z

    if-eqz v0, :cond_0

    .line 50
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/g;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 51
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    :goto_0
    return-object v1

    .line 55
    :cond_0
    if-nez p2, :cond_1

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/g;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0300ec

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 62
    :goto_1
    if-nez v0, :cond_5

    .line 63
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 64
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 66
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/g;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300ec

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    :try_end_1
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 78
    :goto_2
    new-instance v2, Lcom/roidapp/photogrid/video/h;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/h;-><init>(Lcom/roidapp/photogrid/video/g;)V

    .line 79
    const v0, 0x7f0d03bc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/video/h;->a:Landroid/widget/TextView;

    .line 80
    const v0, 0x7f0d022c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/video/h;->c:Landroid/widget/TextView;

    .line 81
    const v0, 0x7f0d03be

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/roidapp/photogrid/video/h;->b:Landroid/view/View;

    .line 82
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v2

    .line 86
    :goto_3
    iget v2, p0, Lcom/roidapp/photogrid/video/g;->c:I

    if-ne p1, v2, :cond_2

    .line 87
    iget-object v2, v0, Lcom/roidapp/photogrid/video/h;->b:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 92
    :goto_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/g;->getCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne p1, v2, :cond_3

    .line 93
    iget-object v0, v0, Lcom/roidapp/photogrid/video/h;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    move-object v0, v1

    .line 60
    goto :goto_1

    .line 68
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/g;->b:Z

    .line 71
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/g;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    .line 73
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/g;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 74
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 84
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/h;

    move-object v1, p2

    goto :goto_3

    .line 89
    :cond_2
    iget-object v2, v0, Lcom/roidapp/photogrid/video/h;->b:Landroid/view/View;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 95
    :cond_3
    iget-object v2, v0, Lcom/roidapp/photogrid/video/h;->c:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 96
    iget-object v2, p0, Lcom/roidapp/photogrid/video/g;->d:Lcom/roidapp/photogrid/video/f;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/video/g;->d:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v2, p1}, Lcom/roidapp/photogrid/video/f;->a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 97
    iget-object v0, v0, Lcom/roidapp/photogrid/video/h;->a:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/g;->d:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v2, p1}, Lcom/roidapp/photogrid/video/f;->a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 99
    :cond_4
    iget-object v0, v0, Lcom/roidapp/photogrid/video/h;->a:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_5
    move-object v1, v0

    goto/16 :goto_2
.end method

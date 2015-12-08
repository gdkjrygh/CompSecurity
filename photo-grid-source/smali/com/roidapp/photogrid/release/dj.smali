.class public final Lcom/roidapp/photogrid/release/dj;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/dj;->d:Z

    .line 34
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 80
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dj;->d:Z

    return v0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 28
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 29
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 30
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const v3, 0x7f0d028d

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 2113
    :cond_0
    :goto_0
    return-void

    .line 1120
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2106
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentEditTip"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2110
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dj;->e:Z

    if-eqz v0, :cond_3

    .line 2111
    new-instance v0, Lcom/roidapp/photogrid/release/dc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/dc;-><init>()V

    .line 2112
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentGridEdit"

    invoke-virtual {v1, v3, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 1123
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    goto :goto_1

    .line 2114
    :cond_3
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 2115
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dj;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBottomMain"

    invoke-virtual {v1, v3, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 70
    :pswitch_data_0
    .packed-switch 0x7f0d0233
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 43
    const v0, 0x7f030091

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1050
    const v0, 0x7f0d0233

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dj;->a:Landroid/widget/ImageView;

    .line 1051
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1052
    const v0, 0x7f0d01b7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dj;->b:Landroid/widget/TextView;

    .line 1053
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dj;->e:Z

    if-eqz v0, :cond_1

    .line 1054
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->b:Landroid/widget/TextView;

    const v2, 0x7f070182

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 1055
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->a:Landroid/widget/ImageView;

    const v2, 0x7f0200b8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1056
    const v0, 0x7f020074

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 45
    :cond_0
    :goto_0
    return-object v1

    .line 1057
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dj;->d:Z

    if-eqz v0, :cond_0

    .line 1058
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->a:Landroid/widget/ImageView;

    const v2, 0x7f0200ba

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1059
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    .line 1060
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->b:Landroid/widget/TextView;

    const v2, 0x7f07017a

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 1064
    :goto_1
    const v0, 0x7f0200a6

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 1062
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dj;->b:Landroid/widget/TextView;

    const v2, 0x7f070183

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1
.end method

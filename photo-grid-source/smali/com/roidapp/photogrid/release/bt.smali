.class public final Lcom/roidapp/photogrid/release/bt;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Lcom/roidapp/photogrid/release/ra;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 22
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 23
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 24
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const v2, -0xb6973c

    const/4 v1, 0x0

    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 63
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 65
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->c:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->p()Landroid/text/Layout$Alignment;

    move-result-object v0

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    if-eq v0, v1, :cond_0

    .line 69
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/text/Layout$Alignment;)V

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0

    .line 74
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->d:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->p()Landroid/text/Layout$Alignment;

    move-result-object v0

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    if-eq v0, v1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/text/Layout$Alignment;)V

    .line 79
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0

    .line 83
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->p()Landroid/text/Layout$Alignment;

    move-result-object v0

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    if-eq v0, v1, :cond_0

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/text/Layout$Alignment;)V

    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_0

    .line 63
    :pswitch_data_0
    .packed-switch 0x7f0d0282
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const v3, -0xb6973c

    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 31
    instance-of v2, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    :goto_0
    iput-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    if-nez v0, :cond_1

    .line 54
    :goto_1
    return-object v1

    :cond_0
    move-object v0, v1

    .line 31
    goto :goto_0

    .line 36
    :cond_1
    const v0, 0x7f0300a6

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 37
    const v0, 0x7f0d0282

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bt;->c:Landroid/view/View;

    .line 38
    const v0, 0x7f0d0283

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bt;->d:Landroid/view/View;

    .line 39
    const v0, 0x7f0d0284

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bt;->e:Landroid/view/View;

    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->p()Landroid/text/Layout$Alignment;

    move-result-object v0

    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    if-ne v0, v2, :cond_3

    .line 42
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 51
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->d:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->e:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 44
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->p()Landroid/text/Layout$Alignment;

    move-result-object v0

    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    if-ne v0, v2, :cond_4

    .line 45
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->d:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    .line 47
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->b:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->p()Landroid/text/Layout$Alignment;

    move-result-object v0

    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    if-ne v0, v2, :cond_2

    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bt;->e:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2
.end method

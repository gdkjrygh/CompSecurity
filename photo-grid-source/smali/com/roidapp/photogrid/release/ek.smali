.class final Lcom/roidapp/photogrid/release/ek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/l;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ej;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ej;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 106
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 2

    .prologue
    .line 121
    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v0

    if-nez v0, :cond_2

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 135
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ad()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 136
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ad()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 138
    :cond_0
    invoke-interface {p1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->d(Lcom/roidapp/photogrid/release/ej;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->d(Lcom/roidapp/photogrid/release/ej;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ej;->c(Lcom/roidapp/photogrid/release/ej;)I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V

    .line 142
    :cond_1
    return-void

    .line 124
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/SeekBar;->isShown()Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 127
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ac()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 128
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v0

    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->b(Lcom/roidapp/photogrid/release/ej;)I

    .line 133
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ej;->c(Lcom/roidapp/photogrid/release/ej;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 110
    if-eqz p1, :cond_0

    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 117
    :goto_0
    return-void

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->b(Lcom/roidapp/photogrid/release/ej;)I

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ej;->a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ek;->a:Lcom/roidapp/photogrid/release/ej;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ej;->c(Lcom/roidapp/photogrid/release/ej;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0
.end method

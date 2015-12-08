.class public final Lcom/roidapp/photogrid/cloud/a/p;
.super Lcom/roidapp/photogrid/cloud/a/w;
.source "SourceFile"


# instance fields
.field private j:Z

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;ZZ)V
    .locals 6

    .prologue
    const v5, 0x7f0702ea

    const v4, 0x7f070128

    const v3, 0x7f0204e1

    const/4 v2, 0x1

    .line 17
    invoke-direct {p0, p1, v2, p2}, Lcom/roidapp/photogrid/cloud/a/w;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 18
    iput-boolean p3, p0, Lcom/roidapp/photogrid/cloud/a/p;->j:Z

    .line 19
    iput-boolean p4, p0, Lcom/roidapp/photogrid/cloud/a/p;->k:Z

    .line 1024
    const v0, 0x7f0702f9

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->h:I

    .line 1025
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 1026
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->j:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->k:Z

    if-nez v0, :cond_6

    .line 1029
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->j:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->k:Z

    if-eqz v0, :cond_2

    .line 1030
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->d:Landroid/content/Context;

    const-string v1, "Cloud/share/finish/filter"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1032
    iput v3, p0, Lcom/roidapp/photogrid/cloud/a/p;->a:I

    .line 1033
    iput v4, p0, Lcom/roidapp/photogrid/cloud/a/p;->g:I

    .line 1034
    iput v5, p0, Lcom/roidapp/photogrid/cloud/a/p;->b:I

    .line 1062
    :cond_1
    :goto_0
    return-void

    .line 1036
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->j:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->k:Z

    if-nez v0, :cond_4

    .line 1037
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/p;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/c;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1038
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->d:Landroid/content/Context;

    const-string v1, "Cloud/share/finish/retouch"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1040
    const v0, 0x7f0204e2

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->a:I

    .line 1041
    const v0, 0x7f07012a

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->g:I

    .line 1042
    const v0, 0x7f0702ef

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->b:I

    goto :goto_0

    .line 1045
    :cond_3
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/a/p;->f:Z

    goto :goto_0

    .line 1049
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->j:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->k:Z

    if-nez v0, :cond_1

    .line 1050
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->d:Landroid/content/Context;

    const-string v1, "Cloud/share/finish/filter"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1052
    iput v3, p0, Lcom/roidapp/photogrid/cloud/a/p;->a:I

    .line 1053
    iput v4, p0, Lcom/roidapp/photogrid/cloud/a/p;->g:I

    .line 1054
    iput v5, p0, Lcom/roidapp/photogrid/cloud/a/p;->b:I

    goto :goto_0

    .line 1057
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_6

    .line 1058
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->d:Landroid/content/Context;

    const-string v1, "Cloud/share/finish/template"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1060
    const v0, 0x7f0205cf

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->a:I

    .line 1061
    const v0, 0x7f07012c

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->g:I

    .line 1062
    const v0, 0x7f0702f0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/p;->b:I

    goto :goto_0

    .line 1065
    :cond_6
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/a/p;->f:Z

    goto :goto_0
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 11
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/w;->a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

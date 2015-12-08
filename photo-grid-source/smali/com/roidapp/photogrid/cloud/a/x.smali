.class public final Lcom/roidapp/photogrid/cloud/a/x;
.super Lcom/roidapp/photogrid/cloud/a/w;
.source "SourceFile"


# instance fields
.field private j:Landroid/app/Activity;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/roidapp/photogrid/cloud/a/t;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x7

    invoke-direct {p0, p1, v2, p2}, Lcom/roidapp/photogrid/cloud/a/w;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 24
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/x;->j:Landroid/app/Activity;

    .line 1031
    const v2, 0x7f0203f0

    iput v2, p0, Lcom/roidapp/photogrid/cloud/a/x;->a:I

    .line 1032
    const v2, 0x7f07014d

    iput v2, p0, Lcom/roidapp/photogrid/cloud/a/x;->b:I

    .line 1033
    const v2, 0x7f07025a

    iput v2, p0, Lcom/roidapp/photogrid/cloud/a/x;->g:I

    .line 1034
    const v2, 0x7f07025b

    iput v2, p0, Lcom/roidapp/photogrid/cloud/a/x;->h:I

    .line 1035
    const v2, 0x7f070255

    iput v2, p0, Lcom/roidapp/photogrid/cloud/a/x;->i:I

    .line 1040
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 1041
    const-string v3, "REGISTER_COUNT"

    const/4 v4, -0x3

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 1044
    if-lt v2, v5, :cond_0

    .line 1046
    if-lt v2, v5, :cond_0

    move v2, v1

    .line 26
    :goto_0
    if-nez v2, :cond_1

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/x;->f:Z

    .line 27
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/a/x;->k:Ljava/lang/String;

    .line 28
    return-void

    :cond_0
    move v2, v0

    .line 1049
    goto :goto_0

    :cond_1
    move v0, v1

    .line 26
    goto :goto_1
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 19
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/w;->a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 55
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/x;->j:Landroid/app/Activity;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 71
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 58
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/x;->j:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/x;->j:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "REGISTER_COUNT"

    const/4 v2, -0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "IS_RATE"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 61
    new-instance v0, Lcom/roidapp/photogrid/common/o;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/x;->j:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->b()V

    goto :goto_0

    .line 65
    :pswitch_2
    new-instance v0, Lcom/roidapp/photogrid/common/ap;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/ap;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/x;->j:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/common/ap;->b(Landroid/app/Activity;)V

    goto :goto_0

    .line 56
    :pswitch_data_0
    .packed-switch 0x7f0d0082
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

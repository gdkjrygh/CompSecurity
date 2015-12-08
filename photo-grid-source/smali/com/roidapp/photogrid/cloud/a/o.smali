.class public final Lcom/roidapp/photogrid/cloud/a/o;
.super Lcom/roidapp/photogrid/cloud/a/w;
.source "SourceFile"


# instance fields
.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 8

    .prologue
    const v1, 0x7f0702ee

    const v2, 0x7f0702e9

    .line 17
    const/4 v0, 0x6

    invoke-direct {p0, p1, v0, p2}, Lcom/roidapp/photogrid/cloud/a/w;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 1022
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v4, v6

    if-gez v0, :cond_0

    const/4 v0, 0x1

    move v3, v0

    .line 1024
    :goto_0
    if-eqz v3, :cond_1

    const v0, 0x7f020274

    :goto_1
    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/o;->a:I

    .line 1025
    if-eqz v3, :cond_2

    move v0, v1

    :goto_2
    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/o;->b:I

    .line 1026
    if-eqz v3, :cond_3

    const v0, 0x7f070129

    :goto_3
    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/o;->g:I

    .line 1027
    if-eqz v3, :cond_4

    :goto_4
    iput v1, p0, Lcom/roidapp/photogrid/cloud/a/o;->h:I

    .line 1029
    if-eqz v3, :cond_5

    const-string v0, "http://instagram.com/photogridorg"

    :goto_5
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/o;->j:Ljava/lang/String;

    .line 19
    return-void

    .line 1022
    :cond_0
    const/4 v0, 0x0

    move v3, v0

    goto :goto_0

    .line 1024
    :cond_1
    const v0, 0x7f020273

    goto :goto_1

    :cond_2
    move v0, v2

    .line 1025
    goto :goto_2

    .line 1026
    :cond_3
    const v0, 0x7f070127

    goto :goto_3

    :cond_4
    move v1, v2

    .line 1027
    goto :goto_4

    .line 1029
    :cond_5
    const-string v0, "https://m.facebook.com/photogridorg"

    goto :goto_5
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 12
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/w;->a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/o;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/o;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 35
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/o;->j:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 36
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 38
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/o;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/a/w;->onClick(Landroid/view/View;)V

    .line 44
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

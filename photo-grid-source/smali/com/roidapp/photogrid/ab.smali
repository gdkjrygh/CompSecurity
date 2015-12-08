.class final Lcom/roidapp/photogrid/ab;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 1887
    iput-object p1, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 1928
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 10

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    .line 1887
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/c;

    .line 2890
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/c;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2891
    :cond_0
    :goto_0
    return-void

    .line 2893
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2894
    const-string v1, "notification_fresh_time"

    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    move v1, v2

    move v3, v2

    .line 2896
    :goto_1
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/c;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 2897
    invoke-virtual {p1, v1}, Lcom/roidapp/cloudlib/sns/b/a/c;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    .line 2898
    iget-wide v8, v0, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    cmp-long v0, v8, v6

    if-lez v0, :cond_2

    .line 2899
    add-int/lit8 v3, v3, 0x1

    .line 2896
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 2902
    :cond_3
    if-lez v3, :cond_5

    .line 2903
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->z(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/cloudlib/sns/notification/p;

    move-result-object v0

    if-nez v0, :cond_4

    .line 2904
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/p;

    iget-object v6, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v1, v6}, Lcom/roidapp/cloudlib/sns/notification/p;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Lcom/roidapp/cloudlib/sns/notification/p;)Lcom/roidapp/cloudlib/sns/notification/p;

    .line 2905
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->A(Lcom/roidapp/photogrid/MainPage;)V

    .line 2906
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->B(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2907
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->z(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/cloudlib/sns/notification/p;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v1}, Lcom/roidapp/photogrid/MainPage;->B(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/sns/notification/p;->a(Landroid/view/View;I)V

    .line 2911
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->C(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2912
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    sget v1, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v1}, Lcom/roidapp/photogrid/MainPage;->D(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v1

    if-eq v0, v1, :cond_5

    .line 2913
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->C(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2917
    :cond_5
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/c;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    move-wide v0, v4

    .line 2922
    :goto_3
    iget-object v2, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v2, v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;J)V

    goto/16 :goto_0

    .line 2909
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/ab;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->z(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/cloudlib/sns/notification/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/p;->a()V

    goto :goto_2

    .line 2920
    :cond_7
    invoke-virtual {p1, v2}, Lcom/roidapp/cloudlib/sns/b/a/c;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    goto :goto_3
.end method

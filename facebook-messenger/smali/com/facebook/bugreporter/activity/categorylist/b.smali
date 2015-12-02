.class public Lcom/facebook/bugreporter/activity/categorylist/b;
.super Landroid/widget/BaseAdapter;
.source "CategoryListAdapter.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->a:Landroid/content/Context;

    .line 27
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    .line 49
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 35
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    .line 36
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/categorylist/b;->notifyDataSetChanged()V

    .line 37
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/categorylist/b;->a(I)Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    iget-wide v0, v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->b:J

    .line 57
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 67
    check-cast p2, Lcom/facebook/bugreporter/activity/categorylist/d;

    .line 69
    const-string v1, "listview index is valid"

    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-gt p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Lcom/facebook/debug/b/a;->b(Ljava/lang/String;Z)V

    .line 71
    if-nez p2, :cond_0

    .line 72
    new-instance p2, Lcom/facebook/bugreporter/activity/categorylist/d;

    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/b;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/bugreporter/activity/categorylist/d;-><init>(Landroid/content/Context;)V

    .line 75
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/categorylist/b;->a(I)Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/bugreporter/activity/categorylist/d;->setCategoryInfo(Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;)V

    .line 76
    return-object p2

    .line 69
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x1

    return v0
.end method

.class public Lcom/facebook/bugreporter/activity/tasklist/b;
.super Landroid/widget/BaseAdapter;
.source "TaskListAdapter.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/b;

    sput-object v0, Lcom/facebook/bugreporter/activity/tasklist/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 26
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    .line 29
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->b:Landroid/content/Context;

    .line 30
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/bugreporter/activity/tasklist/Task;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/tasklist/Task;

    .line 50
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    .line 37
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/b;->notifyDataSetChanged()V

    .line 38
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/b;->a(I)Lcom/facebook/bugreporter/activity/tasklist/Task;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/tasklist/Task;

    iget-object v0, v0, Lcom/facebook/bugreporter/activity/tasklist/Task;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 58
    :goto_0
    return-wide v0

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 69
    check-cast p2, Lcom/facebook/bugreporter/activity/tasklist/i;

    .line 71
    const-string v1, "index is a list index"

    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Lcom/facebook/debug/b/a;->b(Ljava/lang/String;Z)V

    .line 74
    if-nez p2, :cond_0

    .line 75
    new-instance p2, Lcom/facebook/bugreporter/activity/tasklist/i;

    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/b;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/bugreporter/activity/tasklist/i;-><init>(Landroid/content/Context;)V

    .line 77
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/b;->a(I)Lcom/facebook/bugreporter/activity/tasklist/Task;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/bugreporter/activity/tasklist/i;->setTask(Lcom/facebook/bugreporter/activity/tasklist/Task;)V

    .line 78
    return-object p2

    .line 71
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x1

    return v0
.end method

.class public Lcom/facebook/widget/listview/i;
.super Ljava/lang/Object;
.source "FbListItemViewPoolManager.java"


# static fields
.field private static a:I


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/widget/listview/h;",
            ">;",
            "Lcom/google/common/a/au",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/widget/listview/j;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x6

    sput v0, Lcom/facebook/widget/listview/i;->a:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;Ljava/lang/Integer;I)Landroid/view/View;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/widget/listview/h;",
            ">;",
            "Ljava/lang/Integer;",
            "I)",
            "Landroid/view/View;"
        }
    .end annotation

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/widget/listview/i;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/au;

    .line 129
    if-eqz v0, :cond_2

    .line 130
    invoke-virtual {v0, p2}, Lcom/google/common/a/au;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 134
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 135
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/j;

    .line 136
    invoke-static {v0}, Lcom/facebook/widget/listview/j;->a(Lcom/facebook/widget/listview/j;)I

    move-result v0

    if-ne v0, p3, :cond_0

    .line 137
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/j;

    invoke-static {v0}, Lcom/facebook/widget/listview/j;->b(Lcom/facebook/widget/listview/j;)Landroid/view/View;

    move-result-object v0

    .line 147
    :goto_1
    return-object v0

    .line 134
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 142
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 143
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/j;

    invoke-static {v0}, Lcom/facebook/widget/listview/j;->b(Lcom/facebook/widget/listview/j;)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    .line 147
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

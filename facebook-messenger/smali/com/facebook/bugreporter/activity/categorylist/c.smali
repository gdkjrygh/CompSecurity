.class Lcom/facebook/bugreporter/activity/categorylist/c;
.super Ljava/lang/Object;
.source "CategoryListFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/categorylist/c;->a:Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/c;->a:Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;

    invoke-static {v0, p3}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->a(Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;I)V

    .line 78
    return-void
.end method

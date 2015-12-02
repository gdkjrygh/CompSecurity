.class Lcom/facebook/bugreporter/activity/tasklist/g;
.super Ljava/lang/Object;
.source "TaskListFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/g;->a:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

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
    .line 98
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/g;->a:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    invoke-static {v0, p3}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;I)V

    .line 99
    return-void
.end method

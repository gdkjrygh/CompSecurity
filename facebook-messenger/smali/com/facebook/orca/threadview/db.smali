.class Lcom/facebook/orca/threadview/db;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/facebook/orca/threadview/db;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    .line 340
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    .line 341
    instance-of v1, v0, Lcom/facebook/orca/threadview/ac;

    if-eqz v1, :cond_0

    .line 342
    iget-object v1, p0, Lcom/facebook/orca/threadview/db;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    check-cast v0, Lcom/facebook/orca/threadview/ac;

    invoke-static {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;)V

    .line 344
    :cond_0
    return-void
.end method

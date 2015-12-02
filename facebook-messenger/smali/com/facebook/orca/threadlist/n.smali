.class Lcom/facebook/orca/threadlist/n;
.super Ljava/lang/Object;
.source "ThreadChooserDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/m;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/m;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/orca/threadlist/n;->a:Lcom/facebook/orca/threadlist/m;

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
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/threadlist/n;->a:Lcom/facebook/orca/threadlist/m;

    invoke-static {v0, p3}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/orca/threadlist/m;I)V

    .line 94
    return-void
.end method

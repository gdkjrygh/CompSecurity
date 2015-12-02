.class Lcom/facebook/orca/threadview/bo;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threads/ThreadSummary;

.field final synthetic b:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 1977
    iput-object p1, p0, Lcom/facebook/orca/threadview/bo;->b:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iput-object p2, p0, Lcom/facebook/orca/threadview/bo;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1979
    iget-object v0, p0, Lcom/facebook/orca/threadview/bo;->b:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/bo;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1980
    return-void
.end method

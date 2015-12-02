.class Lcom/facebook/orca/threadlist/am;
.super Ljava/lang/Object;
.source "ThreadListEmptyView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/facebook/orca/threadlist/am;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/threadlist/am;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a()V

    .line 93
    return-void
.end method

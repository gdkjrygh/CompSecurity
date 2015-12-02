.class Lcom/facebook/reflex/l;
.super Landroid/support/v4/app/bb;
.source "FragmentReflexActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/reflex/j;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/j;Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/facebook/reflex/l;->a:Lcom/facebook/reflex/j;

    invoke-direct {p0, p2}, Landroid/support/v4/app/bb;-><init>(Landroid/view/ViewGroup;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/reflex/l;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/j;->a(Landroid/support/v4/app/Fragment;)V

    .line 135
    return-void
.end method

.method public a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/reflex/l;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/reflex/j;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 140
    return-void
.end method

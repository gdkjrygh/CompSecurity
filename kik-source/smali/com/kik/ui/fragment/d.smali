.class final Lcom/kik/ui/fragment/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Z

.field final synthetic c:Lcom/kik/ui/fragment/FragmentBase;


# direct methods
.method constructor <init>(Lcom/kik/ui/fragment/FragmentBase;Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 312
    iput-object p1, p0, Lcom/kik/ui/fragment/d;->c:Lcom/kik/ui/fragment/FragmentBase;

    iput-object p2, p0, Lcom/kik/ui/fragment/d;->a:Landroid/view/View;

    iput-boolean p3, p0, Lcom/kik/ui/fragment/d;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 316
    iget-object v0, p0, Lcom/kik/ui/fragment/d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 317
    iget-object v0, p0, Lcom/kik/ui/fragment/d;->c:Lcom/kik/ui/fragment/FragmentBase;

    iget-object v1, v0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    iget-object v2, p0, Lcom/kik/ui/fragment/d;->a:Landroid/view/View;

    iget-boolean v0, p0, Lcom/kik/ui/fragment/d;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 318
    return-void

    .line 317
    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

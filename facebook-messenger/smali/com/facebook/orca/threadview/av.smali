.class Lcom/facebook/orca/threadview/av;
.super Ljava/lang/Object;
.source "ThreadNamePicker.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/as;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/as;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/orca/threadview/av;->a:Lcom/facebook/orca/threadview/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadview/av;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->b(Lcom/facebook/orca/threadview/as;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/av;->a:Lcom/facebook/orca/threadview/as;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/as;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/threadview/av;->a:Lcom/facebook/orca/threadview/as;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/as;->dismiss()V

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/threadview/av;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->c(Lcom/facebook/orca/threadview/as;)Lcom/facebook/orca/threadview/aw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/threadview/av;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->c(Lcom/facebook/orca/threadview/as;)Lcom/facebook/orca/threadview/aw;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/ax;->CHANGE:Lcom/facebook/orca/threadview/ax;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/threadview/aw;->a(Lcom/facebook/orca/threadview/ax;Ljava/lang/String;)V

    .line 112
    :cond_0
    return-void
.end method

.class Lcom/facebook/orca/threadview/at;
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
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->a(Lcom/facebook/orca/threadview/as;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/as;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->thread_name_dialog_blank_error:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 87
    :cond_0
    :goto_0
    return-void

    .line 80
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->b(Lcom/facebook/orca/threadview/as;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/as;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/as;->dismiss()V

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->c(Lcom/facebook/orca/threadview/as;)Lcom/facebook/orca/threadview/aw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v0}, Lcom/facebook/orca/threadview/as;->d(Lcom/facebook/orca/threadview/as;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/facebook/orca/threadview/ax;->NO_CHANGE:Lcom/facebook/orca/threadview/ax;

    .line 85
    :goto_1
    iget-object v2, p0, Lcom/facebook/orca/threadview/at;->a:Lcom/facebook/orca/threadview/as;

    invoke-static {v2}, Lcom/facebook/orca/threadview/as;->c(Lcom/facebook/orca/threadview/as;)Lcom/facebook/orca/threadview/aw;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/threadview/aw;->a(Lcom/facebook/orca/threadview/ax;Ljava/lang/String;)V

    goto :goto_0

    .line 84
    :cond_2
    sget-object v0, Lcom/facebook/orca/threadview/ax;->CHANGE:Lcom/facebook/orca/threadview/ax;

    goto :goto_1
.end method

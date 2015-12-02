.class Lcom/facebook/orca/images/b;
.super Ljava/lang/Object;
.source "ImageSearchActivity.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/images/ImageSearchActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/images/ImageSearchActivity;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/facebook/orca/images/b;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 119
    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x42

    if-ne v1, v2, :cond_1

    .line 121
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/images/b;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v1}, Lcom/facebook/orca/images/ImageSearchActivity;->b(Lcom/facebook/orca/images/ImageSearchActivity;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/images/b;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v2}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Lcom/facebook/orca/images/ImageSearchActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/images/b;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v0}, Lcom/facebook/orca/images/ImageSearchActivity;->c(Lcom/facebook/orca/images/ImageSearchActivity;)V

    .line 123
    const/4 v0, 0x1

    .line 125
    :cond_1
    return v0
.end method

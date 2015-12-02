.class Lcom/facebook/orca/images/a;
.super Ljava/lang/Object;
.source "ImageSearchActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/images/ImageSearchActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/images/ImageSearchActivity;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/orca/images/a;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/orca/images/a;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(Lcom/facebook/orca/images/ImageSearchActivity;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/images/a;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v1}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Lcom/facebook/orca/images/ImageSearchActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/images/a;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v0}, Lcom/facebook/orca/images/ImageSearchActivity;->c(Lcom/facebook/orca/images/ImageSearchActivity;)V

    .line 113
    return-void
.end method

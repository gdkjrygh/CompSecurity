.class Lcom/facebook/contacts/picker/ay;
.super Ljava/lang/Object;
.source "SearchableContactPickerView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/as;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/as;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/facebook/contacts/picker/ay;->a:Lcom/facebook/contacts/picker/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/contacts/picker/ay;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/as;->d()V

    .line 155
    iget-object v0, p0, Lcom/facebook/contacts/picker/ay;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/as;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 157
    iget-object v1, p0, Lcom/facebook/contacts/picker/ay;->a:Lcom/facebook/contacts/picker/as;

    invoke-static {v1}, Lcom/facebook/contacts/picker/as;->b(Lcom/facebook/contacts/picker/as;)Landroid/widget/EditText;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 158
    return-void
.end method

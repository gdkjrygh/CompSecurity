.class Lcom/facebook/orca/contacts/picker/v;
.super Ljava/lang/Object;
.source "ContactPickerFragment.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

.field private b:Z


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .prologue
    .line 185
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/picker/v;->b:Z

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->b(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)Lcom/facebook/orca/contacts/picker/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/contacts/picker/p;->a(Landroid/text/Editable;)V

    .line 188
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->O()V

    .line 192
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->c(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)Lcom/facebook/orca/contacts/picker/z;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->c(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)Lcom/facebook/orca/contacts/picker/z;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/v;->a:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/ContactPickerFragment;)Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->enoughToFilter()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/contacts/picker/z;->a(Z)V

    .line 197
    :cond_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 171
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/picker/v;->b:Z

    .line 172
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 176
    if-le p3, p4, :cond_0

    .line 177
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/picker/v;->b:Z

    .line 181
    :goto_0
    return-void

    .line 179
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/picker/v;->b:Z

    goto :goto_0
.end method

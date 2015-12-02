.class Lcom/facebook/contacts/picker/av;
.super Ljava/lang/Object;
.source "SearchableContactPickerView.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/as;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/as;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/contacts/picker/av;->a:Lcom/facebook/contacts/picker/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/contacts/picker/av;->a:Lcom/facebook/contacts/picker/as;

    invoke-static {v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/as;)V

    .line 125
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 116
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 120
    return-void
.end method

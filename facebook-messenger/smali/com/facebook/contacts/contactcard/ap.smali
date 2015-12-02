.class Lcom/facebook/contacts/contactcard/ap;
.super Ljava/lang/Object;
.source "HiddenEntryPickerActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ap;->a:Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 99
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 100
    const-string v1, "entry_position"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 101
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ap;->a:Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->setResult(ILandroid/content/Intent;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ap;->a:Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->finish()V

    .line 103
    return-void
.end method

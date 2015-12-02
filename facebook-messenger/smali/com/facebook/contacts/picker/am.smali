.class Lcom/facebook/contacts/picker/am;
.super Ljava/lang/Object;
.source "ContactPickerView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/ak;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/ak;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/contacts/picker/am;->a:Lcom/facebook/contacts/picker/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
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
    .line 101
    iget-object v0, p0, Lcom/facebook/contacts/picker/am;->a:Lcom/facebook/contacts/picker/ak;

    invoke-static {v0, p3}, Lcom/facebook/contacts/picker/ak;->b(Lcom/facebook/contacts/picker/ak;I)V

    .line 102
    return-void
.end method

.class Lcom/facebook/orca/contacts/picker/g;
.super Ljava/lang/Object;
.source "ContactMultipickerFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/g;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

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
    .line 297
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/g;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-static {v0, p3}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;I)V

    .line 298
    return-void
.end method

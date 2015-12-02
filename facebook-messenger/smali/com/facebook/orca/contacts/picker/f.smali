.class Lcom/facebook/orca/contacts/picker/f;
.super Ljava/lang/Object;
.source "ContactMultipickerFragment.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V
    .locals 0

    .prologue
    .line 276
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/f;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 289
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 279
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/f;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->c(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->Q()V

    .line 282
    :cond_0
    return-void
.end method

.class Lcom/facebook/orca/contacts/picker/d;
.super Ljava/lang/Object;
.source "ContactMultipickerFragment.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/d;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/d;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-static {v0, p1, p2}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;Landroid/view/View;Landroid/view/View;)V

    .line 191
    return-void
.end method

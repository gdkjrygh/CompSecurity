.class Lcom/facebook/contacts/picker/au;
.super Ljava/lang/Object;
.source "SearchableContactPickerView.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/as;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/as;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/contacts/picker/au;->a:Lcom/facebook/contacts/picker/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/contacts/picker/au;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/contacts/picker/as;->a(Landroid/view/View;Z)V

    .line 111
    return-void
.end method

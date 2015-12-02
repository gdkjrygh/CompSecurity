.class Lcom/facebook/contacts/contactslist/c;
.super Ljava/lang/Object;
.source "ContactsListActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactslist/ContactsListActivity;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactslist/ContactsListActivity;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/contacts/contactslist/c;->a:Lcom/facebook/contacts/contactslist/ContactsListActivity;

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
    .line 45
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/c;->a:Lcom/facebook/contacts/contactslist/ContactsListActivity;

    invoke-static {v0, p3}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->a(Lcom/facebook/contacts/contactslist/ContactsListActivity;I)V

    .line 46
    return-void
.end method

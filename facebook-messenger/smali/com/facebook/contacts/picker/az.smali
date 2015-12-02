.class Lcom/facebook/contacts/picker/az;
.super Ljava/lang/Object;
.source "SearchableContactPickerView.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ap;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/ap;

.field final synthetic b:Lcom/facebook/contacts/picker/as;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/as;Lcom/facebook/contacts/picker/ap;)V
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/facebook/contacts/picker/az;->b:Lcom/facebook/contacts/picker/as;

    iput-object p2, p0, Lcom/facebook/contacts/picker/az;->a:Lcom/facebook/contacts/picker/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/facebook/contacts/picker/az;->a:Lcom/facebook/contacts/picker/ap;

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/ap;->a(I)V

    .line 213
    iget-object v0, p0, Lcom/facebook/contacts/picker/az;->b:Lcom/facebook/contacts/picker/as;

    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/as;I)V

    .line 214
    return-void
.end method

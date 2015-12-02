.class Lcom/facebook/contacts/picker/ax;
.super Ljava/lang/Object;
.source "SearchableContactPickerView.java"

# interfaces
.implements Lcom/facebook/widget/a/h;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/as;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/as;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/facebook/contacts/picker/ax;->a:Lcom/facebook/contacts/picker/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/contacts/picker/ax;->a:Lcom/facebook/contacts/picker/as;

    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/as;->b(Lcom/facebook/contacts/picker/as;I)V

    .line 143
    return-void
.end method

.method public a(Lcom/facebook/widget/a/j;)V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/contacts/picker/ax;->a:Lcom/facebook/contacts/picker/as;

    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/as;Lcom/facebook/widget/a/j;)V

    .line 148
    return-void
.end method

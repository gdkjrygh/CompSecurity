.class Lcom/facebook/contacts/picker/g;
.super Ljava/lang/Object;
.source "ContactPickerCascadingFilter.java"

# interfaces
.implements Lcom/facebook/contacts/picker/w;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/e;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/e;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/contacts/picker/g;->a:Lcom/facebook/contacts/picker/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/contacts/picker/g;->a:Lcom/facebook/contacts/picker/e;

    invoke-static {v0}, Lcom/facebook/contacts/picker/e;->b(Lcom/facebook/contacts/picker/e;)Lcom/facebook/contacts/picker/j;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/contacts/picker/j;->a(Lcom/facebook/contacts/picker/l;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/contacts/picker/g;->a:Lcom/facebook/contacts/picker/e;

    invoke-static {v0}, Lcom/facebook/contacts/picker/e;->a(Lcom/facebook/contacts/picker/e;)Lcom/facebook/contacts/picker/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->c()Lcom/facebook/widget/a/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    if-eq v0, v1, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/contacts/picker/g;->a:Lcom/facebook/contacts/picker/e;

    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/e;->a(Lcom/facebook/contacts/picker/e;Ljava/lang/CharSequence;)V

    .line 92
    :cond_0
    return-void
.end method

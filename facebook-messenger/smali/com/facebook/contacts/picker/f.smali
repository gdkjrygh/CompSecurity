.class Lcom/facebook/contacts/picker/f;
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
    .line 78
    iput-object p1, p0, Lcom/facebook/contacts/picker/f;->a:Lcom/facebook/contacts/picker/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/contacts/picker/f;->a:Lcom/facebook/contacts/picker/e;

    invoke-static {v0}, Lcom/facebook/contacts/picker/e;->a(Lcom/facebook/contacts/picker/e;)Lcom/facebook/contacts/picker/j;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/contacts/picker/j;->a(Lcom/facebook/contacts/picker/l;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/picker/f;->a:Lcom/facebook/contacts/picker/e;

    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/e;->a(Lcom/facebook/contacts/picker/e;Ljava/lang/CharSequence;)V

    .line 83
    return-void
.end method

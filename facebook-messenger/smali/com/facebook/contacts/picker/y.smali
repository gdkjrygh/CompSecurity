.class Lcom/facebook/contacts/picker/y;
.super Ljava/lang/Object;
.source "ContactPickerMergedFilter.java"

# interfaces
.implements Lcom/facebook/contacts/picker/w;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/ab;

.field final synthetic b:Lcom/facebook/contacts/picker/x;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/x;Lcom/facebook/contacts/picker/ab;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/facebook/contacts/picker/y;->b:Lcom/facebook/contacts/picker/x;

    iput-object p2, p0, Lcom/facebook/contacts/picker/y;->a:Lcom/facebook/contacts/picker/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/contacts/picker/y;->a:Lcom/facebook/contacts/picker/ab;

    invoke-virtual {v0, p2}, Lcom/facebook/contacts/picker/ab;->a(Lcom/facebook/contacts/picker/l;)V

    .line 127
    iget-object v0, p0, Lcom/facebook/contacts/picker/y;->b:Lcom/facebook/contacts/picker/x;

    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/x;->a(Lcom/facebook/contacts/picker/x;Ljava/lang/CharSequence;)V

    .line 128
    return-void
.end method

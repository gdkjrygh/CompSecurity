.class Lcom/facebook/contacts/picker/z;
.super Ljava/lang/Object;
.source "ContactPickerMergedFilter.java"

# interfaces
.implements Lcom/facebook/widget/a/h;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/ab;

.field final synthetic b:Lcom/facebook/contacts/picker/x;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/x;Lcom/facebook/contacts/picker/ab;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/facebook/contacts/picker/z;->b:Lcom/facebook/contacts/picker/x;

    iput-object p2, p0, Lcom/facebook/contacts/picker/z;->a:Lcom/facebook/contacts/picker/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 159
    return-void
.end method

.method public a(Lcom/facebook/widget/a/j;)V
    .locals 4

    .prologue
    .line 163
    invoke-static {}, Lcom/facebook/contacts/picker/x;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Received friends filtering state: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/facebook/contacts/picker/z;->a:Lcom/facebook/contacts/picker/ab;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/ab;->a(Lcom/facebook/widget/a/j;)V

    .line 165
    iget-object v0, p0, Lcom/facebook/contacts/picker/z;->b:Lcom/facebook/contacts/picker/x;

    invoke-static {v0}, Lcom/facebook/contacts/picker/x;->a(Lcom/facebook/contacts/picker/x;)V

    .line 166
    return-void
.end method

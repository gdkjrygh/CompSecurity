.class Lcom/facebook/contacts/picker/h;
.super Ljava/lang/Object;
.source "ContactPickerCascadingFilter.java"

# interfaces
.implements Lcom/facebook/widget/a/h;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/j;

.field final synthetic b:Lcom/facebook/contacts/picker/e;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/e;Lcom/facebook/contacts/picker/j;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/contacts/picker/h;->b:Lcom/facebook/contacts/picker/e;

    iput-object p2, p0, Lcom/facebook/contacts/picker/h;->a:Lcom/facebook/contacts/picker/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 123
    return-void
.end method

.method public a(Lcom/facebook/widget/a/j;)V
    .locals 5

    .prologue
    .line 127
    invoke-static {}, Lcom/facebook/contacts/picker/e;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Received filtering state: %s from: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/facebook/contacts/picker/h;->a:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v4}, Lcom/facebook/contacts/picker/j;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lcom/facebook/contacts/picker/h;->a:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/j;->a(Lcom/facebook/widget/a/j;)V

    .line 133
    iget-object v0, p0, Lcom/facebook/contacts/picker/h;->b:Lcom/facebook/contacts/picker/e;

    invoke-static {v0}, Lcom/facebook/contacts/picker/e;->c(Lcom/facebook/contacts/picker/e;)V

    .line 134
    return-void
.end method

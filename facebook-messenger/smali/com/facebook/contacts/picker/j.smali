.class Lcom/facebook/contacts/picker/j;
.super Ljava/lang/Object;
.source "ContactPickerCascadingFilter.java"


# instance fields
.field private final a:Lcom/facebook/contacts/picker/u;

.field private b:Lcom/facebook/contacts/picker/l;

.field private c:Lcom/facebook/widget/a/j;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/picker/u;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    sget-object v0, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    iput-object v0, p0, Lcom/facebook/contacts/picker/j;->c:Lcom/facebook/widget/a/j;

    .line 30
    iput-object p1, p0, Lcom/facebook/contacts/picker/j;->a:Lcom/facebook/contacts/picker/u;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/contacts/picker/j;->a:Lcom/facebook/contacts/picker/u;

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/picker/l;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/contacts/picker/j;->b:Lcom/facebook/contacts/picker/l;

    .line 39
    return-void
.end method

.method public a(Lcom/facebook/widget/a/j;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/contacts/picker/j;->c:Lcom/facebook/widget/a/j;

    .line 47
    return-void
.end method

.method public b()Lcom/facebook/contacts/picker/l;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/contacts/picker/j;->b:Lcom/facebook/contacts/picker/l;

    return-object v0
.end method

.method public c()Lcom/facebook/widget/a/j;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/contacts/picker/j;->c:Lcom/facebook/widget/a/j;

    return-object v0
.end method

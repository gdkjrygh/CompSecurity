.class Lcom/facebook/orca/contacts/picker/am;
.super Lcom/facebook/inject/d;
.source "ContactPickerListAdapterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/picker/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ak;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/ak;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/am;->a:Lcom/facebook/orca/contacts/picker/ak;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/ak;Lcom/facebook/orca/contacts/picker/al;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/am;-><init>(Lcom/facebook/orca/contacts/picker/ak;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/bc;
    .locals 5

    .prologue
    .line 44
    new-instance v3, Lcom/facebook/orca/contacts/picker/bc;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/contacts/picker/u;

    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/am;->a:Lcom/facebook/orca/contacts/picker/ak;

    invoke-static {v2}, Lcom/facebook/orca/contacts/picker/ak;->a(Lcom/facebook/orca/contacts/picker/ak;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/contacts/picker/am;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v1, Landroid/view/LayoutInflater;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    const-class v2, Lcom/facebook/user/i;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/picker/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/i;

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/facebook/orca/contacts/picker/bc;-><init>(Landroid/content/Context;Ljavax/inject/a;Landroid/view/LayoutInflater;Lcom/facebook/user/i;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/am;->a()Lcom/facebook/orca/contacts/picker/bc;

    move-result-object v0

    return-object v0
.end method

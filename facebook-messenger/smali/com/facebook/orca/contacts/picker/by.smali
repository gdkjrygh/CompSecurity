.class Lcom/facebook/orca/contacts/picker/by;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/favorites/aa;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 319
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/by;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 319
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/by;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/favorites/aa;
    .locals 4

    .prologue
    .line 324
    new-instance v2, Lcom/facebook/orca/contacts/favorites/aa;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/by;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/contacts/picker/u;

    const-class v3, Lcom/facebook/orca/annotations/ForFavoritePickerList;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/orca/contacts/picker/by;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v1, Landroid/view/LayoutInflater;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/by;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    invoke-direct {v2, v0, v3, v1}, Lcom/facebook/orca/contacts/favorites/aa;-><init>(Landroid/content/Context;Ljavax/inject/a;Landroid/view/LayoutInflater;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 319
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/by;->a()Lcom/facebook/orca/contacts/favorites/aa;

    move-result-object v0

    return-object v0
.end method

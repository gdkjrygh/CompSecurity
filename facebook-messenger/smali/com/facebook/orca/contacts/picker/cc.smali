.class Lcom/facebook/orca/contacts/picker/cc;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/picker/bg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 389
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/cc;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 389
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/cc;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/bg;
    .locals 4

    .prologue
    .line 394
    new-instance v1, Lcom/facebook/orca/contacts/picker/bg;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/cc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/ShouldShowInviteAllContacts;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/contacts/picker/cc;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/contacts/picker/bg;-><init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 389
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/cc;->a()Lcom/facebook/orca/contacts/picker/bg;

    move-result-object v0

    return-object v0
.end method

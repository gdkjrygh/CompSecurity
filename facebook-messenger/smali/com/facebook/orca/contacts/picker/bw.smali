.class Lcom/facebook/orca/contacts/picker/bw;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/ap;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 433
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 433
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/bw;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/ap;
    .locals 7

    .prologue
    .line 438
    new-instance v0, Lcom/facebook/orca/contacts/divebar/ap;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/contacts/annotations/IsChatContextEnabled;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/contacts/picker/bw;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/backgroundlocation/status/d;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/picker/bw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/backgroundlocation/status/d;

    const-class v3, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/bw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/contacts/divebar/e;

    const-class v4, Lcom/facebook/contacts/a/c;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/contacts/picker/bw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/a/c;

    const-class v5, Lcom/facebook/contacts/a/d;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/contacts/picker/bw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/a/d;

    const-class v6, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/contacts/picker/bw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/inputmethod/InputMethodManager;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/ap;-><init>(Ljavax/inject/a;Lcom/facebook/backgroundlocation/status/d;Lcom/facebook/orca/contacts/divebar/e;Lcom/facebook/contacts/a/c;Lcom/facebook/contacts/a/d;Landroid/view/inputmethod/InputMethodManager;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 433
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bw;->a()Lcom/facebook/orca/contacts/divebar/ap;

    move-result-object v0

    return-object v0
.end method

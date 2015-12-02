.class Lcom/facebook/orca/contacts/picker/bs;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/common/ui/titlebar/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 368
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bs;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 368
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bs;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/common/ui/titlebar/a;
    .locals 13

    .prologue
    .line 372
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/a;

    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    const-class v2, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/k;

    const-class v3, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/av;

    const-class v4, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/config/a/a;

    const-class v5, Ljava/lang/Boolean;

    const-class v6, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/contacts/picker/bs;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/contacts/picker/bs;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Lcom/facebook/orca/common/ui/a/a;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/common/ui/a/a;

    const-class v8, Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/contacts/picker/bs;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v8

    const-class v9, Landroid/support/v4/a/e;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/support/v4/a/e;

    const-class v10, Lcom/facebook/c/s;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/c/s;

    const-class v11, Lcom/facebook/orca/contacts/divebar/bn;

    invoke-virtual {p0, v11}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/orca/contacts/divebar/bn;

    const-class v12, Lcom/facebook/orca/presence/d;

    invoke-virtual {p0, v12}, Lcom/facebook/orca/contacts/picker/bs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/orca/presence/d;

    invoke-direct/range {v0 .. v12}, Lcom/facebook/orca/common/ui/titlebar/a;-><init>(Landroid/view/inputmethod/InputMethodManager;Lcom/facebook/orca/f/k;Lcom/facebook/analytics/av;Lcom/facebook/config/a/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/common/ui/a/a;Ljava/util/Set;Landroid/support/v4/a/e;Lcom/facebook/c/s;Lcom/facebook/orca/contacts/divebar/bn;Lcom/facebook/orca/presence/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 368
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bs;->a()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    return-object v0
.end method

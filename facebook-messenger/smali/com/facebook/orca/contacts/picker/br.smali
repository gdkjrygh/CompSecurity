.class Lcom/facebook/orca/contacts/picker/br;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 400
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/br;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 400
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/br;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/h;
    .locals 7

    .prologue
    .line 405
    new-instance v0, Lcom/facebook/orca/contacts/divebar/h;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsDivebarContactsUploaderPermitted;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/contacts/picker/br;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/picker/br;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Landroid/support/v4/a/e;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/br;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/a/e;

    const-class v4, Lcom/facebook/contacts/upload/c;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/contacts/picker/br;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/upload/c;

    const-class v5, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/contacts/picker/br;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/analytics/av;

    const-class v6, Lcom/facebook/c/s;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/contacts/picker/br;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/c/s;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/h;-><init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Landroid/support/v4/a/e;Lcom/facebook/contacts/upload/c;Lcom/facebook/analytics/av;Lcom/facebook/c/s;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 400
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/br;->a()Lcom/facebook/orca/contacts/divebar/h;

    move-result-object v0

    return-object v0
.end method

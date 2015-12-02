.class Lcom/facebook/orca/contacts/picker/bt;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/aa;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 416
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 416
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/bt;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/aa;
    .locals 8

    .prologue
    .line 421
    new-instance v0, Lcom/facebook/orca/contacts/divebar/aa;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/contacts/annotations/IsGroupsMegaphoneEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/contacts/picker/bt;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/bt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/av;

    const-class v4, Lcom/facebook/base/broadcast/j;

    const-class v5, Lcom/facebook/base/broadcast/LocalBroadcast;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/contacts/picker/bt;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/base/broadcast/j;

    const-class v5, Lcom/facebook/c/s;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/contacts/picker/bt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/c/s;

    const-class v6, Landroid/content/res/Resources;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/contacts/picker/bt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/res/Resources;

    const-class v7, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/contacts/picker/bt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/contacts/divebar/aa;-><init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Lcom/facebook/analytics/av;Lcom/facebook/base/broadcast/j;Lcom/facebook/c/s;Landroid/content/res/Resources;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 416
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bt;->a()Lcom/facebook/orca/contacts/divebar/aa;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/orca/app/bv;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/nux/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1876
    iput-object p1, p0, Lcom/facebook/orca/app/bv;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1876
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bv;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/nux/h;
    .locals 12

    .prologue
    .line 1880
    new-instance v0, Lcom/facebook/orca/nux/h;

    const-class v1, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/a/a;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/orca/prefs/az;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/prefs/az;

    const-class v4, Lcom/facebook/contacts/upload/c;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/upload/c;

    invoke-virtual {p0}, Lcom/facebook/orca/app/bv;->e()Lcom/facebook/inject/ab;

    move-result-object v5

    const-class v6, Landroid/content/pm/PackageManager;

    invoke-interface {v5, v6}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/pm/PackageManager;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/app/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/orca/annotations/IsContactsUploadPermitted;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/app/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/orca/annotations/IsPartialAccount;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/orca/app/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Ljava/lang/Boolean;

    const-class v10, Lcom/facebook/orca/annotations/IsSmsNuxSendCliffDisabled;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/orca/app/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v9

    const-class v10, Ljava/lang/Boolean;

    const-class v11, Lcom/facebook/orca/annotations/IsNuxSmsForced;

    invoke-virtual {p0, v10, v11}, Lcom/facebook/orca/app/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/nux/h;-><init>(Lcom/facebook/config/a/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/prefs/az;Lcom/facebook/contacts/upload/c;Landroid/content/pm/PackageManager;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1876
    invoke-virtual {p0}, Lcom/facebook/orca/app/bv;->a()Lcom/facebook/orca/nux/h;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/orca/app/ca;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/e/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1553
    iput-object p1, p0, Lcom/facebook/orca/app/ca;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1553
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ca;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/e/e;
    .locals 3

    .prologue
    .line 1557
    new-instance v2, Lcom/facebook/contacts/e/e;

    invoke-virtual {p0}, Lcom/facebook/orca/app/ca;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/ContentResolver;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentResolver;

    const-class v1, Lcom/facebook/user/i;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ca;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/i;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/e/e;-><init>(Landroid/content/ContentResolver;Lcom/facebook/user/i;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1553
    invoke-virtual {p0}, Lcom/facebook/orca/app/ca;->a()Lcom/facebook/contacts/e/e;

    move-result-object v0

    return-object v0
.end method

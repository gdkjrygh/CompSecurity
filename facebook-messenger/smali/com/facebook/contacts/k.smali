.class Lcom/facebook/contacts/k;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/models/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 542
    iput-object p1, p0, Lcom/facebook/contacts/k;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 542
    invoke-direct {p0, p1}, Lcom/facebook/contacts/k;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/models/e;
    .locals 2

    .prologue
    .line 546
    new-instance v1, Lcom/facebook/contacts/models/e;

    const-class v0, Lcom/facebook/contacts/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/f/a;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/models/e;-><init>(Lcom/facebook/contacts/f/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 542
    invoke-virtual {p0}, Lcom/facebook/contacts/k;->a()Lcom/facebook/contacts/models/e;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/contacts/data/h;
.super Lcom/facebook/inject/d;
.source "ContactsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/data/d;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/data/d;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/contacts/data/h;->a:Lcom/facebook/contacts/data/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/data/d;Lcom/facebook/contacts/data/e;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/h;-><init>(Lcom/facebook/contacts/data/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/p;
    .locals 3

    .prologue
    .line 69
    new-instance v1, Lcom/facebook/contacts/data/p;

    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/contacts/annotations/IsChatContextEnabled;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/contacts/data/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    invoke-direct {v1, v2, v0}, Lcom/facebook/contacts/data/p;-><init>(Ljavax/inject/a;Lcom/facebook/fbservice/ops/k;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/facebook/contacts/data/h;->a()Lcom/facebook/contacts/data/p;

    move-result-object v0

    return-object v0
.end method

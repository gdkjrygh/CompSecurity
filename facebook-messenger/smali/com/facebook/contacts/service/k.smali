.class Lcom/facebook/contacts/service/k;
.super Lcom/facebook/inject/d;
.source "ContactsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/service/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/service/d;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/service/d;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/facebook/contacts/service/k;->a:Lcom/facebook/contacts/service/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/k;-><init>(Lcom/facebook/contacts/service/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/service/l;
    .locals 2

    .prologue
    .line 116
    new-instance v1, Lcom/facebook/contacts/service/l;

    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/service/l;-><init>(Lcom/facebook/fbservice/service/p;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/facebook/contacts/service/k;->a()Lcom/facebook/contacts/service/l;

    move-result-object v0

    return-object v0
.end method

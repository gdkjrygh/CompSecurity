.class Lcom/facebook/contacts/service/h;
.super Lcom/facebook/inject/d;
.source "ContactsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/service/d;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/service/d;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/contacts/service/h;->a:Lcom/facebook/contacts/service/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/h;-><init>(Lcom/facebook/contacts/service/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 1

    .prologue
    .line 98
    const-class v0, Lcom/facebook/contacts/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/e;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 93
    invoke-virtual {p0}, Lcom/facebook/contacts/service/h;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method

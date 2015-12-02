.class Lcom/facebook/contacts/aa;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 313
    iput-object p1, p0, Lcom/facebook/contacts/aa;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 313
    invoke-direct {p0, p1}, Lcom/facebook/contacts/aa;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/m;
    .locals 12

    .prologue
    .line 317
    new-instance v0, Lcom/facebook/contacts/data/m;

    const-class v1, Lcom/facebook/contacts/data/b;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/data/b;

    const-class v2, Lcom/facebook/contacts/data/a;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/data/a;

    const-class v3, Lcom/facebook/user/ac;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/user/ac;

    const-class v4, Lcom/facebook/contacts/data/n;

    invoke-virtual {p0, v4}, Lcom/facebook/contacts/aa;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/user/a/l;

    invoke-virtual {p0, v5}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/user/a/l;

    const-class v6, Lcom/facebook/user/a/n;

    invoke-virtual {p0, v6}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/user/a/n;

    const-class v7, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v7}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/contacts/data/k;

    const-class v8, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v8}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    const-class v9, Lcom/facebook/contacts/data/a/b;

    invoke-virtual {p0, v9}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/contacts/data/a/b;

    const-class v10, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v10}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/common/time/a;

    const-class v11, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v11}, Lcom/facebook/contacts/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/common/v/f;

    invoke-direct/range {v0 .. v11}, Lcom/facebook/contacts/data/m;-><init>(Lcom/facebook/contacts/data/b;Lcom/facebook/contacts/data/a;Lcom/facebook/user/ac;Ljavax/inject/a;Lcom/facebook/user/a/l;Lcom/facebook/user/a/n;Lcom/facebook/contacts/data/k;Lcom/facebook/phonenumbers/PhoneNumberUtil;Lcom/facebook/contacts/data/a/b;Lcom/facebook/common/time/a;Lcom/facebook/common/v/f;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 313
    invoke-virtual {p0}, Lcom/facebook/contacts/aa;->a()Lcom/facebook/contacts/data/m;

    move-result-object v0

    return-object v0
.end method

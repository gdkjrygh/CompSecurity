.class Lcom/facebook/orca/protocol/x;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/g/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 332
    iput-object p1, p0, Lcom/facebook/orca/protocol/x;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 332
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/x;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/g/a/h;
    .locals 4

    .prologue
    .line 337
    new-instance v1, Lcom/facebook/contacts/g/a/h;

    const-class v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    const-class v2, Ljava/lang/String;

    const-class v3, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/protocol/x;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/contacts/g/a/h;-><init>(Lcom/facebook/phonenumbers/PhoneNumberUtil;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 332
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/x;->a()Lcom/facebook/contacts/g/a/h;

    move-result-object v0

    return-object v0
.end method

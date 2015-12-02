.class Lcom/facebook/contacts/an;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/phonenumbers/PhoneNumberUtil;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 534
    iput-object p1, p0, Lcom/facebook/contacts/an;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 534
    invoke-direct {p0, p1}, Lcom/facebook/contacts/an;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/phonenumbers/PhoneNumberUtil;
    .locals 1

    .prologue
    .line 538
    invoke-static {}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getInstance()Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 534
    invoke-virtual {p0}, Lcom/facebook/contacts/an;->a()Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v0

    return-object v0
.end method

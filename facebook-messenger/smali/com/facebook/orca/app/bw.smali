.class Lcom/facebook/orca/app/bw;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1596
    iput-object p1, p0, Lcom/facebook/orca/app/bw;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1596
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bw;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/i;
    .locals 5

    .prologue
    .line 1600
    new-instance v1, Lcom/facebook/user/i;

    const-class v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    const-class v2, Ljava/lang/String;

    const-class v3, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/app/bw;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    const-class v4, Lcom/facebook/orca/annotations/LoggedInUserPhoneNumber;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/app/bw;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/facebook/user/i;-><init>(Lcom/facebook/phonenumbers/PhoneNumberUtil;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1596
    invoke-virtual {p0}, Lcom/facebook/orca/app/bw;->a()Lcom/facebook/user/i;

    move-result-object v0

    return-object v0
.end method

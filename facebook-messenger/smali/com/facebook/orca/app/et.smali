.class Lcom/facebook/orca/app/et;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/fl;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 609
    iput-object p1, p0, Lcom/facebook/orca/app/et;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 609
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/et;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/fl;
    .locals 2

    .prologue
    .line 614
    new-instance v0, Lcom/facebook/orca/app/fl;

    const-class v1, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/et;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/app/fl;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 609
    invoke-virtual {p0}, Lcom/facebook/orca/app/et;->a()Lcom/facebook/orca/app/fl;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/sms/c;
.super Lcom/facebook/inject/d;
.source "SmsInitializationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/sms/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/sms/a;


# direct methods
.method private constructor <init>(Lcom/facebook/sms/a;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/facebook/sms/c;->a:Lcom/facebook/sms/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/sms/a;Lcom/facebook/sms/b;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/sms/c;-><init>(Lcom/facebook/sms/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/sms/d;
    .locals 3

    .prologue
    .line 35
    new-instance v1, Lcom/facebook/sms/d;

    invoke-virtual {p0}, Lcom/facebook/sms/c;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/sms/d;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/facebook/sms/c;->a()Lcom/facebook/sms/d;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/orca/app/dr;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/login/ai;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1787
    iput-object p1, p0, Lcom/facebook/orca/app/dr;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1787
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dr;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/login/ai;
    .locals 5

    .prologue
    .line 1791
    new-instance v4, Lcom/facebook/orca/login/ai;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/dr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    const-class v3, Lcom/facebook/orca/login/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/dr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/login/b;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/login/ai;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/prefs/shared/d;Lcom/facebook/phonenumbers/PhoneNumberUtil;Lcom/facebook/orca/login/b;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1787
    invoke-virtual {p0}, Lcom/facebook/orca/app/dr;->a()Lcom/facebook/orca/login/ai;

    move-result-object v0

    return-object v0
.end method

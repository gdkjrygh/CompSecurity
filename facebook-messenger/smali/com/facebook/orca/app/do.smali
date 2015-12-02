.class Lcom/facebook/orca/app/do;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/login/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1895
    iput-object p1, p0, Lcom/facebook/orca/app/do;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1895
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/do;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/login/b;
    .locals 4

    .prologue
    .line 1899
    new-instance v3, Lcom/facebook/orca/login/b;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/do;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/do;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    const-class v2, Landroid/net/wifi/WifiManager;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/do;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/WifiManager;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/login/b;-><init>(Lcom/facebook/prefs/shared/d;Landroid/telephony/TelephonyManager;Landroid/net/wifi/WifiManager;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1895
    invoke-virtual {p0}, Lcom/facebook/orca/app/do;->a()Lcom/facebook/orca/login/b;

    move-result-object v0

    return-object v0
.end method

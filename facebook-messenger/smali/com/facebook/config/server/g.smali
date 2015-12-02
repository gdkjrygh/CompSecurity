.class Lcom/facebook/config/server/g;
.super Lcom/facebook/inject/d;
.source "DefaultServerConfigModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/config/server/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/config/server/d;


# direct methods
.method private constructor <init>(Lcom/facebook/config/server/d;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/config/server/g;->a:Lcom/facebook/config/server/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/config/server/d;Lcom/facebook/config/server/e;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/config/server/g;-><init>(Lcom/facebook/config/server/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/config/server/q;
    .locals 5

    .prologue
    .line 62
    new-instance v3, Lcom/facebook/config/server/q;

    const-class v0, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/b/a;

    const-class v1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v1}, Lcom/facebook/config/server/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    const-class v2, Ljava/util/Locale;

    invoke-virtual {p0, v2}, Lcom/facebook/config/server/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Locale;

    iget-object v4, p0, Lcom/facebook/config/server/g;->a:Lcom/facebook/config/server/d;

    invoke-static {v4}, Lcom/facebook/config/server/d;->a(Lcom/facebook/config/server/d;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/facebook/config/server/q;-><init>(Lcom/facebook/config/b/a;Landroid/telephony/TelephonyManager;Ljava/util/Locale;Ljava/lang/String;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/config/server/g;->a()Lcom/facebook/config/server/q;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/orca/sms/ao;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/x;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 492
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 492
    invoke-direct {p0}, Lcom/facebook/orca/sms/ao;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/x;
    .locals 4

    .prologue
    .line 497
    new-instance v3, Lcom/facebook/orca/sms/x;

    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ao;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/ao;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/ao;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/sms/af;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/sms/x;-><init>(Lcom/facebook/orca/nux/h;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/sms/af;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 492
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ao;->a()Lcom/facebook/orca/sms/x;

    move-result-object v0

    return-object v0
.end method

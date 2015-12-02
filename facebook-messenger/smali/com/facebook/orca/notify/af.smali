.class Lcom/facebook/orca/notify/af;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/as;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/facebook/orca/notify/af;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 119
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/af;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/as;
    .locals 2

    .prologue
    .line 124
    new-instance v1, Lcom/facebook/orca/notify/as;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-direct {v1, v0}, Lcom/facebook/orca/notify/as;-><init>(Lcom/facebook/prefs/shared/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 119
    invoke-virtual {p0}, Lcom/facebook/orca/notify/af;->a()Lcom/facebook/orca/notify/as;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/orca/app/er;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/ck;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 730
    iput-object p1, p0, Lcom/facebook/orca/app/er;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 730
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/er;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/ck;
    .locals 4

    .prologue
    .line 734
    new-instance v3, Lcom/facebook/orca/b/b;

    const-class v0, Lcom/facebook/analytics/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/er;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/a;

    const-class v1, Lcom/facebook/config/server/j;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/er;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/server/j;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/er;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/b/b;-><init>(Lcom/facebook/analytics/a;Lcom/facebook/config/server/j;Lcom/facebook/prefs/shared/d;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 730
    invoke-virtual {p0}, Lcom/facebook/orca/app/er;->a()Lcom/facebook/analytics/ck;

    move-result-object v0

    return-object v0
.end method

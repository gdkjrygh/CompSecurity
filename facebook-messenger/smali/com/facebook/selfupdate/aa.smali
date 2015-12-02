.class Lcom/facebook/selfupdate/aa;
.super Lcom/facebook/inject/d;
.source "SelfUpdateModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/selfupdate/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/u;


# direct methods
.method private constructor <init>(Lcom/facebook/selfupdate/u;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/facebook/selfupdate/aa;->a:Lcom/facebook/selfupdate/u;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/aa;-><init>(Lcom/facebook/selfupdate/u;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/selfupdate/i;
    .locals 4

    .prologue
    .line 140
    new-instance v3, Lcom/facebook/selfupdate/i;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/selfupdate/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v2}, Lcom/facebook/selfupdate/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/process/d;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/selfupdate/i;-><init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/process/d;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/facebook/selfupdate/aa;->a()Lcom/facebook/selfupdate/i;

    move-result-object v0

    return-object v0
.end method

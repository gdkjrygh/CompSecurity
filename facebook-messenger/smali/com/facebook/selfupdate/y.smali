.class Lcom/facebook/selfupdate/y;
.super Lcom/facebook/inject/d;
.source "SelfUpdateModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/selfupdate/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/u;


# direct methods
.method private constructor <init>(Lcom/facebook/selfupdate/u;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/selfupdate/y;->a:Lcom/facebook/selfupdate/u;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V
    .locals 0

    .prologue
    .line 114
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/y;-><init>(Lcom/facebook/selfupdate/u;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/selfupdate/g;
    .locals 4

    .prologue
    .line 118
    new-instance v3, Lcom/facebook/selfupdate/g;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/selfupdate/ai;

    invoke-virtual {p0, v1}, Lcom/facebook/selfupdate/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/selfupdate/ai;

    const-class v2, Lcom/facebook/selfupdate/o;

    invoke-virtual {p0, v2}, Lcom/facebook/selfupdate/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/selfupdate/o;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/selfupdate/g;-><init>(Landroid/content/Context;Lcom/facebook/selfupdate/ai;Lcom/facebook/selfupdate/o;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 114
    invoke-virtual {p0}, Lcom/facebook/selfupdate/y;->a()Lcom/facebook/selfupdate/g;

    move-result-object v0

    return-object v0
.end method

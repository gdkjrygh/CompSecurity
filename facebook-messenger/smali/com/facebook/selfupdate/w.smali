.class Lcom/facebook/selfupdate/w;
.super Lcom/facebook/inject/d;
.source "SelfUpdateModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/selfupdate/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/u;


# direct methods
.method private constructor <init>(Lcom/facebook/selfupdate/u;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/selfupdate/w;->a:Lcom/facebook/selfupdate/u;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/w;-><init>(Lcom/facebook/selfupdate/u;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/selfupdate/a;
    .locals 1

    .prologue
    .line 109
    new-instance v0, Lcom/facebook/selfupdate/a;

    invoke-direct {v0}, Lcom/facebook/selfupdate/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/selfupdate/w;->a()Lcom/facebook/selfupdate/a;

    move-result-object v0

    return-object v0
.end method

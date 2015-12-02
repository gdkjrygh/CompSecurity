.class Lcom/facebook/selfupdate/x;
.super Lcom/facebook/inject/d;
.source "SelfUpdateModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/selfupdate/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/u;


# direct methods
.method private constructor <init>(Lcom/facebook/selfupdate/u;)V
    .locals 0

    .prologue
    .line 159
    iput-object p1, p0, Lcom/facebook/selfupdate/x;->a:Lcom/facebook/selfupdate/u;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V
    .locals 0

    .prologue
    .line 159
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/x;-><init>(Lcom/facebook/selfupdate/u;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/selfupdate/f;
    .locals 1

    .prologue
    .line 163
    new-instance v0, Lcom/facebook/selfupdate/f;

    invoke-direct {v0}, Lcom/facebook/selfupdate/f;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 159
    invoke-virtual {p0}, Lcom/facebook/selfupdate/x;->a()Lcom/facebook/selfupdate/f;

    move-result-object v0

    return-object v0
.end method

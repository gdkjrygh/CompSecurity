.class Lcom/facebook/orca/app/el;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/MessengerForegroundProvider;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 551
    iput-object p1, p0, Lcom/facebook/orca/app/el;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 551
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/el;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/MessengerForegroundProvider;
    .locals 1

    .prologue
    .line 556
    new-instance v0, Lcom/facebook/orca/notify/MessengerForegroundProvider;

    invoke-direct {v0}, Lcom/facebook/orca/notify/MessengerForegroundProvider;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 551
    invoke-virtual {p0}, Lcom/facebook/orca/app/el;->a()Lcom/facebook/orca/notify/MessengerForegroundProvider;

    move-result-object v0

    return-object v0
.end method

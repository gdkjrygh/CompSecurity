.class Lcom/facebook/backgroundtasks/h;
.super Lcom/facebook/inject/d;
.source "BackgroundTaskModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/backgroundtasks/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/backgroundtasks/f;


# direct methods
.method private constructor <init>(Lcom/facebook/backgroundtasks/f;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/backgroundtasks/h;->a:Lcom/facebook/backgroundtasks/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/backgroundtasks/f;Lcom/facebook/backgroundtasks/g;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/h;-><init>(Lcom/facebook/backgroundtasks/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/backgroundtasks/d;
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/backgroundtasks/d;

    invoke-direct {v0}, Lcom/facebook/backgroundtasks/d;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/backgroundtasks/h;->a()Lcom/facebook/backgroundtasks/d;

    move-result-object v0

    return-object v0
.end method

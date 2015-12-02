.class Lcom/facebook/fbservice/b/i;
.super Lcom/facebook/inject/d;
.source "BlueServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/b/a;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/facebook/fbservice/b/i;->a:Lcom/facebook/fbservice/b/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/b/i;-><init>(Lcom/facebook/fbservice/b/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/a/b;
    .locals 1

    .prologue
    .line 141
    new-instance v0, Lcom/facebook/fbservice/a/b;

    invoke-direct {v0}, Lcom/facebook/fbservice/a/b;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/facebook/fbservice/b/i;->a()Lcom/facebook/fbservice/a/b;

    move-result-object v0

    return-object v0
.end method

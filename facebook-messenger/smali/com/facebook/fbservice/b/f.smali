.class Lcom/facebook/fbservice/b/f;
.super Lcom/facebook/inject/d;
.source "BlueServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/ops/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/b/a;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/fbservice/b/f;->a:Lcom/facebook/fbservice/b/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V
    .locals 0

    .prologue
    .line 114
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/b/f;-><init>(Lcom/facebook/fbservice/b/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/ops/o;
    .locals 1

    .prologue
    .line 119
    new-instance v0, Lcom/facebook/fbservice/ops/o;

    invoke-direct {v0}, Lcom/facebook/fbservice/ops/o;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 114
    invoke-virtual {p0}, Lcom/facebook/fbservice/b/f;->a()Lcom/facebook/fbservice/ops/o;

    move-result-object v0

    return-object v0
.end method

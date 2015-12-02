.class Lcom/facebook/nux/c;
.super Lcom/facebook/inject/d;
.source "NuxModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/nux/b;)V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0}, Lcom/facebook/nux/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 1

    .prologue
    .line 121
    const-class v0, Lcom/facebook/nux/service/a;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/e;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/facebook/nux/c;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method

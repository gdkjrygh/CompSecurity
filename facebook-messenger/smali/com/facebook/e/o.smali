.class Lcom/facebook/e/o;
.super Lcom/facebook/inject/d;
.source "DeviceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/e/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/e/h;


# direct methods
.method private constructor <init>(Lcom/facebook/e/h;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/facebook/e/o;->a:Lcom/facebook/e/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1}, Lcom/facebook/e/o;-><init>(Lcom/facebook/e/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/e/s;
    .locals 2

    .prologue
    .line 143
    new-instance v1, Lcom/facebook/e/s;

    const-class v0, Landroid_src/e/a;

    invoke-virtual {p0, v0}, Lcom/facebook/e/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/e/a;

    invoke-direct {v1, v0}, Lcom/facebook/e/s;-><init>(Landroid_src/e/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/facebook/e/o;->a()Lcom/facebook/e/s;

    move-result-object v0

    return-object v0
.end method

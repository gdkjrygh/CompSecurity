.class Lcom/facebook/e/p;
.super Lcom/facebook/inject/d;
.source "DeviceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/e/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/e/h;


# direct methods
.method private constructor <init>(Lcom/facebook/e/h;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/e/p;->a:Lcom/facebook/e/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0, p1}, Lcom/facebook/e/p;-><init>(Lcom/facebook/e/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/e/a/e;
    .locals 9

    .prologue
    .line 99
    new-instance v0, Lcom/facebook/e/a/e;

    const-class v1, Lcom/facebook/e/a/h;

    invoke-virtual {p0, v1}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/e/a/h;

    const-class v2, Lcom/facebook/e/a/g;

    invoke-virtual {p0, v2}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/e/a/g;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    const-class v4, Lcom/facebook/e/c;

    invoke-virtual {p0, v4}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/e/c;

    const-class v5, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v5}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/d;

    const-class v6, Landroid/view/WindowManager;

    invoke-virtual {p0, v6}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/WindowManager;

    const-class v7, Lcom/facebook/base/activity/g;

    invoke-virtual {p0, v7}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/base/activity/g;

    const-class v8, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v8}, Lcom/facebook/e/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/e/a/e;-><init>(Lcom/facebook/e/a/h;Lcom/facebook/e/a/g;Ljava/lang/Runtime;Lcom/facebook/e/c;Lcom/facebook/prefs/shared/d;Landroid/view/WindowManager;Lcom/facebook/base/activity/g;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/facebook/e/p;->a()Lcom/facebook/e/a/e;

    move-result-object v0

    return-object v0
.end method

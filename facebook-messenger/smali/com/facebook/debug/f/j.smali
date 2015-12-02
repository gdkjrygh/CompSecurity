.class Lcom/facebook/debug/f/j;
.super Lcom/facebook/inject/d;
.source "UiThreadWatchdogModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/debug/f/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/debug/f/h;


# direct methods
.method private constructor <init>(Lcom/facebook/debug/f/h;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/facebook/debug/f/j;->a:Lcom/facebook/debug/f/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/debug/f/h;Lcom/facebook/debug/f/i;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/debug/f/j;-><init>(Lcom/facebook/debug/f/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/debug/f/a;
    .locals 5

    .prologue
    .line 34
    new-instance v4, Lcom/facebook/debug/f/a;

    const-class v0, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/f/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/a;

    const-class v1, Landroid/support/v4/a/e;

    invoke-virtual {p0, v1}, Lcom/facebook/debug/f/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/e;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/debug/f/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/debug/f/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/debug/f/a;-><init>(Lcom/facebook/common/v/a;Landroid/support/v4/a/e;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/debug/f/j;->a()Lcom/facebook/debug/f/a;

    move-result-object v0

    return-object v0
.end method

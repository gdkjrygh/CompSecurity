.class final Lcom/flurry/android/FlurryAgent$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/jx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/jx",
        "<",
        "Lcom/flurry/sdk/lc;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 105
    check-cast p1, Lcom/flurry/sdk/lc;

    invoke-virtual {p0, p1}, Lcom/flurry/android/FlurryAgent$1;->a(Lcom/flurry/sdk/lc;)V

    return-void
.end method

.method public final a(Lcom/flurry/sdk/lc;)V
    .locals 2

    .prologue
    .line 110
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/android/FlurryAgent$1$1;

    invoke-direct {v1, p0, p1}, Lcom/flurry/android/FlurryAgent$1$1;-><init>(Lcom/flurry/android/FlurryAgent$1;Lcom/flurry/sdk/lc;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->a(Ljava/lang/Runnable;)V

    .line 123
    return-void
.end method

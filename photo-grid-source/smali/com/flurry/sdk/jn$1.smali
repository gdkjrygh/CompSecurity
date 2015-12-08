.class Lcom/flurry/sdk/jn$1;
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


# instance fields
.field final synthetic a:Lcom/flurry/sdk/jn;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/jn;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 26
    check-cast p1, Lcom/flurry/sdk/lc;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/jn$1;->a(Lcom/flurry/sdk/lc;)V

    return-void
.end method

.method public a(Lcom/flurry/sdk/lc;)V
    .locals 3

    .prologue
    .line 29
    iget-object v0, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    invoke-static {v0}, Lcom/flurry/sdk/jn;->a(Lcom/flurry/sdk/jn;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    iget-object v1, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    invoke-static {v1}, Lcom/flurry/sdk/jn;->a(Lcom/flurry/sdk/jn;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 52
    :goto_0
    return-void

    .line 33
    :cond_0
    sget-object v0, Lcom/flurry/sdk/jn$4;->a:[I

    iget-object v1, p1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/lc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 35
    :pswitch_0
    iget-object v1, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    iget-object v2, p1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    iget-object v0, p1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/flurry/sdk/jn;->a(Lcom/flurry/sdk/lb;Landroid/content/Context;)V

    goto :goto_0

    .line 39
    :pswitch_1
    iget-object v1, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    iget-object v0, p1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/jn;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 43
    :pswitch_2
    iget-object v1, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    iget-object v0, p1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/jn;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 47
    :pswitch_3
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.FlurrySessionEvent"

    iget-object v2, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    invoke-static {v2}, Lcom/flurry/sdk/jn;->b(Lcom/flurry/sdk/jn;)Lcom/flurry/sdk/jx;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 49
    iget-object v0, p0, Lcom/flurry/sdk/jn$1;->a:Lcom/flurry/sdk/jn;

    invoke-virtual {v0}, Lcom/flurry/sdk/jn;->a()V

    goto :goto_0

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

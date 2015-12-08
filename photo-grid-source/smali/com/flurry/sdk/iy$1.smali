.class Lcom/flurry/sdk/iy$1;
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
.field final synthetic a:Lcom/flurry/sdk/iy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 119
    check-cast p1, Lcom/flurry/sdk/lc;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/iy$1;->a(Lcom/flurry/sdk/lc;)V

    return-void
.end method

.method public a(Lcom/flurry/sdk/lc;)V
    .locals 4

    .prologue
    .line 122
    iget-object v0, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    invoke-static {v0}, Lcom/flurry/sdk/iy;->a(Lcom/flurry/sdk/iy;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    iget-object v1, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    invoke-static {v1}, Lcom/flurry/sdk/iy;->a(Lcom/flurry/sdk/iy;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 145
    :goto_0
    return-void

    .line 126
    :cond_0
    sget-object v0, Lcom/flurry/sdk/iy$8;->a:[I

    iget-object v1, p1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/lc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 128
    :pswitch_0
    iget-object v1, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    iget-object v2, p1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    iget-object v0, p1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/flurry/sdk/iy;->a(Lcom/flurry/sdk/lb;Landroid/content/Context;)V

    goto :goto_0

    .line 132
    :pswitch_1
    iget-object v1, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    iget-object v0, p1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/iy;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 136
    :pswitch_2
    iget-object v1, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    iget-object v0, p1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/iy;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 140
    :pswitch_3
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.FlurrySessionEvent"

    iget-object v2, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    invoke-static {v2}, Lcom/flurry/sdk/iy;->b(Lcom/flurry/sdk/iy;)Lcom/flurry/sdk/jx;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 142
    iget-object v0, p0, Lcom/flurry/sdk/iy$1;->a:Lcom/flurry/sdk/iy;

    iget-wide v2, p1, Lcom/flurry/sdk/lc;->d:J

    invoke-virtual {v0, v2, v3}, Lcom/flurry/sdk/iy;->a(J)V

    goto :goto_0

    .line 126
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

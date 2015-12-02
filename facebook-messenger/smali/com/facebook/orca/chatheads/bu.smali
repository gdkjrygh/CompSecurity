.class Lcom/facebook/orca/chatheads/bu;
.super Landroid/os/Handler;
.source "ChatHeadWindowManager.java"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/facebook/orca/chatheads/al;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 1

    .prologue
    .line 3235
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 3236
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bu;->a:Ljava/lang/ref/WeakReference;

    .line 3238
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 3242
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bu;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/al;

    .line 3243
    if-nez v0, :cond_0

    .line 3260
    :goto_0
    return-void

    .line 3247
    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 3249
    :pswitch_0
    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->O(Lcom/facebook/orca/chatheads/al;)V

    goto :goto_0

    .line 3253
    :pswitch_1
    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->P(Lcom/facebook/orca/chatheads/al;)V

    goto :goto_0

    .line 3257
    :pswitch_2
    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->Q(Lcom/facebook/orca/chatheads/al;)V

    goto :goto_0

    .line 3247
    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 1

    .prologue
    .line 2233
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2234
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->a:Ljava/lang/ref/WeakReference;

    .line 2235
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2238
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->b:Z

    .line 2239
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 2243
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->b:Z

    if-eqz v0, :cond_1

    .line 2264
    :cond_0
    :goto_0
    return-void

    .line 2246
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 2247
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    .line 2248
    if-eqz v0, :cond_0

    .line 2249
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 2251
    :pswitch_0
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    goto :goto_0

    .line 2254
    :pswitch_1
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ac(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    goto :goto_0

    .line 2257
    :pswitch_2
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)V

    goto :goto_0

    .line 2249
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

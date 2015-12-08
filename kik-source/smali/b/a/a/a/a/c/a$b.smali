.class final Lb/a/a/a/a/c/a$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 663
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 664
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 669
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb/a/a/a/a/c/a$a;

    .line 670
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 677
    :goto_0
    return-void

    .line 673
    :pswitch_0
    iget-object v0, v0, Lb/a/a/a/a/c/a$a;->a:Lb/a/a/a/a/c/a;

    invoke-static {v0}, Lb/a/a/a/a/c/a;->b(Lb/a/a/a/a/c/a;)V

    goto :goto_0

    .line 676
    :pswitch_1
    invoke-static {}, Lb/a/a/a/a/c/a;->i_()V

    goto :goto_0

    .line 670
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

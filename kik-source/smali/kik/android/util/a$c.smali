.class final Lkik/android/util/a$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/util/a;


# direct methods
.method public constructor <init>(Lkik/android/util/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 469
    iput-object p1, p0, Lkik/android/util/a$c;->a:Lkik/android/util/a;

    .line 470
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 471
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x2

    .line 476
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 477
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 496
    :goto_0
    return-void

    .line 479
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0, v3, v0}, Lkik/android/util/a$c;->removeMessages(ILjava/lang/Object;)V

    .line 482
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0, v2, v0}, Lkik/android/util/a$c;->removeMessages(ILjava/lang/Object;)V

    .line 483
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lkik/android/util/a$a;

    .line 484
    iget-object v1, p0, Lkik/android/util/a$c;->a:Lkik/android/util/a;

    invoke-static {v1, v0, v3}, Lkik/android/util/a;->a(Lkik/android/util/a;Lkik/android/util/a$a;I)V

    goto :goto_0

    .line 487
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0, v2, v0}, Lkik/android/util/a$c;->removeMessages(ILjava/lang/Object;)V

    .line 490
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lkik/android/util/a$a;

    .line 491
    iget-object v1, p0, Lkik/android/util/a$c;->a:Lkik/android/util/a;

    invoke-static {v1, v0, v2}, Lkik/android/util/a;->a(Lkik/android/util/a;Lkik/android/util/a$a;I)V

    goto :goto_0

    .line 494
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lkik/android/util/a$d;

    .line 495
    iget-object v1, p0, Lkik/android/util/a$c;->a:Lkik/android/util/a;

    invoke-static {v0}, Lkik/android/util/a$d;->a(Lkik/android/util/a$d;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lkik/android/util/a$d;->b(Lkik/android/util/a$d;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lkik/android/util/a$d;->c(Lkik/android/util/a$d;)[B

    move-result-object v0

    invoke-static {v1, v2, v3, v0}, Lkik/android/util/a;->a(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;[B)V

    goto :goto_0

    .line 477
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

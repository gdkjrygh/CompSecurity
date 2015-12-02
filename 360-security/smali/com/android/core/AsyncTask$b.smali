.class Lcom/android/core/AsyncTask$b;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/core/AsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 632
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/core/AsyncTask$1;)V
    .locals 0

    .prologue
    .line 632
    invoke-direct {p0}, Lcom/android/core/AsyncTask$b;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 636
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/android/core/AsyncTask$a;

    .line 637
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 646
    :goto_0
    return-void

    .line 640
    :pswitch_0
    iget-object v1, v0, Lcom/android/core/AsyncTask$a;->a:Lcom/android/core/AsyncTask;

    iget-object v0, v0, Lcom/android/core/AsyncTask$a;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-static {v1, v0}, Lcom/android/core/AsyncTask;->c(Lcom/android/core/AsyncTask;Ljava/lang/Object;)V

    goto :goto_0

    .line 643
    :pswitch_1
    iget-object v1, v0, Lcom/android/core/AsyncTask$a;->a:Lcom/android/core/AsyncTask;

    iget-object v0, v0, Lcom/android/core/AsyncTask$a;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/android/core/AsyncTask;->b([Ljava/lang/Object;)V

    goto :goto_0

    .line 637
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

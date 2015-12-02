.class Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 637
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;)V
    .locals 0

    .prologue
    .line 637
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 641
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;

    .line 642
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 651
    :goto_0
    return-void

    .line 645
    :pswitch_0
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)V

    goto :goto_0

    .line 648
    :pswitch_1
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b([Ljava/lang/Object;)V

    goto :goto_0

    .line 642
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

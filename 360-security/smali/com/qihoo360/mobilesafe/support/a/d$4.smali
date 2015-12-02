.class Lcom/qihoo360/mobilesafe/support/a/d$4;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/d;->a(Landroid/content/Context;Ljava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 832
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 837
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->i:Ljava/lang/Process;

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    .line 838
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->i:Ljava/lang/Process;

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 841
    :goto_0
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->i:Ljava/lang/Process;

    .line 842
    return-void

    .line 839
    :catch_0
    move-exception v0

    goto :goto_0
.end method

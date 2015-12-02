.class Lcom/facebook/orca/d/n;
.super Ljava/lang/Object;
.source "AudioClipPlayerQueue.java"

# interfaces
.implements Lcom/facebook/orca/d/l;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/m;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/m;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/orca/d/n;->a:Lcom/facebook/orca/d/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/d/k;)V
    .locals 2

    .prologue
    .line 27
    sget-object v0, Lcom/facebook/orca/d/p;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 34
    :goto_0
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/d/n;->a:Lcom/facebook/orca/d/m;

    invoke-static {v0}, Lcom/facebook/orca/d/m;->a(Lcom/facebook/orca/d/m;)V

    goto :goto_0

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

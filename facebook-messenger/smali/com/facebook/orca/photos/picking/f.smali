.class Lcom/facebook/orca/photos/picking/f;
.super Lcom/facebook/orca/photos/picking/c;
.source "PickMediaOperation.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/picking/PickMediaParams;

.field final synthetic b:Lcom/facebook/orca/photos/picking/PickMediaOperation;


# direct methods
.method constructor <init>(Lcom/facebook/orca/photos/picking/PickMediaOperation;Lcom/facebook/orca/photos/picking/PickMediaParams;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    iput-object p2, p0, Lcom/facebook/orca/photos/picking/f;->a:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/photos/picking/d;)V
    .locals 2

    .prologue
    .line 148
    sget-object v0, Lcom/facebook/orca/photos/picking/h;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/photos/picking/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 172
    :goto_0
    return-void

    .line 150
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 153
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->a:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/PickMediaParams;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->c(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 160
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 163
    :pswitch_3
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 166
    :pswitch_4
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 169
    :pswitch_5
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/f;->b:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->g(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V

    goto :goto_0

    .line 148
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

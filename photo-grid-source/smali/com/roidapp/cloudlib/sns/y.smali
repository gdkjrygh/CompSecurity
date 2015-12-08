.class final Lcom/roidapp/cloudlib/sns/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:I

.field private c:Lcom/roidapp/cloudlib/sns/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/w",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput p1, p0, Lcom/roidapp/cloudlib/sns/y;->b:I

    .line 39
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/y;->a:Ljava/lang/Object;

    .line 40
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    .line 41
    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;B)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/y;-><init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    if-eqz v0, :cond_0

    .line 47
    iget v0, p0, Lcom/roidapp/cloudlib/sns/y;->b:I

    packed-switch v0, :pswitch_data_0

    .line 63
    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    .line 64
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/y;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/w;->c(Ljava/lang/Object;)V

    goto :goto_0

    .line 52
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/y;->a:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/c/x;

    .line 53
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-interface {v2, v1, v0}, Lcom/roidapp/cloudlib/sns/w;->b(ILjava/lang/Exception;)V

    goto :goto_0

    .line 56
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/y;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/w;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 59
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/y;->c:Lcom/roidapp/cloudlib/sns/w;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/w;->a()V

    goto :goto_0

    .line 47
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.class Lcom/roidapp/cloudlib/sns/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/roidapp/baselib/e/j",
        "<TT;>;"
    }
.end annotation


# static fields
.field private static final b:Landroid/os/Handler;


# instance fields
.field private final a:Lcom/roidapp/cloudlib/sns/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/w",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/x;->b:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lcom/roidapp/cloudlib/sns/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    if-eqz v0, :cond_0

    .line 94
    sget-object v0, Lcom/roidapp/cloudlib/sns/x;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/cloudlib/sns/y;

    const/4 v2, 0x3

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/roidapp/cloudlib/sns/y;-><init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 97
    :cond_0
    return-void
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 6

    .prologue
    .line 78
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/sns/w;->a(ILjava/lang/Exception;)V

    .line 80
    sget-object v0, Lcom/roidapp/cloudlib/sns/x;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/cloudlib/sns/y;

    const/4 v2, 0x1

    new-instance v3, Lcom/roidapp/baselib/c/x;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v4, p2}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/roidapp/cloudlib/sns/y;-><init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 83
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 69
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/sns/w;->a(Ljava/lang/Object;)V

    .line 71
    sget-object v0, Lcom/roidapp/cloudlib/sns/x;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/cloudlib/sns/y;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-direct {v1, v3, p1, v2, v3}, Lcom/roidapp/cloudlib/sns/y;-><init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 74
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    if-eqz v0, :cond_0

    .line 87
    sget-object v0, Lcom/roidapp/cloudlib/sns/x;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/cloudlib/sns/y;

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/x;->a:Lcom/roidapp/cloudlib/sns/w;

    const/4 v4, 0x0

    invoke-direct {v1, v2, p1, v3, v4}, Lcom/roidapp/cloudlib/sns/y;-><init>(ILjava/lang/Object;Lcom/roidapp/cloudlib/sns/w;B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 90
    :cond_0
    return-void
.end method

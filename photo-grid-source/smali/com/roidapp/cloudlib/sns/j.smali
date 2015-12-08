.class final Lcom/roidapp/cloudlib/sns/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/i;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/j;->a:Lcom/roidapp/cloudlib/sns/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/j;->a:Lcom/roidapp/cloudlib/sns/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/i;->b()V

    .line 37
    return-void
.end method

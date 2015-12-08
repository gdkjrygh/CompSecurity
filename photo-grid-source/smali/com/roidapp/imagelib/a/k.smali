.class final Lcom/roidapp/imagelib/a/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 782
    iput-object p1, p0, Lcom/roidapp/imagelib/a/k;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 785
    iget-object v0, p0, Lcom/roidapp/imagelib/a/k;->a:Lcom/roidapp/imagelib/a/i;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;Z)Z

    .line 786
    return-void
.end method

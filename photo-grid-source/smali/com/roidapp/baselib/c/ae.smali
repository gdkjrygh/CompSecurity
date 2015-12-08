.class public final Lcom/roidapp/baselib/c/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/roidapp/baselib/c/ae;


# instance fields
.field private a:Lcom/roidapp/baselib/c/af;


# direct methods
.method public static a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/roidapp/baselib/c/ae;->b:Lcom/roidapp/baselib/c/ae;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/baselib/c/ae;->b:Lcom/roidapp/baselib/c/ae;

    iget-object v0, v0, Lcom/roidapp/baselib/c/ae;->a:Lcom/roidapp/baselib/c/af;

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lcom/roidapp/baselib/c/ae;->b:Lcom/roidapp/baselib/c/ae;

    iget-object v0, v0, Lcom/roidapp/baselib/c/ae;->a:Lcom/roidapp/baselib/c/af;

    invoke-interface {v0, p0}, Lcom/roidapp/baselib/c/af;->a(Ljava/lang/Object;)V

    .line 25
    :cond_0
    return-void
.end method

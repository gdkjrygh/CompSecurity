.class public final Lcom/roidapp/photogrid/a/c;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/photogrid/a/l;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    invoke-direct {v0, p1, p2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/c;-><init>(Lcom/roidapp/photogrid/a/l;)V

    .line 32
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    invoke-direct {v0, p1, p2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-direct {p0, v0, p3}, Lcom/roidapp/photogrid/a/c;-><init>(Lcom/roidapp/photogrid/a/l;Ljava/lang/Exception;)V

    .line 39
    return-void
.end method

.method private constructor <init>(Lcom/roidapp/photogrid/a/l;)V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/a/c;-><init>(Lcom/roidapp/photogrid/a/l;Ljava/lang/Exception;)V

    .line 29
    return-void
.end method

.method private constructor <init>(Lcom/roidapp/photogrid/a/l;Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 34
    .line 1040
    iget-object v0, p1, Lcom/roidapp/photogrid/a/l;->b:Ljava/lang/String;

    .line 34
    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    iput-object p1, p0, Lcom/roidapp/photogrid/a/c;->a:Lcom/roidapp/photogrid/a/l;

    .line 36
    return-void
.end method

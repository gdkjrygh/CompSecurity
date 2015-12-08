.class final Lcom/roidapp/baselib/hlistview/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/baselib/hlistview/l;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/l;I)V
    .locals 0

    .prologue
    .line 3932
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/m;->b:Lcom/roidapp/baselib/hlistview/l;

    iput p2, p0, Lcom/roidapp/baselib/hlistview/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 3936
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/m;->b:Lcom/roidapp/baselib/hlistview/l;

    iget v1, p0, Lcom/roidapp/baselib/hlistview/m;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/l;->a(I)V

    .line 3937
    return-void
.end method

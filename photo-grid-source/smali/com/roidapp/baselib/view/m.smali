.class final Lcom/roidapp/baselib/view/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/l;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/l;)V
    .locals 0

    .prologue
    .line 1487
    iput-object p1, p0, Lcom/roidapp/baselib/view/m;->a:Lcom/roidapp/baselib/view/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1489
    iget-object v0, p0, Lcom/roidapp/baselib/view/m;->a:Lcom/roidapp/baselib/view/l;

    invoke-static {v0}, Lcom/roidapp/baselib/view/l;->a(Lcom/roidapp/baselib/view/l;)V

    .line 1490
    return-void
.end method

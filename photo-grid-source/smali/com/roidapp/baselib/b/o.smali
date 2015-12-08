.class final Lcom/roidapp/baselib/b/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/Exception;

.field final synthetic c:Lcom/roidapp/baselib/b/m;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/b/m;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .prologue
    .line 307
    iput-object p1, p0, Lcom/roidapp/baselib/b/o;->c:Lcom/roidapp/baselib/b/m;

    iput-object p2, p0, Lcom/roidapp/baselib/b/o;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/baselib/b/o;->b:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 310
    iget-object v0, p0, Lcom/roidapp/baselib/b/o;->c:Lcom/roidapp/baselib/b/m;

    invoke-static {v0}, Lcom/roidapp/baselib/b/m;->b(Lcom/roidapp/baselib/b/m;)Lcom/roidapp/baselib/b/p;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/b/o;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/baselib/b/o;->b:Ljava/lang/Exception;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/baselib/b/p;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 311
    return-void
.end method

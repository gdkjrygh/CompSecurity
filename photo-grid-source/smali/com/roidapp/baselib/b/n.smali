.class final Lcom/roidapp/baselib/b/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/baselib/b/m;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/b/m;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lcom/roidapp/baselib/b/n;->b:Lcom/roidapp/baselib/b/m;

    iput-object p2, p0, Lcom/roidapp/baselib/b/n;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/roidapp/baselib/b/n;->b:Lcom/roidapp/baselib/b/m;

    invoke-static {v0}, Lcom/roidapp/baselib/b/m;->b(Lcom/roidapp/baselib/b/m;)Lcom/roidapp/baselib/b/p;

    .line 301
    return-void
.end method

.class final Lcom/roidapp/imagelib/crop/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/f;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/f;)V
    .locals 0

    .prologue
    .line 562
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/g;->a:Lcom/roidapp/imagelib/crop/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 572
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/g;->a:Lcom/roidapp/imagelib/crop/f;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/f;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->k(Lcom/roidapp/imagelib/crop/a;)Z

    .line 573
    return-void
.end method

.class final Lcom/roidapp/imagelib/filter/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/c;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/FilterListView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/FilterListView;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/e;->a:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 132
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/e;->a:Lcom/roidapp/imagelib/filter/FilterListView;

    new-instance v1, Lcom/roidapp/imagelib/filter/f;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/imagelib/filter/f;-><init>(Lcom/roidapp/imagelib/filter/e;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->post(Ljava/lang/Runnable;)Z

    .line 154
    return-void
.end method

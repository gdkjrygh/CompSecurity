.class final Lcom/roidapp/imagelib/filter/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/bd;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/u;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/u;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/v;->a:Lcom/roidapp/imagelib/filter/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/v;->a:Lcom/roidapp/imagelib/filter/u;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/u;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/s;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 235
    return-void
.end method
